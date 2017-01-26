package jpl.imce.oml.specification.util

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName

class OMLQualifiedNameConverter extends IQualifiedNameConverter.DefaultImpl {
	
		override def String toString(QualifiedName qualifiedName) {
			if (qualifiedName == null)
				throw new IllegalArgumentException("Qualified name cannot be null")
			qualifiedName.toString(getDelimiter);
		}
		
		override def getDelimiter() {
			":"
		}
	
		override def QualifiedName toQualifiedName(String qualifiedNameAsString) {
			super.toQualifiedName(qualifiedNameAsString)
		}	
	}