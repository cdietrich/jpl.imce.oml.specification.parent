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
package jpl.imce.oml.specification.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class OntologicalModelingLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TerminologyExtentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyExtent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTerminologyExtentAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cAnnotationPropertiesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnnotationPropertiesAnnotationPropertyParserRuleCall_1_0 = (RuleCall)cAnnotationPropertiesAssignment_1.eContents().get(0);
		private final Assignment cTerminologyGraphsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTerminologyGraphsTerminologyGraphParserRuleCall_2_0 = (RuleCall)cTerminologyGraphsAssignment_2.eContents().get(0);
		private final Assignment cBundlesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBundlesBundleParserRuleCall_3_0 = (RuleCall)cBundlesAssignment_3.eContents().get(0);
		
		//TerminologyExtent:
		//	{TerminologyExtent} annotationProperties+=AnnotationProperty*
		//	terminologyGraphs+=TerminologyGraph*
		//	bundles+=Bundle*;
		@Override public ParserRule getRule() { return rule; }
		
		//{TerminologyExtent} annotationProperties+=AnnotationProperty* terminologyGraphs+=TerminologyGraph* bundles+=Bundle*
		public Group getGroup() { return cGroup; }
		
		//{TerminologyExtent}
		public Action getTerminologyExtentAction_0() { return cTerminologyExtentAction_0; }
		
		//annotationProperties+=AnnotationProperty*
		public Assignment getAnnotationPropertiesAssignment_1() { return cAnnotationPropertiesAssignment_1; }
		
		//AnnotationProperty
		public RuleCall getAnnotationPropertiesAnnotationPropertyParserRuleCall_1_0() { return cAnnotationPropertiesAnnotationPropertyParserRuleCall_1_0; }
		
		//terminologyGraphs+=TerminologyGraph*
		public Assignment getTerminologyGraphsAssignment_2() { return cTerminologyGraphsAssignment_2; }
		
		//TerminologyGraph
		public RuleCall getTerminologyGraphsTerminologyGraphParserRuleCall_2_0() { return cTerminologyGraphsTerminologyGraphParserRuleCall_2_0; }
		
		//bundles+=Bundle*
		public Assignment getBundlesAssignment_3() { return cBundlesAssignment_3; }
		
		//Bundle
		public RuleCall getBundlesBundleParserRuleCall_3_0() { return cBundlesBundleParserRuleCall_3_0; }
	}
	public class AnnotationPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.AnnotationProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cANNOTATION_PROPERTY_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cAbbrevIRIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAbbrevIRIABBREV_IRIParserRuleCall_1_0 = (RuleCall)cAbbrevIRIAssignment_1.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cIriAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIriIRITerminalRuleCall_3_0 = (RuleCall)cIriAssignment_3.eContents().get(0);
		
		//// syntax of Annotation & AnnotationProperties
		//AnnotationProperty:
		//	ANNOTATION_PROPERTY_TOKEN abbrevIRI=ABBREV_IRI EQUAL iri=IRI;
		@Override public ParserRule getRule() { return rule; }
		
		//ANNOTATION_PROPERTY_TOKEN abbrevIRI=ABBREV_IRI EQUAL iri=IRI
		public Group getGroup() { return cGroup; }
		
		//ANNOTATION_PROPERTY_TOKEN
		public RuleCall getANNOTATION_PROPERTY_TOKENTerminalRuleCall_0() { return cANNOTATION_PROPERTY_TOKENTerminalRuleCall_0; }
		
		//abbrevIRI=ABBREV_IRI
		public Assignment getAbbrevIRIAssignment_1() { return cAbbrevIRIAssignment_1; }
		
		//ABBREV_IRI
		public RuleCall getAbbrevIRIABBREV_IRIParserRuleCall_1_0() { return cAbbrevIRIABBREV_IRIParserRuleCall_1_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_2() { return cEQUALTerminalRuleCall_2; }
		
		//iri=IRI
		public Assignment getIriAssignment_3() { return cIriAssignment_3; }
		
		//IRI
		public RuleCall getIriIRITerminalRuleCall_3_0() { return cIriIRITerminalRuleCall_3_0; }
	}
	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cANNOTATION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cPropertyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPropertyAnnotationPropertyCrossReference_1_0 = (CrossReference)cPropertyAssignment_1.eContents().get(0);
		private final RuleCall cPropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1 = (RuleCall)cPropertyAnnotationPropertyCrossReference_1_0.eContents().get(1);
		private final RuleCall cEQUALTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		/// *
		// * Note that the concrete syntax for the Annotation.subject is defined implicitly
		// * in the sense that the subject of an Annotation is always the preceding
		// * TerminologyThing or the subject of the preceding Annotation.
		// * 
		// * For example, the following shows the concrete syntax for 2 Concepts, Foo and Bar
		// * and of 3 Annotations; the first two Annotations have Foo as their subject because 
		// * Foo is the first preceding TerminologyThing; the third Annotation has Bar as its subject
		// * because it appears after the TerminologyThing Bar.
		// * 
		// * concept Foo
		// * @rdfs:label = "foo"
		// * @dc:description = "A Foo is ..."
		// * 
		// * concept Bar
		// * @rdfs:label = "bar
		// * 
		// * @see jpl.imce.oml.specification.linking.OMLLinkingService
		// * / Annotation:
		//	ANNOTATION_TOKEN property=[AnnotationProperty|ABBREV_IRI] EQUAL value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//ANNOTATION_TOKEN property=[AnnotationProperty|ABBREV_IRI] EQUAL value=STRING
		public Group getGroup() { return cGroup; }
		
		//ANNOTATION_TOKEN
		public RuleCall getANNOTATION_TOKENTerminalRuleCall_0() { return cANNOTATION_TOKENTerminalRuleCall_0; }
		
		//property=[AnnotationProperty|ABBREV_IRI]
		public Assignment getPropertyAssignment_1() { return cPropertyAssignment_1; }
		
		//[AnnotationProperty|ABBREV_IRI]
		public CrossReference getPropertyAnnotationPropertyCrossReference_1_0() { return cPropertyAnnotationPropertyCrossReference_1_0; }
		
		//ABBREV_IRI
		public RuleCall getPropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1() { return cPropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_2() { return cEQUALTerminalRuleCall_2; }
		
		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
	}
	public class TerminologyBoxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBox");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBundleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTerminologyGraphParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// 2 TerminologyBoxes
		//TerminologyBox:
		//	Bundle | TerminologyGraph;
		@Override public ParserRule getRule() { return rule; }
		
		//Bundle | TerminologyGraph
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Bundle
		public RuleCall getBundleParserRuleCall_0() { return cBundleParserRuleCall_0; }
		
		//TerminologyGraph
		public RuleCall getTerminologyGraphParserRuleCall_1() { return cTerminologyGraphParserRuleCall_1; }
	}
	public class TerminologyGraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyGraph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKindAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cKindTerminologyGraphKindEnumRuleCall_0_0 = (RuleCall)cKindAssignment_0.eContents().get(0);
		private final RuleCall cTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cIriAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIriIRITerminalRuleCall_2_0 = (RuleCall)cIriAssignment_2.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cAnnotationsAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_4_0_0 = (RuleCall)cAnnotationsAssignment_4_0.eContents().get(0);
		private final Assignment cTerminologyBoxAxiomsAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0 = (RuleCall)cTerminologyBoxAxiomsAssignment_4_1.eContents().get(0);
		private final Assignment cBoxStatementsAssignment_4_2 = (Assignment)cAlternatives_4.eContents().get(2);
		private final RuleCall cBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0 = (RuleCall)cBoxStatementsAssignment_4_2.eContents().get(0);
		private final RuleCall cRCURLYTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//TerminologyGraph:
		//	kind=TerminologyGraphKind TERMINOLOGY_GRAPH_TOKEN iri=IRI LCURLY (annotations+=Annotation |
		//	terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement)*
		//	RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//kind=TerminologyGraphKind TERMINOLOGY_GRAPH_TOKEN iri=IRI LCURLY (annotations+=Annotation |
		//terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement)* RCURLY
		public Group getGroup() { return cGroup; }
		
		//kind=TerminologyGraphKind
		public Assignment getKindAssignment_0() { return cKindAssignment_0; }
		
		//TerminologyGraphKind
		public RuleCall getKindTerminologyGraphKindEnumRuleCall_0_0() { return cKindTerminologyGraphKindEnumRuleCall_0_0; }
		
		//TERMINOLOGY_GRAPH_TOKEN
		public RuleCall getTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1() { return cTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1; }
		
		//iri=IRI
		public Assignment getIriAssignment_2() { return cIriAssignment_2; }
		
		//IRI
		public RuleCall getIriIRITerminalRuleCall_2_0() { return cIriIRITerminalRuleCall_2_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_3() { return cLCURLYTerminalRuleCall_3; }
		
		//(annotations+=Annotation | terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//annotations+=Annotation
		public Assignment getAnnotationsAssignment_4_0() { return cAnnotationsAssignment_4_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_4_0_0() { return cAnnotationsAnnotationParserRuleCall_4_0_0; }
		
		//terminologyBoxAxioms+=TerminologyBoxAxiom
		public Assignment getTerminologyBoxAxiomsAssignment_4_1() { return cTerminologyBoxAxiomsAssignment_4_1; }
		
		//TerminologyBoxAxiom
		public RuleCall getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0() { return cTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0; }
		
		//boxStatements+=TerminologyBoxStatement
		public Assignment getBoxStatementsAssignment_4_2() { return cBoxStatementsAssignment_4_2; }
		
		//TerminologyBoxStatement
		public RuleCall getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0() { return cBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_5() { return cRCURLYTerminalRuleCall_5; }
	}
	public class BundleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Bundle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKindAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cKindTerminologyGraphKindEnumRuleCall_0_0 = (RuleCall)cKindAssignment_0.eContents().get(0);
		private final RuleCall cBUNDLE_TOKENTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cIriAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIriIRITerminalRuleCall_2_0 = (RuleCall)cIriAssignment_2.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cAnnotationsAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_4_0_0 = (RuleCall)cAnnotationsAssignment_4_0.eContents().get(0);
		private final Assignment cTerminologyBoxAxiomsAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0 = (RuleCall)cTerminologyBoxAxiomsAssignment_4_1.eContents().get(0);
		private final Assignment cBoxStatementsAssignment_4_2 = (Assignment)cAlternatives_4.eContents().get(2);
		private final RuleCall cBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0 = (RuleCall)cBoxStatementsAssignment_4_2.eContents().get(0);
		private final Assignment cBundleStatementsAssignment_4_3 = (Assignment)cAlternatives_4.eContents().get(3);
		private final RuleCall cBundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0 = (RuleCall)cBundleStatementsAssignment_4_3.eContents().get(0);
		private final Assignment cTerminologyBundleAxiomsAssignment_4_4 = (Assignment)cAlternatives_4.eContents().get(4);
		private final RuleCall cTerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0 = (RuleCall)cTerminologyBundleAxiomsAssignment_4_4.eContents().get(0);
		private final RuleCall cRCURLYTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Bundle:
		//	kind=TerminologyGraphKind BUNDLE_TOKEN iri=IRI LCURLY (annotations+=Annotation |
		//	terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement |
		//	bundleStatements+=TerminologyBundleStatement | terminologyBundleAxioms+=TerminologyBundleAxiom)*
		//	RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//kind=TerminologyGraphKind BUNDLE_TOKEN iri=IRI LCURLY (annotations+=Annotation |
		//terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement |
		//bundleStatements+=TerminologyBundleStatement | terminologyBundleAxioms+=TerminologyBundleAxiom)* RCURLY
		public Group getGroup() { return cGroup; }
		
		//kind=TerminologyGraphKind
		public Assignment getKindAssignment_0() { return cKindAssignment_0; }
		
		//TerminologyGraphKind
		public RuleCall getKindTerminologyGraphKindEnumRuleCall_0_0() { return cKindTerminologyGraphKindEnumRuleCall_0_0; }
		
		//BUNDLE_TOKEN
		public RuleCall getBUNDLE_TOKENTerminalRuleCall_1() { return cBUNDLE_TOKENTerminalRuleCall_1; }
		
		//iri=IRI
		public Assignment getIriAssignment_2() { return cIriAssignment_2; }
		
		//IRI
		public RuleCall getIriIRITerminalRuleCall_2_0() { return cIriIRITerminalRuleCall_2_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_3() { return cLCURLYTerminalRuleCall_3; }
		
		//(annotations+=Annotation | terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement |
		//bundleStatements+=TerminologyBundleStatement | terminologyBundleAxioms+=TerminologyBundleAxiom)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//annotations+=Annotation
		public Assignment getAnnotationsAssignment_4_0() { return cAnnotationsAssignment_4_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_4_0_0() { return cAnnotationsAnnotationParserRuleCall_4_0_0; }
		
		//terminologyBoxAxioms+=TerminologyBoxAxiom
		public Assignment getTerminologyBoxAxiomsAssignment_4_1() { return cTerminologyBoxAxiomsAssignment_4_1; }
		
		//TerminologyBoxAxiom
		public RuleCall getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0() { return cTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0; }
		
		//boxStatements+=TerminologyBoxStatement
		public Assignment getBoxStatementsAssignment_4_2() { return cBoxStatementsAssignment_4_2; }
		
		//TerminologyBoxStatement
		public RuleCall getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0() { return cBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0; }
		
		//bundleStatements+=TerminologyBundleStatement
		public Assignment getBundleStatementsAssignment_4_3() { return cBundleStatementsAssignment_4_3; }
		
		//TerminologyBundleStatement
		public RuleCall getBundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0() { return cBundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0; }
		
		//terminologyBundleAxioms+=TerminologyBundleAxiom
		public Assignment getTerminologyBundleAxiomsAssignment_4_4() { return cTerminologyBundleAxiomsAssignment_4_4; }
		
		//TerminologyBundleAxiom
		public RuleCall getTerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0() { return cTerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_5() { return cRCURLYTerminalRuleCall_5; }
	}
	public class TerminologyBoxAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxAxiom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConceptDesignationTerminologyAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTerminologyExtensionAxiomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTerminologyNestingAxiomParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TerminologyBoxAxiom:
		//	ConceptDesignationTerminologyAxiom | TerminologyExtensionAxiom | TerminologyNestingAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//ConceptDesignationTerminologyAxiom | TerminologyExtensionAxiom | TerminologyNestingAxiom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ConceptDesignationTerminologyAxiom
		public RuleCall getConceptDesignationTerminologyAxiomParserRuleCall_0() { return cConceptDesignationTerminologyAxiomParserRuleCall_0; }
		
		//TerminologyExtensionAxiom
		public RuleCall getTerminologyExtensionAxiomParserRuleCall_1() { return cTerminologyExtensionAxiomParserRuleCall_1; }
		
		//TerminologyNestingAxiom
		public RuleCall getTerminologyNestingAxiomParserRuleCall_2() { return cTerminologyNestingAxiomParserRuleCall_2; }
	}
	public class TerminologyBoxStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxStatement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTermParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TerminologyBoxStatement:
		//	Axiom | Term;
		@Override public ParserRule getRule() { return rule; }
		
		//Axiom | Term
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Axiom
		public RuleCall getAxiomParserRuleCall_0() { return cAxiomParserRuleCall_0; }
		
		//Term
		public RuleCall getTermParserRuleCall_1() { return cTermParserRuleCall_1; }
	}
	public class TermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Term");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAtomicEntityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityRelationshipParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDatatypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDataRelationshipParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Term:
		//	AtomicEntity | EntityRelationship | Datatype | DataRelationship;
		@Override public ParserRule getRule() { return rule; }
		
		//AtomicEntity | EntityRelationship | Datatype | DataRelationship
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AtomicEntity
		public RuleCall getAtomicEntityParserRuleCall_0() { return cAtomicEntityParserRuleCall_0; }
		
		//EntityRelationship
		public RuleCall getEntityRelationshipParserRuleCall_1() { return cEntityRelationshipParserRuleCall_1; }
		
		//Datatype
		public RuleCall getDatatypeParserRuleCall_2() { return cDatatypeParserRuleCall_2; }
		
		//DataRelationship
		public RuleCall getDataRelationshipParserRuleCall_3() { return cDataRelationshipParserRuleCall_3; }
	}
	public class AtomicEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.AtomicEntity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAspectParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cConceptParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AtomicEntity Entity:
		//	Aspect | Concept
		@Override public ParserRule getRule() { return rule; }
		
		//Aspect | Concept
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Aspect
		public RuleCall getAspectParserRuleCall_0() { return cAspectParserRuleCall_0; }
		
		//Concept
		public RuleCall getConceptParserRuleCall_1() { return cConceptParserRuleCall_1; }
	}
	public class EntityRelationshipElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityRelationship");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cReifiedRelationshipParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUnreifiedRelationshipParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EntityRelationship:
		//	ReifiedRelationship | UnreifiedRelationship;
		@Override public ParserRule getRule() { return rule; }
		
		//ReifiedRelationship | UnreifiedRelationship
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ReifiedRelationship
		public RuleCall getReifiedRelationshipParserRuleCall_0() { return cReifiedRelationshipParserRuleCall_0; }
		
		//UnreifiedRelationship
		public RuleCall getUnreifiedRelationshipParserRuleCall_1() { return cUnreifiedRelationshipParserRuleCall_1; }
	}
	public class DatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Datatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cScalarDataRangeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStructureParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Datatype:
		//	ScalarDataRange | Structure;
		@Override public ParserRule getRule() { return rule; }
		
		//ScalarDataRange | Structure
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ScalarDataRange
		public RuleCall getScalarDataRangeParserRuleCall_0() { return cScalarDataRangeParserRuleCall_0; }
		
		//Structure
		public RuleCall getStructureParserRuleCall_1() { return cStructureParserRuleCall_1; }
	}
	public class ScalarDataRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ScalarDataRange");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cScalarParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRestrictedDataRangeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ScalarDataRange DataRange:
		//	Scalar | RestrictedDataRange
		@Override public ParserRule getRule() { return rule; }
		
		//Scalar | RestrictedDataRange
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Scalar
		public RuleCall getScalarParserRuleCall_0() { return cScalarParserRuleCall_0; }
		
		//RestrictedDataRange
		public RuleCall getRestrictedDataRangeParserRuleCall_1() { return cRestrictedDataRangeParserRuleCall_1; }
	}
	public class RestrictedDataRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.RestrictedDataRange");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBinaryScalarRestrictionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIRIScalarRestrictionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNumericScalarRestrictionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPlainLiteralScalarRestrictionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cScalarOneOfRestrictionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cStringScalarRestrictionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cSynonymScalarRestrictionParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cTimeScalarRestrictionParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		//RestrictedDataRange:
		//	BinaryScalarRestriction | IRIScalarRestriction | NumericScalarRestriction | PlainLiteralScalarRestriction |
		//	ScalarOneOfRestriction | StringScalarRestriction | SynonymScalarRestriction | TimeScalarRestriction;
		@Override public ParserRule getRule() { return rule; }
		
		//BinaryScalarRestriction | IRIScalarRestriction | NumericScalarRestriction | PlainLiteralScalarRestriction |
		//ScalarOneOfRestriction | StringScalarRestriction | SynonymScalarRestriction | TimeScalarRestriction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BinaryScalarRestriction
		public RuleCall getBinaryScalarRestrictionParserRuleCall_0() { return cBinaryScalarRestrictionParserRuleCall_0; }
		
		//IRIScalarRestriction
		public RuleCall getIRIScalarRestrictionParserRuleCall_1() { return cIRIScalarRestrictionParserRuleCall_1; }
		
		//NumericScalarRestriction
		public RuleCall getNumericScalarRestrictionParserRuleCall_2() { return cNumericScalarRestrictionParserRuleCall_2; }
		
		//PlainLiteralScalarRestriction
		public RuleCall getPlainLiteralScalarRestrictionParserRuleCall_3() { return cPlainLiteralScalarRestrictionParserRuleCall_3; }
		
		//ScalarOneOfRestriction
		public RuleCall getScalarOneOfRestrictionParserRuleCall_4() { return cScalarOneOfRestrictionParserRuleCall_4; }
		
		//StringScalarRestriction
		public RuleCall getStringScalarRestrictionParserRuleCall_5() { return cStringScalarRestrictionParserRuleCall_5; }
		
		//SynonymScalarRestriction
		public RuleCall getSynonymScalarRestrictionParserRuleCall_6() { return cSynonymScalarRestrictionParserRuleCall_6; }
		
		//TimeScalarRestriction
		public RuleCall getTimeScalarRestrictionParserRuleCall_7() { return cTimeScalarRestrictionParserRuleCall_7; }
	}
	public class DataRelationshipElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.DataRelationship");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityStructuredDataPropertyParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityScalarDataPropertyParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cStructuredDataPropertyParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cScalarDataPropertyParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//DataRelationship:
		//	EntityStructuredDataProperty | EntityScalarDataProperty | StructuredDataProperty | ScalarDataProperty;
		@Override public ParserRule getRule() { return rule; }
		
		//EntityStructuredDataProperty | EntityScalarDataProperty | StructuredDataProperty | ScalarDataProperty
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EntityStructuredDataProperty
		public RuleCall getEntityStructuredDataPropertyParserRuleCall_0() { return cEntityStructuredDataPropertyParserRuleCall_0; }
		
		//EntityScalarDataProperty
		public RuleCall getEntityScalarDataPropertyParserRuleCall_1() { return cEntityScalarDataPropertyParserRuleCall_1; }
		
		//StructuredDataProperty
		public RuleCall getStructuredDataPropertyParserRuleCall_2() { return cStructuredDataPropertyParserRuleCall_2; }
		
		//ScalarDataProperty
		public RuleCall getScalarDataPropertyParserRuleCall_3() { return cScalarDataPropertyParserRuleCall_3; }
	}
	public class AxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Axiom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cScalarOneOfLiteralAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTermAxiomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Axiom:
		//	ScalarOneOfLiteralAxiom | TermAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//ScalarOneOfLiteralAxiom | TermAxiom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ScalarOneOfLiteralAxiom
		public RuleCall getScalarOneOfLiteralAxiomParserRuleCall_0() { return cScalarOneOfLiteralAxiomParserRuleCall_0; }
		
		//TermAxiom
		public RuleCall getTermAxiomParserRuleCall_1() { return cTermAxiomParserRuleCall_1; }
	}
	public class TermAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TermAxiom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityRestrictionAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityScalarDataPropertyRestrictionAxiomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSpecializationAxiomParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TermAxiom:
		//	EntityRestrictionAxiom | EntityScalarDataPropertyRestrictionAxiom | SpecializationAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//EntityRestrictionAxiom | EntityScalarDataPropertyRestrictionAxiom | SpecializationAxiom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EntityRestrictionAxiom
		public RuleCall getEntityRestrictionAxiomParserRuleCall_0() { return cEntityRestrictionAxiomParserRuleCall_0; }
		
		//EntityScalarDataPropertyRestrictionAxiom
		public RuleCall getEntityScalarDataPropertyRestrictionAxiomParserRuleCall_1() { return cEntityScalarDataPropertyRestrictionAxiomParserRuleCall_1; }
		
		//SpecializationAxiom
		public RuleCall getSpecializationAxiomParserRuleCall_2() { return cSpecializationAxiomParserRuleCall_2; }
	}
	public class EntityRestrictionAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityRestrictionAxiom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityExistentialRestrictionAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityUniversalRestrictionAxiomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EntityRestrictionAxiom:
		//	EntityExistentialRestrictionAxiom | EntityUniversalRestrictionAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//EntityExistentialRestrictionAxiom | EntityUniversalRestrictionAxiom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EntityExistentialRestrictionAxiom
		public RuleCall getEntityExistentialRestrictionAxiomParserRuleCall_0() { return cEntityExistentialRestrictionAxiomParserRuleCall_0; }
		
		//EntityUniversalRestrictionAxiom
		public RuleCall getEntityUniversalRestrictionAxiomParserRuleCall_1() { return cEntityUniversalRestrictionAxiomParserRuleCall_1; }
	}
	public class EntityScalarDataPropertyRestrictionAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityScalarDataPropertyRestrictionAxiom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//EntityScalarDataPropertyRestrictionAxiom:
		//	EntityScalarDataPropertyExistentialRestrictionAxiom | EntityScalarDataPropertyParticularRestrictionAxiom |
		//	EntityScalarDataPropertyUniversalRestrictionAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//EntityScalarDataPropertyExistentialRestrictionAxiom | EntityScalarDataPropertyParticularRestrictionAxiom |
		//EntityScalarDataPropertyUniversalRestrictionAxiom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EntityScalarDataPropertyExistentialRestrictionAxiom
		public RuleCall getEntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0() { return cEntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0; }
		
		//EntityScalarDataPropertyParticularRestrictionAxiom
		public RuleCall getEntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1() { return cEntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1; }
		
		//EntityScalarDataPropertyUniversalRestrictionAxiom
		public RuleCall getEntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2() { return cEntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2; }
	}
	public class SpecializationAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SpecializationAxiom");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConceptSpecializationAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAspectSpecializationAxiomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cReifiedRelationshipSpecializationAxiomParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//SpecializationAxiom:
		//	ConceptSpecializationAxiom | AspectSpecializationAxiom | ReifiedRelationshipSpecializationAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//ConceptSpecializationAxiom | AspectSpecializationAxiom | ReifiedRelationshipSpecializationAxiom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ConceptSpecializationAxiom
		public RuleCall getConceptSpecializationAxiomParserRuleCall_0() { return cConceptSpecializationAxiomParserRuleCall_0; }
		
		//AspectSpecializationAxiom
		public RuleCall getAspectSpecializationAxiomParserRuleCall_1() { return cAspectSpecializationAxiomParserRuleCall_1; }
		
		//ReifiedRelationshipSpecializationAxiom
		public RuleCall getReifiedRelationshipSpecializationAxiomParserRuleCall_2() { return cReifiedRelationshipSpecializationAxiomParserRuleCall_2; }
	}
	public class TerminologyBundleStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBundleStatement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAnonymousConceptTaxonomyAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRootConceptTaxonomyAxiomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSpecificDisjointConceptAxiomParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TerminologyBundleStatement:
		//	AnonymousConceptTaxonomyAxiom | RootConceptTaxonomyAxiom | SpecificDisjointConceptAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//AnonymousConceptTaxonomyAxiom | RootConceptTaxonomyAxiom | SpecificDisjointConceptAxiom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AnonymousConceptTaxonomyAxiom
		public RuleCall getAnonymousConceptTaxonomyAxiomParserRuleCall_0() { return cAnonymousConceptTaxonomyAxiomParserRuleCall_0; }
		
		//RootConceptTaxonomyAxiom
		public RuleCall getRootConceptTaxonomyAxiomParserRuleCall_1() { return cRootConceptTaxonomyAxiomParserRuleCall_1; }
		
		//SpecificDisjointConceptAxiom
		public RuleCall getSpecificDisjointConceptAxiomParserRuleCall_2() { return cSpecificDisjointConceptAxiomParserRuleCall_2; }
	}
	public class TerminologyBundleAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBundleAxiom");
		private final RuleCall cBundledTerminologyAxiomParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//TerminologyBundleAxiom:
		//	BundledTerminologyAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//BundledTerminologyAxiom
		public RuleCall getBundledTerminologyAxiomParserRuleCall() { return cBundledTerminologyAxiomParserRuleCall; }
	}
	public class ConceptTreeDisjunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ConceptTreeDisjunction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAnonymousConceptTaxonomyAxiomParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRootConceptTaxonomyAxiomParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ConceptTreeDisjunction:
		//	AnonymousConceptTaxonomyAxiom | RootConceptTaxonomyAxiom;
		@Override public ParserRule getRule() { return rule; }
		
		//AnonymousConceptTaxonomyAxiom | RootConceptTaxonomyAxiom
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AnonymousConceptTaxonomyAxiom
		public RuleCall getAnonymousConceptTaxonomyAxiomParserRuleCall_0() { return cAnonymousConceptTaxonomyAxiomParserRuleCall_0; }
		
		//RootConceptTaxonomyAxiom
		public RuleCall getRootConceptTaxonomyAxiomParserRuleCall_1() { return cRootConceptTaxonomyAxiomParserRuleCall_1; }
	}
	public class AspectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Aspect");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cASPECT_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//// 2 Atomic Entity Terms
		//Aspect:
		//	ASPECT_TOKEN name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ASPECT_TOKEN name=ID
		public Group getGroup() { return cGroup; }
		
		//ASPECT_TOKEN
		public RuleCall getASPECT_TOKENTerminalRuleCall_0() { return cASPECT_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ConceptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Concept");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0 = (RuleCall)cIsAbstractAssignment_0.eContents().get(0);
		private final RuleCall cCONCEPT_TOKENTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Concept:
		//	isAbstract?=ABSTRACT_TOKEN? CONCEPT_TOKEN name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//isAbstract?=ABSTRACT_TOKEN? CONCEPT_TOKEN name=ID
		public Group getGroup() { return cGroup; }
		
		//isAbstract?=ABSTRACT_TOKEN?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }
		
		//ABSTRACT_TOKEN
		public RuleCall getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0() { return cIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0; }
		
		//CONCEPT_TOKEN
		public RuleCall getCONCEPT_TOKENTerminalRuleCall_1() { return cCONCEPT_TOKENTerminalRuleCall_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class ReifiedRelationshipElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ReifiedRelationship");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0 = (RuleCall)cIsAbstractAssignment_0.eContents().get(0);
		private final RuleCall cREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cIsFunctionalAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0 = (RuleCall)cIsFunctionalAssignment_4.eContents().get(0);
		private final Assignment cIsInverseFunctionalAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0 = (RuleCall)cIsInverseFunctionalAssignment_5.eContents().get(0);
		private final Assignment cIsEssentialAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0 = (RuleCall)cIsEssentialAssignment_6.eContents().get(0);
		private final Assignment cIsInverseEssentialAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0 = (RuleCall)cIsInverseEssentialAssignment_7.eContents().get(0);
		private final Assignment cIsSymmetricAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0 = (RuleCall)cIsSymmetricAssignment_8.eContents().get(0);
		private final Assignment cIsAsymmetricAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0 = (RuleCall)cIsAsymmetricAssignment_9.eContents().get(0);
		private final Assignment cIsReflexiveAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0 = (RuleCall)cIsReflexiveAssignment_10.eContents().get(0);
		private final Assignment cIsIrreflexiveAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0 = (RuleCall)cIsIrreflexiveAssignment_11.eContents().get(0);
		private final Assignment cIsTransitiveAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0 = (RuleCall)cIsTransitiveAssignment_12.eContents().get(0);
		private final RuleCall cUNREIFIED_TOKENTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final RuleCall cEQUALTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final Assignment cUnreifiedPropertyNameAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cUnreifiedPropertyNameIDTerminalRuleCall_15_0 = (RuleCall)cUnreifiedPropertyNameAssignment_15.eContents().get(0);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final RuleCall cINVERSE_TOKENTerminalRuleCall_16_0 = (RuleCall)cGroup_16.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_16_1 = (RuleCall)cGroup_16.eContents().get(1);
		private final Assignment cUnreifiedInversePropertyNameAssignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final RuleCall cUnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0 = (RuleCall)cUnreifiedInversePropertyNameAssignment_16_2.eContents().get(0);
		private final RuleCall cSOURCE_TOKENTerminalRuleCall_17 = (RuleCall)cGroup.eContents().get(17);
		private final RuleCall cEQUALTerminalRuleCall_18 = (RuleCall)cGroup.eContents().get(18);
		private final Assignment cSourceAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final CrossReference cSourceEntityCrossReference_19_0 = (CrossReference)cSourceAssignment_19.eContents().get(0);
		private final RuleCall cSourceEntityReferenceParserRuleCall_19_0_1 = (RuleCall)cSourceEntityCrossReference_19_0.eContents().get(1);
		private final RuleCall cTARGET_TOKENTerminalRuleCall_20 = (RuleCall)cGroup.eContents().get(20);
		private final RuleCall cEQUALTerminalRuleCall_21 = (RuleCall)cGroup.eContents().get(21);
		private final Assignment cTargetAssignment_22 = (Assignment)cGroup.eContents().get(22);
		private final CrossReference cTargetEntityCrossReference_22_0 = (CrossReference)cTargetAssignment_22.eContents().get(0);
		private final RuleCall cTargetEntityReferenceParserRuleCall_22_0_1 = (RuleCall)cTargetEntityCrossReference_22_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_23 = (RuleCall)cGroup.eContents().get(23);
		
		//// 2 EntityRelationship Terms
		//ReifiedRelationship:
		//	isAbstract?=ABSTRACT_TOKEN? REIFIED_RELATIONSHIP_TOKEN name=ID LCURLY
		//	isFunctional?=FUNCTIONAL_TOKEN?
		//	isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN?
		//	isEssential?=ESSENTIAL_TOKEN?
		//	isInverseEssential?=INVERSE_ESSENTIAL_TOKEN?
		//	isSymmetric?=SYMMETRIC_TOKEN?
		//	isAsymmetric?=ASYMMETRIC_TOKEN?
		//	isReflexive?=REFLEXIVE_TOKEN?
		//	isIrreflexive?=IRREFLEXIVE_TOKEN?
		//	isTransitive?=TRANSITIVE_TOKEN?
		//	UNREIFIED_TOKEN EQUAL unreifiedPropertyName=ID (INVERSE_TOKEN EQUAL unreifiedInversePropertyName=ID)?
		//	SOURCE_TOKEN EQUAL source=[Entity|Reference] TARGET_TOKEN EQUAL target=[Entity|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//isAbstract?=ABSTRACT_TOKEN? REIFIED_RELATIONSHIP_TOKEN name=ID LCURLY isFunctional?=FUNCTIONAL_TOKEN?
		//isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN? isEssential?=ESSENTIAL_TOKEN?
		//isInverseEssential?=INVERSE_ESSENTIAL_TOKEN? isSymmetric?=SYMMETRIC_TOKEN? isAsymmetric?=ASYMMETRIC_TOKEN?
		//isReflexive?=REFLEXIVE_TOKEN? isIrreflexive?=IRREFLEXIVE_TOKEN? isTransitive?=TRANSITIVE_TOKEN? UNREIFIED_TOKEN EQUAL
		//unreifiedPropertyName=ID (INVERSE_TOKEN EQUAL unreifiedInversePropertyName=ID)? SOURCE_TOKEN EQUAL
		//source=[Entity|Reference] TARGET_TOKEN EQUAL target=[Entity|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//isAbstract?=ABSTRACT_TOKEN?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }
		
		//ABSTRACT_TOKEN
		public RuleCall getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0() { return cIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0; }
		
		//REIFIED_RELATIONSHIP_TOKEN
		public RuleCall getREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1() { return cREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_3() { return cLCURLYTerminalRuleCall_3; }
		
		//isFunctional?=FUNCTIONAL_TOKEN?
		public Assignment getIsFunctionalAssignment_4() { return cIsFunctionalAssignment_4; }
		
		//FUNCTIONAL_TOKEN
		public RuleCall getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0() { return cIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0; }
		
		//isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN?
		public Assignment getIsInverseFunctionalAssignment_5() { return cIsInverseFunctionalAssignment_5; }
		
		//INVERSE_FUNCTIONAL_TOKEN
		public RuleCall getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0() { return cIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0; }
		
		//isEssential?=ESSENTIAL_TOKEN?
		public Assignment getIsEssentialAssignment_6() { return cIsEssentialAssignment_6; }
		
		//ESSENTIAL_TOKEN
		public RuleCall getIsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0() { return cIsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0; }
		
		//isInverseEssential?=INVERSE_ESSENTIAL_TOKEN?
		public Assignment getIsInverseEssentialAssignment_7() { return cIsInverseEssentialAssignment_7; }
		
		//INVERSE_ESSENTIAL_TOKEN
		public RuleCall getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0() { return cIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0; }
		
		//isSymmetric?=SYMMETRIC_TOKEN?
		public Assignment getIsSymmetricAssignment_8() { return cIsSymmetricAssignment_8; }
		
		//SYMMETRIC_TOKEN
		public RuleCall getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0() { return cIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0; }
		
		//isAsymmetric?=ASYMMETRIC_TOKEN?
		public Assignment getIsAsymmetricAssignment_9() { return cIsAsymmetricAssignment_9; }
		
		//ASYMMETRIC_TOKEN
		public RuleCall getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0() { return cIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0; }
		
		//isReflexive?=REFLEXIVE_TOKEN?
		public Assignment getIsReflexiveAssignment_10() { return cIsReflexiveAssignment_10; }
		
		//REFLEXIVE_TOKEN
		public RuleCall getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0() { return cIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0; }
		
		//isIrreflexive?=IRREFLEXIVE_TOKEN?
		public Assignment getIsIrreflexiveAssignment_11() { return cIsIrreflexiveAssignment_11; }
		
		//IRREFLEXIVE_TOKEN
		public RuleCall getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0() { return cIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0; }
		
		//isTransitive?=TRANSITIVE_TOKEN?
		public Assignment getIsTransitiveAssignment_12() { return cIsTransitiveAssignment_12; }
		
		//TRANSITIVE_TOKEN
		public RuleCall getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0() { return cIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0; }
		
		//UNREIFIED_TOKEN
		public RuleCall getUNREIFIED_TOKENTerminalRuleCall_13() { return cUNREIFIED_TOKENTerminalRuleCall_13; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_14() { return cEQUALTerminalRuleCall_14; }
		
		//unreifiedPropertyName=ID
		public Assignment getUnreifiedPropertyNameAssignment_15() { return cUnreifiedPropertyNameAssignment_15; }
		
		//ID
		public RuleCall getUnreifiedPropertyNameIDTerminalRuleCall_15_0() { return cUnreifiedPropertyNameIDTerminalRuleCall_15_0; }
		
		//(INVERSE_TOKEN EQUAL unreifiedInversePropertyName=ID)?
		public Group getGroup_16() { return cGroup_16; }
		
		//INVERSE_TOKEN
		public RuleCall getINVERSE_TOKENTerminalRuleCall_16_0() { return cINVERSE_TOKENTerminalRuleCall_16_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_16_1() { return cEQUALTerminalRuleCall_16_1; }
		
		//unreifiedInversePropertyName=ID
		public Assignment getUnreifiedInversePropertyNameAssignment_16_2() { return cUnreifiedInversePropertyNameAssignment_16_2; }
		
		//ID
		public RuleCall getUnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0() { return cUnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0; }
		
		//SOURCE_TOKEN
		public RuleCall getSOURCE_TOKENTerminalRuleCall_17() { return cSOURCE_TOKENTerminalRuleCall_17; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_18() { return cEQUALTerminalRuleCall_18; }
		
		//source=[Entity|Reference]
		public Assignment getSourceAssignment_19() { return cSourceAssignment_19; }
		
		//[Entity|Reference]
		public CrossReference getSourceEntityCrossReference_19_0() { return cSourceEntityCrossReference_19_0; }
		
		//Reference
		public RuleCall getSourceEntityReferenceParserRuleCall_19_0_1() { return cSourceEntityReferenceParserRuleCall_19_0_1; }
		
		//TARGET_TOKEN
		public RuleCall getTARGET_TOKENTerminalRuleCall_20() { return cTARGET_TOKENTerminalRuleCall_20; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_21() { return cEQUALTerminalRuleCall_21; }
		
		//target=[Entity|Reference]
		public Assignment getTargetAssignment_22() { return cTargetAssignment_22; }
		
		//[Entity|Reference]
		public CrossReference getTargetEntityCrossReference_22_0() { return cTargetEntityCrossReference_22_0; }
		
		//Reference
		public RuleCall getTargetEntityReferenceParserRuleCall_22_0_1() { return cTargetEntityReferenceParserRuleCall_22_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_23() { return cRCURLYTerminalRuleCall_23; }
	}
	public class UnreifiedRelationshipElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.UnreifiedRelationship");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cIsFunctionalAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0 = (RuleCall)cIsFunctionalAssignment_3.eContents().get(0);
		private final Assignment cIsInverseFunctionalAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0 = (RuleCall)cIsInverseFunctionalAssignment_4.eContents().get(0);
		private final Assignment cIsEssentialAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0 = (RuleCall)cIsEssentialAssignment_5.eContents().get(0);
		private final Assignment cIsInverseEssentialAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0 = (RuleCall)cIsInverseEssentialAssignment_6.eContents().get(0);
		private final Assignment cIsSymmetricAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0 = (RuleCall)cIsSymmetricAssignment_7.eContents().get(0);
		private final Assignment cIsAsymmetricAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0 = (RuleCall)cIsAsymmetricAssignment_8.eContents().get(0);
		private final Assignment cIsReflexiveAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0 = (RuleCall)cIsReflexiveAssignment_9.eContents().get(0);
		private final Assignment cIsIrreflexiveAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0 = (RuleCall)cIsIrreflexiveAssignment_10.eContents().get(0);
		private final Assignment cIsTransitiveAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0 = (RuleCall)cIsTransitiveAssignment_11.eContents().get(0);
		private final RuleCall cSOURCE_TOKENTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cEQUALTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final Assignment cSourceAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final CrossReference cSourceEntityCrossReference_14_0 = (CrossReference)cSourceAssignment_14.eContents().get(0);
		private final RuleCall cSourceEntityReferenceParserRuleCall_14_0_1 = (RuleCall)cSourceEntityCrossReference_14_0.eContents().get(1);
		private final RuleCall cTARGET_TOKENTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		private final RuleCall cEQUALTerminalRuleCall_16 = (RuleCall)cGroup.eContents().get(16);
		private final Assignment cTargetAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final CrossReference cTargetEntityCrossReference_17_0 = (CrossReference)cTargetAssignment_17.eContents().get(0);
		private final RuleCall cTargetEntityReferenceParserRuleCall_17_0_1 = (RuleCall)cTargetEntityCrossReference_17_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_18 = (RuleCall)cGroup.eContents().get(18);
		
		//UnreifiedRelationship:
		//	UNREIFIED_RELATIONSHIP_TOKEN name=ID LCURLY
		//	isFunctional?=FUNCTIONAL_TOKEN?
		//	isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN?
		//	isEssential?=ESSENTIAL_TOKEN?
		//	isInverseEssential?=INVERSE_ESSENTIAL_TOKEN?
		//	isSymmetric?=SYMMETRIC_TOKEN?
		//	isAsymmetric?=ASYMMETRIC_TOKEN?
		//	isReflexive?=REFLEXIVE_TOKEN?
		//	isIrreflexive?=IRREFLEXIVE_TOKEN?
		//	isTransitive?=TRANSITIVE_TOKEN?
		//	SOURCE_TOKEN EQUAL source=[Entity|Reference] TARGET_TOKEN EQUAL target=[Entity|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//UNREIFIED_RELATIONSHIP_TOKEN name=ID LCURLY isFunctional?=FUNCTIONAL_TOKEN?
		//isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN? isEssential?=ESSENTIAL_TOKEN?
		//isInverseEssential?=INVERSE_ESSENTIAL_TOKEN? isSymmetric?=SYMMETRIC_TOKEN? isAsymmetric?=ASYMMETRIC_TOKEN?
		//isReflexive?=REFLEXIVE_TOKEN? isIrreflexive?=IRREFLEXIVE_TOKEN? isTransitive?=TRANSITIVE_TOKEN? SOURCE_TOKEN EQUAL
		//source=[Entity|Reference] TARGET_TOKEN EQUAL target=[Entity|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//UNREIFIED_RELATIONSHIP_TOKEN
		public RuleCall getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0() { return cUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//isFunctional?=FUNCTIONAL_TOKEN?
		public Assignment getIsFunctionalAssignment_3() { return cIsFunctionalAssignment_3; }
		
		//FUNCTIONAL_TOKEN
		public RuleCall getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0() { return cIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0; }
		
		//isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN?
		public Assignment getIsInverseFunctionalAssignment_4() { return cIsInverseFunctionalAssignment_4; }
		
		//INVERSE_FUNCTIONAL_TOKEN
		public RuleCall getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0() { return cIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0; }
		
		//isEssential?=ESSENTIAL_TOKEN?
		public Assignment getIsEssentialAssignment_5() { return cIsEssentialAssignment_5; }
		
		//ESSENTIAL_TOKEN
		public RuleCall getIsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0() { return cIsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0; }
		
		//isInverseEssential?=INVERSE_ESSENTIAL_TOKEN?
		public Assignment getIsInverseEssentialAssignment_6() { return cIsInverseEssentialAssignment_6; }
		
		//INVERSE_ESSENTIAL_TOKEN
		public RuleCall getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0() { return cIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0; }
		
		//isSymmetric?=SYMMETRIC_TOKEN?
		public Assignment getIsSymmetricAssignment_7() { return cIsSymmetricAssignment_7; }
		
		//SYMMETRIC_TOKEN
		public RuleCall getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0() { return cIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0; }
		
		//isAsymmetric?=ASYMMETRIC_TOKEN?
		public Assignment getIsAsymmetricAssignment_8() { return cIsAsymmetricAssignment_8; }
		
		//ASYMMETRIC_TOKEN
		public RuleCall getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0() { return cIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0; }
		
		//isReflexive?=REFLEXIVE_TOKEN?
		public Assignment getIsReflexiveAssignment_9() { return cIsReflexiveAssignment_9; }
		
		//REFLEXIVE_TOKEN
		public RuleCall getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0() { return cIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0; }
		
		//isIrreflexive?=IRREFLEXIVE_TOKEN?
		public Assignment getIsIrreflexiveAssignment_10() { return cIsIrreflexiveAssignment_10; }
		
		//IRREFLEXIVE_TOKEN
		public RuleCall getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0() { return cIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0; }
		
		//isTransitive?=TRANSITIVE_TOKEN?
		public Assignment getIsTransitiveAssignment_11() { return cIsTransitiveAssignment_11; }
		
		//TRANSITIVE_TOKEN
		public RuleCall getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0() { return cIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0; }
		
		//SOURCE_TOKEN
		public RuleCall getSOURCE_TOKENTerminalRuleCall_12() { return cSOURCE_TOKENTerminalRuleCall_12; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_13() { return cEQUALTerminalRuleCall_13; }
		
		//source=[Entity|Reference]
		public Assignment getSourceAssignment_14() { return cSourceAssignment_14; }
		
		//[Entity|Reference]
		public CrossReference getSourceEntityCrossReference_14_0() { return cSourceEntityCrossReference_14_0; }
		
		//Reference
		public RuleCall getSourceEntityReferenceParserRuleCall_14_0_1() { return cSourceEntityReferenceParserRuleCall_14_0_1; }
		
		//TARGET_TOKEN
		public RuleCall getTARGET_TOKENTerminalRuleCall_15() { return cTARGET_TOKENTerminalRuleCall_15; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_16() { return cEQUALTerminalRuleCall_16; }
		
		//target=[Entity|Reference]
		public Assignment getTargetAssignment_17() { return cTargetAssignment_17; }
		
		//[Entity|Reference]
		public CrossReference getTargetEntityCrossReference_17_0() { return cTargetEntityCrossReference_17_0; }
		
		//Reference
		public RuleCall getTargetEntityReferenceParserRuleCall_17_0_1() { return cTargetEntityReferenceParserRuleCall_17_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_18() { return cRCURLYTerminalRuleCall_18; }
	}
	public class ScalarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Scalar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSCALAR_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//// 2 Datatypes
		//Scalar:
		//	SCALAR_TOKEN name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//SCALAR_TOKEN name=ID
		public Group getGroup() { return cGroup; }
		
		//SCALAR_TOKEN
		public RuleCall getSCALAR_TOKENTerminalRuleCall_0() { return cSCALAR_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class StructureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Structure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSTRUCTURE_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Structure:
		//	STRUCTURE_TOKEN name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRUCTURE_TOKEN name=ID
		public Group getGroup() { return cGroup; }
		
		//STRUCTURE_TOKEN
		public RuleCall getSTRUCTURE_TOKENTerminalRuleCall_0() { return cSTRUCTURE_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class EntityStructuredDataPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityStructuredDataProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityStructuredDataPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cDOMAIN_TOKENTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cDomainAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDomainEntityCrossReference_4_0 = (CrossReference)cDomainAssignment_4.eContents().get(0);
		private final RuleCall cDomainEntityReferenceParserRuleCall_4_0_1 = (RuleCall)cDomainEntityCrossReference_4_0.eContents().get(1);
		private final RuleCall cRANGE_TOKENTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cRangeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cRangeStructureCrossReference_6_0 = (CrossReference)cRangeAssignment_6.eContents().get(0);
		private final RuleCall cRangeStructureReferenceParserRuleCall_6_0_1 = (RuleCall)cRangeStructureCrossReference_6_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//// 4 DataRelationship Terms
		//EntityStructuredDataProperty:
		//	'entityStructuredDataProperty' name=ID LCURLY
		//	DOMAIN_TOKEN domain=[Entity|Reference] RANGE_TOKEN range=[Structure|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//'entityStructuredDataProperty' name=ID LCURLY DOMAIN_TOKEN domain=[Entity|Reference] RANGE_TOKEN
		//range=[Structure|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//'entityStructuredDataProperty'
		public Keyword getEntityStructuredDataPropertyKeyword_0() { return cEntityStructuredDataPropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//DOMAIN_TOKEN
		public RuleCall getDOMAIN_TOKENTerminalRuleCall_3() { return cDOMAIN_TOKENTerminalRuleCall_3; }
		
		//domain=[Entity|Reference]
		public Assignment getDomainAssignment_4() { return cDomainAssignment_4; }
		
		//[Entity|Reference]
		public CrossReference getDomainEntityCrossReference_4_0() { return cDomainEntityCrossReference_4_0; }
		
		//Reference
		public RuleCall getDomainEntityReferenceParserRuleCall_4_0_1() { return cDomainEntityReferenceParserRuleCall_4_0_1; }
		
		//RANGE_TOKEN
		public RuleCall getRANGE_TOKENTerminalRuleCall_5() { return cRANGE_TOKENTerminalRuleCall_5; }
		
		//range=[Structure|Reference]
		public Assignment getRangeAssignment_6() { return cRangeAssignment_6; }
		
		//[Structure|Reference]
		public CrossReference getRangeStructureCrossReference_6_0() { return cRangeStructureCrossReference_6_0; }
		
		//Reference
		public RuleCall getRangeStructureReferenceParserRuleCall_6_0_1() { return cRangeStructureReferenceParserRuleCall_6_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_7() { return cRCURLYTerminalRuleCall_7; }
	}
	public class EntityScalarDataPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityScalarDataProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityScalarDataPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cDOMAIN_TOKENTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cDomainAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDomainEntityCrossReference_4_0 = (CrossReference)cDomainAssignment_4.eContents().get(0);
		private final RuleCall cDomainEntityReferenceParserRuleCall_4_0_1 = (RuleCall)cDomainEntityCrossReference_4_0.eContents().get(1);
		private final RuleCall cRANGE_TOKENTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cRangeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cRangeDataRangeCrossReference_6_0 = (CrossReference)cRangeAssignment_6.eContents().get(0);
		private final RuleCall cRangeDataRangeReferenceParserRuleCall_6_0_1 = (RuleCall)cRangeDataRangeCrossReference_6_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//EntityScalarDataProperty:
		//	'entityScalarDataProperty' name=ID LCURLY
		//	DOMAIN_TOKEN domain=[Entity|Reference] RANGE_TOKEN range=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//'entityScalarDataProperty' name=ID LCURLY DOMAIN_TOKEN domain=[Entity|Reference] RANGE_TOKEN range=[DataRange|Reference]
		//RCURLY
		public Group getGroup() { return cGroup; }
		
		//'entityScalarDataProperty'
		public Keyword getEntityScalarDataPropertyKeyword_0() { return cEntityScalarDataPropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//DOMAIN_TOKEN
		public RuleCall getDOMAIN_TOKENTerminalRuleCall_3() { return cDOMAIN_TOKENTerminalRuleCall_3; }
		
		//domain=[Entity|Reference]
		public Assignment getDomainAssignment_4() { return cDomainAssignment_4; }
		
		//[Entity|Reference]
		public CrossReference getDomainEntityCrossReference_4_0() { return cDomainEntityCrossReference_4_0; }
		
		//Reference
		public RuleCall getDomainEntityReferenceParserRuleCall_4_0_1() { return cDomainEntityReferenceParserRuleCall_4_0_1; }
		
		//RANGE_TOKEN
		public RuleCall getRANGE_TOKENTerminalRuleCall_5() { return cRANGE_TOKENTerminalRuleCall_5; }
		
		//range=[DataRange|Reference]
		public Assignment getRangeAssignment_6() { return cRangeAssignment_6; }
		
		//[DataRange|Reference]
		public CrossReference getRangeDataRangeCrossReference_6_0() { return cRangeDataRangeCrossReference_6_0; }
		
		//Reference
		public RuleCall getRangeDataRangeReferenceParserRuleCall_6_0_1() { return cRangeDataRangeReferenceParserRuleCall_6_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_7() { return cRCURLYTerminalRuleCall_7; }
	}
	public class StructuredDataPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.StructuredDataProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStructuredDataPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cDOMAIN_TOKENTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cDomainAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDomainStructureCrossReference_4_0 = (CrossReference)cDomainAssignment_4.eContents().get(0);
		private final RuleCall cDomainStructureReferenceParserRuleCall_4_0_1 = (RuleCall)cDomainStructureCrossReference_4_0.eContents().get(1);
		private final RuleCall cRANGE_TOKENTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cRangeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cRangeStructureCrossReference_6_0 = (CrossReference)cRangeAssignment_6.eContents().get(0);
		private final RuleCall cRangeStructureReferenceParserRuleCall_6_0_1 = (RuleCall)cRangeStructureCrossReference_6_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//StructuredDataProperty:
		//	'structuredDataProperty' name=ID LCURLY
		//	DOMAIN_TOKEN domain=[Structure|Reference] RANGE_TOKEN range=[Structure|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//'structuredDataProperty' name=ID LCURLY DOMAIN_TOKEN domain=[Structure|Reference] RANGE_TOKEN
		//range=[Structure|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//'structuredDataProperty'
		public Keyword getStructuredDataPropertyKeyword_0() { return cStructuredDataPropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//DOMAIN_TOKEN
		public RuleCall getDOMAIN_TOKENTerminalRuleCall_3() { return cDOMAIN_TOKENTerminalRuleCall_3; }
		
		//domain=[Structure|Reference]
		public Assignment getDomainAssignment_4() { return cDomainAssignment_4; }
		
		//[Structure|Reference]
		public CrossReference getDomainStructureCrossReference_4_0() { return cDomainStructureCrossReference_4_0; }
		
		//Reference
		public RuleCall getDomainStructureReferenceParserRuleCall_4_0_1() { return cDomainStructureReferenceParserRuleCall_4_0_1; }
		
		//RANGE_TOKEN
		public RuleCall getRANGE_TOKENTerminalRuleCall_5() { return cRANGE_TOKENTerminalRuleCall_5; }
		
		//range=[Structure|Reference]
		public Assignment getRangeAssignment_6() { return cRangeAssignment_6; }
		
		//[Structure|Reference]
		public CrossReference getRangeStructureCrossReference_6_0() { return cRangeStructureCrossReference_6_0; }
		
		//Reference
		public RuleCall getRangeStructureReferenceParserRuleCall_6_0_1() { return cRangeStructureReferenceParserRuleCall_6_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_7() { return cRCURLYTerminalRuleCall_7; }
	}
	public class ScalarDataPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ScalarDataProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScalarDataPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cDOMAIN_TOKENTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cDomainAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDomainStructureCrossReference_4_0 = (CrossReference)cDomainAssignment_4.eContents().get(0);
		private final RuleCall cDomainStructureReferenceParserRuleCall_4_0_1 = (RuleCall)cDomainStructureCrossReference_4_0.eContents().get(1);
		private final RuleCall cRANGE_TOKENTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cRangeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cRangeDataRangeCrossReference_6_0 = (CrossReference)cRangeAssignment_6.eContents().get(0);
		private final RuleCall cRangeDataRangeReferenceParserRuleCall_6_0_1 = (RuleCall)cRangeDataRangeCrossReference_6_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		
		//ScalarDataProperty:
		//	'scalarDataProperty' name=ID LCURLY
		//	DOMAIN_TOKEN domain=[Structure|Reference] RANGE_TOKEN range=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//'scalarDataProperty' name=ID LCURLY DOMAIN_TOKEN domain=[Structure|Reference] RANGE_TOKEN range=[DataRange|Reference]
		//RCURLY
		public Group getGroup() { return cGroup; }
		
		//'scalarDataProperty'
		public Keyword getScalarDataPropertyKeyword_0() { return cScalarDataPropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//DOMAIN_TOKEN
		public RuleCall getDOMAIN_TOKENTerminalRuleCall_3() { return cDOMAIN_TOKENTerminalRuleCall_3; }
		
		//domain=[Structure|Reference]
		public Assignment getDomainAssignment_4() { return cDomainAssignment_4; }
		
		//[Structure|Reference]
		public CrossReference getDomainStructureCrossReference_4_0() { return cDomainStructureCrossReference_4_0; }
		
		//Reference
		public RuleCall getDomainStructureReferenceParserRuleCall_4_0_1() { return cDomainStructureReferenceParserRuleCall_4_0_1; }
		
		//RANGE_TOKEN
		public RuleCall getRANGE_TOKENTerminalRuleCall_5() { return cRANGE_TOKENTerminalRuleCall_5; }
		
		//range=[DataRange|Reference]
		public Assignment getRangeAssignment_6() { return cRangeAssignment_6; }
		
		//[DataRange|Reference]
		public CrossReference getRangeDataRangeCrossReference_6_0() { return cRangeDataRangeCrossReference_6_0; }
		
		//Reference
		public RuleCall getRangeDataRangeReferenceParserRuleCall_6_0_1() { return cRangeDataRangeReferenceParserRuleCall_6_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_7() { return cRCURLYTerminalRuleCall_7; }
	}
	public class AnonymousConceptTaxonomyAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.AnonymousConceptTaxonomyAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cDisjointTaxonomyParentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDisjointTaxonomyParentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0 = (CrossReference)cDisjointTaxonomyParentAssignment_3.eContents().get(0);
		private final RuleCall cDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1 = (RuleCall)cDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//// ConceptTreeDisjunctions and DisjointUnionOfConceptsAxioms
		//AnonymousConceptTaxonomyAxiom:
		//	ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN
		//	LCURLY
		//	'disjointTaxonomyParent' disjointTaxonomyParent=[ConceptTreeDisjunction|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN LCURLY 'disjointTaxonomyParent'
		//disjointTaxonomyParent=[ConceptTreeDisjunction|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN
		public RuleCall getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0() { return cANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'disjointTaxonomyParent'
		public Keyword getDisjointTaxonomyParentKeyword_2() { return cDisjointTaxonomyParentKeyword_2; }
		
		//disjointTaxonomyParent=[ConceptTreeDisjunction|Reference]
		public Assignment getDisjointTaxonomyParentAssignment_3() { return cDisjointTaxonomyParentAssignment_3; }
		
		//[ConceptTreeDisjunction|Reference]
		public CrossReference getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0() { return cDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0; }
		
		//Reference
		public RuleCall getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1() { return cDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_4() { return cRCURLYTerminalRuleCall_4; }
	}
	public class RootConceptTaxonomyAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.RootConceptTaxonomyAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRootKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRootAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRootConceptCrossReference_3_0 = (CrossReference)cRootAssignment_3.eContents().get(0);
		private final RuleCall cRootConceptReferenceParserRuleCall_3_0_1 = (RuleCall)cRootConceptCrossReference_3_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//RootConceptTaxonomyAxiom:
		//	ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN
		//	LCURLY
		//	'root' root=[Concept|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN LCURLY 'root' root=[Concept|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN
		public RuleCall getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0() { return cROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'root'
		public Keyword getRootKeyword_2() { return cRootKeyword_2; }
		
		//root=[Concept|Reference]
		public Assignment getRootAssignment_3() { return cRootAssignment_3; }
		
		//[Concept|Reference]
		public CrossReference getRootConceptCrossReference_3_0() { return cRootConceptCrossReference_3_0; }
		
		//Reference
		public RuleCall getRootConceptReferenceParserRuleCall_3_0_1() { return cRootConceptReferenceParserRuleCall_3_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_4() { return cRCURLYTerminalRuleCall_4; }
	}
	public class SpecificDisjointConceptAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SpecificDisjointConceptAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cDisjointTaxonomyParentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDisjointTaxonomyParentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0 = (CrossReference)cDisjointTaxonomyParentAssignment_3.eContents().get(0);
		private final RuleCall cDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1 = (RuleCall)cDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0.eContents().get(1);
		private final Keyword cDisjointLeafKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDisjointLeafAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cDisjointLeafConceptCrossReference_5_0 = (CrossReference)cDisjointLeafAssignment_5.eContents().get(0);
		private final RuleCall cDisjointLeafConceptReferenceParserRuleCall_5_0_1 = (RuleCall)cDisjointLeafConceptCrossReference_5_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//SpecificDisjointConceptAxiom:
		//	SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN
		//	LCURLY
		//	'disjointTaxonomyParent' disjointTaxonomyParent=[ConceptTreeDisjunction|Reference]
		//	'disjointLeaf' disjointLeaf=[Concept|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN LCURLY 'disjointTaxonomyParent'
		//disjointTaxonomyParent=[ConceptTreeDisjunction|Reference] 'disjointLeaf' disjointLeaf=[Concept|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN
		public RuleCall getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0() { return cSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'disjointTaxonomyParent'
		public Keyword getDisjointTaxonomyParentKeyword_2() { return cDisjointTaxonomyParentKeyword_2; }
		
		//disjointTaxonomyParent=[ConceptTreeDisjunction|Reference]
		public Assignment getDisjointTaxonomyParentAssignment_3() { return cDisjointTaxonomyParentAssignment_3; }
		
		//[ConceptTreeDisjunction|Reference]
		public CrossReference getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0() { return cDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0; }
		
		//Reference
		public RuleCall getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1() { return cDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1; }
		
		//'disjointLeaf'
		public Keyword getDisjointLeafKeyword_4() { return cDisjointLeafKeyword_4; }
		
		//disjointLeaf=[Concept|Reference]
		public Assignment getDisjointLeafAssignment_5() { return cDisjointLeafAssignment_5; }
		
		//[Concept|Reference]
		public CrossReference getDisjointLeafConceptCrossReference_5_0() { return cDisjointLeafConceptCrossReference_5_0; }
		
		//Reference
		public RuleCall getDisjointLeafConceptReferenceParserRuleCall_5_0_1() { return cDisjointLeafConceptReferenceParserRuleCall_5_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_6() { return cRCURLYTerminalRuleCall_6; }
	}
	public class BundledTerminologyAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.BundledTerminologyAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cBUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cBundledTerminologyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBundledTerminologyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cBundledTerminologyTerminologyBoxCrossReference_3_0 = (CrossReference)cBundledTerminologyAssignment_3.eContents().get(0);
		private final RuleCall cBundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1 = (RuleCall)cBundledTerminologyTerminologyBoxCrossReference_3_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//// 1 TerminologyBundleAxiom
		//BundledTerminologyAxiom:
		//	BUNDLED_TERMINOLOGY_AXIOM_TOKEN
		//	LCURLY
		//	'bundledTerminology' bundledTerminology=[TerminologyBox|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//BUNDLED_TERMINOLOGY_AXIOM_TOKEN LCURLY 'bundledTerminology' bundledTerminology=[TerminologyBox|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//BUNDLED_TERMINOLOGY_AXIOM_TOKEN
		public RuleCall getBUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0() { return cBUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'bundledTerminology'
		public Keyword getBundledTerminologyKeyword_2() { return cBundledTerminologyKeyword_2; }
		
		//bundledTerminology=[TerminologyBox|Reference]
		public Assignment getBundledTerminologyAssignment_3() { return cBundledTerminologyAssignment_3; }
		
		//[TerminologyBox|Reference]
		public CrossReference getBundledTerminologyTerminologyBoxCrossReference_3_0() { return cBundledTerminologyTerminologyBoxCrossReference_3_0; }
		
		//Reference
		public RuleCall getBundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1() { return cBundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_4() { return cRCURLYTerminalRuleCall_4; }
	}
	public class ConceptDesignationTerminologyAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ConceptDesignationTerminologyAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cDesignatedTerminologyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDesignatedTerminologyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cDesignatedTerminologyTerminologyBoxCrossReference_3_0 = (CrossReference)cDesignatedTerminologyAssignment_3.eContents().get(0);
		private final RuleCall cDesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1 = (RuleCall)cDesignatedTerminologyTerminologyBoxCrossReference_3_0.eContents().get(1);
		private final Keyword cDesignatedConceptKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDesignatedConceptAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cDesignatedConceptConceptCrossReference_5_0 = (CrossReference)cDesignatedConceptAssignment_5.eContents().get(0);
		private final RuleCall cDesignatedConceptConceptReferenceParserRuleCall_5_0_1 = (RuleCall)cDesignatedConceptConceptCrossReference_5_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//// 3 TerminologyBoxAxioms
		//ConceptDesignationTerminologyAxiom:
		//	CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN
		//	LCURLY
		//	'designatedTerminology' designatedTerminology=[TerminologyBox|Reference]
		//	'designatedConcept' designatedConcept=[Concept|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN LCURLY 'designatedTerminology'
		//designatedTerminology=[TerminologyBox|Reference] 'designatedConcept' designatedConcept=[Concept|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN
		public RuleCall getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0() { return cCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'designatedTerminology'
		public Keyword getDesignatedTerminologyKeyword_2() { return cDesignatedTerminologyKeyword_2; }
		
		//designatedTerminology=[TerminologyBox|Reference]
		public Assignment getDesignatedTerminologyAssignment_3() { return cDesignatedTerminologyAssignment_3; }
		
		//[TerminologyBox|Reference]
		public CrossReference getDesignatedTerminologyTerminologyBoxCrossReference_3_0() { return cDesignatedTerminologyTerminologyBoxCrossReference_3_0; }
		
		//Reference
		public RuleCall getDesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1() { return cDesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1; }
		
		//'designatedConcept'
		public Keyword getDesignatedConceptKeyword_4() { return cDesignatedConceptKeyword_4; }
		
		//designatedConcept=[Concept|Reference]
		public Assignment getDesignatedConceptAssignment_5() { return cDesignatedConceptAssignment_5; }
		
		//[Concept|Reference]
		public CrossReference getDesignatedConceptConceptCrossReference_5_0() { return cDesignatedConceptConceptCrossReference_5_0; }
		
		//Reference
		public RuleCall getDesignatedConceptConceptReferenceParserRuleCall_5_0_1() { return cDesignatedConceptConceptReferenceParserRuleCall_5_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_6() { return cRCURLYTerminalRuleCall_6; }
	}
	public class TerminologyExtensionAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyExtensionAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTERMINOLOGY_EXTENSION_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cExtendedTerminologyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cExtendedTerminologyTerminologyBoxCrossReference_1_0 = (CrossReference)cExtendedTerminologyAssignment_1.eContents().get(0);
		private final RuleCall cExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1 = (RuleCall)cExtendedTerminologyTerminologyBoxCrossReference_1_0.eContents().get(1);
		
		//TerminologyExtensionAxiom:
		//	TERMINOLOGY_EXTENSION_AXIOM_TOKEN extendedTerminology=[TerminologyBox|Reference];
		@Override public ParserRule getRule() { return rule; }
		
		//TERMINOLOGY_EXTENSION_AXIOM_TOKEN extendedTerminology=[TerminologyBox|Reference]
		public Group getGroup() { return cGroup; }
		
		//TERMINOLOGY_EXTENSION_AXIOM_TOKEN
		public RuleCall getTERMINOLOGY_EXTENSION_AXIOM_TOKENTerminalRuleCall_0() { return cTERMINOLOGY_EXTENSION_AXIOM_TOKENTerminalRuleCall_0; }
		
		//extendedTerminology=[TerminologyBox|Reference]
		public Assignment getExtendedTerminologyAssignment_1() { return cExtendedTerminologyAssignment_1; }
		
		//[TerminologyBox|Reference]
		public CrossReference getExtendedTerminologyTerminologyBoxCrossReference_1_0() { return cExtendedTerminologyTerminologyBoxCrossReference_1_0; }
		
		//Reference
		public RuleCall getExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1() { return cExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1; }
	}
	public class TerminologyNestingAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyNestingAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cNestingTerminologyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNestingTerminologyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cNestingTerminologyTerminologyBoxCrossReference_3_0 = (CrossReference)cNestingTerminologyAssignment_3.eContents().get(0);
		private final RuleCall cNestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1 = (RuleCall)cNestingTerminologyTerminologyBoxCrossReference_3_0.eContents().get(1);
		private final Keyword cNestingContextKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNestingContextAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cNestingContextConceptCrossReference_5_0 = (CrossReference)cNestingContextAssignment_5.eContents().get(0);
		private final RuleCall cNestingContextConceptReferenceParserRuleCall_5_0_1 = (RuleCall)cNestingContextConceptCrossReference_5_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//TerminologyNestingAxiom:
		//	TERMINOLOGY_NESTING_AXIOM_TOKEN
		//	LCURLY
		//	'nestingTerminology' nestingTerminology=[TerminologyBox|Reference]
		//	'nestingContext' nestingContext=[Concept|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//TERMINOLOGY_NESTING_AXIOM_TOKEN LCURLY 'nestingTerminology' nestingTerminology=[TerminologyBox|Reference]
		//'nestingContext' nestingContext=[Concept|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//TERMINOLOGY_NESTING_AXIOM_TOKEN
		public RuleCall getTERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0() { return cTERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'nestingTerminology'
		public Keyword getNestingTerminologyKeyword_2() { return cNestingTerminologyKeyword_2; }
		
		//nestingTerminology=[TerminologyBox|Reference]
		public Assignment getNestingTerminologyAssignment_3() { return cNestingTerminologyAssignment_3; }
		
		//[TerminologyBox|Reference]
		public CrossReference getNestingTerminologyTerminologyBoxCrossReference_3_0() { return cNestingTerminologyTerminologyBoxCrossReference_3_0; }
		
		//Reference
		public RuleCall getNestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1() { return cNestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1; }
		
		//'nestingContext'
		public Keyword getNestingContextKeyword_4() { return cNestingContextKeyword_4; }
		
		//nestingContext=[Concept|Reference]
		public Assignment getNestingContextAssignment_5() { return cNestingContextAssignment_5; }
		
		//[Concept|Reference]
		public CrossReference getNestingContextConceptCrossReference_5_0() { return cNestingContextConceptCrossReference_5_0; }
		
		//Reference
		public RuleCall getNestingContextConceptReferenceParserRuleCall_5_0_1() { return cNestingContextConceptReferenceParserRuleCall_5_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_6() { return cRCURLYTerminalRuleCall_6; }
	}
	public class EntityExistentialRestrictionAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityExistentialRestrictionAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRestrictedRelationKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRestrictedRelationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRestrictedRelationReifiedRelationshipCrossReference_3_0 = (CrossReference)cRestrictedRelationAssignment_3.eContents().get(0);
		private final RuleCall cRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1 = (RuleCall)cRestrictedRelationReifiedRelationshipCrossReference_3_0.eContents().get(1);
		private final Keyword cRestrictedRangeKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRestrictedRangeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cRestrictedRangeEntityCrossReference_5_0 = (CrossReference)cRestrictedRangeAssignment_5.eContents().get(0);
		private final RuleCall cRestrictedRangeEntityReferenceParserRuleCall_5_0_1 = (RuleCall)cRestrictedRangeEntityCrossReference_5_0.eContents().get(1);
		private final Keyword cRestrictedDomainKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRestrictedDomainAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cRestrictedDomainEntityCrossReference_7_0 = (CrossReference)cRestrictedDomainAssignment_7.eContents().get(0);
		private final RuleCall cRestrictedDomainEntityReferenceParserRuleCall_7_0_1 = (RuleCall)cRestrictedDomainEntityCrossReference_7_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//// 2 EntityRestrictionAxioms
		//EntityExistentialRestrictionAxiom:
		//	ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
		//	LCURLY
		//	'restrictedRelation' restrictedRelation=[ReifiedRelationship|Reference]
		//	'restrictedRange' restrictedRange=[Entity|Reference]
		//	'restrictedDomain' restrictedDomain=[Entity|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN LCURLY 'restrictedRelation'
		//restrictedRelation=[ReifiedRelationship|Reference] 'restrictedRange' restrictedRange=[Entity|Reference]
		//'restrictedDomain' restrictedDomain=[Entity|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
		public RuleCall getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0() { return cENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'restrictedRelation'
		public Keyword getRestrictedRelationKeyword_2() { return cRestrictedRelationKeyword_2; }
		
		//restrictedRelation=[ReifiedRelationship|Reference]
		public Assignment getRestrictedRelationAssignment_3() { return cRestrictedRelationAssignment_3; }
		
		//[ReifiedRelationship|Reference]
		public CrossReference getRestrictedRelationReifiedRelationshipCrossReference_3_0() { return cRestrictedRelationReifiedRelationshipCrossReference_3_0; }
		
		//Reference
		public RuleCall getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1() { return cRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_4() { return cRestrictedRangeKeyword_4; }
		
		//restrictedRange=[Entity|Reference]
		public Assignment getRestrictedRangeAssignment_5() { return cRestrictedRangeAssignment_5; }
		
		//[Entity|Reference]
		public CrossReference getRestrictedRangeEntityCrossReference_5_0() { return cRestrictedRangeEntityCrossReference_5_0; }
		
		//Reference
		public RuleCall getRestrictedRangeEntityReferenceParserRuleCall_5_0_1() { return cRestrictedRangeEntityReferenceParserRuleCall_5_0_1; }
		
		//'restrictedDomain'
		public Keyword getRestrictedDomainKeyword_6() { return cRestrictedDomainKeyword_6; }
		
		//restrictedDomain=[Entity|Reference]
		public Assignment getRestrictedDomainAssignment_7() { return cRestrictedDomainAssignment_7; }
		
		//[Entity|Reference]
		public CrossReference getRestrictedDomainEntityCrossReference_7_0() { return cRestrictedDomainEntityCrossReference_7_0; }
		
		//Reference
		public RuleCall getRestrictedDomainEntityReferenceParserRuleCall_7_0_1() { return cRestrictedDomainEntityReferenceParserRuleCall_7_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_8() { return cRCURLYTerminalRuleCall_8; }
	}
	public class EntityUniversalRestrictionAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityUniversalRestrictionAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRestrictedRelationKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRestrictedRelationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRestrictedRelationReifiedRelationshipCrossReference_3_0 = (CrossReference)cRestrictedRelationAssignment_3.eContents().get(0);
		private final RuleCall cRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1 = (RuleCall)cRestrictedRelationReifiedRelationshipCrossReference_3_0.eContents().get(1);
		private final Keyword cRestrictedRangeKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRestrictedRangeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cRestrictedRangeEntityCrossReference_5_0 = (CrossReference)cRestrictedRangeAssignment_5.eContents().get(0);
		private final RuleCall cRestrictedRangeEntityReferenceParserRuleCall_5_0_1 = (RuleCall)cRestrictedRangeEntityCrossReference_5_0.eContents().get(1);
		private final Keyword cRestrictedDomainKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRestrictedDomainAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cRestrictedDomainEntityCrossReference_7_0 = (CrossReference)cRestrictedDomainAssignment_7.eContents().get(0);
		private final RuleCall cRestrictedDomainEntityReferenceParserRuleCall_7_0_1 = (RuleCall)cRestrictedDomainEntityCrossReference_7_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//EntityUniversalRestrictionAxiom:
		//	ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
		//	LCURLY
		//	'restrictedRelation' restrictedRelation=[ReifiedRelationship|Reference]
		//	'restrictedRange' restrictedRange=[Entity|Reference]
		//	'restrictedDomain' restrictedDomain=[Entity|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN LCURLY 'restrictedRelation' restrictedRelation=[ReifiedRelationship|Reference]
		//'restrictedRange' restrictedRange=[Entity|Reference] 'restrictedDomain' restrictedDomain=[Entity|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
		public RuleCall getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0() { return cENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'restrictedRelation'
		public Keyword getRestrictedRelationKeyword_2() { return cRestrictedRelationKeyword_2; }
		
		//restrictedRelation=[ReifiedRelationship|Reference]
		public Assignment getRestrictedRelationAssignment_3() { return cRestrictedRelationAssignment_3; }
		
		//[ReifiedRelationship|Reference]
		public CrossReference getRestrictedRelationReifiedRelationshipCrossReference_3_0() { return cRestrictedRelationReifiedRelationshipCrossReference_3_0; }
		
		//Reference
		public RuleCall getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1() { return cRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_4() { return cRestrictedRangeKeyword_4; }
		
		//restrictedRange=[Entity|Reference]
		public Assignment getRestrictedRangeAssignment_5() { return cRestrictedRangeAssignment_5; }
		
		//[Entity|Reference]
		public CrossReference getRestrictedRangeEntityCrossReference_5_0() { return cRestrictedRangeEntityCrossReference_5_0; }
		
		//Reference
		public RuleCall getRestrictedRangeEntityReferenceParserRuleCall_5_0_1() { return cRestrictedRangeEntityReferenceParserRuleCall_5_0_1; }
		
		//'restrictedDomain'
		public Keyword getRestrictedDomainKeyword_6() { return cRestrictedDomainKeyword_6; }
		
		//restrictedDomain=[Entity|Reference]
		public Assignment getRestrictedDomainAssignment_7() { return cRestrictedDomainAssignment_7; }
		
		//[Entity|Reference]
		public CrossReference getRestrictedDomainEntityCrossReference_7_0() { return cRestrictedDomainEntityCrossReference_7_0; }
		
		//Reference
		public RuleCall getRestrictedDomainEntityReferenceParserRuleCall_7_0_1() { return cRestrictedDomainEntityReferenceParserRuleCall_7_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_8() { return cRCURLYTerminalRuleCall_8; }
	}
	public class AspectSpecializationAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.AspectSpecializationAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSubEntityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cSubEntityEntityCrossReference_0_0 = (CrossReference)cSubEntityAssignment_0.eContents().get(0);
		private final RuleCall cSubEntityEntityReferenceParserRuleCall_0_0_1 = (RuleCall)cSubEntityEntityCrossReference_0_0.eContents().get(1);
		private final RuleCall cASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cSuperAspectAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSuperAspectAspectCrossReference_2_0 = (CrossReference)cSuperAspectAssignment_2.eContents().get(0);
		private final RuleCall cSuperAspectAspectReferenceParserRuleCall_2_0_1 = (RuleCall)cSuperAspectAspectCrossReference_2_0.eContents().get(1);
		
		//// 3 SpecializationAxioms
		//AspectSpecializationAxiom:
		//	subEntity=[Entity|Reference] ASPECT_SPECIALIZATION_AXIOM_TOKEN superAspect=[Aspect|Reference];
		@Override public ParserRule getRule() { return rule; }
		
		//subEntity=[Entity|Reference] ASPECT_SPECIALIZATION_AXIOM_TOKEN superAspect=[Aspect|Reference]
		public Group getGroup() { return cGroup; }
		
		//subEntity=[Entity|Reference]
		public Assignment getSubEntityAssignment_0() { return cSubEntityAssignment_0; }
		
		//[Entity|Reference]
		public CrossReference getSubEntityEntityCrossReference_0_0() { return cSubEntityEntityCrossReference_0_0; }
		
		//Reference
		public RuleCall getSubEntityEntityReferenceParserRuleCall_0_0_1() { return cSubEntityEntityReferenceParserRuleCall_0_0_1; }
		
		//ASPECT_SPECIALIZATION_AXIOM_TOKEN
		public RuleCall getASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1() { return cASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1; }
		
		//superAspect=[Aspect|Reference]
		public Assignment getSuperAspectAssignment_2() { return cSuperAspectAssignment_2; }
		
		//[Aspect|Reference]
		public CrossReference getSuperAspectAspectCrossReference_2_0() { return cSuperAspectAspectCrossReference_2_0; }
		
		//Reference
		public RuleCall getSuperAspectAspectReferenceParserRuleCall_2_0_1() { return cSuperAspectAspectReferenceParserRuleCall_2_0_1; }
	}
	public class ConceptSpecializationAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ConceptSpecializationAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cSubConceptKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubConceptAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cSubConceptConceptCrossReference_3_0 = (CrossReference)cSubConceptAssignment_3.eContents().get(0);
		private final RuleCall cSubConceptConceptReferenceParserRuleCall_3_0_1 = (RuleCall)cSubConceptConceptCrossReference_3_0.eContents().get(1);
		private final Keyword cSuperConceptKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSuperConceptAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSuperConceptConceptCrossReference_5_0 = (CrossReference)cSuperConceptAssignment_5.eContents().get(0);
		private final RuleCall cSuperConceptConceptReferenceParserRuleCall_5_0_1 = (RuleCall)cSuperConceptConceptCrossReference_5_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//ConceptSpecializationAxiom:
		//	CONCEPT_SPECIALIZATION_AXIOM_TOKEN
		//	LCURLY
		//	'subConcept' subConcept=[Concept|Reference]
		//	'superConcept' superConcept=[Concept|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//CONCEPT_SPECIALIZATION_AXIOM_TOKEN LCURLY 'subConcept' subConcept=[Concept|Reference] 'superConcept'
		//superConcept=[Concept|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//CONCEPT_SPECIALIZATION_AXIOM_TOKEN
		public RuleCall getCONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0() { return cCONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'subConcept'
		public Keyword getSubConceptKeyword_2() { return cSubConceptKeyword_2; }
		
		//subConcept=[Concept|Reference]
		public Assignment getSubConceptAssignment_3() { return cSubConceptAssignment_3; }
		
		//[Concept|Reference]
		public CrossReference getSubConceptConceptCrossReference_3_0() { return cSubConceptConceptCrossReference_3_0; }
		
		//Reference
		public RuleCall getSubConceptConceptReferenceParserRuleCall_3_0_1() { return cSubConceptConceptReferenceParserRuleCall_3_0_1; }
		
		//'superConcept'
		public Keyword getSuperConceptKeyword_4() { return cSuperConceptKeyword_4; }
		
		//superConcept=[Concept|Reference]
		public Assignment getSuperConceptAssignment_5() { return cSuperConceptAssignment_5; }
		
		//[Concept|Reference]
		public CrossReference getSuperConceptConceptCrossReference_5_0() { return cSuperConceptConceptCrossReference_5_0; }
		
		//Reference
		public RuleCall getSuperConceptConceptReferenceParserRuleCall_5_0_1() { return cSuperConceptConceptReferenceParserRuleCall_5_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_6() { return cRCURLYTerminalRuleCall_6; }
	}
	public class ReifiedRelationshipSpecializationAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ReifiedRelationshipSpecializationAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cSubRelationshipKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubRelationshipAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cSubRelationshipReifiedRelationshipCrossReference_3_0 = (CrossReference)cSubRelationshipAssignment_3.eContents().get(0);
		private final RuleCall cSubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1 = (RuleCall)cSubRelationshipReifiedRelationshipCrossReference_3_0.eContents().get(1);
		private final Keyword cSuperRelationshipKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSuperRelationshipAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSuperRelationshipReifiedRelationshipCrossReference_5_0 = (CrossReference)cSuperRelationshipAssignment_5.eContents().get(0);
		private final RuleCall cSuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1 = (RuleCall)cSuperRelationshipReifiedRelationshipCrossReference_5_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//ReifiedRelationshipSpecializationAxiom:
		//	REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN
		//	LCURLY
		//	'subRelationship' subRelationship=[ReifiedRelationship|Reference]
		//	'superRelationship' superRelationship=[ReifiedRelationship|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN LCURLY 'subRelationship' subRelationship=[ReifiedRelationship|Reference]
		//'superRelationship' superRelationship=[ReifiedRelationship|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN
		public RuleCall getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0() { return cREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'subRelationship'
		public Keyword getSubRelationshipKeyword_2() { return cSubRelationshipKeyword_2; }
		
		//subRelationship=[ReifiedRelationship|Reference]
		public Assignment getSubRelationshipAssignment_3() { return cSubRelationshipAssignment_3; }
		
		//[ReifiedRelationship|Reference]
		public CrossReference getSubRelationshipReifiedRelationshipCrossReference_3_0() { return cSubRelationshipReifiedRelationshipCrossReference_3_0; }
		
		//Reference
		public RuleCall getSubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1() { return cSubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1; }
		
		//'superRelationship'
		public Keyword getSuperRelationshipKeyword_4() { return cSuperRelationshipKeyword_4; }
		
		//superRelationship=[ReifiedRelationship|Reference]
		public Assignment getSuperRelationshipAssignment_5() { return cSuperRelationshipAssignment_5; }
		
		//[ReifiedRelationship|Reference]
		public CrossReference getSuperRelationshipReifiedRelationshipCrossReference_5_0() { return cSuperRelationshipReifiedRelationshipCrossReference_5_0; }
		
		//Reference
		public RuleCall getSuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1() { return cSuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_6() { return cRCURLYTerminalRuleCall_6; }
	}
	public class EntityScalarDataPropertyExistentialRestrictionAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityScalarDataPropertyExistentialRestrictionAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRestrictedEntityKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRestrictedEntityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRestrictedEntityEntityCrossReference_3_0 = (CrossReference)cRestrictedEntityAssignment_3.eContents().get(0);
		private final RuleCall cRestrictedEntityEntityReferenceParserRuleCall_3_0_1 = (RuleCall)cRestrictedEntityEntityCrossReference_3_0.eContents().get(1);
		private final Keyword cScalarPropertyKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cScalarPropertyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cScalarPropertyEntityScalarDataPropertyCrossReference_5_0 = (CrossReference)cScalarPropertyAssignment_5.eContents().get(0);
		private final RuleCall cScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1 = (RuleCall)cScalarPropertyEntityScalarDataPropertyCrossReference_5_0.eContents().get(1);
		private final Keyword cScalarRestrictionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cScalarRestrictionAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cScalarRestrictionDataRangeCrossReference_7_0 = (CrossReference)cScalarRestrictionAssignment_7.eContents().get(0);
		private final RuleCall cScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1 = (RuleCall)cScalarRestrictionDataRangeCrossReference_7_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//// 3 EntityScalarDataPropertyRestrictionAxioms
		//EntityScalarDataPropertyExistentialRestrictionAxiom:
		//	ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
		//	LCURLY
		//	'restrictedEntity' restrictedEntity=[Entity|Reference]
		//	'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference]
		//	'scalarRestriction' scalarRestriction=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN LCURLY 'restrictedEntity'
		//restrictedEntity=[Entity|Reference] 'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference]
		//'scalarRestriction' scalarRestriction=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
		public RuleCall getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0() { return cENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'restrictedEntity'
		public Keyword getRestrictedEntityKeyword_2() { return cRestrictedEntityKeyword_2; }
		
		//restrictedEntity=[Entity|Reference]
		public Assignment getRestrictedEntityAssignment_3() { return cRestrictedEntityAssignment_3; }
		
		//[Entity|Reference]
		public CrossReference getRestrictedEntityEntityCrossReference_3_0() { return cRestrictedEntityEntityCrossReference_3_0; }
		
		//Reference
		public RuleCall getRestrictedEntityEntityReferenceParserRuleCall_3_0_1() { return cRestrictedEntityEntityReferenceParserRuleCall_3_0_1; }
		
		//'scalarProperty'
		public Keyword getScalarPropertyKeyword_4() { return cScalarPropertyKeyword_4; }
		
		//scalarProperty=[EntityScalarDataProperty|Reference]
		public Assignment getScalarPropertyAssignment_5() { return cScalarPropertyAssignment_5; }
		
		//[EntityScalarDataProperty|Reference]
		public CrossReference getScalarPropertyEntityScalarDataPropertyCrossReference_5_0() { return cScalarPropertyEntityScalarDataPropertyCrossReference_5_0; }
		
		//Reference
		public RuleCall getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1() { return cScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1; }
		
		//'scalarRestriction'
		public Keyword getScalarRestrictionKeyword_6() { return cScalarRestrictionKeyword_6; }
		
		//scalarRestriction=[DataRange|Reference]
		public Assignment getScalarRestrictionAssignment_7() { return cScalarRestrictionAssignment_7; }
		
		//[DataRange|Reference]
		public CrossReference getScalarRestrictionDataRangeCrossReference_7_0() { return cScalarRestrictionDataRangeCrossReference_7_0; }
		
		//Reference
		public RuleCall getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1() { return cScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_8() { return cRCURLYTerminalRuleCall_8; }
	}
	public class EntityScalarDataPropertyParticularRestrictionAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityScalarDataPropertyParticularRestrictionAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRestrictedEntityKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRestrictedEntityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRestrictedEntityEntityCrossReference_3_0 = (CrossReference)cRestrictedEntityAssignment_3.eContents().get(0);
		private final RuleCall cRestrictedEntityEntityReferenceParserRuleCall_3_0_1 = (RuleCall)cRestrictedEntityEntityCrossReference_3_0.eContents().get(1);
		private final Keyword cScalarPropertyKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cScalarPropertyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cScalarPropertyEntityScalarDataPropertyCrossReference_5_0 = (CrossReference)cScalarPropertyAssignment_5.eContents().get(0);
		private final RuleCall cScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1 = (RuleCall)cScalarPropertyEntityScalarDataPropertyCrossReference_5_0.eContents().get(1);
		private final Keyword cLiteralValueKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cLiteralValueAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cLiteralValueSTRINGTerminalRuleCall_7_0 = (RuleCall)cLiteralValueAssignment_7.eContents().get(0);
		private final RuleCall cRCURLYTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//EntityScalarDataPropertyParticularRestrictionAxiom:
		//	ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN
		//	LCURLY
		//	'restrictedEntity' restrictedEntity=[Entity|Reference]
		//	'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference]
		//	'literalValue' literalValue=STRING
		//	RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN LCURLY 'restrictedEntity'
		//restrictedEntity=[Entity|Reference] 'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference] 'literalValue'
		//literalValue=STRING RCURLY
		public Group getGroup() { return cGroup; }
		
		//ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN
		public RuleCall getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0() { return cENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'restrictedEntity'
		public Keyword getRestrictedEntityKeyword_2() { return cRestrictedEntityKeyword_2; }
		
		//restrictedEntity=[Entity|Reference]
		public Assignment getRestrictedEntityAssignment_3() { return cRestrictedEntityAssignment_3; }
		
		//[Entity|Reference]
		public CrossReference getRestrictedEntityEntityCrossReference_3_0() { return cRestrictedEntityEntityCrossReference_3_0; }
		
		//Reference
		public RuleCall getRestrictedEntityEntityReferenceParserRuleCall_3_0_1() { return cRestrictedEntityEntityReferenceParserRuleCall_3_0_1; }
		
		//'scalarProperty'
		public Keyword getScalarPropertyKeyword_4() { return cScalarPropertyKeyword_4; }
		
		//scalarProperty=[EntityScalarDataProperty|Reference]
		public Assignment getScalarPropertyAssignment_5() { return cScalarPropertyAssignment_5; }
		
		//[EntityScalarDataProperty|Reference]
		public CrossReference getScalarPropertyEntityScalarDataPropertyCrossReference_5_0() { return cScalarPropertyEntityScalarDataPropertyCrossReference_5_0; }
		
		//Reference
		public RuleCall getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1() { return cScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1; }
		
		//'literalValue'
		public Keyword getLiteralValueKeyword_6() { return cLiteralValueKeyword_6; }
		
		//literalValue=STRING
		public Assignment getLiteralValueAssignment_7() { return cLiteralValueAssignment_7; }
		
		//STRING
		public RuleCall getLiteralValueSTRINGTerminalRuleCall_7_0() { return cLiteralValueSTRINGTerminalRuleCall_7_0; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_8() { return cRCURLYTerminalRuleCall_8; }
	}
	public class EntityScalarDataPropertyUniversalRestrictionAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EntityScalarDataPropertyUniversalRestrictionAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRestrictedEntityKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRestrictedEntityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRestrictedEntityEntityCrossReference_3_0 = (CrossReference)cRestrictedEntityAssignment_3.eContents().get(0);
		private final RuleCall cRestrictedEntityEntityReferenceParserRuleCall_3_0_1 = (RuleCall)cRestrictedEntityEntityCrossReference_3_0.eContents().get(1);
		private final Keyword cScalarPropertyKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cScalarPropertyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cScalarPropertyEntityScalarDataPropertyCrossReference_5_0 = (CrossReference)cScalarPropertyAssignment_5.eContents().get(0);
		private final RuleCall cScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1 = (RuleCall)cScalarPropertyEntityScalarDataPropertyCrossReference_5_0.eContents().get(1);
		private final Keyword cScalarRestrictionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cScalarRestrictionAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cScalarRestrictionDataRangeCrossReference_7_0 = (CrossReference)cScalarRestrictionAssignment_7.eContents().get(0);
		private final RuleCall cScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1 = (RuleCall)cScalarRestrictionDataRangeCrossReference_7_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//EntityScalarDataPropertyUniversalRestrictionAxiom:
		//	ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
		//	LCURLY
		//	'restrictedEntity' restrictedEntity=[Entity|Reference]
		//	'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference]
		//	'scalarRestriction' scalarRestriction=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN LCURLY 'restrictedEntity'
		//restrictedEntity=[Entity|Reference] 'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference]
		//'scalarRestriction' scalarRestriction=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
		public RuleCall getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0() { return cENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'restrictedEntity'
		public Keyword getRestrictedEntityKeyword_2() { return cRestrictedEntityKeyword_2; }
		
		//restrictedEntity=[Entity|Reference]
		public Assignment getRestrictedEntityAssignment_3() { return cRestrictedEntityAssignment_3; }
		
		//[Entity|Reference]
		public CrossReference getRestrictedEntityEntityCrossReference_3_0() { return cRestrictedEntityEntityCrossReference_3_0; }
		
		//Reference
		public RuleCall getRestrictedEntityEntityReferenceParserRuleCall_3_0_1() { return cRestrictedEntityEntityReferenceParserRuleCall_3_0_1; }
		
		//'scalarProperty'
		public Keyword getScalarPropertyKeyword_4() { return cScalarPropertyKeyword_4; }
		
		//scalarProperty=[EntityScalarDataProperty|Reference]
		public Assignment getScalarPropertyAssignment_5() { return cScalarPropertyAssignment_5; }
		
		//[EntityScalarDataProperty|Reference]
		public CrossReference getScalarPropertyEntityScalarDataPropertyCrossReference_5_0() { return cScalarPropertyEntityScalarDataPropertyCrossReference_5_0; }
		
		//Reference
		public RuleCall getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1() { return cScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1; }
		
		//'scalarRestriction'
		public Keyword getScalarRestrictionKeyword_6() { return cScalarRestrictionKeyword_6; }
		
		//scalarRestriction=[DataRange|Reference]
		public Assignment getScalarRestrictionAssignment_7() { return cScalarRestrictionAssignment_7; }
		
		//[DataRange|Reference]
		public CrossReference getScalarRestrictionDataRangeCrossReference_7_0() { return cScalarRestrictionDataRangeCrossReference_7_0; }
		
		//Reference
		public RuleCall getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1() { return cScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_8() { return cRCURLYTerminalRuleCall_8; }
	}
	public class BinaryScalarRestrictionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.BinaryScalarRestriction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cBINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLengthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cLengthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_3_1_0 = (RuleCall)cLengthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cMinLengthKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMinLengthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMinLengthINTTerminalRuleCall_4_1_0 = (RuleCall)cMinLengthAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cMaxLengthKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMaxLengthAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMaxLengthINTTerminalRuleCall_5_1_0 = (RuleCall)cMaxLengthAssignment_5_1.eContents().get(0);
		private final Keyword cRestrictedRangeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRestrictedRangeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cRestrictedRangeDataRangeCrossReference_7_0 = (CrossReference)cRestrictedRangeAssignment_7.eContents().get(0);
		private final RuleCall cRestrictedRangeDataRangeReferenceParserRuleCall_7_0_1 = (RuleCall)cRestrictedRangeDataRangeCrossReference_7_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//// 8 RestrictedDataRanges + 1 ScalarOneOfLiteralAxiom
		//BinaryScalarRestriction:
		//	BINARY_SCALAR_RESTRICTION_TOKEN name=ID
		//	LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength' maxLength=INT)?
		//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//BINARY_SCALAR_RESTRICTION_TOKEN name=ID LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength'
		//maxLength=INT)? 'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//BINARY_SCALAR_RESTRICTION_TOKEN
		public RuleCall getBINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0() { return cBINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//('length' length=INT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'length'
		public Keyword getLengthKeyword_3_0() { return cLengthKeyword_3_0; }
		
		//length=INT
		public Assignment getLengthAssignment_3_1() { return cLengthAssignment_3_1; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_3_1_0() { return cLengthINTTerminalRuleCall_3_1_0; }
		
		//('minLength' minLength=INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'minLength'
		public Keyword getMinLengthKeyword_4_0() { return cMinLengthKeyword_4_0; }
		
		//minLength=INT
		public Assignment getMinLengthAssignment_4_1() { return cMinLengthAssignment_4_1; }
		
		//INT
		public RuleCall getMinLengthINTTerminalRuleCall_4_1_0() { return cMinLengthINTTerminalRuleCall_4_1_0; }
		
		//('maxLength' maxLength=INT)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'maxLength'
		public Keyword getMaxLengthKeyword_5_0() { return cMaxLengthKeyword_5_0; }
		
		//maxLength=INT
		public Assignment getMaxLengthAssignment_5_1() { return cMaxLengthAssignment_5_1; }
		
		//INT
		public RuleCall getMaxLengthINTTerminalRuleCall_5_1_0() { return cMaxLengthINTTerminalRuleCall_5_1_0; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_6() { return cRestrictedRangeKeyword_6; }
		
		//restrictedRange=[DataRange|Reference]
		public Assignment getRestrictedRangeAssignment_7() { return cRestrictedRangeAssignment_7; }
		
		//[DataRange|Reference]
		public CrossReference getRestrictedRangeDataRangeCrossReference_7_0() { return cRestrictedRangeDataRangeCrossReference_7_0; }
		
		//Reference
		public RuleCall getRestrictedRangeDataRangeReferenceParserRuleCall_7_0_1() { return cRestrictedRangeDataRangeReferenceParserRuleCall_7_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_8() { return cRCURLYTerminalRuleCall_8; }
	}
	public class IRIScalarRestrictionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.IRIScalarRestriction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLengthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cLengthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_3_1_0 = (RuleCall)cLengthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cMinLengthKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMinLengthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMinLengthINTTerminalRuleCall_4_1_0 = (RuleCall)cMinLengthAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cMaxLengthKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMaxLengthAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMaxLengthINTTerminalRuleCall_5_1_0 = (RuleCall)cMaxLengthAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cPatternKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cPatternAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cPatternSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cPatternAssignment_6_1.eContents().get(0);
		private final Keyword cRestrictedRangeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRestrictedRangeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cRestrictedRangeDataRangeCrossReference_8_0 = (CrossReference)cRestrictedRangeAssignment_8.eContents().get(0);
		private final RuleCall cRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1 = (RuleCall)cRestrictedRangeDataRangeCrossReference_8_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		
		//IRIScalarRestriction:
		//	IRI_SCALAR_RESTRICTION_TOKEN name=ID
		//	LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength' maxLength=INT)? ('pattern' pattern=STRING)?
		//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//IRI_SCALAR_RESTRICTION_TOKEN name=ID LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength'
		//maxLength=INT)? ('pattern' pattern=STRING)? 'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//IRI_SCALAR_RESTRICTION_TOKEN
		public RuleCall getIRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0() { return cIRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//('length' length=INT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'length'
		public Keyword getLengthKeyword_3_0() { return cLengthKeyword_3_0; }
		
		//length=INT
		public Assignment getLengthAssignment_3_1() { return cLengthAssignment_3_1; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_3_1_0() { return cLengthINTTerminalRuleCall_3_1_0; }
		
		//('minLength' minLength=INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'minLength'
		public Keyword getMinLengthKeyword_4_0() { return cMinLengthKeyword_4_0; }
		
		//minLength=INT
		public Assignment getMinLengthAssignment_4_1() { return cMinLengthAssignment_4_1; }
		
		//INT
		public RuleCall getMinLengthINTTerminalRuleCall_4_1_0() { return cMinLengthINTTerminalRuleCall_4_1_0; }
		
		//('maxLength' maxLength=INT)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'maxLength'
		public Keyword getMaxLengthKeyword_5_0() { return cMaxLengthKeyword_5_0; }
		
		//maxLength=INT
		public Assignment getMaxLengthAssignment_5_1() { return cMaxLengthAssignment_5_1; }
		
		//INT
		public RuleCall getMaxLengthINTTerminalRuleCall_5_1_0() { return cMaxLengthINTTerminalRuleCall_5_1_0; }
		
		//('pattern' pattern=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'pattern'
		public Keyword getPatternKeyword_6_0() { return cPatternKeyword_6_0; }
		
		//pattern=STRING
		public Assignment getPatternAssignment_6_1() { return cPatternAssignment_6_1; }
		
		//STRING
		public RuleCall getPatternSTRINGTerminalRuleCall_6_1_0() { return cPatternSTRINGTerminalRuleCall_6_1_0; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_7() { return cRestrictedRangeKeyword_7; }
		
		//restrictedRange=[DataRange|Reference]
		public Assignment getRestrictedRangeAssignment_8() { return cRestrictedRangeAssignment_8; }
		
		//[DataRange|Reference]
		public CrossReference getRestrictedRangeDataRangeCrossReference_8_0() { return cRestrictedRangeDataRangeCrossReference_8_0; }
		
		//Reference
		public RuleCall getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1() { return cRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_9() { return cRCURLYTerminalRuleCall_9; }
	}
	public class NumericScalarRestrictionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.NumericScalarRestriction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cMinInclusiveKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cMinInclusiveAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cMinInclusiveSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cMinInclusiveAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cMaxInclusiveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMaxInclusiveAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMaxInclusiveSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cMaxInclusiveAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cMinExclusiveKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMinExclusiveAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMinExclusiveSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cMinExclusiveAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cMaxExclusiveKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cMaxExclusiveAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cMaxExclusiveSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cMaxExclusiveAssignment_6_1.eContents().get(0);
		private final Keyword cRestrictedRangeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRestrictedRangeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cRestrictedRangeDataRangeCrossReference_8_0 = (CrossReference)cRestrictedRangeAssignment_8.eContents().get(0);
		private final RuleCall cRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1 = (RuleCall)cRestrictedRangeDataRangeCrossReference_8_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		
		//NumericScalarRestriction:
		//	NUMERIC_SCALAR_RESTRICTION_TOKEN name=ID
		//	LCURLY ('minInclusive' minInclusive=STRING)? ('maxInclusive' maxInclusive=STRING)? ('minExclusive'
		//	minExclusive=STRING)? ('maxExclusive' maxExclusive=STRING)?
		//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//NUMERIC_SCALAR_RESTRICTION_TOKEN name=ID LCURLY ('minInclusive' minInclusive=STRING)? ('maxInclusive'
		//maxInclusive=STRING)? ('minExclusive' minExclusive=STRING)? ('maxExclusive' maxExclusive=STRING)? 'restrictedRange'
		//restrictedRange=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//NUMERIC_SCALAR_RESTRICTION_TOKEN
		public RuleCall getNUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0() { return cNUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//('minInclusive' minInclusive=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'minInclusive'
		public Keyword getMinInclusiveKeyword_3_0() { return cMinInclusiveKeyword_3_0; }
		
		//minInclusive=STRING
		public Assignment getMinInclusiveAssignment_3_1() { return cMinInclusiveAssignment_3_1; }
		
		//STRING
		public RuleCall getMinInclusiveSTRINGTerminalRuleCall_3_1_0() { return cMinInclusiveSTRINGTerminalRuleCall_3_1_0; }
		
		//('maxInclusive' maxInclusive=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'maxInclusive'
		public Keyword getMaxInclusiveKeyword_4_0() { return cMaxInclusiveKeyword_4_0; }
		
		//maxInclusive=STRING
		public Assignment getMaxInclusiveAssignment_4_1() { return cMaxInclusiveAssignment_4_1; }
		
		//STRING
		public RuleCall getMaxInclusiveSTRINGTerminalRuleCall_4_1_0() { return cMaxInclusiveSTRINGTerminalRuleCall_4_1_0; }
		
		//('minExclusive' minExclusive=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'minExclusive'
		public Keyword getMinExclusiveKeyword_5_0() { return cMinExclusiveKeyword_5_0; }
		
		//minExclusive=STRING
		public Assignment getMinExclusiveAssignment_5_1() { return cMinExclusiveAssignment_5_1; }
		
		//STRING
		public RuleCall getMinExclusiveSTRINGTerminalRuleCall_5_1_0() { return cMinExclusiveSTRINGTerminalRuleCall_5_1_0; }
		
		//('maxExclusive' maxExclusive=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'maxExclusive'
		public Keyword getMaxExclusiveKeyword_6_0() { return cMaxExclusiveKeyword_6_0; }
		
		//maxExclusive=STRING
		public Assignment getMaxExclusiveAssignment_6_1() { return cMaxExclusiveAssignment_6_1; }
		
		//STRING
		public RuleCall getMaxExclusiveSTRINGTerminalRuleCall_6_1_0() { return cMaxExclusiveSTRINGTerminalRuleCall_6_1_0; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_7() { return cRestrictedRangeKeyword_7; }
		
		//restrictedRange=[DataRange|Reference]
		public Assignment getRestrictedRangeAssignment_8() { return cRestrictedRangeAssignment_8; }
		
		//[DataRange|Reference]
		public CrossReference getRestrictedRangeDataRangeCrossReference_8_0() { return cRestrictedRangeDataRangeCrossReference_8_0; }
		
		//Reference
		public RuleCall getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1() { return cRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_9() { return cRCURLYTerminalRuleCall_9; }
	}
	public class PlainLiteralScalarRestrictionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.PlainLiteralScalarRestriction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLengthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cLengthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_3_1_0 = (RuleCall)cLengthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cMinLengthKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMinLengthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMinLengthINTTerminalRuleCall_4_1_0 = (RuleCall)cMinLengthAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cMaxLengthKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMaxLengthAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMaxLengthINTTerminalRuleCall_5_1_0 = (RuleCall)cMaxLengthAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cPatternKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cPatternAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cPatternSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cPatternAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cLanguageKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cLanguageAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cLanguageSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cLanguageAssignment_7_1.eContents().get(0);
		private final Keyword cRestrictedRangeKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cRestrictedRangeAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final CrossReference cRestrictedRangeDataRangeCrossReference_9_0 = (CrossReference)cRestrictedRangeAssignment_9.eContents().get(0);
		private final RuleCall cRestrictedRangeDataRangeReferenceParserRuleCall_9_0_1 = (RuleCall)cRestrictedRangeDataRangeCrossReference_9_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		
		//PlainLiteralScalarRestriction:
		//	PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN name=ID
		//	LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength' maxLength=INT)? ('pattern' pattern=STRING)?
		//	('language' language=STRING)?
		//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN name=ID LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength'
		//maxLength=INT)? ('pattern' pattern=STRING)? ('language' language=STRING)? 'restrictedRange'
		//restrictedRange=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN
		public RuleCall getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0() { return cPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//('length' length=INT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'length'
		public Keyword getLengthKeyword_3_0() { return cLengthKeyword_3_0; }
		
		//length=INT
		public Assignment getLengthAssignment_3_1() { return cLengthAssignment_3_1; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_3_1_0() { return cLengthINTTerminalRuleCall_3_1_0; }
		
		//('minLength' minLength=INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'minLength'
		public Keyword getMinLengthKeyword_4_0() { return cMinLengthKeyword_4_0; }
		
		//minLength=INT
		public Assignment getMinLengthAssignment_4_1() { return cMinLengthAssignment_4_1; }
		
		//INT
		public RuleCall getMinLengthINTTerminalRuleCall_4_1_0() { return cMinLengthINTTerminalRuleCall_4_1_0; }
		
		//('maxLength' maxLength=INT)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'maxLength'
		public Keyword getMaxLengthKeyword_5_0() { return cMaxLengthKeyword_5_0; }
		
		//maxLength=INT
		public Assignment getMaxLengthAssignment_5_1() { return cMaxLengthAssignment_5_1; }
		
		//INT
		public RuleCall getMaxLengthINTTerminalRuleCall_5_1_0() { return cMaxLengthINTTerminalRuleCall_5_1_0; }
		
		//('pattern' pattern=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'pattern'
		public Keyword getPatternKeyword_6_0() { return cPatternKeyword_6_0; }
		
		//pattern=STRING
		public Assignment getPatternAssignment_6_1() { return cPatternAssignment_6_1; }
		
		//STRING
		public RuleCall getPatternSTRINGTerminalRuleCall_6_1_0() { return cPatternSTRINGTerminalRuleCall_6_1_0; }
		
		//('language' language=STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'language'
		public Keyword getLanguageKeyword_7_0() { return cLanguageKeyword_7_0; }
		
		//language=STRING
		public Assignment getLanguageAssignment_7_1() { return cLanguageAssignment_7_1; }
		
		//STRING
		public RuleCall getLanguageSTRINGTerminalRuleCall_7_1_0() { return cLanguageSTRINGTerminalRuleCall_7_1_0; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_8() { return cRestrictedRangeKeyword_8; }
		
		//restrictedRange=[DataRange|Reference]
		public Assignment getRestrictedRangeAssignment_9() { return cRestrictedRangeAssignment_9; }
		
		//[DataRange|Reference]
		public CrossReference getRestrictedRangeDataRangeCrossReference_9_0() { return cRestrictedRangeDataRangeCrossReference_9_0; }
		
		//Reference
		public RuleCall getRestrictedRangeDataRangeReferenceParserRuleCall_9_0_1() { return cRestrictedRangeDataRangeReferenceParserRuleCall_9_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_10() { return cRCURLYTerminalRuleCall_10; }
	}
	public class ScalarOneOfRestrictionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ScalarOneOfRestriction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRestrictedRangeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRestrictedRangeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cRestrictedRangeDataRangeCrossReference_4_0 = (CrossReference)cRestrictedRangeAssignment_4.eContents().get(0);
		private final RuleCall cRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1 = (RuleCall)cRestrictedRangeDataRangeCrossReference_4_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//ScalarOneOfRestriction:
		//	SCALAR_ONE_OF_RESTRICTION_TOKEN name=ID
		//	LCURLY
		//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//SCALAR_ONE_OF_RESTRICTION_TOKEN name=ID LCURLY 'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//SCALAR_ONE_OF_RESTRICTION_TOKEN
		public RuleCall getSCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0() { return cSCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_3() { return cRestrictedRangeKeyword_3; }
		
		//restrictedRange=[DataRange|Reference]
		public Assignment getRestrictedRangeAssignment_4() { return cRestrictedRangeAssignment_4; }
		
		//[DataRange|Reference]
		public CrossReference getRestrictedRangeDataRangeCrossReference_4_0() { return cRestrictedRangeDataRangeCrossReference_4_0; }
		
		//Reference
		public RuleCall getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1() { return cRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_5() { return cRCURLYTerminalRuleCall_5; }
	}
	public class ScalarOneOfLiteralAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ScalarOneOfLiteralAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		private final Keyword cAxiomKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAxiomAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cAxiomScalarOneOfRestrictionCrossReference_5_0 = (CrossReference)cAxiomAssignment_5.eContents().get(0);
		private final RuleCall cAxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1 = (RuleCall)cAxiomScalarOneOfRestrictionCrossReference_5_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//ScalarOneOfLiteralAxiom:
		//	SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN
		//	LCURLY
		//	'value' value=STRING
		//	'axiom' axiom=[ScalarOneOfRestriction|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN LCURLY 'value' value=STRING 'axiom' axiom=[ScalarOneOfRestriction|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN
		public RuleCall getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0() { return cSCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_1() { return cLCURLYTerminalRuleCall_1; }
		
		//'value'
		public Keyword getValueKeyword_2() { return cValueKeyword_2; }
		
		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
		
		//'axiom'
		public Keyword getAxiomKeyword_4() { return cAxiomKeyword_4; }
		
		//axiom=[ScalarOneOfRestriction|Reference]
		public Assignment getAxiomAssignment_5() { return cAxiomAssignment_5; }
		
		//[ScalarOneOfRestriction|Reference]
		public CrossReference getAxiomScalarOneOfRestrictionCrossReference_5_0() { return cAxiomScalarOneOfRestrictionCrossReference_5_0; }
		
		//Reference
		public RuleCall getAxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1() { return cAxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_6() { return cRCURLYTerminalRuleCall_6; }
	}
	public class StringScalarRestrictionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.StringScalarRestriction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSTRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLengthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cLengthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_3_1_0 = (RuleCall)cLengthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cMinLengthKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMinLengthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMinLengthINTTerminalRuleCall_4_1_0 = (RuleCall)cMinLengthAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cMaxLengthKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMaxLengthAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMaxLengthINTTerminalRuleCall_5_1_0 = (RuleCall)cMaxLengthAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cPatternKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cPatternAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cPatternSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cPatternAssignment_6_1.eContents().get(0);
		private final Keyword cRestrictedRangeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRestrictedRangeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cRestrictedRangeDataRangeCrossReference_8_0 = (CrossReference)cRestrictedRangeAssignment_8.eContents().get(0);
		private final RuleCall cRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1 = (RuleCall)cRestrictedRangeDataRangeCrossReference_8_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		
		//StringScalarRestriction:
		//	STRING_SCALAR_RESTRICTION_TOKEN name=ID
		//	LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength' maxLength=INT)? ('pattern' pattern=STRING)?
		//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING_SCALAR_RESTRICTION_TOKEN name=ID LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength'
		//maxLength=INT)? ('pattern' pattern=STRING)? 'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//STRING_SCALAR_RESTRICTION_TOKEN
		public RuleCall getSTRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0() { return cSTRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//('length' length=INT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'length'
		public Keyword getLengthKeyword_3_0() { return cLengthKeyword_3_0; }
		
		//length=INT
		public Assignment getLengthAssignment_3_1() { return cLengthAssignment_3_1; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_3_1_0() { return cLengthINTTerminalRuleCall_3_1_0; }
		
		//('minLength' minLength=INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'minLength'
		public Keyword getMinLengthKeyword_4_0() { return cMinLengthKeyword_4_0; }
		
		//minLength=INT
		public Assignment getMinLengthAssignment_4_1() { return cMinLengthAssignment_4_1; }
		
		//INT
		public RuleCall getMinLengthINTTerminalRuleCall_4_1_0() { return cMinLengthINTTerminalRuleCall_4_1_0; }
		
		//('maxLength' maxLength=INT)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'maxLength'
		public Keyword getMaxLengthKeyword_5_0() { return cMaxLengthKeyword_5_0; }
		
		//maxLength=INT
		public Assignment getMaxLengthAssignment_5_1() { return cMaxLengthAssignment_5_1; }
		
		//INT
		public RuleCall getMaxLengthINTTerminalRuleCall_5_1_0() { return cMaxLengthINTTerminalRuleCall_5_1_0; }
		
		//('pattern' pattern=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'pattern'
		public Keyword getPatternKeyword_6_0() { return cPatternKeyword_6_0; }
		
		//pattern=STRING
		public Assignment getPatternAssignment_6_1() { return cPatternAssignment_6_1; }
		
		//STRING
		public RuleCall getPatternSTRINGTerminalRuleCall_6_1_0() { return cPatternSTRINGTerminalRuleCall_6_1_0; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_7() { return cRestrictedRangeKeyword_7; }
		
		//restrictedRange=[DataRange|Reference]
		public Assignment getRestrictedRangeAssignment_8() { return cRestrictedRangeAssignment_8; }
		
		//[DataRange|Reference]
		public CrossReference getRestrictedRangeDataRangeCrossReference_8_0() { return cRestrictedRangeDataRangeCrossReference_8_0; }
		
		//Reference
		public RuleCall getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1() { return cRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_9() { return cRCURLYTerminalRuleCall_9; }
	}
	public class SynonymScalarRestrictionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SynonymScalarRestriction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRestrictedRangeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRestrictedRangeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cRestrictedRangeDataRangeCrossReference_4_0 = (CrossReference)cRestrictedRangeAssignment_4.eContents().get(0);
		private final RuleCall cRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1 = (RuleCall)cRestrictedRangeDataRangeCrossReference_4_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//SynonymScalarRestriction:
		//	SYNONYM_SCALAR_RESTRICTION_TOKEN name=ID
		//	LCURLY
		//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//SYNONYM_SCALAR_RESTRICTION_TOKEN name=ID LCURLY 'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//SYNONYM_SCALAR_RESTRICTION_TOKEN
		public RuleCall getSYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0() { return cSYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_3() { return cRestrictedRangeKeyword_3; }
		
		//restrictedRange=[DataRange|Reference]
		public Assignment getRestrictedRangeAssignment_4() { return cRestrictedRangeAssignment_4; }
		
		//[DataRange|Reference]
		public CrossReference getRestrictedRangeDataRangeCrossReference_4_0() { return cRestrictedRangeDataRangeCrossReference_4_0; }
		
		//Reference
		public RuleCall getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1() { return cRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_5() { return cRCURLYTerminalRuleCall_5; }
	}
	public class TimeScalarRestrictionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TimeScalarRestriction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLCURLYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cMinInclusiveKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cMinInclusiveAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cMinInclusiveSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cMinInclusiveAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cMaxInclusiveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMaxInclusiveAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMaxInclusiveSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cMaxInclusiveAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cMinExclusiveKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMinExclusiveAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMinExclusiveSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cMinExclusiveAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cMaxExclusiveKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cMaxExclusiveAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cMaxExclusiveSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cMaxExclusiveAssignment_6_1.eContents().get(0);
		private final Keyword cRestrictedRangeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRestrictedRangeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cRestrictedRangeDataRangeCrossReference_8_0 = (CrossReference)cRestrictedRangeAssignment_8.eContents().get(0);
		private final RuleCall cRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1 = (RuleCall)cRestrictedRangeDataRangeCrossReference_8_0.eContents().get(1);
		private final RuleCall cRCURLYTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		
		//TimeScalarRestriction:
		//	TIME_SCALAR_RESTRICTION_TOKEN name=ID
		//	LCURLY ('minInclusive' minInclusive=STRING)? ('maxInclusive' maxInclusive=STRING)? ('minExclusive'
		//	minExclusive=STRING)? ('maxExclusive' maxExclusive=STRING)?
		//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
		@Override public ParserRule getRule() { return rule; }
		
		//TIME_SCALAR_RESTRICTION_TOKEN name=ID LCURLY ('minInclusive' minInclusive=STRING)? ('maxInclusive' maxInclusive=STRING)?
		//('minExclusive' minExclusive=STRING)? ('maxExclusive' maxExclusive=STRING)? 'restrictedRange'
		//restrictedRange=[DataRange|Reference] RCURLY
		public Group getGroup() { return cGroup; }
		
		//TIME_SCALAR_RESTRICTION_TOKEN
		public RuleCall getTIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0() { return cTIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//LCURLY
		public RuleCall getLCURLYTerminalRuleCall_2() { return cLCURLYTerminalRuleCall_2; }
		
		//('minInclusive' minInclusive=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'minInclusive'
		public Keyword getMinInclusiveKeyword_3_0() { return cMinInclusiveKeyword_3_0; }
		
		//minInclusive=STRING
		public Assignment getMinInclusiveAssignment_3_1() { return cMinInclusiveAssignment_3_1; }
		
		//STRING
		public RuleCall getMinInclusiveSTRINGTerminalRuleCall_3_1_0() { return cMinInclusiveSTRINGTerminalRuleCall_3_1_0; }
		
		//('maxInclusive' maxInclusive=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'maxInclusive'
		public Keyword getMaxInclusiveKeyword_4_0() { return cMaxInclusiveKeyword_4_0; }
		
		//maxInclusive=STRING
		public Assignment getMaxInclusiveAssignment_4_1() { return cMaxInclusiveAssignment_4_1; }
		
		//STRING
		public RuleCall getMaxInclusiveSTRINGTerminalRuleCall_4_1_0() { return cMaxInclusiveSTRINGTerminalRuleCall_4_1_0; }
		
		//('minExclusive' minExclusive=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'minExclusive'
		public Keyword getMinExclusiveKeyword_5_0() { return cMinExclusiveKeyword_5_0; }
		
		//minExclusive=STRING
		public Assignment getMinExclusiveAssignment_5_1() { return cMinExclusiveAssignment_5_1; }
		
		//STRING
		public RuleCall getMinExclusiveSTRINGTerminalRuleCall_5_1_0() { return cMinExclusiveSTRINGTerminalRuleCall_5_1_0; }
		
		//('maxExclusive' maxExclusive=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'maxExclusive'
		public Keyword getMaxExclusiveKeyword_6_0() { return cMaxExclusiveKeyword_6_0; }
		
		//maxExclusive=STRING
		public Assignment getMaxExclusiveAssignment_6_1() { return cMaxExclusiveAssignment_6_1; }
		
		//STRING
		public RuleCall getMaxExclusiveSTRINGTerminalRuleCall_6_1_0() { return cMaxExclusiveSTRINGTerminalRuleCall_6_1_0; }
		
		//'restrictedRange'
		public Keyword getRestrictedRangeKeyword_7() { return cRestrictedRangeKeyword_7; }
		
		//restrictedRange=[DataRange|Reference]
		public Assignment getRestrictedRangeAssignment_8() { return cRestrictedRangeAssignment_8; }
		
		//[DataRange|Reference]
		public CrossReference getRestrictedRangeDataRangeCrossReference_8_0() { return cRestrictedRangeDataRangeCrossReference_8_0; }
		
		//Reference
		public RuleCall getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1() { return cRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1; }
		
		//RCURLY
		public RuleCall getRCURLYTerminalRuleCall_9() { return cRCURLYTerminalRuleCall_9; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.Reference");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIRITerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cQNAMEParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		////----------------------------
		//Reference:
		//	IRI | QNAME;
		@Override public ParserRule getRule() { return rule; }
		
		//IRI | QNAME
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IRI
		public RuleCall getIRITerminalRuleCall_0() { return cIRITerminalRuleCall_0; }
		
		//QNAME
		public RuleCall getQNAMEParserRuleCall_1() { return cQNAMEParserRuleCall_1; }
	}
	public class QNAMEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.QNAME");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cABBREV_IRIParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cValidIDParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//QNAME:
		//	ABBREV_IRI | ValidID;
		@Override public ParserRule getRule() { return rule; }
		
		//ABBREV_IRI | ValidID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ABBREV_IRI
		public RuleCall getABBREV_IRIParserRuleCall_0() { return cABBREV_IRIParserRuleCall_0; }
		
		//ValidID
		public RuleCall getValidIDParserRuleCall_1() { return cValidIDParserRuleCall_1; }
	}
	public class ABBREV_IRIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ABBREV_IRI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cValidIDParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cValidIDParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//ABBREV_IRI:
		//	ValidID ':' ValidID;
		@Override public ParserRule getRule() { return rule; }
		
		//ValidID ':' ValidID
		public Group getGroup() { return cGroup; }
		
		//ValidID
		public RuleCall getValidIDParserRuleCall_0() { return cValidIDParserRuleCall_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//ValidID
		public RuleCall getValidIDParserRuleCall_2() { return cValidIDParserRuleCall_2; }
	}
	public class ValidIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ValidID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ValidID:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	public class TerminologyGraphKindElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyGraphKind");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cOpenWorldDefinitionsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cOpenWorldDefinitionsOpenKeyword_0_0 = (Keyword)cOpenWorldDefinitionsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cClosedWorldDesignationsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cClosedWorldDesignationsClosedKeyword_1_0 = (Keyword)cClosedWorldDesignationsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TerminologyGraphKind:
		//	OpenWorldDefinitions='open' |
		//	ClosedWorldDesignations='closed';
		public EnumRule getRule() { return rule; }
		
		//OpenWorldDefinitions='open' | ClosedWorldDesignations='closed'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//OpenWorldDefinitions='open'
		public EnumLiteralDeclaration getOpenWorldDefinitionsEnumLiteralDeclaration_0() { return cOpenWorldDefinitionsEnumLiteralDeclaration_0; }
		
		//'open'
		public Keyword getOpenWorldDefinitionsOpenKeyword_0_0() { return cOpenWorldDefinitionsOpenKeyword_0_0; }
		
		//ClosedWorldDesignations='closed'
		public EnumLiteralDeclaration getClosedWorldDesignationsEnumLiteralDeclaration_1() { return cClosedWorldDesignationsEnumLiteralDeclaration_1; }
		
		//'closed'
		public Keyword getClosedWorldDesignationsClosedKeyword_1_0() { return cClosedWorldDesignationsClosedKeyword_1_0; }
	}
	
	private final TerminologyExtentElements pTerminologyExtent;
	private final AnnotationPropertyElements pAnnotationProperty;
	private final AnnotationElements pAnnotation;
	private final TerminologyBoxElements pTerminologyBox;
	private final TerminologyGraphElements pTerminologyGraph;
	private final BundleElements pBundle;
	private final TerminologyBoxAxiomElements pTerminologyBoxAxiom;
	private final TerminologyBoxStatementElements pTerminologyBoxStatement;
	private final TermElements pTerm;
	private final AtomicEntityElements pAtomicEntity;
	private final EntityRelationshipElements pEntityRelationship;
	private final DatatypeElements pDatatype;
	private final ScalarDataRangeElements pScalarDataRange;
	private final RestrictedDataRangeElements pRestrictedDataRange;
	private final DataRelationshipElements pDataRelationship;
	private final AxiomElements pAxiom;
	private final TermAxiomElements pTermAxiom;
	private final EntityRestrictionAxiomElements pEntityRestrictionAxiom;
	private final EntityScalarDataPropertyRestrictionAxiomElements pEntityScalarDataPropertyRestrictionAxiom;
	private final SpecializationAxiomElements pSpecializationAxiom;
	private final TerminologyBundleStatementElements pTerminologyBundleStatement;
	private final TerminologyBundleAxiomElements pTerminologyBundleAxiom;
	private final ConceptTreeDisjunctionElements pConceptTreeDisjunction;
	private final TerminologyGraphKindElements eTerminologyGraphKind;
	private final AspectElements pAspect;
	private final ConceptElements pConcept;
	private final ReifiedRelationshipElements pReifiedRelationship;
	private final UnreifiedRelationshipElements pUnreifiedRelationship;
	private final ScalarElements pScalar;
	private final StructureElements pStructure;
	private final EntityStructuredDataPropertyElements pEntityStructuredDataProperty;
	private final EntityScalarDataPropertyElements pEntityScalarDataProperty;
	private final StructuredDataPropertyElements pStructuredDataProperty;
	private final ScalarDataPropertyElements pScalarDataProperty;
	private final AnonymousConceptTaxonomyAxiomElements pAnonymousConceptTaxonomyAxiom;
	private final RootConceptTaxonomyAxiomElements pRootConceptTaxonomyAxiom;
	private final SpecificDisjointConceptAxiomElements pSpecificDisjointConceptAxiom;
	private final BundledTerminologyAxiomElements pBundledTerminologyAxiom;
	private final ConceptDesignationTerminologyAxiomElements pConceptDesignationTerminologyAxiom;
	private final TerminologyExtensionAxiomElements pTerminologyExtensionAxiom;
	private final TerminologyNestingAxiomElements pTerminologyNestingAxiom;
	private final EntityExistentialRestrictionAxiomElements pEntityExistentialRestrictionAxiom;
	private final EntityUniversalRestrictionAxiomElements pEntityUniversalRestrictionAxiom;
	private final AspectSpecializationAxiomElements pAspectSpecializationAxiom;
	private final ConceptSpecializationAxiomElements pConceptSpecializationAxiom;
	private final ReifiedRelationshipSpecializationAxiomElements pReifiedRelationshipSpecializationAxiom;
	private final EntityScalarDataPropertyExistentialRestrictionAxiomElements pEntityScalarDataPropertyExistentialRestrictionAxiom;
	private final EntityScalarDataPropertyParticularRestrictionAxiomElements pEntityScalarDataPropertyParticularRestrictionAxiom;
	private final EntityScalarDataPropertyUniversalRestrictionAxiomElements pEntityScalarDataPropertyUniversalRestrictionAxiom;
	private final BinaryScalarRestrictionElements pBinaryScalarRestriction;
	private final IRIScalarRestrictionElements pIRIScalarRestriction;
	private final NumericScalarRestrictionElements pNumericScalarRestriction;
	private final PlainLiteralScalarRestrictionElements pPlainLiteralScalarRestriction;
	private final ScalarOneOfRestrictionElements pScalarOneOfRestriction;
	private final ScalarOneOfLiteralAxiomElements pScalarOneOfLiteralAxiom;
	private final StringScalarRestrictionElements pStringScalarRestriction;
	private final SynonymScalarRestrictionElements pSynonymScalarRestriction;
	private final TimeScalarRestrictionElements pTimeScalarRestriction;
	private final ReferenceElements pReference;
	private final QNAMEElements pQNAME;
	private final ABBREV_IRIElements pABBREV_IRI;
	private final ValidIDElements pValidID;
	private final TerminalRule tANNOTATION_PROPERTY_TOKEN;
	private final TerminalRule tANNOTATION_TOKEN;
	private final TerminalRule tTERMINOLOGY_GRAPH_TOKEN;
	private final TerminalRule tBUNDLE_TOKEN;
	private final TerminalRule tKIND_TOKEN;
	private final TerminalRule tASPECT_TOKEN;
	private final TerminalRule tABSTRACT_TOKEN;
	private final TerminalRule tCONCEPT_TOKEN;
	private final TerminalRule tREIFIED_RELATIONSHIP_TOKEN;
	private final TerminalRule tUNREIFIED_RELATIONSHIP_TOKEN;
	private final TerminalRule tFUNCTIONAL_TOKEN;
	private final TerminalRule tINVERSE_FUNCTIONAL_TOKEN;
	private final TerminalRule tESSENTIAL_TOKEN;
	private final TerminalRule tINVERSE_ESSENTIAL_TOKEN;
	private final TerminalRule tSYMMETRIC_TOKEN;
	private final TerminalRule tASYMMETRIC_TOKEN;
	private final TerminalRule tREFLEXIVE_TOKEN;
	private final TerminalRule tIRREFLEXIVE_TOKEN;
	private final TerminalRule tTRANSITIVE_TOKEN;
	private final TerminalRule tUNREIFIED_TOKEN;
	private final TerminalRule tINVERSE_TOKEN;
	private final TerminalRule tSOURCE_TOKEN;
	private final TerminalRule tTARGET_TOKEN;
	private final TerminalRule tSCALAR_TOKEN;
	private final TerminalRule tSTRUCTURE_TOKEN;
	private final TerminalRule tDOMAIN_TOKEN;
	private final TerminalRule tRANGE_TOKEN;
	private final TerminalRule tROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN;
	private final TerminalRule tSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN;
	private final TerminalRule tANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN;
	private final TerminalRule tBUNDLED_TERMINOLOGY_AXIOM_TOKEN;
	private final TerminalRule tCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN;
	private final TerminalRule tTERMINOLOGY_NESTING_AXIOM_TOKEN;
	private final TerminalRule tTERMINOLOGY_EXTENSION_AXIOM_TOKEN;
	private final TerminalRule tENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN;
	private final TerminalRule tENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN;
	private final TerminalRule tCONCEPT_SPECIALIZATION_AXIOM_TOKEN;
	private final TerminalRule tASPECT_SPECIALIZATION_AXIOM_TOKEN;
	private final TerminalRule tREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN;
	private final TerminalRule tENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN;
	private final TerminalRule tENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN;
	private final TerminalRule tENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN;
	private final TerminalRule tSYNONYM_SCALAR_RESTRICTION_TOKEN;
	private final TerminalRule tNUMERIC_SCALAR_RESTRICTION_TOKEN;
	private final TerminalRule tSTRING_SCALAR_RESTRICTION_TOKEN;
	private final TerminalRule tPLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN;
	private final TerminalRule tBINARY_SCALAR_RESTRICTION_TOKEN;
	private final TerminalRule tIRI_SCALAR_RESTRICTION_TOKEN;
	private final TerminalRule tTIME_SCALAR_RESTRICTION_TOKEN;
	private final TerminalRule tSCALAR_ONE_OF_RESTRICTION_TOKEN;
	private final TerminalRule tSCALAR_ONE_OF_LITERAL_AXIOM_TOKEN;
	private final TerminalRule tLCURLY;
	private final TerminalRule tRCURLY;
	private final TerminalRule tEQUAL;
	private final TerminalRule tSTRING;
	private final TerminalRule tIRI;
	private final TerminalRule tID;
	private final TerminalRule tUUID;
	private final TerminalRule tHEX_12DIGITS;
	private final TerminalRule tHEX_8DIGITS;
	private final TerminalRule tHEX_4DIGITS;
	private final TerminalRule tHEX_DIGIT;
	private final TerminalRule tHEX;
	private final TerminalRule tINT;
	private final TerminalRule tDECIMAL;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public OntologicalModelingLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTerminologyExtent = new TerminologyExtentElements();
		this.pAnnotationProperty = new AnnotationPropertyElements();
		this.pAnnotation = new AnnotationElements();
		this.pTerminologyBox = new TerminologyBoxElements();
		this.pTerminologyGraph = new TerminologyGraphElements();
		this.pBundle = new BundleElements();
		this.pTerminologyBoxAxiom = new TerminologyBoxAxiomElements();
		this.pTerminologyBoxStatement = new TerminologyBoxStatementElements();
		this.pTerm = new TermElements();
		this.pAtomicEntity = new AtomicEntityElements();
		this.pEntityRelationship = new EntityRelationshipElements();
		this.pDatatype = new DatatypeElements();
		this.pScalarDataRange = new ScalarDataRangeElements();
		this.pRestrictedDataRange = new RestrictedDataRangeElements();
		this.pDataRelationship = new DataRelationshipElements();
		this.pAxiom = new AxiomElements();
		this.pTermAxiom = new TermAxiomElements();
		this.pEntityRestrictionAxiom = new EntityRestrictionAxiomElements();
		this.pEntityScalarDataPropertyRestrictionAxiom = new EntityScalarDataPropertyRestrictionAxiomElements();
		this.pSpecializationAxiom = new SpecializationAxiomElements();
		this.pTerminologyBundleStatement = new TerminologyBundleStatementElements();
		this.pTerminologyBundleAxiom = new TerminologyBundleAxiomElements();
		this.pConceptTreeDisjunction = new ConceptTreeDisjunctionElements();
		this.eTerminologyGraphKind = new TerminologyGraphKindElements();
		this.pAspect = new AspectElements();
		this.pConcept = new ConceptElements();
		this.pReifiedRelationship = new ReifiedRelationshipElements();
		this.pUnreifiedRelationship = new UnreifiedRelationshipElements();
		this.pScalar = new ScalarElements();
		this.pStructure = new StructureElements();
		this.pEntityStructuredDataProperty = new EntityStructuredDataPropertyElements();
		this.pEntityScalarDataProperty = new EntityScalarDataPropertyElements();
		this.pStructuredDataProperty = new StructuredDataPropertyElements();
		this.pScalarDataProperty = new ScalarDataPropertyElements();
		this.pAnonymousConceptTaxonomyAxiom = new AnonymousConceptTaxonomyAxiomElements();
		this.pRootConceptTaxonomyAxiom = new RootConceptTaxonomyAxiomElements();
		this.pSpecificDisjointConceptAxiom = new SpecificDisjointConceptAxiomElements();
		this.pBundledTerminologyAxiom = new BundledTerminologyAxiomElements();
		this.pConceptDesignationTerminologyAxiom = new ConceptDesignationTerminologyAxiomElements();
		this.pTerminologyExtensionAxiom = new TerminologyExtensionAxiomElements();
		this.pTerminologyNestingAxiom = new TerminologyNestingAxiomElements();
		this.pEntityExistentialRestrictionAxiom = new EntityExistentialRestrictionAxiomElements();
		this.pEntityUniversalRestrictionAxiom = new EntityUniversalRestrictionAxiomElements();
		this.pAspectSpecializationAxiom = new AspectSpecializationAxiomElements();
		this.pConceptSpecializationAxiom = new ConceptSpecializationAxiomElements();
		this.pReifiedRelationshipSpecializationAxiom = new ReifiedRelationshipSpecializationAxiomElements();
		this.pEntityScalarDataPropertyExistentialRestrictionAxiom = new EntityScalarDataPropertyExistentialRestrictionAxiomElements();
		this.pEntityScalarDataPropertyParticularRestrictionAxiom = new EntityScalarDataPropertyParticularRestrictionAxiomElements();
		this.pEntityScalarDataPropertyUniversalRestrictionAxiom = new EntityScalarDataPropertyUniversalRestrictionAxiomElements();
		this.pBinaryScalarRestriction = new BinaryScalarRestrictionElements();
		this.pIRIScalarRestriction = new IRIScalarRestrictionElements();
		this.pNumericScalarRestriction = new NumericScalarRestrictionElements();
		this.pPlainLiteralScalarRestriction = new PlainLiteralScalarRestrictionElements();
		this.pScalarOneOfRestriction = new ScalarOneOfRestrictionElements();
		this.pScalarOneOfLiteralAxiom = new ScalarOneOfLiteralAxiomElements();
		this.pStringScalarRestriction = new StringScalarRestrictionElements();
		this.pSynonymScalarRestriction = new SynonymScalarRestrictionElements();
		this.pTimeScalarRestriction = new TimeScalarRestrictionElements();
		this.pReference = new ReferenceElements();
		this.pQNAME = new QNAMEElements();
		this.pABBREV_IRI = new ABBREV_IRIElements();
		this.pValidID = new ValidIDElements();
		this.tANNOTATION_PROPERTY_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ANNOTATION_PROPERTY_TOKEN");
		this.tANNOTATION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ANNOTATION_TOKEN");
		this.tTERMINOLOGY_GRAPH_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TERMINOLOGY_GRAPH_TOKEN");
		this.tBUNDLE_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.BUNDLE_TOKEN");
		this.tKIND_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.KIND_TOKEN");
		this.tASPECT_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ASPECT_TOKEN");
		this.tABSTRACT_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ABSTRACT_TOKEN");
		this.tCONCEPT_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.CONCEPT_TOKEN");
		this.tREIFIED_RELATIONSHIP_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.REIFIED_RELATIONSHIP_TOKEN");
		this.tUNREIFIED_RELATIONSHIP_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.UNREIFIED_RELATIONSHIP_TOKEN");
		this.tFUNCTIONAL_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.FUNCTIONAL_TOKEN");
		this.tINVERSE_FUNCTIONAL_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_FUNCTIONAL_TOKEN");
		this.tESSENTIAL_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ESSENTIAL_TOKEN");
		this.tINVERSE_ESSENTIAL_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_ESSENTIAL_TOKEN");
		this.tSYMMETRIC_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SYMMETRIC_TOKEN");
		this.tASYMMETRIC_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ASYMMETRIC_TOKEN");
		this.tREFLEXIVE_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.REFLEXIVE_TOKEN");
		this.tIRREFLEXIVE_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.IRREFLEXIVE_TOKEN");
		this.tTRANSITIVE_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TRANSITIVE_TOKEN");
		this.tUNREIFIED_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.UNREIFIED_TOKEN");
		this.tINVERSE_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_TOKEN");
		this.tSOURCE_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SOURCE_TOKEN");
		this.tTARGET_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TARGET_TOKEN");
		this.tSCALAR_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SCALAR_TOKEN");
		this.tSTRUCTURE_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.STRUCTURE_TOKEN");
		this.tDOMAIN_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.DOMAIN_TOKEN");
		this.tRANGE_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.RANGE_TOKEN");
		this.tROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN");
		this.tSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN");
		this.tANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN");
		this.tBUNDLED_TERMINOLOGY_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.BUNDLED_TERMINOLOGY_AXIOM_TOKEN");
		this.tCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN");
		this.tTERMINOLOGY_NESTING_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TERMINOLOGY_NESTING_AXIOM_TOKEN");
		this.tTERMINOLOGY_EXTENSION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TERMINOLOGY_EXTENSION_AXIOM_TOKEN");
		this.tENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN");
		this.tENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN");
		this.tCONCEPT_SPECIALIZATION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.CONCEPT_SPECIALIZATION_AXIOM_TOKEN");
		this.tASPECT_SPECIALIZATION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ASPECT_SPECIALIZATION_AXIOM_TOKEN");
		this.tREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN");
		this.tENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN");
		this.tENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN");
		this.tENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN");
		this.tSYNONYM_SCALAR_RESTRICTION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SYNONYM_SCALAR_RESTRICTION_TOKEN");
		this.tNUMERIC_SCALAR_RESTRICTION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.NUMERIC_SCALAR_RESTRICTION_TOKEN");
		this.tSTRING_SCALAR_RESTRICTION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.STRING_SCALAR_RESTRICTION_TOKEN");
		this.tPLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN");
		this.tBINARY_SCALAR_RESTRICTION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.BINARY_SCALAR_RESTRICTION_TOKEN");
		this.tIRI_SCALAR_RESTRICTION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.IRI_SCALAR_RESTRICTION_TOKEN");
		this.tTIME_SCALAR_RESTRICTION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.TIME_SCALAR_RESTRICTION_TOKEN");
		this.tSCALAR_ONE_OF_RESTRICTION_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SCALAR_ONE_OF_RESTRICTION_TOKEN");
		this.tSCALAR_ONE_OF_LITERAL_AXIOM_TOKEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN");
		this.tLCURLY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.LCURLY");
		this.tRCURLY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.RCURLY");
		this.tEQUAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.EQUAL");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
		this.tIRI = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
		this.tUUID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.UUID");
		this.tHEX_12DIGITS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.HEX_12DIGITS");
		this.tHEX_8DIGITS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.HEX_8DIGITS");
		this.tHEX_4DIGITS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.HEX_4DIGITS");
		this.tHEX_DIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.HEX_DIGIT");
		this.tHEX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.HEX");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
		this.tDECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.DECIMAL");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "jpl.imce.oml.specification.OntologicalModelingLanguage.WS");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("jpl.imce.oml.specification.OntologicalModelingLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TerminologyExtent:
	//	{TerminologyExtent} annotationProperties+=AnnotationProperty*
	//	terminologyGraphs+=TerminologyGraph*
	//	bundles+=Bundle*;
	public TerminologyExtentElements getTerminologyExtentAccess() {
		return pTerminologyExtent;
	}
	
	public ParserRule getTerminologyExtentRule() {
		return getTerminologyExtentAccess().getRule();
	}
	
	//// syntax of Annotation & AnnotationProperties
	//AnnotationProperty:
	//	ANNOTATION_PROPERTY_TOKEN abbrevIRI=ABBREV_IRI EQUAL iri=IRI;
	public AnnotationPropertyElements getAnnotationPropertyAccess() {
		return pAnnotationProperty;
	}
	
	public ParserRule getAnnotationPropertyRule() {
		return getAnnotationPropertyAccess().getRule();
	}
	
	/// *
	// * Note that the concrete syntax for the Annotation.subject is defined implicitly
	// * in the sense that the subject of an Annotation is always the preceding
	// * TerminologyThing or the subject of the preceding Annotation.
	// * 
	// * For example, the following shows the concrete syntax for 2 Concepts, Foo and Bar
	// * and of 3 Annotations; the first two Annotations have Foo as their subject because 
	// * Foo is the first preceding TerminologyThing; the third Annotation has Bar as its subject
	// * because it appears after the TerminologyThing Bar.
	// * 
	// * concept Foo
	// * @rdfs:label = "foo"
	// * @dc:description = "A Foo is ..."
	// * 
	// * concept Bar
	// * @rdfs:label = "bar
	// * 
	// * @see jpl.imce.oml.specification.linking.OMLLinkingService
	// * / Annotation:
	//	ANNOTATION_TOKEN property=[AnnotationProperty|ABBREV_IRI] EQUAL value=STRING;
	public AnnotationElements getAnnotationAccess() {
		return pAnnotation;
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}
	
	//// 2 TerminologyBoxes
	//TerminologyBox:
	//	Bundle | TerminologyGraph;
	public TerminologyBoxElements getTerminologyBoxAccess() {
		return pTerminologyBox;
	}
	
	public ParserRule getTerminologyBoxRule() {
		return getTerminologyBoxAccess().getRule();
	}
	
	//TerminologyGraph:
	//	kind=TerminologyGraphKind TERMINOLOGY_GRAPH_TOKEN iri=IRI LCURLY (annotations+=Annotation |
	//	terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement)*
	//	RCURLY;
	public TerminologyGraphElements getTerminologyGraphAccess() {
		return pTerminologyGraph;
	}
	
	public ParserRule getTerminologyGraphRule() {
		return getTerminologyGraphAccess().getRule();
	}
	
	//Bundle:
	//	kind=TerminologyGraphKind BUNDLE_TOKEN iri=IRI LCURLY (annotations+=Annotation |
	//	terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement |
	//	bundleStatements+=TerminologyBundleStatement | terminologyBundleAxioms+=TerminologyBundleAxiom)*
	//	RCURLY;
	public BundleElements getBundleAccess() {
		return pBundle;
	}
	
	public ParserRule getBundleRule() {
		return getBundleAccess().getRule();
	}
	
	//TerminologyBoxAxiom:
	//	ConceptDesignationTerminologyAxiom | TerminologyExtensionAxiom | TerminologyNestingAxiom;
	public TerminologyBoxAxiomElements getTerminologyBoxAxiomAccess() {
		return pTerminologyBoxAxiom;
	}
	
	public ParserRule getTerminologyBoxAxiomRule() {
		return getTerminologyBoxAxiomAccess().getRule();
	}
	
	//TerminologyBoxStatement:
	//	Axiom | Term;
	public TerminologyBoxStatementElements getTerminologyBoxStatementAccess() {
		return pTerminologyBoxStatement;
	}
	
	public ParserRule getTerminologyBoxStatementRule() {
		return getTerminologyBoxStatementAccess().getRule();
	}
	
	//Term:
	//	AtomicEntity | EntityRelationship | Datatype | DataRelationship;
	public TermElements getTermAccess() {
		return pTerm;
	}
	
	public ParserRule getTermRule() {
		return getTermAccess().getRule();
	}
	
	//AtomicEntity Entity:
	//	Aspect | Concept
	public AtomicEntityElements getAtomicEntityAccess() {
		return pAtomicEntity;
	}
	
	public ParserRule getAtomicEntityRule() {
		return getAtomicEntityAccess().getRule();
	}
	
	//EntityRelationship:
	//	ReifiedRelationship | UnreifiedRelationship;
	public EntityRelationshipElements getEntityRelationshipAccess() {
		return pEntityRelationship;
	}
	
	public ParserRule getEntityRelationshipRule() {
		return getEntityRelationshipAccess().getRule();
	}
	
	//Datatype:
	//	ScalarDataRange | Structure;
	public DatatypeElements getDatatypeAccess() {
		return pDatatype;
	}
	
	public ParserRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}
	
	//ScalarDataRange DataRange:
	//	Scalar | RestrictedDataRange
	public ScalarDataRangeElements getScalarDataRangeAccess() {
		return pScalarDataRange;
	}
	
	public ParserRule getScalarDataRangeRule() {
		return getScalarDataRangeAccess().getRule();
	}
	
	//RestrictedDataRange:
	//	BinaryScalarRestriction | IRIScalarRestriction | NumericScalarRestriction | PlainLiteralScalarRestriction |
	//	ScalarOneOfRestriction | StringScalarRestriction | SynonymScalarRestriction | TimeScalarRestriction;
	public RestrictedDataRangeElements getRestrictedDataRangeAccess() {
		return pRestrictedDataRange;
	}
	
	public ParserRule getRestrictedDataRangeRule() {
		return getRestrictedDataRangeAccess().getRule();
	}
	
	//DataRelationship:
	//	EntityStructuredDataProperty | EntityScalarDataProperty | StructuredDataProperty | ScalarDataProperty;
	public DataRelationshipElements getDataRelationshipAccess() {
		return pDataRelationship;
	}
	
	public ParserRule getDataRelationshipRule() {
		return getDataRelationshipAccess().getRule();
	}
	
	//Axiom:
	//	ScalarOneOfLiteralAxiom | TermAxiom;
	public AxiomElements getAxiomAccess() {
		return pAxiom;
	}
	
	public ParserRule getAxiomRule() {
		return getAxiomAccess().getRule();
	}
	
	//TermAxiom:
	//	EntityRestrictionAxiom | EntityScalarDataPropertyRestrictionAxiom | SpecializationAxiom;
	public TermAxiomElements getTermAxiomAccess() {
		return pTermAxiom;
	}
	
	public ParserRule getTermAxiomRule() {
		return getTermAxiomAccess().getRule();
	}
	
	//EntityRestrictionAxiom:
	//	EntityExistentialRestrictionAxiom | EntityUniversalRestrictionAxiom;
	public EntityRestrictionAxiomElements getEntityRestrictionAxiomAccess() {
		return pEntityRestrictionAxiom;
	}
	
	public ParserRule getEntityRestrictionAxiomRule() {
		return getEntityRestrictionAxiomAccess().getRule();
	}
	
	//EntityScalarDataPropertyRestrictionAxiom:
	//	EntityScalarDataPropertyExistentialRestrictionAxiom | EntityScalarDataPropertyParticularRestrictionAxiom |
	//	EntityScalarDataPropertyUniversalRestrictionAxiom;
	public EntityScalarDataPropertyRestrictionAxiomElements getEntityScalarDataPropertyRestrictionAxiomAccess() {
		return pEntityScalarDataPropertyRestrictionAxiom;
	}
	
	public ParserRule getEntityScalarDataPropertyRestrictionAxiomRule() {
		return getEntityScalarDataPropertyRestrictionAxiomAccess().getRule();
	}
	
	//SpecializationAxiom:
	//	ConceptSpecializationAxiom | AspectSpecializationAxiom | ReifiedRelationshipSpecializationAxiom;
	public SpecializationAxiomElements getSpecializationAxiomAccess() {
		return pSpecializationAxiom;
	}
	
	public ParserRule getSpecializationAxiomRule() {
		return getSpecializationAxiomAccess().getRule();
	}
	
	//TerminologyBundleStatement:
	//	AnonymousConceptTaxonomyAxiom | RootConceptTaxonomyAxiom | SpecificDisjointConceptAxiom;
	public TerminologyBundleStatementElements getTerminologyBundleStatementAccess() {
		return pTerminologyBundleStatement;
	}
	
	public ParserRule getTerminologyBundleStatementRule() {
		return getTerminologyBundleStatementAccess().getRule();
	}
	
	//TerminologyBundleAxiom:
	//	BundledTerminologyAxiom;
	public TerminologyBundleAxiomElements getTerminologyBundleAxiomAccess() {
		return pTerminologyBundleAxiom;
	}
	
	public ParserRule getTerminologyBundleAxiomRule() {
		return getTerminologyBundleAxiomAccess().getRule();
	}
	
	//ConceptTreeDisjunction:
	//	AnonymousConceptTaxonomyAxiom | RootConceptTaxonomyAxiom;
	public ConceptTreeDisjunctionElements getConceptTreeDisjunctionAccess() {
		return pConceptTreeDisjunction;
	}
	
	public ParserRule getConceptTreeDisjunctionRule() {
		return getConceptTreeDisjunctionAccess().getRule();
	}
	
	//enum TerminologyGraphKind:
	//	OpenWorldDefinitions='open' |
	//	ClosedWorldDesignations='closed';
	public TerminologyGraphKindElements getTerminologyGraphKindAccess() {
		return eTerminologyGraphKind;
	}
	
	public EnumRule getTerminologyGraphKindRule() {
		return getTerminologyGraphKindAccess().getRule();
	}
	
	//// 2 Atomic Entity Terms
	//Aspect:
	//	ASPECT_TOKEN name=ID;
	public AspectElements getAspectAccess() {
		return pAspect;
	}
	
	public ParserRule getAspectRule() {
		return getAspectAccess().getRule();
	}
	
	//Concept:
	//	isAbstract?=ABSTRACT_TOKEN? CONCEPT_TOKEN name=ID;
	public ConceptElements getConceptAccess() {
		return pConcept;
	}
	
	public ParserRule getConceptRule() {
		return getConceptAccess().getRule();
	}
	
	//// 2 EntityRelationship Terms
	//ReifiedRelationship:
	//	isAbstract?=ABSTRACT_TOKEN? REIFIED_RELATIONSHIP_TOKEN name=ID LCURLY
	//	isFunctional?=FUNCTIONAL_TOKEN?
	//	isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN?
	//	isEssential?=ESSENTIAL_TOKEN?
	//	isInverseEssential?=INVERSE_ESSENTIAL_TOKEN?
	//	isSymmetric?=SYMMETRIC_TOKEN?
	//	isAsymmetric?=ASYMMETRIC_TOKEN?
	//	isReflexive?=REFLEXIVE_TOKEN?
	//	isIrreflexive?=IRREFLEXIVE_TOKEN?
	//	isTransitive?=TRANSITIVE_TOKEN?
	//	UNREIFIED_TOKEN EQUAL unreifiedPropertyName=ID (INVERSE_TOKEN EQUAL unreifiedInversePropertyName=ID)?
	//	SOURCE_TOKEN EQUAL source=[Entity|Reference] TARGET_TOKEN EQUAL target=[Entity|Reference] RCURLY;
	public ReifiedRelationshipElements getReifiedRelationshipAccess() {
		return pReifiedRelationship;
	}
	
	public ParserRule getReifiedRelationshipRule() {
		return getReifiedRelationshipAccess().getRule();
	}
	
	//UnreifiedRelationship:
	//	UNREIFIED_RELATIONSHIP_TOKEN name=ID LCURLY
	//	isFunctional?=FUNCTIONAL_TOKEN?
	//	isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN?
	//	isEssential?=ESSENTIAL_TOKEN?
	//	isInverseEssential?=INVERSE_ESSENTIAL_TOKEN?
	//	isSymmetric?=SYMMETRIC_TOKEN?
	//	isAsymmetric?=ASYMMETRIC_TOKEN?
	//	isReflexive?=REFLEXIVE_TOKEN?
	//	isIrreflexive?=IRREFLEXIVE_TOKEN?
	//	isTransitive?=TRANSITIVE_TOKEN?
	//	SOURCE_TOKEN EQUAL source=[Entity|Reference] TARGET_TOKEN EQUAL target=[Entity|Reference] RCURLY;
	public UnreifiedRelationshipElements getUnreifiedRelationshipAccess() {
		return pUnreifiedRelationship;
	}
	
	public ParserRule getUnreifiedRelationshipRule() {
		return getUnreifiedRelationshipAccess().getRule();
	}
	
	//// 2 Datatypes
	//Scalar:
	//	SCALAR_TOKEN name=ID;
	public ScalarElements getScalarAccess() {
		return pScalar;
	}
	
	public ParserRule getScalarRule() {
		return getScalarAccess().getRule();
	}
	
	//Structure:
	//	STRUCTURE_TOKEN name=ID;
	public StructureElements getStructureAccess() {
		return pStructure;
	}
	
	public ParserRule getStructureRule() {
		return getStructureAccess().getRule();
	}
	
	//// 4 DataRelationship Terms
	//EntityStructuredDataProperty:
	//	'entityStructuredDataProperty' name=ID LCURLY
	//	DOMAIN_TOKEN domain=[Entity|Reference] RANGE_TOKEN range=[Structure|Reference] RCURLY;
	public EntityStructuredDataPropertyElements getEntityStructuredDataPropertyAccess() {
		return pEntityStructuredDataProperty;
	}
	
	public ParserRule getEntityStructuredDataPropertyRule() {
		return getEntityStructuredDataPropertyAccess().getRule();
	}
	
	//EntityScalarDataProperty:
	//	'entityScalarDataProperty' name=ID LCURLY
	//	DOMAIN_TOKEN domain=[Entity|Reference] RANGE_TOKEN range=[DataRange|Reference] RCURLY;
	public EntityScalarDataPropertyElements getEntityScalarDataPropertyAccess() {
		return pEntityScalarDataProperty;
	}
	
	public ParserRule getEntityScalarDataPropertyRule() {
		return getEntityScalarDataPropertyAccess().getRule();
	}
	
	//StructuredDataProperty:
	//	'structuredDataProperty' name=ID LCURLY
	//	DOMAIN_TOKEN domain=[Structure|Reference] RANGE_TOKEN range=[Structure|Reference] RCURLY;
	public StructuredDataPropertyElements getStructuredDataPropertyAccess() {
		return pStructuredDataProperty;
	}
	
	public ParserRule getStructuredDataPropertyRule() {
		return getStructuredDataPropertyAccess().getRule();
	}
	
	//ScalarDataProperty:
	//	'scalarDataProperty' name=ID LCURLY
	//	DOMAIN_TOKEN domain=[Structure|Reference] RANGE_TOKEN range=[DataRange|Reference] RCURLY;
	public ScalarDataPropertyElements getScalarDataPropertyAccess() {
		return pScalarDataProperty;
	}
	
	public ParserRule getScalarDataPropertyRule() {
		return getScalarDataPropertyAccess().getRule();
	}
	
	//// ConceptTreeDisjunctions and DisjointUnionOfConceptsAxioms
	//AnonymousConceptTaxonomyAxiom:
	//	ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN
	//	LCURLY
	//	'disjointTaxonomyParent' disjointTaxonomyParent=[ConceptTreeDisjunction|Reference] RCURLY;
	public AnonymousConceptTaxonomyAxiomElements getAnonymousConceptTaxonomyAxiomAccess() {
		return pAnonymousConceptTaxonomyAxiom;
	}
	
	public ParserRule getAnonymousConceptTaxonomyAxiomRule() {
		return getAnonymousConceptTaxonomyAxiomAccess().getRule();
	}
	
	//RootConceptTaxonomyAxiom:
	//	ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN
	//	LCURLY
	//	'root' root=[Concept|Reference] RCURLY;
	public RootConceptTaxonomyAxiomElements getRootConceptTaxonomyAxiomAccess() {
		return pRootConceptTaxonomyAxiom;
	}
	
	public ParserRule getRootConceptTaxonomyAxiomRule() {
		return getRootConceptTaxonomyAxiomAccess().getRule();
	}
	
	//SpecificDisjointConceptAxiom:
	//	SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN
	//	LCURLY
	//	'disjointTaxonomyParent' disjointTaxonomyParent=[ConceptTreeDisjunction|Reference]
	//	'disjointLeaf' disjointLeaf=[Concept|Reference] RCURLY;
	public SpecificDisjointConceptAxiomElements getSpecificDisjointConceptAxiomAccess() {
		return pSpecificDisjointConceptAxiom;
	}
	
	public ParserRule getSpecificDisjointConceptAxiomRule() {
		return getSpecificDisjointConceptAxiomAccess().getRule();
	}
	
	//// 1 TerminologyBundleAxiom
	//BundledTerminologyAxiom:
	//	BUNDLED_TERMINOLOGY_AXIOM_TOKEN
	//	LCURLY
	//	'bundledTerminology' bundledTerminology=[TerminologyBox|Reference] RCURLY;
	public BundledTerminologyAxiomElements getBundledTerminologyAxiomAccess() {
		return pBundledTerminologyAxiom;
	}
	
	public ParserRule getBundledTerminologyAxiomRule() {
		return getBundledTerminologyAxiomAccess().getRule();
	}
	
	//// 3 TerminologyBoxAxioms
	//ConceptDesignationTerminologyAxiom:
	//	CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN
	//	LCURLY
	//	'designatedTerminology' designatedTerminology=[TerminologyBox|Reference]
	//	'designatedConcept' designatedConcept=[Concept|Reference] RCURLY;
	public ConceptDesignationTerminologyAxiomElements getConceptDesignationTerminologyAxiomAccess() {
		return pConceptDesignationTerminologyAxiom;
	}
	
	public ParserRule getConceptDesignationTerminologyAxiomRule() {
		return getConceptDesignationTerminologyAxiomAccess().getRule();
	}
	
	//TerminologyExtensionAxiom:
	//	TERMINOLOGY_EXTENSION_AXIOM_TOKEN extendedTerminology=[TerminologyBox|Reference];
	public TerminologyExtensionAxiomElements getTerminologyExtensionAxiomAccess() {
		return pTerminologyExtensionAxiom;
	}
	
	public ParserRule getTerminologyExtensionAxiomRule() {
		return getTerminologyExtensionAxiomAccess().getRule();
	}
	
	//TerminologyNestingAxiom:
	//	TERMINOLOGY_NESTING_AXIOM_TOKEN
	//	LCURLY
	//	'nestingTerminology' nestingTerminology=[TerminologyBox|Reference]
	//	'nestingContext' nestingContext=[Concept|Reference] RCURLY;
	public TerminologyNestingAxiomElements getTerminologyNestingAxiomAccess() {
		return pTerminologyNestingAxiom;
	}
	
	public ParserRule getTerminologyNestingAxiomRule() {
		return getTerminologyNestingAxiomAccess().getRule();
	}
	
	//// 2 EntityRestrictionAxioms
	//EntityExistentialRestrictionAxiom:
	//	ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
	//	LCURLY
	//	'restrictedRelation' restrictedRelation=[ReifiedRelationship|Reference]
	//	'restrictedRange' restrictedRange=[Entity|Reference]
	//	'restrictedDomain' restrictedDomain=[Entity|Reference] RCURLY;
	public EntityExistentialRestrictionAxiomElements getEntityExistentialRestrictionAxiomAccess() {
		return pEntityExistentialRestrictionAxiom;
	}
	
	public ParserRule getEntityExistentialRestrictionAxiomRule() {
		return getEntityExistentialRestrictionAxiomAccess().getRule();
	}
	
	//EntityUniversalRestrictionAxiom:
	//	ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
	//	LCURLY
	//	'restrictedRelation' restrictedRelation=[ReifiedRelationship|Reference]
	//	'restrictedRange' restrictedRange=[Entity|Reference]
	//	'restrictedDomain' restrictedDomain=[Entity|Reference] RCURLY;
	public EntityUniversalRestrictionAxiomElements getEntityUniversalRestrictionAxiomAccess() {
		return pEntityUniversalRestrictionAxiom;
	}
	
	public ParserRule getEntityUniversalRestrictionAxiomRule() {
		return getEntityUniversalRestrictionAxiomAccess().getRule();
	}
	
	//// 3 SpecializationAxioms
	//AspectSpecializationAxiom:
	//	subEntity=[Entity|Reference] ASPECT_SPECIALIZATION_AXIOM_TOKEN superAspect=[Aspect|Reference];
	public AspectSpecializationAxiomElements getAspectSpecializationAxiomAccess() {
		return pAspectSpecializationAxiom;
	}
	
	public ParserRule getAspectSpecializationAxiomRule() {
		return getAspectSpecializationAxiomAccess().getRule();
	}
	
	//ConceptSpecializationAxiom:
	//	CONCEPT_SPECIALIZATION_AXIOM_TOKEN
	//	LCURLY
	//	'subConcept' subConcept=[Concept|Reference]
	//	'superConcept' superConcept=[Concept|Reference] RCURLY;
	public ConceptSpecializationAxiomElements getConceptSpecializationAxiomAccess() {
		return pConceptSpecializationAxiom;
	}
	
	public ParserRule getConceptSpecializationAxiomRule() {
		return getConceptSpecializationAxiomAccess().getRule();
	}
	
	//ReifiedRelationshipSpecializationAxiom:
	//	REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN
	//	LCURLY
	//	'subRelationship' subRelationship=[ReifiedRelationship|Reference]
	//	'superRelationship' superRelationship=[ReifiedRelationship|Reference] RCURLY;
	public ReifiedRelationshipSpecializationAxiomElements getReifiedRelationshipSpecializationAxiomAccess() {
		return pReifiedRelationshipSpecializationAxiom;
	}
	
	public ParserRule getReifiedRelationshipSpecializationAxiomRule() {
		return getReifiedRelationshipSpecializationAxiomAccess().getRule();
	}
	
	//// 3 EntityScalarDataPropertyRestrictionAxioms
	//EntityScalarDataPropertyExistentialRestrictionAxiom:
	//	ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
	//	LCURLY
	//	'restrictedEntity' restrictedEntity=[Entity|Reference]
	//	'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference]
	//	'scalarRestriction' scalarRestriction=[DataRange|Reference] RCURLY;
	public EntityScalarDataPropertyExistentialRestrictionAxiomElements getEntityScalarDataPropertyExistentialRestrictionAxiomAccess() {
		return pEntityScalarDataPropertyExistentialRestrictionAxiom;
	}
	
	public ParserRule getEntityScalarDataPropertyExistentialRestrictionAxiomRule() {
		return getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRule();
	}
	
	//EntityScalarDataPropertyParticularRestrictionAxiom:
	//	ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN
	//	LCURLY
	//	'restrictedEntity' restrictedEntity=[Entity|Reference]
	//	'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference]
	//	'literalValue' literalValue=STRING
	//	RCURLY;
	public EntityScalarDataPropertyParticularRestrictionAxiomElements getEntityScalarDataPropertyParticularRestrictionAxiomAccess() {
		return pEntityScalarDataPropertyParticularRestrictionAxiom;
	}
	
	public ParserRule getEntityScalarDataPropertyParticularRestrictionAxiomRule() {
		return getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRule();
	}
	
	//EntityScalarDataPropertyUniversalRestrictionAxiom:
	//	ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
	//	LCURLY
	//	'restrictedEntity' restrictedEntity=[Entity|Reference]
	//	'scalarProperty' scalarProperty=[EntityScalarDataProperty|Reference]
	//	'scalarRestriction' scalarRestriction=[DataRange|Reference] RCURLY;
	public EntityScalarDataPropertyUniversalRestrictionAxiomElements getEntityScalarDataPropertyUniversalRestrictionAxiomAccess() {
		return pEntityScalarDataPropertyUniversalRestrictionAxiom;
	}
	
	public ParserRule getEntityScalarDataPropertyUniversalRestrictionAxiomRule() {
		return getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRule();
	}
	
	//// 8 RestrictedDataRanges + 1 ScalarOneOfLiteralAxiom
	//BinaryScalarRestriction:
	//	BINARY_SCALAR_RESTRICTION_TOKEN name=ID
	//	LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength' maxLength=INT)?
	//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
	public BinaryScalarRestrictionElements getBinaryScalarRestrictionAccess() {
		return pBinaryScalarRestriction;
	}
	
	public ParserRule getBinaryScalarRestrictionRule() {
		return getBinaryScalarRestrictionAccess().getRule();
	}
	
	//IRIScalarRestriction:
	//	IRI_SCALAR_RESTRICTION_TOKEN name=ID
	//	LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength' maxLength=INT)? ('pattern' pattern=STRING)?
	//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
	public IRIScalarRestrictionElements getIRIScalarRestrictionAccess() {
		return pIRIScalarRestriction;
	}
	
	public ParserRule getIRIScalarRestrictionRule() {
		return getIRIScalarRestrictionAccess().getRule();
	}
	
	//NumericScalarRestriction:
	//	NUMERIC_SCALAR_RESTRICTION_TOKEN name=ID
	//	LCURLY ('minInclusive' minInclusive=STRING)? ('maxInclusive' maxInclusive=STRING)? ('minExclusive'
	//	minExclusive=STRING)? ('maxExclusive' maxExclusive=STRING)?
	//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
	public NumericScalarRestrictionElements getNumericScalarRestrictionAccess() {
		return pNumericScalarRestriction;
	}
	
	public ParserRule getNumericScalarRestrictionRule() {
		return getNumericScalarRestrictionAccess().getRule();
	}
	
	//PlainLiteralScalarRestriction:
	//	PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN name=ID
	//	LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength' maxLength=INT)? ('pattern' pattern=STRING)?
	//	('language' language=STRING)?
	//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
	public PlainLiteralScalarRestrictionElements getPlainLiteralScalarRestrictionAccess() {
		return pPlainLiteralScalarRestriction;
	}
	
	public ParserRule getPlainLiteralScalarRestrictionRule() {
		return getPlainLiteralScalarRestrictionAccess().getRule();
	}
	
	//ScalarOneOfRestriction:
	//	SCALAR_ONE_OF_RESTRICTION_TOKEN name=ID
	//	LCURLY
	//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
	public ScalarOneOfRestrictionElements getScalarOneOfRestrictionAccess() {
		return pScalarOneOfRestriction;
	}
	
	public ParserRule getScalarOneOfRestrictionRule() {
		return getScalarOneOfRestrictionAccess().getRule();
	}
	
	//ScalarOneOfLiteralAxiom:
	//	SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN
	//	LCURLY
	//	'value' value=STRING
	//	'axiom' axiom=[ScalarOneOfRestriction|Reference] RCURLY;
	public ScalarOneOfLiteralAxiomElements getScalarOneOfLiteralAxiomAccess() {
		return pScalarOneOfLiteralAxiom;
	}
	
	public ParserRule getScalarOneOfLiteralAxiomRule() {
		return getScalarOneOfLiteralAxiomAccess().getRule();
	}
	
	//StringScalarRestriction:
	//	STRING_SCALAR_RESTRICTION_TOKEN name=ID
	//	LCURLY ('length' length=INT)? ('minLength' minLength=INT)? ('maxLength' maxLength=INT)? ('pattern' pattern=STRING)?
	//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
	public StringScalarRestrictionElements getStringScalarRestrictionAccess() {
		return pStringScalarRestriction;
	}
	
	public ParserRule getStringScalarRestrictionRule() {
		return getStringScalarRestrictionAccess().getRule();
	}
	
	//SynonymScalarRestriction:
	//	SYNONYM_SCALAR_RESTRICTION_TOKEN name=ID
	//	LCURLY
	//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
	public SynonymScalarRestrictionElements getSynonymScalarRestrictionAccess() {
		return pSynonymScalarRestriction;
	}
	
	public ParserRule getSynonymScalarRestrictionRule() {
		return getSynonymScalarRestrictionAccess().getRule();
	}
	
	//TimeScalarRestriction:
	//	TIME_SCALAR_RESTRICTION_TOKEN name=ID
	//	LCURLY ('minInclusive' minInclusive=STRING)? ('maxInclusive' maxInclusive=STRING)? ('minExclusive'
	//	minExclusive=STRING)? ('maxExclusive' maxExclusive=STRING)?
	//	'restrictedRange' restrictedRange=[DataRange|Reference] RCURLY;
	public TimeScalarRestrictionElements getTimeScalarRestrictionAccess() {
		return pTimeScalarRestriction;
	}
	
	public ParserRule getTimeScalarRestrictionRule() {
		return getTimeScalarRestrictionAccess().getRule();
	}
	
	////----------------------------
	//Reference:
	//	IRI | QNAME;
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//QNAME:
	//	ABBREV_IRI | ValidID;
	public QNAMEElements getQNAMEAccess() {
		return pQNAME;
	}
	
	public ParserRule getQNAMERule() {
		return getQNAMEAccess().getRule();
	}
	
	//ABBREV_IRI:
	//	ValidID ':' ValidID;
	public ABBREV_IRIElements getABBREV_IRIAccess() {
		return pABBREV_IRI;
	}
	
	public ParserRule getABBREV_IRIRule() {
		return getABBREV_IRIAccess().getRule();
	}
	
	//ValidID:
	//	ID;
	public ValidIDElements getValidIDAccess() {
		return pValidID;
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}
	
	//terminal ANNOTATION_PROPERTY_TOKEN:
	//	'annotationProperty';
	public TerminalRule getANNOTATION_PROPERTY_TOKENRule() {
		return tANNOTATION_PROPERTY_TOKEN;
	}
	
	//terminal ANNOTATION_TOKEN:
	//	'@';
	public TerminalRule getANNOTATION_TOKENRule() {
		return tANNOTATION_TOKEN;
	}
	
	//terminal TERMINOLOGY_GRAPH_TOKEN:
	//	'terminology';
	public TerminalRule getTERMINOLOGY_GRAPH_TOKENRule() {
		return tTERMINOLOGY_GRAPH_TOKEN;
	}
	
	//terminal BUNDLE_TOKEN:
	//	'bundle';
	public TerminalRule getBUNDLE_TOKENRule() {
		return tBUNDLE_TOKEN;
	}
	
	//terminal KIND_TOKEN:
	//	'kind';
	public TerminalRule getKIND_TOKENRule() {
		return tKIND_TOKEN;
	}
	
	//terminal ASPECT_TOKEN:
	//	'aspect';
	public TerminalRule getASPECT_TOKENRule() {
		return tASPECT_TOKEN;
	}
	
	//terminal ABSTRACT_TOKEN:
	//	'abstract';
	public TerminalRule getABSTRACT_TOKENRule() {
		return tABSTRACT_TOKEN;
	}
	
	//terminal CONCEPT_TOKEN:
	//	'concept';
	public TerminalRule getCONCEPT_TOKENRule() {
		return tCONCEPT_TOKEN;
	}
	
	//terminal REIFIED_RELATIONSHIP_TOKEN:
	//	'reifiedRelationship';
	public TerminalRule getREIFIED_RELATIONSHIP_TOKENRule() {
		return tREIFIED_RELATIONSHIP_TOKEN;
	}
	
	//terminal UNREIFIED_RELATIONSHIP_TOKEN:
	//	'unreifiedRelationship';
	public TerminalRule getUNREIFIED_RELATIONSHIP_TOKENRule() {
		return tUNREIFIED_RELATIONSHIP_TOKEN;
	}
	
	//terminal FUNCTIONAL_TOKEN:
	//	'functional';
	public TerminalRule getFUNCTIONAL_TOKENRule() {
		return tFUNCTIONAL_TOKEN;
	}
	
	//terminal INVERSE_FUNCTIONAL_TOKEN:
	//	'inverseFunctional';
	public TerminalRule getINVERSE_FUNCTIONAL_TOKENRule() {
		return tINVERSE_FUNCTIONAL_TOKEN;
	}
	
	//terminal ESSENTIAL_TOKEN:
	//	'essential';
	public TerminalRule getESSENTIAL_TOKENRule() {
		return tESSENTIAL_TOKEN;
	}
	
	//terminal INVERSE_ESSENTIAL_TOKEN:
	//	'inverseEssential';
	public TerminalRule getINVERSE_ESSENTIAL_TOKENRule() {
		return tINVERSE_ESSENTIAL_TOKEN;
	}
	
	//terminal SYMMETRIC_TOKEN:
	//	'symmetric';
	public TerminalRule getSYMMETRIC_TOKENRule() {
		return tSYMMETRIC_TOKEN;
	}
	
	//terminal ASYMMETRIC_TOKEN:
	//	'asymmetric';
	public TerminalRule getASYMMETRIC_TOKENRule() {
		return tASYMMETRIC_TOKEN;
	}
	
	//terminal REFLEXIVE_TOKEN:
	//	'reflexive';
	public TerminalRule getREFLEXIVE_TOKENRule() {
		return tREFLEXIVE_TOKEN;
	}
	
	//terminal IRREFLEXIVE_TOKEN:
	//	'irreflexive';
	public TerminalRule getIRREFLEXIVE_TOKENRule() {
		return tIRREFLEXIVE_TOKEN;
	}
	
	//terminal TRANSITIVE_TOKEN:
	//	'transitive';
	public TerminalRule getTRANSITIVE_TOKENRule() {
		return tTRANSITIVE_TOKEN;
	}
	
	//terminal UNREIFIED_TOKEN:
	//	'unreified';
	public TerminalRule getUNREIFIED_TOKENRule() {
		return tUNREIFIED_TOKEN;
	}
	
	//terminal INVERSE_TOKEN:
	//	'inverse';
	public TerminalRule getINVERSE_TOKENRule() {
		return tINVERSE_TOKEN;
	}
	
	//terminal SOURCE_TOKEN:
	//	'source';
	public TerminalRule getSOURCE_TOKENRule() {
		return tSOURCE_TOKEN;
	}
	
	//terminal TARGET_TOKEN:
	//	'target';
	public TerminalRule getTARGET_TOKENRule() {
		return tTARGET_TOKEN;
	}
	
	//terminal SCALAR_TOKEN:
	//	'scalar';
	public TerminalRule getSCALAR_TOKENRule() {
		return tSCALAR_TOKEN;
	}
	
	//terminal STRUCTURE_TOKEN:
	//	'structure';
	public TerminalRule getSTRUCTURE_TOKENRule() {
		return tSTRUCTURE_TOKEN;
	}
	
	//terminal DOMAIN_TOKEN:
	//	'domain';
	public TerminalRule getDOMAIN_TOKENRule() {
		return tDOMAIN_TOKEN;
	}
	
	//terminal RANGE_TOKEN:
	//	'range';
	public TerminalRule getRANGE_TOKENRule() {
		return tRANGE_TOKEN;
	}
	
	//terminal ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN:
	//	'rootConceptTaxonomyAxiom';
	public TerminalRule getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENRule() {
		return tROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN;
	}
	
	//terminal SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN:
	//	'specificDisjointConceptAxiom';
	public TerminalRule getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENRule() {
		return tSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN;
	}
	
	//terminal ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN:
	//	'anonymousConceptTaxonomyAxiom';
	public TerminalRule getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENRule() {
		return tANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN;
	}
	
	//terminal BUNDLED_TERMINOLOGY_AXIOM_TOKEN:
	//	'bundledTerminologyAxiom';
	public TerminalRule getBUNDLED_TERMINOLOGY_AXIOM_TOKENRule() {
		return tBUNDLED_TERMINOLOGY_AXIOM_TOKEN;
	}
	
	//terminal CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN:
	//	'conceptDesignationTerminologyAxiom';
	public TerminalRule getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENRule() {
		return tCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN;
	}
	
	//terminal TERMINOLOGY_NESTING_AXIOM_TOKEN:
	//	'terminologyNestingAxiom';
	public TerminalRule getTERMINOLOGY_NESTING_AXIOM_TOKENRule() {
		return tTERMINOLOGY_NESTING_AXIOM_TOKEN;
	}
	
	//terminal TERMINOLOGY_EXTENSION_AXIOM_TOKEN:
	//	'extends';
	public TerminalRule getTERMINOLOGY_EXTENSION_AXIOM_TOKENRule() {
		return tTERMINOLOGY_EXTENSION_AXIOM_TOKEN;
	}
	
	//terminal ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
	//	'entityExistentialRestrictionAxiom';
	public TerminalRule getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENRule() {
		return tENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN;
	}
	
	//terminal ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
	//	'entityUniversalRestrictionAxiom';
	public TerminalRule getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENRule() {
		return tENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN;
	}
	
	//terminal CONCEPT_SPECIALIZATION_AXIOM_TOKEN:
	//	'conceptSpecializationAxiom';
	public TerminalRule getCONCEPT_SPECIALIZATION_AXIOM_TOKENRule() {
		return tCONCEPT_SPECIALIZATION_AXIOM_TOKEN;
	}
	
	//terminal ASPECT_SPECIALIZATION_AXIOM_TOKEN:
	//	'extendsAspect';
	public TerminalRule getASPECT_SPECIALIZATION_AXIOM_TOKENRule() {
		return tASPECT_SPECIALIZATION_AXIOM_TOKEN;
	}
	
	//terminal REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN:
	//	'reifiedRelationshipSpecializationAxiom';
	public TerminalRule getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENRule() {
		return tREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN;
	}
	
	//terminal ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
	//	'entityScalarDataPropertyExistentialRestrictionAxiom';
	public TerminalRule getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENRule() {
		return tENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN;
	}
	
	//terminal ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
	//	'entityScalarDataPropertyUniversalRestrictionAxiom';
	public TerminalRule getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENRule() {
		return tENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN;
	}
	
	//terminal ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN:
	//	'entityScalarDataPropertyParticularRestrictionAxiom';
	public TerminalRule getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENRule() {
		return tENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN;
	}
	
	//terminal SYNONYM_SCALAR_RESTRICTION_TOKEN:
	//	'synonymScalarRestriction';
	public TerminalRule getSYNONYM_SCALAR_RESTRICTION_TOKENRule() {
		return tSYNONYM_SCALAR_RESTRICTION_TOKEN;
	}
	
	//terminal NUMERIC_SCALAR_RESTRICTION_TOKEN:
	//	'numericScalarRestriction';
	public TerminalRule getNUMERIC_SCALAR_RESTRICTION_TOKENRule() {
		return tNUMERIC_SCALAR_RESTRICTION_TOKEN;
	}
	
	//terminal STRING_SCALAR_RESTRICTION_TOKEN:
	//	'stringScalarRestriction';
	public TerminalRule getSTRING_SCALAR_RESTRICTION_TOKENRule() {
		return tSTRING_SCALAR_RESTRICTION_TOKEN;
	}
	
	//terminal PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN:
	//	'plainLiteralScalarRestriction';
	public TerminalRule getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENRule() {
		return tPLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN;
	}
	
	//terminal BINARY_SCALAR_RESTRICTION_TOKEN:
	//	'binaryScalarRestriction';
	public TerminalRule getBINARY_SCALAR_RESTRICTION_TOKENRule() {
		return tBINARY_SCALAR_RESTRICTION_TOKEN;
	}
	
	//terminal IRI_SCALAR_RESTRICTION_TOKEN:
	//	'iriScalarRestriction';
	public TerminalRule getIRI_SCALAR_RESTRICTION_TOKENRule() {
		return tIRI_SCALAR_RESTRICTION_TOKEN;
	}
	
	//terminal TIME_SCALAR_RESTRICTION_TOKEN:
	//	'timeScalarRestriction';
	public TerminalRule getTIME_SCALAR_RESTRICTION_TOKENRule() {
		return tTIME_SCALAR_RESTRICTION_TOKEN;
	}
	
	//terminal SCALAR_ONE_OF_RESTRICTION_TOKEN:
	//	'scalarOneOfRestriction';
	public TerminalRule getSCALAR_ONE_OF_RESTRICTION_TOKENRule() {
		return tSCALAR_ONE_OF_RESTRICTION_TOKEN;
	}
	
	//terminal SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN:
	//	'scalarOneOfLiteralAxiom';
	public TerminalRule getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENRule() {
		return tSCALAR_ONE_OF_LITERAL_AXIOM_TOKEN;
	}
	
	//terminal LCURLY:
	//	'{';
	public TerminalRule getLCURLYRule() {
		return tLCURLY;
	}
	
	//terminal RCURLY:
	//	'}';
	public TerminalRule getRCURLYRule() {
		return tRCURLY;
	}
	
	//terminal EQUAL:
	//	'=';
	public TerminalRule getEQUALRule() {
		return tEQUAL;
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"'? |
	//	"'" ('\\' . | !('\\' | "'"))* "'"?;
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal IRI:
	//	'<' !'>'* '>';
	public TerminalRule getIRIRule() {
		return tIRI;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '$' | '_') ('a'..'z' | 'A'..'Z' | '$' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal UUID:
	//	HEX_8DIGITS '-' HEX_4DIGITS '-' HEX_4DIGITS '-' HEX_4DIGITS '-' HEX_12DIGITS;
	public TerminalRule getUUIDRule() {
		return tUUID;
	}
	
	//terminal HEX_12DIGITS:
	//	HEX_8DIGITS HEX_4DIGITS;
	public TerminalRule getHEX_12DIGITSRule() {
		return tHEX_12DIGITS;
	}
	
	//terminal HEX_8DIGITS:
	//	HEX_4DIGITS HEX_4DIGITS;
	public TerminalRule getHEX_8DIGITSRule() {
		return tHEX_8DIGITS;
	}
	
	//terminal HEX_4DIGITS:
	//	HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;
	public TerminalRule getHEX_4DIGITSRule() {
		return tHEX_4DIGITS;
	}
	
	//terminal HEX_DIGIT:
	//	'0'..'9' | 'a'..'f' | 'A'..'F';
	public TerminalRule getHEX_DIGITRule() {
		return tHEX_DIGIT;
	}
	
	//terminal HEX:
	//	('0x' | '0X') ('0'..'9' | 'a'..'f' | 'A'..'F' | '_')+ ('#' (('b' | 'B') ('i' | 'I') | ('l' | 'L')))?;
	public TerminalRule getHEXRule() {
		return tHEX;
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9' ('0'..'9' | '_')*;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal DECIMAL:
	//	INT (('e' | 'E') ('+' | '-')? INT)? (('b' | 'B') ('i' | 'I' | 'd' | 'D') | ('l' | 'L' | 'd' | 'D' | 'f' | 'F'))?;
	public TerminalRule getDECIMALRule() {
		return tDECIMAL;
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
