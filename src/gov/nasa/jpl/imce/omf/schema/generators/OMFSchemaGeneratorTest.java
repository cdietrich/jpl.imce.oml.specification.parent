/**
 */
package gov.nasa.jpl.imce.omf.schema.generators;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Terminology Thing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMFSchemaGeneratorTest extends TestCase {

	public OMFSchemaGeneratorTest(String name) {
		super(name);
	}

	public void testGenerate() {
	    try {
			String name = "gov.nasa.jpl.imce.omf.schema.specification";
		    IProjectDescription desc = ResourcesPlugin.getWorkspace().newProjectDescription(name);
		    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		    project.create(desc, new NullProgressMonitor());
		    project.open(new NullProgressMonitor());
		    IFolder folder = project.getFolder("model");
		    folder.create(true, true, null);
		    IFile file = folder.getFile("OMFSchema.xcore");
		    
			URL url = FileLocator.toFileURL(Platform.getBundle(name).getEntry("/model/OMFSchema.xcore"));
			InputStream source = url.openConnection().getInputStream();
		    file.create(source, IFile.FORCE, null);
	    } catch (CoreException e) {
	    	throw new RuntimeException(e);
	    } catch (IOException e) {
	    	throw new RuntimeException(e);
	    } 
		new OMFSchemaTableGenerator().generate();
	}

}