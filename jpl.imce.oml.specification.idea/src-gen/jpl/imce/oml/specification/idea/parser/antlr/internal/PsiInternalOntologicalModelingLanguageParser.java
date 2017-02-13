package jpl.imce.oml.specification.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import jpl.imce.oml.specification.idea.lang.OntologicalModelingLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalOntologicalModelingLanguageParser extends AbstractPsiAntlrParser {
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


        public PsiInternalOntologicalModelingLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalOntologicalModelingLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalOntologicalModelingLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalOntologicalModelingLanguage.g"; }



    	protected OntologicalModelingLanguageGrammarAccess grammarAccess;

    	protected OntologicalModelingLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalOntologicalModelingLanguageParser(PsiBuilder builder, TokenStream input, OntologicalModelingLanguageElementTypeProvider elementTypeProvider, OntologicalModelingLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
    		this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "TerminologyExtent";
    	}




    // $ANTLR start "entryRuleTerminologyExtent"
    // PsiInternalOntologicalModelingLanguage.g:65:1: entryRuleTerminologyExtent returns [Boolean current=false] : iv_ruleTerminologyExtent= ruleTerminologyExtent EOF ;
    public final Boolean entryRuleTerminologyExtent() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyExtent = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:65:59: (iv_ruleTerminologyExtent= ruleTerminologyExtent EOF )
            // PsiInternalOntologicalModelingLanguage.g:66:2: iv_ruleTerminologyExtent= ruleTerminologyExtent EOF
            {
             markComposite(elementTypeProvider.getTerminologyExtentElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyExtent=ruleTerminologyExtent();

            state._fsp--;

             current =iv_ruleTerminologyExtent; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyExtent"


    // $ANTLR start "ruleTerminologyExtent"
    // PsiInternalOntologicalModelingLanguage.g:72:1: ruleTerminologyExtent returns [Boolean current=false] : ( () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )* ) ;
    public final Boolean ruleTerminologyExtent() throws RecognitionException {
        Boolean current = false;

        Boolean lv_annotationProperties_1_0 = null;

        Boolean lv_terminologyGraphs_2_0 = null;

        Boolean lv_bundles_3_0 = null;

        Boolean lv_descriptions_4_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:73:1: ( ( () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )* ) )
            // PsiInternalOntologicalModelingLanguage.g:74:2: ( () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )* )
            {
            // PsiInternalOntologicalModelingLanguage.g:74:2: ( () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )* )
            // PsiInternalOntologicalModelingLanguage.g:75:3: () ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )*
            {
            // PsiInternalOntologicalModelingLanguage.g:75:3: ()
            // PsiInternalOntologicalModelingLanguage.g:76:4: 
            {

            				precedeComposite(elementTypeProvider.getTerminologyExtent_TerminologyExtentAction_0ElementType());
            				doneComposite();
            				associateWithSemanticElement();
            			

            }

            // PsiInternalOntologicalModelingLanguage.g:82:3: ( ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) ) | ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) ) | ( (lv_bundles_3_0= ruleBundle ) ) | ( (lv_descriptions_4_0= ruleDescriptionBox ) ) )*
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

                    if ( (LA1_4==RULE_BUNDLE_TOKEN) ) {
                        alt1=3;
                    }
                    else if ( (LA1_4==RULE_TERMINOLOGY_GRAPH_TOKEN) ) {
                        alt1=2;
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
            	    // PsiInternalOntologicalModelingLanguage.g:83:4: ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:83:4: ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )
            	    // PsiInternalOntologicalModelingLanguage.g:84:5: (lv_annotationProperties_1_0= ruleAnnotationProperty )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:84:5: (lv_annotationProperties_1_0= ruleAnnotationProperty )
            	    // PsiInternalOntologicalModelingLanguage.g:85:6: lv_annotationProperties_1_0= ruleAnnotationProperty
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0ElementType());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_annotationProperties_1_0=ruleAnnotationProperty();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalOntologicalModelingLanguage.g:99:4: ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:99:4: ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )
            	    // PsiInternalOntologicalModelingLanguage.g:100:5: (lv_terminologyGraphs_2_0= ruleTerminologyGraph )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:100:5: (lv_terminologyGraphs_2_0= ruleTerminologyGraph )
            	    // PsiInternalOntologicalModelingLanguage.g:101:6: lv_terminologyGraphs_2_0= ruleTerminologyGraph
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_1_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_terminologyGraphs_2_0=ruleTerminologyGraph();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalOntologicalModelingLanguage.g:115:4: ( (lv_bundles_3_0= ruleBundle ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:115:4: ( (lv_bundles_3_0= ruleBundle ) )
            	    // PsiInternalOntologicalModelingLanguage.g:116:5: (lv_bundles_3_0= ruleBundle )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:116:5: (lv_bundles_3_0= ruleBundle )
            	    // PsiInternalOntologicalModelingLanguage.g:117:6: lv_bundles_3_0= ruleBundle
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyExtent_BundlesBundleParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_bundles_3_0=ruleBundle();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // PsiInternalOntologicalModelingLanguage.g:131:4: ( (lv_descriptions_4_0= ruleDescriptionBox ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:131:4: ( (lv_descriptions_4_0= ruleDescriptionBox ) )
            	    // PsiInternalOntologicalModelingLanguage.g:132:5: (lv_descriptions_4_0= ruleDescriptionBox )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:132:5: (lv_descriptions_4_0= ruleDescriptionBox )
            	    // PsiInternalOntologicalModelingLanguage.g:133:6: lv_descriptions_4_0= ruleDescriptionBox
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyExtent_DescriptionsDescriptionBoxParserRuleCall_1_3_0ElementType());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_descriptions_4_0=ruleDescriptionBox();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyExtent"


    // $ANTLR start "entryRuleAnnotationProperty"
    // PsiInternalOntologicalModelingLanguage.g:151:1: entryRuleAnnotationProperty returns [Boolean current=false] : iv_ruleAnnotationProperty= ruleAnnotationProperty EOF ;
    public final Boolean entryRuleAnnotationProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAnnotationProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:151:60: (iv_ruleAnnotationProperty= ruleAnnotationProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:152:2: iv_ruleAnnotationProperty= ruleAnnotationProperty EOF
            {
             markComposite(elementTypeProvider.getAnnotationPropertyElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationProperty=ruleAnnotationProperty();

            state._fsp--;

             current =iv_ruleAnnotationProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationProperty"


    // $ANTLR start "ruleAnnotationProperty"
    // PsiInternalOntologicalModelingLanguage.g:158:1: ruleAnnotationProperty returns [Boolean current=false] : (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) ) ;
    public final Boolean ruleAnnotationProperty() throws RecognitionException {
        Boolean current = false;

        Token this_ANNOTATION_PROPERTY_TOKEN_0=null;
        Token this_EQUAL_2=null;
        Token lv_iri_3_0=null;
        Boolean lv_abbrevIRI_1_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:159:1: ( (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:160:2: (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:160:2: (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) )
            // PsiInternalOntologicalModelingLanguage.g:161:3: this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) )
            {

            			markLeaf(elementTypeProvider.getAnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0ElementType());
            		
            this_ANNOTATION_PROPERTY_TOKEN_0=(Token)match(input,RULE_ANNOTATION_PROPERTY_TOKEN,FOLLOW_4); 

            			doneLeaf(this_ANNOTATION_PROPERTY_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:168:3: ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:169:4: (lv_abbrevIRI_1_0= ruleABBREV_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:169:4: (lv_abbrevIRI_1_0= ruleABBREV_IRI )
            // PsiInternalOntologicalModelingLanguage.g:170:5: lv_abbrevIRI_1_0= ruleABBREV_IRI
            {

            					markComposite(elementTypeProvider.getAnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_5);
            lv_abbrevIRI_1_0=ruleABBREV_IRI();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getAnnotationProperty_EQUALTerminalRuleCall_2ElementType());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_6); 

            			doneLeaf(this_EQUAL_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:190:3: ( (lv_iri_3_0= RULE_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:191:4: (lv_iri_3_0= RULE_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:191:4: (lv_iri_3_0= RULE_IRI )
            // PsiInternalOntologicalModelingLanguage.g:192:5: lv_iri_3_0= RULE_IRI
            {

            					markLeaf(elementTypeProvider.getAnnotationProperty_IriIRITerminalRuleCall_3_0ElementType());
            				
            lv_iri_3_0=(Token)match(input,RULE_IRI,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_iri_3_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationProperty"


    // $ANTLR start "entryRuleAnnotation"
    // PsiInternalOntologicalModelingLanguage.g:211:1: entryRuleAnnotation returns [Boolean current=false] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final Boolean entryRuleAnnotation() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAnnotation = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:211:52: (iv_ruleAnnotation= ruleAnnotation EOF )
            // PsiInternalOntologicalModelingLanguage.g:212:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             markComposite(elementTypeProvider.getAnnotationElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // PsiInternalOntologicalModelingLanguage.g:218:1: ruleAnnotation returns [Boolean current=false] : (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final Boolean ruleAnnotation() throws RecognitionException {
        Boolean current = false;

        Token this_ANNOTATION_TOKEN_0=null;
        Token this_EQUAL_2=null;
        Token lv_value_3_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:219:1: ( (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:220:2: (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:220:2: (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) )
            // PsiInternalOntologicalModelingLanguage.g:221:3: this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getAnnotation_ANNOTATION_TOKENTerminalRuleCall_0ElementType());
            		
            this_ANNOTATION_TOKEN_0=(Token)match(input,RULE_ANNOTATION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_ANNOTATION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:228:3: ( ( ruleABBREV_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:229:4: ( ruleABBREV_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:229:4: ( ruleABBREV_IRI )
            // PsiInternalOntologicalModelingLanguage.g:230:5: ruleABBREV_IRI
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getAnnotation_PropertyAnnotationPropertyCrossReference_1_0ElementType());
            				
            pushFollow(FOLLOW_5);
            ruleABBREV_IRI();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getAnnotation_EQUALTerminalRuleCall_2ElementType());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_7); 

            			doneLeaf(this_EQUAL_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:252:3: ( (lv_value_3_0= RULE_STRING ) )
            // PsiInternalOntologicalModelingLanguage.g:253:4: (lv_value_3_0= RULE_STRING )
            {
            // PsiInternalOntologicalModelingLanguage.g:253:4: (lv_value_3_0= RULE_STRING )
            // PsiInternalOntologicalModelingLanguage.g:254:5: lv_value_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAnnotation_ValueSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_value_3_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleTerminologyGraph"
    // PsiInternalOntologicalModelingLanguage.g:273:1: entryRuleTerminologyGraph returns [Boolean current=false] : iv_ruleTerminologyGraph= ruleTerminologyGraph EOF ;
    public final Boolean entryRuleTerminologyGraph() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyGraph = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:273:58: (iv_ruleTerminologyGraph= ruleTerminologyGraph EOF )
            // PsiInternalOntologicalModelingLanguage.g:274:2: iv_ruleTerminologyGraph= ruleTerminologyGraph EOF
            {
             markComposite(elementTypeProvider.getTerminologyGraphElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyGraph=ruleTerminologyGraph();

            state._fsp--;

             current =iv_ruleTerminologyGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyGraph"


    // $ANTLR start "ruleTerminologyGraph"
    // PsiInternalOntologicalModelingLanguage.g:280:1: ruleTerminologyGraph returns [Boolean current=false] : ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleTerminologyGraph() throws RecognitionException {
        Boolean current = false;

        Token this_TERMINOLOGY_GRAPH_TOKEN_1=null;
        Token lv_iri_2_0=null;
        Token this_LCURLY_3=null;
        Token this_RCURLY_7=null;
        Boolean lv_kind_0_0 = null;

        Boolean lv_annotations_4_0 = null;

        Boolean lv_terminologyBoxAxioms_5_0 = null;

        Boolean lv_boxStatements_6_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:281:1: ( ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:282:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:282:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:283:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY
            {
            // PsiInternalOntologicalModelingLanguage.g:283:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) )
            // PsiInternalOntologicalModelingLanguage.g:284:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            {
            // PsiInternalOntologicalModelingLanguage.g:284:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            // PsiInternalOntologicalModelingLanguage.g:285:5: lv_kind_0_0= ruleTerminologyGraphKind
            {

            					markComposite(elementTypeProvider.getTerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_8);
            lv_kind_0_0=ruleTerminologyGraphKind();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminologyGraph_TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1ElementType());
            		
            this_TERMINOLOGY_GRAPH_TOKEN_1=(Token)match(input,RULE_TERMINOLOGY_GRAPH_TOKEN,FOLLOW_6); 

            			doneLeaf(this_TERMINOLOGY_GRAPH_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:305:3: ( (lv_iri_2_0= RULE_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:306:4: (lv_iri_2_0= RULE_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:306:4: (lv_iri_2_0= RULE_IRI )
            // PsiInternalOntologicalModelingLanguage.g:307:5: lv_iri_2_0= RULE_IRI
            {

            					markLeaf(elementTypeProvider.getTerminologyGraph_IriIRITerminalRuleCall_2_0ElementType());
            				
            lv_iri_2_0=(Token)match(input,RULE_IRI,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_iri_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminologyGraph_LCURLYTerminalRuleCall_3ElementType());
            		
            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_10); 

            			doneLeaf(this_LCURLY_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:329:3: ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )*
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
            	    // PsiInternalOntologicalModelingLanguage.g:330:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:330:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // PsiInternalOntologicalModelingLanguage.g:331:5: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:331:5: (lv_annotations_4_0= ruleAnnotation )
            	    // PsiInternalOntologicalModelingLanguage.g:332:6: lv_annotations_4_0= ruleAnnotation
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_annotations_4_0=ruleAnnotation();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalOntologicalModelingLanguage.g:346:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:346:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    // PsiInternalOntologicalModelingLanguage.g:347:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:347:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    // PsiInternalOntologicalModelingLanguage.g:348:6: lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_terminologyBoxAxioms_5_0=ruleTerminologyBoxAxiom();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalOntologicalModelingLanguage.g:362:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:362:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    // PsiInternalOntologicalModelingLanguage.g:363:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:363:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    // PsiInternalOntologicalModelingLanguage.g:364:6: lv_boxStatements_6_0= ruleTerminologyBoxStatement
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_boxStatements_6_0=ruleTerminologyBoxStatement();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getTerminologyGraph_RCURLYTerminalRuleCall_5ElementType());
            		
            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_7);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyGraph"


    // $ANTLR start "entryRuleBundle"
    // PsiInternalOntologicalModelingLanguage.g:389:1: entryRuleBundle returns [Boolean current=false] : iv_ruleBundle= ruleBundle EOF ;
    public final Boolean entryRuleBundle() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBundle = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:389:48: (iv_ruleBundle= ruleBundle EOF )
            // PsiInternalOntologicalModelingLanguage.g:390:2: iv_ruleBundle= ruleBundle EOF
            {
             markComposite(elementTypeProvider.getBundleElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleBundle=ruleBundle();

            state._fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // PsiInternalOntologicalModelingLanguage.g:396:1: ruleBundle returns [Boolean current=false] : ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY ) ;
    public final Boolean ruleBundle() throws RecognitionException {
        Boolean current = false;

        Token this_BUNDLE_TOKEN_1=null;
        Token lv_iri_2_0=null;
        Token this_LCURLY_3=null;
        Token this_RCURLY_9=null;
        Boolean lv_kind_0_0 = null;

        Boolean lv_annotations_4_0 = null;

        Boolean lv_terminologyBoxAxioms_5_0 = null;

        Boolean lv_boxStatements_6_0 = null;

        Boolean lv_bundleStatements_7_0 = null;

        Boolean lv_terminologyBundleAxioms_8_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:397:1: ( ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:398:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:398:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:399:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY
            {
            // PsiInternalOntologicalModelingLanguage.g:399:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) )
            // PsiInternalOntologicalModelingLanguage.g:400:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            {
            // PsiInternalOntologicalModelingLanguage.g:400:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            // PsiInternalOntologicalModelingLanguage.g:401:5: lv_kind_0_0= ruleTerminologyGraphKind
            {

            					markComposite(elementTypeProvider.getBundle_KindTerminologyGraphKindEnumRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_11);
            lv_kind_0_0=ruleTerminologyGraphKind();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getBundle_BUNDLE_TOKENTerminalRuleCall_1ElementType());
            		
            this_BUNDLE_TOKEN_1=(Token)match(input,RULE_BUNDLE_TOKEN,FOLLOW_6); 

            			doneLeaf(this_BUNDLE_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:421:3: ( (lv_iri_2_0= RULE_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:422:4: (lv_iri_2_0= RULE_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:422:4: (lv_iri_2_0= RULE_IRI )
            // PsiInternalOntologicalModelingLanguage.g:423:5: lv_iri_2_0= RULE_IRI
            {

            					markLeaf(elementTypeProvider.getBundle_IriIRITerminalRuleCall_2_0ElementType());
            				
            lv_iri_2_0=(Token)match(input,RULE_IRI,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_iri_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getBundle_LCURLYTerminalRuleCall_3ElementType());
            		
            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_12); 

            			doneLeaf(this_LCURLY_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:445:3: ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )*
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
            	    // PsiInternalOntologicalModelingLanguage.g:446:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:446:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // PsiInternalOntologicalModelingLanguage.g:447:5: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:447:5: (lv_annotations_4_0= ruleAnnotation )
            	    // PsiInternalOntologicalModelingLanguage.g:448:6: lv_annotations_4_0= ruleAnnotation
            	    {

            	    						markComposite(elementTypeProvider.getBundle_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_annotations_4_0=ruleAnnotation();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalOntologicalModelingLanguage.g:462:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:462:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    // PsiInternalOntologicalModelingLanguage.g:463:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:463:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    // PsiInternalOntologicalModelingLanguage.g:464:6: lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom
            	    {

            	    						markComposite(elementTypeProvider.getBundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_terminologyBoxAxioms_5_0=ruleTerminologyBoxAxiom();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalOntologicalModelingLanguage.g:478:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:478:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    // PsiInternalOntologicalModelingLanguage.g:479:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:479:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    // PsiInternalOntologicalModelingLanguage.g:480:6: lv_boxStatements_6_0= ruleTerminologyBoxStatement
            	    {

            	    						markComposite(elementTypeProvider.getBundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_boxStatements_6_0=ruleTerminologyBoxStatement();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // PsiInternalOntologicalModelingLanguage.g:494:4: ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:494:4: ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) )
            	    // PsiInternalOntologicalModelingLanguage.g:495:5: (lv_bundleStatements_7_0= ruleTerminologyBundleStatement )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:495:5: (lv_bundleStatements_7_0= ruleTerminologyBundleStatement )
            	    // PsiInternalOntologicalModelingLanguage.g:496:6: lv_bundleStatements_7_0= ruleTerminologyBundleStatement
            	    {

            	    						markComposite(elementTypeProvider.getBundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0ElementType());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_bundleStatements_7_0=ruleTerminologyBundleStatement();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // PsiInternalOntologicalModelingLanguage.g:510:4: ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:510:4: ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) )
            	    // PsiInternalOntologicalModelingLanguage.g:511:5: (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:511:5: (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom )
            	    // PsiInternalOntologicalModelingLanguage.g:512:6: lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom
            	    {

            	    						markComposite(elementTypeProvider.getBundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0ElementType());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_terminologyBundleAxioms_8_0=ruleTerminologyBundleAxiom();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getBundle_RCURLYTerminalRuleCall_5ElementType());
            		
            this_RCURLY_9=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_9);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleTerminologyBoxAxiom"
    // PsiInternalOntologicalModelingLanguage.g:537:1: entryRuleTerminologyBoxAxiom returns [Boolean current=false] : iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF ;
    public final Boolean entryRuleTerminologyBoxAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyBoxAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:537:61: (iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:538:2: iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF
            {
             markComposite(elementTypeProvider.getTerminologyBoxAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBoxAxiom=ruleTerminologyBoxAxiom();

            state._fsp--;

             current =iv_ruleTerminologyBoxAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBoxAxiom"


    // $ANTLR start "ruleTerminologyBoxAxiom"
    // PsiInternalOntologicalModelingLanguage.g:544:1: ruleTerminologyBoxAxiom returns [Boolean current=false] : (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom ) ;
    public final Boolean ruleTerminologyBoxAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_ConceptDesignationTerminologyAxiom_0 = null;

        Boolean this_TerminologyExtensionAxiom_1 = null;

        Boolean this_TerminologyNestingAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:545:1: ( (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:546:2: (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:546:2: (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom )
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
                    // PsiInternalOntologicalModelingLanguage.g:547:3: this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom
                    {

                    			markComposite(elementTypeProvider.getTerminologyBoxAxiom_ConceptDesignationTerminologyAxiomParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptDesignationTerminologyAxiom_0=ruleConceptDesignationTerminologyAxiom();

                    state._fsp--;


                    			current = this_ConceptDesignationTerminologyAxiom_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:556:3: this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom
                    {

                    			markComposite(elementTypeProvider.getTerminologyBoxAxiom_TerminologyExtensionAxiomParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminologyExtensionAxiom_1=ruleTerminologyExtensionAxiom();

                    state._fsp--;


                    			current = this_TerminologyExtensionAxiom_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalOntologicalModelingLanguage.g:565:3: this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom
                    {

                    			markComposite(elementTypeProvider.getTerminologyBoxAxiom_TerminologyNestingAxiomParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_TerminologyNestingAxiom_2=ruleTerminologyNestingAxiom();

                    state._fsp--;


                    			current = this_TerminologyNestingAxiom_2;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBoxAxiom"


    // $ANTLR start "entryRuleTerminologyBoxStatement"
    // PsiInternalOntologicalModelingLanguage.g:577:1: entryRuleTerminologyBoxStatement returns [Boolean current=false] : iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF ;
    public final Boolean entryRuleTerminologyBoxStatement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyBoxStatement = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:577:65: (iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF )
            // PsiInternalOntologicalModelingLanguage.g:578:2: iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF
            {
             markComposite(elementTypeProvider.getTerminologyBoxStatementElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBoxStatement=ruleTerminologyBoxStatement();

            state._fsp--;

             current =iv_ruleTerminologyBoxStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBoxStatement"


    // $ANTLR start "ruleTerminologyBoxStatement"
    // PsiInternalOntologicalModelingLanguage.g:584:1: ruleTerminologyBoxStatement returns [Boolean current=false] : (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm ) ;
    public final Boolean ruleTerminologyBoxStatement() throws RecognitionException {
        Boolean current = false;

        Boolean this_Axiom_0 = null;

        Boolean this_Term_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:585:1: ( (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm ) )
            // PsiInternalOntologicalModelingLanguage.g:586:2: (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm )
            {
            // PsiInternalOntologicalModelingLanguage.g:586:2: (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm )
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
                    // PsiInternalOntologicalModelingLanguage.g:587:3: this_Axiom_0= ruleAxiom
                    {

                    			markComposite(elementTypeProvider.getTerminologyBoxStatement_AxiomParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Axiom_0=ruleAxiom();

                    state._fsp--;


                    			current = this_Axiom_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:596:3: this_Term_1= ruleTerm
                    {

                    			markComposite(elementTypeProvider.getTerminologyBoxStatement_TermParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Term_1=ruleTerm();

                    state._fsp--;


                    			current = this_Term_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBoxStatement"


    // $ANTLR start "entryRuleTerm"
    // PsiInternalOntologicalModelingLanguage.g:608:1: entryRuleTerm returns [Boolean current=false] : iv_ruleTerm= ruleTerm EOF ;
    public final Boolean entryRuleTerm() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerm = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:608:46: (iv_ruleTerm= ruleTerm EOF )
            // PsiInternalOntologicalModelingLanguage.g:609:2: iv_ruleTerm= ruleTerm EOF
            {
             markComposite(elementTypeProvider.getTermElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // PsiInternalOntologicalModelingLanguage.g:615:1: ruleTerm returns [Boolean current=false] : (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship ) ;
    public final Boolean ruleTerm() throws RecognitionException {
        Boolean current = false;

        Boolean this_AtomicEntity_0 = null;

        Boolean this_EntityRelationship_1 = null;

        Boolean this_Datatype_2 = null;

        Boolean this_DataRelationship_3 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:616:1: ( (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship ) )
            // PsiInternalOntologicalModelingLanguage.g:617:2: (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship )
            {
            // PsiInternalOntologicalModelingLanguage.g:617:2: (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship )
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
                    // PsiInternalOntologicalModelingLanguage.g:618:3: this_AtomicEntity_0= ruleAtomicEntity
                    {

                    			markComposite(elementTypeProvider.getTerm_AtomicEntityParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicEntity_0=ruleAtomicEntity();

                    state._fsp--;


                    			current = this_AtomicEntity_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:627:3: this_EntityRelationship_1= ruleEntityRelationship
                    {

                    			markComposite(elementTypeProvider.getTerm_EntityRelationshipParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityRelationship_1=ruleEntityRelationship();

                    state._fsp--;


                    			current = this_EntityRelationship_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalOntologicalModelingLanguage.g:636:3: this_Datatype_2= ruleDatatype
                    {

                    			markComposite(elementTypeProvider.getTerm_DatatypeParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Datatype_2=ruleDatatype();

                    state._fsp--;


                    			current = this_Datatype_2;
                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalOntologicalModelingLanguage.g:645:3: this_DataRelationship_3= ruleDataRelationship
                    {

                    			markComposite(elementTypeProvider.getTerm_DataRelationshipParserRuleCall_3ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataRelationship_3=ruleDataRelationship();

                    state._fsp--;


                    			current = this_DataRelationship_3;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtomicEntity"
    // PsiInternalOntologicalModelingLanguage.g:657:1: entryRuleAtomicEntity returns [Boolean current=false] : iv_ruleAtomicEntity= ruleAtomicEntity EOF ;
    public final Boolean entryRuleAtomicEntity() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAtomicEntity = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:657:54: (iv_ruleAtomicEntity= ruleAtomicEntity EOF )
            // PsiInternalOntologicalModelingLanguage.g:658:2: iv_ruleAtomicEntity= ruleAtomicEntity EOF
            {
             markComposite(elementTypeProvider.getAtomicEntityElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicEntity=ruleAtomicEntity();

            state._fsp--;

             current =iv_ruleAtomicEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicEntity"


    // $ANTLR start "ruleAtomicEntity"
    // PsiInternalOntologicalModelingLanguage.g:664:1: ruleAtomicEntity returns [Boolean current=false] : (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept ) ;
    public final Boolean ruleAtomicEntity() throws RecognitionException {
        Boolean current = false;

        Boolean this_Aspect_0 = null;

        Boolean this_Concept_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:665:1: ( (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept ) )
            // PsiInternalOntologicalModelingLanguage.g:666:2: (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept )
            {
            // PsiInternalOntologicalModelingLanguage.g:666:2: (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept )
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
                    // PsiInternalOntologicalModelingLanguage.g:667:3: this_Aspect_0= ruleAspect
                    {

                    			markComposite(elementTypeProvider.getAtomicEntity_AspectParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aspect_0=ruleAspect();

                    state._fsp--;


                    			current = this_Aspect_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:676:3: this_Concept_1= ruleConcept
                    {

                    			markComposite(elementTypeProvider.getAtomicEntity_ConceptParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Concept_1=ruleConcept();

                    state._fsp--;


                    			current = this_Concept_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicEntity"


    // $ANTLR start "entryRuleEntityRelationship"
    // PsiInternalOntologicalModelingLanguage.g:688:1: entryRuleEntityRelationship returns [Boolean current=false] : iv_ruleEntityRelationship= ruleEntityRelationship EOF ;
    public final Boolean entryRuleEntityRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityRelationship = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:688:60: (iv_ruleEntityRelationship= ruleEntityRelationship EOF )
            // PsiInternalOntologicalModelingLanguage.g:689:2: iv_ruleEntityRelationship= ruleEntityRelationship EOF
            {
             markComposite(elementTypeProvider.getEntityRelationshipElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRelationship=ruleEntityRelationship();

            state._fsp--;

             current =iv_ruleEntityRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityRelationship"


    // $ANTLR start "ruleEntityRelationship"
    // PsiInternalOntologicalModelingLanguage.g:695:1: ruleEntityRelationship returns [Boolean current=false] : (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship ) ;
    public final Boolean ruleEntityRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean this_ReifiedRelationship_0 = null;

        Boolean this_UnreifiedRelationship_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:696:1: ( (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship ) )
            // PsiInternalOntologicalModelingLanguage.g:697:2: (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship )
            {
            // PsiInternalOntologicalModelingLanguage.g:697:2: (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship )
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
                    // PsiInternalOntologicalModelingLanguage.g:698:3: this_ReifiedRelationship_0= ruleReifiedRelationship
                    {

                    			markComposite(elementTypeProvider.getEntityRelationship_ReifiedRelationshipParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReifiedRelationship_0=ruleReifiedRelationship();

                    state._fsp--;


                    			current = this_ReifiedRelationship_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:707:3: this_UnreifiedRelationship_1= ruleUnreifiedRelationship
                    {

                    			markComposite(elementTypeProvider.getEntityRelationship_UnreifiedRelationshipParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnreifiedRelationship_1=ruleUnreifiedRelationship();

                    state._fsp--;


                    			current = this_UnreifiedRelationship_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityRelationship"


    // $ANTLR start "entryRuleDatatype"
    // PsiInternalOntologicalModelingLanguage.g:719:1: entryRuleDatatype returns [Boolean current=false] : iv_ruleDatatype= ruleDatatype EOF ;
    public final Boolean entryRuleDatatype() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDatatype = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:719:50: (iv_ruleDatatype= ruleDatatype EOF )
            // PsiInternalOntologicalModelingLanguage.g:720:2: iv_ruleDatatype= ruleDatatype EOF
            {
             markComposite(elementTypeProvider.getDatatypeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // PsiInternalOntologicalModelingLanguage.g:726:1: ruleDatatype returns [Boolean current=false] : (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure ) ;
    public final Boolean ruleDatatype() throws RecognitionException {
        Boolean current = false;

        Boolean this_ScalarDataRange_0 = null;

        Boolean this_Structure_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:727:1: ( (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure ) )
            // PsiInternalOntologicalModelingLanguage.g:728:2: (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure )
            {
            // PsiInternalOntologicalModelingLanguage.g:728:2: (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure )
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
                    // PsiInternalOntologicalModelingLanguage.g:729:3: this_ScalarDataRange_0= ruleScalarDataRange
                    {

                    			markComposite(elementTypeProvider.getDatatype_ScalarDataRangeParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarDataRange_0=ruleScalarDataRange();

                    state._fsp--;


                    			current = this_ScalarDataRange_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:738:3: this_Structure_1= ruleStructure
                    {

                    			markComposite(elementTypeProvider.getDatatype_StructureParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Structure_1=ruleStructure();

                    state._fsp--;


                    			current = this_Structure_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleScalarDataRange"
    // PsiInternalOntologicalModelingLanguage.g:750:1: entryRuleScalarDataRange returns [Boolean current=false] : iv_ruleScalarDataRange= ruleScalarDataRange EOF ;
    public final Boolean entryRuleScalarDataRange() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarDataRange = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:750:57: (iv_ruleScalarDataRange= ruleScalarDataRange EOF )
            // PsiInternalOntologicalModelingLanguage.g:751:2: iv_ruleScalarDataRange= ruleScalarDataRange EOF
            {
             markComposite(elementTypeProvider.getScalarDataRangeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarDataRange=ruleScalarDataRange();

            state._fsp--;

             current =iv_ruleScalarDataRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarDataRange"


    // $ANTLR start "ruleScalarDataRange"
    // PsiInternalOntologicalModelingLanguage.g:757:1: ruleScalarDataRange returns [Boolean current=false] : (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange ) ;
    public final Boolean ruleScalarDataRange() throws RecognitionException {
        Boolean current = false;

        Boolean this_Scalar_0 = null;

        Boolean this_RestrictedDataRange_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:758:1: ( (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange ) )
            // PsiInternalOntologicalModelingLanguage.g:759:2: (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange )
            {
            // PsiInternalOntologicalModelingLanguage.g:759:2: (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange )
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
                    // PsiInternalOntologicalModelingLanguage.g:760:3: this_Scalar_0= ruleScalar
                    {

                    			markComposite(elementTypeProvider.getScalarDataRange_ScalarParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scalar_0=ruleScalar();

                    state._fsp--;


                    			current = this_Scalar_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:769:3: this_RestrictedDataRange_1= ruleRestrictedDataRange
                    {

                    			markComposite(elementTypeProvider.getScalarDataRange_RestrictedDataRangeParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestrictedDataRange_1=ruleRestrictedDataRange();

                    state._fsp--;


                    			current = this_RestrictedDataRange_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarDataRange"


    // $ANTLR start "entryRuleRestrictedDataRange"
    // PsiInternalOntologicalModelingLanguage.g:781:1: entryRuleRestrictedDataRange returns [Boolean current=false] : iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF ;
    public final Boolean entryRuleRestrictedDataRange() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRestrictedDataRange = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:781:61: (iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF )
            // PsiInternalOntologicalModelingLanguage.g:782:2: iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF
            {
             markComposite(elementTypeProvider.getRestrictedDataRangeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestrictedDataRange=ruleRestrictedDataRange();

            state._fsp--;

             current =iv_ruleRestrictedDataRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedDataRange"


    // $ANTLR start "ruleRestrictedDataRange"
    // PsiInternalOntologicalModelingLanguage.g:788:1: ruleRestrictedDataRange returns [Boolean current=false] : (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction ) ;
    public final Boolean ruleRestrictedDataRange() throws RecognitionException {
        Boolean current = false;

        Boolean this_BinaryScalarRestriction_0 = null;

        Boolean this_IRIScalarRestriction_1 = null;

        Boolean this_NumericScalarRestriction_2 = null;

        Boolean this_PlainLiteralScalarRestriction_3 = null;

        Boolean this_ScalarOneOfRestriction_4 = null;

        Boolean this_StringScalarRestriction_5 = null;

        Boolean this_SynonymScalarRestriction_6 = null;

        Boolean this_TimeScalarRestriction_7 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:789:1: ( (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction ) )
            // PsiInternalOntologicalModelingLanguage.g:790:2: (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction )
            {
            // PsiInternalOntologicalModelingLanguage.g:790:2: (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction )
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
                    // PsiInternalOntologicalModelingLanguage.g:791:3: this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction
                    {

                    			markComposite(elementTypeProvider.getRestrictedDataRange_BinaryScalarRestrictionParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryScalarRestriction_0=ruleBinaryScalarRestriction();

                    state._fsp--;


                    			current = this_BinaryScalarRestriction_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:800:3: this_IRIScalarRestriction_1= ruleIRIScalarRestriction
                    {

                    			markComposite(elementTypeProvider.getRestrictedDataRange_IRIScalarRestrictionParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_IRIScalarRestriction_1=ruleIRIScalarRestriction();

                    state._fsp--;


                    			current = this_IRIScalarRestriction_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalOntologicalModelingLanguage.g:809:3: this_NumericScalarRestriction_2= ruleNumericScalarRestriction
                    {

                    			markComposite(elementTypeProvider.getRestrictedDataRange_NumericScalarRestrictionParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericScalarRestriction_2=ruleNumericScalarRestriction();

                    state._fsp--;


                    			current = this_NumericScalarRestriction_2;
                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalOntologicalModelingLanguage.g:818:3: this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction
                    {

                    			markComposite(elementTypeProvider.getRestrictedDataRange_PlainLiteralScalarRestrictionParserRuleCall_3ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlainLiteralScalarRestriction_3=rulePlainLiteralScalarRestriction();

                    state._fsp--;


                    			current = this_PlainLiteralScalarRestriction_3;
                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalOntologicalModelingLanguage.g:827:3: this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction
                    {

                    			markComposite(elementTypeProvider.getRestrictedDataRange_ScalarOneOfRestrictionParserRuleCall_4ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarOneOfRestriction_4=ruleScalarOneOfRestriction();

                    state._fsp--;


                    			current = this_ScalarOneOfRestriction_4;
                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // PsiInternalOntologicalModelingLanguage.g:836:3: this_StringScalarRestriction_5= ruleStringScalarRestriction
                    {

                    			markComposite(elementTypeProvider.getRestrictedDataRange_StringScalarRestrictionParserRuleCall_5ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringScalarRestriction_5=ruleStringScalarRestriction();

                    state._fsp--;


                    			current = this_StringScalarRestriction_5;
                    			doneComposite();
                    		

                    }
                    break;
                case 7 :
                    // PsiInternalOntologicalModelingLanguage.g:845:3: this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction
                    {

                    			markComposite(elementTypeProvider.getRestrictedDataRange_SynonymScalarRestrictionParserRuleCall_6ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_SynonymScalarRestriction_6=ruleSynonymScalarRestriction();

                    state._fsp--;


                    			current = this_SynonymScalarRestriction_6;
                    			doneComposite();
                    		

                    }
                    break;
                case 8 :
                    // PsiInternalOntologicalModelingLanguage.g:854:3: this_TimeScalarRestriction_7= ruleTimeScalarRestriction
                    {

                    			markComposite(elementTypeProvider.getRestrictedDataRange_TimeScalarRestrictionParserRuleCall_7ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeScalarRestriction_7=ruleTimeScalarRestriction();

                    state._fsp--;


                    			current = this_TimeScalarRestriction_7;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedDataRange"


    // $ANTLR start "entryRuleDataRelationship"
    // PsiInternalOntologicalModelingLanguage.g:866:1: entryRuleDataRelationship returns [Boolean current=false] : iv_ruleDataRelationship= ruleDataRelationship EOF ;
    public final Boolean entryRuleDataRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDataRelationship = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:866:58: (iv_ruleDataRelationship= ruleDataRelationship EOF )
            // PsiInternalOntologicalModelingLanguage.g:867:2: iv_ruleDataRelationship= ruleDataRelationship EOF
            {
             markComposite(elementTypeProvider.getDataRelationshipElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataRelationship=ruleDataRelationship();

            state._fsp--;

             current =iv_ruleDataRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataRelationship"


    // $ANTLR start "ruleDataRelationship"
    // PsiInternalOntologicalModelingLanguage.g:873:1: ruleDataRelationship returns [Boolean current=false] : (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty ) ;
    public final Boolean ruleDataRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean this_EntityStructuredDataProperty_0 = null;

        Boolean this_EntityScalarDataProperty_1 = null;

        Boolean this_StructuredDataProperty_2 = null;

        Boolean this_ScalarDataProperty_3 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:874:1: ( (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty ) )
            // PsiInternalOntologicalModelingLanguage.g:875:2: (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty )
            {
            // PsiInternalOntologicalModelingLanguage.g:875:2: (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty )
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
                    // PsiInternalOntologicalModelingLanguage.g:876:3: this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty
                    {

                    			markComposite(elementTypeProvider.getDataRelationship_EntityStructuredDataPropertyParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityStructuredDataProperty_0=ruleEntityStructuredDataProperty();

                    state._fsp--;


                    			current = this_EntityStructuredDataProperty_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:885:3: this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty
                    {

                    			markComposite(elementTypeProvider.getDataRelationship_EntityScalarDataPropertyParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataProperty_1=ruleEntityScalarDataProperty();

                    state._fsp--;


                    			current = this_EntityScalarDataProperty_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalOntologicalModelingLanguage.g:894:3: this_StructuredDataProperty_2= ruleStructuredDataProperty
                    {

                    			markComposite(elementTypeProvider.getDataRelationship_StructuredDataPropertyParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructuredDataProperty_2=ruleStructuredDataProperty();

                    state._fsp--;


                    			current = this_StructuredDataProperty_2;
                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalOntologicalModelingLanguage.g:903:3: this_ScalarDataProperty_3= ruleScalarDataProperty
                    {

                    			markComposite(elementTypeProvider.getDataRelationship_ScalarDataPropertyParserRuleCall_3ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarDataProperty_3=ruleScalarDataProperty();

                    state._fsp--;


                    			current = this_ScalarDataProperty_3;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataRelationship"


    // $ANTLR start "entryRuleAxiom"
    // PsiInternalOntologicalModelingLanguage.g:915:1: entryRuleAxiom returns [Boolean current=false] : iv_ruleAxiom= ruleAxiom EOF ;
    public final Boolean entryRuleAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:915:47: (iv_ruleAxiom= ruleAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:916:2: iv_ruleAxiom= ruleAxiom EOF
            {
             markComposite(elementTypeProvider.getAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // PsiInternalOntologicalModelingLanguage.g:922:1: ruleAxiom returns [Boolean current=false] : (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom ) ;
    public final Boolean ruleAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_ScalarOneOfLiteralAxiom_0 = null;

        Boolean this_TermAxiom_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:923:1: ( (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:924:2: (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:924:2: (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom )
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
                    // PsiInternalOntologicalModelingLanguage.g:925:3: this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom
                    {

                    			markComposite(elementTypeProvider.getAxiom_ScalarOneOfLiteralAxiomParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarOneOfLiteralAxiom_0=ruleScalarOneOfLiteralAxiom();

                    state._fsp--;


                    			current = this_ScalarOneOfLiteralAxiom_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:934:3: this_TermAxiom_1= ruleTermAxiom
                    {

                    			markComposite(elementTypeProvider.getAxiom_TermAxiomParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_TermAxiom_1=ruleTermAxiom();

                    state._fsp--;


                    			current = this_TermAxiom_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleTermAxiom"
    // PsiInternalOntologicalModelingLanguage.g:946:1: entryRuleTermAxiom returns [Boolean current=false] : iv_ruleTermAxiom= ruleTermAxiom EOF ;
    public final Boolean entryRuleTermAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTermAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:946:51: (iv_ruleTermAxiom= ruleTermAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:947:2: iv_ruleTermAxiom= ruleTermAxiom EOF
            {
             markComposite(elementTypeProvider.getTermAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermAxiom=ruleTermAxiom();

            state._fsp--;

             current =iv_ruleTermAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermAxiom"


    // $ANTLR start "ruleTermAxiom"
    // PsiInternalOntologicalModelingLanguage.g:953:1: ruleTermAxiom returns [Boolean current=false] : (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom ) ;
    public final Boolean ruleTermAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_EntityRestrictionAxiom_0 = null;

        Boolean this_EntityScalarDataPropertyRestrictionAxiom_1 = null;

        Boolean this_SpecializationAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:954:1: ( (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:955:2: (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:955:2: (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom )
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
                    // PsiInternalOntologicalModelingLanguage.g:956:3: this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom
                    {

                    			markComposite(elementTypeProvider.getTermAxiom_EntityRestrictionAxiomParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityRestrictionAxiom_0=ruleEntityRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityRestrictionAxiom_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:965:3: this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom
                    {

                    			markComposite(elementTypeProvider.getTermAxiom_EntityScalarDataPropertyRestrictionAxiomParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataPropertyRestrictionAxiom_1=ruleEntityScalarDataPropertyRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityScalarDataPropertyRestrictionAxiom_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalOntologicalModelingLanguage.g:974:3: this_SpecializationAxiom_2= ruleSpecializationAxiom
                    {

                    			markComposite(elementTypeProvider.getTermAxiom_SpecializationAxiomParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecializationAxiom_2=ruleSpecializationAxiom();

                    state._fsp--;


                    			current = this_SpecializationAxiom_2;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermAxiom"


    // $ANTLR start "entryRuleEntityRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:986:1: entryRuleEntityRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:986:64: (iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:987:2: iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF
            {
             markComposite(elementTypeProvider.getEntityRestrictionAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRestrictionAxiom=ruleEntityRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityRestrictionAxiom"


    // $ANTLR start "ruleEntityRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:993:1: ruleEntityRestrictionAxiom returns [Boolean current=false] : (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom ) ;
    public final Boolean ruleEntityRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_EntityExistentialRestrictionAxiom_0 = null;

        Boolean this_EntityUniversalRestrictionAxiom_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:994:1: ( (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:995:2: (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:995:2: (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom )
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
                    // PsiInternalOntologicalModelingLanguage.g:996:3: this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom
                    {

                    			markComposite(elementTypeProvider.getEntityRestrictionAxiom_EntityExistentialRestrictionAxiomParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityExistentialRestrictionAxiom_0=ruleEntityExistentialRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityExistentialRestrictionAxiom_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:1005:3: this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom
                    {

                    			markComposite(elementTypeProvider.getEntityRestrictionAxiom_EntityUniversalRestrictionAxiomParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityUniversalRestrictionAxiom_1=ruleEntityUniversalRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityUniversalRestrictionAxiom_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityRestrictionAxiom"


    // $ANTLR start "entryRuleEntityScalarDataPropertyRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:1017:1: entryRuleEntityScalarDataPropertyRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityScalarDataPropertyRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataPropertyRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1017:82: (iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:1018:2: iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF
            {
             markComposite(elementTypeProvider.getEntityScalarDataPropertyRestrictionAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataPropertyRestrictionAxiom=ruleEntityScalarDataPropertyRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityScalarDataPropertyRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataPropertyRestrictionAxiom"


    // $ANTLR start "ruleEntityScalarDataPropertyRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:1024:1: ruleEntityScalarDataPropertyRestrictionAxiom returns [Boolean current=false] : (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom ) ;
    public final Boolean ruleEntityScalarDataPropertyRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_EntityScalarDataPropertyExistentialRestrictionAxiom_0 = null;

        Boolean this_EntityScalarDataPropertyParticularRestrictionAxiom_1 = null;

        Boolean this_EntityScalarDataPropertyUniversalRestrictionAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1025:1: ( (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:1026:2: (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:1026:2: (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom )
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
                    // PsiInternalOntologicalModelingLanguage.g:1027:3: this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom
                    {

                    			markComposite(elementTypeProvider.getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataPropertyExistentialRestrictionAxiom_0=ruleEntityScalarDataPropertyExistentialRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityScalarDataPropertyExistentialRestrictionAxiom_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:1036:3: this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom
                    {

                    			markComposite(elementTypeProvider.getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataPropertyParticularRestrictionAxiom_1=ruleEntityScalarDataPropertyParticularRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityScalarDataPropertyParticularRestrictionAxiom_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalOntologicalModelingLanguage.g:1045:3: this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom
                    {

                    			markComposite(elementTypeProvider.getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityScalarDataPropertyUniversalRestrictionAxiom_2=ruleEntityScalarDataPropertyUniversalRestrictionAxiom();

                    state._fsp--;


                    			current = this_EntityScalarDataPropertyUniversalRestrictionAxiom_2;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataPropertyRestrictionAxiom"


    // $ANTLR start "entryRuleSpecializationAxiom"
    // PsiInternalOntologicalModelingLanguage.g:1057:1: entryRuleSpecializationAxiom returns [Boolean current=false] : iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF ;
    public final Boolean entryRuleSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSpecializationAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1057:61: (iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:1058:2: iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF
            {
             markComposite(elementTypeProvider.getSpecializationAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecializationAxiom=ruleSpecializationAxiom();

            state._fsp--;

             current =iv_ruleSpecializationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecializationAxiom"


    // $ANTLR start "ruleSpecializationAxiom"
    // PsiInternalOntologicalModelingLanguage.g:1064:1: ruleSpecializationAxiom returns [Boolean current=false] : (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom ) ;
    public final Boolean ruleSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_ConceptSpecializationAxiom_0 = null;

        Boolean this_AspectSpecializationAxiom_1 = null;

        Boolean this_ReifiedRelationshipSpecializationAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1065:1: ( (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:1066:2: (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:1066:2: (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom )
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
                    // PsiInternalOntologicalModelingLanguage.g:1067:3: this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom
                    {

                    			markComposite(elementTypeProvider.getSpecializationAxiom_ConceptSpecializationAxiomParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptSpecializationAxiom_0=ruleConceptSpecializationAxiom();

                    state._fsp--;


                    			current = this_ConceptSpecializationAxiom_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:1076:3: this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom
                    {

                    			markComposite(elementTypeProvider.getSpecializationAxiom_AspectSpecializationAxiomParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_AspectSpecializationAxiom_1=ruleAspectSpecializationAxiom();

                    state._fsp--;


                    			current = this_AspectSpecializationAxiom_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalOntologicalModelingLanguage.g:1085:3: this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom
                    {

                    			markComposite(elementTypeProvider.getSpecializationAxiom_ReifiedRelationshipSpecializationAxiomParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReifiedRelationshipSpecializationAxiom_2=ruleReifiedRelationshipSpecializationAxiom();

                    state._fsp--;


                    			current = this_ReifiedRelationshipSpecializationAxiom_2;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecializationAxiom"


    // $ANTLR start "entryRuleTerminologyBundleStatement"
    // PsiInternalOntologicalModelingLanguage.g:1097:1: entryRuleTerminologyBundleStatement returns [Boolean current=false] : iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF ;
    public final Boolean entryRuleTerminologyBundleStatement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyBundleStatement = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1097:68: (iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF )
            // PsiInternalOntologicalModelingLanguage.g:1098:2: iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF
            {
             markComposite(elementTypeProvider.getTerminologyBundleStatementElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBundleStatement=ruleTerminologyBundleStatement();

            state._fsp--;

             current =iv_ruleTerminologyBundleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBundleStatement"


    // $ANTLR start "ruleTerminologyBundleStatement"
    // PsiInternalOntologicalModelingLanguage.g:1104:1: ruleTerminologyBundleStatement returns [Boolean current=false] : (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom ) ;
    public final Boolean ruleTerminologyBundleStatement() throws RecognitionException {
        Boolean current = false;

        Boolean this_AnonymousConceptTaxonomyAxiom_0 = null;

        Boolean this_RootConceptTaxonomyAxiom_1 = null;

        Boolean this_SpecificDisjointConceptAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1105:1: ( (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:1106:2: (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:1106:2: (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom )
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
                    // PsiInternalOntologicalModelingLanguage.g:1107:3: this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom
                    {

                    			markComposite(elementTypeProvider.getTerminologyBundleStatement_AnonymousConceptTaxonomyAxiomParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnonymousConceptTaxonomyAxiom_0=ruleAnonymousConceptTaxonomyAxiom();

                    state._fsp--;


                    			current = this_AnonymousConceptTaxonomyAxiom_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:1116:3: this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom
                    {

                    			markComposite(elementTypeProvider.getTerminologyBundleStatement_RootConceptTaxonomyAxiomParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_RootConceptTaxonomyAxiom_1=ruleRootConceptTaxonomyAxiom();

                    state._fsp--;


                    			current = this_RootConceptTaxonomyAxiom_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalOntologicalModelingLanguage.g:1125:3: this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom
                    {

                    			markComposite(elementTypeProvider.getTerminologyBundleStatement_SpecificDisjointConceptAxiomParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecificDisjointConceptAxiom_2=ruleSpecificDisjointConceptAxiom();

                    state._fsp--;


                    			current = this_SpecificDisjointConceptAxiom_2;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBundleStatement"


    // $ANTLR start "entryRuleTerminologyBundleAxiom"
    // PsiInternalOntologicalModelingLanguage.g:1137:1: entryRuleTerminologyBundleAxiom returns [Boolean current=false] : iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF ;
    public final Boolean entryRuleTerminologyBundleAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyBundleAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1137:64: (iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:1138:2: iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF
            {
             markComposite(elementTypeProvider.getTerminologyBundleAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBundleAxiom=ruleTerminologyBundleAxiom();

            state._fsp--;

             current =iv_ruleTerminologyBundleAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBundleAxiom"


    // $ANTLR start "ruleTerminologyBundleAxiom"
    // PsiInternalOntologicalModelingLanguage.g:1144:1: ruleTerminologyBundleAxiom returns [Boolean current=false] : this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom ;
    public final Boolean ruleTerminologyBundleAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_BundledTerminologyAxiom_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1145:1: (this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom )
            // PsiInternalOntologicalModelingLanguage.g:1146:2: this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom
            {

            		markComposite(elementTypeProvider.getTerminologyBundleAxiom_BundledTerminologyAxiomParserRuleCallElementType());
            	
            pushFollow(FOLLOW_2);
            this_BundledTerminologyAxiom_0=ruleBundledTerminologyAxiom();

            state._fsp--;


            		current = this_BundledTerminologyAxiom_0;
            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBundleAxiom"


    // $ANTLR start "entryRuleAspect"
    // PsiInternalOntologicalModelingLanguage.g:1157:1: entryRuleAspect returns [Boolean current=false] : iv_ruleAspect= ruleAspect EOF ;
    public final Boolean entryRuleAspect() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAspect = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1157:48: (iv_ruleAspect= ruleAspect EOF )
            // PsiInternalOntologicalModelingLanguage.g:1158:2: iv_ruleAspect= ruleAspect EOF
            {
             markComposite(elementTypeProvider.getAspectElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAspect=ruleAspect();

            state._fsp--;

             current =iv_ruleAspect; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // PsiInternalOntologicalModelingLanguage.g:1164:1: ruleAspect returns [Boolean current=false] : (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleAspect() throws RecognitionException {
        Boolean current = false;

        Token this_ASPECT_TOKEN_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1165:1: ( (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1166:2: (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1166:2: (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1167:3: this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getAspect_ASPECT_TOKENTerminalRuleCall_0ElementType());
            		
            this_ASPECT_TOKEN_0=(Token)match(input,RULE_ASPECT_TOKEN,FOLLOW_4); 

            			doneLeaf(this_ASPECT_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1174:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1175:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1175:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1176:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getAspect_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleConcept"
    // PsiInternalOntologicalModelingLanguage.g:1195:1: entryRuleConcept returns [Boolean current=false] : iv_ruleConcept= ruleConcept EOF ;
    public final Boolean entryRuleConcept() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConcept = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1195:49: (iv_ruleConcept= ruleConcept EOF )
            // PsiInternalOntologicalModelingLanguage.g:1196:2: iv_ruleConcept= ruleConcept EOF
            {
             markComposite(elementTypeProvider.getConceptElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // PsiInternalOntologicalModelingLanguage.g:1202:1: ruleConcept returns [Boolean current=false] : ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final Boolean ruleConcept() throws RecognitionException {
        Boolean current = false;

        Token lv_isAbstract_0_0=null;
        Token this_CONCEPT_TOKEN_1=null;
        Token lv_name_2_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1203:1: ( ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1204:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1204:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1205:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1205:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ABSTRACT_TOKEN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1206:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1206:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1207:5: lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getConcept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType());
                    				
                    lv_isAbstract_0_0=(Token)match(input,RULE_ABSTRACT_TOKEN,FOLLOW_13); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isAbstract_0_0);
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getConcept_CONCEPT_TOKENTerminalRuleCall_1ElementType());
            		
            this_CONCEPT_TOKEN_1=(Token)match(input,RULE_CONCEPT_TOKEN,FOLLOW_4); 

            			doneLeaf(this_CONCEPT_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:1229:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1230:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1230:4: (lv_name_2_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1231:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getConcept_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleReifiedRelationship"
    // PsiInternalOntologicalModelingLanguage.g:1250:1: entryRuleReifiedRelationship returns [Boolean current=false] : iv_ruleReifiedRelationship= ruleReifiedRelationship EOF ;
    public final Boolean entryRuleReifiedRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReifiedRelationship = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1250:61: (iv_ruleReifiedRelationship= ruleReifiedRelationship EOF )
            // PsiInternalOntologicalModelingLanguage.g:1251:2: iv_ruleReifiedRelationship= ruleReifiedRelationship EOF
            {
             markComposite(elementTypeProvider.getReifiedRelationshipElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationship=ruleReifiedRelationship();

            state._fsp--;

             current =iv_ruleReifiedRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationship"


    // $ANTLR start "ruleReifiedRelationship"
    // PsiInternalOntologicalModelingLanguage.g:1257:1: ruleReifiedRelationship returns [Boolean current=false] : ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY ) ;
    public final Boolean ruleReifiedRelationship() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalOntologicalModelingLanguage.g:1258:1: ( ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:1259:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:1259:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:1260:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY
            {
            // PsiInternalOntologicalModelingLanguage.g:1260:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ABSTRACT_TOKEN) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1261:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1261:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1262:5: lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType());
                    				
                    lv_isAbstract_0_0=(Token)match(input,RULE_ABSTRACT_TOKEN,FOLLOW_14); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isAbstract_0_0);
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getReifiedRelationship_REIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1ElementType());
            		
            this_REIFIED_RELATIONSHIP_TOKEN_1=(Token)match(input,RULE_REIFIED_RELATIONSHIP_TOKEN,FOLLOW_4); 

            			doneLeaf(this_REIFIED_RELATIONSHIP_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:1284:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1285:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1285:4: (lv_name_2_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1286:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getReifiedRelationship_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationship_LCURLYTerminalRuleCall_3ElementType());
            		
            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_15); 

            			doneLeaf(this_LCURLY_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:1308:3: ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_FUNCTIONAL_TOKEN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1309:4: (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1309:4: (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1310:5: lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType());
                    				
                    lv_isFunctional_4_0=(Token)match(input,RULE_FUNCTIONAL_TOKEN,FOLLOW_16); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isFunctional_4_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1325:3: ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INVERSE_FUNCTIONAL_TOKEN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1326:4: (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1326:4: (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1327:5: lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0ElementType());
                    				
                    lv_isInverseFunctional_5_0=(Token)match(input,RULE_INVERSE_FUNCTIONAL_TOKEN,FOLLOW_17); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isInverseFunctional_5_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1342:3: ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ESSENTIAL_TOKEN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1343:4: (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1343:4: (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1344:5: lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0ElementType());
                    				
                    lv_isEssential_6_0=(Token)match(input,RULE_ESSENTIAL_TOKEN,FOLLOW_18); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isEssential_6_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1359:3: ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INVERSE_ESSENTIAL_TOKEN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1360:4: (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1360:4: (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1361:5: lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0ElementType());
                    				
                    lv_isInverseEssential_7_0=(Token)match(input,RULE_INVERSE_ESSENTIAL_TOKEN,FOLLOW_19); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isInverseEssential_7_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1376:3: ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SYMMETRIC_TOKEN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1377:4: (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1377:4: (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1378:5: lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0ElementType());
                    				
                    lv_isSymmetric_8_0=(Token)match(input,RULE_SYMMETRIC_TOKEN,FOLLOW_20); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isSymmetric_8_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1393:3: ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ASYMMETRIC_TOKEN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1394:4: (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1394:4: (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1395:5: lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0ElementType());
                    				
                    lv_isAsymmetric_9_0=(Token)match(input,RULE_ASYMMETRIC_TOKEN,FOLLOW_21); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isAsymmetric_9_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1410:3: ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_REFLEXIVE_TOKEN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1411:4: (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1411:4: (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1412:5: lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType());
                    				
                    lv_isReflexive_10_0=(Token)match(input,RULE_REFLEXIVE_TOKEN,FOLLOW_22); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isReflexive_10_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1427:3: ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IRREFLEXIVE_TOKEN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1428:4: (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1428:4: (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1429:5: lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0ElementType());
                    				
                    lv_isIrreflexive_11_0=(Token)match(input,RULE_IRREFLEXIVE_TOKEN,FOLLOW_23); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isIrreflexive_11_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1444:3: ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_TRANSITIVE_TOKEN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1445:4: (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1445:4: (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1446:5: lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0ElementType());
                    				
                    lv_isTransitive_12_0=(Token)match(input,RULE_TRANSITIVE_TOKEN,FOLLOW_24); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isTransitive_12_0);
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getReifiedRelationship_UNREIFIED_TOKENTerminalRuleCall_13ElementType());
            		
            this_UNREIFIED_TOKEN_13=(Token)match(input,RULE_UNREIFIED_TOKEN,FOLLOW_5); 

            			doneLeaf(this_UNREIFIED_TOKEN_13);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_14ElementType());
            		
            this_EQUAL_14=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			doneLeaf(this_EQUAL_14);
            		
            // PsiInternalOntologicalModelingLanguage.g:1475:3: ( (lv_unreifiedPropertyName_15_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1476:4: (lv_unreifiedPropertyName_15_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1476:4: (lv_unreifiedPropertyName_15_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1477:5: lv_unreifiedPropertyName_15_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0ElementType());
            				
            lv_unreifiedPropertyName_15_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_unreifiedPropertyName_15_0);
            				

            }


            }

            // PsiInternalOntologicalModelingLanguage.g:1492:3: (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INVERSE_TOKEN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1493:4: this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0ElementType());
                    			
                    this_INVERSE_TOKEN_16=(Token)match(input,RULE_INVERSE_TOKEN,FOLLOW_5); 

                    				doneLeaf(this_INVERSE_TOKEN_16);
                    			

                    				markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_16_1ElementType());
                    			
                    this_EQUAL_17=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

                    				doneLeaf(this_EQUAL_17);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:1507:4: ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) )
                    // PsiInternalOntologicalModelingLanguage.g:1508:5: (lv_unreifiedInversePropertyName_18_0= RULE_ID )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1508:5: (lv_unreifiedInversePropertyName_18_0= RULE_ID )
                    // PsiInternalOntologicalModelingLanguage.g:1509:6: lv_unreifiedInversePropertyName_18_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0ElementType());
                    					
                    lv_unreifiedInversePropertyName_18_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_unreifiedInversePropertyName_18_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getReifiedRelationship_SOURCE_TOKENTerminalRuleCall_17ElementType());
            		
            this_SOURCE_TOKEN_19=(Token)match(input,RULE_SOURCE_TOKEN,FOLLOW_5); 

            			doneLeaf(this_SOURCE_TOKEN_19);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_18ElementType());
            		
            this_EQUAL_20=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			doneLeaf(this_EQUAL_20);
            		
            // PsiInternalOntologicalModelingLanguage.g:1539:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1540:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1540:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1541:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationship_SourceEntityCrossReference_19_0ElementType());
            				
            pushFollow(FOLLOW_28);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationship_TARGET_TOKENTerminalRuleCall_20ElementType());
            		
            this_TARGET_TOKEN_22=(Token)match(input,RULE_TARGET_TOKEN,FOLLOW_5); 

            			doneLeaf(this_TARGET_TOKEN_22);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_21ElementType());
            		
            this_EQUAL_23=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			doneLeaf(this_EQUAL_23);
            		
            // PsiInternalOntologicalModelingLanguage.g:1570:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1571:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1571:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1572:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationship_TargetEntityCrossReference_22_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationship_RCURLYTerminalRuleCall_23ElementType());
            		
            this_RCURLY_25=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_25);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationship"


    // $ANTLR start "entryRuleUnreifiedRelationship"
    // PsiInternalOntologicalModelingLanguage.g:1598:1: entryRuleUnreifiedRelationship returns [Boolean current=false] : iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF ;
    public final Boolean entryRuleUnreifiedRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUnreifiedRelationship = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1598:63: (iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF )
            // PsiInternalOntologicalModelingLanguage.g:1599:2: iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF
            {
             markComposite(elementTypeProvider.getUnreifiedRelationshipElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnreifiedRelationship=ruleUnreifiedRelationship();

            state._fsp--;

             current =iv_ruleUnreifiedRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnreifiedRelationship"


    // $ANTLR start "ruleUnreifiedRelationship"
    // PsiInternalOntologicalModelingLanguage.g:1605:1: ruleUnreifiedRelationship returns [Boolean current=false] : (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY ) ;
    public final Boolean ruleUnreifiedRelationship() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalOntologicalModelingLanguage.g:1606:1: ( (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:1607:2: (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:1607:2: (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:1608:3: this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getUnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0ElementType());
            		
            this_UNREIFIED_RELATIONSHIP_TOKEN_0=(Token)match(input,RULE_UNREIFIED_RELATIONSHIP_TOKEN,FOLLOW_4); 

            			doneLeaf(this_UNREIFIED_RELATIONSHIP_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1615:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1616:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1616:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1617:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getUnreifiedRelationship_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationship_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_30); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:1639:3: ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_FUNCTIONAL_TOKEN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1640:4: (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1640:4: (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1641:5: lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0ElementType());
                    				
                    lv_isFunctional_3_0=(Token)match(input,RULE_FUNCTIONAL_TOKEN,FOLLOW_31); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isFunctional_3_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1656:3: ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INVERSE_FUNCTIONAL_TOKEN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1657:4: (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1657:4: (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1658:5: lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType());
                    				
                    lv_isInverseFunctional_4_0=(Token)match(input,RULE_INVERSE_FUNCTIONAL_TOKEN,FOLLOW_32); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isInverseFunctional_4_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1673:3: ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ESSENTIAL_TOKEN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1674:4: (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1674:4: (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1675:5: lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0ElementType());
                    				
                    lv_isEssential_5_0=(Token)match(input,RULE_ESSENTIAL_TOKEN,FOLLOW_33); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isEssential_5_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1690:3: ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INVERSE_ESSENTIAL_TOKEN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1691:4: (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1691:4: (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1692:5: lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0ElementType());
                    				
                    lv_isInverseEssential_6_0=(Token)match(input,RULE_INVERSE_ESSENTIAL_TOKEN,FOLLOW_34); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isInverseEssential_6_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1707:3: ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_SYMMETRIC_TOKEN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1708:4: (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1708:4: (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1709:5: lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0ElementType());
                    				
                    lv_isSymmetric_7_0=(Token)match(input,RULE_SYMMETRIC_TOKEN,FOLLOW_35); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isSymmetric_7_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1724:3: ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ASYMMETRIC_TOKEN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1725:4: (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1725:4: (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1726:5: lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0ElementType());
                    				
                    lv_isAsymmetric_8_0=(Token)match(input,RULE_ASYMMETRIC_TOKEN,FOLLOW_36); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isAsymmetric_8_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1741:3: ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_REFLEXIVE_TOKEN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1742:4: (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1742:4: (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1743:5: lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0ElementType());
                    				
                    lv_isReflexive_9_0=(Token)match(input,RULE_REFLEXIVE_TOKEN,FOLLOW_37); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isReflexive_9_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1758:3: ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_IRREFLEXIVE_TOKEN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1759:4: (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1759:4: (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1760:5: lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType());
                    				
                    lv_isIrreflexive_10_0=(Token)match(input,RULE_IRREFLEXIVE_TOKEN,FOLLOW_38); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isIrreflexive_10_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1775:3: ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_TRANSITIVE_TOKEN) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1776:4: (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1776:4: (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1777:5: lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0ElementType());
                    				
                    lv_isTransitive_11_0=(Token)match(input,RULE_TRANSITIVE_TOKEN,FOLLOW_26); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isTransitive_11_0);
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationship_SOURCE_TOKENTerminalRuleCall_12ElementType());
            		
            this_SOURCE_TOKEN_12=(Token)match(input,RULE_SOURCE_TOKEN,FOLLOW_5); 

            			doneLeaf(this_SOURCE_TOKEN_12);
            		

            			markLeaf(elementTypeProvider.getUnreifiedRelationship_EQUALTerminalRuleCall_13ElementType());
            		
            this_EQUAL_13=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			doneLeaf(this_EQUAL_13);
            		
            // PsiInternalOntologicalModelingLanguage.g:1806:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1807:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1807:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1808:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getUnreifiedRelationship_SourceEntityCrossReference_14_0ElementType());
            				
            pushFollow(FOLLOW_28);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15ElementType());
            		
            this_TARGET_TOKEN_15=(Token)match(input,RULE_TARGET_TOKEN,FOLLOW_5); 

            			doneLeaf(this_TARGET_TOKEN_15);
            		

            			markLeaf(elementTypeProvider.getUnreifiedRelationship_EQUALTerminalRuleCall_16ElementType());
            		
            this_EQUAL_16=(Token)match(input,RULE_EQUAL,FOLLOW_27); 

            			doneLeaf(this_EQUAL_16);
            		
            // PsiInternalOntologicalModelingLanguage.g:1837:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1838:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1838:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1839:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getUnreifiedRelationship_TargetEntityCrossReference_17_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationship_RCURLYTerminalRuleCall_18ElementType());
            		
            this_RCURLY_18=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_18);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnreifiedRelationship"


    // $ANTLR start "entryRuleScalar"
    // PsiInternalOntologicalModelingLanguage.g:1865:1: entryRuleScalar returns [Boolean current=false] : iv_ruleScalar= ruleScalar EOF ;
    public final Boolean entryRuleScalar() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalar = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1865:48: (iv_ruleScalar= ruleScalar EOF )
            // PsiInternalOntologicalModelingLanguage.g:1866:2: iv_ruleScalar= ruleScalar EOF
            {
             markComposite(elementTypeProvider.getScalarElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalar=ruleScalar();

            state._fsp--;

             current =iv_ruleScalar; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalar"


    // $ANTLR start "ruleScalar"
    // PsiInternalOntologicalModelingLanguage.g:1872:1: ruleScalar returns [Boolean current=false] : (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleScalar() throws RecognitionException {
        Boolean current = false;

        Token this_SCALAR_TOKEN_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1873:1: ( (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1874:2: (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1874:2: (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1875:3: this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getScalar_SCALAR_TOKENTerminalRuleCall_0ElementType());
            		
            this_SCALAR_TOKEN_0=(Token)match(input,RULE_SCALAR_TOKEN,FOLLOW_4); 

            			doneLeaf(this_SCALAR_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1882:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1883:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1883:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1884:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getScalar_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalar"


    // $ANTLR start "entryRuleStructure"
    // PsiInternalOntologicalModelingLanguage.g:1903:1: entryRuleStructure returns [Boolean current=false] : iv_ruleStructure= ruleStructure EOF ;
    public final Boolean entryRuleStructure() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStructure = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1903:51: (iv_ruleStructure= ruleStructure EOF )
            // PsiInternalOntologicalModelingLanguage.g:1904:2: iv_ruleStructure= ruleStructure EOF
            {
             markComposite(elementTypeProvider.getStructureElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // PsiInternalOntologicalModelingLanguage.g:1910:1: ruleStructure returns [Boolean current=false] : (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleStructure() throws RecognitionException {
        Boolean current = false;

        Token this_STRUCTURE_TOKEN_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1911:1: ( (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1912:2: (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1912:2: (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1913:3: this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getStructure_STRUCTURE_TOKENTerminalRuleCall_0ElementType());
            		
            this_STRUCTURE_TOKEN_0=(Token)match(input,RULE_STRUCTURE_TOKEN,FOLLOW_4); 

            			doneLeaf(this_STRUCTURE_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1920:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1921:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1921:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1922:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getStructure_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleEntityStructuredDataProperty"
    // PsiInternalOntologicalModelingLanguage.g:1941:1: entryRuleEntityStructuredDataProperty returns [Boolean current=false] : iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF ;
    public final Boolean entryRuleEntityStructuredDataProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityStructuredDataProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1941:70: (iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:1942:2: iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF
            {
             markComposite(elementTypeProvider.getEntityStructuredDataPropertyElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityStructuredDataProperty=ruleEntityStructuredDataProperty();

            state._fsp--;

             current =iv_ruleEntityStructuredDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityStructuredDataProperty"


    // $ANTLR start "ruleEntityStructuredDataProperty"
    // PsiInternalOntologicalModelingLanguage.g:1948:1: ruleEntityStructuredDataProperty returns [Boolean current=false] : (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleEntityStructuredDataProperty() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1949:1: ( (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:1950:2: (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:1950:2: (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:1951:3: otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,75,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1958:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1959:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1959:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1960:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEntityStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_39); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			doneLeaf(this_DOMAIN_TOKEN_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:1989:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1990:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1990:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1991:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityStructuredDataProperty_DomainEntityCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
            		
            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			doneLeaf(this_RANGE_TOKEN_5);
            		
            // PsiInternalOntologicalModelingLanguage.g:2013:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2014:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2014:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2015:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityStructuredDataProperty_RangeStructureCrossReference_6_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType());
            		
            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_7);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityStructuredDataProperty"


    // $ANTLR start "entryRuleEntityScalarDataProperty"
    // PsiInternalOntologicalModelingLanguage.g:2041:1: entryRuleEntityScalarDataProperty returns [Boolean current=false] : iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF ;
    public final Boolean entryRuleEntityScalarDataProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2041:66: (iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:2042:2: iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF
            {
             markComposite(elementTypeProvider.getEntityScalarDataPropertyElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataProperty=ruleEntityScalarDataProperty();

            state._fsp--;

             current =iv_ruleEntityScalarDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataProperty"


    // $ANTLR start "ruleEntityScalarDataProperty"
    // PsiInternalOntologicalModelingLanguage.g:2048:1: ruleEntityScalarDataProperty returns [Boolean current=false] : (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleEntityScalarDataProperty() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2049:1: ( (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2050:2: (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2050:2: (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2051:3: otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_EntityScalarDataPropertyKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,76,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:2058:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:2059:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:2059:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:2060:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEntityScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_39); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			doneLeaf(this_DOMAIN_TOKEN_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:2089:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2090:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2090:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2091:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataProperty_DomainEntityCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
            		
            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			doneLeaf(this_RANGE_TOKEN_5);
            		
            // PsiInternalOntologicalModelingLanguage.g:2113:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2114:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2114:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2115:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_RCURLYTerminalRuleCall_7ElementType());
            		
            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_7);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataProperty"


    // $ANTLR start "entryRuleStructuredDataProperty"
    // PsiInternalOntologicalModelingLanguage.g:2141:1: entryRuleStructuredDataProperty returns [Boolean current=false] : iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF ;
    public final Boolean entryRuleStructuredDataProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStructuredDataProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2141:64: (iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:2142:2: iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF
            {
             markComposite(elementTypeProvider.getStructuredDataPropertyElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructuredDataProperty=ruleStructuredDataProperty();

            state._fsp--;

             current =iv_ruleStructuredDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuredDataProperty"


    // $ANTLR start "ruleStructuredDataProperty"
    // PsiInternalOntologicalModelingLanguage.g:2148:1: ruleStructuredDataProperty returns [Boolean current=false] : (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleStructuredDataProperty() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2149:1: ( (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2150:2: (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2150:2: (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2151:3: otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getStructuredDataProperty_StructuredDataPropertyKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,77,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:2158:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:2159:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:2159:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:2160:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_39); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			doneLeaf(this_DOMAIN_TOKEN_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:2189:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2190:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2190:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2191:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStructuredDataProperty_DomainStructureCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
            		
            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			doneLeaf(this_RANGE_TOKEN_5);
            		
            // PsiInternalOntologicalModelingLanguage.g:2213:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2214:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2214:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2215:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStructuredDataProperty_RangeStructureCrossReference_6_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType());
            		
            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_7);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuredDataProperty"


    // $ANTLR start "entryRuleScalarDataProperty"
    // PsiInternalOntologicalModelingLanguage.g:2241:1: entryRuleScalarDataProperty returns [Boolean current=false] : iv_ruleScalarDataProperty= ruleScalarDataProperty EOF ;
    public final Boolean entryRuleScalarDataProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarDataProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2241:60: (iv_ruleScalarDataProperty= ruleScalarDataProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:2242:2: iv_ruleScalarDataProperty= ruleScalarDataProperty EOF
            {
             markComposite(elementTypeProvider.getScalarDataPropertyElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarDataProperty=ruleScalarDataProperty();

            state._fsp--;

             current =iv_ruleScalarDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarDataProperty"


    // $ANTLR start "ruleScalarDataProperty"
    // PsiInternalOntologicalModelingLanguage.g:2248:1: ruleScalarDataProperty returns [Boolean current=false] : (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleScalarDataProperty() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2249:1: ( (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2250:2: (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2250:2: (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2251:3: otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getScalarDataProperty_ScalarDataPropertyKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,78,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:2258:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:2259:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:2259:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:2260:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarDataProperty_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_39); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			doneLeaf(this_DOMAIN_TOKEN_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:2289:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2290:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2290:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2291:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarDataProperty_DomainStructureCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
            		
            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			doneLeaf(this_RANGE_TOKEN_5);
            		
            // PsiInternalOntologicalModelingLanguage.g:2313:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2314:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2314:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2315:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarDataProperty_RCURLYTerminalRuleCall_7ElementType());
            		
            this_RCURLY_7=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_7);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarDataProperty"


    // $ANTLR start "entryRuleAnonymousConceptTaxonomyAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2341:1: entryRuleAnonymousConceptTaxonomyAxiom returns [Boolean current=false] : iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF ;
    public final Boolean entryRuleAnonymousConceptTaxonomyAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAnonymousConceptTaxonomyAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2341:71: (iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2342:2: iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF
            {
             markComposite(elementTypeProvider.getAnonymousConceptTaxonomyAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousConceptTaxonomyAxiom=ruleAnonymousConceptTaxonomyAxiom();

            state._fsp--;

             current =iv_ruleAnonymousConceptTaxonomyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnonymousConceptTaxonomyAxiom"


    // $ANTLR start "ruleAnonymousConceptTaxonomyAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2348:1: ruleAnonymousConceptTaxonomyAxiom returns [Boolean current=false] : (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleAnonymousConceptTaxonomyAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2349:1: ( (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2350:2: (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2350:2: (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2351:3: this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=(Token)match(input,RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_41); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2372:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2373:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2373:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2374:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType());
            		
            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnonymousConceptTaxonomyAxiom"


    // $ANTLR start "entryRuleRootConceptTaxonomyAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2400:1: entryRuleRootConceptTaxonomyAxiom returns [Boolean current=false] : iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF ;
    public final Boolean entryRuleRootConceptTaxonomyAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRootConceptTaxonomyAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2400:66: (iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2401:2: iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF
            {
             markComposite(elementTypeProvider.getRootConceptTaxonomyAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootConceptTaxonomyAxiom=ruleRootConceptTaxonomyAxiom();

            state._fsp--;

             current =iv_ruleRootConceptTaxonomyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootConceptTaxonomyAxiom"


    // $ANTLR start "ruleRootConceptTaxonomyAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2407:1: ruleRootConceptTaxonomyAxiom returns [Boolean current=false] : (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleRootConceptTaxonomyAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2408:1: ( (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2409:2: (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2409:2: (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2410:3: this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=(Token)match(input,RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_42); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_RootKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2431:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2432:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2432:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2433:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getRootConceptTaxonomyAxiom_RootConceptCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType());
            		
            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootConceptTaxonomyAxiom"


    // $ANTLR start "entryRuleSpecificDisjointConceptAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2459:1: entryRuleSpecificDisjointConceptAxiom returns [Boolean current=false] : iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF ;
    public final Boolean entryRuleSpecificDisjointConceptAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSpecificDisjointConceptAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2459:70: (iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2460:2: iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF
            {
             markComposite(elementTypeProvider.getSpecificDisjointConceptAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecificDisjointConceptAxiom=ruleSpecificDisjointConceptAxiom();

            state._fsp--;

             current =iv_ruleSpecificDisjointConceptAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecificDisjointConceptAxiom"


    // $ANTLR start "ruleSpecificDisjointConceptAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2466:1: ruleSpecificDisjointConceptAxiom returns [Boolean current=false] : (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleSpecificDisjointConceptAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2467:1: ( (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2468:2: (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2468:2: (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2469:3: this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0=(Token)match(input,RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_41); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2490:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2491:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2491:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2492:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_43);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointLeafKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,81,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2514:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2515:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2515:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2516:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecificDisjointConceptAxiom"


    // $ANTLR start "entryRuleBundledTerminologyAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2542:1: entryRuleBundledTerminologyAxiom returns [Boolean current=false] : iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF ;
    public final Boolean entryRuleBundledTerminologyAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBundledTerminologyAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2542:65: (iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2543:2: iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF
            {
             markComposite(elementTypeProvider.getBundledTerminologyAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleBundledTerminologyAxiom=ruleBundledTerminologyAxiom();

            state._fsp--;

             current =iv_ruleBundledTerminologyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBundledTerminologyAxiom"


    // $ANTLR start "ruleBundledTerminologyAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2549:1: ruleBundledTerminologyAxiom returns [Boolean current=false] : (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleBundledTerminologyAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2550:1: ( (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2551:2: (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2551:2: (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2552:3: this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0=(Token)match(input,RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_44); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_BundledTerminologyKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,82,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2573:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2574:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2574:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2575:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getBundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_RCURLYTerminalRuleCall_4ElementType());
            		
            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundledTerminologyAxiom"


    // $ANTLR start "entryRuleConceptDesignationTerminologyAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2601:1: entryRuleConceptDesignationTerminologyAxiom returns [Boolean current=false] : iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF ;
    public final Boolean entryRuleConceptDesignationTerminologyAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConceptDesignationTerminologyAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2601:76: (iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2602:2: iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF
            {
             markComposite(elementTypeProvider.getConceptDesignationTerminologyAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptDesignationTerminologyAxiom=ruleConceptDesignationTerminologyAxiom();

            state._fsp--;

             current =iv_ruleConceptDesignationTerminologyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConceptDesignationTerminologyAxiom"


    // $ANTLR start "ruleConceptDesignationTerminologyAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2608:1: ruleConceptDesignationTerminologyAxiom returns [Boolean current=false] : (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleConceptDesignationTerminologyAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2609:1: ( (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2610:2: (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2610:2: (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2611:3: this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0=(Token)match(input,RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_45); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,83,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2632:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2633:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2633:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2634:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_46);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,84,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2656:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2657:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2657:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2658:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConceptDesignationTerminologyAxiom"


    // $ANTLR start "entryRuleTerminologyExtensionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2684:1: entryRuleTerminologyExtensionAxiom returns [Boolean current=false] : iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF ;
    public final Boolean entryRuleTerminologyExtensionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyExtensionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2684:67: (iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2685:2: iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF
            {
             markComposite(elementTypeProvider.getTerminologyExtensionAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyExtensionAxiom=ruleTerminologyExtensionAxiom();

            state._fsp--;

             current =iv_ruleTerminologyExtensionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyExtensionAxiom"


    // $ANTLR start "ruleTerminologyExtensionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2691:1: ruleTerminologyExtensionAxiom returns [Boolean current=false] : (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) ) ;
    public final Boolean ruleTerminologyExtensionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_EXTENDS_TOKEN_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2692:1: ( (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:2693:2: (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:2693:2: (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) )
            // PsiInternalOntologicalModelingLanguage.g:2694:3: this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) )
            {

            			markLeaf(elementTypeProvider.getTerminologyExtensionAxiom_EXTENDS_TOKENTerminalRuleCall_0ElementType());
            		
            this_EXTENDS_TOKEN_0=(Token)match(input,RULE_EXTENDS_TOKEN,FOLLOW_27); 

            			doneLeaf(this_EXTENDS_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:2701:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2702:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2702:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2703:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getTerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxCrossReference_1_0ElementType());
            				
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyExtensionAxiom"


    // $ANTLR start "entryRuleTerminologyNestingAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2722:1: entryRuleTerminologyNestingAxiom returns [Boolean current=false] : iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF ;
    public final Boolean entryRuleTerminologyNestingAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyNestingAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2722:65: (iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2723:2: iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF
            {
             markComposite(elementTypeProvider.getTerminologyNestingAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyNestingAxiom=ruleTerminologyNestingAxiom();

            state._fsp--;

             current =iv_ruleTerminologyNestingAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyNestingAxiom"


    // $ANTLR start "ruleTerminologyNestingAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2729:1: ruleTerminologyNestingAxiom returns [Boolean current=false] : (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleTerminologyNestingAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2730:1: ( (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2731:2: (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2731:2: (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2732:3: this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0=(Token)match(input,RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_47); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_NestingTerminologyKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,85,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2753:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2754:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2754:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2755:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getTerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_48);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_NestingContextKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,86,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2777:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2778:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2778:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2779:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getTerminologyNestingAxiom_NestingContextConceptCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyNestingAxiom"


    // $ANTLR start "entryRuleEntityExistentialRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2805:1: entryRuleEntityExistentialRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityExistentialRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityExistentialRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2805:75: (iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2806:2: iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF
            {
             markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityExistentialRestrictionAxiom=ruleEntityExistentialRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityExistentialRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityExistentialRestrictionAxiom"


    // $ANTLR start "ruleEntityExistentialRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2812:1: ruleEntityExistentialRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityExistentialRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2813:1: ( (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2814:2: (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2814:2: (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2815:3: this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_49); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,87,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2836:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2837:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2837:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2838:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_50);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2860:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2861:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2861:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2862:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_51);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,89,FOLLOW_27); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:2884:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2885:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2885:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2886:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
            		
            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityExistentialRestrictionAxiom"


    // $ANTLR start "entryRuleEntityUniversalRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2912:1: entryRuleEntityUniversalRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityUniversalRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityUniversalRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2912:73: (iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2913:2: iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF
            {
             markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityUniversalRestrictionAxiom=ruleEntityUniversalRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityUniversalRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityUniversalRestrictionAxiom"


    // $ANTLR start "ruleEntityUniversalRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:2919:1: ruleEntityUniversalRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityUniversalRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2920:1: ( (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2921:2: (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2921:2: (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2922:3: this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_49); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,87,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2943:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2944:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2944:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2945:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_50);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2967:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2968:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2968:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2969:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_51);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,89,FOLLOW_27); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:2991:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2992:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2992:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2993:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
            		
            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityUniversalRestrictionAxiom"


    // $ANTLR start "entryRuleAspectSpecializationAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3019:1: entryRuleAspectSpecializationAxiom returns [Boolean current=false] : iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF ;
    public final Boolean entryRuleAspectSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAspectSpecializationAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3019:67: (iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3020:2: iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF
            {
             markComposite(elementTypeProvider.getAspectSpecializationAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAspectSpecializationAxiom=ruleAspectSpecializationAxiom();

            state._fsp--;

             current =iv_ruleAspectSpecializationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAspectSpecializationAxiom"


    // $ANTLR start "ruleAspectSpecializationAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3026:1: ruleAspectSpecializationAxiom returns [Boolean current=false] : ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) ) ;
    public final Boolean ruleAspectSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3027:1: ( ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:3028:2: ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:3028:2: ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) )
            // PsiInternalOntologicalModelingLanguage.g:3029:3: ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:3029:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3030:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3030:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3031:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getAspectSpecializationAxiom_SubEntityEntityCrossReference_0_0ElementType());
            				
            pushFollow(FOLLOW_52);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getAspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1ElementType());
            		
            this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1=(Token)match(input,RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_27); 

            			doneLeaf(this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:3053:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3054:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3054:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3055:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getAspectSpecializationAxiom_SuperAspectAspectCrossReference_2_0ElementType());
            				
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAspectSpecializationAxiom"


    // $ANTLR start "entryRuleConceptSpecializationAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3074:1: entryRuleConceptSpecializationAxiom returns [Boolean current=false] : iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF ;
    public final Boolean entryRuleConceptSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConceptSpecializationAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3074:68: (iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3075:2: iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF
            {
             markComposite(elementTypeProvider.getConceptSpecializationAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptSpecializationAxiom=ruleConceptSpecializationAxiom();

            state._fsp--;

             current =iv_ruleConceptSpecializationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConceptSpecializationAxiom"


    // $ANTLR start "ruleConceptSpecializationAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3081:1: ruleConceptSpecializationAxiom returns [Boolean current=false] : (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleConceptSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3082:1: ( (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3083:2: (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3083:2: (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3084:3: this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0=(Token)match(input,RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_53); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_SubConceptKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,90,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3105:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3106:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3106:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3107:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_54);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_SuperConceptKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,91,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3129:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3130:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3130:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3131:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConceptSpecializationAxiom"


    // $ANTLR start "entryRuleReifiedRelationshipSpecializationAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3157:1: entryRuleReifiedRelationshipSpecializationAxiom returns [Boolean current=false] : iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF ;
    public final Boolean entryRuleReifiedRelationshipSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReifiedRelationshipSpecializationAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3157:80: (iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3158:2: iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF
            {
             markComposite(elementTypeProvider.getReifiedRelationshipSpecializationAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationshipSpecializationAxiom=ruleReifiedRelationshipSpecializationAxiom();

            state._fsp--;

             current =iv_ruleReifiedRelationshipSpecializationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationshipSpecializationAxiom"


    // $ANTLR start "ruleReifiedRelationshipSpecializationAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3164:1: ruleReifiedRelationshipSpecializationAxiom returns [Boolean current=false] : (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleReifiedRelationshipSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3165:1: ( (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3166:2: (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3166:2: (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3167:3: this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0=(Token)match(input,RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_55); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3188:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3189:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3189:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3190:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_56);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,93,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3212:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3213:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3213:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3214:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationshipSpecializationAxiom"


    // $ANTLR start "entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3240:1: entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3240:93: (iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3241:2: iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF
            {
             markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom=ruleEntityScalarDataPropertyExistentialRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom"


    // $ANTLR start "ruleEntityScalarDataPropertyExistentialRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3247:1: ruleEntityScalarDataPropertyExistentialRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityScalarDataPropertyExistentialRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3248:1: ( (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3249:2: (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3249:2: (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3250:3: this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_57); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3271:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3272:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3272:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3273:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_58);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,95,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3295:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3296:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3296:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3297:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_59);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,96,FOLLOW_27); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:3319:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3320:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3320:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3321:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
            		
            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataPropertyExistentialRestrictionAxiom"


    // $ANTLR start "entryRuleEntityScalarDataPropertyParticularRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3347:1: entryRuleEntityScalarDataPropertyParticularRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityScalarDataPropertyParticularRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3347:92: (iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3348:2: iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF
            {
             markComposite(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom=ruleEntityScalarDataPropertyParticularRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataPropertyParticularRestrictionAxiom"


    // $ANTLR start "ruleEntityScalarDataPropertyParticularRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3354:1: ruleEntityScalarDataPropertyParticularRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityScalarDataPropertyParticularRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_literalValue_7_0=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3355:1: ( (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3356:2: (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3356:2: (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3357:3: this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_57); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3378:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3379:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3379:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3380:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_58);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,95,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3402:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3403:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3403:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3404:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_60);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,97,FOLLOW_7); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:3426:3: ( (lv_literalValue_7_0= RULE_STRING ) )
            // PsiInternalOntologicalModelingLanguage.g:3427:4: (lv_literalValue_7_0= RULE_STRING )
            {
            // PsiInternalOntologicalModelingLanguage.g:3427:4: (lv_literalValue_7_0= RULE_STRING )
            // PsiInternalOntologicalModelingLanguage.g:3428:5: lv_literalValue_7_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0ElementType());
            				
            lv_literalValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_literalValue_7_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
            		
            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataPropertyParticularRestrictionAxiom"


    // $ANTLR start "entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3454:1: entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3454:91: (iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3455:2: iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF
            {
             markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom=ruleEntityScalarDataPropertyUniversalRestrictionAxiom();

            state._fsp--;

             current =iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom"


    // $ANTLR start "ruleEntityScalarDataPropertyUniversalRestrictionAxiom"
    // PsiInternalOntologicalModelingLanguage.g:3461:1: ruleEntityScalarDataPropertyUniversalRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityScalarDataPropertyUniversalRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3462:1: ( (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3463:2: (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3463:2: (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3464:3: this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_57); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3485:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3486:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3486:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3487:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_58);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,95,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3509:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3510:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3510:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3511:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_59);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,96,FOLLOW_27); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:3533:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3534:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3534:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3535:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
            		
            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityScalarDataPropertyUniversalRestrictionAxiom"


    // $ANTLR start "entryRuleBinaryScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:3561:1: entryRuleBinaryScalarRestriction returns [Boolean current=false] : iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF ;
    public final Boolean entryRuleBinaryScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBinaryScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3561:65: (iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:3562:2: iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF
            {
             markComposite(elementTypeProvider.getBinaryScalarRestrictionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryScalarRestriction=ruleBinaryScalarRestriction();

            state._fsp--;

             current =iv_ruleBinaryScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryScalarRestriction"


    // $ANTLR start "ruleBinaryScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:3568:1: ruleBinaryScalarRestriction returns [Boolean current=false] : (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY ) ;
    public final Boolean ruleBinaryScalarRestriction() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalOntologicalModelingLanguage.g:3569:1: ( (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3570:2: (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3570:2: (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3571:3: this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getBinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_BINARY_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_BINARY_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_BINARY_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:3578:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:3579:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:3579:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:3580:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getBinaryScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getBinaryScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_61); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3602:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==98) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3603:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getBinaryScalarRestriction_LengthKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,98,FOLLOW_62); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3610:4: ( (lv_length_4_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3611:5: (lv_length_4_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3611:5: (lv_length_4_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3612:6: lv_length_4_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getBinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_63); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_length_4_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:3628:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==99) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3629:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getBinaryScalarRestriction_MinLengthKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,99,FOLLOW_62); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3636:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3637:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3637:5: (lv_minLength_6_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3638:6: lv_minLength_6_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getBinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_64); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_minLength_6_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:3654:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==100) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3655:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getBinaryScalarRestriction_MaxLengthKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,100,FOLLOW_62); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3662:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3663:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3663:5: (lv_maxLength_8_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3664:6: lv_maxLength_8_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getBinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_maxLength_8_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getBinaryScalarRestriction_RestrictedRangeKeyword_6ElementType());
            		
            otherlv_9=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_9);
            		
            // PsiInternalOntologicalModelingLanguage.g:3687:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3688:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3688:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3689:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getBinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getBinaryScalarRestriction_RCURLYTerminalRuleCall_8ElementType());
            		
            this_RCURLY_11=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_11);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryScalarRestriction"


    // $ANTLR start "entryRuleIRIScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:3715:1: entryRuleIRIScalarRestriction returns [Boolean current=false] : iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF ;
    public final Boolean entryRuleIRIScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIRIScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3715:62: (iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:3716:2: iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF
            {
             markComposite(elementTypeProvider.getIRIScalarRestrictionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleIRIScalarRestriction=ruleIRIScalarRestriction();

            state._fsp--;

             current =iv_ruleIRIScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIRIScalarRestriction"


    // $ANTLR start "ruleIRIScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:3722:1: ruleIRIScalarRestriction returns [Boolean current=false] : (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
    public final Boolean ruleIRIScalarRestriction() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalOntologicalModelingLanguage.g:3723:1: ( (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3724:2: (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3724:2: (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3725:3: this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getIRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_IRI_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_IRI_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_IRI_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:3732:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:3733:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:3733:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:3734:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getIRIScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getIRIScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_65); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3756:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==98) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3757:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getIRIScalarRestriction_LengthKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,98,FOLLOW_62); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3764:4: ( (lv_length_4_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3765:5: (lv_length_4_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3765:5: (lv_length_4_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3766:6: lv_length_4_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getIRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_66); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_length_4_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:3782:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==99) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3783:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getIRIScalarRestriction_MinLengthKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,99,FOLLOW_62); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3790:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3791:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3791:5: (lv_minLength_6_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3792:6: lv_minLength_6_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getIRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_67); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_minLength_6_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:3808:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==100) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3809:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getIRIScalarRestriction_MaxLengthKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,100,FOLLOW_62); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3816:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3817:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3817:5: (lv_maxLength_8_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3818:6: lv_maxLength_8_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getIRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_68); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_maxLength_8_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:3834:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==101) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3835:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getIRIScalarRestriction_PatternKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,101,FOLLOW_7); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3842:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3843:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3843:5: (lv_pattern_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3844:6: lv_pattern_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getIRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_pattern_10_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getIRIScalarRestriction_RestrictedRangeKeyword_7ElementType());
            		
            otherlv_11=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalOntologicalModelingLanguage.g:3867:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3868:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3868:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3869:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getIRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getIRIScalarRestriction_RCURLYTerminalRuleCall_9ElementType());
            		
            this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_13);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIRIScalarRestriction"


    // $ANTLR start "entryRuleNumericScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:3895:1: entryRuleNumericScalarRestriction returns [Boolean current=false] : iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF ;
    public final Boolean entryRuleNumericScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNumericScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3895:66: (iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:3896:2: iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF
            {
             markComposite(elementTypeProvider.getNumericScalarRestrictionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericScalarRestriction=ruleNumericScalarRestriction();

            state._fsp--;

             current =iv_ruleNumericScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericScalarRestriction"


    // $ANTLR start "ruleNumericScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:3902:1: ruleNumericScalarRestriction returns [Boolean current=false] : (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
    public final Boolean ruleNumericScalarRestriction() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalOntologicalModelingLanguage.g:3903:1: ( (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3904:2: (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3904:2: (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3905:3: this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getNumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:3912:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:3913:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:3913:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:3914:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNumericScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getNumericScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_69); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3936:3: (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==102) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3937:4: otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getNumericScalarRestriction_MinInclusiveKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,102,FOLLOW_7); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3944:4: ( (lv_minInclusive_4_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3945:5: (lv_minInclusive_4_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3945:5: (lv_minInclusive_4_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3946:6: lv_minInclusive_4_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getNumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_minInclusive_4_0=(Token)match(input,RULE_STRING,FOLLOW_70); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_minInclusive_4_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:3962:3: (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==103) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3963:4: otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxInclusiveKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,103,FOLLOW_7); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3970:4: ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3971:5: (lv_maxInclusive_6_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3971:5: (lv_maxInclusive_6_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3972:6: lv_maxInclusive_6_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_maxInclusive_6_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_maxInclusive_6_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:3988:3: (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==104) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3989:4: otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getNumericScalarRestriction_MinExclusiveKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,104,FOLLOW_7); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3996:4: ( (lv_minExclusive_8_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3997:5: (lv_minExclusive_8_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3997:5: (lv_minExclusive_8_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3998:6: lv_minExclusive_8_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getNumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_minExclusive_8_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_minExclusive_8_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4014:3: (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==105) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4015:4: otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxExclusiveKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,105,FOLLOW_7); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4022:4: ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4023:5: (lv_maxExclusive_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4023:5: (lv_maxExclusive_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4024:6: lv_maxExclusive_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_maxExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_maxExclusive_10_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getNumericScalarRestriction_RestrictedRangeKeyword_7ElementType());
            		
            otherlv_11=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalOntologicalModelingLanguage.g:4047:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4048:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4048:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4049:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getNumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getNumericScalarRestriction_RCURLYTerminalRuleCall_9ElementType());
            		
            this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_13);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericScalarRestriction"


    // $ANTLR start "entryRulePlainLiteralScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4075:1: entryRulePlainLiteralScalarRestriction returns [Boolean current=false] : iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF ;
    public final Boolean entryRulePlainLiteralScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePlainLiteralScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4075:71: (iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4076:2: iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF
            {
             markComposite(elementTypeProvider.getPlainLiteralScalarRestrictionElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainLiteralScalarRestriction=rulePlainLiteralScalarRestriction();

            state._fsp--;

             current =iv_rulePlainLiteralScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlainLiteralScalarRestriction"


    // $ANTLR start "rulePlainLiteralScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4082:1: rulePlainLiteralScalarRestriction returns [Boolean current=false] : (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY ) ;
    public final Boolean rulePlainLiteralScalarRestriction() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalOntologicalModelingLanguage.g:4083:1: ( (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4084:2: (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4084:2: (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4085:3: this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4092:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4093:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4093:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4094:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_73); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:4116:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==98) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4117:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LengthKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,98,FOLLOW_62); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4124:4: ( (lv_length_4_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4125:5: (lv_length_4_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4125:5: (lv_length_4_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4126:6: lv_length_4_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_74); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_length_4_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4142:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==99) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4143:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MinLengthKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,99,FOLLOW_62); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4150:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4151:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4151:5: (lv_minLength_6_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4152:6: lv_minLength_6_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_75); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_minLength_6_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4168:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==100) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4169:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MaxLengthKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,100,FOLLOW_62); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4176:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4177:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4177:5: (lv_maxLength_8_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4178:6: lv_maxLength_8_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_76); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_maxLength_8_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4194:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==101) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4195:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PatternKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,101,FOLLOW_7); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4202:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4203:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4203:5: (lv_pattern_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4204:6: lv_pattern_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_77); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_pattern_10_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4220:3: (otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==106) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4221:4: otherlv_11= 'langRange' ( (lv_langRange_12_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LangRangeKeyword_7_0ElementType());
                    			
                    otherlv_11=(Token)match(input,106,FOLLOW_7); 

                    				doneLeaf(otherlv_11);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4228:4: ( (lv_langRange_12_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4229:5: (lv_langRange_12_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4229:5: (lv_langRange_12_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4230:6: lv_langRange_12_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LangRangeSTRINGTerminalRuleCall_7_1_0ElementType());
                    					
                    lv_langRange_12_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_langRange_12_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_RestrictedRangeKeyword_8ElementType());
            		
            otherlv_13=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_13);
            		
            // PsiInternalOntologicalModelingLanguage.g:4253:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4254:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4254:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4255:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getPlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_RCURLYTerminalRuleCall_10ElementType());
            		
            this_RCURLY_15=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_15);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlainLiteralScalarRestriction"


    // $ANTLR start "entryRuleScalarOneOfRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4281:1: entryRuleScalarOneOfRestriction returns [Boolean current=false] : iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF ;
    public final Boolean entryRuleScalarOneOfRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarOneOfRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4281:64: (iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4282:2: iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF
            {
             markComposite(elementTypeProvider.getScalarOneOfRestrictionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarOneOfRestriction=ruleScalarOneOfRestriction();

            state._fsp--;

             current =iv_ruleScalarOneOfRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarOneOfRestriction"


    // $ANTLR start "ruleScalarOneOfRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4288:1: ruleScalarOneOfRestriction returns [Boolean current=false] : (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) ;
    public final Boolean ruleScalarOneOfRestriction() throws RecognitionException {
        Boolean current = false;

        Token this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token this_RCURLY_5=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4289:1: ( (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4290:2: (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4290:2: (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4291:3: this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0=(Token)match(input,RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4298:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4299:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4299:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4300:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getScalarOneOfRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarOneOfRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_50); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getScalarOneOfRestriction_RestrictedRangeKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:4329:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4330:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4330:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4331:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarOneOfRestriction_RCURLYTerminalRuleCall_5ElementType());
            		
            this_RCURLY_5=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_5);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarOneOfRestriction"


    // $ANTLR start "entryRuleScalarOneOfLiteralAxiom"
    // PsiInternalOntologicalModelingLanguage.g:4357:1: entryRuleScalarOneOfLiteralAxiom returns [Boolean current=false] : iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF ;
    public final Boolean entryRuleScalarOneOfLiteralAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarOneOfLiteralAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4357:65: (iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:4358:2: iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF
            {
             markComposite(elementTypeProvider.getScalarOneOfLiteralAxiomElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarOneOfLiteralAxiom=ruleScalarOneOfLiteralAxiom();

            state._fsp--;

             current =iv_ruleScalarOneOfLiteralAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarOneOfLiteralAxiom"


    // $ANTLR start "ruleScalarOneOfLiteralAxiom"
    // PsiInternalOntologicalModelingLanguage.g:4364:1: ruleScalarOneOfLiteralAxiom returns [Boolean current=false] : (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleScalarOneOfLiteralAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4365:1: ( (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4366:2: (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4366:2: (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4367:3: this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0=(Token)match(input,RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN,FOLLOW_9); 

            			doneLeaf(this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_78); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_ValueKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,107,FOLLOW_7); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:4388:3: ( (lv_value_3_0= RULE_STRING ) )
            // PsiInternalOntologicalModelingLanguage.g:4389:4: (lv_value_3_0= RULE_STRING )
            {
            // PsiInternalOntologicalModelingLanguage.g:4389:4: (lv_value_3_0= RULE_STRING )
            // PsiInternalOntologicalModelingLanguage.g:4390:5: lv_value_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_value_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_AxiomKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,108,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:4412:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4413:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4413:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4414:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarOneOfLiteralAxiom"


    // $ANTLR start "entryRuleStringScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4440:1: entryRuleStringScalarRestriction returns [Boolean current=false] : iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF ;
    public final Boolean entryRuleStringScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStringScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4440:65: (iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4441:2: iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF
            {
             markComposite(elementTypeProvider.getStringScalarRestrictionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringScalarRestriction=ruleStringScalarRestriction();

            state._fsp--;

             current =iv_ruleStringScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringScalarRestriction"


    // $ANTLR start "ruleStringScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4447:1: ruleStringScalarRestriction returns [Boolean current=false] : (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
    public final Boolean ruleStringScalarRestriction() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalOntologicalModelingLanguage.g:4448:1: ( (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4449:2: (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4449:2: (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4450:3: this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getStringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_STRING_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_STRING_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_STRING_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4457:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4458:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4458:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4459:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getStringScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getStringScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_65); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:4481:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==98) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4482:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getStringScalarRestriction_LengthKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,98,FOLLOW_62); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4489:4: ( (lv_length_4_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4490:5: (lv_length_4_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4490:5: (lv_length_4_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4491:6: lv_length_4_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getStringScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_66); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_length_4_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4507:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==99) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4508:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getStringScalarRestriction_MinLengthKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,99,FOLLOW_62); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4515:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4516:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4516:5: (lv_minLength_6_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4517:6: lv_minLength_6_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getStringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_67); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_minLength_6_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4533:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==100) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4534:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getStringScalarRestriction_MaxLengthKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,100,FOLLOW_62); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4541:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4542:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4542:5: (lv_maxLength_8_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4543:6: lv_maxLength_8_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getStringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_68); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_maxLength_8_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4559:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==101) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4560:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getStringScalarRestriction_PatternKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,101,FOLLOW_7); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4567:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4568:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4568:5: (lv_pattern_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4569:6: lv_pattern_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getStringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_pattern_10_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getStringScalarRestriction_RestrictedRangeKeyword_7ElementType());
            		
            otherlv_11=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalOntologicalModelingLanguage.g:4592:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4593:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4593:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4594:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getStringScalarRestriction_RCURLYTerminalRuleCall_9ElementType());
            		
            this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_13);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringScalarRestriction"


    // $ANTLR start "entryRuleSynonymScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4620:1: entryRuleSynonymScalarRestriction returns [Boolean current=false] : iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF ;
    public final Boolean entryRuleSynonymScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSynonymScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4620:66: (iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4621:2: iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF
            {
             markComposite(elementTypeProvider.getSynonymScalarRestrictionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSynonymScalarRestriction=ruleSynonymScalarRestriction();

            state._fsp--;

             current =iv_ruleSynonymScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSynonymScalarRestriction"


    // $ANTLR start "ruleSynonymScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4627:1: ruleSynonymScalarRestriction returns [Boolean current=false] : (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) ;
    public final Boolean ruleSynonymScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Token this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token this_RCURLY_5=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4628:1: ( (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4629:2: (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4629:2: (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4630:3: this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getSynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4637:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4638:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4638:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4639:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSynonymScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getSynonymScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_50); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getSynonymScalarRestriction_RestrictedRangeKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:4668:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4669:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4669:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4670:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getSynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getSynonymScalarRestriction_RCURLYTerminalRuleCall_5ElementType());
            		
            this_RCURLY_5=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_5);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSynonymScalarRestriction"


    // $ANTLR start "entryRuleTimeScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4696:1: entryRuleTimeScalarRestriction returns [Boolean current=false] : iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF ;
    public final Boolean entryRuleTimeScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTimeScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4696:63: (iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4697:2: iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF
            {
             markComposite(elementTypeProvider.getTimeScalarRestrictionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeScalarRestriction=ruleTimeScalarRestriction();

            state._fsp--;

             current =iv_ruleTimeScalarRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeScalarRestriction"


    // $ANTLR start "ruleTimeScalarRestriction"
    // PsiInternalOntologicalModelingLanguage.g:4703:1: ruleTimeScalarRestriction returns [Boolean current=false] : (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
    public final Boolean ruleTimeScalarRestriction() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalOntologicalModelingLanguage.g:4704:1: ( (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4705:2: (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4705:2: (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4706:3: this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getTimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_TIME_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_TIME_SCALAR_RESTRICTION_TOKEN,FOLLOW_4); 

            			doneLeaf(this_TIME_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4713:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4714:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4714:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4715:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTimeScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getTimeScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_69); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:4737:3: (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==102) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4738:4: otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getTimeScalarRestriction_MinInclusiveKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,102,FOLLOW_7); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4745:4: ( (lv_minInclusive_4_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4746:5: (lv_minInclusive_4_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4746:5: (lv_minInclusive_4_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4747:6: lv_minInclusive_4_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getTimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_minInclusive_4_0=(Token)match(input,RULE_STRING,FOLLOW_70); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_minInclusive_4_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4763:3: (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==103) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4764:4: otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxInclusiveKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,103,FOLLOW_7); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4771:4: ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4772:5: (lv_maxInclusive_6_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4772:5: (lv_maxInclusive_6_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4773:6: lv_maxInclusive_6_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_maxInclusive_6_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_maxInclusive_6_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4789:3: (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==104) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4790:4: otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getTimeScalarRestriction_MinExclusiveKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,104,FOLLOW_7); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4797:4: ( (lv_minExclusive_8_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4798:5: (lv_minExclusive_8_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4798:5: (lv_minExclusive_8_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4799:6: lv_minExclusive_8_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getTimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_minExclusive_8_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_minExclusive_8_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:4815:3: (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==105) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4816:4: otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxExclusiveKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,105,FOLLOW_7); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4823:4: ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4824:5: (lv_maxExclusive_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4824:5: (lv_maxExclusive_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4825:6: lv_maxExclusive_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_maxExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_maxExclusive_10_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getTimeScalarRestriction_RestrictedRangeKeyword_7ElementType());
            		
            otherlv_11=(Token)match(input,88,FOLLOW_27); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalOntologicalModelingLanguage.g:4848:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4849:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4849:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4850:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getTimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTimeScalarRestriction_RCURLYTerminalRuleCall_9ElementType());
            		
            this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_13);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeScalarRestriction"


    // $ANTLR start "entryRuleDescriptionBox"
    // PsiInternalOntologicalModelingLanguage.g:4876:1: entryRuleDescriptionBox returns [Boolean current=false] : iv_ruleDescriptionBox= ruleDescriptionBox EOF ;
    public final Boolean entryRuleDescriptionBox() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescriptionBox = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4876:56: (iv_ruleDescriptionBox= ruleDescriptionBox EOF )
            // PsiInternalOntologicalModelingLanguage.g:4877:2: iv_ruleDescriptionBox= ruleDescriptionBox EOF
            {
             markComposite(elementTypeProvider.getDescriptionBoxElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionBox=ruleDescriptionBox();

            state._fsp--;

             current =iv_ruleDescriptionBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionBox"


    // $ANTLR start "ruleDescriptionBox"
    // PsiInternalOntologicalModelingLanguage.g:4883:1: ruleDescriptionBox returns [Boolean current=false] : ( ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY ) ;
    public final Boolean ruleDescriptionBox() throws RecognitionException {
        Boolean current = false;

        Token this_DESCRIPTION_BOX_TOKEN_1=null;
        Token lv_iri_2_0=null;
        Token this_LCURLY_3=null;
        Token this_RCURLY_12=null;
        Boolean lv_kind_0_0 = null;

        Boolean lv_annotations_4_0 = null;

        Boolean lv_closedWorldDefinitions_5_0 = null;

        Boolean lv_descriptionBoxRefinements_6_0 = null;

        Boolean lv_conceptInstances_7_0 = null;

        Boolean lv_reifiedRelationshipInstances_8_0 = null;

        Boolean lv_reifiedRelationshipInstanceDomains_9_0 = null;

        Boolean lv_reifiedRelationshipInstanceRanges_10_0 = null;

        Boolean lv_unreifiedRelationshipInstanceTuples_11_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4884:1: ( ( ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4885:2: ( ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4885:2: ( ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4886:3: ( (lv_kind_0_0= ruleDescriptionKind ) ) this_DESCRIPTION_BOX_TOKEN_1= RULE_DESCRIPTION_BOX_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )* this_RCURLY_12= RULE_RCURLY
            {
            // PsiInternalOntologicalModelingLanguage.g:4886:3: ( (lv_kind_0_0= ruleDescriptionKind ) )
            // PsiInternalOntologicalModelingLanguage.g:4887:4: (lv_kind_0_0= ruleDescriptionKind )
            {
            // PsiInternalOntologicalModelingLanguage.g:4887:4: (lv_kind_0_0= ruleDescriptionKind )
            // PsiInternalOntologicalModelingLanguage.g:4888:5: lv_kind_0_0= ruleDescriptionKind
            {

            					markComposite(elementTypeProvider.getDescriptionBox_KindDescriptionKindEnumRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_80);
            lv_kind_0_0=ruleDescriptionKind();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getDescriptionBox_DESCRIPTION_BOX_TOKENTerminalRuleCall_1ElementType());
            		
            this_DESCRIPTION_BOX_TOKEN_1=(Token)match(input,RULE_DESCRIPTION_BOX_TOKEN,FOLLOW_6); 

            			doneLeaf(this_DESCRIPTION_BOX_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:4908:3: ( (lv_iri_2_0= RULE_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:4909:4: (lv_iri_2_0= RULE_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:4909:4: (lv_iri_2_0= RULE_IRI )
            // PsiInternalOntologicalModelingLanguage.g:4910:5: lv_iri_2_0= RULE_IRI
            {

            					markLeaf(elementTypeProvider.getDescriptionBox_IriIRITerminalRuleCall_2_0ElementType());
            				
            lv_iri_2_0=(Token)match(input,RULE_IRI,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_iri_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getDescriptionBox_LCURLYTerminalRuleCall_3ElementType());
            		
            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_81); 

            			doneLeaf(this_LCURLY_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:4932:3: ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) ) | ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) ) | ( (lv_conceptInstances_7_0= ruleConceptInstance ) ) | ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) ) | ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) ) | ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) ) | ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) ) )*
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
            	    // PsiInternalOntologicalModelingLanguage.g:4933:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4933:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // PsiInternalOntologicalModelingLanguage.g:4934:5: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4934:5: (lv_annotations_4_0= ruleAnnotation )
            	    // PsiInternalOntologicalModelingLanguage.g:4935:6: lv_annotations_4_0= ruleAnnotation
            	    {

            	    						markComposite(elementTypeProvider.getDescriptionBox_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_annotations_4_0=ruleAnnotation();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalOntologicalModelingLanguage.g:4949:4: ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4949:4: ( (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions ) )
            	    // PsiInternalOntologicalModelingLanguage.g:4950:5: (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4950:5: (lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions )
            	    // PsiInternalOntologicalModelingLanguage.g:4951:6: lv_closedWorldDefinitions_5_0= ruleDescriptionBoxExtendsClosedWorldDefinitions
            	    {

            	    						markComposite(elementTypeProvider.getDescriptionBox_ClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_closedWorldDefinitions_5_0=ruleDescriptionBoxExtendsClosedWorldDefinitions();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalOntologicalModelingLanguage.g:4965:4: ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4965:4: ( (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement ) )
            	    // PsiInternalOntologicalModelingLanguage.g:4966:5: (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4966:5: (lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement )
            	    // PsiInternalOntologicalModelingLanguage.g:4967:6: lv_descriptionBoxRefinements_6_0= ruleDescriptionBoxRefinement
            	    {

            	    						markComposite(elementTypeProvider.getDescriptionBox_DescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_descriptionBoxRefinements_6_0=ruleDescriptionBoxRefinement();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // PsiInternalOntologicalModelingLanguage.g:4981:4: ( (lv_conceptInstances_7_0= ruleConceptInstance ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4981:4: ( (lv_conceptInstances_7_0= ruleConceptInstance ) )
            	    // PsiInternalOntologicalModelingLanguage.g:4982:5: (lv_conceptInstances_7_0= ruleConceptInstance )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4982:5: (lv_conceptInstances_7_0= ruleConceptInstance )
            	    // PsiInternalOntologicalModelingLanguage.g:4983:6: lv_conceptInstances_7_0= ruleConceptInstance
            	    {

            	    						markComposite(elementTypeProvider.getDescriptionBox_ConceptInstancesConceptInstanceParserRuleCall_4_3_0ElementType());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_conceptInstances_7_0=ruleConceptInstance();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // PsiInternalOntologicalModelingLanguage.g:4997:4: ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4997:4: ( (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance ) )
            	    // PsiInternalOntologicalModelingLanguage.g:4998:5: (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:4998:5: (lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance )
            	    // PsiInternalOntologicalModelingLanguage.g:4999:6: lv_reifiedRelationshipInstances_8_0= ruleReifiedRelationshipInstance
            	    {

            	    						markComposite(elementTypeProvider.getDescriptionBox_ReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0ElementType());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_reifiedRelationshipInstances_8_0=ruleReifiedRelationshipInstance();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // PsiInternalOntologicalModelingLanguage.g:5013:4: ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:5013:4: ( (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain ) )
            	    // PsiInternalOntologicalModelingLanguage.g:5014:5: (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:5014:5: (lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain )
            	    // PsiInternalOntologicalModelingLanguage.g:5015:6: lv_reifiedRelationshipInstanceDomains_9_0= ruleReifiedRelationshipInstanceDomain
            	    {

            	    						markComposite(elementTypeProvider.getDescriptionBox_ReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0ElementType());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_reifiedRelationshipInstanceDomains_9_0=ruleReifiedRelationshipInstanceDomain();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // PsiInternalOntologicalModelingLanguage.g:5029:4: ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:5029:4: ( (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange ) )
            	    // PsiInternalOntologicalModelingLanguage.g:5030:5: (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:5030:5: (lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange )
            	    // PsiInternalOntologicalModelingLanguage.g:5031:6: lv_reifiedRelationshipInstanceRanges_10_0= ruleReifiedRelationshipInstanceRange
            	    {

            	    						markComposite(elementTypeProvider.getDescriptionBox_ReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0ElementType());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_reifiedRelationshipInstanceRanges_10_0=ruleReifiedRelationshipInstanceRange();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // PsiInternalOntologicalModelingLanguage.g:5045:4: ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:5045:4: ( (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple ) )
            	    // PsiInternalOntologicalModelingLanguage.g:5046:5: (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:5046:5: (lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple )
            	    // PsiInternalOntologicalModelingLanguage.g:5047:6: lv_unreifiedRelationshipInstanceTuples_11_0= ruleUnreifiedRelationshipInstanceTuple
            	    {

            	    						markComposite(elementTypeProvider.getDescriptionBox_UnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0ElementType());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_unreifiedRelationshipInstanceTuples_11_0=ruleUnreifiedRelationshipInstanceTuple();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getDescriptionBox_RCURLYTerminalRuleCall_5ElementType());
            		
            this_RCURLY_12=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_12);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionBox"


    // $ANTLR start "entryRuleDescriptionBoxExtendsClosedWorldDefinitions"
    // PsiInternalOntologicalModelingLanguage.g:5072:1: entryRuleDescriptionBoxExtendsClosedWorldDefinitions returns [Boolean current=false] : iv_ruleDescriptionBoxExtendsClosedWorldDefinitions= ruleDescriptionBoxExtendsClosedWorldDefinitions EOF ;
    public final Boolean entryRuleDescriptionBoxExtendsClosedWorldDefinitions() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescriptionBoxExtendsClosedWorldDefinitions = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5072:85: (iv_ruleDescriptionBoxExtendsClosedWorldDefinitions= ruleDescriptionBoxExtendsClosedWorldDefinitions EOF )
            // PsiInternalOntologicalModelingLanguage.g:5073:2: iv_ruleDescriptionBoxExtendsClosedWorldDefinitions= ruleDescriptionBoxExtendsClosedWorldDefinitions EOF
            {
             markComposite(elementTypeProvider.getDescriptionBoxExtendsClosedWorldDefinitionsElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionBoxExtendsClosedWorldDefinitions=ruleDescriptionBoxExtendsClosedWorldDefinitions();

            state._fsp--;

             current =iv_ruleDescriptionBoxExtendsClosedWorldDefinitions; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionBoxExtendsClosedWorldDefinitions"


    // $ANTLR start "ruleDescriptionBoxExtendsClosedWorldDefinitions"
    // PsiInternalOntologicalModelingLanguage.g:5079:1: ruleDescriptionBoxExtendsClosedWorldDefinitions returns [Boolean current=false] : (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) ) ;
    public final Boolean ruleDescriptionBoxExtendsClosedWorldDefinitions() throws RecognitionException {
        Boolean current = false;

        Token this_EXTENDS_TOKEN_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5080:1: ( (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:5081:2: (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:5081:2: (this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) ) )
            // PsiInternalOntologicalModelingLanguage.g:5082:3: this_EXTENDS_TOKEN_0= RULE_EXTENDS_TOKEN ( ( ruleReference ) )
            {

            			markLeaf(elementTypeProvider.getDescriptionBoxExtendsClosedWorldDefinitions_EXTENDS_TOKENTerminalRuleCall_0ElementType());
            		
            this_EXTENDS_TOKEN_0=(Token)match(input,RULE_EXTENDS_TOKEN,FOLLOW_27); 

            			doneLeaf(this_EXTENDS_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:5089:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5090:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5090:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5091:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitionsTerminologyBoxCrossReference_1_0ElementType());
            				
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionBoxExtendsClosedWorldDefinitions"


    // $ANTLR start "entryRuleDescriptionBoxRefinement"
    // PsiInternalOntologicalModelingLanguage.g:5110:1: entryRuleDescriptionBoxRefinement returns [Boolean current=false] : iv_ruleDescriptionBoxRefinement= ruleDescriptionBoxRefinement EOF ;
    public final Boolean entryRuleDescriptionBoxRefinement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescriptionBoxRefinement = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5110:66: (iv_ruleDescriptionBoxRefinement= ruleDescriptionBoxRefinement EOF )
            // PsiInternalOntologicalModelingLanguage.g:5111:2: iv_ruleDescriptionBoxRefinement= ruleDescriptionBoxRefinement EOF
            {
             markComposite(elementTypeProvider.getDescriptionBoxRefinementElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionBoxRefinement=ruleDescriptionBoxRefinement();

            state._fsp--;

             current =iv_ruleDescriptionBoxRefinement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionBoxRefinement"


    // $ANTLR start "ruleDescriptionBoxRefinement"
    // PsiInternalOntologicalModelingLanguage.g:5117:1: ruleDescriptionBoxRefinement returns [Boolean current=false] : (this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) ) ) ;
    public final Boolean ruleDescriptionBoxRefinement() throws RecognitionException {
        Boolean current = false;

        Token this_REFINES_TOKEN_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5118:1: ( (this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:5119:2: (this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:5119:2: (this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) ) )
            // PsiInternalOntologicalModelingLanguage.g:5120:3: this_REFINES_TOKEN_0= RULE_REFINES_TOKEN ( ( ruleReference ) )
            {

            			markLeaf(elementTypeProvider.getDescriptionBoxRefinement_REFINES_TOKENTerminalRuleCall_0ElementType());
            		
            this_REFINES_TOKEN_0=(Token)match(input,RULE_REFINES_TOKEN,FOLLOW_27); 

            			doneLeaf(this_REFINES_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:5127:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5128:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5128:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5129:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getDescriptionBoxRefinement_RefinedDescriptionBoxDescriptionBoxCrossReference_1_0ElementType());
            				
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionBoxRefinement"


    // $ANTLR start "entryRuleScalarDataPropertyValue"
    // PsiInternalOntologicalModelingLanguage.g:5148:1: entryRuleScalarDataPropertyValue returns [Boolean current=false] : iv_ruleScalarDataPropertyValue= ruleScalarDataPropertyValue EOF ;
    public final Boolean entryRuleScalarDataPropertyValue() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarDataPropertyValue = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5148:65: (iv_ruleScalarDataPropertyValue= ruleScalarDataPropertyValue EOF )
            // PsiInternalOntologicalModelingLanguage.g:5149:2: iv_ruleScalarDataPropertyValue= ruleScalarDataPropertyValue EOF
            {
             markComposite(elementTypeProvider.getScalarDataPropertyValueElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarDataPropertyValue=ruleScalarDataPropertyValue();

            state._fsp--;

             current =iv_ruleScalarDataPropertyValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarDataPropertyValue"


    // $ANTLR start "ruleScalarDataPropertyValue"
    // PsiInternalOntologicalModelingLanguage.g:5155:1: ruleScalarDataPropertyValue returns [Boolean current=false] : (otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleScalarDataPropertyValue() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;
        Boolean lv_scalarPropertyValue_3_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5156:1: ( (otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:5157:2: (otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:5157:2: (otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:5158:3: otherlv_0= 'ScalarDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'scalarPropertyValue' ( (lv_scalarPropertyValue_3_0= ruleReference ) ) otherlv_4= 'scalarDataProperty' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getScalarDataPropertyValue_ScalarDataPropertyValueKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,109,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getScalarDataPropertyValue_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_82); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getScalarDataPropertyValue_ScalarPropertyValueKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,110,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:5179:3: ( (lv_scalarPropertyValue_3_0= ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5180:4: (lv_scalarPropertyValue_3_0= ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5180:4: (lv_scalarPropertyValue_3_0= ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5181:5: lv_scalarPropertyValue_3_0= ruleReference
            {

            					markComposite(elementTypeProvider.getScalarDataPropertyValue_ScalarPropertyValueReferenceParserRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_83);
            lv_scalarPropertyValue_3_0=ruleReference();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarDataPropertyValue_ScalarDataPropertyKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,78,FOLLOW_27); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:5201:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5202:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5202:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5203:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarDataPropertyValue_ScalarDataPropertyDataRelationshipToScalarCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarDataPropertyValue_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarDataPropertyValue"


    // $ANTLR start "entryRuleStructuredDataPropertyValue"
    // PsiInternalOntologicalModelingLanguage.g:5229:1: entryRuleStructuredDataPropertyValue returns [Boolean current=false] : iv_ruleStructuredDataPropertyValue= ruleStructuredDataPropertyValue EOF ;
    public final Boolean entryRuleStructuredDataPropertyValue() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStructuredDataPropertyValue = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5229:69: (iv_ruleStructuredDataPropertyValue= ruleStructuredDataPropertyValue EOF )
            // PsiInternalOntologicalModelingLanguage.g:5230:2: iv_ruleStructuredDataPropertyValue= ruleStructuredDataPropertyValue EOF
            {
             markComposite(elementTypeProvider.getStructuredDataPropertyValueElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructuredDataPropertyValue=ruleStructuredDataPropertyValue();

            state._fsp--;

             current =iv_ruleStructuredDataPropertyValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuredDataPropertyValue"


    // $ANTLR start "ruleStructuredDataPropertyValue"
    // PsiInternalOntologicalModelingLanguage.g:5236:1: ruleStructuredDataPropertyValue returns [Boolean current=false] : (otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleStructuredDataPropertyValue() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;
        Boolean lv_structuredPropertyTuple_5_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5237:1: ( (otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:5238:2: (otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:5238:2: (otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:5239:3: otherlv_0= 'StructuredDataPropertyValue' this_LCURLY_1= RULE_LCURLY otherlv_2= 'structuredDataProperty' ( ( ruleReference ) ) otherlv_4= 'structuredPropertyTuple' ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getStructuredDataPropertyValue_StructuredDataPropertyValueKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,111,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getStructuredDataPropertyValue_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_84); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getStructuredDataPropertyValue_StructuredDataPropertyKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,77,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:5260:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5261:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5261:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5262:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStructuredDataPropertyValue_StructuredDataPropertyDataRelationshipToStructureCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_85);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getStructuredDataPropertyValue_StructuredPropertyTupleKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,112,FOLLOW_86); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:5284:3: ( (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple ) )
            // PsiInternalOntologicalModelingLanguage.g:5285:4: (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple )
            {
            // PsiInternalOntologicalModelingLanguage.g:5285:4: (lv_structuredPropertyTuple_5_0= ruleDataStructureTuple )
            // PsiInternalOntologicalModelingLanguage.g:5286:5: lv_structuredPropertyTuple_5_0= ruleDataStructureTuple
            {

            					markComposite(elementTypeProvider.getStructuredDataPropertyValue_StructuredPropertyTupleDataStructureTupleParserRuleCall_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            lv_structuredPropertyTuple_5_0=ruleDataStructureTuple();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getStructuredDataPropertyValue_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuredDataPropertyValue"


    // $ANTLR start "entryRuleDataStructureTuple"
    // PsiInternalOntologicalModelingLanguage.g:5310:1: entryRuleDataStructureTuple returns [Boolean current=false] : iv_ruleDataStructureTuple= ruleDataStructureTuple EOF ;
    public final Boolean entryRuleDataStructureTuple() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDataStructureTuple = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5310:60: (iv_ruleDataStructureTuple= ruleDataStructureTuple EOF )
            // PsiInternalOntologicalModelingLanguage.g:5311:2: iv_ruleDataStructureTuple= ruleDataStructureTuple EOF
            {
             markComposite(elementTypeProvider.getDataStructureTupleElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataStructureTuple=ruleDataStructureTuple();

            state._fsp--;

             current =iv_ruleDataStructureTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataStructureTuple"


    // $ANTLR start "ruleDataStructureTuple"
    // PsiInternalOntologicalModelingLanguage.g:5317:1: ruleDataStructureTuple returns [Boolean current=false] : (otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleDataStructureTuple() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5318:1: ( (otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:5319:2: (otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:5319:2: (otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:5320:3: otherlv_0= 'DataStructureTuple' this_LCURLY_1= RULE_LCURLY otherlv_2= 'dataStructureType' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getDataStructureTuple_DataStructureTupleKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,113,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getDataStructureTuple_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_87); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getDataStructureTuple_DataStructureTypeKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,114,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:5341:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5342:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5342:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5343:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getDataStructureTuple_DataStructureTypeStructureCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getDataStructureTuple_RCURLYTerminalRuleCall_4ElementType());
            		
            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataStructureTuple"


    // $ANTLR start "entryRuleConceptInstance"
    // PsiInternalOntologicalModelingLanguage.g:5369:1: entryRuleConceptInstance returns [Boolean current=false] : iv_ruleConceptInstance= ruleConceptInstance EOF ;
    public final Boolean entryRuleConceptInstance() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConceptInstance = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5369:57: (iv_ruleConceptInstance= ruleConceptInstance EOF )
            // PsiInternalOntologicalModelingLanguage.g:5370:2: iv_ruleConceptInstance= ruleConceptInstance EOF
            {
             markComposite(elementTypeProvider.getConceptInstanceElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptInstance=ruleConceptInstance();

            state._fsp--;

             current =iv_ruleConceptInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConceptInstance"


    // $ANTLR start "ruleConceptInstance"
    // PsiInternalOntologicalModelingLanguage.g:5376:1: ruleConceptInstance returns [Boolean current=false] : (otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleConceptInstance() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5377:1: ( (otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:5378:2: (otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:5378:2: (otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:5379:3: otherlv_0= 'ConceptInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonConceptClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getConceptInstance_ConceptInstanceKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,115,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getConceptInstance_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_88); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getConceptInstance_SingletonConceptClassifierKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,116,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:5400:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5401:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5401:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5402:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptInstance_SingletonConceptClassifierConceptCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getConceptInstance_RCURLYTerminalRuleCall_4ElementType());
            		
            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConceptInstance"


    // $ANTLR start "entryRuleReifiedRelationshipInstance"
    // PsiInternalOntologicalModelingLanguage.g:5428:1: entryRuleReifiedRelationshipInstance returns [Boolean current=false] : iv_ruleReifiedRelationshipInstance= ruleReifiedRelationshipInstance EOF ;
    public final Boolean entryRuleReifiedRelationshipInstance() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReifiedRelationshipInstance = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5428:69: (iv_ruleReifiedRelationshipInstance= ruleReifiedRelationshipInstance EOF )
            // PsiInternalOntologicalModelingLanguage.g:5429:2: iv_ruleReifiedRelationshipInstance= ruleReifiedRelationshipInstance EOF
            {
             markComposite(elementTypeProvider.getReifiedRelationshipInstanceElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationshipInstance=ruleReifiedRelationshipInstance();

            state._fsp--;

             current =iv_ruleReifiedRelationshipInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationshipInstance"


    // $ANTLR start "ruleReifiedRelationshipInstance"
    // PsiInternalOntologicalModelingLanguage.g:5435:1: ruleReifiedRelationshipInstance returns [Boolean current=false] : (otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleReifiedRelationshipInstance() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5436:1: ( (otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:5437:2: (otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:5437:2: (otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:5438:3: otherlv_0= 'ReifiedRelationshipInstance' this_LCURLY_1= RULE_LCURLY otherlv_2= 'singletonReifiedRelationshipClassifier' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstance_ReifiedRelationshipInstanceKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,117,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstance_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_89); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,118,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:5459:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5460:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5460:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5461:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationshipInstance_RCURLYTerminalRuleCall_4ElementType());
            		
            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationshipInstance"


    // $ANTLR start "entryRuleReifiedRelationshipInstanceDomain"
    // PsiInternalOntologicalModelingLanguage.g:5487:1: entryRuleReifiedRelationshipInstanceDomain returns [Boolean current=false] : iv_ruleReifiedRelationshipInstanceDomain= ruleReifiedRelationshipInstanceDomain EOF ;
    public final Boolean entryRuleReifiedRelationshipInstanceDomain() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReifiedRelationshipInstanceDomain = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5487:75: (iv_ruleReifiedRelationshipInstanceDomain= ruleReifiedRelationshipInstanceDomain EOF )
            // PsiInternalOntologicalModelingLanguage.g:5488:2: iv_ruleReifiedRelationshipInstanceDomain= ruleReifiedRelationshipInstanceDomain EOF
            {
             markComposite(elementTypeProvider.getReifiedRelationshipInstanceDomainElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationshipInstanceDomain=ruleReifiedRelationshipInstanceDomain();

            state._fsp--;

             current =iv_ruleReifiedRelationshipInstanceDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationshipInstanceDomain"


    // $ANTLR start "ruleReifiedRelationshipInstanceDomain"
    // PsiInternalOntologicalModelingLanguage.g:5494:1: ruleReifiedRelationshipInstanceDomain returns [Boolean current=false] : (otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleReifiedRelationshipInstanceDomain() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_DOMAIN_TOKEN_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5495:1: ( (otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:5496:2: (otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:5496:2: (otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:5497:3: otherlv_0= 'ReifiedRelationshipInstanceDomain' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceDomainKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,119,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceDomain_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_90); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,120,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:5518:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5519:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5519:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5520:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_39);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceDomain_DOMAIN_TOKENTerminalRuleCall_4ElementType());
            		
            this_DOMAIN_TOKEN_4=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			doneLeaf(this_DOMAIN_TOKEN_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:5542:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5543:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5543:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5544:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipInstanceDomain_DomainConceptualEntitySingletonInstanceCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceDomain_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationshipInstanceDomain"


    // $ANTLR start "entryRuleReifiedRelationshipInstanceRange"
    // PsiInternalOntologicalModelingLanguage.g:5570:1: entryRuleReifiedRelationshipInstanceRange returns [Boolean current=false] : iv_ruleReifiedRelationshipInstanceRange= ruleReifiedRelationshipInstanceRange EOF ;
    public final Boolean entryRuleReifiedRelationshipInstanceRange() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReifiedRelationshipInstanceRange = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5570:74: (iv_ruleReifiedRelationshipInstanceRange= ruleReifiedRelationshipInstanceRange EOF )
            // PsiInternalOntologicalModelingLanguage.g:5571:2: iv_ruleReifiedRelationshipInstanceRange= ruleReifiedRelationshipInstanceRange EOF
            {
             markComposite(elementTypeProvider.getReifiedRelationshipInstanceRangeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleReifiedRelationshipInstanceRange=ruleReifiedRelationshipInstanceRange();

            state._fsp--;

             current =iv_ruleReifiedRelationshipInstanceRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReifiedRelationshipInstanceRange"


    // $ANTLR start "ruleReifiedRelationshipInstanceRange"
    // PsiInternalOntologicalModelingLanguage.g:5577:1: ruleReifiedRelationshipInstanceRange returns [Boolean current=false] : (otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleReifiedRelationshipInstanceRange() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RANGE_TOKEN_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5578:1: ( (otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:5579:2: (otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:5579:2: (otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:5580:3: otherlv_0= 'ReifiedRelationshipInstanceRange' this_LCURLY_1= RULE_LCURLY otherlv_2= 'reifiedRelationshipInstance' ( ( ruleReference ) ) this_RANGE_TOKEN_4= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceRangeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,121,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceRange_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_90); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,120,FOLLOW_27); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:5601:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5602:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5602:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5603:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipInstanceRange_ReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceRange_RANGE_TOKENTerminalRuleCall_4ElementType());
            		
            this_RANGE_TOKEN_4=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			doneLeaf(this_RANGE_TOKEN_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:5625:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5626:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5626:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5627:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipInstanceRange_RangeConceptualEntitySingletonInstanceCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationshipInstanceRange_RCURLYTerminalRuleCall_6ElementType());
            		
            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReifiedRelationshipInstanceRange"


    // $ANTLR start "entryRuleUnreifiedRelationshipInstanceTuple"
    // PsiInternalOntologicalModelingLanguage.g:5653:1: entryRuleUnreifiedRelationshipInstanceTuple returns [Boolean current=false] : iv_ruleUnreifiedRelationshipInstanceTuple= ruleUnreifiedRelationshipInstanceTuple EOF ;
    public final Boolean entryRuleUnreifiedRelationshipInstanceTuple() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUnreifiedRelationshipInstanceTuple = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5653:76: (iv_ruleUnreifiedRelationshipInstanceTuple= ruleUnreifiedRelationshipInstanceTuple EOF )
            // PsiInternalOntologicalModelingLanguage.g:5654:2: iv_ruleUnreifiedRelationshipInstanceTuple= ruleUnreifiedRelationshipInstanceTuple EOF
            {
             markComposite(elementTypeProvider.getUnreifiedRelationshipInstanceTupleElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnreifiedRelationshipInstanceTuple=ruleUnreifiedRelationshipInstanceTuple();

            state._fsp--;

             current =iv_ruleUnreifiedRelationshipInstanceTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnreifiedRelationshipInstanceTuple"


    // $ANTLR start "ruleUnreifiedRelationshipInstanceTuple"
    // PsiInternalOntologicalModelingLanguage.g:5660:1: ruleUnreifiedRelationshipInstanceTuple returns [Boolean current=false] : (otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleUnreifiedRelationshipInstanceTuple() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token this_UNREIFIED_RELATIONSHIP_TOKEN_2=null;
        Token this_DOMAIN_TOKEN_4=null;
        Token this_RANGE_TOKEN_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5661:1: ( (otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:5662:2: (otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:5662:2: (otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:5663:3: otherlv_0= 'UnreifiedRelationshipInstanceTuple' this_LCURLY_1= RULE_LCURLY this_UNREIFIED_RELATIONSHIP_TOKEN_2= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( ( ruleReference ) ) this_DOMAIN_TOKEN_4= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_6= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipInstanceTupleKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,122,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_91); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2ElementType());
            		
            this_UNREIFIED_RELATIONSHIP_TOKEN_2=(Token)match(input,RULE_UNREIFIED_RELATIONSHIP_TOKEN,FOLLOW_27); 

            			doneLeaf(this_UNREIFIED_RELATIONSHIP_TOKEN_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:5684:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5685:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5685:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5686:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_UnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_39);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_DOMAIN_TOKENTerminalRuleCall_4ElementType());
            		
            this_DOMAIN_TOKEN_4=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_27); 

            			doneLeaf(this_DOMAIN_TOKEN_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:5708:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5709:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5709:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5710:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_DomainConceptualEntitySingletonInstanceCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_40);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_RANGE_TOKENTerminalRuleCall_6ElementType());
            		
            this_RANGE_TOKEN_6=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_27); 

            			doneLeaf(this_RANGE_TOKEN_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:5732:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:5733:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:5733:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:5734:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_RangeConceptualEntitySingletonInstanceCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationshipInstanceTuple_RCURLYTerminalRuleCall_8ElementType());
            		
            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); 

            			doneLeaf(this_RCURLY_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnreifiedRelationshipInstanceTuple"


    // $ANTLR start "entryRuleReference"
    // PsiInternalOntologicalModelingLanguage.g:5760:1: entryRuleReference returns [Boolean current=false] : iv_ruleReference= ruleReference EOF ;
    public final Boolean entryRuleReference() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReference = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5760:51: (iv_ruleReference= ruleReference EOF )
            // PsiInternalOntologicalModelingLanguage.g:5761:2: iv_ruleReference= ruleReference EOF
            {
             markComposite(elementTypeProvider.getReferenceElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // PsiInternalOntologicalModelingLanguage.g:5767:1: ruleReference returns [Boolean current=false] : (this_IRI_0= RULE_IRI | ruleQNAME ) ;
    public final Boolean ruleReference() throws RecognitionException {
        Boolean current = false;

        Token this_IRI_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5768:1: ( (this_IRI_0= RULE_IRI | ruleQNAME ) )
            // PsiInternalOntologicalModelingLanguage.g:5769:2: (this_IRI_0= RULE_IRI | ruleQNAME )
            {
            // PsiInternalOntologicalModelingLanguage.g:5769:2: (this_IRI_0= RULE_IRI | ruleQNAME )
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
                    // PsiInternalOntologicalModelingLanguage.g:5770:3: this_IRI_0= RULE_IRI
                    {

                    			markLeaf(elementTypeProvider.getReference_IRITerminalRuleCall_0ElementType());
                    		
                    this_IRI_0=(Token)match(input,RULE_IRI,FOLLOW_2); 

                    			doneLeaf(this_IRI_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:5778:3: ruleQNAME
                    {

                    			markComposite(elementTypeProvider.getReference_QNAMEParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleQNAME();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleQNAME"
    // PsiInternalOntologicalModelingLanguage.g:5789:1: entryRuleQNAME returns [Boolean current=false] : iv_ruleQNAME= ruleQNAME EOF ;
    public final Boolean entryRuleQNAME() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQNAME = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5789:47: (iv_ruleQNAME= ruleQNAME EOF )
            // PsiInternalOntologicalModelingLanguage.g:5790:2: iv_ruleQNAME= ruleQNAME EOF
            {
             markComposite(elementTypeProvider.getQNAMEElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleQNAME=ruleQNAME();

            state._fsp--;

             current =iv_ruleQNAME; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQNAME"


    // $ANTLR start "ruleQNAME"
    // PsiInternalOntologicalModelingLanguage.g:5796:1: ruleQNAME returns [Boolean current=false] : ( ruleABBREV_IRI | ruleValidID ) ;
    public final Boolean ruleQNAME() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5797:1: ( ( ruleABBREV_IRI | ruleValidID ) )
            // PsiInternalOntologicalModelingLanguage.g:5798:2: ( ruleABBREV_IRI | ruleValidID )
            {
            // PsiInternalOntologicalModelingLanguage.g:5798:2: ( ruleABBREV_IRI | ruleValidID )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==EOF||(LA66_1>=RULE_IRI && LA66_1<=RULE_ANNOTATION_TOKEN)||LA66_1==RULE_RCURLY||(LA66_1>=RULE_ASPECT_TOKEN && LA66_1<=RULE_REIFIED_RELATIONSHIP_TOKEN)||(LA66_1>=RULE_TARGET_TOKEN && LA66_1<=RULE_BINARY_SCALAR_RESTRICTION_TOKEN)||(LA66_1>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA66_1<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)||LA66_1==RULE_REFINES_TOKEN||(LA66_1>=75 && LA66_1<=78)||LA66_1==81||LA66_1==84||LA66_1==86||(LA66_1>=88 && LA66_1<=89)||LA66_1==91||LA66_1==93||(LA66_1>=95 && LA66_1<=97)||LA66_1==112||LA66_1==115||LA66_1==117||LA66_1==119||(LA66_1>=121 && LA66_1<=122)) ) {
                    alt66=2;
                }
                else if ( (LA66_1==123) ) {
                    alt66=1;
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
                    // PsiInternalOntologicalModelingLanguage.g:5799:3: ruleABBREV_IRI
                    {

                    			markComposite(elementTypeProvider.getQNAME_ABBREV_IRIParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleABBREV_IRI();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:5807:3: ruleValidID
                    {

                    			markComposite(elementTypeProvider.getQNAME_ValidIDParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleValidID();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQNAME"


    // $ANTLR start "entryRuleABBREV_IRI"
    // PsiInternalOntologicalModelingLanguage.g:5818:1: entryRuleABBREV_IRI returns [Boolean current=false] : iv_ruleABBREV_IRI= ruleABBREV_IRI EOF ;
    public final Boolean entryRuleABBREV_IRI() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleABBREV_IRI = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5818:52: (iv_ruleABBREV_IRI= ruleABBREV_IRI EOF )
            // PsiInternalOntologicalModelingLanguage.g:5819:2: iv_ruleABBREV_IRI= ruleABBREV_IRI EOF
            {
             markComposite(elementTypeProvider.getABBREV_IRIElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleABBREV_IRI=ruleABBREV_IRI();

            state._fsp--;

             current =iv_ruleABBREV_IRI; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleABBREV_IRI"


    // $ANTLR start "ruleABBREV_IRI"
    // PsiInternalOntologicalModelingLanguage.g:5825:1: ruleABBREV_IRI returns [Boolean current=false] : ( ruleValidID kw= ':' ruleValidID ) ;
    public final Boolean ruleABBREV_IRI() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5826:1: ( ( ruleValidID kw= ':' ruleValidID ) )
            // PsiInternalOntologicalModelingLanguage.g:5827:2: ( ruleValidID kw= ':' ruleValidID )
            {
            // PsiInternalOntologicalModelingLanguage.g:5827:2: ( ruleValidID kw= ':' ruleValidID )
            // PsiInternalOntologicalModelingLanguage.g:5828:3: ruleValidID kw= ':' ruleValidID
            {

            			markComposite(elementTypeProvider.getABBREV_IRI_ValidIDParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_92);
            ruleValidID();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getABBREV_IRI_ColonKeyword_1ElementType());
            		
            kw=(Token)match(input,123,FOLLOW_4); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getABBREV_IRI_ValidIDParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;


            			doneComposite();
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleABBREV_IRI"


    // $ANTLR start "entryRuleValidID"
    // PsiInternalOntologicalModelingLanguage.g:5853:1: entryRuleValidID returns [Boolean current=false] : iv_ruleValidID= ruleValidID EOF ;
    public final Boolean entryRuleValidID() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleValidID = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:5853:49: (iv_ruleValidID= ruleValidID EOF )
            // PsiInternalOntologicalModelingLanguage.g:5854:2: iv_ruleValidID= ruleValidID EOF
            {
             markComposite(elementTypeProvider.getValidIDElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // PsiInternalOntologicalModelingLanguage.g:5860:1: ruleValidID returns [Boolean current=false] : this_ID_0= RULE_ID ;
    public final Boolean ruleValidID() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5861:1: (this_ID_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:5862:2: this_ID_0= RULE_ID
            {

            		markLeaf(elementTypeProvider.getValidID_IDTerminalRuleCallElementType());
            	
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		doneLeaf(this_ID_0);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleTerminologyGraphKind"
    // PsiInternalOntologicalModelingLanguage.g:5872:1: ruleTerminologyGraphKind returns [Boolean current=false] : ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) ) ;
    public final Boolean ruleTerminologyGraphKind() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5873:1: ( ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) ) )
            // PsiInternalOntologicalModelingLanguage.g:5874:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:5874:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) )
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
                    // PsiInternalOntologicalModelingLanguage.g:5875:3: (enumLiteral_0= 'open' )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:5875:3: (enumLiteral_0= 'open' )
                    // PsiInternalOntologicalModelingLanguage.g:5876:4: enumLiteral_0= 'open'
                    {

                    				markLeaf(elementTypeProvider.getTerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:5885:3: (enumLiteral_1= 'closed' )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:5885:3: (enumLiteral_1= 'closed' )
                    // PsiInternalOntologicalModelingLanguage.g:5886:4: enumLiteral_1= 'closed'
                    {

                    				markLeaf(elementTypeProvider.getTerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyGraphKind"


    // $ANTLR start "ruleDescriptionKind"
    // PsiInternalOntologicalModelingLanguage.g:5898:1: ruleDescriptionKind returns [Boolean current=false] : ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'partial' ) ) ;
    public final Boolean ruleDescriptionKind() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:5899:1: ( ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'partial' ) ) )
            // PsiInternalOntologicalModelingLanguage.g:5900:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'partial' ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:5900:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'partial' ) )
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
                    // PsiInternalOntologicalModelingLanguage.g:5901:3: (enumLiteral_0= 'final' )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:5901:3: (enumLiteral_0= 'final' )
                    // PsiInternalOntologicalModelingLanguage.g:5902:4: enumLiteral_0= 'final'
                    {

                    				markLeaf(elementTypeProvider.getDescriptionKind_FinalEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,126,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:5911:3: (enumLiteral_1= 'partial' )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:5911:3: (enumLiteral_1= 'partial' )
                    // PsiInternalOntologicalModelingLanguage.g:5912:4: enumLiteral_1= 'partial'
                    {

                    				markLeaf(elementTypeProvider.getDescriptionKind_PartialEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,127,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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