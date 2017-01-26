package jpl.imce.oml.specification.ecore.extensions

import com.google.common.collect.Lists
import jpl.imce.oml.specification.ecore.Aspect
import jpl.imce.oml.specification.ecore.Concept
import jpl.imce.oml.specification.ecore.Entity
import jpl.imce.oml.specification.ecore.ReifiedRelationship
import jpl.imce.oml.specification.ecore.SpecializationAxiom
import jpl.imce.oml.specification.ecore.TerminologyBox
import jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom
import jpl.imce.oml.specification.ecore.TerminologyExtent
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.ArrayList

class OMLExtensions {
	
	def Iterable<TerminologyBox> terminologies(TerminologyExtent it) {
		val ArrayList<TerminologyBox> result = Lists.newArrayList
		result.addAll(terminologyGraphs)
		result.addAll(bundles)
		result.immutableCopy
	}
	
	def phasedResolveAll(TerminologyExtent it) {
		
		// phase 1
		terminologyGraphs.forEach[
			terminologyBoxAxioms.forEach[switch it {
				TerminologyExtensionAxiom:
					EcoreUtil.resolveAll(it)	
			}]
		]
		
		// phase 2
		terminologyGraphs.forEach[
			terminologyBoxAxioms.forEach[switch it {
				SpecializationAxiom:
					EcoreUtil.resolveAll(it)	
			}]
		]
	}
	
	def Iterable<TerminologyBox> allImportedTerminologies(TerminologyBox it) {
		collectAllImportedTerminologies(Lists.newArrayList(it), Lists.newArrayList())
	}
	
	final def Iterable<TerminologyBox> collectAllImportedTerminologies(ArrayList<TerminologyBox> queue, ArrayList<TerminologyBox> acc) {
		if (queue.isEmpty)
			return acc
		
		val tbox = queue.head
		queue.remove(tbox)
		
		val inc = tbox.terminologyBoxAxioms.map[target]
		queue.addAll(inc)
		acc.addAll(inc)
		
		collectAllImportedTerminologies(queue, acc)
	}
	
	def Iterable<Entity> localEntities(TerminologyBox it) {
		boxStatements.filter(Entity)
	}
	
	def Iterable<Entity> allEntities(TerminologyBox it) {
		localEntities + allImportedTerminologies.map[localEntities].flatten
	}
	
	def Iterable<Aspect> localAspects(TerminologyBox it) {
		boxStatements.filter(Aspect)
	}
	
	def Iterable<Aspect> allAspects(TerminologyBox it) {
		localAspects + allImportedTerminologies.map[localAspects].flatten
	}
	
	def Iterable<Concept> localConcepts(TerminologyBox it) {
		boxStatements.filter(Concept)
	}
	
	def Iterable<Concept> allConcepts(TerminologyBox it) {
		localConcepts + allImportedTerminologies.map[localConcepts].flatten
	}
	
	def Iterable<ReifiedRelationship> localReifiedRelationships(TerminologyBox it) {
		boxStatements.filter(ReifiedRelationship)
	}
	
	def Iterable<ReifiedRelationship> allReifiedRelationships(TerminologyBox it) {
		localReifiedRelationships + allImportedTerminologies.map[localReifiedRelationships].flatten
	}
}