/*
 * Copyright (c) 2015 the original author or authors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Donát Csikós (Gradle Inc.) - initial API and implementation and initial documentation
 */

package eclipsebuild

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin

import java.nio.file.FileAlreadyExistsException
import java.nio.file.attribute.AclFileAttributeView

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerException
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import org.xml.sax.ErrorHandler
import org.xml.sax.SAXException
import org.xml.sax.SAXParseException
import org.xml.sax.helpers.*
import org.w3c.dom.Document
import org.w3c.dom.DocumentType
import org.w3c.dom.Entity
import org.w3c.dom.Element
import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node

/**
 * Gradle plug-in for building Eclipse features.
 * <p/>
 * It validates the existence of the files feature.xml, feature.properties, build.properties, and META-INF/MANIFEST.MF. It also
 * adds all files and folders that are defined by the bin.includes entry in the build.properties file to the feature jar.
 */
class FeaturePlugin implements Plugin<Project> {
	
	static final String TASK_NAME_SET_FEATURE_VERSION = 'setFeatureVersion'
	
    @Override
    public void apply(Project project) {
		
      // apply the Java plugin to have the life-cycle tasks
      project.plugins.apply(JavaPlugin)
	  
	  addTaskSetFeaturetVersion(project)
	  
	  // update the version in feature.xml
	  setFeatureVersion(project)
	  
      // sync jar content with the build.properties file
      PluginUtils.configureFeatureJarInput(project)

      // validate the content
      validateRequiredFilesExist(project)
    }

    static void validateRequiredFilesExist(Project project) {
        project.gradle.taskGraph.whenReady {
            // make sure the required descriptors exist
            assert project.file('build.properties').exists()
            assert project.file('META-INF/MANIFEST.MF').exists()
            assert project.file('feature.xml').exists()
            assert project.file('feature.properties').exists()
        }
    }
	
	static void addTaskSetFeaturetVersion(Project project) {
		project.task(TASK_NAME_SET_FEATURE_VERSION) {
			group = Constants.gradleTaskGroupName
			description = 'Set the version in the feature.xml file.'
			doLast { setFeatureVersion(project) }
		}
	}

	static void setFeatureVersion(Project project) {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance()
		DocumentBuilder db = dbf.newDocumentBuilder()
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance()
		Transformer transformer = transformerFactory.newTransformer()
		
		File feature = project.file('feature.xml')
		assert feature.exists()
		
		updateFeatureVersion(project, db, transformer, feature)
		
		File pom = project.file('pom.xml')
		if (pom.exists()) {
			updatePOMVersion(project, db, transformer, pom)
		}
 	}

	static void updateFeatureVersion(Project project, DocumentBuilder db, Transformer transformer, File feature) {
		Document doc = db.parse(feature.absolutePath)
		Node root = doc.getFirstChild()
		
		NamedNodeMap attribs = root.getAttributes()
		Node versionAttr = attribs.getNamedItem("version")
		versionAttr.setTextContent(project.version)
		 
		DOMSource source = new DOMSource(doc)
		StreamResult result = new StreamResult(feature.absolutePath)
		transformer.transform(source, result)
		
		project.logger.debug("### Set feature version to ${project.version} in ${feature.absolutePath}")
	}
	
	static void updatePOMVersion(Project project, DocumentBuilder db, Transformer transformer, File pom) {
		Document doc = db.parse(pom.absolutePath)
		Node root = doc.getFirstChild()
		Node parent = root.getChildNodes().find { Node n -> 'parent' == n.getNodeName() }
		
		Node nVersion = parent.getChildNodes().find { Node n -> 'version' == n.getNodeName() }
		nVersion.setTextContent(project.version)
	
		DOMSource source = new DOMSource(doc)
		StreamResult result = new StreamResult(pom.absolutePath)
		transformer.transform(source, result)
		
		project.logger.debug("### Set pom version to ${project.version} in ${pom.absolutePath}")
	}

}
