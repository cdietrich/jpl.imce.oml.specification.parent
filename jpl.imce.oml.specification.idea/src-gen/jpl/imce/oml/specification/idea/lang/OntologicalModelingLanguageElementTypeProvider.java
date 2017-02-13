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
package jpl.imce.oml.specification.idea.lang;

import com.intellij.psi.tree.IFileElementType;
import java.util.HashMap;
import java.util.Map;
import jpl.imce.oml.specification.idea.lang.psi.impl.OntologicalModelingLanguageFileImpl;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import org.eclipse.xtext.psi.stubs.XtextFileElementType;
import org.eclipse.xtext.psi.stubs.XtextFileStub;
import org.eclipse.xtext.psi.tree.IGrammarAwareElementType;

public class OntologicalModelingLanguageElementTypeProvider implements IElementTypeProvider {

	public static final IFileElementType FILE_TYPE = new XtextFileElementType<XtextFileStub<OntologicalModelingLanguageFileImpl>>(OntologicalModelingLanguageLanguage.INSTANCE);

	private static final Map<EObject, IGrammarAwareElementType> GRAMMAR_ELEMENT_TYPE = new HashMap<EObject, IGrammarAwareElementType>();

	private static IGrammarAwareElementType associate(IGrammarAwareElementType grammarAwareElementType) {
		GRAMMAR_ELEMENT_TYPE.put(grammarAwareElementType.getGrammarElement(), grammarAwareElementType);
		return grammarAwareElementType;
	}

	private static final OntologicalModelingLanguageGrammarAccess GRAMMAR_ACCESS = OntologicalModelingLanguageLanguage.INSTANCE.getInstance(OntologicalModelingLanguageGrammarAccess.class);

	private static class TerminologyExtentFactory {
		public static IGrammarAwareElementType createTerminologyExtentElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentRule());
		}
		public static IGrammarAwareElementType createTerminologyExtent_GroupElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getGroup());
		}
		public static IGrammarAwareElementType createTerminologyExtent_TerminologyExtentAction_0ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_TerminologyExtentAction_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getTerminologyExtentAction_0());
		}
		public static IGrammarAwareElementType createTerminologyExtent_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_Alternatives_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createTerminologyExtent_AnnotationPropertiesAssignment_1_0ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_AnnotationPropertiesAssignment_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getAnnotationPropertiesAssignment_1_0());
		}
		public static IGrammarAwareElementType createTerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getAnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0());
		}
		public static IGrammarAwareElementType createTerminologyExtent_TerminologyGraphsAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_TerminologyGraphsAssignment_1_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getTerminologyGraphsAssignment_1_1());
		}
		public static IGrammarAwareElementType createTerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_1_1_0ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_1_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getTerminologyGraphsTerminologyGraphParserRuleCall_1_1_0());
		}
		public static IGrammarAwareElementType createTerminologyExtent_BundlesAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_BundlesAssignment_1_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getBundlesAssignment_1_2());
		}
		public static IGrammarAwareElementType createTerminologyExtent_BundlesBundleParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_BundlesBundleParserRuleCall_1_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getBundlesBundleParserRuleCall_1_2_0());
		}
		public static IGrammarAwareElementType createTerminologyExtent_DescriptionsAssignment_1_3ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_DescriptionsAssignment_1_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getDescriptionsAssignment_1_3());
		}
		public static IGrammarAwareElementType createTerminologyExtent_DescriptionsDescriptionBoxParserRuleCall_1_3_0ElementType() {
			return new IGrammarAwareElementType("TerminologyExtent_DescriptionsDescriptionBoxParserRuleCall_1_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtentAccess().getDescriptionsDescriptionBoxParserRuleCall_1_3_0());
		}
	}

	public static final IGrammarAwareElementType TerminologyExtent_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtentElementType());

	public static final IGrammarAwareElementType TerminologyExtent_Group_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_GroupElementType());

	public static final IGrammarAwareElementType TerminologyExtent_TerminologyExtentAction_0_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_TerminologyExtentAction_0ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_Alternatives_1_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_Alternatives_1ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_AnnotationPropertiesAssignment_1_0_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_AnnotationPropertiesAssignment_1_0ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_TerminologyGraphsAssignment_1_1_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_TerminologyGraphsAssignment_1_1ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_1_1_0_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_1_1_0ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_BundlesAssignment_1_2_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_BundlesAssignment_1_2ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_BundlesBundleParserRuleCall_1_2_0_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_BundlesBundleParserRuleCall_1_2_0ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_DescriptionsAssignment_1_3_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_DescriptionsAssignment_1_3ElementType());

	public static final IGrammarAwareElementType TerminologyExtent_DescriptionsDescriptionBoxParserRuleCall_1_3_0_ELEMENT_TYPE = associate(TerminologyExtentFactory.createTerminologyExtent_DescriptionsDescriptionBoxParserRuleCall_1_3_0ElementType());

	private static class AnnotationPropertyFactory {
		public static IGrammarAwareElementType createAnnotationPropertyElementType() {
			return new IGrammarAwareElementType("AnnotationProperty_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationPropertyRule());
		}
		public static IGrammarAwareElementType createAnnotationProperty_GroupElementType() {
			return new IGrammarAwareElementType("AnnotationProperty_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationPropertyAccess().getGroup());
		}
		public static IGrammarAwareElementType createAnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("AnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationPropertyAccess().getANNOTATION_PROPERTY_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createAnnotationProperty_AbbrevIRIAssignment_1ElementType() {
			return new IGrammarAwareElementType("AnnotationProperty_AbbrevIRIAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationPropertyAccess().getAbbrevIRIAssignment_1());
		}
		public static IGrammarAwareElementType createAnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("AnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationPropertyAccess().getAbbrevIRIABBREV_IRIParserRuleCall_1_0());
		}
		public static IGrammarAwareElementType createAnnotationProperty_EQUALTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("AnnotationProperty_EQUALTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationPropertyAccess().getEQUALTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createAnnotationProperty_IriAssignment_3ElementType() {
			return new IGrammarAwareElementType("AnnotationProperty_IriAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationPropertyAccess().getIriAssignment_3());
		}
		public static IGrammarAwareElementType createAnnotationProperty_IriIRITerminalRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("AnnotationProperty_IriIRITerminalRuleCall_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationPropertyAccess().getIriIRITerminalRuleCall_3_0());
		}
	}

	public static final IGrammarAwareElementType AnnotationProperty_ELEMENT_TYPE = associate(AnnotationPropertyFactory.createAnnotationPropertyElementType());

	public static final IGrammarAwareElementType AnnotationProperty_Group_ELEMENT_TYPE = associate(AnnotationPropertyFactory.createAnnotationProperty_GroupElementType());

	public static final IGrammarAwareElementType AnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(AnnotationPropertyFactory.createAnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType AnnotationProperty_AbbrevIRIAssignment_1_ELEMENT_TYPE = associate(AnnotationPropertyFactory.createAnnotationProperty_AbbrevIRIAssignment_1ElementType());

	public static final IGrammarAwareElementType AnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0_ELEMENT_TYPE = associate(AnnotationPropertyFactory.createAnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType AnnotationProperty_EQUALTerminalRuleCall_2_ELEMENT_TYPE = associate(AnnotationPropertyFactory.createAnnotationProperty_EQUALTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType AnnotationProperty_IriAssignment_3_ELEMENT_TYPE = associate(AnnotationPropertyFactory.createAnnotationProperty_IriAssignment_3ElementType());

	public static final IGrammarAwareElementType AnnotationProperty_IriIRITerminalRuleCall_3_0_ELEMENT_TYPE = associate(AnnotationPropertyFactory.createAnnotationProperty_IriIRITerminalRuleCall_3_0ElementType());

	private static class AnnotationFactory {
		public static IGrammarAwareElementType createAnnotationElementType() {
			return new IGrammarAwareElementType("Annotation_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationRule());
		}
		public static IGrammarAwareElementType createAnnotation_GroupElementType() {
			return new IGrammarAwareElementType("Annotation_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationAccess().getGroup());
		}
		public static IGrammarAwareElementType createAnnotation_ANNOTATION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Annotation_ANNOTATION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationAccess().getANNOTATION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createAnnotation_PropertyAssignment_1ElementType() {
			return new IGrammarAwareElementType("Annotation_PropertyAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationAccess().getPropertyAssignment_1());
		}
		public static IGrammarAwareElementType createAnnotation_PropertyAnnotationPropertyCrossReference_1_0ElementType() {
			return new IGrammarAwareElementType("Annotation_PropertyAnnotationPropertyCrossReference_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationAccess().getPropertyAnnotationPropertyCrossReference_1_0());
		}
		public static IGrammarAwareElementType createAnnotation_PropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1ElementType() {
			return new IGrammarAwareElementType("Annotation_PropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationAccess().getPropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1());
		}
		public static IGrammarAwareElementType createAnnotation_EQUALTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("Annotation_EQUALTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationAccess().getEQUALTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createAnnotation_ValueAssignment_3ElementType() {
			return new IGrammarAwareElementType("Annotation_ValueAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationAccess().getValueAssignment_3());
		}
		public static IGrammarAwareElementType createAnnotation_ValueSTRINGTerminalRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("Annotation_ValueSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0());
		}
	}

	public static final IGrammarAwareElementType Annotation_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotationElementType());

	public static final IGrammarAwareElementType Annotation_Group_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotation_GroupElementType());

	public static final IGrammarAwareElementType Annotation_ANNOTATION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotation_ANNOTATION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType Annotation_PropertyAssignment_1_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotation_PropertyAssignment_1ElementType());

	public static final IGrammarAwareElementType Annotation_PropertyAnnotationPropertyCrossReference_1_0_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotation_PropertyAnnotationPropertyCrossReference_1_0ElementType());

	public static final IGrammarAwareElementType Annotation_PropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotation_PropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1ElementType());

	public static final IGrammarAwareElementType Annotation_EQUALTerminalRuleCall_2_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotation_EQUALTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType Annotation_ValueAssignment_3_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotation_ValueAssignment_3ElementType());

	public static final IGrammarAwareElementType Annotation_ValueSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE = associate(AnnotationFactory.createAnnotation_ValueSTRINGTerminalRuleCall_3_0ElementType());

	private static class TerminologyBoxFactory {
		public static IGrammarAwareElementType createTerminologyBoxElementType() {
			return new IGrammarAwareElementType("TerminologyBox_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxRule());
		}
		public static IGrammarAwareElementType createTerminologyBox_AlternativesElementType() {
			return new IGrammarAwareElementType("TerminologyBox_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTerminologyBox_BundleParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TerminologyBox_BundleParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxAccess().getBundleParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTerminologyBox_TerminologyGraphParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TerminologyBox_TerminologyGraphParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxAccess().getTerminologyGraphParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType TerminologyBox_ELEMENT_TYPE = associate(TerminologyBoxFactory.createTerminologyBoxElementType());

	public static final IGrammarAwareElementType TerminologyBox_Alternatives_ELEMENT_TYPE = associate(TerminologyBoxFactory.createTerminologyBox_AlternativesElementType());

	public static final IGrammarAwareElementType TerminologyBox_BundleParserRuleCall_0_ELEMENT_TYPE = associate(TerminologyBoxFactory.createTerminologyBox_BundleParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType TerminologyBox_TerminologyGraphParserRuleCall_1_ELEMENT_TYPE = associate(TerminologyBoxFactory.createTerminologyBox_TerminologyGraphParserRuleCall_1ElementType());

	private static class TerminologyGraphFactory {
		public static IGrammarAwareElementType createTerminologyGraphElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphRule());
		}
		public static IGrammarAwareElementType createTerminologyGraph_GroupElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getGroup());
		}
		public static IGrammarAwareElementType createTerminologyGraph_KindAssignment_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_KindAssignment_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getKindAssignment_0());
		}
		public static IGrammarAwareElementType createTerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getKindTerminologyGraphKindEnumRuleCall_0_0());
		}
		public static IGrammarAwareElementType createTerminologyGraph_TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createTerminologyGraph_IriAssignment_2ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_IriAssignment_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getIriAssignment_2());
		}
		public static IGrammarAwareElementType createTerminologyGraph_IriIRITerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getIriIRITerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createTerminologyGraph_LCURLYTerminalRuleCall_3ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_LCURLYTerminalRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getLCURLYTerminalRuleCall_3());
		}
		public static IGrammarAwareElementType createTerminologyGraph_Alternatives_4ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_Alternatives_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getAlternatives_4());
		}
		public static IGrammarAwareElementType createTerminologyGraph_AnnotationsAssignment_4_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_AnnotationsAssignment_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getAnnotationsAssignment_4_0());
		}
		public static IGrammarAwareElementType createTerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
		}
		public static IGrammarAwareElementType createTerminologyGraph_TerminologyBoxAxiomsAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_TerminologyBoxAxiomsAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getTerminologyBoxAxiomsAssignment_4_1());
		}
		public static IGrammarAwareElementType createTerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createTerminologyGraph_BoxStatementsAssignment_4_2ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_BoxStatementsAssignment_4_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getBoxStatementsAssignment_4_2());
		}
		public static IGrammarAwareElementType createTerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0());
		}
		public static IGrammarAwareElementType createTerminologyGraph_RCURLYTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("TerminologyGraph_RCURLYTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphAccess().getRCURLYTerminalRuleCall_5());
		}
	}

	public static final IGrammarAwareElementType TerminologyGraph_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraphElementType());

	public static final IGrammarAwareElementType TerminologyGraph_Group_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_GroupElementType());

	public static final IGrammarAwareElementType TerminologyGraph_KindAssignment_0_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_KindAssignment_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_IriAssignment_2_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_IriAssignment_2ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_IriIRITerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_LCURLYTerminalRuleCall_3_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_LCURLYTerminalRuleCall_3ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_Alternatives_4_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_Alternatives_4ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_AnnotationsAssignment_4_0_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_AnnotationsAssignment_4_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_TerminologyBoxAxiomsAssignment_4_1_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_TerminologyBoxAxiomsAssignment_4_1ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_BoxStatementsAssignment_4_2_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_BoxStatementsAssignment_4_2ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraph_RCURLYTerminalRuleCall_5_ELEMENT_TYPE = associate(TerminologyGraphFactory.createTerminologyGraph_RCURLYTerminalRuleCall_5ElementType());

	private static class BundleFactory {
		public static IGrammarAwareElementType createBundleElementType() {
			return new IGrammarAwareElementType("Bundle_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleRule());
		}
		public static IGrammarAwareElementType createBundle_GroupElementType() {
			return new IGrammarAwareElementType("Bundle_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getGroup());
		}
		public static IGrammarAwareElementType createBundle_KindAssignment_0ElementType() {
			return new IGrammarAwareElementType("Bundle_KindAssignment_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getKindAssignment_0());
		}
		public static IGrammarAwareElementType createBundle_KindTerminologyGraphKindEnumRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("Bundle_KindTerminologyGraphKindEnumRuleCall_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getKindTerminologyGraphKindEnumRuleCall_0_0());
		}
		public static IGrammarAwareElementType createBundle_BUNDLE_TOKENTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Bundle_BUNDLE_TOKENTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getBUNDLE_TOKENTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createBundle_IriAssignment_2ElementType() {
			return new IGrammarAwareElementType("Bundle_IriAssignment_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getIriAssignment_2());
		}
		public static IGrammarAwareElementType createBundle_IriIRITerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("Bundle_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getIriIRITerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createBundle_LCURLYTerminalRuleCall_3ElementType() {
			return new IGrammarAwareElementType("Bundle_LCURLYTerminalRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getLCURLYTerminalRuleCall_3());
		}
		public static IGrammarAwareElementType createBundle_Alternatives_4ElementType() {
			return new IGrammarAwareElementType("Bundle_Alternatives_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getAlternatives_4());
		}
		public static IGrammarAwareElementType createBundle_AnnotationsAssignment_4_0ElementType() {
			return new IGrammarAwareElementType("Bundle_AnnotationsAssignment_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getAnnotationsAssignment_4_0());
		}
		public static IGrammarAwareElementType createBundle_AnnotationsAnnotationParserRuleCall_4_0_0ElementType() {
			return new IGrammarAwareElementType("Bundle_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
		}
		public static IGrammarAwareElementType createBundle_TerminologyBoxAxiomsAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("Bundle_TerminologyBoxAxiomsAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getTerminologyBoxAxiomsAssignment_4_1());
		}
		public static IGrammarAwareElementType createBundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("Bundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createBundle_BoxStatementsAssignment_4_2ElementType() {
			return new IGrammarAwareElementType("Bundle_BoxStatementsAssignment_4_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getBoxStatementsAssignment_4_2());
		}
		public static IGrammarAwareElementType createBundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType() {
			return new IGrammarAwareElementType("Bundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0());
		}
		public static IGrammarAwareElementType createBundle_BundleStatementsAssignment_4_3ElementType() {
			return new IGrammarAwareElementType("Bundle_BundleStatementsAssignment_4_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getBundleStatementsAssignment_4_3());
		}
		public static IGrammarAwareElementType createBundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0ElementType() {
			return new IGrammarAwareElementType("Bundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getBundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0());
		}
		public static IGrammarAwareElementType createBundle_TerminologyBundleAxiomsAssignment_4_4ElementType() {
			return new IGrammarAwareElementType("Bundle_TerminologyBundleAxiomsAssignment_4_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getTerminologyBundleAxiomsAssignment_4_4());
		}
		public static IGrammarAwareElementType createBundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0ElementType() {
			return new IGrammarAwareElementType("Bundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getTerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0());
		}
		public static IGrammarAwareElementType createBundle_RCURLYTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("Bundle_RCURLYTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundleAccess().getRCURLYTerminalRuleCall_5());
		}
	}

	public static final IGrammarAwareElementType Bundle_ELEMENT_TYPE = associate(BundleFactory.createBundleElementType());

	public static final IGrammarAwareElementType Bundle_Group_ELEMENT_TYPE = associate(BundleFactory.createBundle_GroupElementType());

	public static final IGrammarAwareElementType Bundle_KindAssignment_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_KindAssignment_0ElementType());

	public static final IGrammarAwareElementType Bundle_KindTerminologyGraphKindEnumRuleCall_0_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_KindTerminologyGraphKindEnumRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType Bundle_BUNDLE_TOKENTerminalRuleCall_1_ELEMENT_TYPE = associate(BundleFactory.createBundle_BUNDLE_TOKENTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType Bundle_IriAssignment_2_ELEMENT_TYPE = associate(BundleFactory.createBundle_IriAssignment_2ElementType());

	public static final IGrammarAwareElementType Bundle_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_IriIRITerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType Bundle_LCURLYTerminalRuleCall_3_ELEMENT_TYPE = associate(BundleFactory.createBundle_LCURLYTerminalRuleCall_3ElementType());

	public static final IGrammarAwareElementType Bundle_Alternatives_4_ELEMENT_TYPE = associate(BundleFactory.createBundle_Alternatives_4ElementType());

	public static final IGrammarAwareElementType Bundle_AnnotationsAssignment_4_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_AnnotationsAssignment_4_0ElementType());

	public static final IGrammarAwareElementType Bundle_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());

	public static final IGrammarAwareElementType Bundle_TerminologyBoxAxiomsAssignment_4_1_ELEMENT_TYPE = associate(BundleFactory.createBundle_TerminologyBoxAxiomsAssignment_4_1ElementType());

	public static final IGrammarAwareElementType Bundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType Bundle_BoxStatementsAssignment_4_2_ELEMENT_TYPE = associate(BundleFactory.createBundle_BoxStatementsAssignment_4_2ElementType());

	public static final IGrammarAwareElementType Bundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType());

	public static final IGrammarAwareElementType Bundle_BundleStatementsAssignment_4_3_ELEMENT_TYPE = associate(BundleFactory.createBundle_BundleStatementsAssignment_4_3ElementType());

	public static final IGrammarAwareElementType Bundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0ElementType());

	public static final IGrammarAwareElementType Bundle_TerminologyBundleAxiomsAssignment_4_4_ELEMENT_TYPE = associate(BundleFactory.createBundle_TerminologyBundleAxiomsAssignment_4_4ElementType());

	public static final IGrammarAwareElementType Bundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0_ELEMENT_TYPE = associate(BundleFactory.createBundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0ElementType());

	public static final IGrammarAwareElementType Bundle_RCURLYTerminalRuleCall_5_ELEMENT_TYPE = associate(BundleFactory.createBundle_RCURLYTerminalRuleCall_5ElementType());

	private static class TerminologyBoxAxiomFactory {
		public static IGrammarAwareElementType createTerminologyBoxAxiomElementType() {
			return new IGrammarAwareElementType("TerminologyBoxAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxAxiomRule());
		}
		public static IGrammarAwareElementType createTerminologyBoxAxiom_AlternativesElementType() {
			return new IGrammarAwareElementType("TerminologyBoxAxiom_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxAxiomAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTerminologyBoxAxiom_ConceptDesignationTerminologyAxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TerminologyBoxAxiom_ConceptDesignationTerminologyAxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxAxiomAccess().getConceptDesignationTerminologyAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTerminologyBoxAxiom_TerminologyExtensionAxiomParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TerminologyBoxAxiom_TerminologyExtensionAxiomParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxAxiomAccess().getTerminologyExtensionAxiomParserRuleCall_1());
		}
		public static IGrammarAwareElementType createTerminologyBoxAxiom_TerminologyNestingAxiomParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("TerminologyBoxAxiom_TerminologyNestingAxiomParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxAxiomAccess().getTerminologyNestingAxiomParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType TerminologyBoxAxiom_ELEMENT_TYPE = associate(TerminologyBoxAxiomFactory.createTerminologyBoxAxiomElementType());

	public static final IGrammarAwareElementType TerminologyBoxAxiom_Alternatives_ELEMENT_TYPE = associate(TerminologyBoxAxiomFactory.createTerminologyBoxAxiom_AlternativesElementType());

	public static final IGrammarAwareElementType TerminologyBoxAxiom_ConceptDesignationTerminologyAxiomParserRuleCall_0_ELEMENT_TYPE = associate(TerminologyBoxAxiomFactory.createTerminologyBoxAxiom_ConceptDesignationTerminologyAxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType TerminologyBoxAxiom_TerminologyExtensionAxiomParserRuleCall_1_ELEMENT_TYPE = associate(TerminologyBoxAxiomFactory.createTerminologyBoxAxiom_TerminologyExtensionAxiomParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType TerminologyBoxAxiom_TerminologyNestingAxiomParserRuleCall_2_ELEMENT_TYPE = associate(TerminologyBoxAxiomFactory.createTerminologyBoxAxiom_TerminologyNestingAxiomParserRuleCall_2ElementType());

	private static class TerminologyBoxStatementFactory {
		public static IGrammarAwareElementType createTerminologyBoxStatementElementType() {
			return new IGrammarAwareElementType("TerminologyBoxStatement_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxStatementRule());
		}
		public static IGrammarAwareElementType createTerminologyBoxStatement_AlternativesElementType() {
			return new IGrammarAwareElementType("TerminologyBoxStatement_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxStatementAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTerminologyBoxStatement_AxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TerminologyBoxStatement_AxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxStatementAccess().getAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTerminologyBoxStatement_TermParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TerminologyBoxStatement_TermParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBoxStatementAccess().getTermParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType TerminologyBoxStatement_ELEMENT_TYPE = associate(TerminologyBoxStatementFactory.createTerminologyBoxStatementElementType());

	public static final IGrammarAwareElementType TerminologyBoxStatement_Alternatives_ELEMENT_TYPE = associate(TerminologyBoxStatementFactory.createTerminologyBoxStatement_AlternativesElementType());

	public static final IGrammarAwareElementType TerminologyBoxStatement_AxiomParserRuleCall_0_ELEMENT_TYPE = associate(TerminologyBoxStatementFactory.createTerminologyBoxStatement_AxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType TerminologyBoxStatement_TermParserRuleCall_1_ELEMENT_TYPE = associate(TerminologyBoxStatementFactory.createTerminologyBoxStatement_TermParserRuleCall_1ElementType());

	private static class TermFactory {
		public static IGrammarAwareElementType createTermElementType() {
			return new IGrammarAwareElementType("Term_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermRule());
		}
		public static IGrammarAwareElementType createTerm_AlternativesElementType() {
			return new IGrammarAwareElementType("Term_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTerm_AtomicEntityParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Term_AtomicEntityParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAccess().getAtomicEntityParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTerm_EntityRelationshipParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Term_EntityRelationshipParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAccess().getEntityRelationshipParserRuleCall_1());
		}
		public static IGrammarAwareElementType createTerm_DatatypeParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("Term_DatatypeParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAccess().getDatatypeParserRuleCall_2());
		}
		public static IGrammarAwareElementType createTerm_DataRelationshipParserRuleCall_3ElementType() {
			return new IGrammarAwareElementType("Term_DataRelationshipParserRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAccess().getDataRelationshipParserRuleCall_3());
		}
	}

	public static final IGrammarAwareElementType Term_ELEMENT_TYPE = associate(TermFactory.createTermElementType());

	public static final IGrammarAwareElementType Term_Alternatives_ELEMENT_TYPE = associate(TermFactory.createTerm_AlternativesElementType());

	public static final IGrammarAwareElementType Term_AtomicEntityParserRuleCall_0_ELEMENT_TYPE = associate(TermFactory.createTerm_AtomicEntityParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType Term_EntityRelationshipParserRuleCall_1_ELEMENT_TYPE = associate(TermFactory.createTerm_EntityRelationshipParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType Term_DatatypeParserRuleCall_2_ELEMENT_TYPE = associate(TermFactory.createTerm_DatatypeParserRuleCall_2ElementType());

	public static final IGrammarAwareElementType Term_DataRelationshipParserRuleCall_3_ELEMENT_TYPE = associate(TermFactory.createTerm_DataRelationshipParserRuleCall_3ElementType());

	private static class AtomicEntityFactory {
		public static IGrammarAwareElementType createAtomicEntityElementType() {
			return new IGrammarAwareElementType("AtomicEntity_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAtomicEntityRule());
		}
		public static IGrammarAwareElementType createAtomicEntity_AlternativesElementType() {
			return new IGrammarAwareElementType("AtomicEntity_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAtomicEntityAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createAtomicEntity_AspectParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("AtomicEntity_AspectParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAtomicEntityAccess().getAspectParserRuleCall_0());
		}
		public static IGrammarAwareElementType createAtomicEntity_ConceptParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("AtomicEntity_ConceptParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAtomicEntityAccess().getConceptParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType AtomicEntity_ELEMENT_TYPE = associate(AtomicEntityFactory.createAtomicEntityElementType());

	public static final IGrammarAwareElementType AtomicEntity_Alternatives_ELEMENT_TYPE = associate(AtomicEntityFactory.createAtomicEntity_AlternativesElementType());

	public static final IGrammarAwareElementType AtomicEntity_AspectParserRuleCall_0_ELEMENT_TYPE = associate(AtomicEntityFactory.createAtomicEntity_AspectParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType AtomicEntity_ConceptParserRuleCall_1_ELEMENT_TYPE = associate(AtomicEntityFactory.createAtomicEntity_ConceptParserRuleCall_1ElementType());

	private static class EntityRelationshipFactory {
		public static IGrammarAwareElementType createEntityRelationshipElementType() {
			return new IGrammarAwareElementType("EntityRelationship_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityRelationshipRule());
		}
		public static IGrammarAwareElementType createEntityRelationship_AlternativesElementType() {
			return new IGrammarAwareElementType("EntityRelationship_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityRelationshipAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createEntityRelationship_ReifiedRelationshipParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EntityRelationship_ReifiedRelationshipParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityRelationshipAccess().getReifiedRelationshipParserRuleCall_0());
		}
		public static IGrammarAwareElementType createEntityRelationship_UnreifiedRelationshipParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("EntityRelationship_UnreifiedRelationshipParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityRelationshipAccess().getUnreifiedRelationshipParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType EntityRelationship_ELEMENT_TYPE = associate(EntityRelationshipFactory.createEntityRelationshipElementType());

	public static final IGrammarAwareElementType EntityRelationship_Alternatives_ELEMENT_TYPE = associate(EntityRelationshipFactory.createEntityRelationship_AlternativesElementType());

	public static final IGrammarAwareElementType EntityRelationship_ReifiedRelationshipParserRuleCall_0_ELEMENT_TYPE = associate(EntityRelationshipFactory.createEntityRelationship_ReifiedRelationshipParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType EntityRelationship_UnreifiedRelationshipParserRuleCall_1_ELEMENT_TYPE = associate(EntityRelationshipFactory.createEntityRelationship_UnreifiedRelationshipParserRuleCall_1ElementType());

	private static class DatatypeFactory {
		public static IGrammarAwareElementType createDatatypeElementType() {
			return new IGrammarAwareElementType("Datatype_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDatatypeRule());
		}
		public static IGrammarAwareElementType createDatatype_AlternativesElementType() {
			return new IGrammarAwareElementType("Datatype_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDatatypeAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createDatatype_ScalarDataRangeParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Datatype_ScalarDataRangeParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDatatypeAccess().getScalarDataRangeParserRuleCall_0());
		}
		public static IGrammarAwareElementType createDatatype_StructureParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Datatype_StructureParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDatatypeAccess().getStructureParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType Datatype_ELEMENT_TYPE = associate(DatatypeFactory.createDatatypeElementType());

	public static final IGrammarAwareElementType Datatype_Alternatives_ELEMENT_TYPE = associate(DatatypeFactory.createDatatype_AlternativesElementType());

	public static final IGrammarAwareElementType Datatype_ScalarDataRangeParserRuleCall_0_ELEMENT_TYPE = associate(DatatypeFactory.createDatatype_ScalarDataRangeParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType Datatype_StructureParserRuleCall_1_ELEMENT_TYPE = associate(DatatypeFactory.createDatatype_StructureParserRuleCall_1ElementType());

	private static class ScalarDataRangeFactory {
		public static IGrammarAwareElementType createScalarDataRangeElementType() {
			return new IGrammarAwareElementType("ScalarDataRange_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataRangeRule());
		}
		public static IGrammarAwareElementType createScalarDataRange_AlternativesElementType() {
			return new IGrammarAwareElementType("ScalarDataRange_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataRangeAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createScalarDataRange_ScalarParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ScalarDataRange_ScalarParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataRangeAccess().getScalarParserRuleCall_0());
		}
		public static IGrammarAwareElementType createScalarDataRange_RestrictedDataRangeParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ScalarDataRange_RestrictedDataRangeParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataRangeAccess().getRestrictedDataRangeParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType ScalarDataRange_ELEMENT_TYPE = associate(ScalarDataRangeFactory.createScalarDataRangeElementType());

	public static final IGrammarAwareElementType ScalarDataRange_Alternatives_ELEMENT_TYPE = associate(ScalarDataRangeFactory.createScalarDataRange_AlternativesElementType());

	public static final IGrammarAwareElementType ScalarDataRange_ScalarParserRuleCall_0_ELEMENT_TYPE = associate(ScalarDataRangeFactory.createScalarDataRange_ScalarParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType ScalarDataRange_RestrictedDataRangeParserRuleCall_1_ELEMENT_TYPE = associate(ScalarDataRangeFactory.createScalarDataRange_RestrictedDataRangeParserRuleCall_1ElementType());

	private static class RestrictedDataRangeFactory {
		public static IGrammarAwareElementType createRestrictedDataRangeElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeRule());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_AlternativesElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_BinaryScalarRestrictionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_BinaryScalarRestrictionParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getBinaryScalarRestrictionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_IRIScalarRestrictionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_IRIScalarRestrictionParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getIRIScalarRestrictionParserRuleCall_1());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_NumericScalarRestrictionParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_NumericScalarRestrictionParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getNumericScalarRestrictionParserRuleCall_2());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_PlainLiteralScalarRestrictionParserRuleCall_3ElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_PlainLiteralScalarRestrictionParserRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getPlainLiteralScalarRestrictionParserRuleCall_3());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_ScalarOneOfRestrictionParserRuleCall_4ElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_ScalarOneOfRestrictionParserRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getScalarOneOfRestrictionParserRuleCall_4());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_StringScalarRestrictionParserRuleCall_5ElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_StringScalarRestrictionParserRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getStringScalarRestrictionParserRuleCall_5());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_SynonymScalarRestrictionParserRuleCall_6ElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_SynonymScalarRestrictionParserRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getSynonymScalarRestrictionParserRuleCall_6());
		}
		public static IGrammarAwareElementType createRestrictedDataRange_TimeScalarRestrictionParserRuleCall_7ElementType() {
			return new IGrammarAwareElementType("RestrictedDataRange_TimeScalarRestrictionParserRuleCall_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRestrictedDataRangeAccess().getTimeScalarRestrictionParserRuleCall_7());
		}
	}

	public static final IGrammarAwareElementType RestrictedDataRange_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRangeElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_Alternatives_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_AlternativesElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_BinaryScalarRestrictionParserRuleCall_0_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_BinaryScalarRestrictionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_IRIScalarRestrictionParserRuleCall_1_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_IRIScalarRestrictionParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_NumericScalarRestrictionParserRuleCall_2_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_NumericScalarRestrictionParserRuleCall_2ElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_PlainLiteralScalarRestrictionParserRuleCall_3_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_PlainLiteralScalarRestrictionParserRuleCall_3ElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_ScalarOneOfRestrictionParserRuleCall_4_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_ScalarOneOfRestrictionParserRuleCall_4ElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_StringScalarRestrictionParserRuleCall_5_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_StringScalarRestrictionParserRuleCall_5ElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_SynonymScalarRestrictionParserRuleCall_6_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_SynonymScalarRestrictionParserRuleCall_6ElementType());

	public static final IGrammarAwareElementType RestrictedDataRange_TimeScalarRestrictionParserRuleCall_7_ELEMENT_TYPE = associate(RestrictedDataRangeFactory.createRestrictedDataRange_TimeScalarRestrictionParserRuleCall_7ElementType());

	private static class DataRelationshipFactory {
		public static IGrammarAwareElementType createDataRelationshipElementType() {
			return new IGrammarAwareElementType("DataRelationship_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataRelationshipRule());
		}
		public static IGrammarAwareElementType createDataRelationship_AlternativesElementType() {
			return new IGrammarAwareElementType("DataRelationship_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataRelationshipAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createDataRelationship_EntityStructuredDataPropertyParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("DataRelationship_EntityStructuredDataPropertyParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataRelationshipAccess().getEntityStructuredDataPropertyParserRuleCall_0());
		}
		public static IGrammarAwareElementType createDataRelationship_EntityScalarDataPropertyParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("DataRelationship_EntityScalarDataPropertyParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataRelationshipAccess().getEntityScalarDataPropertyParserRuleCall_1());
		}
		public static IGrammarAwareElementType createDataRelationship_StructuredDataPropertyParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("DataRelationship_StructuredDataPropertyParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataRelationshipAccess().getStructuredDataPropertyParserRuleCall_2());
		}
		public static IGrammarAwareElementType createDataRelationship_ScalarDataPropertyParserRuleCall_3ElementType() {
			return new IGrammarAwareElementType("DataRelationship_ScalarDataPropertyParserRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataRelationshipAccess().getScalarDataPropertyParserRuleCall_3());
		}
	}

	public static final IGrammarAwareElementType DataRelationship_ELEMENT_TYPE = associate(DataRelationshipFactory.createDataRelationshipElementType());

	public static final IGrammarAwareElementType DataRelationship_Alternatives_ELEMENT_TYPE = associate(DataRelationshipFactory.createDataRelationship_AlternativesElementType());

	public static final IGrammarAwareElementType DataRelationship_EntityStructuredDataPropertyParserRuleCall_0_ELEMENT_TYPE = associate(DataRelationshipFactory.createDataRelationship_EntityStructuredDataPropertyParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType DataRelationship_EntityScalarDataPropertyParserRuleCall_1_ELEMENT_TYPE = associate(DataRelationshipFactory.createDataRelationship_EntityScalarDataPropertyParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType DataRelationship_StructuredDataPropertyParserRuleCall_2_ELEMENT_TYPE = associate(DataRelationshipFactory.createDataRelationship_StructuredDataPropertyParserRuleCall_2ElementType());

	public static final IGrammarAwareElementType DataRelationship_ScalarDataPropertyParserRuleCall_3_ELEMENT_TYPE = associate(DataRelationshipFactory.createDataRelationship_ScalarDataPropertyParserRuleCall_3ElementType());

	private static class AxiomFactory {
		public static IGrammarAwareElementType createAxiomElementType() {
			return new IGrammarAwareElementType("Axiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAxiomRule());
		}
		public static IGrammarAwareElementType createAxiom_AlternativesElementType() {
			return new IGrammarAwareElementType("Axiom_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAxiomAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createAxiom_ScalarOneOfLiteralAxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Axiom_ScalarOneOfLiteralAxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAxiomAccess().getScalarOneOfLiteralAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createAxiom_TermAxiomParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Axiom_TermAxiomParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAxiomAccess().getTermAxiomParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType Axiom_ELEMENT_TYPE = associate(AxiomFactory.createAxiomElementType());

	public static final IGrammarAwareElementType Axiom_Alternatives_ELEMENT_TYPE = associate(AxiomFactory.createAxiom_AlternativesElementType());

	public static final IGrammarAwareElementType Axiom_ScalarOneOfLiteralAxiomParserRuleCall_0_ELEMENT_TYPE = associate(AxiomFactory.createAxiom_ScalarOneOfLiteralAxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType Axiom_TermAxiomParserRuleCall_1_ELEMENT_TYPE = associate(AxiomFactory.createAxiom_TermAxiomParserRuleCall_1ElementType());

	private static class TermAxiomFactory {
		public static IGrammarAwareElementType createTermAxiomElementType() {
			return new IGrammarAwareElementType("TermAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAxiomRule());
		}
		public static IGrammarAwareElementType createTermAxiom_AlternativesElementType() {
			return new IGrammarAwareElementType("TermAxiom_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAxiomAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTermAxiom_EntityRestrictionAxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TermAxiom_EntityRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAxiomAccess().getEntityRestrictionAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTermAxiom_EntityScalarDataPropertyRestrictionAxiomParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TermAxiom_EntityScalarDataPropertyRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAxiomAccess().getEntityScalarDataPropertyRestrictionAxiomParserRuleCall_1());
		}
		public static IGrammarAwareElementType createTermAxiom_SpecializationAxiomParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("TermAxiom_SpecializationAxiomParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTermAxiomAccess().getSpecializationAxiomParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType TermAxiom_ELEMENT_TYPE = associate(TermAxiomFactory.createTermAxiomElementType());

	public static final IGrammarAwareElementType TermAxiom_Alternatives_ELEMENT_TYPE = associate(TermAxiomFactory.createTermAxiom_AlternativesElementType());

	public static final IGrammarAwareElementType TermAxiom_EntityRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE = associate(TermAxiomFactory.createTermAxiom_EntityRestrictionAxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType TermAxiom_EntityScalarDataPropertyRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE = associate(TermAxiomFactory.createTermAxiom_EntityScalarDataPropertyRestrictionAxiomParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType TermAxiom_SpecializationAxiomParserRuleCall_2_ELEMENT_TYPE = associate(TermAxiomFactory.createTermAxiom_SpecializationAxiomParserRuleCall_2ElementType());

	private static class EntityRestrictionAxiomFactory {
		public static IGrammarAwareElementType createEntityRestrictionAxiomElementType() {
			return new IGrammarAwareElementType("EntityRestrictionAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityRestrictionAxiomRule());
		}
		public static IGrammarAwareElementType createEntityRestrictionAxiom_AlternativesElementType() {
			return new IGrammarAwareElementType("EntityRestrictionAxiom_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityRestrictionAxiomAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createEntityRestrictionAxiom_EntityExistentialRestrictionAxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EntityRestrictionAxiom_EntityExistentialRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityRestrictionAxiomAccess().getEntityExistentialRestrictionAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createEntityRestrictionAxiom_EntityUniversalRestrictionAxiomParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("EntityRestrictionAxiom_EntityUniversalRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityRestrictionAxiomAccess().getEntityUniversalRestrictionAxiomParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType EntityRestrictionAxiom_ELEMENT_TYPE = associate(EntityRestrictionAxiomFactory.createEntityRestrictionAxiomElementType());

	public static final IGrammarAwareElementType EntityRestrictionAxiom_Alternatives_ELEMENT_TYPE = associate(EntityRestrictionAxiomFactory.createEntityRestrictionAxiom_AlternativesElementType());

	public static final IGrammarAwareElementType EntityRestrictionAxiom_EntityExistentialRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE = associate(EntityRestrictionAxiomFactory.createEntityRestrictionAxiom_EntityExistentialRestrictionAxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType EntityRestrictionAxiom_EntityUniversalRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE = associate(EntityRestrictionAxiomFactory.createEntityRestrictionAxiom_EntityUniversalRestrictionAxiomParserRuleCall_1ElementType());

	private static class EntityScalarDataPropertyRestrictionAxiomFactory {
		public static IGrammarAwareElementType createEntityScalarDataPropertyRestrictionAxiomElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyRestrictionAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyRestrictionAxiomRule());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyRestrictionAxiom_AlternativesElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyRestrictionAxiom_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyRestrictionAxiomAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType EntityScalarDataPropertyRestrictionAxiom_ELEMENT_TYPE = associate(EntityScalarDataPropertyRestrictionAxiomFactory.createEntityScalarDataPropertyRestrictionAxiomElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyRestrictionAxiom_Alternatives_ELEMENT_TYPE = associate(EntityScalarDataPropertyRestrictionAxiomFactory.createEntityScalarDataPropertyRestrictionAxiom_AlternativesElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyRestrictionAxiomFactory.createEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyRestrictionAxiomFactory.createEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2_ELEMENT_TYPE = associate(EntityScalarDataPropertyRestrictionAxiomFactory.createEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2ElementType());

	private static class SpecializationAxiomFactory {
		public static IGrammarAwareElementType createSpecializationAxiomElementType() {
			return new IGrammarAwareElementType("SpecializationAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecializationAxiomRule());
		}
		public static IGrammarAwareElementType createSpecializationAxiom_AlternativesElementType() {
			return new IGrammarAwareElementType("SpecializationAxiom_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecializationAxiomAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createSpecializationAxiom_ConceptSpecializationAxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("SpecializationAxiom_ConceptSpecializationAxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecializationAxiomAccess().getConceptSpecializationAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createSpecializationAxiom_AspectSpecializationAxiomParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("SpecializationAxiom_AspectSpecializationAxiomParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecializationAxiomAccess().getAspectSpecializationAxiomParserRuleCall_1());
		}
		public static IGrammarAwareElementType createSpecializationAxiom_ReifiedRelationshipSpecializationAxiomParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("SpecializationAxiom_ReifiedRelationshipSpecializationAxiomParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecializationAxiomAccess().getReifiedRelationshipSpecializationAxiomParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType SpecializationAxiom_ELEMENT_TYPE = associate(SpecializationAxiomFactory.createSpecializationAxiomElementType());

	public static final IGrammarAwareElementType SpecializationAxiom_Alternatives_ELEMENT_TYPE = associate(SpecializationAxiomFactory.createSpecializationAxiom_AlternativesElementType());

	public static final IGrammarAwareElementType SpecializationAxiom_ConceptSpecializationAxiomParserRuleCall_0_ELEMENT_TYPE = associate(SpecializationAxiomFactory.createSpecializationAxiom_ConceptSpecializationAxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType SpecializationAxiom_AspectSpecializationAxiomParserRuleCall_1_ELEMENT_TYPE = associate(SpecializationAxiomFactory.createSpecializationAxiom_AspectSpecializationAxiomParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType SpecializationAxiom_ReifiedRelationshipSpecializationAxiomParserRuleCall_2_ELEMENT_TYPE = associate(SpecializationAxiomFactory.createSpecializationAxiom_ReifiedRelationshipSpecializationAxiomParserRuleCall_2ElementType());

	private static class TerminologyBundleStatementFactory {
		public static IGrammarAwareElementType createTerminologyBundleStatementElementType() {
			return new IGrammarAwareElementType("TerminologyBundleStatement_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBundleStatementRule());
		}
		public static IGrammarAwareElementType createTerminologyBundleStatement_AlternativesElementType() {
			return new IGrammarAwareElementType("TerminologyBundleStatement_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBundleStatementAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTerminologyBundleStatement_AnonymousConceptTaxonomyAxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TerminologyBundleStatement_AnonymousConceptTaxonomyAxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBundleStatementAccess().getAnonymousConceptTaxonomyAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTerminologyBundleStatement_RootConceptTaxonomyAxiomParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TerminologyBundleStatement_RootConceptTaxonomyAxiomParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBundleStatementAccess().getRootConceptTaxonomyAxiomParserRuleCall_1());
		}
		public static IGrammarAwareElementType createTerminologyBundleStatement_SpecificDisjointConceptAxiomParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("TerminologyBundleStatement_SpecificDisjointConceptAxiomParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBundleStatementAccess().getSpecificDisjointConceptAxiomParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType TerminologyBundleStatement_ELEMENT_TYPE = associate(TerminologyBundleStatementFactory.createTerminologyBundleStatementElementType());

	public static final IGrammarAwareElementType TerminologyBundleStatement_Alternatives_ELEMENT_TYPE = associate(TerminologyBundleStatementFactory.createTerminologyBundleStatement_AlternativesElementType());

	public static final IGrammarAwareElementType TerminologyBundleStatement_AnonymousConceptTaxonomyAxiomParserRuleCall_0_ELEMENT_TYPE = associate(TerminologyBundleStatementFactory.createTerminologyBundleStatement_AnonymousConceptTaxonomyAxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType TerminologyBundleStatement_RootConceptTaxonomyAxiomParserRuleCall_1_ELEMENT_TYPE = associate(TerminologyBundleStatementFactory.createTerminologyBundleStatement_RootConceptTaxonomyAxiomParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType TerminologyBundleStatement_SpecificDisjointConceptAxiomParserRuleCall_2_ELEMENT_TYPE = associate(TerminologyBundleStatementFactory.createTerminologyBundleStatement_SpecificDisjointConceptAxiomParserRuleCall_2ElementType());

	private static class TerminologyBundleAxiomFactory {
		public static IGrammarAwareElementType createTerminologyBundleAxiomElementType() {
			return new IGrammarAwareElementType("TerminologyBundleAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBundleAxiomRule());
		}
		public static IGrammarAwareElementType createTerminologyBundleAxiom_BundledTerminologyAxiomParserRuleCallElementType() {
			return new IGrammarAwareElementType("TerminologyBundleAxiom_BundledTerminologyAxiomParserRuleCall_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyBundleAxiomAccess().getBundledTerminologyAxiomParserRuleCall());
		}
	}

	public static final IGrammarAwareElementType TerminologyBundleAxiom_ELEMENT_TYPE = associate(TerminologyBundleAxiomFactory.createTerminologyBundleAxiomElementType());

	public static final IGrammarAwareElementType TerminologyBundleAxiom_BundledTerminologyAxiomParserRuleCall_ELEMENT_TYPE = associate(TerminologyBundleAxiomFactory.createTerminologyBundleAxiom_BundledTerminologyAxiomParserRuleCallElementType());

	private static class ConceptTreeDisjunctionFactory {
		public static IGrammarAwareElementType createConceptTreeDisjunctionElementType() {
			return new IGrammarAwareElementType("ConceptTreeDisjunction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptTreeDisjunctionRule());
		}
		public static IGrammarAwareElementType createConceptTreeDisjunction_AlternativesElementType() {
			return new IGrammarAwareElementType("ConceptTreeDisjunction_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptTreeDisjunctionAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createConceptTreeDisjunction_AnonymousConceptTaxonomyAxiomParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ConceptTreeDisjunction_AnonymousConceptTaxonomyAxiomParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptTreeDisjunctionAccess().getAnonymousConceptTaxonomyAxiomParserRuleCall_0());
		}
		public static IGrammarAwareElementType createConceptTreeDisjunction_RootConceptTaxonomyAxiomParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ConceptTreeDisjunction_RootConceptTaxonomyAxiomParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptTreeDisjunctionAccess().getRootConceptTaxonomyAxiomParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType ConceptTreeDisjunction_ELEMENT_TYPE = associate(ConceptTreeDisjunctionFactory.createConceptTreeDisjunctionElementType());

	public static final IGrammarAwareElementType ConceptTreeDisjunction_Alternatives_ELEMENT_TYPE = associate(ConceptTreeDisjunctionFactory.createConceptTreeDisjunction_AlternativesElementType());

	public static final IGrammarAwareElementType ConceptTreeDisjunction_AnonymousConceptTaxonomyAxiomParserRuleCall_0_ELEMENT_TYPE = associate(ConceptTreeDisjunctionFactory.createConceptTreeDisjunction_AnonymousConceptTaxonomyAxiomParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType ConceptTreeDisjunction_RootConceptTaxonomyAxiomParserRuleCall_1_ELEMENT_TYPE = associate(ConceptTreeDisjunctionFactory.createConceptTreeDisjunction_RootConceptTaxonomyAxiomParserRuleCall_1ElementType());

	private static class TerminologyGraphKindFactory {
		public static IGrammarAwareElementType createTerminologyGraphKindElementType() {
			return new IGrammarAwareElementType("TerminologyGraphKind_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphKindRule());
		}
		public static IGrammarAwareElementType createTerminologyGraphKind_AlternativesElementType() {
			return new IGrammarAwareElementType("TerminologyGraphKind_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphKindAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphKindAccess().getOpenWorldDefinitionsEnumLiteralDeclaration_0());
		}
		public static IGrammarAwareElementType createTerminologyGraphKind_OpenWorldDefinitionsOpenKeyword_0_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraphKind_OpenWorldDefinitionsOpenKeyword_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphKindAccess().getOpenWorldDefinitionsOpenKeyword_0_0());
		}
		public static IGrammarAwareElementType createTerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1ElementType() {
			return new IGrammarAwareElementType("TerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphKindAccess().getClosedWorldDesignationsEnumLiteralDeclaration_1());
		}
		public static IGrammarAwareElementType createTerminologyGraphKind_ClosedWorldDesignationsClosedKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("TerminologyGraphKind_ClosedWorldDesignationsClosedKeyword_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyGraphKindAccess().getClosedWorldDesignationsClosedKeyword_1_0());
		}
	}

	public static final IGrammarAwareElementType TerminologyGraphKind_ELEMENT_TYPE = associate(TerminologyGraphKindFactory.createTerminologyGraphKindElementType());

	public static final IGrammarAwareElementType TerminologyGraphKind_Alternatives_ELEMENT_TYPE = associate(TerminologyGraphKindFactory.createTerminologyGraphKind_AlternativesElementType());

	public static final IGrammarAwareElementType TerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0_ELEMENT_TYPE = associate(TerminologyGraphKindFactory.createTerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraphKind_OpenWorldDefinitionsOpenKeyword_0_0_ELEMENT_TYPE = associate(TerminologyGraphKindFactory.createTerminologyGraphKind_OpenWorldDefinitionsOpenKeyword_0_0ElementType());

	public static final IGrammarAwareElementType TerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1_ELEMENT_TYPE = associate(TerminologyGraphKindFactory.createTerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1ElementType());

	public static final IGrammarAwareElementType TerminologyGraphKind_ClosedWorldDesignationsClosedKeyword_1_0_ELEMENT_TYPE = associate(TerminologyGraphKindFactory.createTerminologyGraphKind_ClosedWorldDesignationsClosedKeyword_1_0ElementType());

	private static class AspectFactory {
		public static IGrammarAwareElementType createAspectElementType() {
			return new IGrammarAwareElementType("Aspect_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectRule());
		}
		public static IGrammarAwareElementType createAspect_GroupElementType() {
			return new IGrammarAwareElementType("Aspect_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectAccess().getGroup());
		}
		public static IGrammarAwareElementType createAspect_ASPECT_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Aspect_ASPECT_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectAccess().getASPECT_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createAspect_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("Aspect_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createAspect_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Aspect_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectAccess().getNameIDTerminalRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType Aspect_ELEMENT_TYPE = associate(AspectFactory.createAspectElementType());

	public static final IGrammarAwareElementType Aspect_Group_ELEMENT_TYPE = associate(AspectFactory.createAspect_GroupElementType());

	public static final IGrammarAwareElementType Aspect_ASPECT_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(AspectFactory.createAspect_ASPECT_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType Aspect_NameAssignment_1_ELEMENT_TYPE = associate(AspectFactory.createAspect_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType Aspect_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(AspectFactory.createAspect_NameIDTerminalRuleCall_1_0ElementType());

	private static class ConceptFactory {
		public static IGrammarAwareElementType createConceptElementType() {
			return new IGrammarAwareElementType("Concept_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptRule());
		}
		public static IGrammarAwareElementType createConcept_GroupElementType() {
			return new IGrammarAwareElementType("Concept_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptAccess().getGroup());
		}
		public static IGrammarAwareElementType createConcept_IsAbstractAssignment_0ElementType() {
			return new IGrammarAwareElementType("Concept_IsAbstractAssignment_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptAccess().getIsAbstractAssignment_0());
		}
		public static IGrammarAwareElementType createConcept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("Concept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0());
		}
		public static IGrammarAwareElementType createConcept_CONCEPT_TOKENTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Concept_CONCEPT_TOKENTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptAccess().getCONCEPT_TOKENTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createConcept_NameAssignment_2ElementType() {
			return new IGrammarAwareElementType("Concept_NameAssignment_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptAccess().getNameAssignment_2());
		}
		public static IGrammarAwareElementType createConcept_NameIDTerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("Concept_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptAccess().getNameIDTerminalRuleCall_2_0());
		}
	}

	public static final IGrammarAwareElementType Concept_ELEMENT_TYPE = associate(ConceptFactory.createConceptElementType());

	public static final IGrammarAwareElementType Concept_Group_ELEMENT_TYPE = associate(ConceptFactory.createConcept_GroupElementType());

	public static final IGrammarAwareElementType Concept_IsAbstractAssignment_0_ELEMENT_TYPE = associate(ConceptFactory.createConcept_IsAbstractAssignment_0ElementType());

	public static final IGrammarAwareElementType Concept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0_ELEMENT_TYPE = associate(ConceptFactory.createConcept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType Concept_CONCEPT_TOKENTerminalRuleCall_1_ELEMENT_TYPE = associate(ConceptFactory.createConcept_CONCEPT_TOKENTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType Concept_NameAssignment_2_ELEMENT_TYPE = associate(ConceptFactory.createConcept_NameAssignment_2ElementType());

	public static final IGrammarAwareElementType Concept_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE = associate(ConceptFactory.createConcept_NameIDTerminalRuleCall_2_0ElementType());

	private static class ReifiedRelationshipFactory {
		public static IGrammarAwareElementType createReifiedRelationshipElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipRule());
		}
		public static IGrammarAwareElementType createReifiedRelationship_GroupElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getGroup());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsAbstractAssignment_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsAbstractAssignment_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsAbstractAssignment_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_REIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_REIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createReifiedRelationship_NameAssignment_2ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_NameAssignment_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getNameAssignment_2());
		}
		public static IGrammarAwareElementType createReifiedRelationship_NameIDTerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getNameIDTerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_LCURLYTerminalRuleCall_3ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_LCURLYTerminalRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getLCURLYTerminalRuleCall_3());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsFunctionalAssignment_4ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsFunctionalAssignment_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsFunctionalAssignment_4());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsInverseFunctionalAssignment_5ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsInverseFunctionalAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsInverseFunctionalAssignment_5());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsEssentialAssignment_6ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsEssentialAssignment_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsEssentialAssignment_6());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsInverseEssentialAssignment_7ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsInverseEssentialAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsInverseEssentialAssignment_7());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsSymmetricAssignment_8ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsSymmetricAssignment_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsSymmetricAssignment_8());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsAsymmetricAssignment_9ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsAsymmetricAssignment_9_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsAsymmetricAssignment_9());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsReflexiveAssignment_10ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsReflexiveAssignment_10_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsReflexiveAssignment_10());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsIrreflexiveAssignment_11ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsIrreflexiveAssignment_11_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsIrreflexiveAssignment_11());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsTransitiveAssignment_12ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsTransitiveAssignment_12_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsTransitiveAssignment_12());
		}
		public static IGrammarAwareElementType createReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_UNREIFIED_TOKENTerminalRuleCall_13ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_UNREIFIED_TOKENTerminalRuleCall_13_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getUNREIFIED_TOKENTerminalRuleCall_13());
		}
		public static IGrammarAwareElementType createReifiedRelationship_EQUALTerminalRuleCall_14ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_EQUALTerminalRuleCall_14_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_14());
		}
		public static IGrammarAwareElementType createReifiedRelationship_UnreifiedPropertyNameAssignment_15ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_UnreifiedPropertyNameAssignment_15_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getUnreifiedPropertyNameAssignment_15());
		}
		public static IGrammarAwareElementType createReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getUnreifiedPropertyNameIDTerminalRuleCall_15_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_Group_16ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_Group_16_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getGroup_16());
		}
		public static IGrammarAwareElementType createReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getINVERSE_TOKENTerminalRuleCall_16_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_EQUALTerminalRuleCall_16_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_EQUALTerminalRuleCall_16_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_16_1());
		}
		public static IGrammarAwareElementType createReifiedRelationship_UnreifiedInversePropertyNameAssignment_16_2ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_UnreifiedInversePropertyNameAssignment_16_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameAssignment_16_2());
		}
		public static IGrammarAwareElementType createReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_SOURCE_TOKENTerminalRuleCall_17ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_SOURCE_TOKENTerminalRuleCall_17_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_17());
		}
		public static IGrammarAwareElementType createReifiedRelationship_EQUALTerminalRuleCall_18ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_EQUALTerminalRuleCall_18_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_18());
		}
		public static IGrammarAwareElementType createReifiedRelationship_SourceAssignment_19ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_SourceAssignment_19_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getSourceAssignment_19());
		}
		public static IGrammarAwareElementType createReifiedRelationship_SourceEntityCrossReference_19_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_SourceEntityCrossReference_19_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getSourceEntityCrossReference_19_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_SourceEntityReferenceParserRuleCall_19_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_SourceEntityReferenceParserRuleCall_19_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getSourceEntityReferenceParserRuleCall_19_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationship_TARGET_TOKENTerminalRuleCall_20ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_TARGET_TOKENTerminalRuleCall_20_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_20());
		}
		public static IGrammarAwareElementType createReifiedRelationship_EQUALTerminalRuleCall_21ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_EQUALTerminalRuleCall_21_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_21());
		}
		public static IGrammarAwareElementType createReifiedRelationship_TargetAssignment_22ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_TargetAssignment_22_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getTargetAssignment_22());
		}
		public static IGrammarAwareElementType createReifiedRelationship_TargetEntityCrossReference_22_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_TargetEntityCrossReference_22_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getTargetEntityCrossReference_22_0());
		}
		public static IGrammarAwareElementType createReifiedRelationship_TargetEntityReferenceParserRuleCall_22_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_TargetEntityReferenceParserRuleCall_22_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getTargetEntityReferenceParserRuleCall_22_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationship_RCURLYTerminalRuleCall_23ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationship_RCURLYTerminalRuleCall_23_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipAccess().getRCURLYTerminalRuleCall_23());
		}
	}

	public static final IGrammarAwareElementType ReifiedRelationship_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationshipElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_Group_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_GroupElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsAbstractAssignment_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsAbstractAssignment_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_REIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_REIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_NameAssignment_2_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_NameAssignment_2ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_NameIDTerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_LCURLYTerminalRuleCall_3_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_LCURLYTerminalRuleCall_3ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsFunctionalAssignment_4_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsFunctionalAssignment_4ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsInverseFunctionalAssignment_5_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsInverseFunctionalAssignment_5ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsEssentialAssignment_6_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsEssentialAssignment_6ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsInverseEssentialAssignment_7_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsInverseEssentialAssignment_7ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsSymmetricAssignment_8_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsSymmetricAssignment_8ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsAsymmetricAssignment_9_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsAsymmetricAssignment_9ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsReflexiveAssignment_10_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsReflexiveAssignment_10ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsIrreflexiveAssignment_11_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsIrreflexiveAssignment_11ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsTransitiveAssignment_12_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsTransitiveAssignment_12ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_UNREIFIED_TOKENTerminalRuleCall_13_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_UNREIFIED_TOKENTerminalRuleCall_13ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_EQUALTerminalRuleCall_14_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_EQUALTerminalRuleCall_14ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_UnreifiedPropertyNameAssignment_15_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_UnreifiedPropertyNameAssignment_15ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_Group_16_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_Group_16ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_EQUALTerminalRuleCall_16_1_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_EQUALTerminalRuleCall_16_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_UnreifiedInversePropertyNameAssignment_16_2_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_UnreifiedInversePropertyNameAssignment_16_2ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_SOURCE_TOKENTerminalRuleCall_17_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_SOURCE_TOKENTerminalRuleCall_17ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_EQUALTerminalRuleCall_18_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_EQUALTerminalRuleCall_18ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_SourceAssignment_19_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_SourceAssignment_19ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_SourceEntityCrossReference_19_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_SourceEntityCrossReference_19_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_SourceEntityReferenceParserRuleCall_19_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_SourceEntityReferenceParserRuleCall_19_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_TARGET_TOKENTerminalRuleCall_20_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_TARGET_TOKENTerminalRuleCall_20ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_EQUALTerminalRuleCall_21_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_EQUALTerminalRuleCall_21ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_TargetAssignment_22_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_TargetAssignment_22ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_TargetEntityCrossReference_22_0_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_TargetEntityCrossReference_22_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_TargetEntityReferenceParserRuleCall_22_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_TargetEntityReferenceParserRuleCall_22_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationship_RCURLYTerminalRuleCall_23_ELEMENT_TYPE = associate(ReifiedRelationshipFactory.createReifiedRelationship_RCURLYTerminalRuleCall_23ElementType());

	private static class UnreifiedRelationshipFactory {
		public static IGrammarAwareElementType createUnreifiedRelationshipElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipRule());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_GroupElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getGroup());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsFunctionalAssignment_3ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsFunctionalAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsFunctionalAssignment_3());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsInverseFunctionalAssignment_4ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsInverseFunctionalAssignment_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsInverseFunctionalAssignment_4());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsEssentialAssignment_5ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsEssentialAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsEssentialAssignment_5());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsInverseEssentialAssignment_6ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsInverseEssentialAssignment_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsInverseEssentialAssignment_6());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsSymmetricAssignment_7ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsSymmetricAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsSymmetricAssignment_7());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsAsymmetricAssignment_8ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsAsymmetricAssignment_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsAsymmetricAssignment_8());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsReflexiveAssignment_9ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsReflexiveAssignment_9_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsReflexiveAssignment_9());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsIrreflexiveAssignment_10ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsIrreflexiveAssignment_10_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsIrreflexiveAssignment_10());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsTransitiveAssignment_11ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsTransitiveAssignment_11_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsTransitiveAssignment_11());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_SOURCE_TOKENTerminalRuleCall_12ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_SOURCE_TOKENTerminalRuleCall_12_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_12());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_EQUALTerminalRuleCall_13ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_EQUALTerminalRuleCall_13_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_13());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_SourceAssignment_14ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_SourceAssignment_14_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getSourceAssignment_14());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_SourceEntityCrossReference_14_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_SourceEntityCrossReference_14_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getSourceEntityCrossReference_14_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_SourceEntityReferenceParserRuleCall_14_0_1ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_SourceEntityReferenceParserRuleCall_14_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getSourceEntityReferenceParserRuleCall_14_0_1());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_15());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_EQUALTerminalRuleCall_16ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_EQUALTerminalRuleCall_16_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_16());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_TargetAssignment_17ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_TargetAssignment_17_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getTargetAssignment_17());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_TargetEntityCrossReference_17_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_TargetEntityCrossReference_17_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getTargetEntityCrossReference_17_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_TargetEntityReferenceParserRuleCall_17_0_1ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_TargetEntityReferenceParserRuleCall_17_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getTargetEntityReferenceParserRuleCall_17_0_1());
		}
		public static IGrammarAwareElementType createUnreifiedRelationship_RCURLYTerminalRuleCall_18ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationship_RCURLYTerminalRuleCall_18_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipAccess().getRCURLYTerminalRuleCall_18());
		}
	}

	public static final IGrammarAwareElementType UnreifiedRelationship_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationshipElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_Group_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_GroupElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_NameAssignment_1_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsFunctionalAssignment_3_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsFunctionalAssignment_3ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsInverseFunctionalAssignment_4_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsInverseFunctionalAssignment_4ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsEssentialAssignment_5_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsEssentialAssignment_5ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsInverseEssentialAssignment_6_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsInverseEssentialAssignment_6ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsSymmetricAssignment_7_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsSymmetricAssignment_7ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsAsymmetricAssignment_8_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsAsymmetricAssignment_8ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsReflexiveAssignment_9_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsReflexiveAssignment_9ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsIrreflexiveAssignment_10_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsIrreflexiveAssignment_10ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsTransitiveAssignment_11_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsTransitiveAssignment_11ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_SOURCE_TOKENTerminalRuleCall_12_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_SOURCE_TOKENTerminalRuleCall_12ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_EQUALTerminalRuleCall_13_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_EQUALTerminalRuleCall_13ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_SourceAssignment_14_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_SourceAssignment_14ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_SourceEntityCrossReference_14_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_SourceEntityCrossReference_14_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_SourceEntityReferenceParserRuleCall_14_0_1_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_SourceEntityReferenceParserRuleCall_14_0_1ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_EQUALTerminalRuleCall_16_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_EQUALTerminalRuleCall_16ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_TargetAssignment_17_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_TargetAssignment_17ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_TargetEntityCrossReference_17_0_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_TargetEntityCrossReference_17_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_TargetEntityReferenceParserRuleCall_17_0_1_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_TargetEntityReferenceParserRuleCall_17_0_1ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationship_RCURLYTerminalRuleCall_18_ELEMENT_TYPE = associate(UnreifiedRelationshipFactory.createUnreifiedRelationship_RCURLYTerminalRuleCall_18ElementType());

	private static class ScalarFactory {
		public static IGrammarAwareElementType createScalarElementType() {
			return new IGrammarAwareElementType("Scalar_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarRule());
		}
		public static IGrammarAwareElementType createScalar_GroupElementType() {
			return new IGrammarAwareElementType("Scalar_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarAccess().getGroup());
		}
		public static IGrammarAwareElementType createScalar_SCALAR_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Scalar_SCALAR_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarAccess().getSCALAR_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createScalar_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("Scalar_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createScalar_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Scalar_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarAccess().getNameIDTerminalRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType Scalar_ELEMENT_TYPE = associate(ScalarFactory.createScalarElementType());

	public static final IGrammarAwareElementType Scalar_Group_ELEMENT_TYPE = associate(ScalarFactory.createScalar_GroupElementType());

	public static final IGrammarAwareElementType Scalar_SCALAR_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(ScalarFactory.createScalar_SCALAR_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType Scalar_NameAssignment_1_ELEMENT_TYPE = associate(ScalarFactory.createScalar_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType Scalar_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(ScalarFactory.createScalar_NameIDTerminalRuleCall_1_0ElementType());

	private static class StructureFactory {
		public static IGrammarAwareElementType createStructureElementType() {
			return new IGrammarAwareElementType("Structure_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructureRule());
		}
		public static IGrammarAwareElementType createStructure_GroupElementType() {
			return new IGrammarAwareElementType("Structure_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructureAccess().getGroup());
		}
		public static IGrammarAwareElementType createStructure_STRUCTURE_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Structure_STRUCTURE_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructureAccess().getSTRUCTURE_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createStructure_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("Structure_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructureAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createStructure_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Structure_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructureAccess().getNameIDTerminalRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType Structure_ELEMENT_TYPE = associate(StructureFactory.createStructureElementType());

	public static final IGrammarAwareElementType Structure_Group_ELEMENT_TYPE = associate(StructureFactory.createStructure_GroupElementType());

	public static final IGrammarAwareElementType Structure_STRUCTURE_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(StructureFactory.createStructure_STRUCTURE_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType Structure_NameAssignment_1_ELEMENT_TYPE = associate(StructureFactory.createStructure_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType Structure_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(StructureFactory.createStructure_NameIDTerminalRuleCall_1_0ElementType());

	private static class EntityStructuredDataPropertyFactory {
		public static IGrammarAwareElementType createEntityStructuredDataPropertyElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyRule());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_GroupElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getGroup());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getEntityStructuredDataPropertyKeyword_0());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_DomainAssignment_4ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_DomainAssignment_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getDomainAssignment_4());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_DomainEntityCrossReference_4_0ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_DomainEntityCrossReference_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getDomainEntityCrossReference_4_0());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_DomainEntityReferenceParserRuleCall_4_0_1ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_DomainEntityReferenceParserRuleCall_4_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_RangeAssignment_6ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_RangeAssignment_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getRangeAssignment_6());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_RangeStructureCrossReference_6_0ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_RangeStructureCrossReference_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1());
		}
		public static IGrammarAwareElementType createEntityStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType() {
			return new IGrammarAwareElementType("EntityStructuredDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7());
		}
	}

	public static final IGrammarAwareElementType EntityStructuredDataProperty_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataPropertyElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_Group_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_GroupElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_NameAssignment_1_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_DomainAssignment_4_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_DomainAssignment_4ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_DomainEntityCrossReference_4_0_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_DomainEntityCrossReference_4_0ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_DomainEntityReferenceParserRuleCall_4_0_1_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_DomainEntityReferenceParserRuleCall_4_0_1ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_RangeAssignment_6_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_RangeAssignment_6ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_RangeStructureCrossReference_6_0_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_RangeStructureCrossReference_6_0ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1ElementType());

	public static final IGrammarAwareElementType EntityStructuredDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE = associate(EntityStructuredDataPropertyFactory.createEntityStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType());

	private static class EntityScalarDataPropertyFactory {
		public static IGrammarAwareElementType createEntityScalarDataPropertyElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyRule());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_GroupElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getGroup());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_EntityScalarDataPropertyKeyword_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_EntityScalarDataPropertyKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getEntityScalarDataPropertyKeyword_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_DomainAssignment_4ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_DomainAssignment_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getDomainAssignment_4());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_DomainEntityCrossReference_4_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_DomainEntityCrossReference_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getDomainEntityCrossReference_4_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_DomainEntityReferenceParserRuleCall_4_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_DomainEntityReferenceParserRuleCall_4_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_RangeAssignment_6ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_RangeAssignment_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getRangeAssignment_6());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_RangeDataRangeCrossReference_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataProperty_RCURLYTerminalRuleCall_7ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7());
		}
	}

	public static final IGrammarAwareElementType EntityScalarDataProperty_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataPropertyElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_Group_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_GroupElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_EntityScalarDataPropertyKeyword_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_EntityScalarDataPropertyKeyword_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_NameAssignment_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_DomainAssignment_4_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_DomainAssignment_4ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_DomainEntityCrossReference_4_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_DomainEntityCrossReference_4_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_DomainEntityReferenceParserRuleCall_4_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_DomainEntityReferenceParserRuleCall_4_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_RangeAssignment_6_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_RangeAssignment_6ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_RangeDataRangeCrossReference_6_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE = associate(EntityScalarDataPropertyFactory.createEntityScalarDataProperty_RCURLYTerminalRuleCall_7ElementType());

	private static class StructuredDataPropertyFactory {
		public static IGrammarAwareElementType createStructuredDataPropertyElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyRule());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_GroupElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getGroup());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_StructuredDataPropertyKeyword_0ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_StructuredDataPropertyKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getStructuredDataPropertyKeyword_0());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_DomainAssignment_4ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_DomainAssignment_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getDomainAssignment_4());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_DomainStructureCrossReference_4_0ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_DomainStructureCrossReference_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getDomainStructureCrossReference_4_0());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_DomainStructureReferenceParserRuleCall_4_0_1ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_DomainStructureReferenceParserRuleCall_4_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_RangeAssignment_6ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_RangeAssignment_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getRangeAssignment_6());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_RangeStructureCrossReference_6_0ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_RangeStructureCrossReference_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1());
		}
		public static IGrammarAwareElementType createStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType() {
			return new IGrammarAwareElementType("StructuredDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7());
		}
	}

	public static final IGrammarAwareElementType StructuredDataProperty_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataPropertyElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_Group_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_GroupElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_StructuredDataPropertyKeyword_0_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_StructuredDataPropertyKeyword_0ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_NameAssignment_1_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_DomainAssignment_4_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_DomainAssignment_4ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_DomainStructureCrossReference_4_0_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_DomainStructureCrossReference_4_0ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_DomainStructureReferenceParserRuleCall_4_0_1_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_DomainStructureReferenceParserRuleCall_4_0_1ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_RangeAssignment_6_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_RangeAssignment_6ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_RangeStructureCrossReference_6_0_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_RangeStructureCrossReference_6_0ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1ElementType());

	public static final IGrammarAwareElementType StructuredDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE = associate(StructuredDataPropertyFactory.createStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType());

	private static class ScalarDataPropertyFactory {
		public static IGrammarAwareElementType createScalarDataPropertyElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyRule());
		}
		public static IGrammarAwareElementType createScalarDataProperty_GroupElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getGroup());
		}
		public static IGrammarAwareElementType createScalarDataProperty_ScalarDataPropertyKeyword_0ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_ScalarDataPropertyKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getScalarDataPropertyKeyword_0());
		}
		public static IGrammarAwareElementType createScalarDataProperty_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createScalarDataProperty_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
		}
		public static IGrammarAwareElementType createScalarDataProperty_DomainAssignment_4ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_DomainAssignment_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getDomainAssignment_4());
		}
		public static IGrammarAwareElementType createScalarDataProperty_DomainStructureCrossReference_4_0ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_DomainStructureCrossReference_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getDomainStructureCrossReference_4_0());
		}
		public static IGrammarAwareElementType createScalarDataProperty_DomainStructureReferenceParserRuleCall_4_0_1ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_DomainStructureReferenceParserRuleCall_4_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1());
		}
		public static IGrammarAwareElementType createScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
		}
		public static IGrammarAwareElementType createScalarDataProperty_RangeAssignment_6ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_RangeAssignment_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getRangeAssignment_6());
		}
		public static IGrammarAwareElementType createScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_RangeDataRangeCrossReference_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0());
		}
		public static IGrammarAwareElementType createScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1());
		}
		public static IGrammarAwareElementType createScalarDataProperty_RCURLYTerminalRuleCall_7ElementType() {
			return new IGrammarAwareElementType("ScalarDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7());
		}
	}

	public static final IGrammarAwareElementType ScalarDataProperty_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataPropertyElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_Group_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_GroupElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_ScalarDataPropertyKeyword_0_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_ScalarDataPropertyKeyword_0ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_NameAssignment_1_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_DomainAssignment_4_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_DomainAssignment_4ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_DomainStructureCrossReference_4_0_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_DomainStructureCrossReference_4_0ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_DomainStructureReferenceParserRuleCall_4_0_1_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_DomainStructureReferenceParserRuleCall_4_0_1ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_RangeAssignment_6_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_RangeAssignment_6ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_RangeDataRangeCrossReference_6_0_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1ElementType());

	public static final IGrammarAwareElementType ScalarDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE = associate(ScalarDataPropertyFactory.createScalarDataProperty_RCURLYTerminalRuleCall_7ElementType());

	private static class AnonymousConceptTaxonomyAxiomFactory {
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiomElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomRule());
		}
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiom_GroupElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomAccess().getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2ElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentKeyword_2());
		}
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentAssignment_3ElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentAssignment_3());
		}
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0());
		}
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createAnonymousConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("AnonymousConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAnonymousConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4());
		}
	}

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiomElementType());

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_Group_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiom_GroupElementType());

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2ElementType());

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentAssignment_3_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentAssignment_3ElementType());

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType AnonymousConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE = associate(AnonymousConceptTaxonomyAxiomFactory.createAnonymousConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType());

	private static class RootConceptTaxonomyAxiomFactory {
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiomElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomRule());
		}
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiom_GroupElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomAccess().getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiom_RootKeyword_2ElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_RootKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomAccess().getRootKeyword_2());
		}
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiom_RootAssignment_3ElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_RootAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomAccess().getRootAssignment_3());
		}
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiom_RootConceptCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_RootConceptCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomAccess().getRootConceptCrossReference_3_0());
		}
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiom_RootConceptReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_RootConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomAccess().getRootConceptReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createRootConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("RootConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRootConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4());
		}
	}

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiomElementType());

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_Group_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiom_GroupElementType());

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_RootKeyword_2_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiom_RootKeyword_2ElementType());

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_RootAssignment_3_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiom_RootAssignment_3ElementType());

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_RootConceptCrossReference_3_0_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiom_RootConceptCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_RootConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiom_RootConceptReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType RootConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE = associate(RootConceptTaxonomyAxiomFactory.createRootConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType());

	private static class SpecificDisjointConceptAxiomFactory {
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiomElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomRule());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_GroupElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentKeyword_2());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_DisjointTaxonomyParentAssignment_3ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_DisjointTaxonomyParentAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentAssignment_3());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_DisjointLeafKeyword_4ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_DisjointLeafKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getDisjointLeafKeyword_4());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_DisjointLeafAssignment_5ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_DisjointLeafAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getDisjointLeafAssignment_5());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptCrossReference_5_0());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_DisjointLeafConceptReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_DisjointLeafConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createSpecificDisjointConceptAxiom_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("SpecificDisjointConceptAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSpecificDisjointConceptAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiomElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_Group_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_GroupElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_DisjointTaxonomyParentAssignment_3_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_DisjointTaxonomyParentAssignment_3ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_DisjointLeafKeyword_4_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_DisjointLeafKeyword_4ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_DisjointLeafAssignment_5_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_DisjointLeafAssignment_5ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_DisjointLeafConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_DisjointLeafConceptReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType SpecificDisjointConceptAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(SpecificDisjointConceptAxiomFactory.createSpecificDisjointConceptAxiom_RCURLYTerminalRuleCall_6ElementType());

	private static class BundledTerminologyAxiomFactory {
		public static IGrammarAwareElementType createBundledTerminologyAxiomElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomRule());
		}
		public static IGrammarAwareElementType createBundledTerminologyAxiom_GroupElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createBundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomAccess().getBUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createBundledTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createBundledTerminologyAxiom_BundledTerminologyKeyword_2ElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_BundledTerminologyKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomAccess().getBundledTerminologyKeyword_2());
		}
		public static IGrammarAwareElementType createBundledTerminologyAxiom_BundledTerminologyAssignment_3ElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_BundledTerminologyAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomAccess().getBundledTerminologyAssignment_3());
		}
		public static IGrammarAwareElementType createBundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxCrossReference_3_0());
		}
		public static IGrammarAwareElementType createBundledTerminologyAxiom_BundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_BundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createBundledTerminologyAxiom_RCURLYTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("BundledTerminologyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBundledTerminologyAxiomAccess().getRCURLYTerminalRuleCall_4());
		}
	}

	public static final IGrammarAwareElementType BundledTerminologyAxiom_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiomElementType());

	public static final IGrammarAwareElementType BundledTerminologyAxiom_Group_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiom_GroupElementType());

	public static final IGrammarAwareElementType BundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType BundledTerminologyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType BundledTerminologyAxiom_BundledTerminologyKeyword_2_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiom_BundledTerminologyKeyword_2ElementType());

	public static final IGrammarAwareElementType BundledTerminologyAxiom_BundledTerminologyAssignment_3_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiom_BundledTerminologyAssignment_3ElementType());

	public static final IGrammarAwareElementType BundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType BundledTerminologyAxiom_BundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiom_BundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType BundledTerminologyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE = associate(BundledTerminologyAxiomFactory.createBundledTerminologyAxiom_RCURLYTerminalRuleCall_4ElementType());

	private static class ConceptDesignationTerminologyAxiomFactory {
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiomElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomRule());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_GroupElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyKeyword_2());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_DesignatedTerminologyAssignment_3ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_DesignatedTerminologyAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyAssignment_3());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxCrossReference_3_0());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptKeyword_4());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_DesignatedConceptAssignment_5ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_DesignatedConceptAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptAssignment_5());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptCrossReference_5_0());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_DesignatedConceptConceptReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_DesignatedConceptConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createConceptDesignationTerminologyAxiom_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("ConceptDesignationTerminologyAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptDesignationTerminologyAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiomElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_Group_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_GroupElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_DesignatedTerminologyAssignment_3_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_DesignatedTerminologyAssignment_3ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_DesignatedConceptAssignment_5_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_DesignatedConceptAssignment_5ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_DesignatedConceptConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_DesignatedConceptConceptReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType ConceptDesignationTerminologyAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(ConceptDesignationTerminologyAxiomFactory.createConceptDesignationTerminologyAxiom_RCURLYTerminalRuleCall_6ElementType());

	private static class TerminologyExtensionAxiomFactory {
		public static IGrammarAwareElementType createTerminologyExtensionAxiomElementType() {
			return new IGrammarAwareElementType("TerminologyExtensionAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtensionAxiomRule());
		}
		public static IGrammarAwareElementType createTerminologyExtensionAxiom_GroupElementType() {
			return new IGrammarAwareElementType("TerminologyExtensionAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtensionAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createTerminologyExtensionAxiom_EXTENDS_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TerminologyExtensionAxiom_EXTENDS_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtensionAxiomAccess().getEXTENDS_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createTerminologyExtensionAxiom_ExtendedTerminologyAssignment_1ElementType() {
			return new IGrammarAwareElementType("TerminologyExtensionAxiom_ExtendedTerminologyAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtensionAxiomAccess().getExtendedTerminologyAssignment_1());
		}
		public static IGrammarAwareElementType createTerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxCrossReference_1_0ElementType() {
			return new IGrammarAwareElementType("TerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxCrossReference_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxCrossReference_1_0());
		}
		public static IGrammarAwareElementType createTerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1ElementType() {
			return new IGrammarAwareElementType("TerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1());
		}
	}

	public static final IGrammarAwareElementType TerminologyExtensionAxiom_ELEMENT_TYPE = associate(TerminologyExtensionAxiomFactory.createTerminologyExtensionAxiomElementType());

	public static final IGrammarAwareElementType TerminologyExtensionAxiom_Group_ELEMENT_TYPE = associate(TerminologyExtensionAxiomFactory.createTerminologyExtensionAxiom_GroupElementType());

	public static final IGrammarAwareElementType TerminologyExtensionAxiom_EXTENDS_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(TerminologyExtensionAxiomFactory.createTerminologyExtensionAxiom_EXTENDS_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType TerminologyExtensionAxiom_ExtendedTerminologyAssignment_1_ELEMENT_TYPE = associate(TerminologyExtensionAxiomFactory.createTerminologyExtensionAxiom_ExtendedTerminologyAssignment_1ElementType());

	public static final IGrammarAwareElementType TerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxCrossReference_1_0_ELEMENT_TYPE = associate(TerminologyExtensionAxiomFactory.createTerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxCrossReference_1_0ElementType());

	public static final IGrammarAwareElementType TerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE = associate(TerminologyExtensionAxiomFactory.createTerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1ElementType());

	private static class TerminologyNestingAxiomFactory {
		public static IGrammarAwareElementType createTerminologyNestingAxiomElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomRule());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_GroupElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getTERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_NestingTerminologyKeyword_2ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_NestingTerminologyKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getNestingTerminologyKeyword_2());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_NestingTerminologyAssignment_3ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_NestingTerminologyAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getNestingTerminologyAssignment_3());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxCrossReference_3_0());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_NestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_NestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_NestingContextKeyword_4ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_NestingContextKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getNestingContextKeyword_4());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_NestingContextAssignment_5ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_NestingContextAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getNestingContextAssignment_5());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_NestingContextConceptCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_NestingContextConceptCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getNestingContextConceptCrossReference_5_0());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_NestingContextConceptReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_NestingContextConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getNestingContextConceptReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createTerminologyNestingAxiom_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("TerminologyNestingAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyNestingAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType TerminologyNestingAxiom_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiomElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_Group_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_GroupElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_NestingTerminologyKeyword_2_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_NestingTerminologyKeyword_2ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_NestingTerminologyAssignment_3_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_NestingTerminologyAssignment_3ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_NestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_NestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_NestingContextKeyword_4_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_NestingContextKeyword_4ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_NestingContextAssignment_5_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_NestingContextAssignment_5ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_NestingContextConceptCrossReference_5_0_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_NestingContextConceptCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_NestingContextConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_NestingContextConceptReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType TerminologyNestingAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(TerminologyNestingAxiomFactory.createTerminologyNestingAxiom_RCURLYTerminalRuleCall_6ElementType());

	private static class EntityExistentialRestrictionAxiomFactory {
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiomElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomRule());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_GroupElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationKeyword_2());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedRelationAssignment_3ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedRelationAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationAssignment_3());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeKeyword_4());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedRangeAssignment_5ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedRangeAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeAssignment_5());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainKeyword_6());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedDomainAssignment_7ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedDomainAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainAssignment_7());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1());
		}
		public static IGrammarAwareElementType createEntityExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
			return new IGrammarAwareElementType("EntityExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	}

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiomElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_Group_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_GroupElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedRelationAssignment_3_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedRelationAssignment_3ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedRangeAssignment_5_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedRangeAssignment_5ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedDomainAssignment_7_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedDomainAssignment_7ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1ElementType());

	public static final IGrammarAwareElementType EntityExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE = associate(EntityExistentialRestrictionAxiomFactory.createEntityExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());

	private static class EntityUniversalRestrictionAxiomFactory {
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiomElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomRule());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_GroupElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationKeyword_2());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedRelationAssignment_3ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedRelationAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationAssignment_3());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeKeyword_4());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedRangeAssignment_5ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedRangeAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeAssignment_5());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainKeyword_6());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedDomainAssignment_7ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedDomainAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainAssignment_7());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1());
		}
		public static IGrammarAwareElementType createEntityUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
			return new IGrammarAwareElementType("EntityUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	}

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiomElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_Group_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_GroupElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedRelationAssignment_3_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedRelationAssignment_3ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedRangeAssignment_5_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedRangeAssignment_5ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedDomainAssignment_7_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedDomainAssignment_7ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1ElementType());

	public static final IGrammarAwareElementType EntityUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE = associate(EntityUniversalRestrictionAxiomFactory.createEntityUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());

	private static class AspectSpecializationAxiomFactory {
		public static IGrammarAwareElementType createAspectSpecializationAxiomElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomRule());
		}
		public static IGrammarAwareElementType createAspectSpecializationAxiom_GroupElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createAspectSpecializationAxiom_SubEntityAssignment_0ElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_SubEntityAssignment_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomAccess().getSubEntityAssignment_0());
		}
		public static IGrammarAwareElementType createAspectSpecializationAxiom_SubEntityEntityCrossReference_0_0ElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_SubEntityEntityCrossReference_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomAccess().getSubEntityEntityCrossReference_0_0());
		}
		public static IGrammarAwareElementType createAspectSpecializationAxiom_SubEntityEntityReferenceParserRuleCall_0_0_1ElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_SubEntityEntityReferenceParserRuleCall_0_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomAccess().getSubEntityEntityReferenceParserRuleCall_0_0_1());
		}
		public static IGrammarAwareElementType createAspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomAccess().getASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createAspectSpecializationAxiom_SuperAspectAssignment_2ElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_SuperAspectAssignment_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomAccess().getSuperAspectAssignment_2());
		}
		public static IGrammarAwareElementType createAspectSpecializationAxiom_SuperAspectAspectCrossReference_2_0ElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_SuperAspectAspectCrossReference_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomAccess().getSuperAspectAspectCrossReference_2_0());
		}
		public static IGrammarAwareElementType createAspectSpecializationAxiom_SuperAspectAspectReferenceParserRuleCall_2_0_1ElementType() {
			return new IGrammarAwareElementType("AspectSpecializationAxiom_SuperAspectAspectReferenceParserRuleCall_2_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAspectSpecializationAxiomAccess().getSuperAspectAspectReferenceParserRuleCall_2_0_1());
		}
	}

	public static final IGrammarAwareElementType AspectSpecializationAxiom_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiomElementType());

	public static final IGrammarAwareElementType AspectSpecializationAxiom_Group_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiom_GroupElementType());

	public static final IGrammarAwareElementType AspectSpecializationAxiom_SubEntityAssignment_0_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiom_SubEntityAssignment_0ElementType());

	public static final IGrammarAwareElementType AspectSpecializationAxiom_SubEntityEntityCrossReference_0_0_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiom_SubEntityEntityCrossReference_0_0ElementType());

	public static final IGrammarAwareElementType AspectSpecializationAxiom_SubEntityEntityReferenceParserRuleCall_0_0_1_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiom_SubEntityEntityReferenceParserRuleCall_0_0_1ElementType());

	public static final IGrammarAwareElementType AspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType AspectSpecializationAxiom_SuperAspectAssignment_2_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiom_SuperAspectAssignment_2ElementType());

	public static final IGrammarAwareElementType AspectSpecializationAxiom_SuperAspectAspectCrossReference_2_0_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiom_SuperAspectAspectCrossReference_2_0ElementType());

	public static final IGrammarAwareElementType AspectSpecializationAxiom_SuperAspectAspectReferenceParserRuleCall_2_0_1_ELEMENT_TYPE = associate(AspectSpecializationAxiomFactory.createAspectSpecializationAxiom_SuperAspectAspectReferenceParserRuleCall_2_0_1ElementType());

	private static class ConceptSpecializationAxiomFactory {
		public static IGrammarAwareElementType createConceptSpecializationAxiomElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomRule());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_GroupElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getCONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_SubConceptKeyword_2ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_SubConceptKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getSubConceptKeyword_2());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_SubConceptAssignment_3ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_SubConceptAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getSubConceptAssignment_3());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getSubConceptConceptCrossReference_3_0());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_SubConceptConceptReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_SubConceptConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getSubConceptConceptReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_SuperConceptKeyword_4ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_SuperConceptKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getSuperConceptKeyword_4());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_SuperConceptAssignment_5ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_SuperConceptAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getSuperConceptAssignment_5());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getSuperConceptConceptCrossReference_5_0());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_SuperConceptConceptReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_SuperConceptConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getSuperConceptConceptReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createConceptSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("ConceptSpecializationAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptSpecializationAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiomElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_Group_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_GroupElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_SubConceptKeyword_2_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_SubConceptKeyword_2ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_SubConceptAssignment_3_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_SubConceptAssignment_3ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_SubConceptConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_SubConceptConceptReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_SuperConceptKeyword_4_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_SuperConceptKeyword_4ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_SuperConceptAssignment_5_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_SuperConceptAssignment_5ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_SuperConceptConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_SuperConceptConceptReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType ConceptSpecializationAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(ConceptSpecializationAxiomFactory.createConceptSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType());

	private static class ReifiedRelationshipSpecializationAxiomFactory {
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiomElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomRule());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_GroupElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipKeyword_2());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_SubRelationshipAssignment_3ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_SubRelationshipAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipAssignment_3());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipCrossReference_3_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipKeyword_4());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_SuperRelationshipAssignment_5ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_SuperRelationshipAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipAssignment_5());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipCrossReference_5_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipSpecializationAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipSpecializationAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiomElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_Group_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_GroupElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_SubRelationshipAssignment_3_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_SubRelationshipAssignment_3ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_SuperRelationshipAssignment_5_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_SuperRelationshipAssignment_5ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipSpecializationAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(ReifiedRelationshipSpecializationAxiomFactory.createReifiedRelationshipSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType());

	private static class EntityScalarDataPropertyExistentialRestrictionAxiomFactory {
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiomElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomRule());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_GroupElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityAssignment_3ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityAssignment_3());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyKeyword_4());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyAssignment_5ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyAssignment_5());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionKeyword_6());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionAssignment_7ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionAssignment_7());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	}

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiomElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_Group_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_GroupElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityAssignment_3ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyAssignment_5ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionAssignment_7_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionAssignment_7ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE = associate(EntityScalarDataPropertyExistentialRestrictionAxiomFactory.createEntityScalarDataPropertyExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());

	private static class EntityScalarDataPropertyParticularRestrictionAxiomFactory {
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiomElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomRule());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_GroupElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityAssignment_3ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityAssignment_3());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyKeyword_4());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyAssignment_5ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyAssignment_5());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueKeyword_6());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueAssignment_7ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueAssignment_7());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueSTRINGTerminalRuleCall_7_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyParticularRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyParticularRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	}

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiomElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_Group_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_GroupElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityAssignment_3ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyAssignment_5ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueAssignment_7_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueAssignment_7ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyParticularRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE = associate(EntityScalarDataPropertyParticularRestrictionAxiomFactory.createEntityScalarDataPropertyParticularRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());

	private static class EntityScalarDataPropertyUniversalRestrictionAxiomFactory {
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiomElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomRule());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_GroupElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityAssignment_3ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityAssignment_3());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyKeyword_4());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyAssignment_5ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyAssignment_5());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionKeyword_6());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionAssignment_7ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionAssignment_7());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1());
		}
		public static IGrammarAwareElementType createEntityScalarDataPropertyUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
			return new IGrammarAwareElementType("EntityScalarDataPropertyUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	}

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiomElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_Group_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_GroupElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityAssignment_3ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyAssignment_5ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionAssignment_7_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionAssignment_7ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1ElementType());

	public static final IGrammarAwareElementType EntityScalarDataPropertyUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE = associate(EntityScalarDataPropertyUniversalRestrictionAxiomFactory.createEntityScalarDataPropertyUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());

	private static class BinaryScalarRestrictionFactory {
		public static IGrammarAwareElementType createBinaryScalarRestrictionElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionRule());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_GroupElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getGroup());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getBINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_Group_3ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_Group_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_LengthKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getLengthKeyword_3_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_LengthAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getLengthAssignment_3_1());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_Group_4ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_Group_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_MinLengthKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getMinLengthKeyword_4_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_MinLengthAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getMinLengthAssignment_4_1());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_Group_5ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_Group_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getGroup_5());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_MaxLengthKeyword_5_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getMaxLengthKeyword_5_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_MaxLengthAssignment_5_1ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getMaxLengthAssignment_5_1());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_RestrictedRangeKeyword_6ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_RestrictedRangeKeyword_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getRestrictedRangeKeyword_6());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_RestrictedRangeAssignment_7ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_RestrictedRangeAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getRestrictedRangeAssignment_7());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_7_0());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_7_0_1ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_7_0_1());
		}
		public static IGrammarAwareElementType createBinaryScalarRestriction_RCURLYTerminalRuleCall_8ElementType() {
			return new IGrammarAwareElementType("BinaryScalarRestriction_RCURLYTerminalRuleCall_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBinaryScalarRestrictionAccess().getRCURLYTerminalRuleCall_8());
		}
	}

	public static final IGrammarAwareElementType BinaryScalarRestriction_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestrictionElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_Group_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_GroupElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_NameAssignment_1_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_Group_3_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_Group_3ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_LengthKeyword_3_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_LengthAssignment_3_1ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_Group_4_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_Group_4ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_MinLengthKeyword_4_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_MinLengthAssignment_4_1ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_Group_5_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_Group_5ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_MaxLengthKeyword_5_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_MaxLengthAssignment_5_1ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_RestrictedRangeKeyword_6_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_RestrictedRangeKeyword_6ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_RestrictedRangeAssignment_7_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_RestrictedRangeAssignment_7ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_7_0_1ElementType());

	public static final IGrammarAwareElementType BinaryScalarRestriction_RCURLYTerminalRuleCall_8_ELEMENT_TYPE = associate(BinaryScalarRestrictionFactory.createBinaryScalarRestriction_RCURLYTerminalRuleCall_8ElementType());

	private static class IRIScalarRestrictionFactory {
		public static IGrammarAwareElementType createIRIScalarRestrictionElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionRule());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_GroupElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getGroup());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getIRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_Group_3ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_Group_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_LengthKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getLengthKeyword_3_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_LengthAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getLengthAssignment_3_1());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_Group_4ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_Group_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_MinLengthKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getMinLengthKeyword_4_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_MinLengthAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getMinLengthAssignment_4_1());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_Group_5ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_Group_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getGroup_5());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_MaxLengthKeyword_5_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getMaxLengthKeyword_5_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_MaxLengthAssignment_5_1ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getMaxLengthAssignment_5_1());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_Group_6ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_Group_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getGroup_6());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_PatternKeyword_6_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getPatternKeyword_6_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_PatternAssignment_6_1ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getPatternAssignment_6_1());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_RestrictedRangeKeyword_7ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getRestrictedRangeKeyword_7());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_RestrictedRangeAssignment_8ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getRestrictedRangeAssignment_8());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1());
		}
		public static IGrammarAwareElementType createIRIScalarRestriction_RCURLYTerminalRuleCall_9ElementType() {
			return new IGrammarAwareElementType("IRIScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getIRIScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
		}
	}

	public static final IGrammarAwareElementType IRIScalarRestriction_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestrictionElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_Group_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_GroupElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_NameAssignment_1_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_Group_3_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_Group_3ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_LengthKeyword_3_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_LengthAssignment_3_1ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_Group_4_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_Group_4ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_MinLengthKeyword_4_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_MinLengthAssignment_4_1ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_Group_5_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_Group_5ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_MaxLengthKeyword_5_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_MaxLengthAssignment_5_1ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_Group_6_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_Group_6ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_PatternKeyword_6_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_PatternAssignment_6_1ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_RestrictedRangeKeyword_7ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_RestrictedRangeAssignment_8ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType());

	public static final IGrammarAwareElementType IRIScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE = associate(IRIScalarRestrictionFactory.createIRIScalarRestriction_RCURLYTerminalRuleCall_9ElementType());

	private static class NumericScalarRestrictionFactory {
		public static IGrammarAwareElementType createNumericScalarRestrictionElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionRule());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_GroupElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getGroup());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getNUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_Group_3ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_Group_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MinInclusiveKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MinInclusiveKeyword_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMinInclusiveKeyword_3_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MinInclusiveAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MinInclusiveAssignment_3_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMinInclusiveAssignment_3_1());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_Group_4ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_Group_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MaxInclusiveKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MaxInclusiveKeyword_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMaxInclusiveKeyword_4_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MaxInclusiveAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MaxInclusiveAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMaxInclusiveAssignment_4_1());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_Group_5ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_Group_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getGroup_5());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MinExclusiveKeyword_5_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MinExclusiveKeyword_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMinExclusiveKeyword_5_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MinExclusiveAssignment_5_1ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MinExclusiveAssignment_5_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMinExclusiveAssignment_5_1());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_Group_6ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_Group_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getGroup_6());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MaxExclusiveKeyword_6_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MaxExclusiveKeyword_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMaxExclusiveKeyword_6_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MaxExclusiveAssignment_6_1ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MaxExclusiveAssignment_6_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMaxExclusiveAssignment_6_1());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_RestrictedRangeKeyword_7ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getRestrictedRangeKeyword_7());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_RestrictedRangeAssignment_8ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getRestrictedRangeAssignment_8());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1());
		}
		public static IGrammarAwareElementType createNumericScalarRestriction_RCURLYTerminalRuleCall_9ElementType() {
			return new IGrammarAwareElementType("NumericScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getNumericScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
		}
	}

	public static final IGrammarAwareElementType NumericScalarRestriction_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestrictionElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_Group_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_GroupElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_NameAssignment_1_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_Group_3_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_Group_3ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MinInclusiveKeyword_3_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MinInclusiveKeyword_3_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MinInclusiveAssignment_3_1_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MinInclusiveAssignment_3_1ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_Group_4_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_Group_4ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MaxInclusiveKeyword_4_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MaxInclusiveKeyword_4_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MaxInclusiveAssignment_4_1_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MaxInclusiveAssignment_4_1ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_Group_5_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_Group_5ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MinExclusiveKeyword_5_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MinExclusiveKeyword_5_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MinExclusiveAssignment_5_1_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MinExclusiveAssignment_5_1ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_Group_6_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_Group_6ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MaxExclusiveKeyword_6_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MaxExclusiveKeyword_6_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MaxExclusiveAssignment_6_1_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MaxExclusiveAssignment_6_1ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_RestrictedRangeKeyword_7ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_RestrictedRangeAssignment_8ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType());

	public static final IGrammarAwareElementType NumericScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE = associate(NumericScalarRestrictionFactory.createNumericScalarRestriction_RCURLYTerminalRuleCall_9ElementType());

	private static class PlainLiteralScalarRestrictionFactory {
		public static IGrammarAwareElementType createPlainLiteralScalarRestrictionElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionRule());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_GroupElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getGroup());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_Group_3ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_Group_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_LengthKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getLengthKeyword_3_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_LengthAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getLengthAssignment_3_1());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_Group_4ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_Group_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_MinLengthKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getMinLengthKeyword_4_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_MinLengthAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getMinLengthAssignment_4_1());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_Group_5ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_Group_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getGroup_5());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_MaxLengthKeyword_5_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getMaxLengthKeyword_5_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_MaxLengthAssignment_5_1ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getMaxLengthAssignment_5_1());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_Group_6ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_Group_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getGroup_6());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_PatternKeyword_6_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getPatternKeyword_6_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_PatternAssignment_6_1ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getPatternAssignment_6_1());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_Group_7ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_Group_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getGroup_7());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_LangRangeKeyword_7_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_LangRangeKeyword_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getLangRangeKeyword_7_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_LangRangeAssignment_7_1ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_LangRangeAssignment_7_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getLangRangeAssignment_7_1());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_LangRangeSTRINGTerminalRuleCall_7_1_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_LangRangeSTRINGTerminalRuleCall_7_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getLangRangeSTRINGTerminalRuleCall_7_1_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_RestrictedRangeKeyword_8ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_RestrictedRangeKeyword_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeKeyword_8());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_RestrictedRangeAssignment_9ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_RestrictedRangeAssignment_9_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeAssignment_9());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_9_0());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_9_0_1ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_9_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_9_0_1());
		}
		public static IGrammarAwareElementType createPlainLiteralScalarRestriction_RCURLYTerminalRuleCall_10ElementType() {
			return new IGrammarAwareElementType("PlainLiteralScalarRestriction_RCURLYTerminalRuleCall_10_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPlainLiteralScalarRestrictionAccess().getRCURLYTerminalRuleCall_10());
		}
	}

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestrictionElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_Group_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_GroupElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_NameAssignment_1_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_Group_3_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_Group_3ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_LengthKeyword_3_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_LengthAssignment_3_1ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_Group_4_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_Group_4ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_MinLengthKeyword_4_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_MinLengthAssignment_4_1ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_Group_5_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_Group_5ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_MaxLengthKeyword_5_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_MaxLengthAssignment_5_1ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_Group_6_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_Group_6ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_PatternKeyword_6_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_PatternAssignment_6_1ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_Group_7_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_Group_7ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_LangRangeKeyword_7_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_LangRangeKeyword_7_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_LangRangeAssignment_7_1_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_LangRangeAssignment_7_1ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_LangRangeSTRINGTerminalRuleCall_7_1_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_LangRangeSTRINGTerminalRuleCall_7_1_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_RestrictedRangeKeyword_8_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_RestrictedRangeKeyword_8ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_RestrictedRangeAssignment_9_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_RestrictedRangeAssignment_9ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_9_0_1_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_9_0_1ElementType());

	public static final IGrammarAwareElementType PlainLiteralScalarRestriction_RCURLYTerminalRuleCall_10_ELEMENT_TYPE = associate(PlainLiteralScalarRestrictionFactory.createPlainLiteralScalarRestriction_RCURLYTerminalRuleCall_10ElementType());

	private static class ScalarOneOfRestrictionFactory {
		public static IGrammarAwareElementType createScalarOneOfRestrictionElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionRule());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_GroupElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getGroup());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getSCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_RestrictedRangeKeyword_3ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_RestrictedRangeKeyword_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getRestrictedRangeKeyword_3());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_RestrictedRangeAssignment_4ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_RestrictedRangeAssignment_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getRestrictedRangeAssignment_4());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1());
		}
		public static IGrammarAwareElementType createScalarOneOfRestriction_RCURLYTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfRestriction_RCURLYTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfRestrictionAccess().getRCURLYTerminalRuleCall_5());
		}
	}

	public static final IGrammarAwareElementType ScalarOneOfRestriction_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestrictionElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_Group_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_GroupElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_NameAssignment_1_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_RestrictedRangeKeyword_3_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_RestrictedRangeKeyword_3ElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_RestrictedRangeAssignment_4_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_RestrictedRangeAssignment_4ElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1ElementType());

	public static final IGrammarAwareElementType ScalarOneOfRestriction_RCURLYTerminalRuleCall_5_ELEMENT_TYPE = associate(ScalarOneOfRestrictionFactory.createScalarOneOfRestriction_RCURLYTerminalRuleCall_5ElementType());

	private static class ScalarOneOfLiteralAxiomFactory {
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiomElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomRule());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_GroupElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getGroup());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_ValueKeyword_2ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_ValueKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getValueKeyword_2());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_ValueAssignment_3ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_ValueAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getValueAssignment_3());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getValueSTRINGTerminalRuleCall_3_0());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_AxiomKeyword_4ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_AxiomKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getAxiomKeyword_4());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_AxiomAssignment_5ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_AxiomAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getAxiomAssignment_5());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionCrossReference_5_0());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createScalarOneOfLiteralAxiom_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("ScalarOneOfLiteralAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarOneOfLiteralAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiomElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_Group_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_GroupElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_ValueKeyword_2_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_ValueKeyword_2ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_ValueAssignment_3_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_ValueAssignment_3ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_AxiomKeyword_4_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_AxiomKeyword_4ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_AxiomAssignment_5_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_AxiomAssignment_5ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType ScalarOneOfLiteralAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(ScalarOneOfLiteralAxiomFactory.createScalarOneOfLiteralAxiom_RCURLYTerminalRuleCall_6ElementType());

	private static class StringScalarRestrictionFactory {
		public static IGrammarAwareElementType createStringScalarRestrictionElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionRule());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_GroupElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getGroup());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getSTRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_Group_3ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_Group_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_LengthKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getLengthKeyword_3_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_LengthAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getLengthAssignment_3_1());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_Group_4ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_Group_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_MinLengthKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getMinLengthKeyword_4_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_MinLengthAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getMinLengthAssignment_4_1());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_Group_5ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_Group_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getGroup_5());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_MaxLengthKeyword_5_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getMaxLengthKeyword_5_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_MaxLengthAssignment_5_1ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getMaxLengthAssignment_5_1());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_Group_6ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_Group_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getGroup_6());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_PatternKeyword_6_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getPatternKeyword_6_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_PatternAssignment_6_1ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getPatternAssignment_6_1());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_RestrictedRangeKeyword_7ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getRestrictedRangeKeyword_7());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_RestrictedRangeAssignment_8ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getRestrictedRangeAssignment_8());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1());
		}
		public static IGrammarAwareElementType createStringScalarRestriction_RCURLYTerminalRuleCall_9ElementType() {
			return new IGrammarAwareElementType("StringScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStringScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
		}
	}

	public static final IGrammarAwareElementType StringScalarRestriction_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestrictionElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_Group_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_GroupElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_NameAssignment_1_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_Group_3_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_Group_3ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_LengthKeyword_3_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_LengthAssignment_3_1ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_Group_4_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_Group_4ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_MinLengthKeyword_4_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_MinLengthAssignment_4_1ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_Group_5_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_Group_5ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_MaxLengthKeyword_5_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_MaxLengthAssignment_5_1ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_Group_6_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_Group_6ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_PatternKeyword_6_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_PatternAssignment_6_1ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_RestrictedRangeKeyword_7ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_RestrictedRangeAssignment_8ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType());

	public static final IGrammarAwareElementType StringScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE = associate(StringScalarRestrictionFactory.createStringScalarRestriction_RCURLYTerminalRuleCall_9ElementType());

	private static class SynonymScalarRestrictionFactory {
		public static IGrammarAwareElementType createSynonymScalarRestrictionElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionRule());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_GroupElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getGroup());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getSYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_RestrictedRangeKeyword_3ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_RestrictedRangeKeyword_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getRestrictedRangeKeyword_3());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_RestrictedRangeAssignment_4ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_RestrictedRangeAssignment_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getRestrictedRangeAssignment_4());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1());
		}
		public static IGrammarAwareElementType createSynonymScalarRestriction_RCURLYTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("SynonymScalarRestriction_RCURLYTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSynonymScalarRestrictionAccess().getRCURLYTerminalRuleCall_5());
		}
	}

	public static final IGrammarAwareElementType SynonymScalarRestriction_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestrictionElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_Group_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_GroupElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_NameAssignment_1_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_RestrictedRangeKeyword_3_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_RestrictedRangeKeyword_3ElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_RestrictedRangeAssignment_4_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_RestrictedRangeAssignment_4ElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1ElementType());

	public static final IGrammarAwareElementType SynonymScalarRestriction_RCURLYTerminalRuleCall_5_ELEMENT_TYPE = associate(SynonymScalarRestrictionFactory.createSynonymScalarRestriction_RCURLYTerminalRuleCall_5ElementType());

	private static class TimeScalarRestrictionFactory {
		public static IGrammarAwareElementType createTimeScalarRestrictionElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionRule());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_GroupElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getGroup());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getTIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_NameAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_Group_3ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_Group_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MinInclusiveKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MinInclusiveKeyword_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMinInclusiveKeyword_3_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MinInclusiveAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MinInclusiveAssignment_3_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMinInclusiveAssignment_3_1());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_Group_4ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_Group_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MaxInclusiveKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MaxInclusiveKeyword_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMaxInclusiveKeyword_4_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MaxInclusiveAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MaxInclusiveAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMaxInclusiveAssignment_4_1());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_Group_5ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_Group_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getGroup_5());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MinExclusiveKeyword_5_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MinExclusiveKeyword_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMinExclusiveKeyword_5_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MinExclusiveAssignment_5_1ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MinExclusiveAssignment_5_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMinExclusiveAssignment_5_1());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_Group_6ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_Group_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getGroup_6());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MaxExclusiveKeyword_6_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MaxExclusiveKeyword_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMaxExclusiveKeyword_6_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MaxExclusiveAssignment_6_1ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MaxExclusiveAssignment_6_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMaxExclusiveAssignment_6_1());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_RestrictedRangeKeyword_7ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getRestrictedRangeKeyword_7());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_RestrictedRangeAssignment_8ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getRestrictedRangeAssignment_8());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1());
		}
		public static IGrammarAwareElementType createTimeScalarRestriction_RCURLYTerminalRuleCall_9ElementType() {
			return new IGrammarAwareElementType("TimeScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTimeScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
		}
	}

	public static final IGrammarAwareElementType TimeScalarRestriction_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestrictionElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_Group_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_GroupElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_NameAssignment_1_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_LCURLYTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_Group_3_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_Group_3ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MinInclusiveKeyword_3_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MinInclusiveKeyword_3_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MinInclusiveAssignment_3_1_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MinInclusiveAssignment_3_1ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_Group_4_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_Group_4ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MaxInclusiveKeyword_4_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MaxInclusiveKeyword_4_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MaxInclusiveAssignment_4_1_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MaxInclusiveAssignment_4_1ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_Group_5_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_Group_5ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MinExclusiveKeyword_5_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MinExclusiveKeyword_5_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MinExclusiveAssignment_5_1_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MinExclusiveAssignment_5_1ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_Group_6_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_Group_6ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MaxExclusiveKeyword_6_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MaxExclusiveKeyword_6_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MaxExclusiveAssignment_6_1_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MaxExclusiveAssignment_6_1ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_RestrictedRangeKeyword_7ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_RestrictedRangeAssignment_8ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType());

	public static final IGrammarAwareElementType TimeScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE = associate(TimeScalarRestrictionFactory.createTimeScalarRestriction_RCURLYTerminalRuleCall_9ElementType());

	private static class DescriptionBoxFactory {
		public static IGrammarAwareElementType createDescriptionBoxElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxRule());
		}
		public static IGrammarAwareElementType createDescriptionBox_GroupElementType() {
			return new IGrammarAwareElementType("DescriptionBox_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getGroup());
		}
		public static IGrammarAwareElementType createDescriptionBox_KindAssignment_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_KindAssignment_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getKindAssignment_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_KindDescriptionKindEnumRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_KindDescriptionKindEnumRuleCall_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getKindDescriptionKindEnumRuleCall_0_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_DESCRIPTION_BOX_TOKENTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_DESCRIPTION_BOX_TOKENTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getDESCRIPTION_BOX_TOKENTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createDescriptionBox_IriAssignment_2ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_IriAssignment_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getIriAssignment_2());
		}
		public static IGrammarAwareElementType createDescriptionBox_IriIRITerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getIriIRITerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_LCURLYTerminalRuleCall_3ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_LCURLYTerminalRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getLCURLYTerminalRuleCall_3());
		}
		public static IGrammarAwareElementType createDescriptionBox_Alternatives_4ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_Alternatives_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getAlternatives_4());
		}
		public static IGrammarAwareElementType createDescriptionBox_AnnotationsAssignment_4_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_AnnotationsAssignment_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getAnnotationsAssignment_4_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_AnnotationsAnnotationParserRuleCall_4_0_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_ClosedWorldDefinitionsAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ClosedWorldDefinitionsAssignment_4_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getClosedWorldDefinitionsAssignment_4_1());
		}
		public static IGrammarAwareElementType createDescriptionBox_ClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_DescriptionBoxRefinementsAssignment_4_2ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_DescriptionBoxRefinementsAssignment_4_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getDescriptionBoxRefinementsAssignment_4_2());
		}
		public static IGrammarAwareElementType createDescriptionBox_DescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_DescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getDescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_ConceptInstancesAssignment_4_3ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ConceptInstancesAssignment_4_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getConceptInstancesAssignment_4_3());
		}
		public static IGrammarAwareElementType createDescriptionBox_ConceptInstancesConceptInstanceParserRuleCall_4_3_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ConceptInstancesConceptInstanceParserRuleCall_4_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getConceptInstancesConceptInstanceParserRuleCall_4_3_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_ReifiedRelationshipInstancesAssignment_4_4ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ReifiedRelationshipInstancesAssignment_4_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getReifiedRelationshipInstancesAssignment_4_4());
		}
		public static IGrammarAwareElementType createDescriptionBox_ReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_ReifiedRelationshipInstanceDomainsAssignment_4_5ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ReifiedRelationshipInstanceDomainsAssignment_4_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsAssignment_4_5());
		}
		public static IGrammarAwareElementType createDescriptionBox_ReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_ReifiedRelationshipInstanceRangesAssignment_4_6ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ReifiedRelationshipInstanceRangesAssignment_4_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesAssignment_4_6());
		}
		public static IGrammarAwareElementType createDescriptionBox_ReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_ReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_UnreifiedRelationshipInstanceTuplesAssignment_4_7ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_UnreifiedRelationshipInstanceTuplesAssignment_4_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesAssignment_4_7());
		}
		public static IGrammarAwareElementType createDescriptionBox_UnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_UnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0());
		}
		public static IGrammarAwareElementType createDescriptionBox_RCURLYTerminalRuleCall_5ElementType() {
			return new IGrammarAwareElementType("DescriptionBox_RCURLYTerminalRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxAccess().getRCURLYTerminalRuleCall_5());
		}
	}

	public static final IGrammarAwareElementType DescriptionBox_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBoxElementType());

	public static final IGrammarAwareElementType DescriptionBox_Group_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_GroupElementType());

	public static final IGrammarAwareElementType DescriptionBox_KindAssignment_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_KindAssignment_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_KindDescriptionKindEnumRuleCall_0_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_KindDescriptionKindEnumRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_DESCRIPTION_BOX_TOKENTerminalRuleCall_1_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_DESCRIPTION_BOX_TOKENTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType DescriptionBox_IriAssignment_2_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_IriAssignment_2ElementType());

	public static final IGrammarAwareElementType DescriptionBox_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_IriIRITerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_LCURLYTerminalRuleCall_3_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_LCURLYTerminalRuleCall_3ElementType());

	public static final IGrammarAwareElementType DescriptionBox_Alternatives_4_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_Alternatives_4ElementType());

	public static final IGrammarAwareElementType DescriptionBox_AnnotationsAssignment_4_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_AnnotationsAssignment_4_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ClosedWorldDefinitionsAssignment_4_1_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ClosedWorldDefinitionsAssignment_4_1ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_DescriptionBoxRefinementsAssignment_4_2_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_DescriptionBoxRefinementsAssignment_4_2ElementType());

	public static final IGrammarAwareElementType DescriptionBox_DescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_DescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ConceptInstancesAssignment_4_3_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ConceptInstancesAssignment_4_3ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ConceptInstancesConceptInstanceParserRuleCall_4_3_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ConceptInstancesConceptInstanceParserRuleCall_4_3_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ReifiedRelationshipInstancesAssignment_4_4_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ReifiedRelationshipInstancesAssignment_4_4ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ReifiedRelationshipInstanceDomainsAssignment_4_5_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ReifiedRelationshipInstanceDomainsAssignment_4_5ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ReifiedRelationshipInstanceRangesAssignment_4_6_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ReifiedRelationshipInstanceRangesAssignment_4_6ElementType());

	public static final IGrammarAwareElementType DescriptionBox_ReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_ReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_UnreifiedRelationshipInstanceTuplesAssignment_4_7_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_UnreifiedRelationshipInstanceTuplesAssignment_4_7ElementType());

	public static final IGrammarAwareElementType DescriptionBox_UnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_UnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0ElementType());

	public static final IGrammarAwareElementType DescriptionBox_RCURLYTerminalRuleCall_5_ELEMENT_TYPE = associate(DescriptionBoxFactory.createDescriptionBox_RCURLYTerminalRuleCall_5ElementType());

	private static class DescriptionKindFactory {
		public static IGrammarAwareElementType createDescriptionKindElementType() {
			return new IGrammarAwareElementType("DescriptionKind_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionKindRule());
		}
		public static IGrammarAwareElementType createDescriptionKind_AlternativesElementType() {
			return new IGrammarAwareElementType("DescriptionKind_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionKindAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createDescriptionKind_FinalEnumLiteralDeclaration_0ElementType() {
			return new IGrammarAwareElementType("DescriptionKind_FinalEnumLiteralDeclaration_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionKindAccess().getFinalEnumLiteralDeclaration_0());
		}
		public static IGrammarAwareElementType createDescriptionKind_FinalFinalKeyword_0_0ElementType() {
			return new IGrammarAwareElementType("DescriptionKind_FinalFinalKeyword_0_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionKindAccess().getFinalFinalKeyword_0_0());
		}
		public static IGrammarAwareElementType createDescriptionKind_PartialEnumLiteralDeclaration_1ElementType() {
			return new IGrammarAwareElementType("DescriptionKind_PartialEnumLiteralDeclaration_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionKindAccess().getPartialEnumLiteralDeclaration_1());
		}
		public static IGrammarAwareElementType createDescriptionKind_PartialPartialKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("DescriptionKind_PartialPartialKeyword_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionKindAccess().getPartialPartialKeyword_1_0());
		}
	}

	public static final IGrammarAwareElementType DescriptionKind_ELEMENT_TYPE = associate(DescriptionKindFactory.createDescriptionKindElementType());

	public static final IGrammarAwareElementType DescriptionKind_Alternatives_ELEMENT_TYPE = associate(DescriptionKindFactory.createDescriptionKind_AlternativesElementType());

	public static final IGrammarAwareElementType DescriptionKind_FinalEnumLiteralDeclaration_0_ELEMENT_TYPE = associate(DescriptionKindFactory.createDescriptionKind_FinalEnumLiteralDeclaration_0ElementType());

	public static final IGrammarAwareElementType DescriptionKind_FinalFinalKeyword_0_0_ELEMENT_TYPE = associate(DescriptionKindFactory.createDescriptionKind_FinalFinalKeyword_0_0ElementType());

	public static final IGrammarAwareElementType DescriptionKind_PartialEnumLiteralDeclaration_1_ELEMENT_TYPE = associate(DescriptionKindFactory.createDescriptionKind_PartialEnumLiteralDeclaration_1ElementType());

	public static final IGrammarAwareElementType DescriptionKind_PartialPartialKeyword_1_0_ELEMENT_TYPE = associate(DescriptionKindFactory.createDescriptionKind_PartialPartialKeyword_1_0ElementType());

	private static class TerminologyInstanceAssertionFactory {
		public static IGrammarAwareElementType createTerminologyInstanceAssertionElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionRule());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_AlternativesElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_ScalarDataPropertyValueParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_ScalarDataPropertyValueParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getScalarDataPropertyValueParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_StructuredDataPropertyValueParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_StructuredDataPropertyValueParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getStructuredDataPropertyValueParserRuleCall_1());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_DataStructureTupleParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_DataStructureTupleParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getDataStructureTupleParserRuleCall_2());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_ConceptInstanceParserRuleCall_3ElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_ConceptInstanceParserRuleCall_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getConceptInstanceParserRuleCall_3());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_ReifiedRelationshipInstanceParserRuleCall_4ElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_ReifiedRelationshipInstanceParserRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getReifiedRelationshipInstanceParserRuleCall_4());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_ReifiedRelationshipInstanceDomainParserRuleCall_5ElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_ReifiedRelationshipInstanceDomainParserRuleCall_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getReifiedRelationshipInstanceDomainParserRuleCall_5());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_ReifiedRelationshipInstanceRangeParserRuleCall_6ElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_ReifiedRelationshipInstanceRangeParserRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getReifiedRelationshipInstanceRangeParserRuleCall_6());
		}
		public static IGrammarAwareElementType createTerminologyInstanceAssertion_UnreifiedRelationshipInstanceTupleParserRuleCall_7ElementType() {
			return new IGrammarAwareElementType("TerminologyInstanceAssertion_UnreifiedRelationshipInstanceTupleParserRuleCall_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTerminologyInstanceAssertionAccess().getUnreifiedRelationshipInstanceTupleParserRuleCall_7());
		}
	}

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertionElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_Alternatives_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_AlternativesElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_ScalarDataPropertyValueParserRuleCall_0_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_ScalarDataPropertyValueParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_StructuredDataPropertyValueParserRuleCall_1_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_StructuredDataPropertyValueParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_DataStructureTupleParserRuleCall_2_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_DataStructureTupleParserRuleCall_2ElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_ConceptInstanceParserRuleCall_3_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_ConceptInstanceParserRuleCall_3ElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_ReifiedRelationshipInstanceParserRuleCall_4_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_ReifiedRelationshipInstanceParserRuleCall_4ElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_ReifiedRelationshipInstanceDomainParserRuleCall_5_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_ReifiedRelationshipInstanceDomainParserRuleCall_5ElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_ReifiedRelationshipInstanceRangeParserRuleCall_6_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_ReifiedRelationshipInstanceRangeParserRuleCall_6ElementType());

	public static final IGrammarAwareElementType TerminologyInstanceAssertion_UnreifiedRelationshipInstanceTupleParserRuleCall_7_ELEMENT_TYPE = associate(TerminologyInstanceAssertionFactory.createTerminologyInstanceAssertion_UnreifiedRelationshipInstanceTupleParserRuleCall_7ElementType());

	private static class DescriptionBoxExtendsClosedWorldDefinitionsFactory {
		public static IGrammarAwareElementType createDescriptionBoxExtendsClosedWorldDefinitionsElementType() {
			return new IGrammarAwareElementType("DescriptionBoxExtendsClosedWorldDefinitions_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxExtendsClosedWorldDefinitionsRule());
		}
		public static IGrammarAwareElementType createDescriptionBoxExtendsClosedWorldDefinitions_GroupElementType() {
			return new IGrammarAwareElementType("DescriptionBoxExtendsClosedWorldDefinitions_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getGroup());
		}
		public static IGrammarAwareElementType createDescriptionBoxExtendsClosedWorldDefinitions_EXTENDS_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBoxExtendsClosedWorldDefinitions_EXTENDS_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getEXTENDS_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsAssignment_1ElementType() {
			return new IGrammarAwareElementType("DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsAssignment_1());
		}
		public static IGrammarAwareElementType createDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxCrossReference_1_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxCrossReference_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxCrossReference_1_0());
		}
		public static IGrammarAwareElementType createDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1ElementType() {
			return new IGrammarAwareElementType("DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1());
		}
	}

	public static final IGrammarAwareElementType DescriptionBoxExtendsClosedWorldDefinitions_ELEMENT_TYPE = associate(DescriptionBoxExtendsClosedWorldDefinitionsFactory.createDescriptionBoxExtendsClosedWorldDefinitionsElementType());

	public static final IGrammarAwareElementType DescriptionBoxExtendsClosedWorldDefinitions_Group_ELEMENT_TYPE = associate(DescriptionBoxExtendsClosedWorldDefinitionsFactory.createDescriptionBoxExtendsClosedWorldDefinitions_GroupElementType());

	public static final IGrammarAwareElementType DescriptionBoxExtendsClosedWorldDefinitions_EXTENDS_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(DescriptionBoxExtendsClosedWorldDefinitionsFactory.createDescriptionBoxExtendsClosedWorldDefinitions_EXTENDS_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsAssignment_1_ELEMENT_TYPE = associate(DescriptionBoxExtendsClosedWorldDefinitionsFactory.createDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsAssignment_1ElementType());

	public static final IGrammarAwareElementType DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxCrossReference_1_0_ELEMENT_TYPE = associate(DescriptionBoxExtendsClosedWorldDefinitionsFactory.createDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxCrossReference_1_0ElementType());

	public static final IGrammarAwareElementType DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE = associate(DescriptionBoxExtendsClosedWorldDefinitionsFactory.createDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1ElementType());

	private static class DescriptionBoxRefinementFactory {
		public static IGrammarAwareElementType createDescriptionBoxRefinementElementType() {
			return new IGrammarAwareElementType("DescriptionBoxRefinement_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxRefinementRule());
		}
		public static IGrammarAwareElementType createDescriptionBoxRefinement_GroupElementType() {
			return new IGrammarAwareElementType("DescriptionBoxRefinement_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxRefinementAccess().getGroup());
		}
		public static IGrammarAwareElementType createDescriptionBoxRefinement_REFINES_TOKENTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBoxRefinement_REFINES_TOKENTerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxRefinementAccess().getREFINES_TOKENTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createDescriptionBoxRefinement_RefinedDescriptionBoxAssignment_1ElementType() {
			return new IGrammarAwareElementType("DescriptionBoxRefinement_RefinedDescriptionBoxAssignment_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxAssignment_1());
		}
		public static IGrammarAwareElementType createDescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxCrossReference_1_0ElementType() {
			return new IGrammarAwareElementType("DescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxCrossReference_1_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxCrossReference_1_0());
		}
		public static IGrammarAwareElementType createDescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1ElementType() {
			return new IGrammarAwareElementType("DescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1());
		}
	}

	public static final IGrammarAwareElementType DescriptionBoxRefinement_ELEMENT_TYPE = associate(DescriptionBoxRefinementFactory.createDescriptionBoxRefinementElementType());

	public static final IGrammarAwareElementType DescriptionBoxRefinement_Group_ELEMENT_TYPE = associate(DescriptionBoxRefinementFactory.createDescriptionBoxRefinement_GroupElementType());

	public static final IGrammarAwareElementType DescriptionBoxRefinement_REFINES_TOKENTerminalRuleCall_0_ELEMENT_TYPE = associate(DescriptionBoxRefinementFactory.createDescriptionBoxRefinement_REFINES_TOKENTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType DescriptionBoxRefinement_RefinedDescriptionBoxAssignment_1_ELEMENT_TYPE = associate(DescriptionBoxRefinementFactory.createDescriptionBoxRefinement_RefinedDescriptionBoxAssignment_1ElementType());

	public static final IGrammarAwareElementType DescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxCrossReference_1_0_ELEMENT_TYPE = associate(DescriptionBoxRefinementFactory.createDescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxCrossReference_1_0ElementType());

	public static final IGrammarAwareElementType DescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE = associate(DescriptionBoxRefinementFactory.createDescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1ElementType());

	private static class ScalarDataPropertyValueFactory {
		public static IGrammarAwareElementType createScalarDataPropertyValueElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueRule());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_GroupElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getGroup());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_ScalarDataPropertyValueKeyword_0ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ScalarDataPropertyValueKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getScalarDataPropertyValueKeyword_0());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_ScalarPropertyValueKeyword_2ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ScalarPropertyValueKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getScalarPropertyValueKeyword_2());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_ScalarPropertyValueAssignment_3ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ScalarPropertyValueAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getScalarPropertyValueAssignment_3());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_ScalarPropertyValueReferenceParserRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ScalarPropertyValueReferenceParserRuleCall_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getScalarPropertyValueReferenceParserRuleCall_3_0());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_ScalarDataPropertyKeyword_4ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ScalarDataPropertyKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getScalarDataPropertyKeyword_4());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_ScalarDataPropertyAssignment_5ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ScalarDataPropertyAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getScalarDataPropertyAssignment_5());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarCrossReference_5_0());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createScalarDataPropertyValue_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("ScalarDataPropertyValue_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getScalarDataPropertyValueAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValueElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_Group_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_GroupElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ScalarDataPropertyValueKeyword_0_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_ScalarDataPropertyValueKeyword_0ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ScalarPropertyValueKeyword_2_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_ScalarPropertyValueKeyword_2ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ScalarPropertyValueAssignment_3_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_ScalarPropertyValueAssignment_3ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ScalarPropertyValueReferenceParserRuleCall_3_0_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_ScalarPropertyValueReferenceParserRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ScalarDataPropertyKeyword_4_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_ScalarDataPropertyKeyword_4ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ScalarDataPropertyAssignment_5_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_ScalarDataPropertyAssignment_5ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarCrossReference_5_0_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType ScalarDataPropertyValue_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(ScalarDataPropertyValueFactory.createScalarDataPropertyValue_RCURLYTerminalRuleCall_6ElementType());

	private static class StructuredDataPropertyValueFactory {
		public static IGrammarAwareElementType createStructuredDataPropertyValueElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueRule());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_GroupElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getGroup());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_StructuredDataPropertyValueKeyword_0ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_StructuredDataPropertyValueKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getStructuredDataPropertyValueKeyword_0());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_StructuredDataPropertyKeyword_2ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_StructuredDataPropertyKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getStructuredDataPropertyKeyword_2());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_StructuredDataPropertyAssignment_3ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_StructuredDataPropertyAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getStructuredDataPropertyAssignment_3());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureCrossReference_3_0());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_StructuredPropertyTupleKeyword_4ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_StructuredPropertyTupleKeyword_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleKeyword_4());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_StructuredPropertyTupleAssignment_5ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_StructuredPropertyTupleAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleAssignment_5());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_StructuredPropertyTupleDataStructureTupleParserRuleCall_5_0ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_StructuredPropertyTupleDataStructureTupleParserRuleCall_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleDataStructureTupleParserRuleCall_5_0());
		}
		public static IGrammarAwareElementType createStructuredDataPropertyValue_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("StructuredDataPropertyValue_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getStructuredDataPropertyValueAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType StructuredDataPropertyValue_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValueElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_Group_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_GroupElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_StructuredDataPropertyValueKeyword_0_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_StructuredDataPropertyValueKeyword_0ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_StructuredDataPropertyKeyword_2_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_StructuredDataPropertyKeyword_2ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_StructuredDataPropertyAssignment_3_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_StructuredDataPropertyAssignment_3ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureCrossReference_3_0_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_StructuredPropertyTupleKeyword_4_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_StructuredPropertyTupleKeyword_4ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_StructuredPropertyTupleAssignment_5_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_StructuredPropertyTupleAssignment_5ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_StructuredPropertyTupleDataStructureTupleParserRuleCall_5_0_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_StructuredPropertyTupleDataStructureTupleParserRuleCall_5_0ElementType());

	public static final IGrammarAwareElementType StructuredDataPropertyValue_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(StructuredDataPropertyValueFactory.createStructuredDataPropertyValue_RCURLYTerminalRuleCall_6ElementType());

	private static class DataStructureTupleFactory {
		public static IGrammarAwareElementType createDataStructureTupleElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleRule());
		}
		public static IGrammarAwareElementType createDataStructureTuple_GroupElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleAccess().getGroup());
		}
		public static IGrammarAwareElementType createDataStructureTuple_DataStructureTupleKeyword_0ElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_DataStructureTupleKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleAccess().getDataStructureTupleKeyword_0());
		}
		public static IGrammarAwareElementType createDataStructureTuple_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createDataStructureTuple_DataStructureTypeKeyword_2ElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_DataStructureTypeKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleAccess().getDataStructureTypeKeyword_2());
		}
		public static IGrammarAwareElementType createDataStructureTuple_DataStructureTypeAssignment_3ElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_DataStructureTypeAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleAccess().getDataStructureTypeAssignment_3());
		}
		public static IGrammarAwareElementType createDataStructureTuple_DataStructureTypeStructureCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_DataStructureTypeStructureCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleAccess().getDataStructureTypeStructureCrossReference_3_0());
		}
		public static IGrammarAwareElementType createDataStructureTuple_DataStructureTypeStructureReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_DataStructureTypeStructureReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleAccess().getDataStructureTypeStructureReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createDataStructureTuple_RCURLYTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("DataStructureTuple_RCURLYTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDataStructureTupleAccess().getRCURLYTerminalRuleCall_4());
		}
	}

	public static final IGrammarAwareElementType DataStructureTuple_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTupleElementType());

	public static final IGrammarAwareElementType DataStructureTuple_Group_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTuple_GroupElementType());

	public static final IGrammarAwareElementType DataStructureTuple_DataStructureTupleKeyword_0_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTuple_DataStructureTupleKeyword_0ElementType());

	public static final IGrammarAwareElementType DataStructureTuple_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTuple_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType DataStructureTuple_DataStructureTypeKeyword_2_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTuple_DataStructureTypeKeyword_2ElementType());

	public static final IGrammarAwareElementType DataStructureTuple_DataStructureTypeAssignment_3_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTuple_DataStructureTypeAssignment_3ElementType());

	public static final IGrammarAwareElementType DataStructureTuple_DataStructureTypeStructureCrossReference_3_0_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTuple_DataStructureTypeStructureCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType DataStructureTuple_DataStructureTypeStructureReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTuple_DataStructureTypeStructureReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType DataStructureTuple_RCURLYTerminalRuleCall_4_ELEMENT_TYPE = associate(DataStructureTupleFactory.createDataStructureTuple_RCURLYTerminalRuleCall_4ElementType());

	private static class ConceptInstanceFactory {
		public static IGrammarAwareElementType createConceptInstanceElementType() {
			return new IGrammarAwareElementType("ConceptInstance_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceRule());
		}
		public static IGrammarAwareElementType createConceptInstance_GroupElementType() {
			return new IGrammarAwareElementType("ConceptInstance_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceAccess().getGroup());
		}
		public static IGrammarAwareElementType createConceptInstance_ConceptInstanceKeyword_0ElementType() {
			return new IGrammarAwareElementType("ConceptInstance_ConceptInstanceKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceAccess().getConceptInstanceKeyword_0());
		}
		public static IGrammarAwareElementType createConceptInstance_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ConceptInstance_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createConceptInstance_SingletonConceptClassifierKeyword_2ElementType() {
			return new IGrammarAwareElementType("ConceptInstance_SingletonConceptClassifierKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceAccess().getSingletonConceptClassifierKeyword_2());
		}
		public static IGrammarAwareElementType createConceptInstance_SingletonConceptClassifierAssignment_3ElementType() {
			return new IGrammarAwareElementType("ConceptInstance_SingletonConceptClassifierAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceAccess().getSingletonConceptClassifierAssignment_3());
		}
		public static IGrammarAwareElementType createConceptInstance_SingletonConceptClassifierConceptCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("ConceptInstance_SingletonConceptClassifierConceptCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceAccess().getSingletonConceptClassifierConceptCrossReference_3_0());
		}
		public static IGrammarAwareElementType createConceptInstance_SingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("ConceptInstance_SingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceAccess().getSingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createConceptInstance_RCURLYTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("ConceptInstance_RCURLYTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConceptInstanceAccess().getRCURLYTerminalRuleCall_4());
		}
	}

	public static final IGrammarAwareElementType ConceptInstance_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstanceElementType());

	public static final IGrammarAwareElementType ConceptInstance_Group_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstance_GroupElementType());

	public static final IGrammarAwareElementType ConceptInstance_ConceptInstanceKeyword_0_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstance_ConceptInstanceKeyword_0ElementType());

	public static final IGrammarAwareElementType ConceptInstance_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstance_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ConceptInstance_SingletonConceptClassifierKeyword_2_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstance_SingletonConceptClassifierKeyword_2ElementType());

	public static final IGrammarAwareElementType ConceptInstance_SingletonConceptClassifierAssignment_3_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstance_SingletonConceptClassifierAssignment_3ElementType());

	public static final IGrammarAwareElementType ConceptInstance_SingletonConceptClassifierConceptCrossReference_3_0_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstance_SingletonConceptClassifierConceptCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType ConceptInstance_SingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstance_SingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType ConceptInstance_RCURLYTerminalRuleCall_4_ELEMENT_TYPE = associate(ConceptInstanceFactory.createConceptInstance_RCURLYTerminalRuleCall_4ElementType());

	private static class ReifiedRelationshipInstanceFactory {
		public static IGrammarAwareElementType createReifiedRelationshipInstanceElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRule());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstance_GroupElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceAccess().getGroup());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstance_ReifiedRelationshipInstanceKeyword_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_ReifiedRelationshipInstanceKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceAccess().getReifiedRelationshipInstanceKeyword_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstance_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierKeyword_2ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierKeyword_2());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierAssignment_3ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierAssignment_3());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstance_RCURLYTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstance_RCURLYTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceAccess().getRCURLYTerminalRuleCall_4());
		}
	}

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstanceElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_Group_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstance_GroupElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_ReifiedRelationshipInstanceKeyword_0_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstance_ReifiedRelationshipInstanceKeyword_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstance_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierKeyword_2_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierKeyword_2ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierAssignment_3_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierAssignment_3ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstance_RCURLYTerminalRuleCall_4_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceFactory.createReifiedRelationshipInstance_RCURLYTerminalRuleCall_4ElementType());

	private static class ReifiedRelationshipInstanceDomainFactory {
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomainElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainRule());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_GroupElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getGroup());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceDomainKeyword_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceDomainKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceDomainKeyword_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceKeyword_2ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceKeyword_2());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceAssignment_3ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceAssignment_3());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_DOMAIN_TOKENTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_DOMAIN_TOKENTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getDOMAIN_TOKENTerminalRuleCall_4());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_DomainAssignment_5ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_DomainAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getDomainAssignment_5());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceDomain_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceDomain_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceDomainAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomainElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_Group_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_GroupElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceDomainKeyword_0_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceDomainKeyword_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceKeyword_2_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceKeyword_2ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceAssignment_3_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceAssignment_3ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_DOMAIN_TOKENTerminalRuleCall_4_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_DOMAIN_TOKENTerminalRuleCall_4ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_DomainAssignment_5_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_DomainAssignment_5ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceDomain_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceDomainFactory.createReifiedRelationshipInstanceDomain_RCURLYTerminalRuleCall_6ElementType());

	private static class ReifiedRelationshipInstanceRangeFactory {
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRangeElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeRule());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_GroupElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getGroup());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceRangeKeyword_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceRangeKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceRangeKeyword_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceKeyword_2ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceKeyword_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceKeyword_2());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceAssignment_3ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceAssignment_3());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_RANGE_TOKENTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_RANGE_TOKENTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getRANGE_TOKENTerminalRuleCall_4());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_RangeAssignment_5ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_RangeAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getRangeAssignment_5());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceCrossReference_5_0());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createReifiedRelationshipInstanceRange_RCURLYTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("ReifiedRelationshipInstanceRange_RCURLYTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReifiedRelationshipInstanceRangeAccess().getRCURLYTerminalRuleCall_6());
		}
	}

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRangeElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_Group_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_GroupElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceRangeKeyword_0_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceRangeKeyword_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceKeyword_2_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceKeyword_2ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceAssignment_3_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceAssignment_3ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_RANGE_TOKENTerminalRuleCall_4_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_RANGE_TOKENTerminalRuleCall_4ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_RangeAssignment_5_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_RangeAssignment_5ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType ReifiedRelationshipInstanceRange_RCURLYTerminalRuleCall_6_ELEMENT_TYPE = associate(ReifiedRelationshipInstanceRangeFactory.createReifiedRelationshipInstanceRange_RCURLYTerminalRuleCall_6ElementType());

	private static class UnreifiedRelationshipInstanceTupleFactory {
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTupleElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleRule());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_GroupElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getGroup());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipInstanceTupleKeyword_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipInstanceTupleKeyword_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipInstanceTupleKeyword_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_LCURLYTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_LCURLYTerminalRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getLCURLYTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipAssignment_3ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipAssignment_3_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipAssignment_3());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_DOMAIN_TOKENTerminalRuleCall_4ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_DOMAIN_TOKENTerminalRuleCall_4_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getDOMAIN_TOKENTerminalRuleCall_4());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_DomainAssignment_5ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_DomainAssignment_5_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getDomainAssignment_5());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceCrossReference_5_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_RANGE_TOKENTerminalRuleCall_6ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_RANGE_TOKENTerminalRuleCall_6_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getRANGE_TOKENTerminalRuleCall_6());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_RangeAssignment_7ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_RangeAssignment_7_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getRangeAssignment_7());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceCrossReference_7_0ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceCrossReference_7_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceCrossReference_7_0());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1());
		}
		public static IGrammarAwareElementType createUnreifiedRelationshipInstanceTuple_RCURLYTerminalRuleCall_8ElementType() {
			return new IGrammarAwareElementType("UnreifiedRelationshipInstanceTuple_RCURLYTerminalRuleCall_8_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnreifiedRelationshipInstanceTupleAccess().getRCURLYTerminalRuleCall_8());
		}
	}

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTupleElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_Group_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_GroupElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipInstanceTupleKeyword_0_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipInstanceTupleKeyword_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_LCURLYTerminalRuleCall_1_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_LCURLYTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipAssignment_3_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipAssignment_3ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_DOMAIN_TOKENTerminalRuleCall_4_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_DOMAIN_TOKENTerminalRuleCall_4ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_DomainAssignment_5_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_DomainAssignment_5ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceCrossReference_5_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_RANGE_TOKENTerminalRuleCall_6_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_RANGE_TOKENTerminalRuleCall_6ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_RangeAssignment_7_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_RangeAssignment_7ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceCrossReference_7_0_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceCrossReference_7_0ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1ElementType());

	public static final IGrammarAwareElementType UnreifiedRelationshipInstanceTuple_RCURLYTerminalRuleCall_8_ELEMENT_TYPE = associate(UnreifiedRelationshipInstanceTupleFactory.createUnreifiedRelationshipInstanceTuple_RCURLYTerminalRuleCall_8ElementType());

	private static class ReferenceFactory {
		public static IGrammarAwareElementType createReferenceElementType() {
			return new IGrammarAwareElementType("Reference_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReferenceRule());
		}
		public static IGrammarAwareElementType createReference_AlternativesElementType() {
			return new IGrammarAwareElementType("Reference_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReferenceAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createReference_IRITerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Reference_IRITerminalRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReferenceAccess().getIRITerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createReference_QNAMEParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Reference_QNAMEParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getReferenceAccess().getQNAMEParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType Reference_ELEMENT_TYPE = associate(ReferenceFactory.createReferenceElementType());

	public static final IGrammarAwareElementType Reference_Alternatives_ELEMENT_TYPE = associate(ReferenceFactory.createReference_AlternativesElementType());

	public static final IGrammarAwareElementType Reference_IRITerminalRuleCall_0_ELEMENT_TYPE = associate(ReferenceFactory.createReference_IRITerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType Reference_QNAMEParserRuleCall_1_ELEMENT_TYPE = associate(ReferenceFactory.createReference_QNAMEParserRuleCall_1ElementType());

	private static class QNAMEFactory {
		public static IGrammarAwareElementType createQNAMEElementType() {
			return new IGrammarAwareElementType("QNAME_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQNAMERule());
		}
		public static IGrammarAwareElementType createQNAME_AlternativesElementType() {
			return new IGrammarAwareElementType("QNAME_Alternatives_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQNAMEAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createQNAME_ABBREV_IRIParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("QNAME_ABBREV_IRIParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQNAMEAccess().getABBREV_IRIParserRuleCall_0());
		}
		public static IGrammarAwareElementType createQNAME_ValidIDParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("QNAME_ValidIDParserRuleCall_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQNAMEAccess().getValidIDParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType QNAME_ELEMENT_TYPE = associate(QNAMEFactory.createQNAMEElementType());

	public static final IGrammarAwareElementType QNAME_Alternatives_ELEMENT_TYPE = associate(QNAMEFactory.createQNAME_AlternativesElementType());

	public static final IGrammarAwareElementType QNAME_ABBREV_IRIParserRuleCall_0_ELEMENT_TYPE = associate(QNAMEFactory.createQNAME_ABBREV_IRIParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType QNAME_ValidIDParserRuleCall_1_ELEMENT_TYPE = associate(QNAMEFactory.createQNAME_ValidIDParserRuleCall_1ElementType());

	private static class ABBREV_IRIFactory {
		public static IGrammarAwareElementType createABBREV_IRIElementType() {
			return new IGrammarAwareElementType("ABBREV_IRI_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getABBREV_IRIRule());
		}
		public static IGrammarAwareElementType createABBREV_IRI_GroupElementType() {
			return new IGrammarAwareElementType("ABBREV_IRI_Group_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getABBREV_IRIAccess().getGroup());
		}
		public static IGrammarAwareElementType createABBREV_IRI_ValidIDParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ABBREV_IRI_ValidIDParserRuleCall_0_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getABBREV_IRIAccess().getValidIDParserRuleCall_0());
		}
		public static IGrammarAwareElementType createABBREV_IRI_ColonKeyword_1ElementType() {
			return new IGrammarAwareElementType("ABBREV_IRI_ColonKeyword_1_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getABBREV_IRIAccess().getColonKeyword_1());
		}
		public static IGrammarAwareElementType createABBREV_IRI_ValidIDParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("ABBREV_IRI_ValidIDParserRuleCall_2_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getABBREV_IRIAccess().getValidIDParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType ABBREV_IRI_ELEMENT_TYPE = associate(ABBREV_IRIFactory.createABBREV_IRIElementType());

	public static final IGrammarAwareElementType ABBREV_IRI_Group_ELEMENT_TYPE = associate(ABBREV_IRIFactory.createABBREV_IRI_GroupElementType());

	public static final IGrammarAwareElementType ABBREV_IRI_ValidIDParserRuleCall_0_ELEMENT_TYPE = associate(ABBREV_IRIFactory.createABBREV_IRI_ValidIDParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType ABBREV_IRI_ColonKeyword_1_ELEMENT_TYPE = associate(ABBREV_IRIFactory.createABBREV_IRI_ColonKeyword_1ElementType());

	public static final IGrammarAwareElementType ABBREV_IRI_ValidIDParserRuleCall_2_ELEMENT_TYPE = associate(ABBREV_IRIFactory.createABBREV_IRI_ValidIDParserRuleCall_2ElementType());

	private static class ValidIDFactory {
		public static IGrammarAwareElementType createValidIDElementType() {
			return new IGrammarAwareElementType("ValidID_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValidIDRule());
		}
		public static IGrammarAwareElementType createValidID_IDTerminalRuleCallElementType() {
			return new IGrammarAwareElementType("ValidID_IDTerminalRuleCall_ELEMENT_TYPE", OntologicalModelingLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValidIDAccess().getIDTerminalRuleCall());
		}
	}

	public static final IGrammarAwareElementType ValidID_ELEMENT_TYPE = associate(ValidIDFactory.createValidIDElementType());

	public static final IGrammarAwareElementType ValidID_IDTerminalRuleCall_ELEMENT_TYPE = associate(ValidIDFactory.createValidID_IDTerminalRuleCallElementType());

	@Override
	public IFileElementType getFileType() {
		return FILE_TYPE;
	}

	@Override
	public IGrammarAwareElementType findElementType(EObject grammarElement) {
		return GRAMMAR_ELEMENT_TYPE.get(grammarElement);
	}
	
	public IGrammarAwareElementType getTerminologyExtentElementType() {
		return TerminologyExtent_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_GroupElementType() {
		return TerminologyExtent_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_TerminologyExtentAction_0ElementType() {
		return TerminologyExtent_TerminologyExtentAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_Alternatives_1ElementType() {
		return TerminologyExtent_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_AnnotationPropertiesAssignment_1_0ElementType() {
		return TerminologyExtent_AnnotationPropertiesAssignment_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0ElementType() {
		return TerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_TerminologyGraphsAssignment_1_1ElementType() {
		return TerminologyExtent_TerminologyGraphsAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_1_1_0ElementType() {
		return TerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_BundlesAssignment_1_2ElementType() {
		return TerminologyExtent_BundlesAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_BundlesBundleParserRuleCall_1_2_0ElementType() {
		return TerminologyExtent_BundlesBundleParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_DescriptionsAssignment_1_3ElementType() {
		return TerminologyExtent_DescriptionsAssignment_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtent_DescriptionsDescriptionBoxParserRuleCall_1_3_0ElementType() {
		return TerminologyExtent_DescriptionsDescriptionBoxParserRuleCall_1_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationPropertyElementType() {
		return AnnotationProperty_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationProperty_GroupElementType() {
		return AnnotationProperty_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0ElementType() {
		return AnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationProperty_AbbrevIRIAssignment_1ElementType() {
		return AnnotationProperty_AbbrevIRIAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0ElementType() {
		return AnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationProperty_EQUALTerminalRuleCall_2ElementType() {
		return AnnotationProperty_EQUALTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationProperty_IriAssignment_3ElementType() {
		return AnnotationProperty_IriAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationProperty_IriIRITerminalRuleCall_3_0ElementType() {
		return AnnotationProperty_IriIRITerminalRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotationElementType() {
		return Annotation_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotation_GroupElementType() {
		return Annotation_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotation_ANNOTATION_TOKENTerminalRuleCall_0ElementType() {
		return Annotation_ANNOTATION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotation_PropertyAssignment_1ElementType() {
		return Annotation_PropertyAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotation_PropertyAnnotationPropertyCrossReference_1_0ElementType() {
		return Annotation_PropertyAnnotationPropertyCrossReference_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotation_PropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1ElementType() {
		return Annotation_PropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotation_EQUALTerminalRuleCall_2ElementType() {
		return Annotation_EQUALTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotation_ValueAssignment_3ElementType() {
		return Annotation_ValueAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnnotation_ValueSTRINGTerminalRuleCall_3_0ElementType() {
		return Annotation_ValueSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxElementType() {
		return TerminologyBox_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBox_AlternativesElementType() {
		return TerminologyBox_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBox_BundleParserRuleCall_0ElementType() {
		return TerminologyBox_BundleParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBox_TerminologyGraphParserRuleCall_1ElementType() {
		return TerminologyBox_TerminologyGraphParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraphElementType() {
		return TerminologyGraph_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_GroupElementType() {
		return TerminologyGraph_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_KindAssignment_0ElementType() {
		return TerminologyGraph_KindAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0ElementType() {
		return TerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1ElementType() {
		return TerminologyGraph_TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_IriAssignment_2ElementType() {
		return TerminologyGraph_IriAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_IriIRITerminalRuleCall_2_0ElementType() {
		return TerminologyGraph_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_LCURLYTerminalRuleCall_3ElementType() {
		return TerminologyGraph_LCURLYTerminalRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_Alternatives_4ElementType() {
		return TerminologyGraph_Alternatives_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_AnnotationsAssignment_4_0ElementType() {
		return TerminologyGraph_AnnotationsAssignment_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0ElementType() {
		return TerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_TerminologyBoxAxiomsAssignment_4_1ElementType() {
		return TerminologyGraph_TerminologyBoxAxiomsAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType() {
		return TerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_BoxStatementsAssignment_4_2ElementType() {
		return TerminologyGraph_BoxStatementsAssignment_4_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType() {
		return TerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraph_RCURLYTerminalRuleCall_5ElementType() {
		return TerminologyGraph_RCURLYTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundleElementType() {
		return Bundle_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_GroupElementType() {
		return Bundle_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_KindAssignment_0ElementType() {
		return Bundle_KindAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_KindTerminologyGraphKindEnumRuleCall_0_0ElementType() {
		return Bundle_KindTerminologyGraphKindEnumRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_BUNDLE_TOKENTerminalRuleCall_1ElementType() {
		return Bundle_BUNDLE_TOKENTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_IriAssignment_2ElementType() {
		return Bundle_IriAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_IriIRITerminalRuleCall_2_0ElementType() {
		return Bundle_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_LCURLYTerminalRuleCall_3ElementType() {
		return Bundle_LCURLYTerminalRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_Alternatives_4ElementType() {
		return Bundle_Alternatives_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_AnnotationsAssignment_4_0ElementType() {
		return Bundle_AnnotationsAssignment_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_AnnotationsAnnotationParserRuleCall_4_0_0ElementType() {
		return Bundle_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_TerminologyBoxAxiomsAssignment_4_1ElementType() {
		return Bundle_TerminologyBoxAxiomsAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType() {
		return Bundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_BoxStatementsAssignment_4_2ElementType() {
		return Bundle_BoxStatementsAssignment_4_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType() {
		return Bundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_BundleStatementsAssignment_4_3ElementType() {
		return Bundle_BundleStatementsAssignment_4_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0ElementType() {
		return Bundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_TerminologyBundleAxiomsAssignment_4_4ElementType() {
		return Bundle_TerminologyBundleAxiomsAssignment_4_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0ElementType() {
		return Bundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundle_RCURLYTerminalRuleCall_5ElementType() {
		return Bundle_RCURLYTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxAxiomElementType() {
		return TerminologyBoxAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxAxiom_AlternativesElementType() {
		return TerminologyBoxAxiom_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxAxiom_ConceptDesignationTerminologyAxiomParserRuleCall_0ElementType() {
		return TerminologyBoxAxiom_ConceptDesignationTerminologyAxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxAxiom_TerminologyExtensionAxiomParserRuleCall_1ElementType() {
		return TerminologyBoxAxiom_TerminologyExtensionAxiomParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxAxiom_TerminologyNestingAxiomParserRuleCall_2ElementType() {
		return TerminologyBoxAxiom_TerminologyNestingAxiomParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxStatementElementType() {
		return TerminologyBoxStatement_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxStatement_AlternativesElementType() {
		return TerminologyBoxStatement_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxStatement_AxiomParserRuleCall_0ElementType() {
		return TerminologyBoxStatement_AxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBoxStatement_TermParserRuleCall_1ElementType() {
		return TerminologyBoxStatement_TermParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTermElementType() {
		return Term_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerm_AlternativesElementType() {
		return Term_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerm_AtomicEntityParserRuleCall_0ElementType() {
		return Term_AtomicEntityParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerm_EntityRelationshipParserRuleCall_1ElementType() {
		return Term_EntityRelationshipParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerm_DatatypeParserRuleCall_2ElementType() {
		return Term_DatatypeParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerm_DataRelationshipParserRuleCall_3ElementType() {
		return Term_DataRelationshipParserRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAtomicEntityElementType() {
		return AtomicEntity_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAtomicEntity_AlternativesElementType() {
		return AtomicEntity_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAtomicEntity_AspectParserRuleCall_0ElementType() {
		return AtomicEntity_AspectParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAtomicEntity_ConceptParserRuleCall_1ElementType() {
		return AtomicEntity_ConceptParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityRelationshipElementType() {
		return EntityRelationship_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityRelationship_AlternativesElementType() {
		return EntityRelationship_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityRelationship_ReifiedRelationshipParserRuleCall_0ElementType() {
		return EntityRelationship_ReifiedRelationshipParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityRelationship_UnreifiedRelationshipParserRuleCall_1ElementType() {
		return EntityRelationship_UnreifiedRelationshipParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDatatypeElementType() {
		return Datatype_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDatatype_AlternativesElementType() {
		return Datatype_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDatatype_ScalarDataRangeParserRuleCall_0ElementType() {
		return Datatype_ScalarDataRangeParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDatatype_StructureParserRuleCall_1ElementType() {
		return Datatype_StructureParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataRangeElementType() {
		return ScalarDataRange_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataRange_AlternativesElementType() {
		return ScalarDataRange_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataRange_ScalarParserRuleCall_0ElementType() {
		return ScalarDataRange_ScalarParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataRange_RestrictedDataRangeParserRuleCall_1ElementType() {
		return ScalarDataRange_RestrictedDataRangeParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRangeElementType() {
		return RestrictedDataRange_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_AlternativesElementType() {
		return RestrictedDataRange_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_BinaryScalarRestrictionParserRuleCall_0ElementType() {
		return RestrictedDataRange_BinaryScalarRestrictionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_IRIScalarRestrictionParserRuleCall_1ElementType() {
		return RestrictedDataRange_IRIScalarRestrictionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_NumericScalarRestrictionParserRuleCall_2ElementType() {
		return RestrictedDataRange_NumericScalarRestrictionParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_PlainLiteralScalarRestrictionParserRuleCall_3ElementType() {
		return RestrictedDataRange_PlainLiteralScalarRestrictionParserRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_ScalarOneOfRestrictionParserRuleCall_4ElementType() {
		return RestrictedDataRange_ScalarOneOfRestrictionParserRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_StringScalarRestrictionParserRuleCall_5ElementType() {
		return RestrictedDataRange_StringScalarRestrictionParserRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_SynonymScalarRestrictionParserRuleCall_6ElementType() {
		return RestrictedDataRange_SynonymScalarRestrictionParserRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRestrictedDataRange_TimeScalarRestrictionParserRuleCall_7ElementType() {
		return RestrictedDataRange_TimeScalarRestrictionParserRuleCall_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataRelationshipElementType() {
		return DataRelationship_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataRelationship_AlternativesElementType() {
		return DataRelationship_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataRelationship_EntityStructuredDataPropertyParserRuleCall_0ElementType() {
		return DataRelationship_EntityStructuredDataPropertyParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataRelationship_EntityScalarDataPropertyParserRuleCall_1ElementType() {
		return DataRelationship_EntityScalarDataPropertyParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataRelationship_StructuredDataPropertyParserRuleCall_2ElementType() {
		return DataRelationship_StructuredDataPropertyParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataRelationship_ScalarDataPropertyParserRuleCall_3ElementType() {
		return DataRelationship_ScalarDataPropertyParserRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAxiomElementType() {
		return Axiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAxiom_AlternativesElementType() {
		return Axiom_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAxiom_ScalarOneOfLiteralAxiomParserRuleCall_0ElementType() {
		return Axiom_ScalarOneOfLiteralAxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAxiom_TermAxiomParserRuleCall_1ElementType() {
		return Axiom_TermAxiomParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTermAxiomElementType() {
		return TermAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTermAxiom_AlternativesElementType() {
		return TermAxiom_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTermAxiom_EntityRestrictionAxiomParserRuleCall_0ElementType() {
		return TermAxiom_EntityRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTermAxiom_EntityScalarDataPropertyRestrictionAxiomParserRuleCall_1ElementType() {
		return TermAxiom_EntityScalarDataPropertyRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTermAxiom_SpecializationAxiomParserRuleCall_2ElementType() {
		return TermAxiom_SpecializationAxiomParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityRestrictionAxiomElementType() {
		return EntityRestrictionAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityRestrictionAxiom_AlternativesElementType() {
		return EntityRestrictionAxiom_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityRestrictionAxiom_EntityExistentialRestrictionAxiomParserRuleCall_0ElementType() {
		return EntityRestrictionAxiom_EntityExistentialRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityRestrictionAxiom_EntityUniversalRestrictionAxiomParserRuleCall_1ElementType() {
		return EntityRestrictionAxiom_EntityUniversalRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyRestrictionAxiomElementType() {
		return EntityScalarDataPropertyRestrictionAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyRestrictionAxiom_AlternativesElementType() {
		return EntityScalarDataPropertyRestrictionAxiom_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0ElementType() {
		return EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1ElementType() {
		return EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2ElementType() {
		return EntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecializationAxiomElementType() {
		return SpecializationAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecializationAxiom_AlternativesElementType() {
		return SpecializationAxiom_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecializationAxiom_ConceptSpecializationAxiomParserRuleCall_0ElementType() {
		return SpecializationAxiom_ConceptSpecializationAxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecializationAxiom_AspectSpecializationAxiomParserRuleCall_1ElementType() {
		return SpecializationAxiom_AspectSpecializationAxiomParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecializationAxiom_ReifiedRelationshipSpecializationAxiomParserRuleCall_2ElementType() {
		return SpecializationAxiom_ReifiedRelationshipSpecializationAxiomParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBundleStatementElementType() {
		return TerminologyBundleStatement_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBundleStatement_AlternativesElementType() {
		return TerminologyBundleStatement_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBundleStatement_AnonymousConceptTaxonomyAxiomParserRuleCall_0ElementType() {
		return TerminologyBundleStatement_AnonymousConceptTaxonomyAxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBundleStatement_RootConceptTaxonomyAxiomParserRuleCall_1ElementType() {
		return TerminologyBundleStatement_RootConceptTaxonomyAxiomParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBundleStatement_SpecificDisjointConceptAxiomParserRuleCall_2ElementType() {
		return TerminologyBundleStatement_SpecificDisjointConceptAxiomParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBundleAxiomElementType() {
		return TerminologyBundleAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyBundleAxiom_BundledTerminologyAxiomParserRuleCallElementType() {
		return TerminologyBundleAxiom_BundledTerminologyAxiomParserRuleCall_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptTreeDisjunctionElementType() {
		return ConceptTreeDisjunction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptTreeDisjunction_AlternativesElementType() {
		return ConceptTreeDisjunction_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptTreeDisjunction_AnonymousConceptTaxonomyAxiomParserRuleCall_0ElementType() {
		return ConceptTreeDisjunction_AnonymousConceptTaxonomyAxiomParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptTreeDisjunction_RootConceptTaxonomyAxiomParserRuleCall_1ElementType() {
		return ConceptTreeDisjunction_RootConceptTaxonomyAxiomParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraphKindElementType() {
		return TerminologyGraphKind_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraphKind_AlternativesElementType() {
		return TerminologyGraphKind_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0ElementType() {
		return TerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraphKind_OpenWorldDefinitionsOpenKeyword_0_0ElementType() {
		return TerminologyGraphKind_OpenWorldDefinitionsOpenKeyword_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1ElementType() {
		return TerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyGraphKind_ClosedWorldDesignationsClosedKeyword_1_0ElementType() {
		return TerminologyGraphKind_ClosedWorldDesignationsClosedKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectElementType() {
		return Aspect_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspect_GroupElementType() {
		return Aspect_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspect_ASPECT_TOKENTerminalRuleCall_0ElementType() {
		return Aspect_ASPECT_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspect_NameAssignment_1ElementType() {
		return Aspect_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspect_NameIDTerminalRuleCall_1_0ElementType() {
		return Aspect_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptElementType() {
		return Concept_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConcept_GroupElementType() {
		return Concept_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConcept_IsAbstractAssignment_0ElementType() {
		return Concept_IsAbstractAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConcept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType() {
		return Concept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConcept_CONCEPT_TOKENTerminalRuleCall_1ElementType() {
		return Concept_CONCEPT_TOKENTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConcept_NameAssignment_2ElementType() {
		return Concept_NameAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConcept_NameIDTerminalRuleCall_2_0ElementType() {
		return Concept_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipElementType() {
		return ReifiedRelationship_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_GroupElementType() {
		return ReifiedRelationship_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsAbstractAssignment_0ElementType() {
		return ReifiedRelationship_IsAbstractAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType() {
		return ReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_REIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1ElementType() {
		return ReifiedRelationship_REIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_NameAssignment_2ElementType() {
		return ReifiedRelationship_NameAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_NameIDTerminalRuleCall_2_0ElementType() {
		return ReifiedRelationship_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_LCURLYTerminalRuleCall_3ElementType() {
		return ReifiedRelationship_LCURLYTerminalRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsFunctionalAssignment_4ElementType() {
		return ReifiedRelationship_IsFunctionalAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType() {
		return ReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsInverseFunctionalAssignment_5ElementType() {
		return ReifiedRelationship_IsInverseFunctionalAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0ElementType() {
		return ReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsEssentialAssignment_6ElementType() {
		return ReifiedRelationship_IsEssentialAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0ElementType() {
		return ReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsInverseEssentialAssignment_7ElementType() {
		return ReifiedRelationship_IsInverseEssentialAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0ElementType() {
		return ReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsSymmetricAssignment_8ElementType() {
		return ReifiedRelationship_IsSymmetricAssignment_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0ElementType() {
		return ReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsAsymmetricAssignment_9ElementType() {
		return ReifiedRelationship_IsAsymmetricAssignment_9_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0ElementType() {
		return ReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsReflexiveAssignment_10ElementType() {
		return ReifiedRelationship_IsReflexiveAssignment_10_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType() {
		return ReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsIrreflexiveAssignment_11ElementType() {
		return ReifiedRelationship_IsIrreflexiveAssignment_11_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0ElementType() {
		return ReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsTransitiveAssignment_12ElementType() {
		return ReifiedRelationship_IsTransitiveAssignment_12_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0ElementType() {
		return ReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_UNREIFIED_TOKENTerminalRuleCall_13ElementType() {
		return ReifiedRelationship_UNREIFIED_TOKENTerminalRuleCall_13_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_EQUALTerminalRuleCall_14ElementType() {
		return ReifiedRelationship_EQUALTerminalRuleCall_14_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_UnreifiedPropertyNameAssignment_15ElementType() {
		return ReifiedRelationship_UnreifiedPropertyNameAssignment_15_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0ElementType() {
		return ReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_Group_16ElementType() {
		return ReifiedRelationship_Group_16_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0ElementType() {
		return ReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_EQUALTerminalRuleCall_16_1ElementType() {
		return ReifiedRelationship_EQUALTerminalRuleCall_16_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_UnreifiedInversePropertyNameAssignment_16_2ElementType() {
		return ReifiedRelationship_UnreifiedInversePropertyNameAssignment_16_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0ElementType() {
		return ReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_SOURCE_TOKENTerminalRuleCall_17ElementType() {
		return ReifiedRelationship_SOURCE_TOKENTerminalRuleCall_17_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_EQUALTerminalRuleCall_18ElementType() {
		return ReifiedRelationship_EQUALTerminalRuleCall_18_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_SourceAssignment_19ElementType() {
		return ReifiedRelationship_SourceAssignment_19_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_SourceEntityCrossReference_19_0ElementType() {
		return ReifiedRelationship_SourceEntityCrossReference_19_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_SourceEntityReferenceParserRuleCall_19_0_1ElementType() {
		return ReifiedRelationship_SourceEntityReferenceParserRuleCall_19_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_TARGET_TOKENTerminalRuleCall_20ElementType() {
		return ReifiedRelationship_TARGET_TOKENTerminalRuleCall_20_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_EQUALTerminalRuleCall_21ElementType() {
		return ReifiedRelationship_EQUALTerminalRuleCall_21_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_TargetAssignment_22ElementType() {
		return ReifiedRelationship_TargetAssignment_22_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_TargetEntityCrossReference_22_0ElementType() {
		return ReifiedRelationship_TargetEntityCrossReference_22_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_TargetEntityReferenceParserRuleCall_22_0_1ElementType() {
		return ReifiedRelationship_TargetEntityReferenceParserRuleCall_22_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationship_RCURLYTerminalRuleCall_23ElementType() {
		return ReifiedRelationship_RCURLYTerminalRuleCall_23_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipElementType() {
		return UnreifiedRelationship_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_GroupElementType() {
		return UnreifiedRelationship_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0ElementType() {
		return UnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_NameAssignment_1ElementType() {
		return UnreifiedRelationship_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_NameIDTerminalRuleCall_1_0ElementType() {
		return UnreifiedRelationship_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_LCURLYTerminalRuleCall_2ElementType() {
		return UnreifiedRelationship_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsFunctionalAssignment_3ElementType() {
		return UnreifiedRelationship_IsFunctionalAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0ElementType() {
		return UnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsInverseFunctionalAssignment_4ElementType() {
		return UnreifiedRelationship_IsInverseFunctionalAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType() {
		return UnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsEssentialAssignment_5ElementType() {
		return UnreifiedRelationship_IsEssentialAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0ElementType() {
		return UnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsInverseEssentialAssignment_6ElementType() {
		return UnreifiedRelationship_IsInverseEssentialAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0ElementType() {
		return UnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsSymmetricAssignment_7ElementType() {
		return UnreifiedRelationship_IsSymmetricAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0ElementType() {
		return UnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsAsymmetricAssignment_8ElementType() {
		return UnreifiedRelationship_IsAsymmetricAssignment_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0ElementType() {
		return UnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsReflexiveAssignment_9ElementType() {
		return UnreifiedRelationship_IsReflexiveAssignment_9_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0ElementType() {
		return UnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsIrreflexiveAssignment_10ElementType() {
		return UnreifiedRelationship_IsIrreflexiveAssignment_10_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType() {
		return UnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsTransitiveAssignment_11ElementType() {
		return UnreifiedRelationship_IsTransitiveAssignment_11_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0ElementType() {
		return UnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_SOURCE_TOKENTerminalRuleCall_12ElementType() {
		return UnreifiedRelationship_SOURCE_TOKENTerminalRuleCall_12_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_EQUALTerminalRuleCall_13ElementType() {
		return UnreifiedRelationship_EQUALTerminalRuleCall_13_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_SourceAssignment_14ElementType() {
		return UnreifiedRelationship_SourceAssignment_14_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_SourceEntityCrossReference_14_0ElementType() {
		return UnreifiedRelationship_SourceEntityCrossReference_14_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_SourceEntityReferenceParserRuleCall_14_0_1ElementType() {
		return UnreifiedRelationship_SourceEntityReferenceParserRuleCall_14_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15ElementType() {
		return UnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_EQUALTerminalRuleCall_16ElementType() {
		return UnreifiedRelationship_EQUALTerminalRuleCall_16_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_TargetAssignment_17ElementType() {
		return UnreifiedRelationship_TargetAssignment_17_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_TargetEntityCrossReference_17_0ElementType() {
		return UnreifiedRelationship_TargetEntityCrossReference_17_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_TargetEntityReferenceParserRuleCall_17_0_1ElementType() {
		return UnreifiedRelationship_TargetEntityReferenceParserRuleCall_17_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationship_RCURLYTerminalRuleCall_18ElementType() {
		return UnreifiedRelationship_RCURLYTerminalRuleCall_18_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarElementType() {
		return Scalar_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalar_GroupElementType() {
		return Scalar_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalar_SCALAR_TOKENTerminalRuleCall_0ElementType() {
		return Scalar_SCALAR_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalar_NameAssignment_1ElementType() {
		return Scalar_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalar_NameIDTerminalRuleCall_1_0ElementType() {
		return Scalar_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructureElementType() {
		return Structure_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructure_GroupElementType() {
		return Structure_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructure_STRUCTURE_TOKENTerminalRuleCall_0ElementType() {
		return Structure_STRUCTURE_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructure_NameAssignment_1ElementType() {
		return Structure_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructure_NameIDTerminalRuleCall_1_0ElementType() {
		return Structure_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataPropertyElementType() {
		return EntityStructuredDataProperty_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_GroupElementType() {
		return EntityStructuredDataProperty_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0ElementType() {
		return EntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_NameAssignment_1ElementType() {
		return EntityStructuredDataProperty_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType() {
		return EntityStructuredDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType() {
		return EntityStructuredDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType() {
		return EntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_DomainAssignment_4ElementType() {
		return EntityStructuredDataProperty_DomainAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_DomainEntityCrossReference_4_0ElementType() {
		return EntityStructuredDataProperty_DomainEntityCrossReference_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_DomainEntityReferenceParserRuleCall_4_0_1ElementType() {
		return EntityStructuredDataProperty_DomainEntityReferenceParserRuleCall_4_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType() {
		return EntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_RangeAssignment_6ElementType() {
		return EntityStructuredDataProperty_RangeAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_RangeStructureCrossReference_6_0ElementType() {
		return EntityStructuredDataProperty_RangeStructureCrossReference_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1ElementType() {
		return EntityStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType() {
		return EntityStructuredDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyElementType() {
		return EntityScalarDataProperty_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_GroupElementType() {
		return EntityScalarDataProperty_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_EntityScalarDataPropertyKeyword_0ElementType() {
		return EntityScalarDataProperty_EntityScalarDataPropertyKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_NameAssignment_1ElementType() {
		return EntityScalarDataProperty_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType() {
		return EntityScalarDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_LCURLYTerminalRuleCall_2ElementType() {
		return EntityScalarDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType() {
		return EntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_DomainAssignment_4ElementType() {
		return EntityScalarDataProperty_DomainAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_DomainEntityCrossReference_4_0ElementType() {
		return EntityScalarDataProperty_DomainEntityCrossReference_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_DomainEntityReferenceParserRuleCall_4_0_1ElementType() {
		return EntityScalarDataProperty_DomainEntityReferenceParserRuleCall_4_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType() {
		return EntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_RangeAssignment_6ElementType() {
		return EntityScalarDataProperty_RangeAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType() {
		return EntityScalarDataProperty_RangeDataRangeCrossReference_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1ElementType() {
		return EntityScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataProperty_RCURLYTerminalRuleCall_7ElementType() {
		return EntityScalarDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyElementType() {
		return StructuredDataProperty_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_GroupElementType() {
		return StructuredDataProperty_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_StructuredDataPropertyKeyword_0ElementType() {
		return StructuredDataProperty_StructuredDataPropertyKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_NameAssignment_1ElementType() {
		return StructuredDataProperty_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType() {
		return StructuredDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType() {
		return StructuredDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType() {
		return StructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_DomainAssignment_4ElementType() {
		return StructuredDataProperty_DomainAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_DomainStructureCrossReference_4_0ElementType() {
		return StructuredDataProperty_DomainStructureCrossReference_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_DomainStructureReferenceParserRuleCall_4_0_1ElementType() {
		return StructuredDataProperty_DomainStructureReferenceParserRuleCall_4_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType() {
		return StructuredDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_RangeAssignment_6ElementType() {
		return StructuredDataProperty_RangeAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_RangeStructureCrossReference_6_0ElementType() {
		return StructuredDataProperty_RangeStructureCrossReference_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1ElementType() {
		return StructuredDataProperty_RangeStructureReferenceParserRuleCall_6_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType() {
		return StructuredDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyElementType() {
		return ScalarDataProperty_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_GroupElementType() {
		return ScalarDataProperty_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_ScalarDataPropertyKeyword_0ElementType() {
		return ScalarDataProperty_ScalarDataPropertyKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_NameAssignment_1ElementType() {
		return ScalarDataProperty_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType() {
		return ScalarDataProperty_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_LCURLYTerminalRuleCall_2ElementType() {
		return ScalarDataProperty_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType() {
		return ScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_DomainAssignment_4ElementType() {
		return ScalarDataProperty_DomainAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_DomainStructureCrossReference_4_0ElementType() {
		return ScalarDataProperty_DomainStructureCrossReference_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_DomainStructureReferenceParserRuleCall_4_0_1ElementType() {
		return ScalarDataProperty_DomainStructureReferenceParserRuleCall_4_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType() {
		return ScalarDataProperty_RANGE_TOKENTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_RangeAssignment_6ElementType() {
		return ScalarDataProperty_RangeAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType() {
		return ScalarDataProperty_RangeDataRangeCrossReference_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1ElementType() {
		return ScalarDataProperty_RangeDataRangeReferenceParserRuleCall_6_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataProperty_RCURLYTerminalRuleCall_7ElementType() {
		return ScalarDataProperty_RCURLYTerminalRuleCall_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiomElementType() {
		return AnonymousConceptTaxonomyAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiom_GroupElementType() {
		return AnonymousConceptTaxonomyAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return AnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return AnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2ElementType() {
		return AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentAssignment_3ElementType() {
		return AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType() {
		return AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1ElementType() {
		return AnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAnonymousConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType() {
		return AnonymousConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiomElementType() {
		return RootConceptTaxonomyAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiom_GroupElementType() {
		return RootConceptTaxonomyAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return RootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return RootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiom_RootKeyword_2ElementType() {
		return RootConceptTaxonomyAxiom_RootKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiom_RootAssignment_3ElementType() {
		return RootConceptTaxonomyAxiom_RootAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiom_RootConceptCrossReference_3_0ElementType() {
		return RootConceptTaxonomyAxiom_RootConceptCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiom_RootConceptReferenceParserRuleCall_3_0_1ElementType() {
		return RootConceptTaxonomyAxiom_RootConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRootConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType() {
		return RootConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiomElementType() {
		return SpecificDisjointConceptAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_GroupElementType() {
		return SpecificDisjointConceptAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return SpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return SpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2ElementType() {
		return SpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_DisjointTaxonomyParentAssignment_3ElementType() {
		return SpecificDisjointConceptAxiom_DisjointTaxonomyParentAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType() {
		return SpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1ElementType() {
		return SpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_DisjointLeafKeyword_4ElementType() {
		return SpecificDisjointConceptAxiom_DisjointLeafKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_DisjointLeafAssignment_5ElementType() {
		return SpecificDisjointConceptAxiom_DisjointLeafAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0ElementType() {
		return SpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_DisjointLeafConceptReferenceParserRuleCall_5_0_1ElementType() {
		return SpecificDisjointConceptAxiom_DisjointLeafConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSpecificDisjointConceptAxiom_RCURLYTerminalRuleCall_6ElementType() {
		return SpecificDisjointConceptAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiomElementType() {
		return BundledTerminologyAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiom_GroupElementType() {
		return BundledTerminologyAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return BundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return BundledTerminologyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiom_BundledTerminologyKeyword_2ElementType() {
		return BundledTerminologyAxiom_BundledTerminologyKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiom_BundledTerminologyAssignment_3ElementType() {
		return BundledTerminologyAxiom_BundledTerminologyAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0ElementType() {
		return BundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiom_BundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType() {
		return BundledTerminologyAxiom_BundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBundledTerminologyAxiom_RCURLYTerminalRuleCall_4ElementType() {
		return BundledTerminologyAxiom_RCURLYTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiomElementType() {
		return ConceptDesignationTerminologyAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_GroupElementType() {
		return ConceptDesignationTerminologyAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return ConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return ConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2ElementType() {
		return ConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_DesignatedTerminologyAssignment_3ElementType() {
		return ConceptDesignationTerminologyAxiom_DesignatedTerminologyAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0ElementType() {
		return ConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType() {
		return ConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4ElementType() {
		return ConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_DesignatedConceptAssignment_5ElementType() {
		return ConceptDesignationTerminologyAxiom_DesignatedConceptAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0ElementType() {
		return ConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_DesignatedConceptConceptReferenceParserRuleCall_5_0_1ElementType() {
		return ConceptDesignationTerminologyAxiom_DesignatedConceptConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptDesignationTerminologyAxiom_RCURLYTerminalRuleCall_6ElementType() {
		return ConceptDesignationTerminologyAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtensionAxiomElementType() {
		return TerminologyExtensionAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtensionAxiom_GroupElementType() {
		return TerminologyExtensionAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtensionAxiom_EXTENDS_TOKENTerminalRuleCall_0ElementType() {
		return TerminologyExtensionAxiom_EXTENDS_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtensionAxiom_ExtendedTerminologyAssignment_1ElementType() {
		return TerminologyExtensionAxiom_ExtendedTerminologyAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxCrossReference_1_0ElementType() {
		return TerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxCrossReference_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1ElementType() {
		return TerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiomElementType() {
		return TerminologyNestingAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_GroupElementType() {
		return TerminologyNestingAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return TerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return TerminologyNestingAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_NestingTerminologyKeyword_2ElementType() {
		return TerminologyNestingAxiom_NestingTerminologyKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_NestingTerminologyAssignment_3ElementType() {
		return TerminologyNestingAxiom_NestingTerminologyAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0ElementType() {
		return TerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_NestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1ElementType() {
		return TerminologyNestingAxiom_NestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_NestingContextKeyword_4ElementType() {
		return TerminologyNestingAxiom_NestingContextKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_NestingContextAssignment_5ElementType() {
		return TerminologyNestingAxiom_NestingContextAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_NestingContextConceptCrossReference_5_0ElementType() {
		return TerminologyNestingAxiom_NestingContextConceptCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_NestingContextConceptReferenceParserRuleCall_5_0_1ElementType() {
		return TerminologyNestingAxiom_NestingContextConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyNestingAxiom_RCURLYTerminalRuleCall_6ElementType() {
		return TerminologyNestingAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiomElementType() {
		return EntityExistentialRestrictionAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_GroupElementType() {
		return EntityExistentialRestrictionAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return EntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return EntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedRelationAssignment_3ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedRelationAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedRangeAssignment_5ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedRangeAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedDomainAssignment_7ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedDomainAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1ElementType() {
		return EntityExistentialRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
		return EntityExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiomElementType() {
		return EntityUniversalRestrictionAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_GroupElementType() {
		return EntityUniversalRestrictionAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return EntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return EntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedRelationAssignment_3ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedRelationAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedRangeAssignment_5ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedRangeAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedRangeEntityReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedDomainAssignment_7ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedDomainAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1ElementType() {
		return EntityUniversalRestrictionAxiom_RestrictedDomainEntityReferenceParserRuleCall_7_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
		return EntityUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiomElementType() {
		return AspectSpecializationAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiom_GroupElementType() {
		return AspectSpecializationAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiom_SubEntityAssignment_0ElementType() {
		return AspectSpecializationAxiom_SubEntityAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiom_SubEntityEntityCrossReference_0_0ElementType() {
		return AspectSpecializationAxiom_SubEntityEntityCrossReference_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiom_SubEntityEntityReferenceParserRuleCall_0_0_1ElementType() {
		return AspectSpecializationAxiom_SubEntityEntityReferenceParserRuleCall_0_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1ElementType() {
		return AspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiom_SuperAspectAssignment_2ElementType() {
		return AspectSpecializationAxiom_SuperAspectAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiom_SuperAspectAspectCrossReference_2_0ElementType() {
		return AspectSpecializationAxiom_SuperAspectAspectCrossReference_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAspectSpecializationAxiom_SuperAspectAspectReferenceParserRuleCall_2_0_1ElementType() {
		return AspectSpecializationAxiom_SuperAspectAspectReferenceParserRuleCall_2_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiomElementType() {
		return ConceptSpecializationAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_GroupElementType() {
		return ConceptSpecializationAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return ConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return ConceptSpecializationAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_SubConceptKeyword_2ElementType() {
		return ConceptSpecializationAxiom_SubConceptKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_SubConceptAssignment_3ElementType() {
		return ConceptSpecializationAxiom_SubConceptAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0ElementType() {
		return ConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_SubConceptConceptReferenceParserRuleCall_3_0_1ElementType() {
		return ConceptSpecializationAxiom_SubConceptConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_SuperConceptKeyword_4ElementType() {
		return ConceptSpecializationAxiom_SuperConceptKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_SuperConceptAssignment_5ElementType() {
		return ConceptSpecializationAxiom_SuperConceptAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0ElementType() {
		return ConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_SuperConceptConceptReferenceParserRuleCall_5_0_1ElementType() {
		return ConceptSpecializationAxiom_SuperConceptConceptReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType() {
		return ConceptSpecializationAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiomElementType() {
		return ReifiedRelationshipSpecializationAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_GroupElementType() {
		return ReifiedRelationshipSpecializationAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return ReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return ReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2ElementType() {
		return ReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_SubRelationshipAssignment_3ElementType() {
		return ReifiedRelationshipSpecializationAxiom_SubRelationshipAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0ElementType() {
		return ReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
		return ReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4ElementType() {
		return ReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_SuperRelationshipAssignment_5ElementType() {
		return ReifiedRelationshipSpecializationAxiom_SuperRelationshipAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0ElementType() {
		return ReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1ElementType() {
		return ReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType() {
		return ReifiedRelationshipSpecializationAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiomElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_GroupElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityAssignment_3ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyAssignment_5ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionAssignment_7ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
		return EntityScalarDataPropertyExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiomElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_GroupElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityAssignment_3ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyAssignment_5ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueAssignment_7ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyParticularRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
		return EntityScalarDataPropertyParticularRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiomElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_GroupElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityAssignment_3ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyAssignment_5ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionAssignment_7ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEntityScalarDataPropertyUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType() {
		return EntityScalarDataPropertyUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestrictionElementType() {
		return BinaryScalarRestriction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_GroupElementType() {
		return BinaryScalarRestriction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
		return BinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_NameAssignment_1ElementType() {
		return BinaryScalarRestriction_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
		return BinaryScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
		return BinaryScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_Group_3ElementType() {
		return BinaryScalarRestriction_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_LengthKeyword_3_0ElementType() {
		return BinaryScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_LengthAssignment_3_1ElementType() {
		return BinaryScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType() {
		return BinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_Group_4ElementType() {
		return BinaryScalarRestriction_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_MinLengthKeyword_4_0ElementType() {
		return BinaryScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_MinLengthAssignment_4_1ElementType() {
		return BinaryScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType() {
		return BinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_Group_5ElementType() {
		return BinaryScalarRestriction_Group_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_MaxLengthKeyword_5_0ElementType() {
		return BinaryScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_MaxLengthAssignment_5_1ElementType() {
		return BinaryScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType() {
		return BinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_RestrictedRangeKeyword_6ElementType() {
		return BinaryScalarRestriction_RestrictedRangeKeyword_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_RestrictedRangeAssignment_7ElementType() {
		return BinaryScalarRestriction_RestrictedRangeAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0ElementType() {
		return BinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_7_0_1ElementType() {
		return BinaryScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_7_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBinaryScalarRestriction_RCURLYTerminalRuleCall_8ElementType() {
		return BinaryScalarRestriction_RCURLYTerminalRuleCall_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestrictionElementType() {
		return IRIScalarRestriction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_GroupElementType() {
		return IRIScalarRestriction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
		return IRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_NameAssignment_1ElementType() {
		return IRIScalarRestriction_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
		return IRIScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
		return IRIScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_Group_3ElementType() {
		return IRIScalarRestriction_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_LengthKeyword_3_0ElementType() {
		return IRIScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_LengthAssignment_3_1ElementType() {
		return IRIScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType() {
		return IRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_Group_4ElementType() {
		return IRIScalarRestriction_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_MinLengthKeyword_4_0ElementType() {
		return IRIScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_MinLengthAssignment_4_1ElementType() {
		return IRIScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType() {
		return IRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_Group_5ElementType() {
		return IRIScalarRestriction_Group_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_MaxLengthKeyword_5_0ElementType() {
		return IRIScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_MaxLengthAssignment_5_1ElementType() {
		return IRIScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType() {
		return IRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_Group_6ElementType() {
		return IRIScalarRestriction_Group_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_PatternKeyword_6_0ElementType() {
		return IRIScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_PatternAssignment_6_1ElementType() {
		return IRIScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType() {
		return IRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_RestrictedRangeKeyword_7ElementType() {
		return IRIScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_RestrictedRangeAssignment_8ElementType() {
		return IRIScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType() {
		return IRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType() {
		return IRIScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getIRIScalarRestriction_RCURLYTerminalRuleCall_9ElementType() {
		return IRIScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestrictionElementType() {
		return NumericScalarRestriction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_GroupElementType() {
		return NumericScalarRestriction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
		return NumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_NameAssignment_1ElementType() {
		return NumericScalarRestriction_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
		return NumericScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
		return NumericScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_Group_3ElementType() {
		return NumericScalarRestriction_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MinInclusiveKeyword_3_0ElementType() {
		return NumericScalarRestriction_MinInclusiveKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MinInclusiveAssignment_3_1ElementType() {
		return NumericScalarRestriction_MinInclusiveAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType() {
		return NumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_Group_4ElementType() {
		return NumericScalarRestriction_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MaxInclusiveKeyword_4_0ElementType() {
		return NumericScalarRestriction_MaxInclusiveKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MaxInclusiveAssignment_4_1ElementType() {
		return NumericScalarRestriction_MaxInclusiveAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType() {
		return NumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_Group_5ElementType() {
		return NumericScalarRestriction_Group_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MinExclusiveKeyword_5_0ElementType() {
		return NumericScalarRestriction_MinExclusiveKeyword_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MinExclusiveAssignment_5_1ElementType() {
		return NumericScalarRestriction_MinExclusiveAssignment_5_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType() {
		return NumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_Group_6ElementType() {
		return NumericScalarRestriction_Group_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MaxExclusiveKeyword_6_0ElementType() {
		return NumericScalarRestriction_MaxExclusiveKeyword_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MaxExclusiveAssignment_6_1ElementType() {
		return NumericScalarRestriction_MaxExclusiveAssignment_6_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType() {
		return NumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_RestrictedRangeKeyword_7ElementType() {
		return NumericScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_RestrictedRangeAssignment_8ElementType() {
		return NumericScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType() {
		return NumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType() {
		return NumericScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNumericScalarRestriction_RCURLYTerminalRuleCall_9ElementType() {
		return NumericScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestrictionElementType() {
		return PlainLiteralScalarRestriction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_GroupElementType() {
		return PlainLiteralScalarRestriction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
		return PlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_NameAssignment_1ElementType() {
		return PlainLiteralScalarRestriction_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
		return PlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
		return PlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_Group_3ElementType() {
		return PlainLiteralScalarRestriction_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_LengthKeyword_3_0ElementType() {
		return PlainLiteralScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_LengthAssignment_3_1ElementType() {
		return PlainLiteralScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType() {
		return PlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_Group_4ElementType() {
		return PlainLiteralScalarRestriction_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_MinLengthKeyword_4_0ElementType() {
		return PlainLiteralScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_MinLengthAssignment_4_1ElementType() {
		return PlainLiteralScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType() {
		return PlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_Group_5ElementType() {
		return PlainLiteralScalarRestriction_Group_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_MaxLengthKeyword_5_0ElementType() {
		return PlainLiteralScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_MaxLengthAssignment_5_1ElementType() {
		return PlainLiteralScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType() {
		return PlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_Group_6ElementType() {
		return PlainLiteralScalarRestriction_Group_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_PatternKeyword_6_0ElementType() {
		return PlainLiteralScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_PatternAssignment_6_1ElementType() {
		return PlainLiteralScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType() {
		return PlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_Group_7ElementType() {
		return PlainLiteralScalarRestriction_Group_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_LangRangeKeyword_7_0ElementType() {
		return PlainLiteralScalarRestriction_LangRangeKeyword_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_LangRangeAssignment_7_1ElementType() {
		return PlainLiteralScalarRestriction_LangRangeAssignment_7_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_LangRangeSTRINGTerminalRuleCall_7_1_0ElementType() {
		return PlainLiteralScalarRestriction_LangRangeSTRINGTerminalRuleCall_7_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_RestrictedRangeKeyword_8ElementType() {
		return PlainLiteralScalarRestriction_RestrictedRangeKeyword_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_RestrictedRangeAssignment_9ElementType() {
		return PlainLiteralScalarRestriction_RestrictedRangeAssignment_9_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0ElementType() {
		return PlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_9_0_1ElementType() {
		return PlainLiteralScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_9_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPlainLiteralScalarRestriction_RCURLYTerminalRuleCall_10ElementType() {
		return PlainLiteralScalarRestriction_RCURLYTerminalRuleCall_10_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestrictionElementType() {
		return ScalarOneOfRestriction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_GroupElementType() {
		return ScalarOneOfRestriction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
		return ScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_NameAssignment_1ElementType() {
		return ScalarOneOfRestriction_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_NameIDTerminalRuleCall_1_0ElementType() {
		return ScalarOneOfRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_LCURLYTerminalRuleCall_2ElementType() {
		return ScalarOneOfRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_RestrictedRangeKeyword_3ElementType() {
		return ScalarOneOfRestriction_RestrictedRangeKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_RestrictedRangeAssignment_4ElementType() {
		return ScalarOneOfRestriction_RestrictedRangeAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType() {
		return ScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1ElementType() {
		return ScalarOneOfRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfRestriction_RCURLYTerminalRuleCall_5ElementType() {
		return ScalarOneOfRestriction_RCURLYTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiomElementType() {
		return ScalarOneOfLiteralAxiom_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_GroupElementType() {
		return ScalarOneOfLiteralAxiom_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0ElementType() {
		return ScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1ElementType() {
		return ScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_ValueKeyword_2ElementType() {
		return ScalarOneOfLiteralAxiom_ValueKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_ValueAssignment_3ElementType() {
		return ScalarOneOfLiteralAxiom_ValueAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0ElementType() {
		return ScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_AxiomKeyword_4ElementType() {
		return ScalarOneOfLiteralAxiom_AxiomKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_AxiomAssignment_5ElementType() {
		return ScalarOneOfLiteralAxiom_AxiomAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0ElementType() {
		return ScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1ElementType() {
		return ScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarOneOfLiteralAxiom_RCURLYTerminalRuleCall_6ElementType() {
		return ScalarOneOfLiteralAxiom_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestrictionElementType() {
		return StringScalarRestriction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_GroupElementType() {
		return StringScalarRestriction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
		return StringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_NameAssignment_1ElementType() {
		return StringScalarRestriction_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
		return StringScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
		return StringScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_Group_3ElementType() {
		return StringScalarRestriction_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_LengthKeyword_3_0ElementType() {
		return StringScalarRestriction_LengthKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_LengthAssignment_3_1ElementType() {
		return StringScalarRestriction_LengthAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType() {
		return StringScalarRestriction_LengthINTTerminalRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_Group_4ElementType() {
		return StringScalarRestriction_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_MinLengthKeyword_4_0ElementType() {
		return StringScalarRestriction_MinLengthKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_MinLengthAssignment_4_1ElementType() {
		return StringScalarRestriction_MinLengthAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType() {
		return StringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_Group_5ElementType() {
		return StringScalarRestriction_Group_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_MaxLengthKeyword_5_0ElementType() {
		return StringScalarRestriction_MaxLengthKeyword_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_MaxLengthAssignment_5_1ElementType() {
		return StringScalarRestriction_MaxLengthAssignment_5_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType() {
		return StringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_Group_6ElementType() {
		return StringScalarRestriction_Group_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_PatternKeyword_6_0ElementType() {
		return StringScalarRestriction_PatternKeyword_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_PatternAssignment_6_1ElementType() {
		return StringScalarRestriction_PatternAssignment_6_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType() {
		return StringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_RestrictedRangeKeyword_7ElementType() {
		return StringScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_RestrictedRangeAssignment_8ElementType() {
		return StringScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType() {
		return StringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType() {
		return StringScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStringScalarRestriction_RCURLYTerminalRuleCall_9ElementType() {
		return StringScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestrictionElementType() {
		return SynonymScalarRestriction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_GroupElementType() {
		return SynonymScalarRestriction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
		return SynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_NameAssignment_1ElementType() {
		return SynonymScalarRestriction_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
		return SynonymScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
		return SynonymScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_RestrictedRangeKeyword_3ElementType() {
		return SynonymScalarRestriction_RestrictedRangeKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_RestrictedRangeAssignment_4ElementType() {
		return SynonymScalarRestriction_RestrictedRangeAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType() {
		return SynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1ElementType() {
		return SynonymScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_4_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSynonymScalarRestriction_RCURLYTerminalRuleCall_5ElementType() {
		return SynonymScalarRestriction_RCURLYTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestrictionElementType() {
		return TimeScalarRestriction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_GroupElementType() {
		return TimeScalarRestriction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType() {
		return TimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_NameAssignment_1ElementType() {
		return TimeScalarRestriction_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_NameIDTerminalRuleCall_1_0ElementType() {
		return TimeScalarRestriction_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_LCURLYTerminalRuleCall_2ElementType() {
		return TimeScalarRestriction_LCURLYTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_Group_3ElementType() {
		return TimeScalarRestriction_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MinInclusiveKeyword_3_0ElementType() {
		return TimeScalarRestriction_MinInclusiveKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MinInclusiveAssignment_3_1ElementType() {
		return TimeScalarRestriction_MinInclusiveAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType() {
		return TimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_Group_4ElementType() {
		return TimeScalarRestriction_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MaxInclusiveKeyword_4_0ElementType() {
		return TimeScalarRestriction_MaxInclusiveKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MaxInclusiveAssignment_4_1ElementType() {
		return TimeScalarRestriction_MaxInclusiveAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType() {
		return TimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_Group_5ElementType() {
		return TimeScalarRestriction_Group_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MinExclusiveKeyword_5_0ElementType() {
		return TimeScalarRestriction_MinExclusiveKeyword_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MinExclusiveAssignment_5_1ElementType() {
		return TimeScalarRestriction_MinExclusiveAssignment_5_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType() {
		return TimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_Group_6ElementType() {
		return TimeScalarRestriction_Group_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MaxExclusiveKeyword_6_0ElementType() {
		return TimeScalarRestriction_MaxExclusiveKeyword_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MaxExclusiveAssignment_6_1ElementType() {
		return TimeScalarRestriction_MaxExclusiveAssignment_6_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType() {
		return TimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_RestrictedRangeKeyword_7ElementType() {
		return TimeScalarRestriction_RestrictedRangeKeyword_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_RestrictedRangeAssignment_8ElementType() {
		return TimeScalarRestriction_RestrictedRangeAssignment_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType() {
		return TimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1ElementType() {
		return TimeScalarRestriction_RestrictedRangeDataRangeReferenceParserRuleCall_8_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTimeScalarRestriction_RCURLYTerminalRuleCall_9ElementType() {
		return TimeScalarRestriction_RCURLYTerminalRuleCall_9_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxElementType() {
		return DescriptionBox_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_GroupElementType() {
		return DescriptionBox_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_KindAssignment_0ElementType() {
		return DescriptionBox_KindAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_KindDescriptionKindEnumRuleCall_0_0ElementType() {
		return DescriptionBox_KindDescriptionKindEnumRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_DESCRIPTION_BOX_TOKENTerminalRuleCall_1ElementType() {
		return DescriptionBox_DESCRIPTION_BOX_TOKENTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_IriAssignment_2ElementType() {
		return DescriptionBox_IriAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_IriIRITerminalRuleCall_2_0ElementType() {
		return DescriptionBox_IriIRITerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_LCURLYTerminalRuleCall_3ElementType() {
		return DescriptionBox_LCURLYTerminalRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_Alternatives_4ElementType() {
		return DescriptionBox_Alternatives_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_AnnotationsAssignment_4_0ElementType() {
		return DescriptionBox_AnnotationsAssignment_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_AnnotationsAnnotationParserRuleCall_4_0_0ElementType() {
		return DescriptionBox_AnnotationsAnnotationParserRuleCall_4_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ClosedWorldDefinitionsAssignment_4_1ElementType() {
		return DescriptionBox_ClosedWorldDefinitionsAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0ElementType() {
		return DescriptionBox_ClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_DescriptionBoxRefinementsAssignment_4_2ElementType() {
		return DescriptionBox_DescriptionBoxRefinementsAssignment_4_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_DescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0ElementType() {
		return DescriptionBox_DescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ConceptInstancesAssignment_4_3ElementType() {
		return DescriptionBox_ConceptInstancesAssignment_4_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ConceptInstancesConceptInstanceParserRuleCall_4_3_0ElementType() {
		return DescriptionBox_ConceptInstancesConceptInstanceParserRuleCall_4_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ReifiedRelationshipInstancesAssignment_4_4ElementType() {
		return DescriptionBox_ReifiedRelationshipInstancesAssignment_4_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0ElementType() {
		return DescriptionBox_ReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ReifiedRelationshipInstanceDomainsAssignment_4_5ElementType() {
		return DescriptionBox_ReifiedRelationshipInstanceDomainsAssignment_4_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0ElementType() {
		return DescriptionBox_ReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ReifiedRelationshipInstanceRangesAssignment_4_6ElementType() {
		return DescriptionBox_ReifiedRelationshipInstanceRangesAssignment_4_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_ReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0ElementType() {
		return DescriptionBox_ReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_UnreifiedRelationshipInstanceTuplesAssignment_4_7ElementType() {
		return DescriptionBox_UnreifiedRelationshipInstanceTuplesAssignment_4_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_UnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0ElementType() {
		return DescriptionBox_UnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBox_RCURLYTerminalRuleCall_5ElementType() {
		return DescriptionBox_RCURLYTerminalRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionKindElementType() {
		return DescriptionKind_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionKind_AlternativesElementType() {
		return DescriptionKind_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionKind_FinalEnumLiteralDeclaration_0ElementType() {
		return DescriptionKind_FinalEnumLiteralDeclaration_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionKind_FinalFinalKeyword_0_0ElementType() {
		return DescriptionKind_FinalFinalKeyword_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionKind_PartialEnumLiteralDeclaration_1ElementType() {
		return DescriptionKind_PartialEnumLiteralDeclaration_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionKind_PartialPartialKeyword_1_0ElementType() {
		return DescriptionKind_PartialPartialKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertionElementType() {
		return TerminologyInstanceAssertion_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_AlternativesElementType() {
		return TerminologyInstanceAssertion_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_ScalarDataPropertyValueParserRuleCall_0ElementType() {
		return TerminologyInstanceAssertion_ScalarDataPropertyValueParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_StructuredDataPropertyValueParserRuleCall_1ElementType() {
		return TerminologyInstanceAssertion_StructuredDataPropertyValueParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_DataStructureTupleParserRuleCall_2ElementType() {
		return TerminologyInstanceAssertion_DataStructureTupleParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_ConceptInstanceParserRuleCall_3ElementType() {
		return TerminologyInstanceAssertion_ConceptInstanceParserRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_ReifiedRelationshipInstanceParserRuleCall_4ElementType() {
		return TerminologyInstanceAssertion_ReifiedRelationshipInstanceParserRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_ReifiedRelationshipInstanceDomainParserRuleCall_5ElementType() {
		return TerminologyInstanceAssertion_ReifiedRelationshipInstanceDomainParserRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_ReifiedRelationshipInstanceRangeParserRuleCall_6ElementType() {
		return TerminologyInstanceAssertion_ReifiedRelationshipInstanceRangeParserRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTerminologyInstanceAssertion_UnreifiedRelationshipInstanceTupleParserRuleCall_7ElementType() {
		return TerminologyInstanceAssertion_UnreifiedRelationshipInstanceTupleParserRuleCall_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxExtendsClosedWorldDefinitionsElementType() {
		return DescriptionBoxExtendsClosedWorldDefinitions_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxExtendsClosedWorldDefinitions_GroupElementType() {
		return DescriptionBoxExtendsClosedWorldDefinitions_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxExtendsClosedWorldDefinitions_EXTENDS_TOKENTerminalRuleCall_0ElementType() {
		return DescriptionBoxExtendsClosedWorldDefinitions_EXTENDS_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsAssignment_1ElementType() {
		return DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxCrossReference_1_0ElementType() {
		return DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxCrossReference_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1ElementType() {
		return DescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxRefinementElementType() {
		return DescriptionBoxRefinement_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxRefinement_GroupElementType() {
		return DescriptionBoxRefinement_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxRefinement_REFINES_TOKENTerminalRuleCall_0ElementType() {
		return DescriptionBoxRefinement_REFINES_TOKENTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxRefinement_RefinedDescriptionBoxAssignment_1ElementType() {
		return DescriptionBoxRefinement_RefinedDescriptionBoxAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxCrossReference_1_0ElementType() {
		return DescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxCrossReference_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1ElementType() {
		return DescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValueElementType() {
		return ScalarDataPropertyValue_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_GroupElementType() {
		return ScalarDataPropertyValue_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_ScalarDataPropertyValueKeyword_0ElementType() {
		return ScalarDataPropertyValue_ScalarDataPropertyValueKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_LCURLYTerminalRuleCall_1ElementType() {
		return ScalarDataPropertyValue_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_ScalarPropertyValueKeyword_2ElementType() {
		return ScalarDataPropertyValue_ScalarPropertyValueKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_ScalarPropertyValueAssignment_3ElementType() {
		return ScalarDataPropertyValue_ScalarPropertyValueAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_ScalarPropertyValueReferenceParserRuleCall_3_0ElementType() {
		return ScalarDataPropertyValue_ScalarPropertyValueReferenceParserRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_ScalarDataPropertyKeyword_4ElementType() {
		return ScalarDataPropertyValue_ScalarDataPropertyKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_ScalarDataPropertyAssignment_5ElementType() {
		return ScalarDataPropertyValue_ScalarDataPropertyAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarCrossReference_5_0ElementType() {
		return ScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1ElementType() {
		return ScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getScalarDataPropertyValue_RCURLYTerminalRuleCall_6ElementType() {
		return ScalarDataPropertyValue_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValueElementType() {
		return StructuredDataPropertyValue_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_GroupElementType() {
		return StructuredDataPropertyValue_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_StructuredDataPropertyValueKeyword_0ElementType() {
		return StructuredDataPropertyValue_StructuredDataPropertyValueKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_LCURLYTerminalRuleCall_1ElementType() {
		return StructuredDataPropertyValue_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_StructuredDataPropertyKeyword_2ElementType() {
		return StructuredDataPropertyValue_StructuredDataPropertyKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_StructuredDataPropertyAssignment_3ElementType() {
		return StructuredDataPropertyValue_StructuredDataPropertyAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureCrossReference_3_0ElementType() {
		return StructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1ElementType() {
		return StructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_StructuredPropertyTupleKeyword_4ElementType() {
		return StructuredDataPropertyValue_StructuredPropertyTupleKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_StructuredPropertyTupleAssignment_5ElementType() {
		return StructuredDataPropertyValue_StructuredPropertyTupleAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_StructuredPropertyTupleDataStructureTupleParserRuleCall_5_0ElementType() {
		return StructuredDataPropertyValue_StructuredPropertyTupleDataStructureTupleParserRuleCall_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getStructuredDataPropertyValue_RCURLYTerminalRuleCall_6ElementType() {
		return StructuredDataPropertyValue_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTupleElementType() {
		return DataStructureTuple_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTuple_GroupElementType() {
		return DataStructureTuple_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTuple_DataStructureTupleKeyword_0ElementType() {
		return DataStructureTuple_DataStructureTupleKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTuple_LCURLYTerminalRuleCall_1ElementType() {
		return DataStructureTuple_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTuple_DataStructureTypeKeyword_2ElementType() {
		return DataStructureTuple_DataStructureTypeKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTuple_DataStructureTypeAssignment_3ElementType() {
		return DataStructureTuple_DataStructureTypeAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTuple_DataStructureTypeStructureCrossReference_3_0ElementType() {
		return DataStructureTuple_DataStructureTypeStructureCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTuple_DataStructureTypeStructureReferenceParserRuleCall_3_0_1ElementType() {
		return DataStructureTuple_DataStructureTypeStructureReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDataStructureTuple_RCURLYTerminalRuleCall_4ElementType() {
		return DataStructureTuple_RCURLYTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstanceElementType() {
		return ConceptInstance_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstance_GroupElementType() {
		return ConceptInstance_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstance_ConceptInstanceKeyword_0ElementType() {
		return ConceptInstance_ConceptInstanceKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstance_LCURLYTerminalRuleCall_1ElementType() {
		return ConceptInstance_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstance_SingletonConceptClassifierKeyword_2ElementType() {
		return ConceptInstance_SingletonConceptClassifierKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstance_SingletonConceptClassifierAssignment_3ElementType() {
		return ConceptInstance_SingletonConceptClassifierAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstance_SingletonConceptClassifierConceptCrossReference_3_0ElementType() {
		return ConceptInstance_SingletonConceptClassifierConceptCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstance_SingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1ElementType() {
		return ConceptInstance_SingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConceptInstance_RCURLYTerminalRuleCall_4ElementType() {
		return ConceptInstance_RCURLYTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceElementType() {
		return ReifiedRelationshipInstance_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstance_GroupElementType() {
		return ReifiedRelationshipInstance_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstance_ReifiedRelationshipInstanceKeyword_0ElementType() {
		return ReifiedRelationshipInstance_ReifiedRelationshipInstanceKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstance_LCURLYTerminalRuleCall_1ElementType() {
		return ReifiedRelationshipInstance_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierKeyword_2ElementType() {
		return ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierAssignment_3ElementType() {
		return ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0ElementType() {
		return ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
		return ReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstance_RCURLYTerminalRuleCall_4ElementType() {
		return ReifiedRelationshipInstance_RCURLYTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomainElementType() {
		return ReifiedRelationshipInstanceDomain_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_GroupElementType() {
		return ReifiedRelationshipInstanceDomain_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceDomainKeyword_0ElementType() {
		return ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceDomainKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_LCURLYTerminalRuleCall_1ElementType() {
		return ReifiedRelationshipInstanceDomain_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceKeyword_2ElementType() {
		return ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceAssignment_3ElementType() {
		return ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0ElementType() {
		return ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1ElementType() {
		return ReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_DOMAIN_TOKENTerminalRuleCall_4ElementType() {
		return ReifiedRelationshipInstanceDomain_DOMAIN_TOKENTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_DomainAssignment_5ElementType() {
		return ReifiedRelationshipInstanceDomain_DomainAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceCrossReference_5_0ElementType() {
		return ReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType() {
		return ReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceDomain_RCURLYTerminalRuleCall_6ElementType() {
		return ReifiedRelationshipInstanceDomain_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRangeElementType() {
		return ReifiedRelationshipInstanceRange_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_GroupElementType() {
		return ReifiedRelationshipInstanceRange_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceRangeKeyword_0ElementType() {
		return ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceRangeKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_LCURLYTerminalRuleCall_1ElementType() {
		return ReifiedRelationshipInstanceRange_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceKeyword_2ElementType() {
		return ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceAssignment_3ElementType() {
		return ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0ElementType() {
		return ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1ElementType() {
		return ReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_RANGE_TOKENTerminalRuleCall_4ElementType() {
		return ReifiedRelationshipInstanceRange_RANGE_TOKENTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_RangeAssignment_5ElementType() {
		return ReifiedRelationshipInstanceRange_RangeAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceCrossReference_5_0ElementType() {
		return ReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType() {
		return ReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReifiedRelationshipInstanceRange_RCURLYTerminalRuleCall_6ElementType() {
		return ReifiedRelationshipInstanceRange_RCURLYTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTupleElementType() {
		return UnreifiedRelationshipInstanceTuple_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_GroupElementType() {
		return UnreifiedRelationshipInstanceTuple_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipInstanceTupleKeyword_0ElementType() {
		return UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipInstanceTupleKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_LCURLYTerminalRuleCall_1ElementType() {
		return UnreifiedRelationshipInstanceTuple_LCURLYTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2ElementType() {
		return UnreifiedRelationshipInstanceTuple_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipAssignment_3ElementType() {
		return UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0ElementType() {
		return UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1ElementType() {
		return UnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_DOMAIN_TOKENTerminalRuleCall_4ElementType() {
		return UnreifiedRelationshipInstanceTuple_DOMAIN_TOKENTerminalRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_DomainAssignment_5ElementType() {
		return UnreifiedRelationshipInstanceTuple_DomainAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceCrossReference_5_0ElementType() {
		return UnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceCrossReference_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1ElementType() {
		return UnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_RANGE_TOKENTerminalRuleCall_6ElementType() {
		return UnreifiedRelationshipInstanceTuple_RANGE_TOKENTerminalRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_RangeAssignment_7ElementType() {
		return UnreifiedRelationshipInstanceTuple_RangeAssignment_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceCrossReference_7_0ElementType() {
		return UnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceCrossReference_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1ElementType() {
		return UnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnreifiedRelationshipInstanceTuple_RCURLYTerminalRuleCall_8ElementType() {
		return UnreifiedRelationshipInstanceTuple_RCURLYTerminalRuleCall_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReferenceElementType() {
		return Reference_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReference_AlternativesElementType() {
		return Reference_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReference_IRITerminalRuleCall_0ElementType() {
		return Reference_IRITerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getReference_QNAMEParserRuleCall_1ElementType() {
		return Reference_QNAMEParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQNAMEElementType() {
		return QNAME_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQNAME_AlternativesElementType() {
		return QNAME_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQNAME_ABBREV_IRIParserRuleCall_0ElementType() {
		return QNAME_ABBREV_IRIParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQNAME_ValidIDParserRuleCall_1ElementType() {
		return QNAME_ValidIDParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getABBREV_IRIElementType() {
		return ABBREV_IRI_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getABBREV_IRI_GroupElementType() {
		return ABBREV_IRI_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getABBREV_IRI_ValidIDParserRuleCall_0ElementType() {
		return ABBREV_IRI_ValidIDParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getABBREV_IRI_ColonKeyword_1ElementType() {
		return ABBREV_IRI_ColonKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getABBREV_IRI_ValidIDParserRuleCall_2ElementType() {
		return ABBREV_IRI_ValidIDParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValidIDElementType() {
		return ValidID_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValidID_IDTerminalRuleCallElementType() {
		return ValidID_IDTerminalRuleCall_ELEMENT_TYPE;
	}

}
