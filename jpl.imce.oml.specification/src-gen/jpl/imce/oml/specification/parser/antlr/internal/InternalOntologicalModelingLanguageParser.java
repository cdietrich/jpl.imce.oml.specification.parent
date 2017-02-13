package jpl.imce.oml.specification.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologicalModelingLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_PROPERTY_TOKEN", "RULE_EQUAL", "RULE_IRI", "RULE_ANNOTATION_TOKEN", "RULE_STRING", "RULE_TERMINOLOGY_GRAPH_TOKEN", "RULE_LCURLY", "RULE_RCURLY", "RULE_BUNDLE_TOKEN", "RULE_ASPECT_TOKEN", "RULE_ID", "RULE_ABSTRACT_TOKEN", "RULE_CONCEPT_TOKEN", "RULE_REIFIED_RELATIONSHIP_TOKEN", "RULE_FUNCTIONAL_TOKEN", "RULE_INVERSE_FUNCTIONAL_TOKEN", "RULE_ESSENTIAL_TOKEN", "RULE_INVERSE_ESSENTIAL_TOKEN", "RULE_SYMMETRIC_TOKEN", "RULE_ASYMMETRIC_TOKEN", "RULE_REFLEXIVE_TOKEN", "RULE_IRREFLEXIVE_TOKEN", "RULE_TRANSITIVE_TOKEN", "RULE_UNREIFIED_TOKEN", "RULE_INVERSE_TOKEN", "RULE_SOURCE_TOKEN", "RULE_TARGET_TOKEN", "RULE_UNREIFIED_RELATIONSHIP_TOKEN", "RULE_SCALAR_TOKEN", "RULE_STRUCTURE_TOKEN", "RULE_DOMAIN_TOKEN", "RULE_RANGE_TOKEN", "RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN", "RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN", "RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN", "RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN", "RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN", "RULE_EXTENDS_TOKEN", "RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN", "RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN", "RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN", "RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN", "RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN", "RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN", "RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN", "RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN", "RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN", "RULE_BINARY_SCALAR_RESTRICTION_TOKEN", "RULE_INT", "RULE_IRI_SCALAR_RESTRICTION_TOKEN", "RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN", "RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN", "RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN", "RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN", "RULE_STRING_SCALAR_RESTRICTION_TOKEN", "RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN", "RULE_TIME_SCALAR_RESTRICTION_TOKEN", "RULE_DESCRIPTION_BOX_TOKEN", "RULE_REFINES_TOKEN", "RULE_KIND_TOKEN", "RULE_HEX_8DIGITS", "RULE_HEX_4DIGITS", "RULE_HEX_12DIGITS", "RULE_UUID", "RULE_HEX_DIGIT", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entityStructuredDataProperty'", "'entityScalarDataProperty'", "'structuredDataProperty'", "'scalarDataProperty'", "'disjointTaxonomyParent'", "'root'", "'disjointLeaf'", "'bundledTerminology'", "'designatedTerminology'", "'designatedConcept'", "'nestingTerminology'", "'nestingContext'", "'restrictedRelation'", "'restrictedRange'", "'restrictedDomain'", "'subConcept'", "'superConcept'", "'subRelationship'", "'superRelationship'", "'restrictedEntity'", "'scalarProperty'", "'scalarRestriction'", "'literalValue'", "'length'", "'minLength'", "'maxLength'", "'pattern'", "'minInclusive'", "'maxInclusive'", "'minExclusive'", "'maxExclusive'", "'langRange'", "'value'", "'axiom'", "'ScalarDataPropertyValue'", "'scalarPropertyValue'", "'StructuredDataPropertyValue'", "'structuredPropertyTuple'", "'DataStructureTuple'", "'dataStructureType'", "'ConceptInstance'", "'singletonConceptClassifier'", "'ReifiedRelationshipInstance'", "'singletonReifiedRelationshipClassifier'", "'ReifiedRelationshipInstanceDomain'", "'reifiedRelationshipInstance'", "'ReifiedRelationshipInstanceRange'", "'UnreifiedRelationshipInstanceTuple'", "':'", "'open'", "'closed'", "'final'", "'partial'"
    };
    public static final int RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN=40;
    public static final int RULE_HEX=69;
    public static final int RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN=56;
    public static final int RULE_LCURLY=10;
    public static final int RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN=54;
    public static final int RULE_REFLEXIVE_TOKEN=24;
    public static final int RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN=43;
    public static final int RULE_EQUAL=5;
    public static final int RULE_ID=14;
    public static final int RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN=39;
    public static final int RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN=59;
    public static final int RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN=50;
    public static final int RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN=46;
    public static final int RULE_TRANSITIVE_TOKEN=26;
    public static final int RULE_FUNCTIONAL_TOKEN=18;
    public static final int RULE_ABSTRACT_TOKEN=15;
    public static final int RULE_UUID=67;
    public static final int RULE_INT=52;
    public static final int RULE_ML_COMMENT=71;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int RULE_REIFIED_RELATIONSHIP_TOKEN=17;
    public static final int RULE_INVERSE_TOKEN=28;
    public static final int T__127=127;
    public static final int RULE_CONCEPT_TOKEN=16;
    public static final int RULE_IRI=6;
    public static final int RULE_BUNDLE_TOKEN=12;
    public static final int RULE_TARGET_TOKEN=30;
    public static final int RULE_TERMINOLOGY_GRAPH_TOKEN=9;
    public static final int RULE_INVERSE_FUNCTIONAL_TOKEN=19;
    public static final int RULE_HEX_DIGIT=68;
    public static final int RULE_HEX_8DIGITS=64;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN=42;
    public static final int RULE_HEX_12DIGITS=66;
    public static final int RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN=49;
    public static final int RULE_STRUCTURE_TOKEN=33;
    public static final int T__99=99;
    public static final int RULE_BINARY_SCALAR_RESTRICTION_TOKEN=51;
    public static final int RULE_REFINES_TOKEN=62;
    public static final int RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN=47;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN=57;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_ANNOTATION_TOKEN=7;
    public static final int RULE_SOURCE_TOKEN=29;
    public static final int RULE_UNREIFIED_RELATIONSHIP_TOKEN=31;
    public static final int RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN=37;
    public static final int RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN=45;
    public static final int RULE_TIME_SCALAR_RESTRICTION_TOKEN=60;
    public static final int RULE_KIND_TOKEN=63;
    public static final int RULE_DECIMAL=70;
    public static final int RULE_SCALAR_TOKEN=32;
    public static final int RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN=55;
    public static final int RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN=48;
    public static final int RULE_IRI_SCALAR_RESTRICTION_TOKEN=53;
    public static final int RULE_RANGE_TOKEN=35;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int RULE_UNREIFIED_TOKEN=27;
    public static final int T__120=120;
    public static final int RULE_STRING=8;
    public static final int RULE_STRING_SCALAR_RESTRICTION_TOKEN=58;
    public static final int RULE_SL_COMMENT=72;
    public static final int RULE_INVERSE_ESSENTIAL_TOKEN=21;
    public static final int RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN=44;
    public static final int RULE_ANNOTATION_PROPERTY_TOKEN=4;
    public static final int RULE_SYMMETRIC_TOKEN=22;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int RULE_DOMAIN_TOKEN=34;
    public static final int RULE_EXTENDS_TOKEN=41;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__115=115;
    public static final int RULE_HEX_4DIGITS=65;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN=38;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_IRREFLEXIVE_TOKEN=25;
    public static final int RULE_RCURLY=11;
    public static final int RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN=36;
    public static final int RULE_WS=73;
    public static final int RULE_ANY_OTHER=74;
    public static final int RULE_ASPECT_TOKEN=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int RULE_ESSENTIAL_TOKEN=20;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int RULE_DESCRIPTION_BOX_TOKEN=61;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;
    public static final int RULE_ASYMMETRIC_TOKEN=23;

    // delegates
    // delegators


        public InternalOntologicalModelingLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOntologicalModelingLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOntologicalModelingLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOntologicalModelingLanguage.g"; }



     	private OntologicalModelingLanguageGrammarAccess grammarAccess;

        public InternalOntologicalModelingLanguageParser(TokenStream input, OntologicalModelingLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TerminologyExtent";
       	}

       	@Override
       	protected OntologicalModelingLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTerminologyExtent"
    // InternalOntologicalModelingLanguage.g:78:1: entryRuleTerminologyExtent returns [EObject current=null] : iv_ruleTerminologyExtent= ruleTerminologyExtent EOF ;
    public final EObject entryRuleTerminologyExtent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyExtent = null;


        try {
            // InternalOntologicalModelingLanguage.g:78:58: (iv_ruleTerminologyExtent= ruleTerminologyExtent EOF )
            // InternalOntologicalModelingLanguage.g:79:2: iv_ruleTerminologyExtent= ruleTerminologyExtent EOF
            {
             newCompositeNode(grammarAccess.getTerminologyExtentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyExtent=ruleTerminologyExtent();

            state._fsp--;

             current =iv_ruleTerminologyExtent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyExtent"


    // $ANTLR start "ruleTerminologyExtent"
    // InternalOntologicalModelingLanguage.g:85:1: ruleTerminologyExtent returns [EObject current=null] : ( () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )* ) ;
    public final EObject ruleTerminologyExtent() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationProperties_1_0 = null;

        EObject lv_terminologyGraphs_2_0 = null;

        EObject lv_bundles_3_0 = null;

        EObject lv_descriptions_4_0 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:91:2: ( ( () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )* ) )
            // InternalOntologicalModelingLanguage.g:92:2: ( () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )* )
            {
            // InternalOntologicalModelingLanguage.g:92:2: ( () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )* )
            // InternalOntologicalModelingLanguage.g:93:3: () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )*
            {
            // InternalOntologicalModelingLanguage.g:93:3: ()
            // InternalOntologicalModelingLanguage.g:94:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTerminologyExtentAccess().getTerminologyExtentAction_0(),
            					current);
            			

            }

            // InternalOntologicalModelingLanguage.g:100:3: ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case RULE_ANNOTATION_PROPERTY_TOKEN:
                    {
                    alt1=1;
                    }
                    break;
                case 124:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==RULE_TERMINOLOGY_GRAPH_TOKEN) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==RULE_BUNDLE_TOKEN) ) {
                        alt1=3;
                    }


                    }
                    break;
                case 125:
                    {
                    int LA1_4 = input.LA(2);

                    if ( (LA1_4==RULE_TERMINOLOGY_GRAPH_TOKEN) ) {
                        alt1=2;
                    }
                    else if ( (LA1_4==RULE_BUNDLE_TOKEN) ) {
                        alt1=3;
                    }


                    }
                    break;
                case 126:
                case 127:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:101:4: ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:101:4: ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )
            	    // InternalOntologicalModelingLanguage.g:102:5: (lv_annotationProperties_1_0= ruleAnnotationProperty )
            	    {
            	    // InternalOntologicalModelingLanguage.g:102:5: (lv_annotationProperties_1_0= ruleAnnotationProperty )
            	    // InternalOntologicalModelingLanguage.g:103:6: lv_annotationProperties_1_0= ruleAnnotationProperty
            	    {

            	    						newCompositeNode(grammarAccess.getTerminologyExtentAccess().getAnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_annotationProperties_1_0=ruleAnnotationProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTerminologyExtentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"annotationProperties",
            	    							lv_annotationProperties_1_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.AnnotationProperty");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntologicalModelingLanguage.g:121:4: ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:121:4: ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )
            	    // InternalOntologicalModelingLanguage.g:122:5: (lv_terminologyGraphs_2_0= ruleTerminologyGraph )
            	    {
            	    // InternalOntologicalModelingLanguage.g:122:5: (lv_terminologyGraphs_2_0= ruleTerminologyGraph )
            	    // InternalOntologicalModelingLanguage.g:123:6: lv_terminologyGraphs_2_0= ruleTerminologyGraph
            	    {

            	    						newCompositeNode(grammarAccess.getTerminologyExtentAccess().getTerminologyGraphsTerminologyGraphParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_terminologyGraphs_2_0=ruleTerminologyGraph();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTerminologyExtentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terminologyGraphs",
            	    							lv_terminologyGraphs_2_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyGraph");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOntologicalModelingLanguage.g:141:4: ( (lv_bundles_3_0= ruleBundle ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:141:4: ( (lv_bundles_3_0= ruleBundle ) )
            	    // InternalOntologicalModelingLanguage.g:142:5: (lv_bundles_3_0= ruleBundle )
            	    {
            	    // InternalOntologicalModelingLanguage.g:142:5: (lv_bundles_3_0= ruleBundle )
            	    // InternalOntologicalModelingLanguage.g:143:6: lv_bundles_3_0= ruleBundle
            	    {

            	    						newCompositeNode(grammarAccess.getTerminologyExtentAccess().getBundlesBundleParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_bundles_3_0=ruleBundle();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTerminologyExtentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bundles",
            	    							lv_bundles_3_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.Bundle");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOntologicalModelingLanguage.g:161:4: ( (lv_descriptions_4_0= ruleDescriptionBox ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:161:4: ( (lv_descriptions_4_0= ruleDescriptionBox ) )
            	    // InternalOntologicalModelingLanguage.g:162:5: (lv_descriptions_4_0= ruleDescriptionBox )
            	    {
            	    // InternalOntologicalModelingLanguage.g:162:5: (lv_descriptions_4_0= ruleDescriptionBox )
            	    // InternalOntologicalModelingLanguage.g:163:6: lv_descriptions_4_0= ruleDescriptionBox
            	    {

            	    						newCompositeNode(grammarAccess.getTerminologyExtentAccess().getDescriptionsDescriptionBoxParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_descriptions_4_0=ruleDescriptionBox();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTerminologyExtentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"descriptions",
            	    							lv_descriptions_4_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.DescriptionBox");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyExtent"


    // $ANTLR start "entryRuleAnnotationProperty"
    // InternalOntologicalModelingLanguage.g:185:1: entryRuleAnnotationProperty returns [EObject current=null] : iv_ruleAnnotationProperty= ruleAnnotationProperty EOF ;
    public final EObject entryRuleAnnotationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationProperty = null;


        try {
            // InternalOntologicalModelingLanguage.g:185:59: (iv_ruleAnnotationProperty= ruleAnnotationProperty EOF )
            // InternalOntologicalModelingLanguage.g:186:2: iv_ruleAnnotationProperty= ruleAnnotationProperty EOF
            {
             newCompositeNode(grammarAccess.getAnnotationPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationProperty=ruleAnnotationProperty();

            state._fsp--;

             current =iv_ruleAnnotationProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationProperty"


    // $ANTLR start "ruleAnnotationProperty"
    // InternalOntologicalModelingLanguage.g:192:1: ruleAnnotationProperty returns [EObject current=null] : (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) ) ;
    public final EObject ruleAnnotationProperty() throws RecognitionException {
        EObject current = null;

        Token this_ANNOTATION_PROPERTY_TOKEN_0=null;
        Token this_EQUAL_2=null;
        Token lv_iri_3_0=null;
        AntlrDatatypeRuleToken lv_abbrevIRI_1_0 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:198:2: ( (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) ) )
            // InternalOntologicalModelingLanguage.g:199:2: (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) )
            {
            // InternalOntologicalModelingLanguage.g:199:2: (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) )
            // InternalOntologicalModelingLanguage.g:200:3: this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) )
            {
            this_ANNOTATION_PROPERTY_TOKEN_0=(Token)match(input,RULE_ANNOTATION_PROPERTY_TOKEN,FOLLOW_4); 

            			newLeafNode(this_ANNOTATION_PROPERTY_TOKEN_0, grammarAccess.getAnnotationPropertyAccess().getANNOTATION_PROPERTY_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:204:3: ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) )
            // InternalOntologicalModelingLanguage.g:205:4: (lv_abbrevIRI_1_0= ruleABBREV_IRI )
            {
            // InternalOntologicalModelingLanguage.g:205:4: (lv_abbrevIRI_1_0= ruleABBREV_IRI )
            // InternalOntologicalModelingLanguage.g:206:5: lv_abbrevIRI_1_0= ruleABBREV_IRI
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyAccess().getAbbrevIRIABBREV_IRIParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_abbrevIRI_1_0=ruleABBREV_IRI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationPropertyRule());
            					}
            					set(
            						current,
            						"abbrevIRI",
            						lv_abbrevIRI_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ABBREV_IRI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_6); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getAnnotationPropertyAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:227:3: ( (lv_iri_3_0= RULE_IRI ) )
            // InternalOntologicalModelingLanguage.g:228:4: (lv_iri_3_0= RULE_IRI )
            {
            // InternalOntologicalModelingLanguage.g:228:4: (lv_iri_3_0= RULE_IRI )
            // InternalOntologicalModelingLanguage.g:229:5: lv_iri_3_0= RULE_IRI
            {
            lv_iri_3_0=(Token)match(input,RULE_IRI,FOLLOW_2); 

            					newLeafNode(lv_iri_3_0, grammarAccess.getAnnotationPropertyAccess().getIriIRITerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iri",
            						lv_iri_3_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationProperty"


    // $ANTLR start "entryRuleAnnotation"
    // InternalOntologicalModelingLanguage.g:249:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOntologicalModelingLanguage.g:249:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOntologicalModelingLanguage.g:250:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalOntologicalModelingLanguage.g:256:1: ruleAnnotation returns [EObject current=null] : (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token this_ANNOTATION_TOKEN_0=null;
        Token this_EQUAL_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:262:2: ( (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalOntologicalModelingLanguage.g:263:2: (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalOntologicalModelingLanguage.g:263:2: (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalOntologicalModelingLanguage.g:264:3: this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) )
            {
            this_ANNOTATION_TOKEN_0=(Token)match(input,RULE_ANNOTATION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_ANNOTATION_TOKEN_0, grammarAccess.getAnnotationAccess().getANNOTATION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:268:3: ( ( ruleABBREV_IRI ) )
            // InternalOntologicalModelingLanguage.g:269:4: ( ruleABBREV_IRI )
            {
            // InternalOntologicalModelingLanguage.g:269:4: ( ruleABBREV_IRI )
            // InternalOntologicalModelingLanguage.g:270:5: ruleABBREV_IRI
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAnnotationAccess().getPropertyAnnotationPropertyCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleABBREV_IRI();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_7); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getAnnotationAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:288:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalOntologicalModelingLanguage.g:289:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalOntologicalModelingLanguage.g:289:4: (lv_value_3_0= RULE_STRING )
            // InternalOntologicalModelingLanguage.g:290:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleTerminologyGraph"
    // InternalOntologicalModelingLanguage.g:310:1: entryRuleTerminologyGraph returns [EObject current=null] : iv_ruleTerminologyGraph= ruleTerminologyGraph EOF ;
    public final EObject entryRuleTerminologyGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyGraph = null;


        try {
            // InternalOntologicalModelingLanguage.g:310:57: (iv_ruleTerminologyGraph= ruleTerminologyGraph EOF )
            // InternalOntologicalModelingLanguage.g:311:2: iv_ruleTerminologyGraph= ruleTerminologyGraph EOF
            {
             newCompositeNode(grammarAccess.getTerminologyGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyGraph=ruleTerminologyGraph();

            state._fsp--;

             current =iv_ruleTerminologyGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyGraph"


    // $ANTLR start "ruleTerminologyGraph"
    // InternalOntologicalModelingLanguage.g:317:1: ruleTerminologyGraph returns [EObject current=null] : ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY ) ;
    public final EObject ruleTerminologyGraph() throws RecognitionException {
        EObject current = null;

        Token this_TERMINOLOGY_GRAPH_TOKEN_1=null;
        Token lv_iri_2_0=null;
        Token this_LCURLY_3=null;
        Token this_RCURLY_7=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_terminologyBoxAxioms_5_0 = null;

        EObject lv_boxStatements_6_0 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:323:2: ( ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:324:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:324:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:325:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY
            {
            // InternalOntologicalModelingLanguage.g:325:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) )
            // InternalOntologicalModelingLanguage.g:326:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            {
            // InternalOntologicalModelingLanguage.g:326:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            // InternalOntologicalModelingLanguage.g:327:5: lv_kind_0_0= ruleTerminologyGraphKind
            {

            					newCompositeNode(grammarAccess.getTerminologyGraphAccess().getKindTerminologyGraphKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_kind_0_0=ruleTerminologyGraphKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyGraphKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TERMINOLOGY_GRAPH_TOKEN_1=(Token)match(input,RULE_TERMINOLOGY_GRAPH_TOKEN,FOLLOW_6); 

            			newLeafNode(this_TERMINOLOGY_GRAPH_TOKEN_1, grammarAccess.getTerminologyGraphAccess().getTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1());
            		
            // InternalOntologicalModelingLanguage.g:348:3: ( (lv_iri_2_0= RULE_IRI ) )
            // InternalOntologicalModelingLanguage.g:349:4: (lv_iri_2_0= RULE_IRI )
            {
            // InternalOntologicalModelingLanguage.g:349:4: (lv_iri_2_0= RULE_IRI )
            // InternalOntologicalModelingLanguage.g:350:5: lv_iri_2_0= RULE_IRI
            {
            lv_iri_2_0=(Token)match(input,RULE_IRI,FOLLOW_9); 

            					newLeafNode(lv_iri_2_0, grammarAccess.getTerminologyGraphAccess().getIriIRITerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminologyGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iri",
            						lv_iri_2_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
            				

            }


            }

            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_10); 

            			newLeafNode(this_LCURLY_3, grammarAccess.getTerminologyGraphAccess().getLCURLYTerminalRuleCall_3());
            		
            // InternalOntologicalModelingLanguage.g:370:3: ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case RULE_ANNOTATION_TOKEN:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN:
                case RULE_EXTENDS_TOKEN:
                case RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_IRI:
                case RULE_ASPECT_TOKEN:
                case RULE_ID:
                case RULE_ABSTRACT_TOKEN:
                case RULE_CONCEPT_TOKEN:
                case RULE_REIFIED_RELATIONSHIP_TOKEN:
                case RULE_UNREIFIED_RELATIONSHIP_TOKEN:
                case RULE_SCALAR_TOKEN:
                case RULE_STRUCTURE_TOKEN:
                case RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
                case RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                case RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN:
                case RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN:
                case RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
                case RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN:
                case RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                case RULE_BINARY_SCALAR_RESTRICTION_TOKEN:
                case RULE_IRI_SCALAR_RESTRICTION_TOKEN:
                case RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN:
                case RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN:
                case RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN:
                case RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN:
                case RULE_STRING_SCALAR_RESTRICTION_TOKEN:
                case RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN:
                case RULE_TIME_SCALAR_RESTRICTION_TOKEN:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:371:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:371:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // InternalOntologicalModelingLanguage.g:372:5: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // InternalOntologicalModelingLanguage.g:372:5: (lv_annotations_4_0= ruleAnnotation )
            	    // InternalOntologicalModelingLanguage.g:373:6: lv_annotations_4_0= ruleAnnotation
            	    {

            	    						newCompositeNode(grammarAccess.getTerminologyGraphAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_annotations_4_0=ruleAnnotation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
            	    						}
            	    						add(
            	    							current,
            	    							"annotations",
            	    							lv_annotations_4_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.Annotation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntologicalModelingLanguage.g:391:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:391:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    // InternalOntologicalModelingLanguage.g:392:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    {
            	    // InternalOntologicalModelingLanguage.g:392:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    // InternalOntologicalModelingLanguage.g:393:6: lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom
            	    {

            	    						newCompositeNode(grammarAccess.getTerminologyGraphAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_terminologyBoxAxioms_5_0=ruleTerminologyBoxAxiom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terminologyBoxAxioms",
            	    							lv_terminologyBoxAxioms_5_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxAxiom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOntologicalModelingLanguage.g:411:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:411:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    // InternalOntologicalModelingLanguage.g:412:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    {
            	    // InternalOntologicalModelingLanguage.g:412:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    // InternalOntologicalModelingLanguage.g:413:6: lv_boxStatements_6_0= ruleTerminologyBoxStatement
            	    {

            	    						newCompositeNode(grammarAccess.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_boxStatements_6_0=ruleTerminologyBoxStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
            	    						}
            	    						add(
            	    							current,
            	    							"boxStatements",
            	    							lv_boxStatements_6_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_7, grammarAccess.getTerminologyGraphAccess().getRCURLYTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyGraph"


    // $ANTLR start "entryRuleBundle"
    // InternalOntologicalModelingLanguage.g:439:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // InternalOntologicalModelingLanguage.g:439:47: (iv_ruleBundle= ruleBundle EOF )
            // InternalOntologicalModelingLanguage.g:440:2: iv_ruleBundle= ruleBundle EOF
            {
             newCompositeNode(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBundle=ruleBundle();

            state._fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // InternalOntologicalModelingLanguage.g:446:1: ruleBundle returns [EObject current=null] : ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token this_BUNDLE_TOKEN_1=null;
        Token lv_iri_2_0=null;
        Token this_LCURLY_3=null;
        Token this_RCURLY_9=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_terminologyBoxAxioms_5_0 = null;

        EObject lv_boxStatements_6_0 = null;

        EObject lv_bundleStatements_7_0 = null;

        EObject lv_terminologyBundleAxioms_8_0 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:452:2: ( ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:453:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:453:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:454:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY
            {
            // InternalOntologicalModelingLanguage.g:454:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) )
            // InternalOntologicalModelingLanguage.g:455:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            {
            // InternalOntologicalModelingLanguage.g:455:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            // InternalOntologicalModelingLanguage.g:456:5: lv_kind_0_0= ruleTerminologyGraphKind
            {

            					newCompositeNode(grammarAccess.getBundleAccess().getKindTerminologyGraphKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_kind_0_0=ruleTerminologyGraphKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBundleRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyGraphKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BUNDLE_TOKEN_1=(Token)match(input,RULE_BUNDLE_TOKEN,FOLLOW_6); 

            			newLeafNode(this_BUNDLE_TOKEN_1, grammarAccess.getBundleAccess().getBUNDLE_TOKENTerminalRuleCall_1());
            		
            // InternalOntologicalModelingLanguage.g:477:3: ( (lv_iri_2_0= RULE_IRI ) )
            // InternalOntologicalModelingLanguage.g:478:4: (lv_iri_2_0= RULE_IRI )
            {
            // InternalOntologicalModelingLanguage.g:478:4: (lv_iri_2_0= RULE_IRI )
            // InternalOntologicalModelingLanguage.g:479:5: lv_iri_2_0= RULE_IRI
            {
            lv_iri_2_0=(Token)match(input,RULE_IRI,FOLLOW_9); 

            					newLeafNode(lv_iri_2_0, grammarAccess.getBundleAccess().getIriIRITerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBundleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iri",
            						lv_iri_2_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
            				

            }


            }

            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_12); 

            			newLeafNode(this_LCURLY_3, grammarAccess.getBundleAccess().getLCURLYTerminalRuleCall_3());
            		
            // InternalOntologicalModelingLanguage.g:499:3: ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )*
            loop3:
            do {
                int alt3=6;
                switch ( input.LA(1) ) {
                case RULE_ANNOTATION_TOKEN:
                    {
                    alt3=1;
                    }
                    break;
                case RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN:
                case RULE_EXTENDS_TOKEN:
                case RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_IRI:
                case RULE_ASPECT_TOKEN:
                case RULE_ID:
                case RULE_ABSTRACT_TOKEN:
                case RULE_CONCEPT_TOKEN:
                case RULE_REIFIED_RELATIONSHIP_TOKEN:
                case RULE_UNREIFIED_RELATIONSHIP_TOKEN:
                case RULE_SCALAR_TOKEN:
                case RULE_STRUCTURE_TOKEN:
                case RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
                case RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                case RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN:
                case RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN:
                case RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
                case RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN:
                case RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                case RULE_BINARY_SCALAR_RESTRICTION_TOKEN:
                case RULE_IRI_SCALAR_RESTRICTION_TOKEN:
                case RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN:
                case RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN:
                case RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN:
                case RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN:
                case RULE_STRING_SCALAR_RESTRICTION_TOKEN:
                case RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN:
                case RULE_TIME_SCALAR_RESTRICTION_TOKEN:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN:
                case RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN:
                case RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN:
                    {
                    alt3=4;
                    }
                    break;
                case RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN:
                    {
                    alt3=5;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:500:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:500:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // InternalOntologicalModelingLanguage.g:501:5: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // InternalOntologicalModelingLanguage.g:501:5: (lv_annotations_4_0= ruleAnnotation )
            	    // InternalOntologicalModelingLanguage.g:502:6: lv_annotations_4_0= ruleAnnotation
            	    {

            	    						newCompositeNode(grammarAccess.getBundleAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_annotations_4_0=ruleAnnotation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBundleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"annotations",
            	    							lv_annotations_4_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.Annotation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntologicalModelingLanguage.g:520:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:520:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    // InternalOntologicalModelingLanguage.g:521:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    {
            	    // InternalOntologicalModelingLanguage.g:521:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    // InternalOntologicalModelingLanguage.g:522:6: lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom
            	    {

            	    						newCompositeNode(grammarAccess.getBundleAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_terminologyBoxAxioms_5_0=ruleTerminologyBoxAxiom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBundleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terminologyBoxAxioms",
            	    							lv_terminologyBoxAxioms_5_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxAxiom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOntologicalModelingLanguage.g:540:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:540:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    // InternalOntologicalModelingLanguage.g:541:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    {
            	    // InternalOntologicalModelingLanguage.g:541:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    // InternalOntologicalModelingLanguage.g:542:6: lv_boxStatements_6_0= ruleTerminologyBoxStatement
            	    {

            	    						newCompositeNode(grammarAccess.getBundleAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_boxStatements_6_0=ruleTerminologyBoxStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBundleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"boxStatements",
            	    							lv_boxStatements_6_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOntologicalModelingLanguage.g:560:4: ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:560:4: ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) )
            	    // InternalOntologicalModelingLanguage.g:561:5: (lv_bundleStatements_7_0= ruleTerminologyBundleStatement )
            	    {
            	    // InternalOntologicalModelingLanguage.g:561:5: (lv_bundleStatements_7_0= ruleTerminologyBundleStatement )
            	    // InternalOntologicalModelingLanguage.g:562:6: lv_bundleStatements_7_0= ruleTerminologyBundleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getBundleAccess().getBundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_bundleStatements_7_0=ruleTerminologyBundleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBundleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bundleStatements",
            	    							lv_bundleStatements_7_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBundleStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOntologicalModelingLanguage.g:580:4: ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:580:4: ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) )
            	    // InternalOntologicalModelingLanguage.g:581:5: (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom )
            	    {
            	    // InternalOntologicalModelingLanguage.g:581:5: (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom )
            	    // InternalOntologicalModelingLanguage.g:582:6: lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom
            	    {

            	    						newCompositeNode(grammarAccess.getBundleAccess().getTerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_terminologyBundleAxioms_8_0=ruleTerminologyBundleAxiom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBundleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terminologyBundleAxioms",
            	    							lv_terminologyBundleAxioms_8_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBundleAxiom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_RCURLY_9=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_9, grammarAccess.getBundleAccess().getRCURLYTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleTerminologyBoxAxiom"
    // InternalOntologicalModelingLanguage.g:608:1: entryRuleTerminologyBoxAxiom returns [EObject current=null] : iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF ;
    public final EObject entryRuleTerminologyBoxAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyBoxAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:608:60: (iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF )
            // InternalOntologicalModelingLanguage.g:609:2: iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF
            {
             newCompositeNode(grammarAccess.getTerminologyBoxAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBoxAxiom=ruleTerminologyBoxAxiom();

            state._fsp--;

             current =iv_ruleTerminologyBoxAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBoxAxiom"


    // $ANTLR start "ruleTerminologyBoxAxiom"
    // InternalOntologicalModelingLanguage.g:615:1: ruleTerminologyBoxAxiom returns [EObject current=null] : (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom ) ;
    public final EObject ruleTerminologyBoxAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptDesignationTerminologyAxiom_0 = null;

        EObject this_TerminologyExtensionAxiom_1 = null;

        EObject this_TerminologyNestingAxiom_2 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:621:2: ( (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom ) )
            // InternalOntologicalModelingLanguage.g:622:2: (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom )
            {
            // InternalOntologicalModelingLanguage.g:622:2: (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN:
                {
                alt4=1;
                }
                break;
            case RULE_EXTENDS_TOKEN:
                {
                alt4=2;
                }
                break;
            case RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:623:3: this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBoxAxiomAccess().getConceptDesignationTerminologyAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptDesignationTerminologyAxiom_0=ruleConceptDesignationTerminologyAxiom();

                    state._fsp--;


                    			current = this_ConceptDesignationTerminologyAxiom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:632:3: this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBoxAxiomAccess().getTerminologyExtensionAxiomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminologyExtensionAxiom_1=ruleTerminologyExtensionAxiom();

                    state._fsp--;


                    			current = this_TerminologyExtensionAxiom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalModelingLanguage.g:641:3: this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBoxAxiomAccess().getTerminologyNestingAxiomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminologyNestingAxiom_2=ruleTerminologyNestingAxiom();

                    state._fsp--;


                    			current = this_TerminologyNestingAxiom_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBoxAxiom"


    // $ANTLR start "entryRuleTerminologyBoxStatement"
    // InternalOntologicalModelingLanguage.g:653:1: entryRuleTerminologyBoxStatement returns [EObject current=null] : iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF ;
    public final EObject entryRuleTerminologyBoxStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyBoxStatement = null;


        try {
            // InternalOntologicalModelingLanguage.g:653:64: (iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF )
            // InternalOntologicalModelingLanguage.g:654:2: iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF
            {
             newCompositeNode(grammarAccess.getTerminologyBoxStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBoxStatement=ruleTerminologyBoxStatement();

            state._fsp--;

             current =iv_ruleTerminologyBoxStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBoxStatement"


    // $ANTLR start "ruleTerminologyBoxStatement"
    // InternalOntologicalModelingLanguage.g:660:1: ruleTerminologyBoxStatement returns [EObject current=null] : (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm ) ;
    public final EObject ruleTerminologyBoxStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Axiom_0 = null;

        EObject this_Term_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:666:2: ( (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm ) )
            // InternalOntologicalModelingLanguage.g:667:2: (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm )
            {
            // InternalOntologicalModelingLanguage.g:667:2: (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_IRI||LA5_0==RULE_ID||(LA5_0>=RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN && LA5_0<=RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN)||(LA5_0>=RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN && LA5_0<=RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN)||LA5_0==RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ASPECT_TOKEN||(LA5_0>=RULE_ABSTRACT_TOKEN && LA5_0<=RULE_REIFIED_RELATIONSHIP_TOKEN)||(LA5_0>=RULE_UNREIFIED_RELATIONSHIP_TOKEN && LA5_0<=RULE_STRUCTURE_TOKEN)||LA5_0==RULE_BINARY_SCALAR_RESTRICTION_TOKEN||(LA5_0>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA5_0<=RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN)||(LA5_0>=RULE_STRING_SCALAR_RESTRICTION_TOKEN && LA5_0<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)||(LA5_0>=75 && LA5_0<=78)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:668:3: this_Axiom_0= ruleAxiom
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBoxStatementAccess().getAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Axiom_0=ruleAxiom();

                    state._fsp--;


                    			current = this_Axiom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:677:3: this_Term_1= ruleTerm
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBoxStatementAccess().getTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Term_1=ruleTerm();

                    state._fsp--;


                    			current = this_Term_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBoxStatement"


    // $ANTLR start "entryRuleTerm"
    // InternalOntologicalModelingLanguage.g:689:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalOntologicalModelingLanguage.g:689:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalOntologicalModelingLanguage.g:690:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalOntologicalModelingLanguage.g:696:1: ruleTerm returns [EObject current=null] : (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicEntity_0 = null;

        EObject this_EntityRelationship_1 = null;

        EObject this_Datatype_2 = null;

        EObject this_DataRelationship_3 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:702:2: ( (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship ) )
            // InternalOntologicalModelingLanguage.g:703:2: (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship )
            {
            // InternalOntologicalModelingLanguage.g:703:2: (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ASPECT_TOKEN:
            case RULE_CONCEPT_TOKEN:
                {
                alt6=1;
                }
                break;
            case RULE_ABSTRACT_TOKEN:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_CONCEPT_TOKEN) ) {
                    alt6=1;
                }
                else if ( (LA6_2==RULE_REIFIED_RELATIONSHIP_TOKEN) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REIFIED_RELATIONSHIP_TOKEN:
            case RULE_UNREIFIED_RELATIONSHIP_TOKEN:
                {
                alt6=2;
                }
                break;
            case RULE_SCALAR_TOKEN:
            case RULE_STRUCTURE_TOKEN:
            case RULE_BINARY_SCALAR_RESTRICTION_TOKEN:
            case RULE_IRI_SCALAR_RESTRICTION_TOKEN:
            case RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN:
            case RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN:
            case RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN:
            case RULE_STRING_SCALAR_RESTRICTION_TOKEN:
            case RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN:
            case RULE_TIME_SCALAR_RESTRICTION_TOKEN:
                {
                alt6=3;
                }
                break;
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:704:3: this_AtomicEntity_0= ruleAtomicEntity
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getAtomicEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicEntity_0=ruleAtomicEntity();

                    state._fsp--;


                    			current = this_AtomicEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:713:3: this_EntityRelationship_1= ruleEntityRelationship
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getEntityRelationshipParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityRelationship_1=ruleEntityRelationship();

                    state._fsp--;


                    			current = this_EntityRelationship_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalModelingLanguage.g:722:3: this_Datatype_2= ruleDatatype
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getDatatypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Datatype_2=ruleDatatype();

                    state._fsp--;


                    			current = this_Datatype_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntologicalModelingLanguage.g:731:3: this_DataRelationship_3= ruleDataRelationship
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getDataRelationshipParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataRelationship_3=ruleDataRelationship();

                    state._fsp--;


                    			current = this_DataRelationship_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtomicEntity"
    // InternalOntologicalModelingLanguage.g:743:1: entryRuleAtomicEntity returns [EObject current=null] : iv_ruleAtomicEntity= ruleAtomicEntity EOF ;
    public final EObject entryRuleAtomicEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicEntity = null;


        try {
            // InternalOntologicalModelingLanguage.g:743:53: (iv_ruleAtomicEntity= ruleAtomicEntity EOF )
            // InternalOntologicalModelingLanguage.g:744:2: iv_ruleAtomicEntity= ruleAtomicEntity EOF
            {
             newCompositeNode(grammarAccess.getAtomicEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicEntity=ruleAtomicEntity();

            state._fsp--;

             current =iv_ruleAtomicEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicEntity"


    // $ANTLR start "ruleAtomicEntity"
    // InternalOntologicalModelingLanguage.g:750:1: ruleAtomicEntity returns [EObject current=null] : (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept ) ;
    public final EObject ruleAtomicEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Aspect_0 = null;

        EObject this_Concept_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:756:2: ( (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept ) )
            // InternalOntologicalModelingLanguage.g:757:2: (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept )
            {
            // InternalOntologicalModelingLanguage.g:757:2: (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ASPECT_TOKEN) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ABSTRACT_TOKEN && LA7_0<=RULE_CONCEPT_TOKEN)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:758:3: this_Aspect_0= ruleAspect
                    {

                    			newCompositeNode(grammarAccess.getAtomicEntityAccess().getAspectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aspect_0=ruleAspect();

                    state._fsp--;


                    			current = this_Aspect_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:767:3: this_Concept_1= ruleConcept
                    {

                    			newCompositeNode(grammarAccess.getAtomicEntityAccess().getConceptParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Concept_1=ruleConcept();

                    state._fsp--;


                    			current = this_Concept_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicEntity"


    // $ANTLR start "entryRuleEntityRelationship"
    // InternalOntologicalModelingLanguage.g:779:1: entryRuleEntityRelationship returns [EObject current=null] : iv_ruleEntityRelationship= ruleEntityRelationship EOF ;
    public final EObject entryRuleEntityRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRelationship = null;


        try {
            // InternalOntologicalModelingLanguage.g:779:59: (iv_ruleEntityRelationship= ruleEntityRelationship EOF )
            // InternalOntologicalModelingLanguage.g:780:2: iv_ruleEntityRelationship= ruleEntityRelationship EOF
            {
             newCompositeNode(grammarAccess.getEntityRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRelationship=ruleEntityRelationship();

            state._fsp--;

             current =iv_ruleEntityRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityRelationship"


    // $ANTLR start "ruleEntityRelationship"
    // InternalOntologicalModelingLanguage.g:786:1: ruleEntityRelationship returns [EObject current=null] : (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship ) ;
    public final EObject ruleEntityRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_ReifiedRelationship_0 = null;

        EObject this_UnreifiedRelationship_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:792:2: ( (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship ) )
            // InternalOntologicalModelingLanguage.g:793:2: (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship )
            {
            // InternalOntologicalModelingLanguage.g:793:2: (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ABSTRACT_TOKEN||LA8_0==RULE_REIFIED_RELATIONSHIP_TOKEN) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_UNREIFIED_RELATIONSHIP_TOKEN) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:794:3: this_ReifiedRelationship_0= ruleReifiedRelationship
                    {

                    			newCompositeNode(grammarAccess.getEntityRelationshipAccess().getReifiedRelationshipParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReifiedRelationship_0=ruleReifiedRelationship();

                    state._fsp--;


                    			current = this_ReifiedRelationship_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:803:3: this_UnreifiedRelationship_1= ruleUnreifiedRelationship
                    {

                    			newCompositeNode(grammarAccess.getEntityRelationshipAccess().getUnreifiedRelationshipParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnreifiedRelationship_1=ruleUnreifiedRelationship();

                    state._fsp--;


                    			current = this_UnreifiedRelationship_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityRelationship"


    // $ANTLR start "entryRuleDatatype"
    // InternalOntologicalModelingLanguage.g:815:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalOntologicalModelingLanguage.g:815:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalOntologicalModelingLanguage.g:816:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalOntologicalModelingLanguage.g:822:1: ruleDatatype returns [EObject current=null] : (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarDataRange_0 = null;

        EObject this_Structure_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:828:2: ( (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure ) )
            // InternalOntologicalModelingLanguage.g:829:2: (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure )
            {
            // InternalOntologicalModelingLanguage.g:829:2: (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SCALAR_TOKEN||LA9_0==RULE_BINARY_SCALAR_RESTRICTION_TOKEN||(LA9_0>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA9_0<=RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN)||(LA9_0>=RULE_STRING_SCALAR_RESTRICTION_TOKEN && LA9_0<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRUCTURE_TOKEN) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:830:3: this_ScalarDataRange_0= ruleScalarDataRange
                    {

                    			newCompositeNode(grammarAccess.getDatatypeAccess().getScalarDataRangeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarDataRange_0=ruleScalarDataRange();

                    state._fsp--;


                    			current = this_ScalarDataRange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:839:3: this_Structure_1= ruleStructure
                    {

                    			newCompositeNode(grammarAccess.getDatatypeAccess().getStructureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Structure_1=ruleStructure();

                    state._fsp--;


                    			current = this_Structure_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleScalarDataRange"
    // InternalOntologicalModelingLanguage.g:851:1: entryRuleScalarDataRange returns [EObject current=null] : iv_ruleScalarDataRange= ruleScalarDataRange EOF ;
    public final EObject entryRuleScalarDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarDataRange = null;


        try {
            // InternalOntologicalModelingLanguage.g:851:56: (iv_ruleScalarDataRange= ruleScalarDataRange EOF )
            // InternalOntologicalModelingLanguage.g:852:2: iv_ruleScalarDataRange= ruleScalarDataRange EOF
            {
             newCompositeNode(grammarAccess.getScalarDataRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarDataRange=ruleScalarDataRange();

            state._fsp--;

             current =iv_ruleScalarDataRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarDataRange"


    // $ANTLR start "ruleScalarDataRange"
    // InternalOntologicalModelingLanguage.g:858:1: ruleScalarDataRange returns [EObject current=null] : (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange ) ;
    public final EObject ruleScalarDataRange() throws RecognitionException {
        EObject current = null;

        EObject this_Scalar_0 = null;

        EObject this_RestrictedDataRange_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:864:2: ( (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange ) )
            // InternalOntologicalModelingLanguage.g:865:2: (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange )
            {
            // InternalOntologicalModelingLanguage.g:865:2: (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_SCALAR_TOKEN) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_BINARY_SCALAR_RESTRICTION_TOKEN||(LA10_0>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA10_0<=RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN)||(LA10_0>=RULE_STRING_SCALAR_RESTRICTION_TOKEN && LA10_0<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:866:3: this_Scalar_0= ruleScalar
                    {

                    			newCompositeNode(grammarAccess.getScalarDataRangeAccess().getScalarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scalar_0=ruleScalar();

                    state._fsp--;


                    			current = this_Scalar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:875:3: this_RestrictedDataRange_1= ruleRestrictedDataRange
                    {

                    			newCompositeNode(grammarAccess.getScalarDataRangeAccess().getRestrictedDataRangeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestrictedDataRange_1=ruleRestrictedDataRange();

                    state._fsp--;


                    			current = this_RestrictedDataRange_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarDataRange"


    // $ANTLR start "entryRuleRestrictedDataRange"
    // InternalOntologicalModelingLanguage.g:887:1: entryRuleRestrictedDataRange returns [EObject current=null] : iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF ;
    public final EObject entryRuleRestrictedDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedDataRange = null;


        try {
            // InternalOntologicalModelingLanguage.g:887:60: (iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF )
            // InternalOntologicalModelingLanguage.g:888:2: iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF
            {
             newCompositeNode(grammarAccess.getRestrictedDataRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestrictedDataRange=ruleRestrictedDataRange();

            state._fsp--;

             current =iv_ruleRestrictedDataRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedDataRange"


    // $ANTLR start "ruleRestrictedDataRange"
    // InternalOntologicalModelingLanguage.g:894:1: ruleRestrictedDataRange returns [EObject current=null] : (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction ) ;
    public final EObject ruleRestrictedDataRange() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryScalarRestriction_0 = null;

        EObject this_IRIScalarRestriction_1 = null;

        EObject this_NumericScalarRestriction_2 = null;

        EObject this_PlainLiteralScalarRestriction_3 = null;

        EObject this_ScalarOneOfRestriction_4 = null;

        EObject this_StringScalarRestriction_5 = null;

        EObject this_SynonymScalarRestriction_6 = null;

        EObject this_TimeScalarRestriction_7 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:900:2: ( (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction ) )
            // InternalOntologicalModelingLanguage.g:901:2: (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction )
            {
            // InternalOntologicalModelingLanguage.g:901:2: (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction )
            int alt11=8;
            switch ( input.LA(1) ) {
            case RULE_BINARY_SCALAR_RESTRICTION_TOKEN:
                {
                alt11=1;
                }
                break;
            case RULE_IRI_SCALAR_RESTRICTION_TOKEN:
                {
                alt11=2;
                }
                break;
            case RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN:
                {
                alt11=3;
                }
                break;
            case RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN:
                {
                alt11=4;
                }
                break;
            case RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN:
                {
                alt11=5;
                }
                break;
            case RULE_STRING_SCALAR_RESTRICTION_TOKEN:
                {
                alt11=6;
                }
                break;
            case RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN:
                {
                alt11=7;
                }
                break;
            case RULE_TIME_SCALAR_RESTRICTION_TOKEN:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:902:3: this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction
                    {

                    			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getBinaryScalarRestrictionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryScalarRestriction_0=ruleBinaryScalarRestriction();

                    state._fsp--;


                    			current = this_BinaryScalarRestriction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:911:3: this_IRIScalarRestriction_1= ruleIRIScalarRestriction
                    {

                    			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getIRIScalarRestrictionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IRIScalarRestriction_1=ruleIRIScalarRestriction();

                    state._fsp--;


                    			current = this_IRIScalarRestriction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalModelingLanguage.g:920:3: this_NumericScalarRestriction_2= ruleNumericScalarRestriction
                    {

                    			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getNumericScalarRestrictionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericScalarRestriction_2=ruleNumericScalarRestriction();

                    state._fsp--;


                    			current = this_NumericScalarRestriction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntologicalModelingLanguage.g:929:3: this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction
                    {

                    			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getPlainLiteralScalarRestrictionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlainLiteralScalarRestriction_3=rulePlainLiteralScalarRestriction();

                    state._fsp--;


                    			current = this_PlainLiteralScalarRestriction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOntologicalModelingLanguage.g:938:3: this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction
                    {

                    			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getScalarOneOfRestrictionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarOneOfRestriction_4=ruleScalarOneOfRestriction();

                    state._fsp--;


                    			current = this_ScalarOneOfRestriction_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOntologicalModelingLanguage.g:947:3: this_StringScalarRestriction_5= ruleStringScalarRestriction
                    {

                    			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getStringScalarRestrictionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringScalarRestriction_5=ruleStringScalarRestriction();

                    state._fsp--;


                    			current = this_StringScalarRestriction_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOntologicalModelingLanguage.g:956:3: this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction
                    {

                    			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getSynonymScalarRestrictionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SynonymScalarRestriction_6=ruleSynonymScalarRestriction();

                    state._fsp--;


                    			current = this_SynonymScalarRestriction_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOntologicalModelingLanguage.g:965:3: this_TimeScalarRestriction_7= ruleTimeScalarRestriction
                    {

                    			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getTimeScalarRestrictionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeScalarRestriction_7=ruleTimeScalarRestriction();

                    state._fsp--;


                    			current = this_TimeScalarRestriction_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedDataRange"


    // $ANTLR start "entryRuleDataRelationship"
    // InternalOntologicalModelingLanguage.g:977:1: entryRuleDataRelationship returns [EObject current=null] : iv_ruleDataRelationship= ruleDataRelationship EOF ;
    public final EObject entryRuleDataRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRelationship = null;


        try {
            // InternalOntologicalModelingLanguage.g:977:57: (iv_ruleDataRelationship= ruleDataRelationship EOF )
            // InternalOntologicalModelingLanguage.g:978:2: iv_ruleDataRelationship= ruleDataRelationship EOF
            {
             newCompositeNode(grammarAccess.getDataRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataRelationship=ruleDataRelationship();

            state._fsp--;

             current =iv_ruleDataRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataRelationship"


    // $ANTLR start "ruleDataRelationship"
    // InternalOntologicalModelingLanguage.g:984:1: ruleDataRelationship returns [EObject current=null] : (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty ) ;
    public final EObject ruleDataRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_EntityStructuredDataProperty_0 = null;

        EObject this_EntityScalarDataProperty_1 = null;

        EObject this_StructuredDataProperty_2 = null;

        EObject this_ScalarDataProperty_3 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:990:2: ( (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty ) )
            // InternalOntologicalModelingLanguage.g:991:2: (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty )
            {
            // InternalOntologicalModelingLanguage.g:991:2: (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt12=1;
                }
                break;
            case 76:
                {
                alt12=2;
                }
                break;
            case 77:
                {
                alt12=3;
                }
                break;
            case 78:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:992:3: this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty
                    {

                    			newCompositeNode(grammarAccess.getDataRelationshipAccess().getEntityStructuredDataPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityStructuredDataProperty_0=ruleEntityStructuredDataProperty();

                    state._fsp--;


                    			current = this_EntityStructuredDataProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:1001:3: this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty
                    {

                    			newCompositeNode(grammarAccess.getDataRelationshipAccess().getEntityScalarDataPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataProperty_1=ruleEntityScalarDataProperty();

                    state._fsp--;


                    			current = this_EntityScalarDataProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalModelingLanguage.g:1010:3: this_StructuredDataProperty_2= ruleStructuredDataProperty
                    {

                    			newCompositeNode(grammarAccess.getDataRelationshipAccess().getStructuredDataPropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructuredDataProperty_2=ruleStructuredDataProperty();

                    state._fsp--;


                    			current = this_StructuredDataProperty_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntologicalModelingLanguage.g:1019:3: this_ScalarDataProperty_3= ruleScalarDataProperty
                    {

                    			newCompositeNode(grammarAccess.getDataRelationshipAccess().getScalarDataPropertyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarDataProperty_3=ruleScalarDataProperty();

                    state._fsp--;


                    			current = this_ScalarDataProperty_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataRelationship"


    // $ANTLR start "entryRuleAxiom"
    // InternalOntologicalModelingLanguage.g:1031:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:1031:46: (iv_ruleAxiom= ruleAxiom EOF )
            // InternalOntologicalModelingLanguage.g:1032:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // InternalOntologicalModelingLanguage.g:1038:1: ruleAxiom returns [EObject current=null] : (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarOneOfLiteralAxiom_0 = null;

        EObject this_TermAxiom_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1044:2: ( (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom ) )
            // InternalOntologicalModelingLanguage.g:1045:2: (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom )
            {
            // InternalOntologicalModelingLanguage.g:1045:2: (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_IRI||LA13_0==RULE_ID||(LA13_0>=RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN && LA13_0<=RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN)||(LA13_0>=RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN && LA13_0<=RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1046:3: this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getScalarOneOfLiteralAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarOneOfLiteralAxiom_0=ruleScalarOneOfLiteralAxiom();

                    state._fsp--;


                    			current = this_ScalarOneOfLiteralAxiom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:1055:3: this_TermAxiom_1= ruleTermAxiom
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getTermAxiomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TermAxiom_1=ruleTermAxiom();

                    state._fsp--;


                    			current = this_TermAxiom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleTermAxiom"
    // InternalOntologicalModelingLanguage.g:1067:1: entryRuleTermAxiom returns [EObject current=null] : iv_ruleTermAxiom= ruleTermAxiom EOF ;
    public final EObject entryRuleTermAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:1067:50: (iv_ruleTermAxiom= ruleTermAxiom EOF )
            // InternalOntologicalModelingLanguage.g:1068:2: iv_ruleTermAxiom= ruleTermAxiom EOF
            {
             newCompositeNode(grammarAccess.getTermAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermAxiom=ruleTermAxiom();

            state._fsp--;

             current =iv_ruleTermAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermAxiom"


    // $ANTLR start "ruleTermAxiom"
    // InternalOntologicalModelingLanguage.g:1074:1: ruleTermAxiom returns [EObject current=null] : (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom ) ;
    public final EObject ruleTermAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_EntityRestrictionAxiom_0 = null;

        EObject this_EntityScalarDataPropertyRestrictionAxiom_1 = null;

        EObject this_SpecializationAxiom_2 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1080:2: ( (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom ) )
            // InternalOntologicalModelingLanguage.g:1081:2: (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom )
            {
            // InternalOntologicalModelingLanguage.g:1081:2: (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
            case RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                {
                alt14=1;
                }
                break;
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN:
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                {
                alt14=2;
                }
                break;
            case RULE_IRI:
            case RULE_ID:
            case RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN:
            case RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1082:3: this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom
                    {

                    			newCompositeNode(grammarAccess.getTermAxiomAccess().getEntityRestrictionAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityRestrictionAxiom_0=ruleEntityRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityRestrictionAxiom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:1091:3: this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom
                    {

                    			newCompositeNode(grammarAccess.getTermAxiomAccess().getEntityScalarDataPropertyRestrictionAxiomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataPropertyRestrictionAxiom_1=ruleEntityScalarDataPropertyRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityScalarDataPropertyRestrictionAxiom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalModelingLanguage.g:1100:3: this_SpecializationAxiom_2= ruleSpecializationAxiom
                    {

                    			newCompositeNode(grammarAccess.getTermAxiomAccess().getSpecializationAxiomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecializationAxiom_2=ruleSpecializationAxiom();

                    state._fsp--;


                    			current = this_SpecializationAxiom_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermAxiom"


    // $ANTLR start "entryRuleEntityRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:1112:1: entryRuleEntityRestrictionAxiom returns [EObject current=null] : iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF ;
    public final EObject entryRuleEntityRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRestrictionAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:1112:63: (iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF )
            // InternalOntologicalModelingLanguage.g:1113:2: iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF
            {
             newCompositeNode(grammarAccess.getEntityRestrictionAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRestrictionAxiom=ruleEntityRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityRestrictionAxiom"


    // $ANTLR start "ruleEntityRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:1119:1: ruleEntityRestrictionAxiom returns [EObject current=null] : (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom ) ;
    public final EObject ruleEntityRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_EntityExistentialRestrictionAxiom_0 = null;

        EObject this_EntityUniversalRestrictionAxiom_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1125:2: ( (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom ) )
            // InternalOntologicalModelingLanguage.g:1126:2: (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom )
            {
            // InternalOntologicalModelingLanguage.g:1126:2: (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1127:3: this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom
                    {

                    			newCompositeNode(grammarAccess.getEntityRestrictionAxiomAccess().getEntityExistentialRestrictionAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityExistentialRestrictionAxiom_0=ruleEntityExistentialRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityExistentialRestrictionAxiom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:1136:3: this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom
                    {

                    			newCompositeNode(grammarAccess.getEntityRestrictionAxiomAccess().getEntityUniversalRestrictionAxiomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityUniversalRestrictionAxiom_1=ruleEntityUniversalRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityUniversalRestrictionAxiom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityRestrictionAxiom"


    // $ANTLR start "entryRuleEntityScalarDataPropertyRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:1148:1: entryRuleEntityScalarDataPropertyRestrictionAxiom returns [EObject current=null] : iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF ;
    public final EObject entryRuleEntityScalarDataPropertyRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityScalarDataPropertyRestrictionAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:1148:81: (iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF )
            // InternalOntologicalModelingLanguage.g:1149:2: iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF
            {
             newCompositeNode(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataPropertyRestrictionAxiom=ruleEntityScalarDataPropertyRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityScalarDataPropertyRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataPropertyRestrictionAxiom"


    // $ANTLR start "ruleEntityScalarDataPropertyRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:1155:1: ruleEntityScalarDataPropertyRestrictionAxiom returns [EObject current=null] : (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom ) ;
    public final EObject ruleEntityScalarDataPropertyRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_EntityScalarDataPropertyExistentialRestrictionAxiom_0 = null;

        EObject this_EntityScalarDataPropertyParticularRestrictionAxiom_1 = null;

        EObject this_EntityScalarDataPropertyUniversalRestrictionAxiom_2 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1161:2: ( (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom ) )
            // InternalOntologicalModelingLanguage.g:1162:2: (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom )
            {
            // InternalOntologicalModelingLanguage.g:1162:2: (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
                {
                alt16=1;
                }
                break;
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN:
                {
                alt16=2;
                }
                break;
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1163:3: this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom
                    {

                    			newCompositeNode(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataPropertyExistentialRestrictionAxiom_0=ruleEntityScalarDataPropertyExistentialRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityScalarDataPropertyExistentialRestrictionAxiom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:1172:3: this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom
                    {

                    			newCompositeNode(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataPropertyParticularRestrictionAxiom_1=ruleEntityScalarDataPropertyParticularRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityScalarDataPropertyParticularRestrictionAxiom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalModelingLanguage.g:1181:3: this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom
                    {

                    			newCompositeNode(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataPropertyUniversalRestrictionAxiom_2=ruleEntityScalarDataPropertyUniversalRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityScalarDataPropertyUniversalRestrictionAxiom_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataPropertyRestrictionAxiom"


    // $ANTLR start "entryRuleSpecializationAxiom"
    // InternalOntologicalModelingLanguage.g:1193:1: entryRuleSpecializationAxiom returns [EObject current=null] : iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF ;
    public final EObject entryRuleSpecializationAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecializationAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:1193:60: (iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF )
            // InternalOntologicalModelingLanguage.g:1194:2: iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF
            {
             newCompositeNode(grammarAccess.getSpecializationAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecializationAxiom=ruleSpecializationAxiom();

            state._fsp--;

             current =iv_ruleSpecializationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecializationAxiom"


    // $ANTLR start "ruleSpecializationAxiom"
    // InternalOntologicalModelingLanguage.g:1200:1: ruleSpecializationAxiom returns [EObject current=null] : (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom ) ;
    public final EObject ruleSpecializationAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptSpecializationAxiom_0 = null;

        EObject this_AspectSpecializationAxiom_1 = null;

        EObject this_ReifiedRelationshipSpecializationAxiom_2 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1206:2: ( (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom ) )
            // InternalOntologicalModelingLanguage.g:1207:2: (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom )
            {
            // InternalOntologicalModelingLanguage.g:1207:2: (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN:
                {
                alt17=1;
                }
                break;
            case RULE_IRI:
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1208:3: this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom
                    {

                    			newCompositeNode(grammarAccess.getSpecializationAxiomAccess().getConceptSpecializationAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptSpecializationAxiom_0=ruleConceptSpecializationAxiom();

                    state._fsp--;


                    			current = this_ConceptSpecializationAxiom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:1217:3: this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom
                    {

                    			newCompositeNode(grammarAccess.getSpecializationAxiomAccess().getAspectSpecializationAxiomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AspectSpecializationAxiom_1=ruleAspectSpecializationAxiom();

                    state._fsp--;


                    			current = this_AspectSpecializationAxiom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalModelingLanguage.g:1226:3: this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom
                    {

                    			newCompositeNode(grammarAccess.getSpecializationAxiomAccess().getReifiedRelationshipSpecializationAxiomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReifiedRelationshipSpecializationAxiom_2=ruleReifiedRelationshipSpecializationAxiom();

                    state._fsp--;


                    			current = this_ReifiedRelationshipSpecializationAxiom_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecializationAxiom"


    // $ANTLR start "entryRuleTerminologyBundleStatement"
    // InternalOntologicalModelingLanguage.g:1238:1: entryRuleTerminologyBundleStatement returns [EObject current=null] : iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF ;
    public final EObject entryRuleTerminologyBundleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyBundleStatement = null;


        try {
            // InternalOntologicalModelingLanguage.g:1238:67: (iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF )
            // InternalOntologicalModelingLanguage.g:1239:2: iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF
            {
             newCompositeNode(grammarAccess.getTerminologyBundleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBundleStatement=ruleTerminologyBundleStatement();

            state._fsp--;

             current =iv_ruleTerminologyBundleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBundleStatement"


    // $ANTLR start "ruleTerminologyBundleStatement"
    // InternalOntologicalModelingLanguage.g:1245:1: ruleTerminologyBundleStatement returns [EObject current=null] : (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom ) ;
    public final EObject ruleTerminologyBundleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AnonymousConceptTaxonomyAxiom_0 = null;

        EObject this_RootConceptTaxonomyAxiom_1 = null;

        EObject this_SpecificDisjointConceptAxiom_2 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1251:2: ( (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom ) )
            // InternalOntologicalModelingLanguage.g:1252:2: (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom )
            {
            // InternalOntologicalModelingLanguage.g:1252:2: (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN:
                {
                alt18=1;
                }
                break;
            case RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN:
                {
                alt18=2;
                }
                break;
            case RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1253:3: this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBundleStatementAccess().getAnonymousConceptTaxonomyAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnonymousConceptTaxonomyAxiom_0=ruleAnonymousConceptTaxonomyAxiom();

                    state._fsp--;


                    			current = this_AnonymousConceptTaxonomyAxiom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:1262:3: this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBundleStatementAccess().getRootConceptTaxonomyAxiomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RootConceptTaxonomyAxiom_1=ruleRootConceptTaxonomyAxiom();

                    state._fsp--;


                    			current = this_RootConceptTaxonomyAxiom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntologicalModelingLanguage.g:1271:3: this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBundleStatementAccess().getSpecificDisjointConceptAxiomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecificDisjointConceptAxiom_2=ruleSpecificDisjointConceptAxiom();

                    state._fsp--;


                    			current = this_SpecificDisjointConceptAxiom_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBundleStatement"


    // $ANTLR start "entryRuleTerminologyBundleAxiom"
    // InternalOntologicalModelingLanguage.g:1283:1: entryRuleTerminologyBundleAxiom returns [EObject current=null] : iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF ;
    public final EObject entryRuleTerminologyBundleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyBundleAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:1283:63: (iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF )
            // InternalOntologicalModelingLanguage.g:1284:2: iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF
            {
             newCompositeNode(grammarAccess.getTerminologyBundleAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBundleAxiom=ruleTerminologyBundleAxiom();

            state._fsp--;

             current =iv_ruleTerminologyBundleAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBundleAxiom"


    // $ANTLR start "ruleTerminologyBundleAxiom"
    // InternalOntologicalModelingLanguage.g:1290:1: ruleTerminologyBundleAxiom returns [EObject current=null] : this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom ;
    public final EObject ruleTerminologyBundleAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_BundledTerminologyAxiom_0 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1296:2: (this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom )
            // InternalOntologicalModelingLanguage.g:1297:2: this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom
            {

            		newCompositeNode(grammarAccess.getTerminologyBundleAxiomAccess().getBundledTerminologyAxiomParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BundledTerminologyAxiom_0=ruleBundledTerminologyAxiom();

            state._fsp--;


            		current = this_BundledTerminologyAxiom_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBundleAxiom"


    // $ANTLR start "entryRuleAspect"
    // InternalOntologicalModelingLanguage.g:1308:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // InternalOntologicalModelingLanguage.g:1308:47: (iv_ruleAspect= ruleAspect EOF )
            // InternalOntologicalModelingLanguage.g:1309:2: iv_ruleAspect= ruleAspect EOF
            {
             newCompositeNode(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAspect=ruleAspect();

            state._fsp--;

             current =iv_ruleAspect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // InternalOntologicalModelingLanguage.g:1315:1: ruleAspect returns [EObject current=null] : (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token this_ASPECT_TOKEN_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1321:2: ( (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalOntologicalModelingLanguage.g:1322:2: (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalOntologicalModelingLanguage.g:1322:2: (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // InternalOntologicalModelingLanguage.g:1323:3: this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {
            this_ASPECT_TOKEN_0=(Token)match(input,RULE_ASPECT_TOKEN,FOLLOW_4); 

            			newLeafNode(this_ASPECT_TOKEN_0, grammarAccess.getAspectAccess().getASPECT_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:1327:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:1328:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:1328:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:1329:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAspectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleConcept"
    // InternalOntologicalModelingLanguage.g:1349:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalOntologicalModelingLanguage.g:1349:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalOntologicalModelingLanguage.g:1350:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalOntologicalModelingLanguage.g:1356:1: ruleConcept returns [EObject current=null] : ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token this_CONCEPT_TOKEN_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1362:2: ( ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalOntologicalModelingLanguage.g:1363:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalOntologicalModelingLanguage.g:1363:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) )
            // InternalOntologicalModelingLanguage.g:1364:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalOntologicalModelingLanguage.g:1364:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ABSTRACT_TOKEN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1365:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1365:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1366:5: lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN
                    {
                    lv_isAbstract_0_0=(Token)match(input,RULE_ABSTRACT_TOKEN,FOLLOW_13); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getConceptAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isAbstract",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.ABSTRACT_TOKEN");
                    				

                    }


                    }
                    break;

            }

            this_CONCEPT_TOKEN_1=(Token)match(input,RULE_CONCEPT_TOKEN,FOLLOW_4); 

            			newLeafNode(this_CONCEPT_TOKEN_1, grammarAccess.getConceptAccess().getCONCEPT_TOKENTerminalRuleCall_1());
            		
            // InternalOntologicalModelingLanguage.g:1386:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:1387:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:1387:4: (lv_name_2_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:1388:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleReifiedRelationship"
    // InternalOntologicalModelingLanguage.g:1408:1: entryRuleReifiedRelationship returns [EObject current=null] : iv_ruleReifiedRelationship= ruleReifiedRelationship EOF ;
    public final EObject entryRuleReifiedRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReifiedRelationship = null;


        try {
            // InternalOntologicalModelingLanguage.g:1408:60: (iv_ruleReifiedRelationship= ruleReifiedRelationship EOF )
            // InternalOntologicalModelingLanguage.g:1409:2: iv_ruleReifiedRelationship= ruleReifiedRelationship EOF
            {
             newCompositeNode(grammarAccess.getReifiedRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationship=ruleReifiedRelationship();

            state._fsp--;

             current =iv_ruleReifiedRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationship"


    // $ANTLR start "ruleReifiedRelationship"
    // InternalOntologicalModelingLanguage.g:1415:1: ruleReifiedRelationship returns [EObject current=null] : ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY ) ;
    public final EObject ruleReifiedRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token this_REIFIED_RELATIONSHIP_TOKEN_1=null;
        Token lv_name_2_0=null;
        Token this_LCURLY_3=null;
        Token lv_isFunctional_4_0=null;
        Token lv_isInverseFunctional_5_0=null;
        Token lv_isEssential_6_0=null;
        Token lv_isInverseEssential_7_0=null;
        Token lv_isSymmetric_8_0=null;
        Token lv_isAsymmetric_9_0=null;
        Token lv_isReflexive_10_0=null;
        Token lv_isIrreflexive_11_0=null;
        Token lv_isTransitive_12_0=null;
        Token this_UNREIFIED_TOKEN_13=null;
        Token this_EQUAL_14=null;
        Token lv_unreifiedPropertyName_15_0=null;
        Token this_INVERSE_TOKEN_16=null;
        Token this_EQUAL_17=null;
        Token lv_unreifiedInversePropertyName_18_0=null;
        Token this_SOURCE_TOKEN_19=null;
        Token this_EQUAL_20=null;
        Token this_TARGET_TOKEN_22=null;
        Token this_EQUAL_23=null;
        Token this_RCURLY_25=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1421:2: ( ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:1422:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:1422:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:1423:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY
            {
            // InternalOntologicalModelingLanguage.g:1423:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ABSTRACT_TOKEN) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1424:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1424:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1425:5: lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN
                    {
                    lv_isAbstract_0_0=(Token)match(input,RULE_ABSTRACT_TOKEN,FOLLOW_14); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getReifiedRelationshipAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isAbstract",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.ABSTRACT_TOKEN");
                    				

                    }


                    }
                    break;

            }

            this_REIFIED_RELATIONSHIP_TOKEN_1=(Token)match(input,RULE_REIFIED_RELATIONSHIP_TOKEN,FOLLOW_4); 

            			newLeafNode(this_REIFIED_RELATIONSHIP_TOKEN_1, grammarAccess.getReifiedRelationshipAccess().getREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1());
            		
            // InternalOntologicalModelingLanguage.g:1445:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:1446:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:1446:4: (lv_name_2_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:1447:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getReifiedRelationshipAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_15); 

            			newLeafNode(this_LCURLY_3, grammarAccess.getReifiedRelationshipAccess().getLCURLYTerminalRuleCall_3());
            		
            // InternalOntologicalModelingLanguage.g:1467:3: ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_FUNCTIONAL_TOKEN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1468:4: (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1468:4: (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1469:5: lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN
                    {
                    lv_isFunctional_4_0=(Token)match(input,RULE_FUNCTIONAL_TOKEN,FOLLOW_16); 

                    					newLeafNode(lv_isFunctional_4_0, grammarAccess.getReifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isFunctional",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.FUNCTIONAL_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1485:3: ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INVERSE_FUNCTIONAL_TOKEN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1486:4: (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1486:4: (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1487:5: lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN
                    {
                    lv_isInverseFunctional_5_0=(Token)match(input,RULE_INVERSE_FUNCTIONAL_TOKEN,FOLLOW_17); 

                    					newLeafNode(lv_isInverseFunctional_5_0, grammarAccess.getReifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isInverseFunctional",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_FUNCTIONAL_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1503:3: ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ESSENTIAL_TOKEN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1504:4: (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1504:4: (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1505:5: lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN
                    {
                    lv_isEssential_6_0=(Token)match(input,RULE_ESSENTIAL_TOKEN,FOLLOW_18); 

                    					newLeafNode(lv_isEssential_6_0, grammarAccess.getReifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isEssential",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.ESSENTIAL_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1521:3: ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INVERSE_ESSENTIAL_TOKEN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1522:4: (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1522:4: (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1523:5: lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN
                    {
                    lv_isInverseEssential_7_0=(Token)match(input,RULE_INVERSE_ESSENTIAL_TOKEN,FOLLOW_19); 

                    					newLeafNode(lv_isInverseEssential_7_0, grammarAccess.getReifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isInverseEssential",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_ESSENTIAL_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1539:3: ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SYMMETRIC_TOKEN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1540:4: (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1540:4: (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1541:5: lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN
                    {
                    lv_isSymmetric_8_0=(Token)match(input,RULE_SYMMETRIC_TOKEN,FOLLOW_20); 

                    					newLeafNode(lv_isSymmetric_8_0, grammarAccess.getReifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isSymmetric",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.SYMMETRIC_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1557:3: ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ASYMMETRIC_TOKEN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1558:4: (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1558:4: (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1559:5: lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN
                    {
                    lv_isAsymmetric_9_0=(Token)match(input,RULE_ASYMMETRIC_TOKEN,FOLLOW_21); 

                    					newLeafNode(lv_isAsymmetric_9_0, grammarAccess.getReifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isAsymmetric",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.ASYMMETRIC_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1575:3: ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_REFLEXIVE_TOKEN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1576:4: (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1576:4: (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1577:5: lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN
                    {
                    lv_isReflexive_10_0=(Token)match(input,RULE_REFLEXIVE_TOKEN,FOLLOW_22); 

                    					newLeafNode(lv_isReflexive_10_0, grammarAccess.getReifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isReflexive",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.REFLEXIVE_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1593:3: ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IRREFLEXIVE_TOKEN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1594:4: (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1594:4: (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1595:5: lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN
                    {
                    lv_isIrreflexive_11_0=(Token)match(input,RULE_IRREFLEXIVE_TOKEN,FOLLOW_23); 

                    					newLeafNode(lv_isIrreflexive_11_0, grammarAccess.getReifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isIrreflexive",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRREFLEXIVE_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1611:3: ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_TRANSITIVE_TOKEN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1612:4: (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1612:4: (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1613:5: lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN
                    {
                    lv_isTransitive_12_0=(Token)match(input,RULE_TRANSITIVE_TOKEN,FOLLOW_24); 

                    					newLeafNode(lv_isTransitive_12_0, grammarAccess.getReifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isTransitive",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.TRANSITIVE_TOKEN");
                    				

                    }


                    }
                    break;

            }

            this_UNREIFIED_TOKEN_13=(Token)match(input,RULE_UNREIFIED_TOKEN,FOLLOW_5); 

            			newLeafNode(this_UNREIFIED_TOKEN_13, grammarAccess.getReifiedRelationshipAccess().getUNREIFIED_TOKENTerminalRuleCall_13());
            		
            this_EQUAL_14=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_14, grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_14());
            		
            // InternalOntologicalModelingLanguage.g:1637:3: ( (lv_unreifiedPropertyName_15_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:1638:4: (lv_unreifiedPropertyName_15_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:1638:4: (lv_unreifiedPropertyName_15_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:1639:5: lv_unreifiedPropertyName_15_0= RULE_ID
            {
            lv_unreifiedPropertyName_15_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_unreifiedPropertyName_15_0, grammarAccess.getReifiedRelationshipAccess().getUnreifiedPropertyNameIDTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"unreifiedPropertyName",
            						lv_unreifiedPropertyName_15_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            // InternalOntologicalModelingLanguage.g:1655:3: (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INVERSE_TOKEN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1656:4: this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) )
                    {
                    this_INVERSE_TOKEN_16=(Token)match(input,RULE_INVERSE_TOKEN,FOLLOW_5); 

                    				newLeafNode(this_INVERSE_TOKEN_16, grammarAccess.getReifiedRelationshipAccess().getINVERSE_TOKENTerminalRuleCall_16_0());
                    			
                    this_EQUAL_17=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

                    				newLeafNode(this_EQUAL_17, grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_16_1());
                    			
                    // InternalOntologicalModelingLanguage.g:1664:4: ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) )
                    // InternalOntologicalModelingLanguage.g:1665:5: (lv_unreifiedInversePropertyName_18_0= RULE_ID )
                    {
                    // InternalOntologicalModelingLanguage.g:1665:5: (lv_unreifiedInversePropertyName_18_0= RULE_ID )
                    // InternalOntologicalModelingLanguage.g:1666:6: lv_unreifiedInversePropertyName_18_0= RULE_ID
                    {
                    lv_unreifiedInversePropertyName_18_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(lv_unreifiedInversePropertyName_18_0, grammarAccess.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReifiedRelationshipRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"unreifiedInversePropertyName",
                    							lv_unreifiedInversePropertyName_18_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            this_SOURCE_TOKEN_19=(Token)match(input,RULE_SOURCE_TOKEN,FOLLOW_5); 

            			newLeafNode(this_SOURCE_TOKEN_19, grammarAccess.getReifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_17());
            		
            this_EQUAL_20=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			newLeafNode(this_EQUAL_20, grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_18());
            		
            // InternalOntologicalModelingLanguage.g:1691:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:1692:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:1692:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:1693:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipAccess().getSourceEntityCrossReference_19_0());
            				
            pushFollow(FOLLOW_28);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TARGET_TOKEN_22=(Token)match(input,RULE_TARGET_TOKEN,FOLLOW_5); 

            			newLeafNode(this_TARGET_TOKEN_22, grammarAccess.getReifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_20());
            		
            this_EQUAL_23=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			newLeafNode(this_EQUAL_23, grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_21());
            		
            // InternalOntologicalModelingLanguage.g:1715:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:1716:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:1716:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:1717:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipAccess().getTargetEntityCrossReference_22_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_25=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_25, grammarAccess.getReifiedRelationshipAccess().getRCURLYTerminalRuleCall_23());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationship"


    // $ANTLR start "entryRuleUnreifiedRelationship"
    // InternalOntologicalModelingLanguage.g:1739:1: entryRuleUnreifiedRelationship returns [EObject current=null] : iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF ;
    public final EObject entryRuleUnreifiedRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnreifiedRelationship = null;


        try {
            // InternalOntologicalModelingLanguage.g:1739:62: (iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF )
            // InternalOntologicalModelingLanguage.g:1740:2: iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF
            {
             newCompositeNode(grammarAccess.getUnreifiedRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnreifiedRelationship=ruleUnreifiedRelationship();

            state._fsp--;

             current =iv_ruleUnreifiedRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnreifiedRelationship"


    // $ANTLR start "ruleUnreifiedRelationship"
    // InternalOntologicalModelingLanguage.g:1746:1: ruleUnreifiedRelationship returns [EObject current=null] : (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY ) ;
    public final EObject ruleUnreifiedRelationship() throws RecognitionException {
        EObject current = null;

        Token this_UNREIFIED_RELATIONSHIP_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token lv_isFunctional_3_0=null;
        Token lv_isInverseFunctional_4_0=null;
        Token lv_isEssential_5_0=null;
        Token lv_isInverseEssential_6_0=null;
        Token lv_isSymmetric_7_0=null;
        Token lv_isAsymmetric_8_0=null;
        Token lv_isReflexive_9_0=null;
        Token lv_isIrreflexive_10_0=null;
        Token lv_isTransitive_11_0=null;
        Token this_SOURCE_TOKEN_12=null;
        Token this_EQUAL_13=null;
        Token this_TARGET_TOKEN_15=null;
        Token this_EQUAL_16=null;
        Token this_RCURLY_18=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:1752:2: ( (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:1753:2: (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:1753:2: (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:1754:3: this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY
            {
            this_UNREIFIED_RELATIONSHIP_TOKEN_0=(Token)match(input,RULE_UNREIFIED_RELATIONSHIP_TOKEN,FOLLOW_4); 

            			newLeafNode(this_UNREIFIED_RELATIONSHIP_TOKEN_0, grammarAccess.getUnreifiedRelationshipAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:1758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:1759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:1759:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:1760:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUnreifiedRelationshipAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_30); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getUnreifiedRelationshipAccess().getLCURLYTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:1780:3: ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_FUNCTIONAL_TOKEN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1781:4: (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1781:4: (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1782:5: lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN
                    {
                    lv_isFunctional_3_0=(Token)match(input,RULE_FUNCTIONAL_TOKEN,FOLLOW_31); 

                    					newLeafNode(lv_isFunctional_3_0, grammarAccess.getUnreifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isFunctional",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.FUNCTIONAL_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1798:3: ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INVERSE_FUNCTIONAL_TOKEN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1799:4: (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1799:4: (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1800:5: lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN
                    {
                    lv_isInverseFunctional_4_0=(Token)match(input,RULE_INVERSE_FUNCTIONAL_TOKEN,FOLLOW_32); 

                    					newLeafNode(lv_isInverseFunctional_4_0, grammarAccess.getUnreifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isInverseFunctional",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_FUNCTIONAL_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1816:3: ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ESSENTIAL_TOKEN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1817:4: (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1817:4: (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1818:5: lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN
                    {
                    lv_isEssential_5_0=(Token)match(input,RULE_ESSENTIAL_TOKEN,FOLLOW_33); 

                    					newLeafNode(lv_isEssential_5_0, grammarAccess.getUnreifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isEssential",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.ESSENTIAL_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1834:3: ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INVERSE_ESSENTIAL_TOKEN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1835:4: (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1835:4: (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1836:5: lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN
                    {
                    lv_isInverseEssential_6_0=(Token)match(input,RULE_INVERSE_ESSENTIAL_TOKEN,FOLLOW_34); 

                    					newLeafNode(lv_isInverseEssential_6_0, grammarAccess.getUnreifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isInverseEssential",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_ESSENTIAL_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1852:3: ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_SYMMETRIC_TOKEN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1853:4: (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1853:4: (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1854:5: lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN
                    {
                    lv_isSymmetric_7_0=(Token)match(input,RULE_SYMMETRIC_TOKEN,FOLLOW_35); 

                    					newLeafNode(lv_isSymmetric_7_0, grammarAccess.getUnreifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isSymmetric",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.SYMMETRIC_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1870:3: ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ASYMMETRIC_TOKEN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1871:4: (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1871:4: (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1872:5: lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN
                    {
                    lv_isAsymmetric_8_0=(Token)match(input,RULE_ASYMMETRIC_TOKEN,FOLLOW_36); 

                    					newLeafNode(lv_isAsymmetric_8_0, grammarAccess.getUnreifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isAsymmetric",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.ASYMMETRIC_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1888:3: ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_REFLEXIVE_TOKEN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1889:4: (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1889:4: (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1890:5: lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN
                    {
                    lv_isReflexive_9_0=(Token)match(input,RULE_REFLEXIVE_TOKEN,FOLLOW_37); 

                    					newLeafNode(lv_isReflexive_9_0, grammarAccess.getUnreifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isReflexive",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.REFLEXIVE_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1906:3: ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_IRREFLEXIVE_TOKEN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1907:4: (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1907:4: (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1908:5: lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN
                    {
                    lv_isIrreflexive_10_0=(Token)match(input,RULE_IRREFLEXIVE_TOKEN,FOLLOW_38); 

                    					newLeafNode(lv_isIrreflexive_10_0, grammarAccess.getUnreifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isIrreflexive",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRREFLEXIVE_TOKEN");
                    				

                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:1924:3: ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_TRANSITIVE_TOKEN) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:1925:4: (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN )
                    {
                    // InternalOntologicalModelingLanguage.g:1925:4: (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN )
                    // InternalOntologicalModelingLanguage.g:1926:5: lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN
                    {
                    lv_isTransitive_11_0=(Token)match(input,RULE_TRANSITIVE_TOKEN,FOLLOW_26); 

                    					newLeafNode(lv_isTransitive_11_0, grammarAccess.getUnreifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isTransitive",
                    						true,
                    						"jpl.imce.oml.specification.OntologicalModelingLanguage.TRANSITIVE_TOKEN");
                    				

                    }


                    }
                    break;

            }

            this_SOURCE_TOKEN_12=(Token)match(input,RULE_SOURCE_TOKEN,FOLLOW_5); 

            			newLeafNode(this_SOURCE_TOKEN_12, grammarAccess.getUnreifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_12());
            		
            this_EQUAL_13=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			newLeafNode(this_EQUAL_13, grammarAccess.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_13());
            		
            // InternalOntologicalModelingLanguage.g:1950:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:1951:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:1951:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:1952:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnreifiedRelationshipAccess().getSourceEntityCrossReference_14_0());
            				
            pushFollow(FOLLOW_28);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TARGET_TOKEN_15=(Token)match(input,RULE_TARGET_TOKEN,FOLLOW_5); 

            			newLeafNode(this_TARGET_TOKEN_15, grammarAccess.getUnreifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_15());
            		
            this_EQUAL_16=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			newLeafNode(this_EQUAL_16, grammarAccess.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_16());
            		
            // InternalOntologicalModelingLanguage.g:1974:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:1975:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:1975:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:1976:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnreifiedRelationshipAccess().getTargetEntityCrossReference_17_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_18=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_18, grammarAccess.getUnreifiedRelationshipAccess().getRCURLYTerminalRuleCall_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnreifiedRelationship"


    // $ANTLR start "entryRuleScalar"
    // InternalOntologicalModelingLanguage.g:1998:1: entryRuleScalar returns [EObject current=null] : iv_ruleScalar= ruleScalar EOF ;
    public final EObject entryRuleScalar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalar = null;


        try {
            // InternalOntologicalModelingLanguage.g:1998:47: (iv_ruleScalar= ruleScalar EOF )
            // InternalOntologicalModelingLanguage.g:1999:2: iv_ruleScalar= ruleScalar EOF
            {
             newCompositeNode(grammarAccess.getScalarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalar=ruleScalar();

            state._fsp--;

             current =iv_ruleScalar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalar"


    // $ANTLR start "ruleScalar"
    // InternalOntologicalModelingLanguage.g:2005:1: ruleScalar returns [EObject current=null] : (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScalar() throws RecognitionException {
        EObject current = null;

        Token this_SCALAR_TOKEN_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2011:2: ( (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalOntologicalModelingLanguage.g:2012:2: (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalOntologicalModelingLanguage.g:2012:2: (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // InternalOntologicalModelingLanguage.g:2013:3: this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {
            this_SCALAR_TOKEN_0=(Token)match(input,RULE_SCALAR_TOKEN,FOLLOW_4); 

            			newLeafNode(this_SCALAR_TOKEN_0, grammarAccess.getScalarAccess().getSCALAR_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:2017:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:2018:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:2018:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:2019:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalar"


    // $ANTLR start "entryRuleStructure"
    // InternalOntologicalModelingLanguage.g:2039:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalOntologicalModelingLanguage.g:2039:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalOntologicalModelingLanguage.g:2040:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalOntologicalModelingLanguage.g:2046:1: ruleStructure returns [EObject current=null] : (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token this_STRUCTURE_TOKEN_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2052:2: ( (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalOntologicalModelingLanguage.g:2053:2: (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalOntologicalModelingLanguage.g:2053:2: (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // InternalOntologicalModelingLanguage.g:2054:3: this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {
            this_STRUCTURE_TOKEN_0=(Token)match(input,RULE_STRUCTURE_TOKEN,FOLLOW_4); 

            			newLeafNode(this_STRUCTURE_TOKEN_0, grammarAccess.getStructureAccess().getSTRUCTURE_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:2058:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:2059:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:2059:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:2060:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleEntityStructuredDataProperty"
    // InternalOntologicalModelingLanguage.g:2080:1: entryRuleEntityStructuredDataProperty returns [EObject current=null] : iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF ;
    public final EObject entryRuleEntityStructuredDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityStructuredDataProperty = null;


        try {
            // InternalOntologicalModelingLanguage.g:2080:69: (iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF )
            // InternalOntologicalModelingLanguage.g:2081:2: iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF
            {
             newCompositeNode(grammarAccess.getEntityStructuredDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityStructuredDataProperty=ruleEntityStructuredDataProperty();

            state._fsp--;

             current =iv_ruleEntityStructuredDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityStructuredDataProperty"


    // $ANTLR start "ruleEntityStructuredDataProperty"
    // InternalOntologicalModelingLanguage.g:2087:1: ruleEntityStructuredDataProperty returns [EObject current=null] : (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final EObject ruleEntityStructuredDataProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2093:2: ( (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2094:2: (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2094:2: (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2095:3: otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityStructuredDataPropertyAccess().getEntityStructuredDataPropertyKeyword_0());
            		
            // InternalOntologicalModelingLanguage.g:2099:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:2100:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:2100:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:2101:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityStructuredDataPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_39); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getEntityStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			newLeafNode(this_DOMAIN_TOKEN_3, grammarAccess.getEntityStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
            		
            // InternalOntologicalModelingLanguage.g:2125:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2126:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2126:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2127:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityStructuredDataPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			newLeafNode(this_RANGE_TOKEN_5, grammarAccess.getEntityStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
            		
            // InternalOntologicalModelingLanguage.g:2145:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2146:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2146:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2147:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityStructuredDataPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_7, grammarAccess.getEntityStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityStructuredDataProperty"


    // $ANTLR start "entryRuleEntityScalarDataProperty"
    // InternalOntologicalModelingLanguage.g:2169:1: entryRuleEntityScalarDataProperty returns [EObject current=null] : iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF ;
    public final EObject entryRuleEntityScalarDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityScalarDataProperty = null;


        try {
            // InternalOntologicalModelingLanguage.g:2169:65: (iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF )
            // InternalOntologicalModelingLanguage.g:2170:2: iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF
            {
             newCompositeNode(grammarAccess.getEntityScalarDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataProperty=ruleEntityScalarDataProperty();

            state._fsp--;

             current =iv_ruleEntityScalarDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataProperty"


    // $ANTLR start "ruleEntityScalarDataProperty"
    // InternalOntologicalModelingLanguage.g:2176:1: ruleEntityScalarDataProperty returns [EObject current=null] : (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final EObject ruleEntityScalarDataProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2182:2: ( (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2183:2: (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2183:2: (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2184:3: otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityScalarDataPropertyAccess().getEntityScalarDataPropertyKeyword_0());
            		
            // InternalOntologicalModelingLanguage.g:2188:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:2189:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:2189:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:2190:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_39); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getEntityScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			newLeafNode(this_DOMAIN_TOKEN_3, grammarAccess.getEntityScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
            		
            // InternalOntologicalModelingLanguage.g:2214:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2215:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2215:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2216:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyAccess().getDomainEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			newLeafNode(this_RANGE_TOKEN_5, grammarAccess.getEntityScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
            		
            // InternalOntologicalModelingLanguage.g:2234:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2235:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2235:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2236:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_7, grammarAccess.getEntityScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataProperty"


    // $ANTLR start "entryRuleStructuredDataProperty"
    // InternalOntologicalModelingLanguage.g:2258:1: entryRuleStructuredDataProperty returns [EObject current=null] : iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF ;
    public final EObject entryRuleStructuredDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredDataProperty = null;


        try {
            // InternalOntologicalModelingLanguage.g:2258:63: (iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF )
            // InternalOntologicalModelingLanguage.g:2259:2: iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF
            {
             newCompositeNode(grammarAccess.getStructuredDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructuredDataProperty=ruleStructuredDataProperty();

            state._fsp--;

             current =iv_ruleStructuredDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuredDataProperty"


    // $ANTLR start "ruleStructuredDataProperty"
    // InternalOntologicalModelingLanguage.g:2265:1: ruleStructuredDataProperty returns [EObject current=null] : (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final EObject ruleStructuredDataProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2271:2: ( (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2272:2: (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2272:2: (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2273:3: otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStructuredDataPropertyAccess().getStructuredDataPropertyKeyword_0());
            		
            // InternalOntologicalModelingLanguage.g:2277:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:2278:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:2278:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:2279:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructuredDataPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_39); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			newLeafNode(this_DOMAIN_TOKEN_3, grammarAccess.getStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
            		
            // InternalOntologicalModelingLanguage.g:2303:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2304:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2304:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2305:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructuredDataPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStructuredDataPropertyAccess().getDomainStructureCrossReference_4_0());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			newLeafNode(this_RANGE_TOKEN_5, grammarAccess.getStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
            		
            // InternalOntologicalModelingLanguage.g:2323:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2324:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2324:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2325:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructuredDataPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_7, grammarAccess.getStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuredDataProperty"


    // $ANTLR start "entryRuleScalarDataProperty"
    // InternalOntologicalModelingLanguage.g:2347:1: entryRuleScalarDataProperty returns [EObject current=null] : iv_ruleScalarDataProperty= ruleScalarDataProperty EOF ;
    public final EObject entryRuleScalarDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarDataProperty = null;


        try {
            // InternalOntologicalModelingLanguage.g:2347:59: (iv_ruleScalarDataProperty= ruleScalarDataProperty EOF )
            // InternalOntologicalModelingLanguage.g:2348:2: iv_ruleScalarDataProperty= ruleScalarDataProperty EOF
            {
             newCompositeNode(grammarAccess.getScalarDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarDataProperty=ruleScalarDataProperty();

            state._fsp--;

             current =iv_ruleScalarDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarDataProperty"


    // $ANTLR start "ruleScalarDataProperty"
    // InternalOntologicalModelingLanguage.g:2354:1: ruleScalarDataProperty returns [EObject current=null] : (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final EObject ruleScalarDataProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2360:2: ( (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2361:2: (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2361:2: (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2362:3: otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,78,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarDataPropertyAccess().getScalarDataPropertyKeyword_0());
            		
            // InternalOntologicalModelingLanguage.g:2366:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:2367:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:2367:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:2368:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarDataPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_39); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			newLeafNode(this_DOMAIN_TOKEN_3, grammarAccess.getScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
            		
            // InternalOntologicalModelingLanguage.g:2392:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2393:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2393:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2394:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarDataPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getScalarDataPropertyAccess().getDomainStructureCrossReference_4_0());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			newLeafNode(this_RANGE_TOKEN_5, grammarAccess.getScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
            		
            // InternalOntologicalModelingLanguage.g:2412:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2413:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2413:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2414:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarDataPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_7, grammarAccess.getScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarDataProperty"


    // $ANTLR start "entryRuleAnonymousConceptTaxonomyAxiom"
    // InternalOntologicalModelingLanguage.g:2436:1: entryRuleAnonymousConceptTaxonomyAxiom returns [EObject current=null] : iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF ;
    public final EObject entryRuleAnonymousConceptTaxonomyAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousConceptTaxonomyAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2436:70: (iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2437:2: iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF
            {
             newCompositeNode(grammarAccess.getAnonymousConceptTaxonomyAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousConceptTaxonomyAxiom=ruleAnonymousConceptTaxonomyAxiom();

            state._fsp--;

             current =iv_ruleAnonymousConceptTaxonomyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnonymousConceptTaxonomyAxiom"


    // $ANTLR start "ruleAnonymousConceptTaxonomyAxiom"
    // InternalOntologicalModelingLanguage.g:2443:1: ruleAnonymousConceptTaxonomyAxiom returns [EObject current=null] : (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final EObject ruleAnonymousConceptTaxonomyAxiom() throws RecognitionException {
        EObject current = null;

        Token this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2449:2: ( (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2450:2: (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2450:2: (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2451:3: this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {
            this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=(Token)match(input,RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0, grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_41); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:2463:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2464:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2464:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2465:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnonymousConceptTaxonomyAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_4, grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnonymousConceptTaxonomyAxiom"


    // $ANTLR start "entryRuleRootConceptTaxonomyAxiom"
    // InternalOntologicalModelingLanguage.g:2487:1: entryRuleRootConceptTaxonomyAxiom returns [EObject current=null] : iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF ;
    public final EObject entryRuleRootConceptTaxonomyAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootConceptTaxonomyAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2487:65: (iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2488:2: iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF
            {
             newCompositeNode(grammarAccess.getRootConceptTaxonomyAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootConceptTaxonomyAxiom=ruleRootConceptTaxonomyAxiom();

            state._fsp--;

             current =iv_ruleRootConceptTaxonomyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootConceptTaxonomyAxiom"


    // $ANTLR start "ruleRootConceptTaxonomyAxiom"
    // InternalOntologicalModelingLanguage.g:2494:1: ruleRootConceptTaxonomyAxiom returns [EObject current=null] : (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final EObject ruleRootConceptTaxonomyAxiom() throws RecognitionException {
        EObject current = null;

        Token this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2500:2: ( (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2501:2: (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2501:2: (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2502:3: this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {
            this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=(Token)match(input,RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0, grammarAccess.getRootConceptTaxonomyAxiomAccess().getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_42); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getRootConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:2514:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2515:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2515:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2516:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRootConceptTaxonomyAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootConceptCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_4, grammarAccess.getRootConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootConceptTaxonomyAxiom"


    // $ANTLR start "entryRuleSpecificDisjointConceptAxiom"
    // InternalOntologicalModelingLanguage.g:2538:1: entryRuleSpecificDisjointConceptAxiom returns [EObject current=null] : iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF ;
    public final EObject entryRuleSpecificDisjointConceptAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificDisjointConceptAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2538:69: (iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2539:2: iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF
            {
             newCompositeNode(grammarAccess.getSpecificDisjointConceptAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecificDisjointConceptAxiom=ruleSpecificDisjointConceptAxiom();

            state._fsp--;

             current =iv_ruleSpecificDisjointConceptAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecificDisjointConceptAxiom"


    // $ANTLR start "ruleSpecificDisjointConceptAxiom"
    // InternalOntologicalModelingLanguage.g:2545:1: ruleSpecificDisjointConceptAxiom returns [EObject current=null] : (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleSpecificDisjointConceptAxiom() throws RecognitionException {
        EObject current = null;

        Token this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2551:2: ( (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2552:2: (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2552:2: (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2553:3: this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0=(Token)match(input,RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0, grammarAccess.getSpecificDisjointConceptAxiomAccess().getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_41); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getSpecificDisjointConceptAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:2565:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2566:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2566:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2567:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificDisjointConceptAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0());
            				
            pushFollow(FOLLOW_43);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,81,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:2585:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2586:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2586:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2587:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificDisjointConceptAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getSpecificDisjointConceptAxiomAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecificDisjointConceptAxiom"


    // $ANTLR start "entryRuleBundledTerminologyAxiom"
    // InternalOntologicalModelingLanguage.g:2609:1: entryRuleBundledTerminologyAxiom returns [EObject current=null] : iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF ;
    public final EObject entryRuleBundledTerminologyAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundledTerminologyAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2609:64: (iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2610:2: iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF
            {
             newCompositeNode(grammarAccess.getBundledTerminologyAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBundledTerminologyAxiom=ruleBundledTerminologyAxiom();

            state._fsp--;

             current =iv_ruleBundledTerminologyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBundledTerminologyAxiom"


    // $ANTLR start "ruleBundledTerminologyAxiom"
    // InternalOntologicalModelingLanguage.g:2616:1: ruleBundledTerminologyAxiom returns [EObject current=null] : (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final EObject ruleBundledTerminologyAxiom() throws RecognitionException {
        EObject current = null;

        Token this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2622:2: ( (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2623:2: (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2623:2: (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2624:3: this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {
            this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0=(Token)match(input,RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0, grammarAccess.getBundledTerminologyAxiomAccess().getBUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_44); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getBundledTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,82,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:2636:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2637:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2637:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2638:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBundledTerminologyAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_4, grammarAccess.getBundledTerminologyAxiomAccess().getRCURLYTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundledTerminologyAxiom"


    // $ANTLR start "entryRuleConceptDesignationTerminologyAxiom"
    // InternalOntologicalModelingLanguage.g:2660:1: entryRuleConceptDesignationTerminologyAxiom returns [EObject current=null] : iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF ;
    public final EObject entryRuleConceptDesignationTerminologyAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptDesignationTerminologyAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2660:75: (iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2661:2: iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF
            {
             newCompositeNode(grammarAccess.getConceptDesignationTerminologyAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptDesignationTerminologyAxiom=ruleConceptDesignationTerminologyAxiom();

            state._fsp--;

             current =iv_ruleConceptDesignationTerminologyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConceptDesignationTerminologyAxiom"


    // $ANTLR start "ruleConceptDesignationTerminologyAxiom"
    // InternalOntologicalModelingLanguage.g:2667:1: ruleConceptDesignationTerminologyAxiom returns [EObject current=null] : (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleConceptDesignationTerminologyAxiom() throws RecognitionException {
        EObject current = null;

        Token this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2673:2: ( (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2674:2: (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2674:2: (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2675:3: this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0=(Token)match(input,RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_45); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,83,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:2687:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2688:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2688:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2689:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptDesignationTerminologyAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxCrossReference_3_0());
            				
            pushFollow(FOLLOW_46);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,84,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:2707:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2708:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2708:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2709:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptDesignationTerminologyAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConceptDesignationTerminologyAxiom"


    // $ANTLR start "entryRuleTerminologyExtensionAxiom"
    // InternalOntologicalModelingLanguage.g:2731:1: entryRuleTerminologyExtensionAxiom returns [EObject current=null] : iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF ;
    public final EObject entryRuleTerminologyExtensionAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyExtensionAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2731:66: (iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2732:2: iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF
            {
             newCompositeNode(grammarAccess.getTerminologyExtensionAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyExtensionAxiom=ruleTerminologyExtensionAxiom();

            state._fsp--;

             current =iv_ruleTerminologyExtensionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyExtensionAxiom"


    // $ANTLR start "ruleTerminologyExtensionAxiom"
    // InternalOntologicalModelingLanguage.g:2738:1: ruleTerminologyExtensionAxiom returns [EObject current=null] : (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) ) ;
    public final EObject ruleTerminologyExtensionAxiom() throws RecognitionException {
        EObject current = null;

        Token this_EXTENDS_TOKEN_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2744:2: ( (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) ) )
            // InternalOntologicalModelingLanguage.g:2745:2: (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) )
            {
            // InternalOntologicalModelingLanguage.g:2745:2: (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) )
            // InternalOntologicalModelingLanguage.g:2746:3: this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) )
            {
            this_EXTENDS_TOKEN_0=(Token)match(input,RULE_EXTENDS_TOKEN,FOLLOW_27); 

            			newLeafNode(this_EXTENDS_TOKEN_0, grammarAccess.getTerminologyExtensionAxiomAccess().getEXTENDS_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:2750:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2751:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2751:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2752:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminologyExtensionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyExtensionAxiom"


    // $ANTLR start "entryRuleTerminologyNestingAxiom"
    // InternalOntologicalModelingLanguage.g:2770:1: entryRuleTerminologyNestingAxiom returns [EObject current=null] : iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF ;
    public final EObject entryRuleTerminologyNestingAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyNestingAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2770:64: (iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2771:2: iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF
            {
             newCompositeNode(grammarAccess.getTerminologyNestingAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyNestingAxiom=ruleTerminologyNestingAxiom();

            state._fsp--;

             current =iv_ruleTerminologyNestingAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyNestingAxiom"


    // $ANTLR start "ruleTerminologyNestingAxiom"
    // InternalOntologicalModelingLanguage.g:2777:1: ruleTerminologyNestingAxiom returns [EObject current=null] : (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleTerminologyNestingAxiom() throws RecognitionException {
        EObject current = null;

        Token this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2783:2: ( (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2784:2: (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2784:2: (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2785:3: this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0=(Token)match(input,RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0, grammarAccess.getTerminologyNestingAxiomAccess().getTERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_47); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getTerminologyNestingAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,85,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:2797:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2798:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2798:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2799:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminologyNestingAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxCrossReference_3_0());
            				
            pushFollow(FOLLOW_48);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,86,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:2817:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2818:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2818:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2819:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminologyNestingAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextConceptCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getTerminologyNestingAxiomAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyNestingAxiom"


    // $ANTLR start "entryRuleEntityExistentialRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:2841:1: entryRuleEntityExistentialRestrictionAxiom returns [EObject current=null] : iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF ;
    public final EObject entryRuleEntityExistentialRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityExistentialRestrictionAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2841:74: (iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2842:2: iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF
            {
             newCompositeNode(grammarAccess.getEntityExistentialRestrictionAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityExistentialRestrictionAxiom=ruleEntityExistentialRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityExistentialRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityExistentialRestrictionAxiom"


    // $ANTLR start "ruleEntityExistentialRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:2848:1: ruleEntityExistentialRestrictionAxiom returns [EObject current=null] : (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleEntityExistentialRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        Token this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2854:2: ( (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2855:2: (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2855:2: (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2856:3: this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {
            this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_49); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,87,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:2868:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2869:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2869:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2870:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityExistentialRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0());
            				
            pushFollow(FOLLOW_50);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:2888:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2889:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2889:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2890:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityExistentialRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_51);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,89,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainKeyword_6());
            		
            // InternalOntologicalModelingLanguage.g:2908:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2909:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2909:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2910:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityExistentialRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_8, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityExistentialRestrictionAxiom"


    // $ANTLR start "entryRuleEntityUniversalRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:2932:1: entryRuleEntityUniversalRestrictionAxiom returns [EObject current=null] : iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF ;
    public final EObject entryRuleEntityUniversalRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityUniversalRestrictionAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:2932:72: (iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF )
            // InternalOntologicalModelingLanguage.g:2933:2: iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF
            {
             newCompositeNode(grammarAccess.getEntityUniversalRestrictionAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityUniversalRestrictionAxiom=ruleEntityUniversalRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityUniversalRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityUniversalRestrictionAxiom"


    // $ANTLR start "ruleEntityUniversalRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:2939:1: ruleEntityUniversalRestrictionAxiom returns [EObject current=null] : (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleEntityUniversalRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        Token this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:2945:2: ( (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:2946:2: (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:2946:2: (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:2947:3: this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {
            this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_49); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,87,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:2959:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2960:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2960:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2961:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityUniversalRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0());
            				
            pushFollow(FOLLOW_50);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:2979:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:2980:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:2980:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:2981:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityUniversalRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_51);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,89,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainKeyword_6());
            		
            // InternalOntologicalModelingLanguage.g:2999:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3000:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3000:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3001:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityUniversalRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_8, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityUniversalRestrictionAxiom"


    // $ANTLR start "entryRuleAspectSpecializationAxiom"
    // InternalOntologicalModelingLanguage.g:3023:1: entryRuleAspectSpecializationAxiom returns [EObject current=null] : iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF ;
    public final EObject entryRuleAspectSpecializationAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspectSpecializationAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:3023:66: (iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF )
            // InternalOntologicalModelingLanguage.g:3024:2: iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF
            {
             newCompositeNode(grammarAccess.getAspectSpecializationAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAspectSpecializationAxiom=ruleAspectSpecializationAxiom();

            state._fsp--;

             current =iv_ruleAspectSpecializationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAspectSpecializationAxiom"


    // $ANTLR start "ruleAspectSpecializationAxiom"
    // InternalOntologicalModelingLanguage.g:3030:1: ruleAspectSpecializationAxiom returns [EObject current=null] : ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) ) ;
    public final EObject ruleAspectSpecializationAxiom() throws RecognitionException {
        EObject current = null;

        Token this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3036:2: ( ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) ) )
            // InternalOntologicalModelingLanguage.g:3037:2: ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) )
            {
            // InternalOntologicalModelingLanguage.g:3037:2: ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) )
            // InternalOntologicalModelingLanguage.g:3038:3: ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) )
            {
            // InternalOntologicalModelingLanguage.g:3038:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3039:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3039:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3040:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAspectSpecializationAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityEntityCrossReference_0_0());
            				
            pushFollow(FOLLOW_52);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1=(Token)match(input,RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_27); 

            			newLeafNode(this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1, grammarAccess.getAspectSpecializationAxiomAccess().getASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1());
            		
            // InternalOntologicalModelingLanguage.g:3058:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3059:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3059:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3060:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAspectSpecializationAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAspectCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAspectSpecializationAxiom"


    // $ANTLR start "entryRuleConceptSpecializationAxiom"
    // InternalOntologicalModelingLanguage.g:3078:1: entryRuleConceptSpecializationAxiom returns [EObject current=null] : iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF ;
    public final EObject entryRuleConceptSpecializationAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptSpecializationAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:3078:67: (iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF )
            // InternalOntologicalModelingLanguage.g:3079:2: iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF
            {
             newCompositeNode(grammarAccess.getConceptSpecializationAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptSpecializationAxiom=ruleConceptSpecializationAxiom();

            state._fsp--;

             current =iv_ruleConceptSpecializationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConceptSpecializationAxiom"


    // $ANTLR start "ruleConceptSpecializationAxiom"
    // InternalOntologicalModelingLanguage.g:3085:1: ruleConceptSpecializationAxiom returns [EObject current=null] : (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleConceptSpecializationAxiom() throws RecognitionException {
        EObject current = null;

        Token this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3091:2: ( (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3092:2: (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3092:2: (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3093:3: this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0=(Token)match(input,RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0, grammarAccess.getConceptSpecializationAxiomAccess().getCONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_53); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getConceptSpecializationAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,90,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:3105:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3106:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3106:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3107:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptSpecializationAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptConceptCrossReference_3_0());
            				
            pushFollow(FOLLOW_54);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,91,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:3125:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3126:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3126:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3127:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptSpecializationAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptConceptCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getConceptSpecializationAxiomAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConceptSpecializationAxiom"


    // $ANTLR start "entryRuleReifiedRelationshipSpecializationAxiom"
    // InternalOntologicalModelingLanguage.g:3149:1: entryRuleReifiedRelationshipSpecializationAxiom returns [EObject current=null] : iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF ;
    public final EObject entryRuleReifiedRelationshipSpecializationAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReifiedRelationshipSpecializationAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:3149:79: (iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF )
            // InternalOntologicalModelingLanguage.g:3150:2: iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF
            {
             newCompositeNode(grammarAccess.getReifiedRelationshipSpecializationAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationshipSpecializationAxiom=ruleReifiedRelationshipSpecializationAxiom();

            state._fsp--;

             current =iv_ruleReifiedRelationshipSpecializationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationshipSpecializationAxiom"


    // $ANTLR start "ruleReifiedRelationshipSpecializationAxiom"
    // InternalOntologicalModelingLanguage.g:3156:1: ruleReifiedRelationshipSpecializationAxiom returns [EObject current=null] : (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleReifiedRelationshipSpecializationAxiom() throws RecognitionException {
        EObject current = null;

        Token this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3162:2: ( (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3163:2: (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3163:2: (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3164:3: this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0=(Token)match(input,RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_55); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:3176:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3177:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3177:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3178:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipSpecializationAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipCrossReference_3_0());
            				
            pushFollow(FOLLOW_56);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,93,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:3196:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3197:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3197:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3198:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipSpecializationAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationshipSpecializationAxiom"


    // $ANTLR start "entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:3220:1: entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom returns [EObject current=null] : iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF ;
    public final EObject entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:3220:92: (iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF )
            // InternalOntologicalModelingLanguage.g:3221:2: iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF
            {
             newCompositeNode(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom=ruleEntityScalarDataPropertyExistentialRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom"


    // $ANTLR start "ruleEntityScalarDataPropertyExistentialRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:3227:1: ruleEntityScalarDataPropertyExistentialRestrictionAxiom returns [EObject current=null] : (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleEntityScalarDataPropertyExistentialRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        Token this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3233:2: ( (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3234:2: (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3234:2: (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3235:3: this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {
            this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_57); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:3247:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3248:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3248:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3249:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_58);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,95,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:3267:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3268:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3268:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3269:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
            				
            pushFollow(FOLLOW_59);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,96,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionKeyword_6());
            		
            // InternalOntologicalModelingLanguage.g:3287:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3288:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3288:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3289:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_8, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataPropertyExistentialRestrictionAxiom"


    // $ANTLR start "entryRuleEntityScalarDataPropertyParticularRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:3311:1: entryRuleEntityScalarDataPropertyParticularRestrictionAxiom returns [EObject current=null] : iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF ;
    public final EObject entryRuleEntityScalarDataPropertyParticularRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:3311:91: (iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF )
            // InternalOntologicalModelingLanguage.g:3312:2: iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF
            {
             newCompositeNode(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom=ruleEntityScalarDataPropertyParticularRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataPropertyParticularRestrictionAxiom"


    // $ANTLR start "ruleEntityScalarDataPropertyParticularRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:3318:1: ruleEntityScalarDataPropertyParticularRestrictionAxiom returns [EObject current=null] : (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleEntityScalarDataPropertyParticularRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        Token this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_literalValue_7_0=null;
        Token this_RCURLY_8=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3324:2: ( (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3325:2: (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3325:2: (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3326:3: this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY
            {
            this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_57); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:3338:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3339:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3339:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3340:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_58);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,95,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:3358:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3359:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3359:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3360:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
            				
            pushFollow(FOLLOW_60);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,97,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueKeyword_6());
            		
            // InternalOntologicalModelingLanguage.g:3378:3: ( (lv_literalValue_7_0= RULE_STRING ) )
            // InternalOntologicalModelingLanguage.g:3379:4: (lv_literalValue_7_0= RULE_STRING )
            {
            // InternalOntologicalModelingLanguage.g:3379:4: (lv_literalValue_7_0= RULE_STRING )
            // InternalOntologicalModelingLanguage.g:3380:5: lv_literalValue_7_0= RULE_STRING
            {
            lv_literalValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_literalValue_7_0, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"literalValue",
            						lv_literalValue_7_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
            				

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_8, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataPropertyParticularRestrictionAxiom"


    // $ANTLR start "entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:3404:1: entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom returns [EObject current=null] : iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF ;
    public final EObject entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:3404:90: (iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF )
            // InternalOntologicalModelingLanguage.g:3405:2: iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF
            {
             newCompositeNode(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom=ruleEntityScalarDataPropertyUniversalRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom"


    // $ANTLR start "ruleEntityScalarDataPropertyUniversalRestrictionAxiom"
    // InternalOntologicalModelingLanguage.g:3411:1: ruleEntityScalarDataPropertyUniversalRestrictionAxiom returns [EObject current=null] : (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleEntityScalarDataPropertyUniversalRestrictionAxiom() throws RecognitionException {
        EObject current = null;

        Token this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3417:2: ( (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3418:2: (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3418:2: (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3419:3: this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {
            this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_57); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:3431:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3432:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3432:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3433:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_58);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,95,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:3451:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3452:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3452:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3453:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
            				
            pushFollow(FOLLOW_59);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,96,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionKeyword_6());
            		
            // InternalOntologicalModelingLanguage.g:3471:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3472:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3472:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3473:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_8, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataPropertyUniversalRestrictionAxiom"


    // $ANTLR start "entryRuleBinaryScalarRestriction"
    // InternalOntologicalModelingLanguage.g:3495:1: entryRuleBinaryScalarRestriction returns [EObject current=null] : iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF ;
    public final EObject entryRuleBinaryScalarRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryScalarRestriction = null;


        try {
            // InternalOntologicalModelingLanguage.g:3495:64: (iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF )
            // InternalOntologicalModelingLanguage.g:3496:2: iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF
            {
             newCompositeNode(grammarAccess.getBinaryScalarRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryScalarRestriction=ruleBinaryScalarRestriction();

            state._fsp--;

             current =iv_ruleBinaryScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryScalarRestriction"


    // $ANTLR start "ruleBinaryScalarRestriction"
    // InternalOntologicalModelingLanguage.g:3502:1: ruleBinaryScalarRestriction returns [EObject current=null] : (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY ) ;
    public final EObject ruleBinaryScalarRestriction() throws RecognitionException {
        EObject current = null;

        Token this_BINARY_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token lv_length_4_0=null;
        Token otherlv_5=null;
        Token lv_minLength_6_0=null;
        Token otherlv_7=null;
        Token lv_maxLength_8_0=null;
        Token otherlv_9=null;
        Token this_RCURLY_11=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3508:2: ( (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3509:2: (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3509:2: (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3510:3: this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY
            {
            this_BINARY_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_BINARY_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_BINARY_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getBinaryScalarRestrictionAccess().getBINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:3514:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:3515:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:3515:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:3516:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBinaryScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_61); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getBinaryScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:3536:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==98) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3537:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getBinaryScalarRestrictionAccess().getLengthKeyword_3_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3541:4: ( (lv_length_4_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:3542:5: (lv_length_4_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:3542:5: (lv_length_4_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:3543:6: lv_length_4_0= RULE_INT
                    {
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_63); 

                    						newLeafNode(lv_length_4_0, grammarAccess.getBinaryScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_4_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:3560:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==99) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3561:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,99,FOLLOW_62); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthKeyword_4_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3565:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:3566:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:3566:5: (lv_minLength_6_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:3567:6: lv_minLength_6_0= RULE_INT
                    {
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_64); 

                    						newLeafNode(lv_minLength_6_0, grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minLength",
                    							lv_minLength_6_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:3584:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==100) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3585:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,100,FOLLOW_62); 

                    				newLeafNode(otherlv_7, grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthKeyword_5_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3589:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:3590:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:3590:5: (lv_maxLength_8_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:3591:6: lv_maxLength_8_0= RULE_INT
                    {
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_maxLength_8_0, grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxLength",
                    							lv_maxLength_8_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeKeyword_6());
            		
            // InternalOntologicalModelingLanguage.g:3612:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3613:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3613:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3614:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_7_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_11=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_11, grammarAccess.getBinaryScalarRestrictionAccess().getRCURLYTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryScalarRestriction"


    // $ANTLR start "entryRuleIRIScalarRestriction"
    // InternalOntologicalModelingLanguage.g:3636:1: entryRuleIRIScalarRestriction returns [EObject current=null] : iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF ;
    public final EObject entryRuleIRIScalarRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIRIScalarRestriction = null;


        try {
            // InternalOntologicalModelingLanguage.g:3636:61: (iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF )
            // InternalOntologicalModelingLanguage.g:3637:2: iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF
            {
             newCompositeNode(grammarAccess.getIRIScalarRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIRIScalarRestriction=ruleIRIScalarRestriction();

            state._fsp--;

             current =iv_ruleIRIScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIRIScalarRestriction"


    // $ANTLR start "ruleIRIScalarRestriction"
    // InternalOntologicalModelingLanguage.g:3643:1: ruleIRIScalarRestriction returns [EObject current=null] : (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
    public final EObject ruleIRIScalarRestriction() throws RecognitionException {
        EObject current = null;

        Token this_IRI_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token lv_length_4_0=null;
        Token otherlv_5=null;
        Token lv_minLength_6_0=null;
        Token otherlv_7=null;
        Token lv_maxLength_8_0=null;
        Token otherlv_9=null;
        Token lv_pattern_10_0=null;
        Token otherlv_11=null;
        Token this_RCURLY_13=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3649:2: ( (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3650:2: (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3650:2: (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3651:3: this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {
            this_IRI_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_IRI_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_IRI_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getIRIScalarRestrictionAccess().getIRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:3655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:3656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:3656:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:3657:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIRIScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_65); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getIRIScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:3677:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==98) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3678:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getIRIScalarRestrictionAccess().getLengthKeyword_3_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3682:4: ( (lv_length_4_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:3683:5: (lv_length_4_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:3683:5: (lv_length_4_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:3684:6: lv_length_4_0= RULE_INT
                    {
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_66); 

                    						newLeafNode(lv_length_4_0, grammarAccess.getIRIScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_4_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:3701:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==99) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3702:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,99,FOLLOW_62); 

                    				newLeafNode(otherlv_5, grammarAccess.getIRIScalarRestrictionAccess().getMinLengthKeyword_4_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3706:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:3707:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:3707:5: (lv_minLength_6_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:3708:6: lv_minLength_6_0= RULE_INT
                    {
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_67); 

                    						newLeafNode(lv_minLength_6_0, grammarAccess.getIRIScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minLength",
                    							lv_minLength_6_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:3725:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==100) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3726:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,100,FOLLOW_62); 

                    				newLeafNode(otherlv_7, grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthKeyword_5_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3730:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:3731:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:3731:5: (lv_maxLength_8_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:3732:6: lv_maxLength_8_0= RULE_INT
                    {
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_68); 

                    						newLeafNode(lv_maxLength_8_0, grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxLength",
                    							lv_maxLength_8_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:3749:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==101) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3750:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,101,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getIRIScalarRestrictionAccess().getPatternKeyword_6_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3754:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:3755:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:3755:5: (lv_pattern_10_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:3756:6: lv_pattern_10_0= RULE_STRING
                    {
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						newLeafNode(lv_pattern_10_0, grammarAccess.getIRIScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pattern",
                    							lv_pattern_10_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeKeyword_7());
            		
            // InternalOntologicalModelingLanguage.g:3777:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3778:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3778:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3779:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_13, grammarAccess.getIRIScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIRIScalarRestriction"


    // $ANTLR start "entryRuleNumericScalarRestriction"
    // InternalOntologicalModelingLanguage.g:3801:1: entryRuleNumericScalarRestriction returns [EObject current=null] : iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF ;
    public final EObject entryRuleNumericScalarRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericScalarRestriction = null;


        try {
            // InternalOntologicalModelingLanguage.g:3801:65: (iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF )
            // InternalOntologicalModelingLanguage.g:3802:2: iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF
            {
             newCompositeNode(grammarAccess.getNumericScalarRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericScalarRestriction=ruleNumericScalarRestriction();

            state._fsp--;

             current =iv_ruleNumericScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericScalarRestriction"


    // $ANTLR start "ruleNumericScalarRestriction"
    // InternalOntologicalModelingLanguage.g:3808:1: ruleNumericScalarRestriction returns [EObject current=null] : (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
    public final EObject ruleNumericScalarRestriction() throws RecognitionException {
        EObject current = null;

        Token this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token lv_minInclusive_4_0=null;
        Token otherlv_5=null;
        Token lv_maxInclusive_6_0=null;
        Token otherlv_7=null;
        Token lv_minExclusive_8_0=null;
        Token otherlv_9=null;
        Token lv_maxExclusive_10_0=null;
        Token otherlv_11=null;
        Token this_RCURLY_13=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3814:2: ( (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3815:2: (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3815:2: (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3816:3: this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {
            this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getNumericScalarRestrictionAccess().getNUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:3820:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:3821:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:3821:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:3822:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNumericScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_69); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getNumericScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:3842:3: (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==102) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3843:4: otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,102,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveKeyword_3_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3847:4: ( (lv_minInclusive_4_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:3848:5: (lv_minInclusive_4_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:3848:5: (lv_minInclusive_4_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:3849:6: lv_minInclusive_4_0= RULE_STRING
                    {
                    lv_minInclusive_4_0=(Token)match(input,RULE_STRING,FOLLOW_70); 

                    						newLeafNode(lv_minInclusive_4_0, grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minInclusive",
                    							lv_minInclusive_4_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:3866:3: (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==103) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3867:4: otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,103,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveKeyword_4_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3871:4: ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:3872:5: (lv_maxInclusive_6_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:3872:5: (lv_maxInclusive_6_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:3873:6: lv_maxInclusive_6_0= RULE_STRING
                    {
                    lv_maxInclusive_6_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

                    						newLeafNode(lv_maxInclusive_6_0, grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxInclusive",
                    							lv_maxInclusive_6_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:3890:3: (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==104) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3891:4: otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,104,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveKeyword_5_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3895:4: ( (lv_minExclusive_8_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:3896:5: (lv_minExclusive_8_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:3896:5: (lv_minExclusive_8_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:3897:6: lv_minExclusive_8_0= RULE_STRING
                    {
                    lv_minExclusive_8_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    						newLeafNode(lv_minExclusive_8_0, grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minExclusive",
                    							lv_minExclusive_8_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:3914:3: (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==105) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:3915:4: otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,105,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveKeyword_6_0());
                    			
                    // InternalOntologicalModelingLanguage.g:3919:4: ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:3920:5: (lv_maxExclusive_10_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:3920:5: (lv_maxExclusive_10_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:3921:6: lv_maxExclusive_10_0= RULE_STRING
                    {
                    lv_maxExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						newLeafNode(lv_maxExclusive_10_0, grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxExclusive",
                    							lv_maxExclusive_10_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeKeyword_7());
            		
            // InternalOntologicalModelingLanguage.g:3942:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:3943:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:3943:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:3944:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_13, grammarAccess.getNumericScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericScalarRestriction"


    // $ANTLR start "entryRulePlainLiteralScalarRestriction"
    // InternalOntologicalModelingLanguage.g:3966:1: entryRulePlainLiteralScalarRestriction returns [EObject current=null] : iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF ;
    public final EObject entryRulePlainLiteralScalarRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainLiteralScalarRestriction = null;


        try {
            // InternalOntologicalModelingLanguage.g:3966:70: (iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF )
            // InternalOntologicalModelingLanguage.g:3967:2: iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF
            {
             newCompositeNode(grammarAccess.getPlainLiteralScalarRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainLiteralScalarRestriction=rulePlainLiteralScalarRestriction();

            state._fsp--;

             current =iv_rulePlainLiteralScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlainLiteralScalarRestriction"


    // $ANTLR start "rulePlainLiteralScalarRestriction"
    // InternalOntologicalModelingLanguage.g:3973:1: rulePlainLiteralScalarRestriction returns [EObject current=null] : (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY ) ;
    public final EObject rulePlainLiteralScalarRestriction() throws RecognitionException {
        EObject current = null;

        Token this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token lv_length_4_0=null;
        Token otherlv_5=null;
        Token lv_minLength_6_0=null;
        Token otherlv_7=null;
        Token lv_maxLength_8_0=null;
        Token otherlv_9=null;
        Token lv_pattern_10_0=null;
        Token otherlv_11=null;
        Token lv_langRange_12_0=null;
        Token otherlv_13=null;
        Token this_RCURLY_15=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:3979:2: ( (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:3980:2: (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:3980:2: (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:3981:3: this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY
            {
            this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:3985:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:3986:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:3986:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:3987:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_73); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:4007:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==98) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4008:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthKeyword_3_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4012:4: ( (lv_length_4_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:4013:5: (lv_length_4_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:4013:5: (lv_length_4_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:4014:6: lv_length_4_0= RULE_INT
                    {
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_74); 

                    						newLeafNode(lv_length_4_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_4_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4031:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==99) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4032:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,99,FOLLOW_62); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthKeyword_4_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4036:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:4037:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:4037:5: (lv_minLength_6_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:4038:6: lv_minLength_6_0= RULE_INT
                    {
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_75); 

                    						newLeafNode(lv_minLength_6_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minLength",
                    							lv_minLength_6_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4055:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==100) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4056:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,100,FOLLOW_62); 

                    				newLeafNode(otherlv_7, grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthKeyword_5_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4060:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:4061:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:4061:5: (lv_maxLength_8_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:4062:6: lv_maxLength_8_0= RULE_INT
                    {
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_76); 

                    						newLeafNode(lv_maxLength_8_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxLength",
                    							lv_maxLength_8_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4079:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==101) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4080:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,101,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternKeyword_6_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4084:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:4085:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:4085:5: (lv_pattern_10_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:4086:6: lv_pattern_10_0= RULE_STRING
                    {
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_77); 

                    						newLeafNode(lv_pattern_10_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pattern",
                    							lv_pattern_10_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4103:3: (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==106) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4104:4: otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,106,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeKeyword_7_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4108:4: ( (lv_langRange_12_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:4109:5: (lv_langRange_12_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:4109:5: (lv_langRange_12_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:4110:6: lv_langRange_12_0= RULE_STRING
                    {
                    lv_langRange_12_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						newLeafNode(lv_langRange_12_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"langRange",
                    							lv_langRange_12_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_13, grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeKeyword_8());
            		
            // InternalOntologicalModelingLanguage.g:4131:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:4132:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:4132:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:4133:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_9_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_15=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_15, grammarAccess.getPlainLiteralScalarRestrictionAccess().getRCURLYTerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlainLiteralScalarRestriction"


    // $ANTLR start "entryRuleScalarOneOfRestriction"
    // InternalOntologicalModelingLanguage.g:4155:1: entryRuleScalarOneOfRestriction returns [EObject current=null] : iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF ;
    public final EObject entryRuleScalarOneOfRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarOneOfRestriction = null;


        try {
            // InternalOntologicalModelingLanguage.g:4155:63: (iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF )
            // InternalOntologicalModelingLanguage.g:4156:2: iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF
            {
             newCompositeNode(grammarAccess.getScalarOneOfRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarOneOfRestriction=ruleScalarOneOfRestriction();

            state._fsp--;

             current =iv_ruleScalarOneOfRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarOneOfRestriction"


    // $ANTLR start "ruleScalarOneOfRestriction"
    // InternalOntologicalModelingLanguage.g:4162:1: ruleScalarOneOfRestriction returns [EObject current=null] : (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) ;
    public final EObject ruleScalarOneOfRestriction() throws RecognitionException {
        EObject current = null;

        Token this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token this_RCURLY_5=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:4168:2: ( (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:4169:2: (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:4169:2: (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:4170:3: this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY
            {
            this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0=(Token)match(input,RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0, grammarAccess.getScalarOneOfRestrictionAccess().getSCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:4174:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:4175:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:4175:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:4176:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScalarOneOfRestrictionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarOneOfRestrictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_50); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getScalarOneOfRestrictionAccess().getLCURLYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeKeyword_3());
            		
            // InternalOntologicalModelingLanguage.g:4200:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:4201:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:4201:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:4202:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarOneOfRestrictionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_5=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_5, grammarAccess.getScalarOneOfRestrictionAccess().getRCURLYTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarOneOfRestriction"


    // $ANTLR start "entryRuleScalarOneOfLiteralAxiom"
    // InternalOntologicalModelingLanguage.g:4224:1: entryRuleScalarOneOfLiteralAxiom returns [EObject current=null] : iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF ;
    public final EObject entryRuleScalarOneOfLiteralAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarOneOfLiteralAxiom = null;


        try {
            // InternalOntologicalModelingLanguage.g:4224:64: (iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF )
            // InternalOntologicalModelingLanguage.g:4225:2: iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF
            {
             newCompositeNode(grammarAccess.getScalarOneOfLiteralAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarOneOfLiteralAxiom=ruleScalarOneOfLiteralAxiom();

            state._fsp--;

             current =iv_ruleScalarOneOfLiteralAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarOneOfLiteralAxiom"


    // $ANTLR start "ruleScalarOneOfLiteralAxiom"
    // InternalOntologicalModelingLanguage.g:4231:1: ruleScalarOneOfLiteralAxiom returns [EObject current=null] : (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleScalarOneOfLiteralAxiom() throws RecognitionException {
        EObject current = null;

        Token this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:4237:2: ( (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:4238:2: (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:4238:2: (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:4239:3: this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0=(Token)match(input,RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN,FOLLOW_9); 

            			newLeafNode(this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0, grammarAccess.getScalarOneOfLiteralAxiomAccess().getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_78); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getScalarOneOfLiteralAxiomAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,107,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:4251:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalOntologicalModelingLanguage.g:4252:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalOntologicalModelingLanguage.g:4252:4: (lv_value_3_0= RULE_STRING )
            // InternalOntologicalModelingLanguage.g:4253:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

            					newLeafNode(lv_value_3_0, grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarOneOfLiteralAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,108,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:4273:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:4274:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:4274:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:4275:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarOneOfLiteralAxiomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getScalarOneOfLiteralAxiomAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarOneOfLiteralAxiom"


    // $ANTLR start "entryRuleStringScalarRestriction"
    // InternalOntologicalModelingLanguage.g:4297:1: entryRuleStringScalarRestriction returns [EObject current=null] : iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF ;
    public final EObject entryRuleStringScalarRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringScalarRestriction = null;


        try {
            // InternalOntologicalModelingLanguage.g:4297:64: (iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF )
            // InternalOntologicalModelingLanguage.g:4298:2: iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF
            {
             newCompositeNode(grammarAccess.getStringScalarRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringScalarRestriction=ruleStringScalarRestriction();

            state._fsp--;

             current =iv_ruleStringScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringScalarRestriction"


    // $ANTLR start "ruleStringScalarRestriction"
    // InternalOntologicalModelingLanguage.g:4304:1: ruleStringScalarRestriction returns [EObject current=null] : (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
    public final EObject ruleStringScalarRestriction() throws RecognitionException {
        EObject current = null;

        Token this_STRING_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token lv_length_4_0=null;
        Token otherlv_5=null;
        Token lv_minLength_6_0=null;
        Token otherlv_7=null;
        Token lv_maxLength_8_0=null;
        Token otherlv_9=null;
        Token lv_pattern_10_0=null;
        Token otherlv_11=null;
        Token this_RCURLY_13=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:4310:2: ( (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:4311:2: (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:4311:2: (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:4312:3: this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {
            this_STRING_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_STRING_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_STRING_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getStringScalarRestrictionAccess().getSTRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:4316:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:4317:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:4317:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:4318:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_65); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getStringScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:4338:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==98) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4339:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringScalarRestrictionAccess().getLengthKeyword_3_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4343:4: ( (lv_length_4_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:4344:5: (lv_length_4_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:4344:5: (lv_length_4_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:4345:6: lv_length_4_0= RULE_INT
                    {
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_66); 

                    						newLeafNode(lv_length_4_0, grammarAccess.getStringScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_4_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4362:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==99) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4363:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,99,FOLLOW_62); 

                    				newLeafNode(otherlv_5, grammarAccess.getStringScalarRestrictionAccess().getMinLengthKeyword_4_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4367:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:4368:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:4368:5: (lv_minLength_6_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:4369:6: lv_minLength_6_0= RULE_INT
                    {
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_67); 

                    						newLeafNode(lv_minLength_6_0, grammarAccess.getStringScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minLength",
                    							lv_minLength_6_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4386:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==100) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4387:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,100,FOLLOW_62); 

                    				newLeafNode(otherlv_7, grammarAccess.getStringScalarRestrictionAccess().getMaxLengthKeyword_5_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4391:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // InternalOntologicalModelingLanguage.g:4392:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // InternalOntologicalModelingLanguage.g:4392:5: (lv_maxLength_8_0= RULE_INT )
                    // InternalOntologicalModelingLanguage.g:4393:6: lv_maxLength_8_0= RULE_INT
                    {
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_68); 

                    						newLeafNode(lv_maxLength_8_0, grammarAccess.getStringScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxLength",
                    							lv_maxLength_8_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4410:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==101) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4411:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,101,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getStringScalarRestrictionAccess().getPatternKeyword_6_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4415:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:4416:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:4416:5: (lv_pattern_10_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:4417:6: lv_pattern_10_0= RULE_STRING
                    {
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						newLeafNode(lv_pattern_10_0, grammarAccess.getStringScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pattern",
                    							lv_pattern_10_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeKeyword_7());
            		
            // InternalOntologicalModelingLanguage.g:4438:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:4439:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:4439:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:4440:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_13, grammarAccess.getStringScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringScalarRestriction"


    // $ANTLR start "entryRuleSynonymScalarRestriction"
    // InternalOntologicalModelingLanguage.g:4462:1: entryRuleSynonymScalarRestriction returns [EObject current=null] : iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF ;
    public final EObject entryRuleSynonymScalarRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynonymScalarRestriction = null;


        try {
            // InternalOntologicalModelingLanguage.g:4462:65: (iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF )
            // InternalOntologicalModelingLanguage.g:4463:2: iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF
            {
             newCompositeNode(grammarAccess.getSynonymScalarRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSynonymScalarRestriction=ruleSynonymScalarRestriction();

            state._fsp--;

             current =iv_ruleSynonymScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSynonymScalarRestriction"


    // $ANTLR start "ruleSynonymScalarRestriction"
    // InternalOntologicalModelingLanguage.g:4469:1: ruleSynonymScalarRestriction returns [EObject current=null] : (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) ;
    public final EObject ruleSynonymScalarRestriction() throws RecognitionException {
        EObject current = null;

        Token this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token this_RCURLY_5=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:4475:2: ( (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:4476:2: (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:4476:2: (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:4477:3: this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY
            {
            this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getSynonymScalarRestrictionAccess().getSYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:4481:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:4482:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:4482:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:4483:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSynonymScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSynonymScalarRestrictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_50); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getSynonymScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeKeyword_3());
            		
            // InternalOntologicalModelingLanguage.g:4507:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:4508:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:4508:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:4509:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSynonymScalarRestrictionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_5=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_5, grammarAccess.getSynonymScalarRestrictionAccess().getRCURLYTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSynonymScalarRestriction"


    // $ANTLR start "entryRuleTimeScalarRestriction"
    // InternalOntologicalModelingLanguage.g:4531:1: entryRuleTimeScalarRestriction returns [EObject current=null] : iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF ;
    public final EObject entryRuleTimeScalarRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeScalarRestriction = null;


        try {
            // InternalOntologicalModelingLanguage.g:4531:62: (iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF )
            // InternalOntologicalModelingLanguage.g:4532:2: iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF
            {
             newCompositeNode(grammarAccess.getTimeScalarRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeScalarRestriction=ruleTimeScalarRestriction();

            state._fsp--;

             current =iv_ruleTimeScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeScalarRestriction"


    // $ANTLR start "ruleTimeScalarRestriction"
    // InternalOntologicalModelingLanguage.g:4538:1: ruleTimeScalarRestriction returns [EObject current=null] : (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
    public final EObject ruleTimeScalarRestriction() throws RecognitionException {
        EObject current = null;

        Token this_TIME_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token lv_minInclusive_4_0=null;
        Token otherlv_5=null;
        Token lv_maxInclusive_6_0=null;
        Token otherlv_7=null;
        Token lv_minExclusive_8_0=null;
        Token otherlv_9=null;
        Token lv_maxExclusive_10_0=null;
        Token otherlv_11=null;
        Token this_RCURLY_13=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:4544:2: ( (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:4545:2: (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:4545:2: (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:4546:3: this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {
            this_TIME_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_TIME_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			newLeafNode(this_TIME_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getTimeScalarRestrictionAccess().getTIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:4550:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntologicalModelingLanguage.g:4551:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntologicalModelingLanguage.g:4551:4: (lv_name_1_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:4552:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTimeScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
            				

            }


            }

            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_69); 

            			newLeafNode(this_LCURLY_2, grammarAccess.getTimeScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:4572:3: (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==102) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4573:4: otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,102,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveKeyword_3_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4577:4: ( (lv_minInclusive_4_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:4578:5: (lv_minInclusive_4_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:4578:5: (lv_minInclusive_4_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:4579:6: lv_minInclusive_4_0= RULE_STRING
                    {
                    lv_minInclusive_4_0=(Token)match(input,RULE_STRING,FOLLOW_70); 

                    						newLeafNode(lv_minInclusive_4_0, grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minInclusive",
                    							lv_minInclusive_4_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4596:3: (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==103) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4597:4: otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,103,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveKeyword_4_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4601:4: ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:4602:5: (lv_maxInclusive_6_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:4602:5: (lv_maxInclusive_6_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:4603:6: lv_maxInclusive_6_0= RULE_STRING
                    {
                    lv_maxInclusive_6_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

                    						newLeafNode(lv_maxInclusive_6_0, grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxInclusive",
                    							lv_maxInclusive_6_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4620:3: (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==104) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4621:4: otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,104,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveKeyword_5_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4625:4: ( (lv_minExclusive_8_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:4626:5: (lv_minExclusive_8_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:4626:5: (lv_minExclusive_8_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:4627:6: lv_minExclusive_8_0= RULE_STRING
                    {
                    lv_minExclusive_8_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    						newLeafNode(lv_minExclusive_8_0, grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minExclusive",
                    							lv_minExclusive_8_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:4644:3: (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==105) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:4645:4: otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,105,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveKeyword_6_0());
                    			
                    // InternalOntologicalModelingLanguage.g:4649:4: ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    // InternalOntologicalModelingLanguage.g:4650:5: (lv_maxExclusive_10_0= RULE_STRING )
                    {
                    // InternalOntologicalModelingLanguage.g:4650:5: (lv_maxExclusive_10_0= RULE_STRING )
                    // InternalOntologicalModelingLanguage.g:4651:6: lv_maxExclusive_10_0= RULE_STRING
                    {
                    lv_maxExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						newLeafNode(lv_maxExclusive_10_0, grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxExclusive",
                    							lv_maxExclusive_10_0,
                    							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,88,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeKeyword_7());
            		
            // InternalOntologicalModelingLanguage.g:4672:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:4673:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:4673:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:4674:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_13, grammarAccess.getTimeScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeScalarRestriction"


    // $ANTLR start "entryRuleDescriptionBox"
    // InternalOntologicalModelingLanguage.g:4696:1: entryRuleDescriptionBox returns [EObject current=null] : iv_ruleDescriptionBox= ruleDescriptionBox EOF ;
    public final EObject entryRuleDescriptionBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionBox = null;


        try {
            // InternalOntologicalModelingLanguage.g:4696:55: (iv_ruleDescriptionBox= ruleDescriptionBox EOF )
            // InternalOntologicalModelingLanguage.g:4697:2: iv_ruleDescriptionBox= ruleDescriptionBox EOF
            {
             newCompositeNode(grammarAccess.getDescriptionBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionBox=ruleDescriptionBox();

            state._fsp--;

             current =iv_ruleDescriptionBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionBox"


    // $ANTLR start "ruleDescriptionBox"
    // InternalOntologicalModelingLanguage.g:4703:1: ruleDescriptionBox returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY ) ;
    public final EObject ruleDescriptionBox() throws RecognitionException {
        EObject current = null;

        Token this_DESCRIPTION_BOX_TOKEN_1=null;
        Token lv_iri_2_0=null;
        Token this_LCURLY_3=null;
        Token this_RCURLY_12=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_closedWorldDefinitions_5_0 = null;

        EObject lv_descriptionBoxRefinements_6_0 = null;

        EObject lv_conceptInstances_7_0 = null;

        EObject lv_reifiedRelationshipInstances_8_0 = null;

        EObject lv_reifiedRelationshipInstanceDomains_9_0 = null;

        EObject lv_reifiedRelationshipInstanceRanges_10_0 = null;

        EObject lv_unreifiedRelationshipInstanceTuples_11_0 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:4709:2: ( ( ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:4710:2: ( ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:4710:2: ( ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:4711:3: ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY
            {
            // InternalOntologicalModelingLanguage.g:4711:3: ( (lv_kind_0_0= ruleDescriptionKind ) )
            // InternalOntologicalModelingLanguage.g:4712:4: (lv_kind_0_0= ruleDescriptionKind )
            {
            // InternalOntologicalModelingLanguage.g:4712:4: (lv_kind_0_0= ruleDescriptionKind )
            // InternalOntologicalModelingLanguage.g:4713:5: lv_kind_0_0= ruleDescriptionKind
            {

            					newCompositeNode(grammarAccess.getDescriptionBoxAccess().getKindDescriptionKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_80);
            lv_kind_0_0=ruleDescriptionKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.DescriptionKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DESCRIPTION_BOX_TOKEN_1=(Token)match(input,RULE_DESCRIPTION_BOX_TOKEN,FOLLOW_6); 

            			newLeafNode(this_DESCRIPTION_BOX_TOKEN_1, grammarAccess.getDescriptionBoxAccess().getDESCRIPTION_BOX_TOKENTerminalRuleCall_1());
            		
            // InternalOntologicalModelingLanguage.g:4734:3: ( (lv_iri_2_0= RULE_IRI ) )
            // InternalOntologicalModelingLanguage.g:4735:4: (lv_iri_2_0= RULE_IRI )
            {
            // InternalOntologicalModelingLanguage.g:4735:4: (lv_iri_2_0= RULE_IRI )
            // InternalOntologicalModelingLanguage.g:4736:5: lv_iri_2_0= RULE_IRI
            {
            lv_iri_2_0=(Token)match(input,RULE_IRI,FOLLOW_9); 

            					newLeafNode(lv_iri_2_0, grammarAccess.getDescriptionBoxAccess().getIriIRITerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iri",
            						lv_iri_2_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
            				

            }


            }

            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_81); 

            			newLeafNode(this_LCURLY_3, grammarAccess.getDescriptionBoxAccess().getLCURLYTerminalRuleCall_3());
            		
            // InternalOntologicalModelingLanguage.g:4756:3: ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )*
            loop64:
            do {
                int alt64=9;
                switch ( input.LA(1) ) {
                case RULE_ANNOTATION_TOKEN:
                    {
                    alt64=1;
                    }
                    break;
                case RULE_EXTENDS_TOKEN:
                    {
                    alt64=2;
                    }
                    break;
                case RULE_REFINES_TOKEN:
                    {
                    alt64=3;
                    }
                    break;
                case 115:
                    {
                    alt64=4;
                    }
                    break;
                case 117:
                    {
                    alt64=5;
                    }
                    break;
                case 119:
                    {
                    alt64=6;
                    }
                    break;
                case 121:
                    {
                    alt64=7;
                    }
                    break;
                case 122:
                    {
                    alt64=8;
                    }
                    break;

                }

                switch (alt64) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:4757:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4757:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // InternalOntologicalModelingLanguage.g:4758:5: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4758:5: (lv_annotations_4_0= ruleAnnotation )
            	    // InternalOntologicalModelingLanguage.g:4759:6: lv_annotations_4_0= ruleAnnotation
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_annotations_4_0=ruleAnnotation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            	    						}
            	    						add(
            	    							current,
            	    							"annotations",
            	    							lv_annotations_4_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.Annotation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntologicalModelingLanguage.g:4777:4: ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4777:4: ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) )
            	    // InternalOntologicalModelingLanguage.g:4778:5: (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4778:5: (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions )
            	    // InternalOntologicalModelingLanguage.g:4779:6: lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_closedWorldDefinitions_5_0=ruleDescriptionBoxExtendsClosedWorldDefinitions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            	    						}
            	    						add(
            	    							current,
            	    							"closedWorldDefinitions",
            	    							lv_closedWorldDefinitions_5_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.DescriptionBoxExtendsClosedWorldDefinitions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOntologicalModelingLanguage.g:4797:4: ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4797:4: ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) )
            	    // InternalOntologicalModelingLanguage.g:4798:5: (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4798:5: (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement )
            	    // InternalOntologicalModelingLanguage.g:4799:6: lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getDescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_descriptionBoxRefinements_6_0=ruleDescriptionBoxRefinement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            	    						}
            	    						add(
            	    							current,
            	    							"descriptionBoxRefinements",
            	    							lv_descriptionBoxRefinements_6_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.DescriptionBoxRefinement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOntologicalModelingLanguage.g:4817:4: ( (lv_conceptInstances_7_0= ruleConceptInstance ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4817:4: ( (lv_conceptInstances_7_0= ruleConceptInstance ) )
            	    // InternalOntologicalModelingLanguage.g:4818:5: (lv_conceptInstances_7_0= ruleConceptInstance )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4818:5: (lv_conceptInstances_7_0= ruleConceptInstance )
            	    // InternalOntologicalModelingLanguage.g:4819:6: lv_conceptInstances_7_0= ruleConceptInstance
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getConceptInstancesConceptInstanceParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_conceptInstances_7_0=ruleConceptInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conceptInstances",
            	    							lv_conceptInstances_7_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.ConceptInstance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOntologicalModelingLanguage.g:4837:4: ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4837:4: ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) )
            	    // InternalOntologicalModelingLanguage.g:4838:5: (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4838:5: (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance )
            	    // InternalOntologicalModelingLanguage.g:4839:6: lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_reifiedRelationshipInstances_8_0=ruleReifiedRelationshipInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reifiedRelationshipInstances",
            	    							lv_reifiedRelationshipInstances_8_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.ReifiedRelationshipInstance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalOntologicalModelingLanguage.g:4857:4: ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4857:4: ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) )
            	    // InternalOntologicalModelingLanguage.g:4858:5: (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4858:5: (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain )
            	    // InternalOntologicalModelingLanguage.g:4859:6: lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_reifiedRelationshipInstanceDomains_9_0=ruleReifiedRelationshipInstanceDomain();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reifiedRelationshipInstanceDomains",
            	    							lv_reifiedRelationshipInstanceDomains_9_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.ReifiedRelationshipInstanceDomain");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalOntologicalModelingLanguage.g:4877:4: ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4877:4: ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) )
            	    // InternalOntologicalModelingLanguage.g:4878:5: (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4878:5: (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange )
            	    // InternalOntologicalModelingLanguage.g:4879:6: lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_reifiedRelationshipInstanceRanges_10_0=ruleReifiedRelationshipInstanceRange();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reifiedRelationshipInstanceRanges",
            	    							lv_reifiedRelationshipInstanceRanges_10_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.ReifiedRelationshipInstanceRange");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalOntologicalModelingLanguage.g:4897:4: ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4897:4: ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) )
            	    // InternalOntologicalModelingLanguage.g:4898:5: (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple )
            	    {
            	    // InternalOntologicalModelingLanguage.g:4898:5: (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple )
            	    // InternalOntologicalModelingLanguage.g:4899:6: lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple
            	    {

            	    						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_unreifiedRelationshipInstanceTuples_11_0=ruleUnreifiedRelationshipInstanceTuple();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
            	    						}
            	    						add(
            	    							current,
            	    							"unreifiedRelationshipInstanceTuples",
            	    							lv_unreifiedRelationshipInstanceTuples_11_0,
            	    							"jpl.imce.oml.specification.OntologicalModelingLanguage.UnreifiedRelationshipInstanceTuple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            this_RCURLY_12=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_12, grammarAccess.getDescriptionBoxAccess().getRCURLYTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionBox"


    // $ANTLR start "entryRuleDescriptionBoxExtendsClosedWorldDefinitions"
    // InternalOntologicalModelingLanguage.g:4925:1: entryRuleDescriptionBoxExtendsClosedWorldDefinitions returns [EObject current=null] : iv_ruleDescriptionBoxExtendsClosedWorldDefinitions= ruleDescriptionBoxExtendsClosedWorldDefinitions EOF ;
    public final EObject entryRuleDescriptionBoxExtendsClosedWorldDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionBoxExtendsClosedWorldDefinitions = null;


        try {
            // InternalOntologicalModelingLanguage.g:4925:84: (iv_ruleDescriptionBoxExtendsClosedWorldDefinitions= ruleDescriptionBoxExtendsClosedWorldDefinitions EOF )
            // InternalOntologicalModelingLanguage.g:4926:2: iv_ruleDescriptionBoxExtendsClosedWorldDefinitions= ruleDescriptionBoxExtendsClosedWorldDefinitions EOF
            {
             newCompositeNode(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionBoxExtendsClosedWorldDefinitions=ruleDescriptionBoxExtendsClosedWorldDefinitions();

            state._fsp--;

             current =iv_ruleDescriptionBoxExtendsClosedWorldDefinitions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionBoxExtendsClosedWorldDefinitions"


    // $ANTLR start "ruleDescriptionBoxExtendsClosedWorldDefinitions"
    // InternalOntologicalModelingLanguage.g:4932:1: ruleDescriptionBoxExtendsClosedWorldDefinitions returns [EObject current=null] : (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) ) ;
    public final EObject ruleDescriptionBoxExtendsClosedWorldDefinitions() throws RecognitionException {
        EObject current = null;

        Token this_EXTENDS_TOKEN_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:4938:2: ( (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) ) )
            // InternalOntologicalModelingLanguage.g:4939:2: (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) )
            {
            // InternalOntologicalModelingLanguage.g:4939:2: (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) )
            // InternalOntologicalModelingLanguage.g:4940:3: this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) )
            {
            this_EXTENDS_TOKEN_0=(Token)match(input,RULE_EXTENDS_TOKEN,FOLLOW_27); 

            			newLeafNode(this_EXTENDS_TOKEN_0, grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getEXTENDS_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:4944:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:4945:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:4945:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:4946:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionBoxExtendsClosedWorldDefinitions"


    // $ANTLR start "entryRuleDescriptionBoxRefinement"
    // InternalOntologicalModelingLanguage.g:4964:1: entryRuleDescriptionBoxRefinement returns [EObject current=null] : iv_ruleDescriptionBoxRefinement= ruleDescriptionBoxRefinement EOF ;
    public final EObject entryRuleDescriptionBoxRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionBoxRefinement = null;


        try {
            // InternalOntologicalModelingLanguage.g:4964:65: (iv_ruleDescriptionBoxRefinement= ruleDescriptionBoxRefinement EOF )
            // InternalOntologicalModelingLanguage.g:4965:2: iv_ruleDescriptionBoxRefinement= ruleDescriptionBoxRefinement EOF
            {
             newCompositeNode(grammarAccess.getDescriptionBoxRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionBoxRefinement=ruleDescriptionBoxRefinement();

            state._fsp--;

             current =iv_ruleDescriptionBoxRefinement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionBoxRefinement"


    // $ANTLR start "ruleDescriptionBoxRefinement"
    // InternalOntologicalModelingLanguage.g:4971:1: ruleDescriptionBoxRefinement returns [EObject current=null] : (this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) ) ) ;
    public final EObject ruleDescriptionBoxRefinement() throws RecognitionException {
        EObject current = null;

        Token this_REFINES_TOKEN_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:4977:2: ( (this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) ) ) )
            // InternalOntologicalModelingLanguage.g:4978:2: (this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) ) )
            {
            // InternalOntologicalModelingLanguage.g:4978:2: (this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) ) )
            // InternalOntologicalModelingLanguage.g:4979:3: this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) )
            {
            this_REFINES_TOKEN_0=(Token)match(input,RULE_REFINES_TOKEN,FOLLOW_27); 

            			newLeafNode(this_REFINES_TOKEN_0, grammarAccess.getDescriptionBoxRefinementAccess().getREFINES_TOKENTerminalRuleCall_0());
            		
            // InternalOntologicalModelingLanguage.g:4983:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:4984:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:4984:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:4985:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionBoxRefinementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionBoxRefinement"


    // $ANTLR start "entryRuleScalarDataPropertyValue"
    // InternalOntologicalModelingLanguage.g:5003:1: entryRuleScalarDataPropertyValue returns [EObject current=null] : iv_ruleScalarDataPropertyValue= ruleScalarDataPropertyValue EOF ;
    public final EObject entryRuleScalarDataPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarDataPropertyValue = null;


        try {
            // InternalOntologicalModelingLanguage.g:5003:64: (iv_ruleScalarDataPropertyValue= ruleScalarDataPropertyValue EOF )
            // InternalOntologicalModelingLanguage.g:5004:2: iv_ruleScalarDataPropertyValue= ruleScalarDataPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getScalarDataPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarDataPropertyValue=ruleScalarDataPropertyValue();

            state._fsp--;

             current =iv_ruleScalarDataPropertyValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarDataPropertyValue"


    // $ANTLR start "ruleScalarDataPropertyValue"
    // InternalOntologicalModelingLanguage.g:5010:1: ruleScalarDataPropertyValue returns [EObject current=null] : (otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleScalarDataPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;
        AntlrDatatypeRuleToken lv_scalarPropertyValue_3_0 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5016:2: ( (otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:5017:2: (otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:5017:2: (otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:5018:3: otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,109,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyValueKeyword_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_82); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getScalarDataPropertyValueAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,110,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:5030:3: ( (lv_scalarPropertyValue_3_0= ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5031:4: (lv_scalarPropertyValue_3_0= ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5031:4: (lv_scalarPropertyValue_3_0= ruleReference )
            // InternalOntologicalModelingLanguage.g:5032:5: lv_scalarPropertyValue_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_83);
            lv_scalarPropertyValue_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScalarDataPropertyValueRule());
            					}
            					set(
            						current,
            						"scalarPropertyValue",
            						lv_scalarPropertyValue_3_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,78,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:5053:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5054:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5054:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5055:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarDataPropertyValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getScalarDataPropertyValueAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarDataPropertyValue"


    // $ANTLR start "entryRuleStructuredDataPropertyValue"
    // InternalOntologicalModelingLanguage.g:5077:1: entryRuleStructuredDataPropertyValue returns [EObject current=null] : iv_ruleStructuredDataPropertyValue= ruleStructuredDataPropertyValue EOF ;
    public final EObject entryRuleStructuredDataPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuredDataPropertyValue = null;


        try {
            // InternalOntologicalModelingLanguage.g:5077:68: (iv_ruleStructuredDataPropertyValue= ruleStructuredDataPropertyValue EOF )
            // InternalOntologicalModelingLanguage.g:5078:2: iv_ruleStructuredDataPropertyValue= ruleStructuredDataPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getStructuredDataPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructuredDataPropertyValue=ruleStructuredDataPropertyValue();

            state._fsp--;

             current =iv_ruleStructuredDataPropertyValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuredDataPropertyValue"


    // $ANTLR start "ruleStructuredDataPropertyValue"
    // InternalOntologicalModelingLanguage.g:5084:1: ruleStructuredDataPropertyValue returns [EObject current=null] : (otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleStructuredDataPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;
        EObject lv_structuredPropertyTuple_5_0 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5090:2: ( (otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:5091:2: (otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:5091:2: (otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:5092:3: otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,111,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyValueKeyword_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_84); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getStructuredDataPropertyValueAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,77,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:5104:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5105:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5105:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5106:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructuredDataPropertyValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureCrossReference_3_0());
            				
            pushFollow(FOLLOW_85);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,112,FOLLOW_86); 

            			newLeafNode(otherlv_4, grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleKeyword_4());
            		
            // InternalOntologicalModelingLanguage.g:5124:3: ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) )
            // InternalOntologicalModelingLanguage.g:5125:4: (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple )
            {
            // InternalOntologicalModelingLanguage.g:5125:4: (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple )
            // InternalOntologicalModelingLanguage.g:5126:5: lv_structuredPropertyTuple_5_0= ruleDataStructureTuple
            {

            					newCompositeNode(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleDataStructureTupleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_structuredPropertyTuple_5_0=ruleDataStructureTuple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructuredDataPropertyValueRule());
            					}
            					set(
            						current,
            						"structuredPropertyTuple",
            						lv_structuredPropertyTuple_5_0,
            						"jpl.imce.oml.specification.OntologicalModelingLanguage.DataStructureTuple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getStructuredDataPropertyValueAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuredDataPropertyValue"


    // $ANTLR start "entryRuleDataStructureTuple"
    // InternalOntologicalModelingLanguage.g:5151:1: entryRuleDataStructureTuple returns [EObject current=null] : iv_ruleDataStructureTuple= ruleDataStructureTuple EOF ;
    public final EObject entryRuleDataStructureTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataStructureTuple = null;


        try {
            // InternalOntologicalModelingLanguage.g:5151:59: (iv_ruleDataStructureTuple= ruleDataStructureTuple EOF )
            // InternalOntologicalModelingLanguage.g:5152:2: iv_ruleDataStructureTuple= ruleDataStructureTuple EOF
            {
             newCompositeNode(grammarAccess.getDataStructureTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataStructureTuple=ruleDataStructureTuple();

            state._fsp--;

             current =iv_ruleDataStructureTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataStructureTuple"


    // $ANTLR start "ruleDataStructureTuple"
    // InternalOntologicalModelingLanguage.g:5158:1: ruleDataStructureTuple returns [EObject current=null] : (otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final EObject ruleDataStructureTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5164:2: ( (otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:5165:2: (otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:5165:2: (otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:5166:3: otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,113,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDataStructureTupleAccess().getDataStructureTupleKeyword_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_87); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getDataStructureTupleAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,114,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getDataStructureTupleAccess().getDataStructureTypeKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:5178:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5179:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5179:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5180:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataStructureTupleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeStructureCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_4, grammarAccess.getDataStructureTupleAccess().getRCURLYTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataStructureTuple"


    // $ANTLR start "entryRuleConceptInstance"
    // InternalOntologicalModelingLanguage.g:5202:1: entryRuleConceptInstance returns [EObject current=null] : iv_ruleConceptInstance= ruleConceptInstance EOF ;
    public final EObject entryRuleConceptInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptInstance = null;


        try {
            // InternalOntologicalModelingLanguage.g:5202:56: (iv_ruleConceptInstance= ruleConceptInstance EOF )
            // InternalOntologicalModelingLanguage.g:5203:2: iv_ruleConceptInstance= ruleConceptInstance EOF
            {
             newCompositeNode(grammarAccess.getConceptInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptInstance=ruleConceptInstance();

            state._fsp--;

             current =iv_ruleConceptInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConceptInstance"


    // $ANTLR start "ruleConceptInstance"
    // InternalOntologicalModelingLanguage.g:5209:1: ruleConceptInstance returns [EObject current=null] : (otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final EObject ruleConceptInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5215:2: ( (otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:5216:2: (otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:5216:2: (otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:5217:3: otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,115,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptInstanceAccess().getConceptInstanceKeyword_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_88); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getConceptInstanceAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,116,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:5229:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5230:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5230:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5231:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierConceptCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_4, grammarAccess.getConceptInstanceAccess().getRCURLYTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConceptInstance"


    // $ANTLR start "entryRuleReifiedRelationshipInstance"
    // InternalOntologicalModelingLanguage.g:5253:1: entryRuleReifiedRelationshipInstance returns [EObject current=null] : iv_ruleReifiedRelationshipInstance= ruleReifiedRelationshipInstance EOF ;
    public final EObject entryRuleReifiedRelationshipInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReifiedRelationshipInstance = null;


        try {
            // InternalOntologicalModelingLanguage.g:5253:68: (iv_ruleReifiedRelationshipInstance= ruleReifiedRelationshipInstance EOF )
            // InternalOntologicalModelingLanguage.g:5254:2: iv_ruleReifiedRelationshipInstance= ruleReifiedRelationshipInstance EOF
            {
             newCompositeNode(grammarAccess.getReifiedRelationshipInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationshipInstance=ruleReifiedRelationshipInstance();

            state._fsp--;

             current =iv_ruleReifiedRelationshipInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationshipInstance"


    // $ANTLR start "ruleReifiedRelationshipInstance"
    // InternalOntologicalModelingLanguage.g:5260:1: ruleReifiedRelationshipInstance returns [EObject current=null] : (otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final EObject ruleReifiedRelationshipInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5266:2: ( (otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:5267:2: (otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:5267:2: (otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:5268:3: otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,117,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReifiedRelationshipInstanceAccess().getReifiedRelationshipInstanceKeyword_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_89); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getReifiedRelationshipInstanceAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,118,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:5280:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5281:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5281:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5282:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_4, grammarAccess.getReifiedRelationshipInstanceAccess().getRCURLYTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationshipInstance"


    // $ANTLR start "entryRuleReifiedRelationshipInstanceDomain"
    // InternalOntologicalModelingLanguage.g:5304:1: entryRuleReifiedRelationshipInstanceDomain returns [EObject current=null] : iv_ruleReifiedRelationshipInstanceDomain= ruleReifiedRelationshipInstanceDomain EOF ;
    public final EObject entryRuleReifiedRelationshipInstanceDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReifiedRelationshipInstanceDomain = null;


        try {
            // InternalOntologicalModelingLanguage.g:5304:74: (iv_ruleReifiedRelationshipInstanceDomain= ruleReifiedRelationshipInstanceDomain EOF )
            // InternalOntologicalModelingLanguage.g:5305:2: iv_ruleReifiedRelationshipInstanceDomain= ruleReifiedRelationshipInstanceDomain EOF
            {
             newCompositeNode(grammarAccess.getReifiedRelationshipInstanceDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationshipInstanceDomain=ruleReifiedRelationshipInstanceDomain();

            state._fsp--;

             current =iv_ruleReifiedRelationshipInstanceDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationshipInstanceDomain"


    // $ANTLR start "ruleReifiedRelationshipInstanceDomain"
    // InternalOntologicalModelingLanguage.g:5311:1: ruleReifiedRelationshipInstanceDomain returns [EObject current=null] : (otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleReifiedRelationshipInstanceDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_DOMAIN_TOKEN_4=null;
        Token this_RCURLY_6=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5317:2: ( (otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:5318:2: (otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:5318:2: (otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:5319:3: otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,119,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceDomainKeyword_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_90); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,120,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:5331:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5332:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5332:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5333:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipInstanceDomainRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0());
            				
            pushFollow(FOLLOW_39);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DOMAIN_TOKEN_4=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			newLeafNode(this_DOMAIN_TOKEN_4, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDOMAIN_TOKENTerminalRuleCall_4());
            		
            // InternalOntologicalModelingLanguage.g:5351:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5352:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5352:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5353:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipInstanceDomainRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationshipInstanceDomain"


    // $ANTLR start "entryRuleReifiedRelationshipInstanceRange"
    // InternalOntologicalModelingLanguage.g:5375:1: entryRuleReifiedRelationshipInstanceRange returns [EObject current=null] : iv_ruleReifiedRelationshipInstanceRange= ruleReifiedRelationshipInstanceRange EOF ;
    public final EObject entryRuleReifiedRelationshipInstanceRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReifiedRelationshipInstanceRange = null;


        try {
            // InternalOntologicalModelingLanguage.g:5375:73: (iv_ruleReifiedRelationshipInstanceRange= ruleReifiedRelationshipInstanceRange EOF )
            // InternalOntologicalModelingLanguage.g:5376:2: iv_ruleReifiedRelationshipInstanceRange= ruleReifiedRelationshipInstanceRange EOF
            {
             newCompositeNode(grammarAccess.getReifiedRelationshipInstanceRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationshipInstanceRange=ruleReifiedRelationshipInstanceRange();

            state._fsp--;

             current =iv_ruleReifiedRelationshipInstanceRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationshipInstanceRange"


    // $ANTLR start "ruleReifiedRelationshipInstanceRange"
    // InternalOntologicalModelingLanguage.g:5382:1: ruleReifiedRelationshipInstanceRange returns [EObject current=null] : (otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final EObject ruleReifiedRelationshipInstanceRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RANGE_TOKEN_4=null;
        Token this_RCURLY_6=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5388:2: ( (otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:5389:2: (otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:5389:2: (otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:5390:3: otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,121,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceRangeKeyword_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_90); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getLCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,120,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceKeyword_2());
            		
            // InternalOntologicalModelingLanguage.g:5402:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5403:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5403:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5404:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipInstanceRangeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RANGE_TOKEN_4=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			newLeafNode(this_RANGE_TOKEN_4, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRANGE_TOKENTerminalRuleCall_4());
            		
            // InternalOntologicalModelingLanguage.g:5422:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5423:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5423:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5424:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReifiedRelationshipInstanceRangeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_6, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRCURLYTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationshipInstanceRange"


    // $ANTLR start "entryRuleUnreifiedRelationshipInstanceTuple"
    // InternalOntologicalModelingLanguage.g:5446:1: entryRuleUnreifiedRelationshipInstanceTuple returns [EObject current=null] : iv_ruleUnreifiedRelationshipInstanceTuple= ruleUnreifiedRelationshipInstanceTuple EOF ;
    public final EObject entryRuleUnreifiedRelationshipInstanceTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnreifiedRelationshipInstanceTuple = null;


        try {
            // InternalOntologicalModelingLanguage.g:5446:75: (iv_ruleUnreifiedRelationshipInstanceTuple= ruleUnreifiedRelationshipInstanceTuple EOF )
            // InternalOntologicalModelingLanguage.g:5447:2: iv_ruleUnreifiedRelationshipInstanceTuple= ruleUnreifiedRelationshipInstanceTuple EOF
            {
             newCompositeNode(grammarAccess.getUnreifiedRelationshipInstanceTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnreifiedRelationshipInstanceTuple=ruleUnreifiedRelationshipInstanceTuple();

            state._fsp--;

             current =iv_ruleUnreifiedRelationshipInstanceTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnreifiedRelationshipInstanceTuple"


    // $ANTLR start "ruleUnreifiedRelationshipInstanceTuple"
    // InternalOntologicalModelingLanguage.g:5453:1: ruleUnreifiedRelationshipInstanceTuple returns [EObject current=null] : (otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleUnreifiedRelationshipInstanceTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token this_UNREIFIED_RELATIONSHIP_TOKEN_2=null;
        Token this_DOMAIN_TOKEN_4=null;
        Token this_RANGE_TOKEN_6=null;
        Token this_RCURLY_8=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5459:2: ( (otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // InternalOntologicalModelingLanguage.g:5460:2: (otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // InternalOntologicalModelingLanguage.g:5460:2: (otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // InternalOntologicalModelingLanguage.g:5461:3: otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,122,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipInstanceTupleKeyword_0());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_91); 

            			newLeafNode(this_LCURLY_1, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getLCURLYTerminalRuleCall_1());
            		
            this_UNREIFIED_RELATIONSHIP_TOKEN_2=(Token)match(input,RULE_UNREIFIED_RELATIONSHIP_TOKEN,FOLLOW_27); 

            			newLeafNode(this_UNREIFIED_RELATIONSHIP_TOKEN_2, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2());
            		
            // InternalOntologicalModelingLanguage.g:5473:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5474:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5474:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5475:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnreifiedRelationshipInstanceTupleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0());
            				
            pushFollow(FOLLOW_39);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DOMAIN_TOKEN_4=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			newLeafNode(this_DOMAIN_TOKEN_4, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDOMAIN_TOKENTerminalRuleCall_4());
            		
            // InternalOntologicalModelingLanguage.g:5493:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5494:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5494:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5495:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnreifiedRelationshipInstanceTupleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RANGE_TOKEN_6=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			newLeafNode(this_RANGE_TOKEN_6, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRANGE_TOKENTerminalRuleCall_6());
            		
            // InternalOntologicalModelingLanguage.g:5513:3: ( ( ruleReference ) )
            // InternalOntologicalModelingLanguage.g:5514:4: ( ruleReference )
            {
            // InternalOntologicalModelingLanguage.g:5514:4: ( ruleReference )
            // InternalOntologicalModelingLanguage.g:5515:5: ruleReference
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnreifiedRelationshipInstanceTupleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceCrossReference_7_0());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			newLeafNode(this_RCURLY_8, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRCURLYTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnreifiedRelationshipInstanceTuple"


    // $ANTLR start "entryRuleReference"
    // InternalOntologicalModelingLanguage.g:5537:1: entryRuleReference returns [String current=null] : iv_ruleReference= ruleReference EOF ;
    public final String entryRuleReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReference = null;


        try {
            // InternalOntologicalModelingLanguage.g:5537:49: (iv_ruleReference= ruleReference EOF )
            // InternalOntologicalModelingLanguage.g:5538:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalOntologicalModelingLanguage.g:5544:1: ruleReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IRI_0= RULE_IRI | this_QNAME_1= ruleQNAME ) ;
    public final AntlrDatatypeRuleToken ruleReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IRI_0=null;
        AntlrDatatypeRuleToken this_QNAME_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5550:2: ( (this_IRI_0= RULE_IRI | this_QNAME_1= ruleQNAME ) )
            // InternalOntologicalModelingLanguage.g:5551:2: (this_IRI_0= RULE_IRI | this_QNAME_1= ruleQNAME )
            {
            // InternalOntologicalModelingLanguage.g:5551:2: (this_IRI_0= RULE_IRI | this_QNAME_1= ruleQNAME )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_IRI) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5552:3: this_IRI_0= RULE_IRI
                    {
                    this_IRI_0=(Token)match(input,RULE_IRI,FOLLOW_2); 

                    			current.merge(this_IRI_0);
                    		

                    			newLeafNode(this_IRI_0, grammarAccess.getReferenceAccess().getIRITerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:5560:3: this_QNAME_1= ruleQNAME
                    {

                    			newCompositeNode(grammarAccess.getReferenceAccess().getQNAMEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QNAME_1=ruleQNAME();

                    state._fsp--;


                    			current.merge(this_QNAME_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleQNAME"
    // InternalOntologicalModelingLanguage.g:5574:1: entryRuleQNAME returns [String current=null] : iv_ruleQNAME= ruleQNAME EOF ;
    public final String entryRuleQNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNAME = null;


        try {
            // InternalOntologicalModelingLanguage.g:5574:45: (iv_ruleQNAME= ruleQNAME EOF )
            // InternalOntologicalModelingLanguage.g:5575:2: iv_ruleQNAME= ruleQNAME EOF
            {
             newCompositeNode(grammarAccess.getQNAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQNAME=ruleQNAME();

            state._fsp--;

             current =iv_ruleQNAME.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQNAME"


    // $ANTLR start "ruleQNAME"
    // InternalOntologicalModelingLanguage.g:5581:1: ruleQNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ABBREV_IRI_0= ruleABBREV_IRI | this_ValidID_1= ruleValidID ) ;
    public final AntlrDatatypeRuleToken ruleQNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ABBREV_IRI_0 = null;

        AntlrDatatypeRuleToken this_ValidID_1 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5587:2: ( (this_ABBREV_IRI_0= ruleABBREV_IRI | this_ValidID_1= ruleValidID ) )
            // InternalOntologicalModelingLanguage.g:5588:2: (this_ABBREV_IRI_0= ruleABBREV_IRI | this_ValidID_1= ruleValidID )
            {
            // InternalOntologicalModelingLanguage.g:5588:2: (this_ABBREV_IRI_0= ruleABBREV_IRI | this_ValidID_1= ruleValidID )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==123) ) {
                    alt66=1;
                }
                else if ( (LA66_1==EOF||(LA66_1>=RULE_IRI && LA66_1<=RULE_ANNOTATION_TOKEN)||LA66_1==RULE_RCURLY||(LA66_1>=RULE_ASPECT_TOKEN && LA66_1<=RULE_REIFIED_RELATIONSHIP_TOKEN)||(LA66_1>=RULE_TARGET_TOKEN && LA66_1<=RULE_BINARY_SCALAR_RESTRICTION_TOKEN)||(LA66_1>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA66_1<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)||LA66_1==RULE_REFINES_TOKEN||(LA66_1>=75 && LA66_1<=78)||LA66_1==81||LA66_1==84||LA66_1==86||(LA66_1>=88 && LA66_1<=89)||LA66_1==91||LA66_1==93||(LA66_1>=95 && LA66_1<=97)||LA66_1==112||LA66_1==115||LA66_1==117||LA66_1==119||(LA66_1>=121 && LA66_1<=122)) ) {
                    alt66=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5589:3: this_ABBREV_IRI_0= ruleABBREV_IRI
                    {

                    			newCompositeNode(grammarAccess.getQNAMEAccess().getABBREV_IRIParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ABBREV_IRI_0=ruleABBREV_IRI();

                    state._fsp--;


                    			current.merge(this_ABBREV_IRI_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:5600:3: this_ValidID_1= ruleValidID
                    {

                    			newCompositeNode(grammarAccess.getQNAMEAccess().getValidIDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValidID_1=ruleValidID();

                    state._fsp--;


                    			current.merge(this_ValidID_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQNAME"


    // $ANTLR start "entryRuleABBREV_IRI"
    // InternalOntologicalModelingLanguage.g:5614:1: entryRuleABBREV_IRI returns [String current=null] : iv_ruleABBREV_IRI= ruleABBREV_IRI EOF ;
    public final String entryRuleABBREV_IRI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABBREV_IRI = null;


        try {
            // InternalOntologicalModelingLanguage.g:5614:50: (iv_ruleABBREV_IRI= ruleABBREV_IRI EOF )
            // InternalOntologicalModelingLanguage.g:5615:2: iv_ruleABBREV_IRI= ruleABBREV_IRI EOF
            {
             newCompositeNode(grammarAccess.getABBREV_IRIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleABBREV_IRI=ruleABBREV_IRI();

            state._fsp--;

             current =iv_ruleABBREV_IRI.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleABBREV_IRI"


    // $ANTLR start "ruleABBREV_IRI"
    // InternalOntologicalModelingLanguage.g:5621:1: ruleABBREV_IRI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= ':' this_ValidID_2= ruleValidID ) ;
    public final AntlrDatatypeRuleToken ruleABBREV_IRI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5627:2: ( (this_ValidID_0= ruleValidID kw= ':' this_ValidID_2= ruleValidID ) )
            // InternalOntologicalModelingLanguage.g:5628:2: (this_ValidID_0= ruleValidID kw= ':' this_ValidID_2= ruleValidID )
            {
            // InternalOntologicalModelingLanguage.g:5628:2: (this_ValidID_0= ruleValidID kw= ':' this_ValidID_2= ruleValidID )
            // InternalOntologicalModelingLanguage.g:5629:3: this_ValidID_0= ruleValidID kw= ':' this_ValidID_2= ruleValidID
            {

            			newCompositeNode(grammarAccess.getABBREV_IRIAccess().getValidIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_92);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            			current.merge(this_ValidID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,123,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getABBREV_IRIAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getABBREV_IRIAccess().getValidIDParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ValidID_2=ruleValidID();

            state._fsp--;


            			current.merge(this_ValidID_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleABBREV_IRI"


    // $ANTLR start "entryRuleValidID"
    // InternalOntologicalModelingLanguage.g:5658:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalOntologicalModelingLanguage.g:5658:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalOntologicalModelingLanguage.g:5659:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalOntologicalModelingLanguage.g:5665:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5671:2: (this_ID_0= RULE_ID )
            // InternalOntologicalModelingLanguage.g:5672:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleTerminologyGraphKind"
    // InternalOntologicalModelingLanguage.g:5682:1: ruleTerminologyGraphKind returns [Enumerator current=null] : ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) ) ;
    public final Enumerator ruleTerminologyGraphKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5688:2: ( ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) ) )
            // InternalOntologicalModelingLanguage.g:5689:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) )
            {
            // InternalOntologicalModelingLanguage.g:5689:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==124) ) {
                alt67=1;
            }
            else if ( (LA67_0==125) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5690:3: (enumLiteral_0= 'open' )
                    {
                    // InternalOntologicalModelingLanguage.g:5690:3: (enumLiteral_0= 'open' )
                    // InternalOntologicalModelingLanguage.g:5691:4: enumLiteral_0= 'open'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getTerminologyGraphKindAccess().getOpenWorldDefinitionsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTerminologyGraphKindAccess().getOpenWorldDefinitionsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:5698:3: (enumLiteral_1= 'closed' )
                    {
                    // InternalOntologicalModelingLanguage.g:5698:3: (enumLiteral_1= 'closed' )
                    // InternalOntologicalModelingLanguage.g:5699:4: enumLiteral_1= 'closed'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getTerminologyGraphKindAccess().getClosedWorldDesignationsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTerminologyGraphKindAccess().getClosedWorldDesignationsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyGraphKind"


    // $ANTLR start "ruleDescriptionKind"
    // InternalOntologicalModelingLanguage.g:5709:1: ruleDescriptionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'partial' ) ) ;
    public final Enumerator ruleDescriptionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOntologicalModelingLanguage.g:5715:2: ( ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'partial' ) ) )
            // InternalOntologicalModelingLanguage.g:5716:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'partial' ) )
            {
            // InternalOntologicalModelingLanguage.g:5716:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'partial' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==126) ) {
                alt68=1;
            }
            else if ( (LA68_0==127) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5717:3: (enumLiteral_0= 'final' )
                    {
                    // InternalOntologicalModelingLanguage.g:5717:3: (enumLiteral_0= 'final' )
                    // InternalOntologicalModelingLanguage.g:5718:4: enumLiteral_0= 'final'
                    {
                    enumLiteral_0=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getDescriptionKindAccess().getFinalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDescriptionKindAccess().getFinalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:5725:3: (enumLiteral_1= 'partial' )
                    {
                    // InternalOntologicalModelingLanguage.g:5725:3: (enumLiteral_1= 'partial' )
                    // InternalOntologicalModelingLanguage.g:5726:4: enumLiteral_1= 'partial'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getDescriptionKindAccess().getPartialEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDescriptionKindAccess().getPartialEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L,0xF000000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1FEFDF038003E8C0L,0x0000000000007800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x1FEFDFF38003E8C0L,0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000FFC0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000FF80000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000FF00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000FE00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000027FC0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000027F80000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000027F00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000027E00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000027C00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000027800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000027000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000026000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000001C01000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000001801000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000001001000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000003C01000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000003801000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000003001000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000002001000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x000003C001000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000038001000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000030001000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000020001000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000043C01000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000043801000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000043001000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000042001000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000040001000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x4000020000000880L,0x06A8000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});

}