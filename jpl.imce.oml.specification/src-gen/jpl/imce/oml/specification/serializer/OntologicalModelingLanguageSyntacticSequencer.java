/*
 * Copyright 2016 California Institute of Technology (\"Caltech\").
 * U.S. Government sponsorship acknowledged.
 *
 * Licensed under the Apache License, Version 2.0 (the \"License\");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an \"AS IS\" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jpl.imce.oml.specification.serializer;

import com.google.inject.Inject;
import java.util.List;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class OntologicalModelingLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected OntologicalModelingLanguageGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (OntologicalModelingLanguageGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getABSTRACT_TOKENRule())
			return getABSTRACT_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getANNOTATION_PROPERTY_TOKENRule())
			return getANNOTATION_PROPERTY_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getANNOTATION_TOKENRule())
			return getANNOTATION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENRule())
			return getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getASPECT_SPECIALIZATION_AXIOM_TOKENRule())
			return getASPECT_SPECIALIZATION_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getASPECT_TOKENRule())
			return getASPECT_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getASYMMETRIC_TOKENRule())
			return getASYMMETRIC_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBINARY_SCALAR_RESTRICTION_TOKENRule())
			return getBINARY_SCALAR_RESTRICTION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBUNDLED_TERMINOLOGY_AXIOM_TOKENRule())
			return getBUNDLED_TERMINOLOGY_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBUNDLE_TOKENRule())
			return getBUNDLE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENRule())
			return getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCONCEPT_SPECIALIZATION_AXIOM_TOKENRule())
			return getCONCEPT_SPECIALIZATION_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCONCEPT_TOKENRule())
			return getCONCEPT_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDESCRIPTION_BOX_TOKENRule())
			return getDESCRIPTION_BOX_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOMAIN_TOKENRule())
			return getDOMAIN_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENRule())
			return getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENRule())
			return getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENRule())
			return getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENRule())
			return getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENRule())
			return getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEQUALRule())
			return getEQUALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getESSENTIAL_TOKENRule())
			return getESSENTIAL_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEXTENDS_TOKENRule())
			return getEXTENDS_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFUNCTIONAL_TOKENRule())
			return getFUNCTIONAL_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINVERSE_ESSENTIAL_TOKENRule())
			return getINVERSE_ESSENTIAL_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINVERSE_FUNCTIONAL_TOKENRule())
			return getINVERSE_FUNCTIONAL_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINVERSE_TOKENRule())
			return getINVERSE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIRI_SCALAR_RESTRICTION_TOKENRule())
			return getIRI_SCALAR_RESTRICTION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIRREFLEXIVE_TOKENRule())
			return getIRREFLEXIVE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLCURLYRule())
			return getLCURLYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNUMERIC_SCALAR_RESTRICTION_TOKENRule())
			return getNUMERIC_SCALAR_RESTRICTION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENRule())
			return getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRANGE_TOKENRule())
			return getRANGE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRCURLYRule())
			return getRCURLYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREFINES_TOKENRule())
			return getREFINES_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREFLEXIVE_TOKENRule())
			return getREFLEXIVE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENRule())
			return getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREIFIED_RELATIONSHIP_TOKENRule())
			return getREIFIED_RELATIONSHIP_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENRule())
			return getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENRule())
			return getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSCALAR_ONE_OF_RESTRICTION_TOKENRule())
			return getSCALAR_ONE_OF_RESTRICTION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSCALAR_TOKENRule())
			return getSCALAR_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSOURCE_TOKENRule())
			return getSOURCE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENRule())
			return getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRING_SCALAR_RESTRICTION_TOKENRule())
			return getSTRING_SCALAR_RESTRICTION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRUCTURE_TOKENRule())
			return getSTRUCTURE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSYMMETRIC_TOKENRule())
			return getSYMMETRIC_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSYNONYM_SCALAR_RESTRICTION_TOKENRule())
			return getSYNONYM_SCALAR_RESTRICTION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTARGET_TOKENRule())
			return getTARGET_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTERMINOLOGY_GRAPH_TOKENRule())
			return getTERMINOLOGY_GRAPH_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTERMINOLOGY_NESTING_AXIOM_TOKENRule())
			return getTERMINOLOGY_NESTING_AXIOM_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTIME_SCALAR_RESTRICTION_TOKENRule())
			return getTIME_SCALAR_RESTRICTION_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTRANSITIVE_TOKENRule())
			return getTRANSITIVE_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getUNREIFIED_RELATIONSHIP_TOKENRule())
			return getUNREIFIED_RELATIONSHIP_TOKENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getUNREIFIED_TOKENRule())
			return getUNREIFIED_TOKENToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ABSTRACT_TOKEN: 'abstract';
	 */
	protected String getABSTRACT_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "abstract";
	}
	
	/**
	 * terminal ANNOTATION_PROPERTY_TOKEN: 'annotationProperty';
	 */
	protected String getANNOTATION_PROPERTY_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "annotationProperty";
	}
	
	/**
	 * terminal ANNOTATION_TOKEN: '@';
	 */
	protected String getANNOTATION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	
	/**
	 * terminal ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN: 'anonymousConceptTaxonomyAxiom';
	 */
	protected String getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "anonymousConceptTaxonomyAxiom";
	}
	
	/**
	 * terminal ASPECT_SPECIALIZATION_AXIOM_TOKEN: 'extendsAspect';
	 */
	protected String getASPECT_SPECIALIZATION_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "extendsAspect";
	}
	
	/**
	 * terminal ASPECT_TOKEN: 'aspect';
	 */
	protected String getASPECT_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "aspect";
	}
	
	/**
	 * terminal ASYMMETRIC_TOKEN: 'asymmetric';
	 */
	protected String getASYMMETRIC_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "asymmetric";
	}
	
	/**
	 * terminal BINARY_SCALAR_RESTRICTION_TOKEN: 'binaryScalarRestriction';
	 */
	protected String getBINARY_SCALAR_RESTRICTION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "binaryScalarRestriction";
	}
	
	/**
	 * terminal BUNDLED_TERMINOLOGY_AXIOM_TOKEN: 'bundledTerminologyAxiom';
	 */
	protected String getBUNDLED_TERMINOLOGY_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "bundledTerminologyAxiom";
	}
	
	/**
	 * terminal BUNDLE_TOKEN: 'bundle';
	 */
	protected String getBUNDLE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "bundle";
	}
	
	/**
	 * terminal CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN: 'conceptDesignationTerminologyAxiom';
	 */
	protected String getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "conceptDesignationTerminologyAxiom";
	}
	
	/**
	 * terminal CONCEPT_SPECIALIZATION_AXIOM_TOKEN: 'extendsConcept';
	 */
	protected String getCONCEPT_SPECIALIZATION_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "extendsConcept";
	}
	
	/**
	 * terminal CONCEPT_TOKEN: 'concept';
	 */
	protected String getCONCEPT_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "concept";
	}
	
	/**
	 * terminal DESCRIPTION_BOX_TOKEN: 'DescriptionBox';
	 */
	protected String getDESCRIPTION_BOX_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "DescriptionBox";
	}
	
	/**
	 * terminal DOMAIN_TOKEN: 'domain';
	 */
	protected String getDOMAIN_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "domain";
	}
	
	/**
	 * terminal ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN: 'entityExistentialRestrictionAxiom';
	 */
	protected String getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "entityExistentialRestrictionAxiom";
	}
	
	/**
	 * terminal ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN: 'entityScalarDataPropertyExistentialRestrictionAxiom';
	 */
	protected String getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "entityScalarDataPropertyExistentialRestrictionAxiom";
	}
	
	/**
	 * terminal ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN: 'entityScalarDataPropertyParticularRestrictionAxiom';
	 */
	protected String getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "entityScalarDataPropertyParticularRestrictionAxiom";
	}
	
	/**
	 * terminal ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN: 'entityScalarDataPropertyUniversalRestrictionAxiom';
	 */
	protected String getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "entityScalarDataPropertyUniversalRestrictionAxiom";
	}
	
	/**
	 * terminal ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN: 'entityUniversalRestrictionAxiom';
	 */
	protected String getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "entityUniversalRestrictionAxiom";
	}
	
	/**
	 * terminal EQUAL: '=';
	 */
	protected String getEQUALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal ESSENTIAL_TOKEN: 'essential';
	 */
	protected String getESSENTIAL_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "essential";
	}
	
	/**
	 * terminal EXTENDS_TOKEN: 'extends';
	 */
	protected String getEXTENDS_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "extends";
	}
	
	/**
	 * terminal FUNCTIONAL_TOKEN: 'functional';
	 */
	protected String getFUNCTIONAL_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "functional";
	}
	
	/**
	 * terminal INVERSE_ESSENTIAL_TOKEN: 'inverseEssential';
	 */
	protected String getINVERSE_ESSENTIAL_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "inverseEssential";
	}
	
	/**
	 * terminal INVERSE_FUNCTIONAL_TOKEN: 'inverseFunctional';
	 */
	protected String getINVERSE_FUNCTIONAL_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "inverseFunctional";
	}
	
	/**
	 * terminal INVERSE_TOKEN: 'inverse';
	 */
	protected String getINVERSE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "inverse";
	}
	
	/**
	 * terminal IRI_SCALAR_RESTRICTION_TOKEN: 'iriScalarRestriction';
	 */
	protected String getIRI_SCALAR_RESTRICTION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "iriScalarRestriction";
	}
	
	/**
	 * terminal IRREFLEXIVE_TOKEN: 'irreflexive';
	 */
	protected String getIRREFLEXIVE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "irreflexive";
	}
	
	/**
	 * terminal LCURLY: '{';
	 */
	protected String getLCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal NUMERIC_SCALAR_RESTRICTION_TOKEN: 'numericScalarRestriction';
	 */
	protected String getNUMERIC_SCALAR_RESTRICTION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "numericScalarRestriction";
	}
	
	/**
	 * terminal PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN: 'plainLiteralScalarRestriction';
	 */
	protected String getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "plainLiteralScalarRestriction";
	}
	
	/**
	 * terminal RANGE_TOKEN: 'range';
	 */
	protected String getRANGE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "range";
	}
	
	/**
	 * terminal RCURLY: '}';
	 */
	protected String getRCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal REFINES_TOKEN: 'refines';
	 */
	protected String getREFINES_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "refines";
	}
	
	/**
	 * terminal REFLEXIVE_TOKEN: 'reflexive';
	 */
	protected String getREFLEXIVE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "reflexive";
	}
	
	/**
	 * terminal REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN: 'extendsRelationship';
	 */
	protected String getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "extendsRelationship";
	}
	
	/**
	 * terminal REIFIED_RELATIONSHIP_TOKEN: 'reifiedRelationship';
	 */
	protected String getREIFIED_RELATIONSHIP_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "reifiedRelationship";
	}
	
	/**
	 * terminal ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN: 'rootConceptTaxonomyAxiom';
	 */
	protected String getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "rootConceptTaxonomyAxiom";
	}
	
	/**
	 * terminal SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN: 'scalarOneOfLiteralAxiom';
	 */
	protected String getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "scalarOneOfLiteralAxiom";
	}
	
	/**
	 * terminal SCALAR_ONE_OF_RESTRICTION_TOKEN: 'scalarOneOfRestriction';
	 */
	protected String getSCALAR_ONE_OF_RESTRICTION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "scalarOneOfRestriction";
	}
	
	/**
	 * terminal SCALAR_TOKEN: 'scalar';
	 */
	protected String getSCALAR_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "scalar";
	}
	
	/**
	 * terminal SOURCE_TOKEN: 'source';
	 */
	protected String getSOURCE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "source";
	}
	
	/**
	 * terminal SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN: 'specificDisjointConceptAxiom';
	 */
	protected String getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "specificDisjointConceptAxiom";
	}
	
	/**
	 * terminal STRING_SCALAR_RESTRICTION_TOKEN: 'stringScalarRestriction';
	 */
	protected String getSTRING_SCALAR_RESTRICTION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "stringScalarRestriction";
	}
	
	/**
	 * terminal STRUCTURE_TOKEN: 'structure';
	 */
	protected String getSTRUCTURE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "structure";
	}
	
	/**
	 * terminal SYMMETRIC_TOKEN: 'symmetric';
	 */
	protected String getSYMMETRIC_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "symmetric";
	}
	
	/**
	 * terminal SYNONYM_SCALAR_RESTRICTION_TOKEN: 'synonymScalarRestriction';
	 */
	protected String getSYNONYM_SCALAR_RESTRICTION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "synonymScalarRestriction";
	}
	
	/**
	 * terminal TARGET_TOKEN: 'target';
	 */
	protected String getTARGET_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "target";
	}
	
	/**
	 * terminal TERMINOLOGY_GRAPH_TOKEN: 'terminology';
	 */
	protected String getTERMINOLOGY_GRAPH_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "terminology";
	}
	
	/**
	 * terminal TERMINOLOGY_NESTING_AXIOM_TOKEN: 'terminologyNestingAxiom';
	 */
	protected String getTERMINOLOGY_NESTING_AXIOM_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "terminologyNestingAxiom";
	}
	
	/**
	 * terminal TIME_SCALAR_RESTRICTION_TOKEN: 'timeScalarRestriction';
	 */
	protected String getTIME_SCALAR_RESTRICTION_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "timeScalarRestriction";
	}
	
	/**
	 * terminal TRANSITIVE_TOKEN: 'transitive';
	 */
	protected String getTRANSITIVE_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "transitive";
	}
	
	/**
	 * terminal UNREIFIED_RELATIONSHIP_TOKEN: 'unreifiedRelationship';
	 */
	protected String getUNREIFIED_RELATIONSHIP_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "unreifiedRelationship";
	}
	
	/**
	 * terminal UNREIFIED_TOKEN: 'unreified';
	 */
	protected String getUNREIFIED_TOKENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "unreified";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
