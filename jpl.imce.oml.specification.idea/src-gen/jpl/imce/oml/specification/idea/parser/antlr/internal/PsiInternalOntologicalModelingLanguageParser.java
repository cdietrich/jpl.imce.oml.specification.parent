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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_PROPERTY_TOKEN", "RULE_EQUAL", "RULE_IRI", "RULE_ANNOTATION_TOKEN", "RULE_STRING", "RULE_TERMINOLOGY_GRAPH_TOKEN", "RULE_LCURLY", "RULE_RCURLY", "RULE_BUNDLE_TOKEN", "RULE_ASPECT_TOKEN", "RULE_ID", "RULE_ABSTRACT_TOKEN", "RULE_CONCEPT_TOKEN", "RULE_REIFIED_RELATIONSHIP_TOKEN", "RULE_FUNCTIONAL_TOKEN", "RULE_INVERSE_FUNCTIONAL_TOKEN", "RULE_ESSENTIAL_TOKEN", "RULE_INVERSE_ESSENTIAL_TOKEN", "RULE_SYMMETRIC_TOKEN", "RULE_ASYMMETRIC_TOKEN", "RULE_REFLEXIVE_TOKEN", "RULE_IRREFLEXIVE_TOKEN", "RULE_TRANSITIVE_TOKEN", "RULE_UNREIFIED_TOKEN", "RULE_INVERSE_TOKEN", "RULE_SOURCE_TOKEN", "RULE_TARGET_TOKEN", "RULE_UNREIFIED_RELATIONSHIP_TOKEN", "RULE_SCALAR_TOKEN", "RULE_STRUCTURE_TOKEN", "RULE_DOMAIN_TOKEN", "RULE_RANGE_TOKEN", "RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN", "RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN", "RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN", "RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN", "RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN", "RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN", "RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN", "RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN", "RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN", "RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN", "RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN", "RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN", "RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN", "RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN", "RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN", "RULE_BINARY_SCALAR_RESTRICTION_TOKEN", "RULE_INT", "RULE_IRI_SCALAR_RESTRICTION_TOKEN", "RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN", "RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN", "RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN", "RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN", "RULE_STRING_SCALAR_RESTRICTION_TOKEN", "RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN", "RULE_TIME_SCALAR_RESTRICTION_TOKEN", "RULE_KIND_TOKEN", "RULE_HEX_8DIGITS", "RULE_HEX_4DIGITS", "RULE_HEX_12DIGITS", "RULE_UUID", "RULE_HEX_DIGIT", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entityStructuredDataProperty'", "'entityScalarDataProperty'", "'structuredDataProperty'", "'scalarDataProperty'", "'disjointTaxonomyParent'", "'root'", "'disjointLeaf'", "'bundledTerminology'", "'designatedTerminology'", "'designatedConcept'", "'nestingTerminology'", "'nestingContext'", "'restrictedRelation'", "'restrictedRange'", "'restrictedDomain'", "'subConcept'", "'superConcept'", "'subRelationship'", "'superRelationship'", "'restrictedEntity'", "'scalarProperty'", "'scalarRestriction'", "'literalValue'", "'length'", "'minLength'", "'maxLength'", "'pattern'", "'minInclusive'", "'maxInclusive'", "'minExclusive'", "'maxExclusive'", "'language'", "'value'", "'axiom'", "':'", "'open'", "'closed'"
    };
    public static final int RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN=40;
    public static final int RULE_HEX=67;
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
    public static final int RULE_UUID=65;
    public static final int RULE_INT=52;
    public static final int RULE_ML_COMMENT=69;
    public static final int RULE_REIFIED_RELATIONSHIP_TOKEN=17;
    public static final int RULE_INVERSE_TOKEN=28;
    public static final int RULE_CONCEPT_TOKEN=16;
    public static final int RULE_IRI=6;
    public static final int RULE_BUNDLE_TOKEN=12;
    public static final int RULE_TARGET_TOKEN=30;
    public static final int RULE_TERMINOLOGY_GRAPH_TOKEN=9;
    public static final int RULE_INVERSE_FUNCTIONAL_TOKEN=19;
    public static final int RULE_HEX_DIGIT=66;
    public static final int RULE_HEX_8DIGITS=62;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN=42;
    public static final int RULE_HEX_12DIGITS=64;
    public static final int RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN=49;
    public static final int RULE_STRUCTURE_TOKEN=33;
    public static final int T__99=99;
    public static final int RULE_BINARY_SCALAR_RESTRICTION_TOKEN=51;
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
    public static final int RULE_KIND_TOKEN=61;
    public static final int RULE_DECIMAL=68;
    public static final int RULE_SCALAR_TOKEN=32;
    public static final int RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN=55;
    public static final int RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN=48;
    public static final int RULE_IRI_SCALAR_RESTRICTION_TOKEN=53;
    public static final int RULE_RANGE_TOKEN=35;
    public static final int RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN=41;
    public static final int RULE_UNREIFIED_TOKEN=27;
    public static final int RULE_STRING=8;
    public static final int RULE_STRING_SCALAR_RESTRICTION_TOKEN=58;
    public static final int RULE_SL_COMMENT=70;
    public static final int RULE_INVERSE_ESSENTIAL_TOKEN=21;
    public static final int RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN=44;
    public static final int RULE_ANNOTATION_PROPERTY_TOKEN=4;
    public static final int RULE_SYMMETRIC_TOKEN=22;
    public static final int T__77=77;
    public static final int RULE_DOMAIN_TOKEN=34;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int RULE_HEX_4DIGITS=63;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN=38;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_IRREFLEXIVE_TOKEN=25;
    public static final int RULE_RCURLY=11;
    public static final int RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN=36;
    public static final int RULE_WS=71;
    public static final int RULE_ANY_OTHER=72;
    public static final int RULE_ASPECT_TOKEN=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int RULE_ESSENTIAL_TOKEN=20;
    public static final int T__89=89;
    public static final int T__107=107;
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
    // PsiInternalOntologicalModelingLanguage.g:52:1: entryRuleTerminologyExtent returns [Boolean current=false] : iv_ruleTerminologyExtent= ruleTerminologyExtent EOF ;
    public final Boolean entryRuleTerminologyExtent() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyExtent = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:52:59: (iv_ruleTerminologyExtent= ruleTerminologyExtent EOF )
            // PsiInternalOntologicalModelingLanguage.g:53:2: iv_ruleTerminologyExtent= ruleTerminologyExtent EOF
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
    // PsiInternalOntologicalModelingLanguage.g:59:1: ruleTerminologyExtent returns [Boolean current=false] : ( () ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )* ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )* ( (lv_bundles_3_0= ruleBundle ) )* ) ;
    public final Boolean ruleTerminologyExtent() throws RecognitionException {
        Boolean current = false;

        Boolean lv_annotationProperties_1_0 = null;

        Boolean lv_terminologyGraphs_2_0 = null;

        Boolean lv_bundles_3_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:60:1: ( ( () ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )* ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )* ( (lv_bundles_3_0= ruleBundle ) )* ) )
            // PsiInternalOntologicalModelingLanguage.g:61:2: ( () ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )* ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )* ( (lv_bundles_3_0= ruleBundle ) )* )
            {
            // PsiInternalOntologicalModelingLanguage.g:61:2: ( () ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )* ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )* ( (lv_bundles_3_0= ruleBundle ) )* )
            // PsiInternalOntologicalModelingLanguage.g:62:3: () ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )* ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )* ( (lv_bundles_3_0= ruleBundle ) )*
            {
            // PsiInternalOntologicalModelingLanguage.g:62:3: ()
            // PsiInternalOntologicalModelingLanguage.g:63:4: 
            {

            				precedeComposite(elementTypeProvider.getTerminologyExtent_TerminologyExtentAction_0ElementType());
            				doneComposite();
            				associateWithSemanticElement();
            			

            }

            // PsiInternalOntologicalModelingLanguage.g:69:3: ( (lv_annotationProperties_1_0= ruleAnnotationProperty ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ANNOTATION_PROPERTY_TOKEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalOntologicalModelingLanguage.g:70:4: (lv_annotationProperties_1_0= ruleAnnotationProperty )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:70:4: (lv_annotationProperties_1_0= ruleAnnotationProperty )
            	    // PsiInternalOntologicalModelingLanguage.g:71:5: lv_annotationProperties_1_0= ruleAnnotationProperty
            	    {

            	    					markComposite(elementTypeProvider.getTerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0ElementType());
            	    				
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // PsiInternalOntologicalModelingLanguage.g:84:3: ( (lv_terminologyGraphs_2_0= ruleTerminologyGraph ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==108) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_TERMINOLOGY_GRAPH_TOKEN) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==109) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_TERMINOLOGY_GRAPH_TOKEN) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalOntologicalModelingLanguage.g:85:4: (lv_terminologyGraphs_2_0= ruleTerminologyGraph )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:85:4: (lv_terminologyGraphs_2_0= ruleTerminologyGraph )
            	    // PsiInternalOntologicalModelingLanguage.g:86:5: lv_terminologyGraphs_2_0= ruleTerminologyGraph
            	    {

            	    					markComposite(elementTypeProvider.getTerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_terminologyGraphs_2_0=ruleTerminologyGraph();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // PsiInternalOntologicalModelingLanguage.g:99:3: ( (lv_bundles_3_0= ruleBundle ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=108 && LA3_0<=109)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // PsiInternalOntologicalModelingLanguage.g:100:4: (lv_bundles_3_0= ruleBundle )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:100:4: (lv_bundles_3_0= ruleBundle )
            	    // PsiInternalOntologicalModelingLanguage.g:101:5: lv_bundles_3_0= ruleBundle
            	    {

            	    					markComposite(elementTypeProvider.getTerminologyExtent_BundlesBundleParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_bundles_3_0=ruleBundle();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // PsiInternalOntologicalModelingLanguage.g:118:1: entryRuleAnnotationProperty returns [Boolean current=false] : iv_ruleAnnotationProperty= ruleAnnotationProperty EOF ;
    public final Boolean entryRuleAnnotationProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAnnotationProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:118:60: (iv_ruleAnnotationProperty= ruleAnnotationProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:119:2: iv_ruleAnnotationProperty= ruleAnnotationProperty EOF
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
    // PsiInternalOntologicalModelingLanguage.g:125:1: ruleAnnotationProperty returns [Boolean current=false] : (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) ) ;
    public final Boolean ruleAnnotationProperty() throws RecognitionException {
        Boolean current = false;

        Token this_ANNOTATION_PROPERTY_TOKEN_0=null;
        Token this_EQUAL_2=null;
        Token lv_iri_3_0=null;
        Boolean lv_abbrevIRI_1_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:126:1: ( (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:127:2: (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:127:2: (this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) ) )
            // PsiInternalOntologicalModelingLanguage.g:128:3: this_ANNOTATION_PROPERTY_TOKEN_0= RULE_ANNOTATION_PROPERTY_TOKEN ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_iri_3_0= RULE_IRI ) )
            {

            			markLeaf(elementTypeProvider.getAnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0ElementType());
            		
            this_ANNOTATION_PROPERTY_TOKEN_0=(Token)match(input,RULE_ANNOTATION_PROPERTY_TOKEN,FOLLOW_5); 

            			doneLeaf(this_ANNOTATION_PROPERTY_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:135:3: ( (lv_abbrevIRI_1_0= ruleABBREV_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:136:4: (lv_abbrevIRI_1_0= ruleABBREV_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:136:4: (lv_abbrevIRI_1_0= ruleABBREV_IRI )
            // PsiInternalOntologicalModelingLanguage.g:137:5: lv_abbrevIRI_1_0= ruleABBREV_IRI
            {

            					markComposite(elementTypeProvider.getAnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_6);
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
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_7); 

            			doneLeaf(this_EQUAL_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:157:3: ( (lv_iri_3_0= RULE_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:158:4: (lv_iri_3_0= RULE_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:158:4: (lv_iri_3_0= RULE_IRI )
            // PsiInternalOntologicalModelingLanguage.g:159:5: lv_iri_3_0= RULE_IRI
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
    // PsiInternalOntologicalModelingLanguage.g:178:1: entryRuleAnnotation returns [Boolean current=false] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final Boolean entryRuleAnnotation() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAnnotation = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:178:52: (iv_ruleAnnotation= ruleAnnotation EOF )
            // PsiInternalOntologicalModelingLanguage.g:179:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // PsiInternalOntologicalModelingLanguage.g:185:1: ruleAnnotation returns [Boolean current=false] : (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final Boolean ruleAnnotation() throws RecognitionException {
        Boolean current = false;

        Token this_ANNOTATION_TOKEN_0=null;
        Token this_EQUAL_2=null;
        Token lv_value_3_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:186:1: ( (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:187:2: (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:187:2: (this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) ) )
            // PsiInternalOntologicalModelingLanguage.g:188:3: this_ANNOTATION_TOKEN_0= RULE_ANNOTATION_TOKEN ( ( ruleABBREV_IRI ) ) this_EQUAL_2= RULE_EQUAL ( (lv_value_3_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getAnnotation_ANNOTATION_TOKENTerminalRuleCall_0ElementType());
            		
            this_ANNOTATION_TOKEN_0=(Token)match(input,RULE_ANNOTATION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_ANNOTATION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:195:3: ( ( ruleABBREV_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:196:4: ( ruleABBREV_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:196:4: ( ruleABBREV_IRI )
            // PsiInternalOntologicalModelingLanguage.g:197:5: ruleABBREV_IRI
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getAnnotation_PropertyAnnotationPropertyCrossReference_1_0ElementType());
            				
            pushFollow(FOLLOW_6);
            ruleABBREV_IRI();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getAnnotation_EQUALTerminalRuleCall_2ElementType());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_8); 

            			doneLeaf(this_EQUAL_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:219:3: ( (lv_value_3_0= RULE_STRING ) )
            // PsiInternalOntologicalModelingLanguage.g:220:4: (lv_value_3_0= RULE_STRING )
            {
            // PsiInternalOntologicalModelingLanguage.g:220:4: (lv_value_3_0= RULE_STRING )
            // PsiInternalOntologicalModelingLanguage.g:221:5: lv_value_3_0= RULE_STRING
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
    // PsiInternalOntologicalModelingLanguage.g:240:1: entryRuleTerminologyGraph returns [Boolean current=false] : iv_ruleTerminologyGraph= ruleTerminologyGraph EOF ;
    public final Boolean entryRuleTerminologyGraph() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyGraph = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:240:58: (iv_ruleTerminologyGraph= ruleTerminologyGraph EOF )
            // PsiInternalOntologicalModelingLanguage.g:241:2: iv_ruleTerminologyGraph= ruleTerminologyGraph EOF
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
    // PsiInternalOntologicalModelingLanguage.g:247:1: ruleTerminologyGraph returns [Boolean current=false] : ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:248:1: ( ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:249:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:249:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:250:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_TERMINOLOGY_GRAPH_TOKEN_1= RULE_TERMINOLOGY_GRAPH_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )* this_RCURLY_7= RULE_RCURLY
            {
            // PsiInternalOntologicalModelingLanguage.g:250:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) )
            // PsiInternalOntologicalModelingLanguage.g:251:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            {
            // PsiInternalOntologicalModelingLanguage.g:251:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            // PsiInternalOntologicalModelingLanguage.g:252:5: lv_kind_0_0= ruleTerminologyGraphKind
            {

            					markComposite(elementTypeProvider.getTerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_9);
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
            		
            this_TERMINOLOGY_GRAPH_TOKEN_1=(Token)match(input,RULE_TERMINOLOGY_GRAPH_TOKEN,FOLLOW_7); 

            			doneLeaf(this_TERMINOLOGY_GRAPH_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:272:3: ( (lv_iri_2_0= RULE_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:273:4: (lv_iri_2_0= RULE_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:273:4: (lv_iri_2_0= RULE_IRI )
            // PsiInternalOntologicalModelingLanguage.g:274:5: lv_iri_2_0= RULE_IRI
            {

            					markLeaf(elementTypeProvider.getTerminologyGraph_IriIRITerminalRuleCall_2_0ElementType());
            				
            lv_iri_2_0=(Token)match(input,RULE_IRI,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_iri_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminologyGraph_LCURLYTerminalRuleCall_3ElementType());
            		
            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_11); 

            			doneLeaf(this_LCURLY_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:296:3: ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case RULE_ANNOTATION_TOKEN:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN:
                case RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN:
                case RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN:
                    {
                    alt4=2;
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
                case 73:
                case 74:
                case 75:
                case 76:
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // PsiInternalOntologicalModelingLanguage.g:297:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:297:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // PsiInternalOntologicalModelingLanguage.g:298:5: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:298:5: (lv_annotations_4_0= ruleAnnotation )
            	    // PsiInternalOntologicalModelingLanguage.g:299:6: lv_annotations_4_0= ruleAnnotation
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    // PsiInternalOntologicalModelingLanguage.g:313:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:313:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    // PsiInternalOntologicalModelingLanguage.g:314:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:314:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    // PsiInternalOntologicalModelingLanguage.g:315:6: lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    // PsiInternalOntologicalModelingLanguage.g:329:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:329:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    // PsiInternalOntologicalModelingLanguage.g:330:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:330:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    // PsiInternalOntologicalModelingLanguage.g:331:6: lv_boxStatements_6_0= ruleTerminologyBoxStatement
            	    {

            	    						markComposite(elementTypeProvider.getTerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop4;
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
    // PsiInternalOntologicalModelingLanguage.g:356:1: entryRuleBundle returns [Boolean current=false] : iv_ruleBundle= ruleBundle EOF ;
    public final Boolean entryRuleBundle() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBundle = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:356:48: (iv_ruleBundle= ruleBundle EOF )
            // PsiInternalOntologicalModelingLanguage.g:357:2: iv_ruleBundle= ruleBundle EOF
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
    // PsiInternalOntologicalModelingLanguage.g:363:1: ruleBundle returns [Boolean current=false] : ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:364:1: ( ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:365:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:365:2: ( ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:366:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) ) this_BUNDLE_TOKEN_1= RULE_BUNDLE_TOKEN ( (lv_iri_2_0= RULE_IRI ) ) this_LCURLY_3= RULE_LCURLY ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )* this_RCURLY_9= RULE_RCURLY
            {
            // PsiInternalOntologicalModelingLanguage.g:366:3: ( (lv_kind_0_0= ruleTerminologyGraphKind ) )
            // PsiInternalOntologicalModelingLanguage.g:367:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            {
            // PsiInternalOntologicalModelingLanguage.g:367:4: (lv_kind_0_0= ruleTerminologyGraphKind )
            // PsiInternalOntologicalModelingLanguage.g:368:5: lv_kind_0_0= ruleTerminologyGraphKind
            {

            					markComposite(elementTypeProvider.getBundle_KindTerminologyGraphKindEnumRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_12);
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
            		
            this_BUNDLE_TOKEN_1=(Token)match(input,RULE_BUNDLE_TOKEN,FOLLOW_7); 

            			doneLeaf(this_BUNDLE_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:388:3: ( (lv_iri_2_0= RULE_IRI ) )
            // PsiInternalOntologicalModelingLanguage.g:389:4: (lv_iri_2_0= RULE_IRI )
            {
            // PsiInternalOntologicalModelingLanguage.g:389:4: (lv_iri_2_0= RULE_IRI )
            // PsiInternalOntologicalModelingLanguage.g:390:5: lv_iri_2_0= RULE_IRI
            {

            					markLeaf(elementTypeProvider.getBundle_IriIRITerminalRuleCall_2_0ElementType());
            				
            lv_iri_2_0=(Token)match(input,RULE_IRI,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_iri_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getBundle_LCURLYTerminalRuleCall_3ElementType());
            		
            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_13); 

            			doneLeaf(this_LCURLY_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:412:3: ( ( (lv_annotations_4_0= ruleAnnotation ) ) | ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) ) | ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) ) | ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) ) | ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) ) )*
            loop5:
            do {
                int alt5=6;
                switch ( input.LA(1) ) {
                case RULE_ANNOTATION_TOKEN:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN:
                case RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN:
                case RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN:
                    {
                    alt5=2;
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
                case 73:
                case 74:
                case 75:
                case 76:
                    {
                    alt5=3;
                    }
                    break;
                case RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN:
                case RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN:
                case RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN:
                    {
                    alt5=4;
                    }
                    break;
                case RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN:
                    {
                    alt5=5;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // PsiInternalOntologicalModelingLanguage.g:413:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:413:4: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // PsiInternalOntologicalModelingLanguage.g:414:5: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:414:5: (lv_annotations_4_0= ruleAnnotation )
            	    // PsiInternalOntologicalModelingLanguage.g:415:6: lv_annotations_4_0= ruleAnnotation
            	    {

            	    						markComposite(elementTypeProvider.getBundle_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    // PsiInternalOntologicalModelingLanguage.g:429:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:429:4: ( (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom ) )
            	    // PsiInternalOntologicalModelingLanguage.g:430:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:430:5: (lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom )
            	    // PsiInternalOntologicalModelingLanguage.g:431:6: lv_terminologyBoxAxioms_5_0= ruleTerminologyBoxAxiom
            	    {

            	    						markComposite(elementTypeProvider.getBundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    // PsiInternalOntologicalModelingLanguage.g:445:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:445:4: ( (lv_boxStatements_6_0= ruleTerminologyBoxStatement ) )
            	    // PsiInternalOntologicalModelingLanguage.g:446:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:446:5: (lv_boxStatements_6_0= ruleTerminologyBoxStatement )
            	    // PsiInternalOntologicalModelingLanguage.g:447:6: lv_boxStatements_6_0= ruleTerminologyBoxStatement
            	    {

            	    						markComposite(elementTypeProvider.getBundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    // PsiInternalOntologicalModelingLanguage.g:461:4: ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:461:4: ( (lv_bundleStatements_7_0= ruleTerminologyBundleStatement ) )
            	    // PsiInternalOntologicalModelingLanguage.g:462:5: (lv_bundleStatements_7_0= ruleTerminologyBundleStatement )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:462:5: (lv_bundleStatements_7_0= ruleTerminologyBundleStatement )
            	    // PsiInternalOntologicalModelingLanguage.g:463:6: lv_bundleStatements_7_0= ruleTerminologyBundleStatement
            	    {

            	    						markComposite(elementTypeProvider.getBundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0ElementType());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    // PsiInternalOntologicalModelingLanguage.g:477:4: ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:477:4: ( (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom ) )
            	    // PsiInternalOntologicalModelingLanguage.g:478:5: (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom )
            	    {
            	    // PsiInternalOntologicalModelingLanguage.g:478:5: (lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom )
            	    // PsiInternalOntologicalModelingLanguage.g:479:6: lv_terminologyBundleAxioms_8_0= ruleTerminologyBundleAxiom
            	    {

            	    						markComposite(elementTypeProvider.getBundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0ElementType());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    break loop5;
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
    // PsiInternalOntologicalModelingLanguage.g:504:1: entryRuleTerminologyBoxAxiom returns [Boolean current=false] : iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF ;
    public final Boolean entryRuleTerminologyBoxAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyBoxAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:504:61: (iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:505:2: iv_ruleTerminologyBoxAxiom= ruleTerminologyBoxAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:511:1: ruleTerminologyBoxAxiom returns [Boolean current=false] : (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom ) ;
    public final Boolean ruleTerminologyBoxAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_ConceptDesignationTerminologyAxiom_0 = null;

        Boolean this_TerminologyExtensionAxiom_1 = null;

        Boolean this_TerminologyNestingAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:512:1: ( (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:513:2: (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:513:2: (this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom | this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom | this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN:
                {
                alt6=1;
                }
                break;
            case RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN:
                {
                alt6=2;
                }
                break;
            case RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:514:3: this_ConceptDesignationTerminologyAxiom_0= ruleConceptDesignationTerminologyAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:523:3: this_TerminologyExtensionAxiom_1= ruleTerminologyExtensionAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:532:3: this_TerminologyNestingAxiom_2= ruleTerminologyNestingAxiom
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
    // PsiInternalOntologicalModelingLanguage.g:544:1: entryRuleTerminologyBoxStatement returns [Boolean current=false] : iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF ;
    public final Boolean entryRuleTerminologyBoxStatement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyBoxStatement = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:544:65: (iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF )
            // PsiInternalOntologicalModelingLanguage.g:545:2: iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF
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
    // PsiInternalOntologicalModelingLanguage.g:551:1: ruleTerminologyBoxStatement returns [Boolean current=false] : (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm ) ;
    public final Boolean ruleTerminologyBoxStatement() throws RecognitionException {
        Boolean current = false;

        Boolean this_Axiom_0 = null;

        Boolean this_Term_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:552:1: ( (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm ) )
            // PsiInternalOntologicalModelingLanguage.g:553:2: (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm )
            {
            // PsiInternalOntologicalModelingLanguage.g:553:2: (this_Axiom_0= ruleAxiom | this_Term_1= ruleTerm )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IRI||LA7_0==RULE_ID||(LA7_0>=RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN && LA7_0<=RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN)||(LA7_0>=RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN && LA7_0<=RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN)||LA7_0==RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ASPECT_TOKEN||(LA7_0>=RULE_ABSTRACT_TOKEN && LA7_0<=RULE_REIFIED_RELATIONSHIP_TOKEN)||(LA7_0>=RULE_UNREIFIED_RELATIONSHIP_TOKEN && LA7_0<=RULE_STRUCTURE_TOKEN)||LA7_0==RULE_BINARY_SCALAR_RESTRICTION_TOKEN||(LA7_0>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA7_0<=RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN)||(LA7_0>=RULE_STRING_SCALAR_RESTRICTION_TOKEN && LA7_0<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)||(LA7_0>=73 && LA7_0<=76)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:554:3: this_Axiom_0= ruleAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:563:3: this_Term_1= ruleTerm
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
    // PsiInternalOntologicalModelingLanguage.g:575:1: entryRuleTerm returns [Boolean current=false] : iv_ruleTerm= ruleTerm EOF ;
    public final Boolean entryRuleTerm() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerm = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:575:46: (iv_ruleTerm= ruleTerm EOF )
            // PsiInternalOntologicalModelingLanguage.g:576:2: iv_ruleTerm= ruleTerm EOF
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
    // PsiInternalOntologicalModelingLanguage.g:582:1: ruleTerm returns [Boolean current=false] : (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship ) ;
    public final Boolean ruleTerm() throws RecognitionException {
        Boolean current = false;

        Boolean this_AtomicEntity_0 = null;

        Boolean this_EntityRelationship_1 = null;

        Boolean this_Datatype_2 = null;

        Boolean this_DataRelationship_3 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:583:1: ( (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship ) )
            // PsiInternalOntologicalModelingLanguage.g:584:2: (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship )
            {
            // PsiInternalOntologicalModelingLanguage.g:584:2: (this_AtomicEntity_0= ruleAtomicEntity | this_EntityRelationship_1= ruleEntityRelationship | this_Datatype_2= ruleDatatype | this_DataRelationship_3= ruleDataRelationship )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ASPECT_TOKEN:
            case RULE_CONCEPT_TOKEN:
                {
                alt8=1;
                }
                break;
            case RULE_ABSTRACT_TOKEN:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_CONCEPT_TOKEN) ) {
                    alt8=1;
                }
                else if ( (LA8_2==RULE_REIFIED_RELATIONSHIP_TOKEN) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REIFIED_RELATIONSHIP_TOKEN:
            case RULE_UNREIFIED_RELATIONSHIP_TOKEN:
                {
                alt8=2;
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
                alt8=3;
                }
                break;
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:585:3: this_AtomicEntity_0= ruleAtomicEntity
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
                    // PsiInternalOntologicalModelingLanguage.g:594:3: this_EntityRelationship_1= ruleEntityRelationship
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
                    // PsiInternalOntologicalModelingLanguage.g:603:3: this_Datatype_2= ruleDatatype
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
                    // PsiInternalOntologicalModelingLanguage.g:612:3: this_DataRelationship_3= ruleDataRelationship
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
    // PsiInternalOntologicalModelingLanguage.g:624:1: entryRuleAtomicEntity returns [Boolean current=false] : iv_ruleAtomicEntity= ruleAtomicEntity EOF ;
    public final Boolean entryRuleAtomicEntity() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAtomicEntity = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:624:54: (iv_ruleAtomicEntity= ruleAtomicEntity EOF )
            // PsiInternalOntologicalModelingLanguage.g:625:2: iv_ruleAtomicEntity= ruleAtomicEntity EOF
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
    // PsiInternalOntologicalModelingLanguage.g:631:1: ruleAtomicEntity returns [Boolean current=false] : (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept ) ;
    public final Boolean ruleAtomicEntity() throws RecognitionException {
        Boolean current = false;

        Boolean this_Aspect_0 = null;

        Boolean this_Concept_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:632:1: ( (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept ) )
            // PsiInternalOntologicalModelingLanguage.g:633:2: (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept )
            {
            // PsiInternalOntologicalModelingLanguage.g:633:2: (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ASPECT_TOKEN) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_ABSTRACT_TOKEN && LA9_0<=RULE_CONCEPT_TOKEN)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:634:3: this_Aspect_0= ruleAspect
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
                    // PsiInternalOntologicalModelingLanguage.g:643:3: this_Concept_1= ruleConcept
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
    // PsiInternalOntologicalModelingLanguage.g:655:1: entryRuleEntityRelationship returns [Boolean current=false] : iv_ruleEntityRelationship= ruleEntityRelationship EOF ;
    public final Boolean entryRuleEntityRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityRelationship = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:655:60: (iv_ruleEntityRelationship= ruleEntityRelationship EOF )
            // PsiInternalOntologicalModelingLanguage.g:656:2: iv_ruleEntityRelationship= ruleEntityRelationship EOF
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
    // PsiInternalOntologicalModelingLanguage.g:662:1: ruleEntityRelationship returns [Boolean current=false] : (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship ) ;
    public final Boolean ruleEntityRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean this_ReifiedRelationship_0 = null;

        Boolean this_UnreifiedRelationship_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:663:1: ( (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship ) )
            // PsiInternalOntologicalModelingLanguage.g:664:2: (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship )
            {
            // PsiInternalOntologicalModelingLanguage.g:664:2: (this_ReifiedRelationship_0= ruleReifiedRelationship | this_UnreifiedRelationship_1= ruleUnreifiedRelationship )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ABSTRACT_TOKEN||LA10_0==RULE_REIFIED_RELATIONSHIP_TOKEN) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_UNREIFIED_RELATIONSHIP_TOKEN) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:665:3: this_ReifiedRelationship_0= ruleReifiedRelationship
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
                    // PsiInternalOntologicalModelingLanguage.g:674:3: this_UnreifiedRelationship_1= ruleUnreifiedRelationship
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
    // PsiInternalOntologicalModelingLanguage.g:686:1: entryRuleDatatype returns [Boolean current=false] : iv_ruleDatatype= ruleDatatype EOF ;
    public final Boolean entryRuleDatatype() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDatatype = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:686:50: (iv_ruleDatatype= ruleDatatype EOF )
            // PsiInternalOntologicalModelingLanguage.g:687:2: iv_ruleDatatype= ruleDatatype EOF
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
    // PsiInternalOntologicalModelingLanguage.g:693:1: ruleDatatype returns [Boolean current=false] : (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure ) ;
    public final Boolean ruleDatatype() throws RecognitionException {
        Boolean current = false;

        Boolean this_ScalarDataRange_0 = null;

        Boolean this_Structure_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:694:1: ( (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure ) )
            // PsiInternalOntologicalModelingLanguage.g:695:2: (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure )
            {
            // PsiInternalOntologicalModelingLanguage.g:695:2: (this_ScalarDataRange_0= ruleScalarDataRange | this_Structure_1= ruleStructure )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SCALAR_TOKEN||LA11_0==RULE_BINARY_SCALAR_RESTRICTION_TOKEN||(LA11_0>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA11_0<=RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN)||(LA11_0>=RULE_STRING_SCALAR_RESTRICTION_TOKEN && LA11_0<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRUCTURE_TOKEN) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:696:3: this_ScalarDataRange_0= ruleScalarDataRange
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
                    // PsiInternalOntologicalModelingLanguage.g:705:3: this_Structure_1= ruleStructure
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
    // PsiInternalOntologicalModelingLanguage.g:717:1: entryRuleScalarDataRange returns [Boolean current=false] : iv_ruleScalarDataRange= ruleScalarDataRange EOF ;
    public final Boolean entryRuleScalarDataRange() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarDataRange = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:717:57: (iv_ruleScalarDataRange= ruleScalarDataRange EOF )
            // PsiInternalOntologicalModelingLanguage.g:718:2: iv_ruleScalarDataRange= ruleScalarDataRange EOF
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
    // PsiInternalOntologicalModelingLanguage.g:724:1: ruleScalarDataRange returns [Boolean current=false] : (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange ) ;
    public final Boolean ruleScalarDataRange() throws RecognitionException {
        Boolean current = false;

        Boolean this_Scalar_0 = null;

        Boolean this_RestrictedDataRange_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:725:1: ( (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange ) )
            // PsiInternalOntologicalModelingLanguage.g:726:2: (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange )
            {
            // PsiInternalOntologicalModelingLanguage.g:726:2: (this_Scalar_0= ruleScalar | this_RestrictedDataRange_1= ruleRestrictedDataRange )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SCALAR_TOKEN) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_BINARY_SCALAR_RESTRICTION_TOKEN||(LA12_0>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA12_0<=RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN)||(LA12_0>=RULE_STRING_SCALAR_RESTRICTION_TOKEN && LA12_0<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:727:3: this_Scalar_0= ruleScalar
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
                    // PsiInternalOntologicalModelingLanguage.g:736:3: this_RestrictedDataRange_1= ruleRestrictedDataRange
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
    // PsiInternalOntologicalModelingLanguage.g:748:1: entryRuleRestrictedDataRange returns [Boolean current=false] : iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF ;
    public final Boolean entryRuleRestrictedDataRange() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRestrictedDataRange = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:748:61: (iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF )
            // PsiInternalOntologicalModelingLanguage.g:749:2: iv_ruleRestrictedDataRange= ruleRestrictedDataRange EOF
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
    // PsiInternalOntologicalModelingLanguage.g:755:1: ruleRestrictedDataRange returns [Boolean current=false] : (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:756:1: ( (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction ) )
            // PsiInternalOntologicalModelingLanguage.g:757:2: (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction )
            {
            // PsiInternalOntologicalModelingLanguage.g:757:2: (this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction | this_IRIScalarRestriction_1= ruleIRIScalarRestriction | this_NumericScalarRestriction_2= ruleNumericScalarRestriction | this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction | this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction | this_StringScalarRestriction_5= ruleStringScalarRestriction | this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction | this_TimeScalarRestriction_7= ruleTimeScalarRestriction )
            int alt13=8;
            switch ( input.LA(1) ) {
            case RULE_BINARY_SCALAR_RESTRICTION_TOKEN:
                {
                alt13=1;
                }
                break;
            case RULE_IRI_SCALAR_RESTRICTION_TOKEN:
                {
                alt13=2;
                }
                break;
            case RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN:
                {
                alt13=3;
                }
                break;
            case RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN:
                {
                alt13=4;
                }
                break;
            case RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN:
                {
                alt13=5;
                }
                break;
            case RULE_STRING_SCALAR_RESTRICTION_TOKEN:
                {
                alt13=6;
                }
                break;
            case RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN:
                {
                alt13=7;
                }
                break;
            case RULE_TIME_SCALAR_RESTRICTION_TOKEN:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:758:3: this_BinaryScalarRestriction_0= ruleBinaryScalarRestriction
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
                    // PsiInternalOntologicalModelingLanguage.g:767:3: this_IRIScalarRestriction_1= ruleIRIScalarRestriction
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
                    // PsiInternalOntologicalModelingLanguage.g:776:3: this_NumericScalarRestriction_2= ruleNumericScalarRestriction
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
                    // PsiInternalOntologicalModelingLanguage.g:785:3: this_PlainLiteralScalarRestriction_3= rulePlainLiteralScalarRestriction
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
                    // PsiInternalOntologicalModelingLanguage.g:794:3: this_ScalarOneOfRestriction_4= ruleScalarOneOfRestriction
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
                    // PsiInternalOntologicalModelingLanguage.g:803:3: this_StringScalarRestriction_5= ruleStringScalarRestriction
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
                    // PsiInternalOntologicalModelingLanguage.g:812:3: this_SynonymScalarRestriction_6= ruleSynonymScalarRestriction
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
                    // PsiInternalOntologicalModelingLanguage.g:821:3: this_TimeScalarRestriction_7= ruleTimeScalarRestriction
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
    // PsiInternalOntologicalModelingLanguage.g:833:1: entryRuleDataRelationship returns [Boolean current=false] : iv_ruleDataRelationship= ruleDataRelationship EOF ;
    public final Boolean entryRuleDataRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDataRelationship = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:833:58: (iv_ruleDataRelationship= ruleDataRelationship EOF )
            // PsiInternalOntologicalModelingLanguage.g:834:2: iv_ruleDataRelationship= ruleDataRelationship EOF
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
    // PsiInternalOntologicalModelingLanguage.g:840:1: ruleDataRelationship returns [Boolean current=false] : (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty ) ;
    public final Boolean ruleDataRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean this_EntityStructuredDataProperty_0 = null;

        Boolean this_EntityScalarDataProperty_1 = null;

        Boolean this_StructuredDataProperty_2 = null;

        Boolean this_ScalarDataProperty_3 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:841:1: ( (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty ) )
            // PsiInternalOntologicalModelingLanguage.g:842:2: (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty )
            {
            // PsiInternalOntologicalModelingLanguage.g:842:2: (this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty | this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty | this_StructuredDataProperty_2= ruleStructuredDataProperty | this_ScalarDataProperty_3= ruleScalarDataProperty )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt14=1;
                }
                break;
            case 74:
                {
                alt14=2;
                }
                break;
            case 75:
                {
                alt14=3;
                }
                break;
            case 76:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:843:3: this_EntityStructuredDataProperty_0= ruleEntityStructuredDataProperty
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
                    // PsiInternalOntologicalModelingLanguage.g:852:3: this_EntityScalarDataProperty_1= ruleEntityScalarDataProperty
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
                    // PsiInternalOntologicalModelingLanguage.g:861:3: this_StructuredDataProperty_2= ruleStructuredDataProperty
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
                    // PsiInternalOntologicalModelingLanguage.g:870:3: this_ScalarDataProperty_3= ruleScalarDataProperty
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
    // PsiInternalOntologicalModelingLanguage.g:882:1: entryRuleAxiom returns [Boolean current=false] : iv_ruleAxiom= ruleAxiom EOF ;
    public final Boolean entryRuleAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:882:47: (iv_ruleAxiom= ruleAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:883:2: iv_ruleAxiom= ruleAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:889:1: ruleAxiom returns [Boolean current=false] : (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom ) ;
    public final Boolean ruleAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_ScalarOneOfLiteralAxiom_0 = null;

        Boolean this_TermAxiom_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:890:1: ( (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:891:2: (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:891:2: (this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom | this_TermAxiom_1= ruleTermAxiom )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_IRI||LA15_0==RULE_ID||(LA15_0>=RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN && LA15_0<=RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN)||(LA15_0>=RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN && LA15_0<=RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:892:3: this_ScalarOneOfLiteralAxiom_0= ruleScalarOneOfLiteralAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:901:3: this_TermAxiom_1= ruleTermAxiom
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
    // PsiInternalOntologicalModelingLanguage.g:913:1: entryRuleTermAxiom returns [Boolean current=false] : iv_ruleTermAxiom= ruleTermAxiom EOF ;
    public final Boolean entryRuleTermAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTermAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:913:51: (iv_ruleTermAxiom= ruleTermAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:914:2: iv_ruleTermAxiom= ruleTermAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:920:1: ruleTermAxiom returns [Boolean current=false] : (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom ) ;
    public final Boolean ruleTermAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_EntityRestrictionAxiom_0 = null;

        Boolean this_EntityScalarDataPropertyRestrictionAxiom_1 = null;

        Boolean this_SpecializationAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:921:1: ( (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:922:2: (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:922:2: (this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom | this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom | this_SpecializationAxiom_2= ruleSpecializationAxiom )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
            case RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                {
                alt16=1;
                }
                break;
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN:
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
                {
                alt16=2;
                }
                break;
            case RULE_IRI:
            case RULE_ID:
            case RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN:
            case RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN:
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
                    // PsiInternalOntologicalModelingLanguage.g:923:3: this_EntityRestrictionAxiom_0= ruleEntityRestrictionAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:932:3: this_EntityScalarDataPropertyRestrictionAxiom_1= ruleEntityScalarDataPropertyRestrictionAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:941:3: this_SpecializationAxiom_2= ruleSpecializationAxiom
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
    // PsiInternalOntologicalModelingLanguage.g:953:1: entryRuleEntityRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:953:64: (iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:954:2: iv_ruleEntityRestrictionAxiom= ruleEntityRestrictionAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:960:1: ruleEntityRestrictionAxiom returns [Boolean current=false] : (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom ) ;
    public final Boolean ruleEntityRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_EntityExistentialRestrictionAxiom_0 = null;

        Boolean this_EntityUniversalRestrictionAxiom_1 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:961:1: ( (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:962:2: (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:962:2: (this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom | this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:963:3: this_EntityExistentialRestrictionAxiom_0= ruleEntityExistentialRestrictionAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:972:3: this_EntityUniversalRestrictionAxiom_1= ruleEntityUniversalRestrictionAxiom
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
    // PsiInternalOntologicalModelingLanguage.g:984:1: entryRuleEntityScalarDataPropertyRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityScalarDataPropertyRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataPropertyRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:984:82: (iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:985:2: iv_ruleEntityScalarDataPropertyRestrictionAxiom= ruleEntityScalarDataPropertyRestrictionAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:991:1: ruleEntityScalarDataPropertyRestrictionAxiom returns [Boolean current=false] : (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom ) ;
    public final Boolean ruleEntityScalarDataPropertyRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_EntityScalarDataPropertyExistentialRestrictionAxiom_0 = null;

        Boolean this_EntityScalarDataPropertyParticularRestrictionAxiom_1 = null;

        Boolean this_EntityScalarDataPropertyUniversalRestrictionAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:992:1: ( (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:993:2: (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:993:2: (this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom | this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom | this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN:
                {
                alt18=1;
                }
                break;
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN:
                {
                alt18=2;
                }
                break;
            case RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN:
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
                    // PsiInternalOntologicalModelingLanguage.g:994:3: this_EntityScalarDataPropertyExistentialRestrictionAxiom_0= ruleEntityScalarDataPropertyExistentialRestrictionAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:1003:3: this_EntityScalarDataPropertyParticularRestrictionAxiom_1= ruleEntityScalarDataPropertyParticularRestrictionAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:1012:3: this_EntityScalarDataPropertyUniversalRestrictionAxiom_2= ruleEntityScalarDataPropertyUniversalRestrictionAxiom
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
    // PsiInternalOntologicalModelingLanguage.g:1024:1: entryRuleSpecializationAxiom returns [Boolean current=false] : iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF ;
    public final Boolean entryRuleSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSpecializationAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1024:61: (iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:1025:2: iv_ruleSpecializationAxiom= ruleSpecializationAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1031:1: ruleSpecializationAxiom returns [Boolean current=false] : (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom ) ;
    public final Boolean ruleSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_ConceptSpecializationAxiom_0 = null;

        Boolean this_AspectSpecializationAxiom_1 = null;

        Boolean this_ReifiedRelationshipSpecializationAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1032:1: ( (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:1033:2: (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:1033:2: (this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom | this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom | this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN:
                {
                alt19=1;
                }
                break;
            case RULE_IRI:
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1034:3: this_ConceptSpecializationAxiom_0= ruleConceptSpecializationAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:1043:3: this_AspectSpecializationAxiom_1= ruleAspectSpecializationAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:1052:3: this_ReifiedRelationshipSpecializationAxiom_2= ruleReifiedRelationshipSpecializationAxiom
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
    // PsiInternalOntologicalModelingLanguage.g:1064:1: entryRuleTerminologyBundleStatement returns [Boolean current=false] : iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF ;
    public final Boolean entryRuleTerminologyBundleStatement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyBundleStatement = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1064:68: (iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF )
            // PsiInternalOntologicalModelingLanguage.g:1065:2: iv_ruleTerminologyBundleStatement= ruleTerminologyBundleStatement EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1071:1: ruleTerminologyBundleStatement returns [Boolean current=false] : (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom ) ;
    public final Boolean ruleTerminologyBundleStatement() throws RecognitionException {
        Boolean current = false;

        Boolean this_AnonymousConceptTaxonomyAxiom_0 = null;

        Boolean this_RootConceptTaxonomyAxiom_1 = null;

        Boolean this_SpecificDisjointConceptAxiom_2 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1072:1: ( (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom ) )
            // PsiInternalOntologicalModelingLanguage.g:1073:2: (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom )
            {
            // PsiInternalOntologicalModelingLanguage.g:1073:2: (this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom | this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom | this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN:
                {
                alt20=1;
                }
                break;
            case RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN:
                {
                alt20=2;
                }
                break;
            case RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1074:3: this_AnonymousConceptTaxonomyAxiom_0= ruleAnonymousConceptTaxonomyAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:1083:3: this_RootConceptTaxonomyAxiom_1= ruleRootConceptTaxonomyAxiom
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
                    // PsiInternalOntologicalModelingLanguage.g:1092:3: this_SpecificDisjointConceptAxiom_2= ruleSpecificDisjointConceptAxiom
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
    // PsiInternalOntologicalModelingLanguage.g:1104:1: entryRuleTerminologyBundleAxiom returns [Boolean current=false] : iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF ;
    public final Boolean entryRuleTerminologyBundleAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyBundleAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1104:64: (iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:1105:2: iv_ruleTerminologyBundleAxiom= ruleTerminologyBundleAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1111:1: ruleTerminologyBundleAxiom returns [Boolean current=false] : this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom ;
    public final Boolean ruleTerminologyBundleAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean this_BundledTerminologyAxiom_0 = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1112:1: (this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom )
            // PsiInternalOntologicalModelingLanguage.g:1113:2: this_BundledTerminologyAxiom_0= ruleBundledTerminologyAxiom
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
    // PsiInternalOntologicalModelingLanguage.g:1124:1: entryRuleAspect returns [Boolean current=false] : iv_ruleAspect= ruleAspect EOF ;
    public final Boolean entryRuleAspect() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAspect = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1124:48: (iv_ruleAspect= ruleAspect EOF )
            // PsiInternalOntologicalModelingLanguage.g:1125:2: iv_ruleAspect= ruleAspect EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1131:1: ruleAspect returns [Boolean current=false] : (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleAspect() throws RecognitionException {
        Boolean current = false;

        Token this_ASPECT_TOKEN_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1132:1: ( (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1133:2: (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1133:2: (this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1134:3: this_ASPECT_TOKEN_0= RULE_ASPECT_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getAspect_ASPECT_TOKENTerminalRuleCall_0ElementType());
            		
            this_ASPECT_TOKEN_0=(Token)match(input,RULE_ASPECT_TOKEN,FOLLOW_5); 

            			doneLeaf(this_ASPECT_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1141:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1142:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1142:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1143:5: lv_name_1_0= RULE_ID
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
    // PsiInternalOntologicalModelingLanguage.g:1162:1: entryRuleConcept returns [Boolean current=false] : iv_ruleConcept= ruleConcept EOF ;
    public final Boolean entryRuleConcept() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConcept = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1162:49: (iv_ruleConcept= ruleConcept EOF )
            // PsiInternalOntologicalModelingLanguage.g:1163:2: iv_ruleConcept= ruleConcept EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1169:1: ruleConcept returns [Boolean current=false] : ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final Boolean ruleConcept() throws RecognitionException {
        Boolean current = false;

        Token lv_isAbstract_0_0=null;
        Token this_CONCEPT_TOKEN_1=null;
        Token lv_name_2_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1170:1: ( ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1171:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1171:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1172:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_CONCEPT_TOKEN_1= RULE_CONCEPT_TOKEN ( (lv_name_2_0= RULE_ID ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1172:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ABSTRACT_TOKEN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1173:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1173:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1174:5: lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getConcept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType());
                    				
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


            			markLeaf(elementTypeProvider.getConcept_CONCEPT_TOKENTerminalRuleCall_1ElementType());
            		
            this_CONCEPT_TOKEN_1=(Token)match(input,RULE_CONCEPT_TOKEN,FOLLOW_5); 

            			doneLeaf(this_CONCEPT_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:1196:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1197:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1197:4: (lv_name_2_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1198:5: lv_name_2_0= RULE_ID
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
    // PsiInternalOntologicalModelingLanguage.g:1217:1: entryRuleReifiedRelationship returns [Boolean current=false] : iv_ruleReifiedRelationship= ruleReifiedRelationship EOF ;
    public final Boolean entryRuleReifiedRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReifiedRelationship = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1217:61: (iv_ruleReifiedRelationship= ruleReifiedRelationship EOF )
            // PsiInternalOntologicalModelingLanguage.g:1218:2: iv_ruleReifiedRelationship= ruleReifiedRelationship EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1224:1: ruleReifiedRelationship returns [Boolean current=false] : ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:1225:1: ( ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:1226:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:1226:2: ( ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:1227:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )? this_REIFIED_RELATIONSHIP_TOKEN_1= RULE_REIFIED_RELATIONSHIP_TOKEN ( (lv_name_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )? this_UNREIFIED_TOKEN_13= RULE_UNREIFIED_TOKEN this_EQUAL_14= RULE_EQUAL ( (lv_unreifiedPropertyName_15_0= RULE_ID ) ) (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )? this_SOURCE_TOKEN_19= RULE_SOURCE_TOKEN this_EQUAL_20= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_22= RULE_TARGET_TOKEN this_EQUAL_23= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_25= RULE_RCURLY
            {
            // PsiInternalOntologicalModelingLanguage.g:1227:3: ( (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ABSTRACT_TOKEN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1228:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1228:4: (lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1229:5: lv_isAbstract_0_0= RULE_ABSTRACT_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType());
                    				
                    lv_isAbstract_0_0=(Token)match(input,RULE_ABSTRACT_TOKEN,FOLLOW_15); 

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
            		
            this_REIFIED_RELATIONSHIP_TOKEN_1=(Token)match(input,RULE_REIFIED_RELATIONSHIP_TOKEN,FOLLOW_5); 

            			doneLeaf(this_REIFIED_RELATIONSHIP_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:1251:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1252:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1252:4: (lv_name_2_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1253:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getReifiedRelationship_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationship_LCURLYTerminalRuleCall_3ElementType());
            		
            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_16); 

            			doneLeaf(this_LCURLY_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:1275:3: ( (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_FUNCTIONAL_TOKEN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1276:4: (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1276:4: (lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1277:5: lv_isFunctional_4_0= RULE_FUNCTIONAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType());
                    				
                    lv_isFunctional_4_0=(Token)match(input,RULE_FUNCTIONAL_TOKEN,FOLLOW_17); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isFunctional_4_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1292:3: ( (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INVERSE_FUNCTIONAL_TOKEN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1293:4: (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1293:4: (lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1294:5: lv_isInverseFunctional_5_0= RULE_INVERSE_FUNCTIONAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0ElementType());
                    				
                    lv_isInverseFunctional_5_0=(Token)match(input,RULE_INVERSE_FUNCTIONAL_TOKEN,FOLLOW_18); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isInverseFunctional_5_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1309:3: ( (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ESSENTIAL_TOKEN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1310:4: (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1310:4: (lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1311:5: lv_isEssential_6_0= RULE_ESSENTIAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0ElementType());
                    				
                    lv_isEssential_6_0=(Token)match(input,RULE_ESSENTIAL_TOKEN,FOLLOW_19); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isEssential_6_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1326:3: ( (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INVERSE_ESSENTIAL_TOKEN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1327:4: (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1327:4: (lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1328:5: lv_isInverseEssential_7_0= RULE_INVERSE_ESSENTIAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0ElementType());
                    				
                    lv_isInverseEssential_7_0=(Token)match(input,RULE_INVERSE_ESSENTIAL_TOKEN,FOLLOW_20); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isInverseEssential_7_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1343:3: ( (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_SYMMETRIC_TOKEN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1344:4: (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1344:4: (lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1345:5: lv_isSymmetric_8_0= RULE_SYMMETRIC_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0ElementType());
                    				
                    lv_isSymmetric_8_0=(Token)match(input,RULE_SYMMETRIC_TOKEN,FOLLOW_21); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isSymmetric_8_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1360:3: ( (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ASYMMETRIC_TOKEN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1361:4: (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1361:4: (lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1362:5: lv_isAsymmetric_9_0= RULE_ASYMMETRIC_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0ElementType());
                    				
                    lv_isAsymmetric_9_0=(Token)match(input,RULE_ASYMMETRIC_TOKEN,FOLLOW_22); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isAsymmetric_9_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1377:3: ( (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_REFLEXIVE_TOKEN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1378:4: (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1378:4: (lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1379:5: lv_isReflexive_10_0= RULE_REFLEXIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType());
                    				
                    lv_isReflexive_10_0=(Token)match(input,RULE_REFLEXIVE_TOKEN,FOLLOW_23); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isReflexive_10_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1394:3: ( (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IRREFLEXIVE_TOKEN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1395:4: (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1395:4: (lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1396:5: lv_isIrreflexive_11_0= RULE_IRREFLEXIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0ElementType());
                    				
                    lv_isIrreflexive_11_0=(Token)match(input,RULE_IRREFLEXIVE_TOKEN,FOLLOW_24); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isIrreflexive_11_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1411:3: ( (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_TRANSITIVE_TOKEN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1412:4: (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1412:4: (lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1413:5: lv_isTransitive_12_0= RULE_TRANSITIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0ElementType());
                    				
                    lv_isTransitive_12_0=(Token)match(input,RULE_TRANSITIVE_TOKEN,FOLLOW_25); 

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
            		
            this_UNREIFIED_TOKEN_13=(Token)match(input,RULE_UNREIFIED_TOKEN,FOLLOW_6); 

            			doneLeaf(this_UNREIFIED_TOKEN_13);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_14ElementType());
            		
            this_EQUAL_14=(Token)match(input,RULE_EQUAL,FOLLOW_5); 

            			doneLeaf(this_EQUAL_14);
            		
            // PsiInternalOntologicalModelingLanguage.g:1442:3: ( (lv_unreifiedPropertyName_15_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1443:4: (lv_unreifiedPropertyName_15_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1443:4: (lv_unreifiedPropertyName_15_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1444:5: lv_unreifiedPropertyName_15_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0ElementType());
            				
            lv_unreifiedPropertyName_15_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_unreifiedPropertyName_15_0);
            				

            }


            }

            // PsiInternalOntologicalModelingLanguage.g:1459:3: (this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INVERSE_TOKEN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1460:4: this_INVERSE_TOKEN_16= RULE_INVERSE_TOKEN this_EQUAL_17= RULE_EQUAL ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0ElementType());
                    			
                    this_INVERSE_TOKEN_16=(Token)match(input,RULE_INVERSE_TOKEN,FOLLOW_6); 

                    				doneLeaf(this_INVERSE_TOKEN_16);
                    			

                    				markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_16_1ElementType());
                    			
                    this_EQUAL_17=(Token)match(input,RULE_EQUAL,FOLLOW_5); 

                    				doneLeaf(this_EQUAL_17);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:1474:4: ( (lv_unreifiedInversePropertyName_18_0= RULE_ID ) )
                    // PsiInternalOntologicalModelingLanguage.g:1475:5: (lv_unreifiedInversePropertyName_18_0= RULE_ID )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1475:5: (lv_unreifiedInversePropertyName_18_0= RULE_ID )
                    // PsiInternalOntologicalModelingLanguage.g:1476:6: lv_unreifiedInversePropertyName_18_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0ElementType());
                    					
                    lv_unreifiedInversePropertyName_18_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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
            		
            this_SOURCE_TOKEN_19=(Token)match(input,RULE_SOURCE_TOKEN,FOLLOW_6); 

            			doneLeaf(this_SOURCE_TOKEN_19);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_18ElementType());
            		
            this_EQUAL_20=(Token)match(input,RULE_EQUAL,FOLLOW_28); 

            			doneLeaf(this_EQUAL_20);
            		
            // PsiInternalOntologicalModelingLanguage.g:1506:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1507:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1507:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1508:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationship_SourceEntityCrossReference_19_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationship_TARGET_TOKENTerminalRuleCall_20ElementType());
            		
            this_TARGET_TOKEN_22=(Token)match(input,RULE_TARGET_TOKEN,FOLLOW_6); 

            			doneLeaf(this_TARGET_TOKEN_22);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_21ElementType());
            		
            this_EQUAL_23=(Token)match(input,RULE_EQUAL,FOLLOW_28); 

            			doneLeaf(this_EQUAL_23);
            		
            // PsiInternalOntologicalModelingLanguage.g:1537:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1538:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1538:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1539:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationship_TargetEntityCrossReference_22_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:1565:1: entryRuleUnreifiedRelationship returns [Boolean current=false] : iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF ;
    public final Boolean entryRuleUnreifiedRelationship() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUnreifiedRelationship = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1565:63: (iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF )
            // PsiInternalOntologicalModelingLanguage.g:1566:2: iv_ruleUnreifiedRelationship= ruleUnreifiedRelationship EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1572:1: ruleUnreifiedRelationship returns [Boolean current=false] : (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:1573:1: ( (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:1574:2: (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:1574:2: (this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:1575:3: this_UNREIFIED_RELATIONSHIP_TOKEN_0= RULE_UNREIFIED_RELATIONSHIP_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )? ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )? ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )? ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )? ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )? ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )? ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )? ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )? ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )? this_SOURCE_TOKEN_12= RULE_SOURCE_TOKEN this_EQUAL_13= RULE_EQUAL ( ( ruleReference ) ) this_TARGET_TOKEN_15= RULE_TARGET_TOKEN this_EQUAL_16= RULE_EQUAL ( ( ruleReference ) ) this_RCURLY_18= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getUnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0ElementType());
            		
            this_UNREIFIED_RELATIONSHIP_TOKEN_0=(Token)match(input,RULE_UNREIFIED_RELATIONSHIP_TOKEN,FOLLOW_5); 

            			doneLeaf(this_UNREIFIED_RELATIONSHIP_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1582:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1583:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1583:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1584:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getUnreifiedRelationship_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationship_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_31); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:1606:3: ( (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_FUNCTIONAL_TOKEN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1607:4: (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1607:4: (lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1608:5: lv_isFunctional_3_0= RULE_FUNCTIONAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0ElementType());
                    				
                    lv_isFunctional_3_0=(Token)match(input,RULE_FUNCTIONAL_TOKEN,FOLLOW_32); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isFunctional_3_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1623:3: ( (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INVERSE_FUNCTIONAL_TOKEN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1624:4: (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1624:4: (lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1625:5: lv_isInverseFunctional_4_0= RULE_INVERSE_FUNCTIONAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType());
                    				
                    lv_isInverseFunctional_4_0=(Token)match(input,RULE_INVERSE_FUNCTIONAL_TOKEN,FOLLOW_33); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isInverseFunctional_4_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1640:3: ( (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ESSENTIAL_TOKEN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1641:4: (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1641:4: (lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1642:5: lv_isEssential_5_0= RULE_ESSENTIAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0ElementType());
                    				
                    lv_isEssential_5_0=(Token)match(input,RULE_ESSENTIAL_TOKEN,FOLLOW_34); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isEssential_5_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1657:3: ( (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INVERSE_ESSENTIAL_TOKEN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1658:4: (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1658:4: (lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1659:5: lv_isInverseEssential_6_0= RULE_INVERSE_ESSENTIAL_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0ElementType());
                    				
                    lv_isInverseEssential_6_0=(Token)match(input,RULE_INVERSE_ESSENTIAL_TOKEN,FOLLOW_35); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isInverseEssential_6_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1674:3: ( (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_SYMMETRIC_TOKEN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1675:4: (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1675:4: (lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1676:5: lv_isSymmetric_7_0= RULE_SYMMETRIC_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0ElementType());
                    				
                    lv_isSymmetric_7_0=(Token)match(input,RULE_SYMMETRIC_TOKEN,FOLLOW_36); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isSymmetric_7_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1691:3: ( (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ASYMMETRIC_TOKEN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1692:4: (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1692:4: (lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1693:5: lv_isAsymmetric_8_0= RULE_ASYMMETRIC_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0ElementType());
                    				
                    lv_isAsymmetric_8_0=(Token)match(input,RULE_ASYMMETRIC_TOKEN,FOLLOW_37); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isAsymmetric_8_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1708:3: ( (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_REFLEXIVE_TOKEN) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1709:4: (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1709:4: (lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1710:5: lv_isReflexive_9_0= RULE_REFLEXIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0ElementType());
                    				
                    lv_isReflexive_9_0=(Token)match(input,RULE_REFLEXIVE_TOKEN,FOLLOW_38); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isReflexive_9_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1725:3: ( (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_IRREFLEXIVE_TOKEN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1726:4: (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1726:4: (lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1727:5: lv_isIrreflexive_10_0= RULE_IRREFLEXIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType());
                    				
                    lv_isIrreflexive_10_0=(Token)match(input,RULE_IRREFLEXIVE_TOKEN,FOLLOW_39); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_isIrreflexive_10_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalOntologicalModelingLanguage.g:1742:3: ( (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_TRANSITIVE_TOKEN) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:1743:4: (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:1743:4: (lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN )
                    // PsiInternalOntologicalModelingLanguage.g:1744:5: lv_isTransitive_11_0= RULE_TRANSITIVE_TOKEN
                    {

                    					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0ElementType());
                    				
                    lv_isTransitive_11_0=(Token)match(input,RULE_TRANSITIVE_TOKEN,FOLLOW_27); 

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
            		
            this_SOURCE_TOKEN_12=(Token)match(input,RULE_SOURCE_TOKEN,FOLLOW_6); 

            			doneLeaf(this_SOURCE_TOKEN_12);
            		

            			markLeaf(elementTypeProvider.getUnreifiedRelationship_EQUALTerminalRuleCall_13ElementType());
            		
            this_EQUAL_13=(Token)match(input,RULE_EQUAL,FOLLOW_28); 

            			doneLeaf(this_EQUAL_13);
            		
            // PsiInternalOntologicalModelingLanguage.g:1773:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1774:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1774:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1775:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getUnreifiedRelationship_SourceEntityCrossReference_14_0ElementType());
            				
            pushFollow(FOLLOW_29);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getUnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15ElementType());
            		
            this_TARGET_TOKEN_15=(Token)match(input,RULE_TARGET_TOKEN,FOLLOW_6); 

            			doneLeaf(this_TARGET_TOKEN_15);
            		

            			markLeaf(elementTypeProvider.getUnreifiedRelationship_EQUALTerminalRuleCall_16ElementType());
            		
            this_EQUAL_16=(Token)match(input,RULE_EQUAL,FOLLOW_28); 

            			doneLeaf(this_EQUAL_16);
            		
            // PsiInternalOntologicalModelingLanguage.g:1804:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1805:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1805:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1806:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getUnreifiedRelationship_TargetEntityCrossReference_17_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:1832:1: entryRuleScalar returns [Boolean current=false] : iv_ruleScalar= ruleScalar EOF ;
    public final Boolean entryRuleScalar() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalar = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1832:48: (iv_ruleScalar= ruleScalar EOF )
            // PsiInternalOntologicalModelingLanguage.g:1833:2: iv_ruleScalar= ruleScalar EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1839:1: ruleScalar returns [Boolean current=false] : (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleScalar() throws RecognitionException {
        Boolean current = false;

        Token this_SCALAR_TOKEN_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1840:1: ( (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1841:2: (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1841:2: (this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1842:3: this_SCALAR_TOKEN_0= RULE_SCALAR_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getScalar_SCALAR_TOKENTerminalRuleCall_0ElementType());
            		
            this_SCALAR_TOKEN_0=(Token)match(input,RULE_SCALAR_TOKEN,FOLLOW_5); 

            			doneLeaf(this_SCALAR_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1849:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1850:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1850:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1851:5: lv_name_1_0= RULE_ID
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
    // PsiInternalOntologicalModelingLanguage.g:1870:1: entryRuleStructure returns [Boolean current=false] : iv_ruleStructure= ruleStructure EOF ;
    public final Boolean entryRuleStructure() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStructure = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1870:51: (iv_ruleStructure= ruleStructure EOF )
            // PsiInternalOntologicalModelingLanguage.g:1871:2: iv_ruleStructure= ruleStructure EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1877:1: ruleStructure returns [Boolean current=false] : (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleStructure() throws RecognitionException {
        Boolean current = false;

        Token this_STRUCTURE_TOKEN_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1878:1: ( (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1879:2: (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:1879:2: (this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalOntologicalModelingLanguage.g:1880:3: this_STRUCTURE_TOKEN_0= RULE_STRUCTURE_TOKEN ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getStructure_STRUCTURE_TOKENTerminalRuleCall_0ElementType());
            		
            this_STRUCTURE_TOKEN_0=(Token)match(input,RULE_STRUCTURE_TOKEN,FOLLOW_5); 

            			doneLeaf(this_STRUCTURE_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1887:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1888:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1888:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1889:5: lv_name_1_0= RULE_ID
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
    // PsiInternalOntologicalModelingLanguage.g:1908:1: entryRuleEntityStructuredDataProperty returns [Boolean current=false] : iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF ;
    public final Boolean entryRuleEntityStructuredDataProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityStructuredDataProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:1908:70: (iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:1909:2: iv_ruleEntityStructuredDataProperty= ruleEntityStructuredDataProperty EOF
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
    // PsiInternalOntologicalModelingLanguage.g:1915:1: ruleEntityStructuredDataProperty returns [Boolean current=false] : (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleEntityStructuredDataProperty() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:1916:1: ( (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:1917:2: (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:1917:2: (otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:1918:3: otherlv_0= 'entityStructuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,73,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:1925:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:1926:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:1926:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:1927:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEntityStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_40); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_28); 

            			doneLeaf(this_DOMAIN_TOKEN_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:1956:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1957:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1957:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1958:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityStructuredDataProperty_DomainEntityCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_41);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
            		
            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_28); 

            			doneLeaf(this_RANGE_TOKEN_5);
            		
            // PsiInternalOntologicalModelingLanguage.g:1980:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:1981:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:1981:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:1982:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityStructuredDataProperty_RangeStructureCrossReference_6_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2008:1: entryRuleEntityScalarDataProperty returns [Boolean current=false] : iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF ;
    public final Boolean entryRuleEntityScalarDataProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2008:66: (iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:2009:2: iv_ruleEntityScalarDataProperty= ruleEntityScalarDataProperty EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2015:1: ruleEntityScalarDataProperty returns [Boolean current=false] : (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleEntityScalarDataProperty() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2016:1: ( (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2017:2: (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2017:2: (otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2018:3: otherlv_0= 'entityScalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_EntityScalarDataPropertyKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,74,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:2025:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:2026:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:2026:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:2027:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEntityScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_40); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_28); 

            			doneLeaf(this_DOMAIN_TOKEN_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:2056:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2057:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2057:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2058:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataProperty_DomainEntityCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_41);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
            		
            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_28); 

            			doneLeaf(this_RANGE_TOKEN_5);
            		
            // PsiInternalOntologicalModelingLanguage.g:2080:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2081:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2081:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2082:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2108:1: entryRuleStructuredDataProperty returns [Boolean current=false] : iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF ;
    public final Boolean entryRuleStructuredDataProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStructuredDataProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2108:64: (iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:2109:2: iv_ruleStructuredDataProperty= ruleStructuredDataProperty EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2115:1: ruleStructuredDataProperty returns [Boolean current=false] : (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleStructuredDataProperty() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2116:1: ( (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2117:2: (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2117:2: (otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2118:3: otherlv_0= 'structuredDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getStructuredDataProperty_StructuredDataPropertyKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,75,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:2125:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:2126:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:2126:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:2127:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_40); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_28); 

            			doneLeaf(this_DOMAIN_TOKEN_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:2156:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2157:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2157:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2158:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStructuredDataProperty_DomainStructureCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_41);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
            		
            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_28); 

            			doneLeaf(this_RANGE_TOKEN_5);
            		
            // PsiInternalOntologicalModelingLanguage.g:2180:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2181:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2181:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2182:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStructuredDataProperty_RangeStructureCrossReference_6_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2208:1: entryRuleScalarDataProperty returns [Boolean current=false] : iv_ruleScalarDataProperty= ruleScalarDataProperty EOF ;
    public final Boolean entryRuleScalarDataProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarDataProperty = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2208:60: (iv_ruleScalarDataProperty= ruleScalarDataProperty EOF )
            // PsiInternalOntologicalModelingLanguage.g:2209:2: iv_ruleScalarDataProperty= ruleScalarDataProperty EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2215:1: ruleScalarDataProperty returns [Boolean current=false] : (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) ;
    public final Boolean ruleScalarDataProperty() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token this_DOMAIN_TOKEN_3=null;
        Token this_RANGE_TOKEN_5=null;
        Token this_RCURLY_7=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2216:1: ( (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2217:2: (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2217:2: (otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2218:3: otherlv_0= 'scalarDataProperty' ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY this_DOMAIN_TOKEN_3= RULE_DOMAIN_TOKEN ( ( ruleReference ) ) this_RANGE_TOKEN_5= RULE_RANGE_TOKEN ( ( ruleReference ) ) this_RCURLY_7= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getScalarDataProperty_ScalarDataPropertyKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,76,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:2225:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:2226:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:2226:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:2227:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarDataProperty_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_40); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
            		
            this_DOMAIN_TOKEN_3=(Token)match(input,RULE_DOMAIN_TOKEN,FOLLOW_28); 

            			doneLeaf(this_DOMAIN_TOKEN_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:2256:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2257:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2257:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2258:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarDataProperty_DomainStructureCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_41);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
            		
            this_RANGE_TOKEN_5=(Token)match(input,RULE_RANGE_TOKEN,FOLLOW_28); 

            			doneLeaf(this_RANGE_TOKEN_5);
            		
            // PsiInternalOntologicalModelingLanguage.g:2280:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2281:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2281:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2282:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2308:1: entryRuleAnonymousConceptTaxonomyAxiom returns [Boolean current=false] : iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF ;
    public final Boolean entryRuleAnonymousConceptTaxonomyAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAnonymousConceptTaxonomyAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2308:71: (iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2309:2: iv_ruleAnonymousConceptTaxonomyAxiom= ruleAnonymousConceptTaxonomyAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2315:1: ruleAnonymousConceptTaxonomyAxiom returns [Boolean current=false] : (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleAnonymousConceptTaxonomyAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2316:1: ( (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2317:2: (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2317:2: (this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2318:3: this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=(Token)match(input,RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_42); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,77,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2339:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2340:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2340:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2341:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2367:1: entryRuleRootConceptTaxonomyAxiom returns [Boolean current=false] : iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF ;
    public final Boolean entryRuleRootConceptTaxonomyAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRootConceptTaxonomyAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2367:66: (iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2368:2: iv_ruleRootConceptTaxonomyAxiom= ruleRootConceptTaxonomyAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2374:1: ruleRootConceptTaxonomyAxiom returns [Boolean current=false] : (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleRootConceptTaxonomyAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2375:1: ( (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2376:2: (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2376:2: (this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2377:3: this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0= RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'root' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=(Token)match(input,RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_43); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_RootKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,78,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2398:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2399:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2399:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2400:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getRootConceptTaxonomyAxiom_RootConceptCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2426:1: entryRuleSpecificDisjointConceptAxiom returns [Boolean current=false] : iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF ;
    public final Boolean entryRuleSpecificDisjointConceptAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSpecificDisjointConceptAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2426:70: (iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2427:2: iv_ruleSpecificDisjointConceptAxiom= ruleSpecificDisjointConceptAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2433:1: ruleSpecificDisjointConceptAxiom returns [Boolean current=false] : (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleSpecificDisjointConceptAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2434:1: ( (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2435:2: (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2435:2: (this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2436:3: this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0= RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'disjointTaxonomyParent' ( ( ruleReference ) ) otherlv_4= 'disjointLeaf' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0=(Token)match(input,RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_42); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,77,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2457:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2458:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2458:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2459:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_44);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointLeafKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,79,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2481:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2482:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2482:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2483:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2509:1: entryRuleBundledTerminologyAxiom returns [Boolean current=false] : iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF ;
    public final Boolean entryRuleBundledTerminologyAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBundledTerminologyAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2509:65: (iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2510:2: iv_ruleBundledTerminologyAxiom= ruleBundledTerminologyAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2516:1: ruleBundledTerminologyAxiom returns [Boolean current=false] : (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) ;
    public final Boolean ruleBundledTerminologyAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token this_RCURLY_4=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2517:1: ( (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2518:2: (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2518:2: (this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2519:3: this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0= RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'bundledTerminology' ( ( ruleReference ) ) this_RCURLY_4= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0=(Token)match(input,RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_45); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_BundledTerminologyKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2540:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2541:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2541:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2542:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getBundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2568:1: entryRuleConceptDesignationTerminologyAxiom returns [Boolean current=false] : iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF ;
    public final Boolean entryRuleConceptDesignationTerminologyAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConceptDesignationTerminologyAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2568:76: (iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2569:2: iv_ruleConceptDesignationTerminologyAxiom= ruleConceptDesignationTerminologyAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2575:1: ruleConceptDesignationTerminologyAxiom returns [Boolean current=false] : (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleConceptDesignationTerminologyAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2576:1: ( (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2577:2: (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2577:2: (this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2578:3: this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0= RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'designatedTerminology' ( ( ruleReference ) ) otherlv_4= 'designatedConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0=(Token)match(input,RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_46); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,81,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2599:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2600:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2600:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2601:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_47);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,82,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2623:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2624:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2624:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2625:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2651:1: entryRuleTerminologyExtensionAxiom returns [Boolean current=false] : iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF ;
    public final Boolean entryRuleTerminologyExtensionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyExtensionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2651:67: (iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2652:2: iv_ruleTerminologyExtensionAxiom= ruleTerminologyExtensionAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2658:1: ruleTerminologyExtensionAxiom returns [Boolean current=false] : (this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0= RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN ( ( ruleReference ) ) ) ;
    public final Boolean ruleTerminologyExtensionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2659:1: ( (this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0= RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN ( ( ruleReference ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:2660:2: (this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0= RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN ( ( ruleReference ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:2660:2: (this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0= RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN ( ( ruleReference ) ) )
            // PsiInternalOntologicalModelingLanguage.g:2661:3: this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0= RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN ( ( ruleReference ) )
            {

            			markLeaf(elementTypeProvider.getTerminologyExtensionAxiom_TERMINOLOGY_EXTENSION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0=(Token)match(input,RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN,FOLLOW_28); 

            			doneLeaf(this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:2668:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2669:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2669:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2670:5: ruleReference
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
    // PsiInternalOntologicalModelingLanguage.g:2689:1: entryRuleTerminologyNestingAxiom returns [Boolean current=false] : iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF ;
    public final Boolean entryRuleTerminologyNestingAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTerminologyNestingAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2689:65: (iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2690:2: iv_ruleTerminologyNestingAxiom= ruleTerminologyNestingAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2696:1: ruleTerminologyNestingAxiom returns [Boolean current=false] : (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleTerminologyNestingAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2697:1: ( (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2698:2: (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2698:2: (this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2699:3: this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0= RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'nestingTerminology' ( ( ruleReference ) ) otherlv_4= 'nestingContext' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0=(Token)match(input,RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_48); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_NestingTerminologyKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,83,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2720:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2721:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2721:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2722:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getTerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_49);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_NestingContextKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,84,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2744:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2745:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2745:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2746:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getTerminologyNestingAxiom_NestingContextConceptCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2772:1: entryRuleEntityExistentialRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityExistentialRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityExistentialRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2772:75: (iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2773:2: iv_ruleEntityExistentialRestrictionAxiom= ruleEntityExistentialRestrictionAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2779:1: ruleEntityExistentialRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityExistentialRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2780:1: ( (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2781:2: (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2781:2: (this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2782:3: this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_50); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,85,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2803:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2804:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2804:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2805:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_51);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2827:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2828:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2828:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2829:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_52);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,87,FOLLOW_28); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:2851:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2852:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2852:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2853:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2879:1: entryRuleEntityUniversalRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityUniversalRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityUniversalRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2879:73: (iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2880:2: iv_ruleEntityUniversalRestrictionAxiom= ruleEntityUniversalRestrictionAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2886:1: ruleEntityUniversalRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityUniversalRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2887:1: ( (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:2888:2: (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:2888:2: (this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:2889:3: this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedRelation' ( ( ruleReference ) ) otherlv_4= 'restrictedRange' ( ( ruleReference ) ) otherlv_6= 'restrictedDomain' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_50); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,85,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:2910:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2911:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2911:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2912:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_51);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:2934:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2935:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2935:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2936:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_52);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,87,FOLLOW_28); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:2958:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2959:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2959:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2960:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:2986:1: entryRuleAspectSpecializationAxiom returns [Boolean current=false] : iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF ;
    public final Boolean entryRuleAspectSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAspectSpecializationAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:2986:67: (iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:2987:2: iv_ruleAspectSpecializationAxiom= ruleAspectSpecializationAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:2993:1: ruleAspectSpecializationAxiom returns [Boolean current=false] : ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) ) ;
    public final Boolean ruleAspectSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:2994:1: ( ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) ) )
            // PsiInternalOntologicalModelingLanguage.g:2995:2: ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:2995:2: ( ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) ) )
            // PsiInternalOntologicalModelingLanguage.g:2996:3: ( ( ruleReference ) ) this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1= RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN ( ( ruleReference ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:2996:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:2997:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:2997:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:2998:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getAspectSpecializationAxiom_SubEntityEntityCrossReference_0_0ElementType());
            				
            pushFollow(FOLLOW_53);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getAspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1ElementType());
            		
            this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1=(Token)match(input,RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_28); 

            			doneLeaf(this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1);
            		
            // PsiInternalOntologicalModelingLanguage.g:3020:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3021:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3021:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3022:5: ruleReference
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
    // PsiInternalOntologicalModelingLanguage.g:3041:1: entryRuleConceptSpecializationAxiom returns [Boolean current=false] : iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF ;
    public final Boolean entryRuleConceptSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleConceptSpecializationAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3041:68: (iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3042:2: iv_ruleConceptSpecializationAxiom= ruleConceptSpecializationAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:3048:1: ruleConceptSpecializationAxiom returns [Boolean current=false] : (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleConceptSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3049:1: ( (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3050:2: (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3050:2: (this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3051:3: this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0= RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subConcept' ( ( ruleReference ) ) otherlv_4= 'superConcept' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0=(Token)match(input,RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_54); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_SubConceptKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,88,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3072:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3073:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3073:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3074:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_55);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_SuperConceptKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,89,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3096:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3097:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3097:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3098:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:3124:1: entryRuleReifiedRelationshipSpecializationAxiom returns [Boolean current=false] : iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF ;
    public final Boolean entryRuleReifiedRelationshipSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReifiedRelationshipSpecializationAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3124:80: (iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3125:2: iv_ruleReifiedRelationshipSpecializationAxiom= ruleReifiedRelationshipSpecializationAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:3131:1: ruleReifiedRelationshipSpecializationAxiom returns [Boolean current=false] : (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleReifiedRelationshipSpecializationAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3132:1: ( (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3133:2: (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3133:2: (this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3134:3: this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0= RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'subRelationship' ( ( ruleReference ) ) otherlv_4= 'superRelationship' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0=(Token)match(input,RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_56); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,90,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3155:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3156:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3156:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3157:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_57);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,91,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3179:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3180:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3180:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3181:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:3207:1: entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3207:93: (iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3208:2: iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom= ruleEntityScalarDataPropertyExistentialRestrictionAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:3214:1: ruleEntityScalarDataPropertyExistentialRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityScalarDataPropertyExistentialRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3215:1: ( (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3216:2: (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3216:2: (this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3217:3: this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_58); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3238:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3239:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3239:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3240:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_59);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,93,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3262:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3263:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3263:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3264:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_60);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,94,FOLLOW_28); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:3286:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3287:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3287:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3288:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:3314:1: entryRuleEntityScalarDataPropertyParticularRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityScalarDataPropertyParticularRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3314:92: (iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3315:2: iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom= ruleEntityScalarDataPropertyParticularRestrictionAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:3321:1: ruleEntityScalarDataPropertyParticularRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:3322:1: ( (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3323:2: (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3323:2: (this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3324:3: this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'literalValue' ( (lv_literalValue_7_0= RULE_STRING ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_58); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3345:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3346:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3346:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3347:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_59);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,93,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3369:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3370:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3370:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3371:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_61);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,95,FOLLOW_8); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:3393:3: ( (lv_literalValue_7_0= RULE_STRING ) )
            // PsiInternalOntologicalModelingLanguage.g:3394:4: (lv_literalValue_7_0= RULE_STRING )
            {
            // PsiInternalOntologicalModelingLanguage.g:3394:4: (lv_literalValue_7_0= RULE_STRING )
            // PsiInternalOntologicalModelingLanguage.g:3395:5: lv_literalValue_7_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0ElementType());
            				
            lv_literalValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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
    // PsiInternalOntologicalModelingLanguage.g:3421:1: entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom returns [Boolean current=false] : iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF ;
    public final Boolean entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3421:91: (iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:3422:2: iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom= ruleEntityScalarDataPropertyUniversalRestrictionAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:3428:1: ruleEntityScalarDataPropertyUniversalRestrictionAxiom returns [Boolean current=false] : (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final Boolean ruleEntityScalarDataPropertyUniversalRestrictionAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_RCURLY_8=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:3429:1: ( (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3430:2: (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3430:2: (this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3431:3: this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0= RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'restrictedEntity' ( ( ruleReference ) ) otherlv_4= 'scalarProperty' ( ( ruleReference ) ) otherlv_6= 'scalarRestriction' ( ( ruleReference ) ) this_RCURLY_8= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=(Token)match(input,RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_58); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_28); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3452:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3453:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3453:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3454:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_59);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,93,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:3476:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3477:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3477:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3478:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_60);
            ruleReference();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,94,FOLLOW_28); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalOntologicalModelingLanguage.g:3500:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3501:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3501:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3502:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:3528:1: entryRuleBinaryScalarRestriction returns [Boolean current=false] : iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF ;
    public final Boolean entryRuleBinaryScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBinaryScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3528:65: (iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:3529:2: iv_ruleBinaryScalarRestriction= ruleBinaryScalarRestriction EOF
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
    // PsiInternalOntologicalModelingLanguage.g:3535:1: ruleBinaryScalarRestriction returns [Boolean current=false] : (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:3536:1: ( (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3537:2: (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3537:2: (this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3538:3: this_BINARY_SCALAR_RESTRICTION_TOKEN_0= RULE_BINARY_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? otherlv_9= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_11= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getBinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_BINARY_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_BINARY_SCALAR_RESTRICTION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_BINARY_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:3545:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:3546:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:3546:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:3547:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getBinaryScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getBinaryScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_62); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3569:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==96) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3570:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getBinaryScalarRestriction_LengthKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,96,FOLLOW_63); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3577:4: ( (lv_length_4_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3578:5: (lv_length_4_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3578:5: (lv_length_4_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3579:6: lv_length_4_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getBinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_64); 

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

            // PsiInternalOntologicalModelingLanguage.g:3595:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==97) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3596:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getBinaryScalarRestriction_MinLengthKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,97,FOLLOW_63); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3603:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3604:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3604:5: (lv_minLength_6_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3605:6: lv_minLength_6_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getBinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_65); 

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

            // PsiInternalOntologicalModelingLanguage.g:3621:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==98) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3622:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getBinaryScalarRestriction_MaxLengthKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,98,FOLLOW_63); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3629:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3630:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3630:5: (lv_maxLength_8_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3631:6: lv_maxLength_8_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getBinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_51); 

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
            		
            otherlv_9=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_9);
            		
            // PsiInternalOntologicalModelingLanguage.g:3654:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3655:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3655:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3656:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getBinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:3682:1: entryRuleIRIScalarRestriction returns [Boolean current=false] : iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF ;
    public final Boolean entryRuleIRIScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIRIScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3682:62: (iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:3683:2: iv_ruleIRIScalarRestriction= ruleIRIScalarRestriction EOF
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
    // PsiInternalOntologicalModelingLanguage.g:3689:1: ruleIRIScalarRestriction returns [Boolean current=false] : (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:3690:1: ( (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3691:2: (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3691:2: (this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3692:3: this_IRI_SCALAR_RESTRICTION_TOKEN_0= RULE_IRI_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getIRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_IRI_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_IRI_SCALAR_RESTRICTION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_IRI_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:3699:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:3700:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:3700:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:3701:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getIRIScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getIRIScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_66); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3723:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==96) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3724:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getIRIScalarRestriction_LengthKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,96,FOLLOW_63); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3731:4: ( (lv_length_4_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3732:5: (lv_length_4_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3732:5: (lv_length_4_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3733:6: lv_length_4_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getIRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_67); 

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

            // PsiInternalOntologicalModelingLanguage.g:3749:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==97) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3750:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getIRIScalarRestriction_MinLengthKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,97,FOLLOW_63); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3757:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3758:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3758:5: (lv_minLength_6_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3759:6: lv_minLength_6_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getIRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_68); 

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

            // PsiInternalOntologicalModelingLanguage.g:3775:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==98) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3776:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getIRIScalarRestriction_MaxLengthKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,98,FOLLOW_63); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3783:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:3784:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3784:5: (lv_maxLength_8_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:3785:6: lv_maxLength_8_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getIRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_69); 

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

            // PsiInternalOntologicalModelingLanguage.g:3801:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==99) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3802:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getIRIScalarRestriction_PatternKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,99,FOLLOW_8); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3809:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3810:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3810:5: (lv_pattern_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3811:6: lv_pattern_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getIRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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
            		
            otherlv_11=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalOntologicalModelingLanguage.g:3834:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:3835:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:3835:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:3836:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getIRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:3862:1: entryRuleNumericScalarRestriction returns [Boolean current=false] : iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF ;
    public final Boolean entryRuleNumericScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNumericScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:3862:66: (iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:3863:2: iv_ruleNumericScalarRestriction= ruleNumericScalarRestriction EOF
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
    // PsiInternalOntologicalModelingLanguage.g:3869:1: ruleNumericScalarRestriction returns [Boolean current=false] : (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:3870:1: ( (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:3871:2: (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:3871:2: (this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:3872:3: this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0= RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getNumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:3879:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:3880:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:3880:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:3881:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNumericScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getNumericScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_70); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:3903:3: (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==100) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3904:4: otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getNumericScalarRestriction_MinInclusiveKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,100,FOLLOW_8); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3911:4: ( (lv_minInclusive_4_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3912:5: (lv_minInclusive_4_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3912:5: (lv_minInclusive_4_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3913:6: lv_minInclusive_4_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getNumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_minInclusive_4_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

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

            // PsiInternalOntologicalModelingLanguage.g:3929:3: (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==101) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3930:4: otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxInclusiveKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,101,FOLLOW_8); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3937:4: ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3938:5: (lv_maxInclusive_6_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3938:5: (lv_maxInclusive_6_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3939:6: lv_maxInclusive_6_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_maxInclusive_6_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

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

            // PsiInternalOntologicalModelingLanguage.g:3955:3: (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==102) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3956:4: otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getNumericScalarRestriction_MinExclusiveKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,102,FOLLOW_8); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3963:4: ( (lv_minExclusive_8_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3964:5: (lv_minExclusive_8_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3964:5: (lv_minExclusive_8_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3965:6: lv_minExclusive_8_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getNumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_minExclusive_8_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

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

            // PsiInternalOntologicalModelingLanguage.g:3981:3: (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==103) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:3982:4: otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxExclusiveKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,103,FOLLOW_8); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:3989:4: ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:3990:5: (lv_maxExclusive_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:3990:5: (lv_maxExclusive_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:3991:6: lv_maxExclusive_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_maxExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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
            		
            otherlv_11=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalOntologicalModelingLanguage.g:4014:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4015:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4015:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4016:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getNumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:4042:1: entryRulePlainLiteralScalarRestriction returns [Boolean current=false] : iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF ;
    public final Boolean entryRulePlainLiteralScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePlainLiteralScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4042:71: (iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4043:2: iv_rulePlainLiteralScalarRestriction= rulePlainLiteralScalarRestriction EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4049:1: rulePlainLiteralScalarRestriction returns [Boolean current=false] : (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'language' ( (lv_language_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY ) ;
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
        Token lv_language_12_0=null;
        Token otherlv_13=null;
        Token this_RCURLY_15=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4050:1: ( (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'language' ( (lv_language_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4051:2: (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'language' ( (lv_language_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4051:2: (this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'language' ( (lv_language_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4052:3: this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0= RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? (otherlv_11= 'language' ( (lv_language_12_0= RULE_STRING ) ) )? otherlv_13= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_15= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4059:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4060:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4060:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4061:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_74); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:4083:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==96) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4084:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LengthKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,96,FOLLOW_63); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4091:4: ( (lv_length_4_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4092:5: (lv_length_4_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4092:5: (lv_length_4_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4093:6: lv_length_4_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_75); 

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

            // PsiInternalOntologicalModelingLanguage.g:4109:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==97) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4110:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MinLengthKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,97,FOLLOW_63); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4117:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4118:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4118:5: (lv_minLength_6_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4119:6: lv_minLength_6_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_76); 

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

            // PsiInternalOntologicalModelingLanguage.g:4135:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==98) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4136:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MaxLengthKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,98,FOLLOW_63); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4143:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4144:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4144:5: (lv_maxLength_8_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4145:6: lv_maxLength_8_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_77); 

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

            // PsiInternalOntologicalModelingLanguage.g:4161:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==99) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4162:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PatternKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,99,FOLLOW_8); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4169:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4170:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4170:5: (lv_pattern_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4171:6: lv_pattern_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

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

            // PsiInternalOntologicalModelingLanguage.g:4187:3: (otherlv_11= 'language' ( (lv_language_12_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==104) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4188:4: otherlv_11= 'language' ( (lv_language_12_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LanguageKeyword_7_0ElementType());
                    			
                    otherlv_11=(Token)match(input,104,FOLLOW_8); 

                    				doneLeaf(otherlv_11);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4195:4: ( (lv_language_12_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4196:5: (lv_language_12_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4196:5: (lv_language_12_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4197:6: lv_language_12_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LanguageSTRINGTerminalRuleCall_7_1_0ElementType());
                    					
                    lv_language_12_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_language_12_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_RestrictedRangeKeyword_8ElementType());
            		
            otherlv_13=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_13);
            		
            // PsiInternalOntologicalModelingLanguage.g:4220:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4221:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4221:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4222:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getPlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:4248:1: entryRuleScalarOneOfRestriction returns [Boolean current=false] : iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF ;
    public final Boolean entryRuleScalarOneOfRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarOneOfRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4248:64: (iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4249:2: iv_ruleScalarOneOfRestriction= ruleScalarOneOfRestriction EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4255:1: ruleScalarOneOfRestriction returns [Boolean current=false] : (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) ;
    public final Boolean ruleScalarOneOfRestriction() throws RecognitionException {
        Boolean current = false;

        Token this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token this_RCURLY_5=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4256:1: ( (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4257:2: (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4257:2: (this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4258:3: this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0= RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0=(Token)match(input,RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4265:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4266:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4266:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4267:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getScalarOneOfRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarOneOfRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_51); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getScalarOneOfRestriction_RestrictedRangeKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:4296:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4297:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4297:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4298:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:4324:1: entryRuleScalarOneOfLiteralAxiom returns [Boolean current=false] : iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF ;
    public final Boolean entryRuleScalarOneOfLiteralAxiom() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleScalarOneOfLiteralAxiom = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4324:65: (iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF )
            // PsiInternalOntologicalModelingLanguage.g:4325:2: iv_ruleScalarOneOfLiteralAxiom= ruleScalarOneOfLiteralAxiom EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4331:1: ruleScalarOneOfLiteralAxiom returns [Boolean current=false] : (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) ;
    public final Boolean ruleScalarOneOfLiteralAxiom() throws RecognitionException {
        Boolean current = false;

        Token this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token this_RCURLY_6=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4332:1: ( (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4333:2: (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4333:2: (this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4334:3: this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0= RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN this_LCURLY_1= RULE_LCURLY otherlv_2= 'value' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= 'axiom' ( ( ruleReference ) ) this_RCURLY_6= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0ElementType());
            		
            this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0=(Token)match(input,RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN,FOLLOW_10); 

            			doneLeaf(this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0);
            		

            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1ElementType());
            		
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_79); 

            			doneLeaf(this_LCURLY_1);
            		

            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_ValueKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,105,FOLLOW_8); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:4355:3: ( (lv_value_3_0= RULE_STRING ) )
            // PsiInternalOntologicalModelingLanguage.g:4356:4: (lv_value_3_0= RULE_STRING )
            {
            // PsiInternalOntologicalModelingLanguage.g:4356:4: (lv_value_3_0= RULE_STRING )
            // PsiInternalOntologicalModelingLanguage.g:4357:5: lv_value_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_value_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_AxiomKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,106,FOLLOW_28); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalOntologicalModelingLanguage.g:4379:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4380:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4380:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4381:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:4407:1: entryRuleStringScalarRestriction returns [Boolean current=false] : iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF ;
    public final Boolean entryRuleStringScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStringScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4407:65: (iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4408:2: iv_ruleStringScalarRestriction= ruleStringScalarRestriction EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4414:1: ruleStringScalarRestriction returns [Boolean current=false] : (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:4415:1: ( (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4416:2: (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4416:2: (this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4417:3: this_STRING_SCALAR_RESTRICTION_TOKEN_0= RULE_STRING_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )? (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )? (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )? (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getStringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_STRING_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_STRING_SCALAR_RESTRICTION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_STRING_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4424:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4425:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4425:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4426:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getStringScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getStringScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_66); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:4448:3: (otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==96) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4449:4: otherlv_3= 'length' ( (lv_length_4_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getStringScalarRestriction_LengthKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,96,FOLLOW_63); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4456:4: ( (lv_length_4_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4457:5: (lv_length_4_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4457:5: (lv_length_4_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4458:6: lv_length_4_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getStringScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_67); 

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

            // PsiInternalOntologicalModelingLanguage.g:4474:3: (otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==97) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4475:4: otherlv_5= 'minLength' ( (lv_minLength_6_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getStringScalarRestriction_MinLengthKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,97,FOLLOW_63); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4482:4: ( (lv_minLength_6_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4483:5: (lv_minLength_6_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4483:5: (lv_minLength_6_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4484:6: lv_minLength_6_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getStringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_minLength_6_0=(Token)match(input,RULE_INT,FOLLOW_68); 

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

            // PsiInternalOntologicalModelingLanguage.g:4500:3: (otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==98) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4501:4: otherlv_7= 'maxLength' ( (lv_maxLength_8_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getStringScalarRestriction_MaxLengthKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,98,FOLLOW_63); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4508:4: ( (lv_maxLength_8_0= RULE_INT ) )
                    // PsiInternalOntologicalModelingLanguage.g:4509:5: (lv_maxLength_8_0= RULE_INT )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4509:5: (lv_maxLength_8_0= RULE_INT )
                    // PsiInternalOntologicalModelingLanguage.g:4510:6: lv_maxLength_8_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getStringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_maxLength_8_0=(Token)match(input,RULE_INT,FOLLOW_69); 

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

            // PsiInternalOntologicalModelingLanguage.g:4526:3: (otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==99) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4527:4: otherlv_9= 'pattern' ( (lv_pattern_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getStringScalarRestriction_PatternKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,99,FOLLOW_8); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4534:4: ( (lv_pattern_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4535:5: (lv_pattern_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4535:5: (lv_pattern_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4536:6: lv_pattern_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getStringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_pattern_10_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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
            		
            otherlv_11=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalOntologicalModelingLanguage.g:4559:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4560:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4560:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4561:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getStringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:4587:1: entryRuleSynonymScalarRestriction returns [Boolean current=false] : iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF ;
    public final Boolean entryRuleSynonymScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSynonymScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4587:66: (iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4588:2: iv_ruleSynonymScalarRestriction= ruleSynonymScalarRestriction EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4594:1: ruleSynonymScalarRestriction returns [Boolean current=false] : (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) ;
    public final Boolean ruleSynonymScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Token this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0=null;
        Token lv_name_1_0=null;
        Token this_LCURLY_2=null;
        Token otherlv_3=null;
        Token this_RCURLY_5=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4595:1: ( (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4596:2: (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4596:2: (this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4597:3: this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0= RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY otherlv_3= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_5= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getSynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4604:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4605:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4605:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4606:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSynonymScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getSynonymScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_51); 

            			doneLeaf(this_LCURLY_2);
            		

            			markLeaf(elementTypeProvider.getSynonymScalarRestriction_RestrictedRangeKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalOntologicalModelingLanguage.g:4635:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4636:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4636:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4637:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getSynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType());
            				
            pushFollow(FOLLOW_30);
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
    // PsiInternalOntologicalModelingLanguage.g:4663:1: entryRuleTimeScalarRestriction returns [Boolean current=false] : iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF ;
    public final Boolean entryRuleTimeScalarRestriction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleTimeScalarRestriction = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4663:63: (iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF )
            // PsiInternalOntologicalModelingLanguage.g:4664:2: iv_ruleTimeScalarRestriction= ruleTimeScalarRestriction EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4670:1: ruleTimeScalarRestriction returns [Boolean current=false] : (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) ;
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
            // PsiInternalOntologicalModelingLanguage.g:4671:1: ( (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY ) )
            // PsiInternalOntologicalModelingLanguage.g:4672:2: (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            {
            // PsiInternalOntologicalModelingLanguage.g:4672:2: (this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY )
            // PsiInternalOntologicalModelingLanguage.g:4673:3: this_TIME_SCALAR_RESTRICTION_TOKEN_0= RULE_TIME_SCALAR_RESTRICTION_TOKEN ( (lv_name_1_0= RULE_ID ) ) this_LCURLY_2= RULE_LCURLY (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )? (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? otherlv_11= 'restrictedRange' ( ( ruleReference ) ) this_RCURLY_13= RULE_RCURLY
            {

            			markLeaf(elementTypeProvider.getTimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
            		
            this_TIME_SCALAR_RESTRICTION_TOKEN_0=(Token)match(input,RULE_TIME_SCALAR_RESTRICTION_TOKEN,FOLLOW_5); 

            			doneLeaf(this_TIME_SCALAR_RESTRICTION_TOKEN_0);
            		
            // PsiInternalOntologicalModelingLanguage.g:4680:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalOntologicalModelingLanguage.g:4681:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4681:4: (lv_name_1_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4682:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTimeScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getTimeScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
            		
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_70); 

            			doneLeaf(this_LCURLY_2);
            		
            // PsiInternalOntologicalModelingLanguage.g:4704:3: (otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==100) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4705:4: otherlv_3= 'minInclusive' ( (lv_minInclusive_4_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getTimeScalarRestriction_MinInclusiveKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,100,FOLLOW_8); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4712:4: ( (lv_minInclusive_4_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4713:5: (lv_minInclusive_4_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4713:5: (lv_minInclusive_4_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4714:6: lv_minInclusive_4_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getTimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_minInclusive_4_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

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

            // PsiInternalOntologicalModelingLanguage.g:4730:3: (otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==101) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4731:4: otherlv_5= 'maxInclusive' ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxInclusiveKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,101,FOLLOW_8); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4738:4: ( (lv_maxInclusive_6_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4739:5: (lv_maxInclusive_6_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4739:5: (lv_maxInclusive_6_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4740:6: lv_maxInclusive_6_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_maxInclusive_6_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

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

            // PsiInternalOntologicalModelingLanguage.g:4756:3: (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==102) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4757:4: otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getTimeScalarRestriction_MinExclusiveKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,102,FOLLOW_8); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4764:4: ( (lv_minExclusive_8_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4765:5: (lv_minExclusive_8_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4765:5: (lv_minExclusive_8_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4766:6: lv_minExclusive_8_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getTimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_minExclusive_8_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

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

            // PsiInternalOntologicalModelingLanguage.g:4782:3: (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==103) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4783:4: otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxExclusiveKeyword_6_0ElementType());
                    			
                    otherlv_9=(Token)match(input,103,FOLLOW_8); 

                    				doneLeaf(otherlv_9);
                    			
                    // PsiInternalOntologicalModelingLanguage.g:4790:4: ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    // PsiInternalOntologicalModelingLanguage.g:4791:5: (lv_maxExclusive_10_0= RULE_STRING )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4791:5: (lv_maxExclusive_10_0= RULE_STRING )
                    // PsiInternalOntologicalModelingLanguage.g:4792:6: lv_maxExclusive_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_maxExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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
            		
            otherlv_11=(Token)match(input,86,FOLLOW_28); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalOntologicalModelingLanguage.g:4815:3: ( ( ruleReference ) )
            // PsiInternalOntologicalModelingLanguage.g:4816:4: ( ruleReference )
            {
            // PsiInternalOntologicalModelingLanguage.g:4816:4: ( ruleReference )
            // PsiInternalOntologicalModelingLanguage.g:4817:5: ruleReference
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getTimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
            				
            pushFollow(FOLLOW_30);
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


    // $ANTLR start "entryRuleReference"
    // PsiInternalOntologicalModelingLanguage.g:4843:1: entryRuleReference returns [Boolean current=false] : iv_ruleReference= ruleReference EOF ;
    public final Boolean entryRuleReference() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleReference = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4843:51: (iv_ruleReference= ruleReference EOF )
            // PsiInternalOntologicalModelingLanguage.g:4844:2: iv_ruleReference= ruleReference EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4850:1: ruleReference returns [Boolean current=false] : (this_IRI_0= RULE_IRI | ruleQNAME ) ;
    public final Boolean ruleReference() throws RecognitionException {
        Boolean current = false;

        Token this_IRI_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4851:1: ( (this_IRI_0= RULE_IRI | ruleQNAME ) )
            // PsiInternalOntologicalModelingLanguage.g:4852:2: (this_IRI_0= RULE_IRI | ruleQNAME )
            {
            // PsiInternalOntologicalModelingLanguage.g:4852:2: (this_IRI_0= RULE_IRI | ruleQNAME )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_IRI) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4853:3: this_IRI_0= RULE_IRI
                    {

                    			markLeaf(elementTypeProvider.getReference_IRITerminalRuleCall_0ElementType());
                    		
                    this_IRI_0=(Token)match(input,RULE_IRI,FOLLOW_2); 

                    			doneLeaf(this_IRI_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:4861:3: ruleQNAME
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
    // PsiInternalOntologicalModelingLanguage.g:4872:1: entryRuleQNAME returns [Boolean current=false] : iv_ruleQNAME= ruleQNAME EOF ;
    public final Boolean entryRuleQNAME() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQNAME = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4872:47: (iv_ruleQNAME= ruleQNAME EOF )
            // PsiInternalOntologicalModelingLanguage.g:4873:2: iv_ruleQNAME= ruleQNAME EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4879:1: ruleQNAME returns [Boolean current=false] : ( ruleABBREV_IRI | ruleValidID ) ;
    public final Boolean ruleQNAME() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4880:1: ( ( ruleABBREV_IRI | ruleValidID ) )
            // PsiInternalOntologicalModelingLanguage.g:4881:2: ( ruleABBREV_IRI | ruleValidID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4881:2: ( ruleABBREV_IRI | ruleValidID )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==107) ) {
                    alt67=1;
                }
                else if ( (LA67_1==EOF||(LA67_1>=RULE_IRI && LA67_1<=RULE_ANNOTATION_TOKEN)||LA67_1==RULE_RCURLY||(LA67_1>=RULE_ASPECT_TOKEN && LA67_1<=RULE_REIFIED_RELATIONSHIP_TOKEN)||(LA67_1>=RULE_TARGET_TOKEN && LA67_1<=RULE_STRUCTURE_TOKEN)||(LA67_1>=RULE_RANGE_TOKEN && LA67_1<=RULE_BINARY_SCALAR_RESTRICTION_TOKEN)||(LA67_1>=RULE_IRI_SCALAR_RESTRICTION_TOKEN && LA67_1<=RULE_TIME_SCALAR_RESTRICTION_TOKEN)||(LA67_1>=73 && LA67_1<=76)||LA67_1==79||LA67_1==82||LA67_1==84||(LA67_1>=86 && LA67_1<=87)||LA67_1==89||LA67_1==91||(LA67_1>=93 && LA67_1<=95)) ) {
                    alt67=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4882:3: ruleABBREV_IRI
                    {

                    			markComposite(elementTypeProvider.getQNAME_ABBREV_IRIParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleABBREV_IRI();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:4890:3: ruleValidID
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
    // PsiInternalOntologicalModelingLanguage.g:4901:1: entryRuleABBREV_IRI returns [Boolean current=false] : iv_ruleABBREV_IRI= ruleABBREV_IRI EOF ;
    public final Boolean entryRuleABBREV_IRI() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleABBREV_IRI = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4901:52: (iv_ruleABBREV_IRI= ruleABBREV_IRI EOF )
            // PsiInternalOntologicalModelingLanguage.g:4902:2: iv_ruleABBREV_IRI= ruleABBREV_IRI EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4908:1: ruleABBREV_IRI returns [Boolean current=false] : ( ruleValidID kw= ':' ruleValidID ) ;
    public final Boolean ruleABBREV_IRI() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4909:1: ( ( ruleValidID kw= ':' ruleValidID ) )
            // PsiInternalOntologicalModelingLanguage.g:4910:2: ( ruleValidID kw= ':' ruleValidID )
            {
            // PsiInternalOntologicalModelingLanguage.g:4910:2: ( ruleValidID kw= ':' ruleValidID )
            // PsiInternalOntologicalModelingLanguage.g:4911:3: ruleValidID kw= ':' ruleValidID
            {

            			markComposite(elementTypeProvider.getABBREV_IRI_ValidIDParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_81);
            ruleValidID();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getABBREV_IRI_ColonKeyword_1ElementType());
            		
            kw=(Token)match(input,107,FOLLOW_5); 

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
    // PsiInternalOntologicalModelingLanguage.g:4936:1: entryRuleValidID returns [Boolean current=false] : iv_ruleValidID= ruleValidID EOF ;
    public final Boolean entryRuleValidID() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleValidID = null;


        try {
            // PsiInternalOntologicalModelingLanguage.g:4936:49: (iv_ruleValidID= ruleValidID EOF )
            // PsiInternalOntologicalModelingLanguage.g:4937:2: iv_ruleValidID= ruleValidID EOF
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
    // PsiInternalOntologicalModelingLanguage.g:4943:1: ruleValidID returns [Boolean current=false] : this_ID_0= RULE_ID ;
    public final Boolean ruleValidID() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4944:1: (this_ID_0= RULE_ID )
            // PsiInternalOntologicalModelingLanguage.g:4945:2: this_ID_0= RULE_ID
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
    // PsiInternalOntologicalModelingLanguage.g:4955:1: ruleTerminologyGraphKind returns [Boolean current=false] : ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) ) ;
    public final Boolean ruleTerminologyGraphKind() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalOntologicalModelingLanguage.g:4956:1: ( ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) ) )
            // PsiInternalOntologicalModelingLanguage.g:4957:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) )
            {
            // PsiInternalOntologicalModelingLanguage.g:4957:2: ( (enumLiteral_0= 'open' ) | (enumLiteral_1= 'closed' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==108) ) {
                alt68=1;
            }
            else if ( (LA68_0==109) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // PsiInternalOntologicalModelingLanguage.g:4958:3: (enumLiteral_0= 'open' )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4958:3: (enumLiteral_0= 'open' )
                    // PsiInternalOntologicalModelingLanguage.g:4959:4: enumLiteral_0= 'open'
                    {

                    				markLeaf(elementTypeProvider.getTerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalOntologicalModelingLanguage.g:4968:3: (enumLiteral_1= 'closed' )
                    {
                    // PsiInternalOntologicalModelingLanguage.g:4968:3: (enumLiteral_1= 'closed' )
                    // PsiInternalOntologicalModelingLanguage.g:4969:4: enumLiteral_1= 'closed'
                    {

                    				markLeaf(elementTypeProvider.getTerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L,0x0000300000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000300000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x1FEFDF038003E8C0L,0x0000000000001E00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1FEFDFF38003E8C0L,0x0000000000001E00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000FFC0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000FF80000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000FF00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000FE00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000027FC0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000027F80000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000027F00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000027E00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000027C00000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000027800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000027000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000026000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000700400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000600400000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000400400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000F00400000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00400000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00400000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000800400000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x000000F000400000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x000000E000400000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x000000C000400000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000008000400000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000010F00400000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000010E00400000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000010C00400000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000010800400000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000010000400000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});

}