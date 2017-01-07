package gov.nasa.jpl.imce.omf.schema.generators

import java.io.File
import java.io.FileOutputStream
import java.nio.file.Paths

import java.util.ArrayList
import java.util.Comparator
import java.util.List
import java.util.regex.Pattern
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

class OMFSchemaTableGenerator {
	
	def generate() {
		generateTables()
		generateProvenance()
	}
	
	def generateTables() {
		val sourceFile = "/gov.nasa.jpl.imce.omf.schema.specification/model/OMFSchema.xcore"
		val targetBundle = "jpl.omf.schema.tables"
		
		val set = new XtextResourceSet();
		set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      	val sourceURI = URI.createPlatformResourceURI(sourceFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	
      	val bundle = Platform.getBundle(targetBundle)
      	val bundleDir = Paths.get(FileLocator.toFileURL(bundle.getEntry("/")).toURI)
		val targetFolder = "shared/src/main/scala/gov/nasa/jpl/imce/omf/schema/tables"
		val targetPath = bundleDir.resolve(targetFolder)
		targetPath.toFile.mkdirs	
					
      	generate(
      		ePackage, 
      		targetPath.toAbsolutePath.toString, 
      		"gov.nasa.jpl.imce.omf.schema",
  		 	"gov.nasa.jpl.imce.omf.schema.tables",
      		"OMFSchemaTables"
      	)      	
	}
	
	def generateProvenance() {
		val sourceFile = "/gov.nasa.jpl.imce.omf.schema.specification/model/OMFProvenanceOTI.xcore"
		val targetBundle = "jpl.omf.schema.tables"
		
		val set = new XtextResourceSet();
		set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      	val sourceURI = URI.createPlatformResourceURI(sourceFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	
      	val bundle = Platform.getBundle(targetBundle)
      	val bundleDir = Paths.get(FileLocator.toFileURL(bundle.getEntry("/")).toURI)
      	val targetFolder = "shared/src/main/scala/gov/nasa/jpl/imce/omf/provenance/oti/schema/tables"
		val targetPath = bundleDir.resolve(targetFolder)
		targetPath.toFile.mkdirs
		
      	generate(
      		ePackage, 
      		targetPath.toAbsolutePath.toString, 
      		"gov.nasa.jpl.imce.omf.provenance.oti.schema", 
      		"gov.nasa.jpl.imce.omf.provenance.oti.schema.tables",
      		"OMF2OTIProvenanceTables"
      	)
    }
    
	
	def generate(EPackage ePackage, String targetFolder, String packageQName, String packageTablesQName, String tableName) {
		val packageFile = new FileOutputStream(new File(targetFolder + File::separator + "package.scala"))
		packageFile.write(generatePackageFile(ePackage, packageQName).bytes)
		val tablesFile = new FileOutputStream(new File(targetFolder + File::separator + tableName + ".scala"))
		tablesFile.write(generateTablesFile(ePackage, packageTablesQName, tableName).bytes)
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract])  {
			val classFile = new FileOutputStream(new File(targetFolder + File::separator + eClass.name + ".scala"))
			classFile.write(generateClassFile(eClass, packageTablesQName).bytes)
		}
	}
	
	static class OMFTableCompare implements Comparator<EClass> {
		
		val knownTables = #[
		"AnnotationProperty",
		"TerminologyGraph", 
		"Bundle", 
		"ConceptDesignationTerminologyAxiom",
		"TerminologyExtensionAxiom", 
		"TerminologyNestingAxiom",
		"Aspect",
		"Concept",
		"ReifiedRelationship", 
		"UnreifiedRelationship",
		"Scalar",
		"Structure", 
		"BinaryScalarRestriction", 
		"IRIScalarRestriction", 
		"NumericScalarRestriction",
		"PlainLiteralScalarRestriction",
		"ScalarOneOfRestriction",
		"StringScalarRestriction",
		"TimeScalarRestriction",
		"EntityScalarDataProperty",
		"EntityStructuredDataProperty",
		"ScalarDataProperty",
		"StructuredDataProperty",
		"AspectSpecializationAxiom",
		"ConceptSpecializationAxiom",
		"ReifiedRelationshipSpecializationAxiom",
		"EntityExistentialRestrictionAxiom",
		"EntityUniversalRestrictionAxiom",
		"EntityScalarDataPropertyExistentialRestrictionAxiom",
		"EntityScalarDataPropertyParticularRestrictionAxiom",
		"EntityScalarDataPropertyUniversalRestrictionAxiom",
		"ScalarOneOfLiteralAxiom",
		"BundledTerminologyAxiom",
		"AnonymousConceptTaxonomyAxiom",
		"RootConceptTaxonomyAxiom",
		"SpecificDisjointConceptAxiom",
		"AnnotationPair"
		]
		
		override compare(EClass c1, EClass c2) {
			val name1 = c1.name
			val name2 = c2.name
			val i1 = knownTables.indexOf(name1)
			val i2 = knownTables.indexOf(name2)
			if (i1 > -1 && i2 > -1)
			   i1.compareTo(i2)
			else if (i1 > -1 && i2 == -1)
			   -1
			else if (i1 == -1 && i2 > -1)
			   1
			else
			   name1.compareTo(name2)   
		}
		
	}
	
	def String generateTablesFile(EPackage ePackage, String packageQName, String tableName) '''
		«copyright»

		package «packageQName»
		
		import java.io.{File,InputStream}
		import org.apache.commons.compress.archivers.zip.{ZipArchiveEntry, ZipFile}
		
		import scala.collection.immutable.Seq
		import scala.collection.JavaConversions._
		import scala.{Boolean,Unit}
		import scala.util.control.Exception._
		import scala.util.{Failure,Success,Try}
		
		case class «tableName» private[tables]
		«FOR eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract].sortWith(new OMFTableCompare()) BEFORE "(\n  " SEPARATOR ",\n  " AFTER "\n)"»«eClass.tableVariable»«ENDFOR» 
		{
		  «FOR eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract].sortWith(new OMFTableCompare())»
		  «eClass.tableReader(tableName)»
		  «ENDFOR»
		
		  def isEmpty: Boolean
		  «FOR eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract].sortWith(new OMFTableCompare()) BEFORE "= " SEPARATOR " &&\n  "»«eClass.tableVariableName».isEmpty«ENDFOR»
		}
		
		object «tableName» {
			
		  def createEmpty«tableName»()
		  : «tableName»
		  = new «tableName»()
		  
		  def load«tableName»(omfSchemaJsonZipFile: File)
		  : Try[«tableName»]
		  = nonFatalCatch[Try[«tableName»]]
		    .withApply {
		      (cause: java.lang.Throwable) =>
		        cause.fillInStackTrace()
		        Failure(cause)
		    }
		    .apply {
		      val zipFile = new ZipFile(omfSchemaJsonZipFile)
		      val omfTables =
		        zipFile
		        .getEntries
		        .toIterable
		        .par
		         .aggregate(«tableName»())(seqop = readZipArchive(zipFile), combop = mergeTables)
		      zipFile.close()
		      Success(omfTables)
		    }
		
		  private[tables] def mergeTables
		  (t1: «tableName», t2: «tableName»)
		  : «tableName»
		  = «FOR eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract].sortWith(new OMFTableCompare()) BEFORE tableName + "(\n    " SEPARATOR ",\n    " AFTER ")"»«eClass.tableVariableName» = t1.«eClass.tableVariableName» ++ t2.«eClass.tableVariableName»«ENDFOR» 
		
		  private[tables] def readZipArchive
		  (zipFile: ZipFile)
		  (tables: «tableName», ze: ZipArchiveEntry)
		  : «tableName»
		  = {
		  	val is = zipFile.getInputStream(ze)
		  	ze.getName match {
		  	  «FOR eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract].sortWith(new OMFTableCompare())»
		  	  case «eClass.name»Helper.TABLE_JSON_FILENAME =>
		  	    tables.«eClass.tableReaderName»(is)
		      «ENDFOR»
		    }
		  }
		  
		  def save«tableName»
		  (tables: «tableName»,
		   omfSchemaJsonZipFile: File)
		  : Try[Unit]
		  = nonFatalCatch[Try[Unit]]
		    .withApply {
		      (cause: java.lang.Throwable) =>
		        cause.fillInStackTrace()
		        Failure(cause)
		    }
		    .apply {
		  	  // @see http://www.oracle.com/technetwork/articles/java/compress-1565076.html
		  	  val fos = new java.io.FileOutputStream(omfSchemaJsonZipFile)
		  	  val bos = new java.io.BufferedOutputStream(fos, 100000)
		  	  val cos = new java.util.zip.CheckedOutputStream(bos, new java.util.zip.Adler32())
		  	  val zos = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(cos))
		  
		  	  zos.setMethod(java.util.zip.ZipOutputStream.DEFLATED)
		  
		      «FOR eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract].sortWith(new OMFTableCompare())»
		      zos.putNextEntry(new java.util.zip.ZipEntry(«eClass.name»Helper.TABLE_JSON_FILENAME))
		      tables.«eClass.tableVariableName».foreach { t =>
		         val line = «eClass.name»Helper.toJSON(t)+"\n"
		         zos.write(line.getBytes(java.nio.charset.Charset.forName("UTF-8")))
		      }
		      zos.closeEntry()
		      «ENDFOR»
		  
		      zos.close()
		  	  Success(())
		  	}
		
		}
	'''
	static def String pluralize(String s) {
	  if (s.endsWith("y")) { 
	  	s.substring(0, s.length-1)+"ies"
	  } else {
	  	s+"s"
	  }	 
	}
	
	static def String tableReaderName(EClass eClass)
	  '''read«pluralize(eClass.name)»'''
	
	static def String tableVariableName(EClass eClass) {
	  val n = eClass.name
	  if (n.startsWith("IRI")) {
	  	"iri" + pluralize(n.substring(3))
	  } else {
	  	val m = Pattern.compile("^(\\p{Upper}+)(\\w+)$").matcher(n)
	  	if (!m.matches())
	  		throw new java.lang.IllegalArgumentException("tableVariableName needs a class whose name begins with uppercase characters: " + eClass.name)
	 	m.group(1).toLowerCase + pluralize(m.group(2))
	  }
	}
	
	static def String tableVariable(EClass eClass)
	'''«eClass.tableVariableName» : Seq[«eClass.name»] = Seq.empty'''
	
	static def String tableReader(EClass eClass, String tableName)	
	'''
	def «eClass.tableReaderName»(is: InputStream)
	: «tableName»
	= copy(«eClass.tableVariableName» = readJSonTable(is, «eClass.name»Helper.fromJSON))
	'''
	
	def generateJS(EPackage ePackage, String targetJSFolder) {
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract && hasOptionalAttributes])  {
			val classFile = new FileOutputStream(new File(targetJSFolder + File::separator + eClass.name + "JS.scala"))
			classFile.write(generateJSClassFile(eClass).bytes)
		}
	}
	
	def generateJVM(EPackage ePackage, String targetJVMFolder) {
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract && hasOptionalAttributes])  {
			val classFile = new FileOutputStream(new File(targetJVMFolder + File::separator + eClass.name + "Java.scala"))
			classFile.write(generateJVMClassFile(eClass).bytes)
		}
	}
	
	def String generatePackageFile(EPackage ePackage, String packageQName) '''
		«copyright»

		package «packageQName»
		
		import java.io.InputStream
		import scala.collection.immutable.Seq
		import scala.io
		import scala.Predef.String
		
		package object tables {
			«FOR type : ePackage.EClassifiers.filter(EDataType).filter[t|!(t instanceof EEnum)].sortBy[name]»
				type «type.name» = String
		  	«ENDFOR»
		  	
		  def readJSonTable[T](is: InputStream, fromJSon: String => T)
		  : Seq[T]
		  = io.Source.fromInputStream(is).getLines.map(fromJSon).to[Seq]
		}
	'''
	
	def String generateClassFile(EClass eClass, String packageQName) '''
		«copyright»
		 
		package «packageQName»
		
		import scala.annotation.meta.field
		import scala.scalajs.js.annotation.JSExport
		import scala._
		import scala.Predef._
		
		/**
		  «FOR attr : eClass.getSortedAttributes»
		  * @param «attr.columnName»[«attr.lowerBound»,«attr.upperBound»]
		  «ENDFOR» 
		  */
		«IF ! eClass.hasOptionalAttributes»
		@JSExport
		«ENDIF»
		case class «eClass.name»
		(
		 «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		 @(JSExport @field) «attr.columnName»: «attr.constructorTypeName»
		 «ENDFOR»
		) «IF eClass.hasOptionalAttributes»{
		
		@JSExport
		def this(
			«FOR attr : eClass.getSortedAttributes.filter(a | a.lowerBound > 0) SEPARATOR ","»
			«attr.columnName»: «attr.constructorTypeName»
			«ENDFOR»
		) 
		= this(
		«FOR attr : eClass.getSortedAttributes SEPARATOR ","»
				«IF attr.lowerBound > 0»
				«attr.columnName»
				«ELSE»
				None
				«ENDIF»			
		«ENDFOR»			
		) 
		
		«FOR attr : eClass.getSortedAttributes.filter(a | a.lowerBound == 0) SEPARATOR ""»
			def with«attr.columnName.toFirstUpper»(l: «attr.scalaTypeName»)	 
			: «eClass.name»
			= copy(«attr.columnName»=Some(l))
			
		«ENDFOR»
		}
		
		«ENDIF»
		
		@JSExport
		object «eClass.name»Helper {
		
		  val TABLE_JSON_FILENAME 
		  : scala.Predef.String 
		  = "«eClass.name»s.json"
		  
		  implicit val w
		  : upickle.default.Writer[«eClass.name»]
		  = upickle.default.macroW[«eClass.name»]
		
		  @JSExport
		  def toJSON(c: «eClass.name»)
		  : String
		  = upickle.default.write(expr=c, indent=0)
		
		  implicit val r
		  : upickle.default.Reader[«eClass.name»]
		  = upickle.default.macroR[«eClass.name»]
		
		  @JSExport
		  def fromJSON(c: String)
		  : «eClass.name»
		  = upickle.default.read[«eClass.name»](c)
		
		}	
	'''
	
	def String generateJSClassFile(EClass eClass) '''
		«copyright»
		 
		package gov.nasa.jpl.imce.omf.schema.tables
		
		import scala.scalajs.js.annotation.JSExport
		
		@JSExport
		object «eClass.name»JS {
		  «IF eClass.hasOptionalAttributes»
		  
		  @JSExport
		  def js«eClass.name»(
		    «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		    «attr.columnName»: «attr.jsTypeName»
		    «ENDFOR»
		  )
		  : «eClass.name»
		  = «eClass.name»(
		    «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		    «attr.jsArgName»
		    «ENDFOR»
		  )
		  «ENDIF»
		  
		}	
	'''
	
	def String generateJVMClassFile(EClass eClass) '''
		«copyright»
		 
		package gov.nasa.jpl.imce.omf.schema.tables
		
		import java.util.Optional
		import scala.compat.java8.OptionConverters._
		
		object «eClass.name»Java {
		  «IF eClass.hasOptionalAttributes»
		  
		  def java«eClass.name»(
		    «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		    «attr.columnName»: «attr.javaTypeName»
		    «ENDFOR»
		  )
		  : «eClass.name»
		  = «eClass.name»(
		    «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		    «attr.javaArgName»
		    «ENDFOR»
		  )
		  «ENDIF»
		  
		}	
	'''
	
	static def Boolean hasOptionalAttributes(EClass eClass) {
		eClass.getSortedAttributes.exists(a | a.lowerBound == 0)
	}
	
	static def List<EStructuralFeature> getSortedAttributes(EClass eClass) {
		eClass
		.selfAndAllSupertypes
		.map[EStructuralFeatures]
		.flatten
		.filter([EStructuralFeature f | isAttributeOrReferenceOrContainer(f) && isSchema(f)])
		.sortWith(new OMFFeatureCompare())
	}
	
	static def Boolean isAttributeOrReferenceOrContainer(EStructuralFeature f) {
		switch f {
			EReference: 
				! f.containment
			default: 
				true
		}
	}
	
	static def List<EClass> selfAndAllSupertypes(EClass eClass) {
		val parents = new ArrayList(eClass.EAllSuperTypes)
		parents.add(eClass)
		parents
	}
	
	static def String columnName(EStructuralFeature feature) {
		if (feature instanceof EReference) feature.name+"UUID" else feature.name
	}
	
	static def String scalaTypeName(EStructuralFeature feature) {
		val type = feature.EType
		switch (type.name) {
			case "EInt": "scala.Int"
			case "EBoolean": "scala.Boolean"
			case "EString": "scala.Predef.String"
			case type instanceof EClass: "UUID"
			default: type.name
		}
	}
	static def String constructorTypeName(EStructuralFeature feature) {
		val scalaType = feature.scalaTypeName
		if (feature.lowerBound == 0)
		  "scala.Option["+scalaType+"]"
	    else
	      scalaType
	}

	static def String jsTypeName(EStructuralFeature feature) {
		val scalaType = feature.scalaTypeName
		if (feature.lowerBound == 0)
		  "scala.scalajs.js.UndefOr["+scalaType+"]"
		else
		  scalaType
	}

	static def String jsArgName(EStructuralFeature feature) {
		if (feature.lowerBound == 0)
		  feature.columnName+".toOption"
		else
		  feature.columnName
	}


	static def String javaTypeName(EStructuralFeature feature) {
		val scalaType = feature.scalaTypeName
		if (feature.lowerBound == 0)
		  "Optional["+scalaType+"]"
		else
		  scalaType
	}

	static def String javaArgName(EStructuralFeature feature) {
		if (feature.lowerBound == 0)
		  feature.columnName+".asScala"
		else
		  feature.columnName
	}

	static class OMFFeatureCompare implements Comparator<EStructuralFeature> {
		
		val knownAttributes = #[
		"graphUUID",
		"uuid", 
		"axiomUUID",
		"kind",
		"isAbstract", 
		"asymmetric", 
		"essential", 
		"functional",
		"inverseEssential",
		"inverseFunctional", 
		"irreflexive", 
		"reflexive",
		"symmetric", 
		"transitive",
		"name",
		"unreifiedPropertyName",
		"unreifiedInversePropertyName",
		"iri",
		"property",
		"value"
		]
		override compare(EStructuralFeature o1, EStructuralFeature o2) {
			val name1 = o1.columnName
			val name2 = o2.columnName
			val i1 = knownAttributes.indexOf(name1)
			val i2 = knownAttributes.indexOf(name2)
			if (i1 > -1 && i2 > -1)
			   i1.compareTo(i2)
			else if (i1 > -1 && i2 == -1)
			   -1
			else if (i1 == -1 && i2 > -1)
			   1
			else
			   name1.compareTo(name2)   
		}
		
	}
	
    
    static def Boolean isSchema(ENamedElement e) {
    	null == e.getEAnnotation("http://imce.jpl.nasa.gov/omf/NotSchema")
    }
    
	static def String doc(ENamedElement e, String indent) {
		val doc = e.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel")?.details?.get("documentation") ?: ""
		if (doc.empty) 
		doc
		else 
		"/*\n"+indent+" * "+doc.replaceAll("\n","\n"+indent+" * ")+"\n"+indent+" */\n"+indent	
	}
	
	def copyright() '''
		/*
		 * Copyright 2016 California Institute of Technology ("Caltech").
		 * U.S. Government sponsorship acknowledged.
		 *
		 * Licensed under the Apache License, Version 2.0 (the "License");
		 * you may not use this file except in compliance with the License.
		 * You may obtain a copy of the License at
		 *
		 *     http://www.apache.org/licenses/LICENSE-2.0
		 *
		 * Unless required by applicable law or agreed to in writing, software
		 * distributed under the License is distributed on an "AS IS" BASIS,
		 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		 * See the License for the specific language governing permissions and
		 * limitations under the License.
		 * License Terms
		 */
		
	'''
    
}