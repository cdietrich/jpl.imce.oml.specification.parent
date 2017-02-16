package jpl.imce.oml.specification.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologicalModelingLanguageLexer extends Lexer {
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
    public static final int RULE_REIFIED_RELATIONSHIP_TOKEN=17;
    public static final int RULE_INVERSE_TOKEN=28;
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

    public InternalOntologicalModelingLanguageLexer() {;} 
    public InternalOntologicalModelingLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOntologicalModelingLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOntologicalModelingLanguage.g"; }

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:11:7: ( 'entityStructuredDataProperty' )
            // InternalOntologicalModelingLanguage.g:11:9: 'entityStructuredDataProperty'
            {
            match("entityStructuredDataProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:12:7: ( 'entityScalarDataProperty' )
            // InternalOntologicalModelingLanguage.g:12:9: 'entityScalarDataProperty'
            {
            match("entityScalarDataProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:13:7: ( 'structuredDataProperty' )
            // InternalOntologicalModelingLanguage.g:13:9: 'structuredDataProperty'
            {
            match("structuredDataProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:14:7: ( 'scalarDataProperty' )
            // InternalOntologicalModelingLanguage.g:14:9: 'scalarDataProperty'
            {
            match("scalarDataProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:15:7: ( 'disjointTaxonomyParent' )
            // InternalOntologicalModelingLanguage.g:15:9: 'disjointTaxonomyParent'
            {
            match("disjointTaxonomyParent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:16:7: ( 'root' )
            // InternalOntologicalModelingLanguage.g:16:9: 'root'
            {
            match("root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:17:7: ( 'disjointLeaf' )
            // InternalOntologicalModelingLanguage.g:17:9: 'disjointLeaf'
            {
            match("disjointLeaf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:18:7: ( 'bundledTerminology' )
            // InternalOntologicalModelingLanguage.g:18:9: 'bundledTerminology'
            {
            match("bundledTerminology"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:19:7: ( 'designatedTerminology' )
            // InternalOntologicalModelingLanguage.g:19:9: 'designatedTerminology'
            {
            match("designatedTerminology"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:20:7: ( 'designatedConcept' )
            // InternalOntologicalModelingLanguage.g:20:9: 'designatedConcept'
            {
            match("designatedConcept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:21:7: ( 'nestingTerminology' )
            // InternalOntologicalModelingLanguage.g:21:9: 'nestingTerminology'
            {
            match("nestingTerminology"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:22:7: ( 'nestingContext' )
            // InternalOntologicalModelingLanguage.g:22:9: 'nestingContext'
            {
            match("nestingContext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:23:7: ( 'restrictedRelation' )
            // InternalOntologicalModelingLanguage.g:23:9: 'restrictedRelation'
            {
            match("restrictedRelation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:24:7: ( 'restrictedRange' )
            // InternalOntologicalModelingLanguage.g:24:9: 'restrictedRange'
            {
            match("restrictedRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:25:7: ( 'restrictedDomain' )
            // InternalOntologicalModelingLanguage.g:25:9: 'restrictedDomain'
            {
            match("restrictedDomain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:26:7: ( 'restrictedEntity' )
            // InternalOntologicalModelingLanguage.g:26:9: 'restrictedEntity'
            {
            match("restrictedEntity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:27:7: ( 'scalarProperty' )
            // InternalOntologicalModelingLanguage.g:27:9: 'scalarProperty'
            {
            match("scalarProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:28:7: ( 'scalarRestriction' )
            // InternalOntologicalModelingLanguage.g:28:9: 'scalarRestriction'
            {
            match("scalarRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:29:7: ( 'literalValue' )
            // InternalOntologicalModelingLanguage.g:29:9: 'literalValue'
            {
            match("literalValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:30:7: ( 'length' )
            // InternalOntologicalModelingLanguage.g:30:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:31:7: ( 'minLength' )
            // InternalOntologicalModelingLanguage.g:31:9: 'minLength'
            {
            match("minLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:32:7: ( 'maxLength' )
            // InternalOntologicalModelingLanguage.g:32:9: 'maxLength'
            {
            match("maxLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:33:7: ( 'pattern' )
            // InternalOntologicalModelingLanguage.g:33:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:34:7: ( 'minInclusive' )
            // InternalOntologicalModelingLanguage.g:34:9: 'minInclusive'
            {
            match("minInclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:35:7: ( 'maxInclusive' )
            // InternalOntologicalModelingLanguage.g:35:9: 'maxInclusive'
            {
            match("maxInclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:36:8: ( 'minExclusive' )
            // InternalOntologicalModelingLanguage.g:36:10: 'minExclusive'
            {
            match("minExclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:37:8: ( 'maxExclusive' )
            // InternalOntologicalModelingLanguage.g:37:10: 'maxExclusive'
            {
            match("maxExclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:38:8: ( 'langRange' )
            // InternalOntologicalModelingLanguage.g:38:10: 'langRange'
            {
            match("langRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:39:8: ( 'value' )
            // InternalOntologicalModelingLanguage.g:39:10: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:40:8: ( 'axiom' )
            // InternalOntologicalModelingLanguage.g:40:10: 'axiom'
            {
            match("axiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:41:8: ( 'ScalarDataPropertyValue' )
            // InternalOntologicalModelingLanguage.g:41:10: 'ScalarDataPropertyValue'
            {
            match("ScalarDataPropertyValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:42:8: ( 'scalarPropertyValue' )
            // InternalOntologicalModelingLanguage.g:42:10: 'scalarPropertyValue'
            {
            match("scalarPropertyValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:43:8: ( 'StructuredDataPropertyValue' )
            // InternalOntologicalModelingLanguage.g:43:10: 'StructuredDataPropertyValue'
            {
            match("StructuredDataPropertyValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:44:8: ( 'structuredPropertyTuple' )
            // InternalOntologicalModelingLanguage.g:44:10: 'structuredPropertyTuple'
            {
            match("structuredPropertyTuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:45:8: ( 'DataStructureTuple' )
            // InternalOntologicalModelingLanguage.g:45:10: 'DataStructureTuple'
            {
            match("DataStructureTuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:46:8: ( 'dataStructureType' )
            // InternalOntologicalModelingLanguage.g:46:10: 'dataStructureType'
            {
            match("dataStructureType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:47:8: ( 'ConceptInstance' )
            // InternalOntologicalModelingLanguage.g:47:10: 'ConceptInstance'
            {
            match("ConceptInstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:48:8: ( 'singletonConceptClassifier' )
            // InternalOntologicalModelingLanguage.g:48:10: 'singletonConceptClassifier'
            {
            match("singletonConceptClassifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:49:8: ( 'ReifiedRelationshipInstance' )
            // InternalOntologicalModelingLanguage.g:49:10: 'ReifiedRelationshipInstance'
            {
            match("ReifiedRelationshipInstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:50:8: ( 'singletonReifiedRelationshipClassifier' )
            // InternalOntologicalModelingLanguage.g:50:10: 'singletonReifiedRelationshipClassifier'
            {
            match("singletonReifiedRelationshipClassifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:51:8: ( 'ReifiedRelationshipInstanceDomain' )
            // InternalOntologicalModelingLanguage.g:51:10: 'ReifiedRelationshipInstanceDomain'
            {
            match("ReifiedRelationshipInstanceDomain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:52:8: ( 'reifiedRelationshipInstance' )
            // InternalOntologicalModelingLanguage.g:52:10: 'reifiedRelationshipInstance'
            {
            match("reifiedRelationshipInstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:53:8: ( 'ReifiedRelationshipInstanceRange' )
            // InternalOntologicalModelingLanguage.g:53:10: 'ReifiedRelationshipInstanceRange'
            {
            match("ReifiedRelationshipInstanceRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:54:8: ( 'UnreifiedRelationshipInstanceTuple' )
            // InternalOntologicalModelingLanguage.g:54:10: 'UnreifiedRelationshipInstanceTuple'
            {
            match("UnreifiedRelationshipInstanceTuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:55:8: ( ':' )
            // InternalOntologicalModelingLanguage.g:55:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:56:8: ( 'open' )
            // InternalOntologicalModelingLanguage.g:56:10: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:57:8: ( 'closed' )
            // InternalOntologicalModelingLanguage.g:57:10: 'closed'
            {
            match("closed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:58:8: ( 'final' )
            // InternalOntologicalModelingLanguage.g:58:10: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:59:8: ( 'partial' )
            // InternalOntologicalModelingLanguage.g:59:10: 'partial'
            {
            match("partial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "RULE_ANNOTATION_PROPERTY_TOKEN"
    public final void mRULE_ANNOTATION_PROPERTY_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ANNOTATION_PROPERTY_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5703:32: ( 'annotationProperty' )
            // InternalOntologicalModelingLanguage.g:5703:34: 'annotationProperty'
            {
            match("annotationProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANNOTATION_PROPERTY_TOKEN"

    // $ANTLR start "RULE_ANNOTATION_TOKEN"
    public final void mRULE_ANNOTATION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ANNOTATION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5705:23: ( '@' )
            // InternalOntologicalModelingLanguage.g:5705:25: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANNOTATION_TOKEN"

    // $ANTLR start "RULE_TERMINOLOGY_GRAPH_TOKEN"
    public final void mRULE_TERMINOLOGY_GRAPH_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_TERMINOLOGY_GRAPH_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5707:30: ( 'terminology' )
            // InternalOntologicalModelingLanguage.g:5707:32: 'terminology'
            {
            match("terminology"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINOLOGY_GRAPH_TOKEN"

    // $ANTLR start "RULE_BUNDLE_TOKEN"
    public final void mRULE_BUNDLE_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_BUNDLE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5709:19: ( 'bundle' )
            // InternalOntologicalModelingLanguage.g:5709:21: 'bundle'
            {
            match("bundle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BUNDLE_TOKEN"

    // $ANTLR start "RULE_KIND_TOKEN"
    public final void mRULE_KIND_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_KIND_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5711:17: ( 'kind' )
            // InternalOntologicalModelingLanguage.g:5711:19: 'kind'
            {
            match("kind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KIND_TOKEN"

    // $ANTLR start "RULE_ASPECT_TOKEN"
    public final void mRULE_ASPECT_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ASPECT_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5713:19: ( 'aspect' )
            // InternalOntologicalModelingLanguage.g:5713:21: 'aspect'
            {
            match("aspect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASPECT_TOKEN"

    // $ANTLR start "RULE_ABSTRACT_TOKEN"
    public final void mRULE_ABSTRACT_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ABSTRACT_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5715:21: ( 'abstract' )
            // InternalOntologicalModelingLanguage.g:5715:23: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABSTRACT_TOKEN"

    // $ANTLR start "RULE_CONCEPT_TOKEN"
    public final void mRULE_CONCEPT_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_CONCEPT_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5717:20: ( 'concept' )
            // InternalOntologicalModelingLanguage.g:5717:22: 'concept'
            {
            match("concept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONCEPT_TOKEN"

    // $ANTLR start "RULE_REIFIED_RELATIONSHIP_TOKEN"
    public final void mRULE_REIFIED_RELATIONSHIP_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_REIFIED_RELATIONSHIP_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5719:33: ( 'reifiedRelationship' )
            // InternalOntologicalModelingLanguage.g:5719:35: 'reifiedRelationship'
            {
            match("reifiedRelationship"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REIFIED_RELATIONSHIP_TOKEN"

    // $ANTLR start "RULE_UNREIFIED_RELATIONSHIP_TOKEN"
    public final void mRULE_UNREIFIED_RELATIONSHIP_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_UNREIFIED_RELATIONSHIP_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5721:35: ( 'unreifiedRelationship' )
            // InternalOntologicalModelingLanguage.g:5721:37: 'unreifiedRelationship'
            {
            match("unreifiedRelationship"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNREIFIED_RELATIONSHIP_TOKEN"

    // $ANTLR start "RULE_FUNCTIONAL_TOKEN"
    public final void mRULE_FUNCTIONAL_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_FUNCTIONAL_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5723:23: ( 'functional' )
            // InternalOntologicalModelingLanguage.g:5723:25: 'functional'
            {
            match("functional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNCTIONAL_TOKEN"

    // $ANTLR start "RULE_INVERSE_FUNCTIONAL_TOKEN"
    public final void mRULE_INVERSE_FUNCTIONAL_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_INVERSE_FUNCTIONAL_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5725:31: ( 'inverseFunctional' )
            // InternalOntologicalModelingLanguage.g:5725:33: 'inverseFunctional'
            {
            match("inverseFunctional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INVERSE_FUNCTIONAL_TOKEN"

    // $ANTLR start "RULE_ESSENTIAL_TOKEN"
    public final void mRULE_ESSENTIAL_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ESSENTIAL_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5727:22: ( 'essential' )
            // InternalOntologicalModelingLanguage.g:5727:24: 'essential'
            {
            match("essential"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESSENTIAL_TOKEN"

    // $ANTLR start "RULE_INVERSE_ESSENTIAL_TOKEN"
    public final void mRULE_INVERSE_ESSENTIAL_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_INVERSE_ESSENTIAL_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5729:30: ( 'inverseEssential' )
            // InternalOntologicalModelingLanguage.g:5729:32: 'inverseEssential'
            {
            match("inverseEssential"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INVERSE_ESSENTIAL_TOKEN"

    // $ANTLR start "RULE_SYMMETRIC_TOKEN"
    public final void mRULE_SYMMETRIC_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_SYMMETRIC_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5731:22: ( 'symmetric' )
            // InternalOntologicalModelingLanguage.g:5731:24: 'symmetric'
            {
            match("symmetric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMMETRIC_TOKEN"

    // $ANTLR start "RULE_ASYMMETRIC_TOKEN"
    public final void mRULE_ASYMMETRIC_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ASYMMETRIC_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5733:23: ( 'asymmetric' )
            // InternalOntologicalModelingLanguage.g:5733:25: 'asymmetric'
            {
            match("asymmetric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASYMMETRIC_TOKEN"

    // $ANTLR start "RULE_REFLEXIVE_TOKEN"
    public final void mRULE_REFLEXIVE_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_REFLEXIVE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5735:22: ( 'reflexive' )
            // InternalOntologicalModelingLanguage.g:5735:24: 'reflexive'
            {
            match("reflexive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REFLEXIVE_TOKEN"

    // $ANTLR start "RULE_IRREFLEXIVE_TOKEN"
    public final void mRULE_IRREFLEXIVE_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_IRREFLEXIVE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5737:24: ( 'irreflexive' )
            // InternalOntologicalModelingLanguage.g:5737:26: 'irreflexive'
            {
            match("irreflexive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IRREFLEXIVE_TOKEN"

    // $ANTLR start "RULE_TRANSITIVE_TOKEN"
    public final void mRULE_TRANSITIVE_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_TRANSITIVE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5739:23: ( 'transitive' )
            // InternalOntologicalModelingLanguage.g:5739:25: 'transitive'
            {
            match("transitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRANSITIVE_TOKEN"

    // $ANTLR start "RULE_UNREIFIED_TOKEN"
    public final void mRULE_UNREIFIED_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_UNREIFIED_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5741:22: ( 'unreified' )
            // InternalOntologicalModelingLanguage.g:5741:24: 'unreified'
            {
            match("unreified"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNREIFIED_TOKEN"

    // $ANTLR start "RULE_INVERSE_TOKEN"
    public final void mRULE_INVERSE_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_INVERSE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5743:20: ( 'inverse' )
            // InternalOntologicalModelingLanguage.g:5743:22: 'inverse'
            {
            match("inverse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INVERSE_TOKEN"

    // $ANTLR start "RULE_SOURCE_TOKEN"
    public final void mRULE_SOURCE_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_SOURCE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5745:19: ( 'source' )
            // InternalOntologicalModelingLanguage.g:5745:21: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SOURCE_TOKEN"

    // $ANTLR start "RULE_TARGET_TOKEN"
    public final void mRULE_TARGET_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_TARGET_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5747:19: ( 'target' )
            // InternalOntologicalModelingLanguage.g:5747:21: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TARGET_TOKEN"

    // $ANTLR start "RULE_SCALAR_TOKEN"
    public final void mRULE_SCALAR_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_SCALAR_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5749:19: ( 'scalar' )
            // InternalOntologicalModelingLanguage.g:5749:21: 'scalar'
            {
            match("scalar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCALAR_TOKEN"

    // $ANTLR start "RULE_STRUCTURE_TOKEN"
    public final void mRULE_STRUCTURE_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_STRUCTURE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5751:22: ( 'structure' )
            // InternalOntologicalModelingLanguage.g:5751:24: 'structure'
            {
            match("structure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRUCTURE_TOKEN"

    // $ANTLR start "RULE_DOMAIN_TOKEN"
    public final void mRULE_DOMAIN_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_DOMAIN_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5753:19: ( 'domain' )
            // InternalOntologicalModelingLanguage.g:5753:21: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOMAIN_TOKEN"

    // $ANTLR start "RULE_RANGE_TOKEN"
    public final void mRULE_RANGE_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_RANGE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5755:18: ( 'range' )
            // InternalOntologicalModelingLanguage.g:5755:20: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RANGE_TOKEN"

    // $ANTLR start "RULE_EXTENDS_TOKEN"
    public final void mRULE_EXTENDS_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_EXTENDS_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5757:20: ( 'extends' )
            // InternalOntologicalModelingLanguage.g:5757:22: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDS_TOKEN"

    // $ANTLR start "RULE_REFINES_TOKEN"
    public final void mRULE_REFINES_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_REFINES_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5759:20: ( 'refines' )
            // InternalOntologicalModelingLanguage.g:5759:22: 'refines'
            {
            match("refines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REFINES_TOKEN"

    // $ANTLR start "RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN"
    public final void mRULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5761:40: ( 'rootConceptTaxonomyAxiom' )
            // InternalOntologicalModelingLanguage.g:5761:42: 'rootConceptTaxonomyAxiom'
            {
            match("rootConceptTaxonomyAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN"

    // $ANTLR start "RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN"
    public final void mRULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5763:44: ( 'specificDisjointConceptAxiom' )
            // InternalOntologicalModelingLanguage.g:5763:46: 'specificDisjointConceptAxiom'
            {
            match("specificDisjointConceptAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN"

    // $ANTLR start "RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN"
    public final void mRULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5765:45: ( 'anonymousConceptTaxonomyAxiom' )
            // InternalOntologicalModelingLanguage.g:5765:47: 'anonymousConceptTaxonomyAxiom'
            {
            match("anonymousConceptTaxonomyAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN"

    // $ANTLR start "RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN"
    public final void mRULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5767:38: ( 'bundledTerminologyAxiom' )
            // InternalOntologicalModelingLanguage.g:5767:40: 'bundledTerminologyAxiom'
            {
            match("bundledTerminologyAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN"

    // $ANTLR start "RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN"
    public final void mRULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5769:50: ( 'conceptDesignationTerminologyAxiom' )
            // InternalOntologicalModelingLanguage.g:5769:52: 'conceptDesignationTerminologyAxiom'
            {
            match("conceptDesignationTerminologyAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN"

    // $ANTLR start "RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN"
    public final void mRULE_TERMINOLOGY_NESTING_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5771:38: ( 'terminologyNestingAxiom' )
            // InternalOntologicalModelingLanguage.g:5771:40: 'terminologyNestingAxiom'
            {
            match("terminologyNestingAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN"

    // $ANTLR start "RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN"
    public final void mRULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5773:49: ( 'entityExistentialRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:5773:51: 'entityExistentialRestrictionAxiom'
            {
            match("entityExistentialRestrictionAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN"

    // $ANTLR start "RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN"
    public final void mRULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5775:47: ( 'entityUniversalRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:5775:49: 'entityUniversalRestrictionAxiom'
            {
            match("entityUniversalRestrictionAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN"

    // $ANTLR start "RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN"
    public final void mRULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5777:41: ( 'extendsConcept' )
            // InternalOntologicalModelingLanguage.g:5777:43: 'extendsConcept'
            {
            match("extendsConcept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN"

    // $ANTLR start "RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN"
    public final void mRULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5779:40: ( 'extendsAspect' )
            // InternalOntologicalModelingLanguage.g:5779:42: 'extendsAspect'
            {
            match("extendsAspect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN"

    // $ANTLR start "RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN"
    public final void mRULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5781:54: ( 'extendsRelationship' )
            // InternalOntologicalModelingLanguage.g:5781:56: 'extendsRelationship'
            {
            match("extendsRelationship"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN"

    // $ANTLR start "RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN"
    public final void mRULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5783:70: ( 'entityScalarDataPropertyExistentialRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:5783:72: 'entityScalarDataPropertyExistentialRestrictionAxiom'
            {
            match("entityScalarDataPropertyExistentialRestrictionAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN"

    // $ANTLR start "RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN"
    public final void mRULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5785:68: ( 'entityScalarDataPropertyUniversalRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:5785:70: 'entityScalarDataPropertyUniversalRestrictionAxiom'
            {
            match("entityScalarDataPropertyUniversalRestrictionAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN"

    // $ANTLR start "RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN"
    public final void mRULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5787:69: ( 'entityScalarDataPropertyParticularRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:5787:71: 'entityScalarDataPropertyParticularRestrictionAxiom'
            {
            match("entityScalarDataPropertyParticularRestrictionAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN"

    // $ANTLR start "RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN"
    public final void mRULE_SYNONYM_SCALAR_RESTRICTION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5789:39: ( 'synonymScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:5789:41: 'synonymScalarRestriction'
            {
            match("synonymScalarRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN"

    // $ANTLR start "RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN"
    public final void mRULE_NUMERIC_SCALAR_RESTRICTION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5791:39: ( 'numericScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:5791:41: 'numericScalarRestriction'
            {
            match("numericScalarRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN"

    // $ANTLR start "RULE_STRING_SCALAR_RESTRICTION_TOKEN"
    public final void mRULE_STRING_SCALAR_RESTRICTION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_STRING_SCALAR_RESTRICTION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5793:38: ( 'stringScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:5793:40: 'stringScalarRestriction'
            {
            match("stringScalarRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_SCALAR_RESTRICTION_TOKEN"

    // $ANTLR start "RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN"
    public final void mRULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5795:45: ( 'plainLiteralScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:5795:47: 'plainLiteralScalarRestriction'
            {
            match("plainLiteralScalarRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN"

    // $ANTLR start "RULE_BINARY_SCALAR_RESTRICTION_TOKEN"
    public final void mRULE_BINARY_SCALAR_RESTRICTION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_BINARY_SCALAR_RESTRICTION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5797:38: ( 'binaryScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:5797:40: 'binaryScalarRestriction'
            {
            match("binaryScalarRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_SCALAR_RESTRICTION_TOKEN"

    // $ANTLR start "RULE_IRI_SCALAR_RESTRICTION_TOKEN"
    public final void mRULE_IRI_SCALAR_RESTRICTION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_IRI_SCALAR_RESTRICTION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5799:35: ( 'iriScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:5799:37: 'iriScalarRestriction'
            {
            match("iriScalarRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IRI_SCALAR_RESTRICTION_TOKEN"

    // $ANTLR start "RULE_TIME_SCALAR_RESTRICTION_TOKEN"
    public final void mRULE_TIME_SCALAR_RESTRICTION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_TIME_SCALAR_RESTRICTION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5801:36: ( 'timeScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:5801:38: 'timeScalarRestriction'
            {
            match("timeScalarRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME_SCALAR_RESTRICTION_TOKEN"

    // $ANTLR start "RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN"
    public final void mRULE_SCALAR_ONE_OF_RESTRICTION_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5803:38: ( 'scalarOneOfRestriction' )
            // InternalOntologicalModelingLanguage.g:5803:40: 'scalarOneOfRestriction'
            {
            match("scalarOneOfRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN"

    // $ANTLR start "RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN"
    public final void mRULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5805:40: ( 'scalarOneOfLiteralAxiom' )
            // InternalOntologicalModelingLanguage.g:5805:42: 'scalarOneOfLiteralAxiom'
            {
            match("scalarOneOfLiteralAxiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN"

    // $ANTLR start "RULE_DESCRIPTION_BOX_TOKEN"
    public final void mRULE_DESCRIPTION_BOX_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_DESCRIPTION_BOX_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5807:28: ( 'DescriptionBox' )
            // InternalOntologicalModelingLanguage.g:5807:30: 'DescriptionBox'
            {
            match("DescriptionBox"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESCRIPTION_BOX_TOKEN"

    // $ANTLR start "RULE_LCURLY"
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5809:13: ( '{' )
            // InternalOntologicalModelingLanguage.g:5809:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCURLY"

    // $ANTLR start "RULE_RCURLY"
    public final void mRULE_RCURLY() throws RecognitionException {
        try {
            int _type = RULE_RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5811:13: ( '}' )
            // InternalOntologicalModelingLanguage.g:5811:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RCURLY"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5813:12: ( '=' )
            // InternalOntologicalModelingLanguage.g:5813:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5815:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalOntologicalModelingLanguage.g:5815:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalOntologicalModelingLanguage.g:5815:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5815:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalOntologicalModelingLanguage.g:5815:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalOntologicalModelingLanguage.g:5815:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntologicalModelingLanguage.g:5815:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalOntologicalModelingLanguage.g:5815:44: ( '\"' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\"') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalOntologicalModelingLanguage.g:5815:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:5815:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalOntologicalModelingLanguage.g:5815:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalOntologicalModelingLanguage.g:5815:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntologicalModelingLanguage.g:5815:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalOntologicalModelingLanguage.g:5815:79: ( '\\'' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\'') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalOntologicalModelingLanguage.g:5815:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_IRI"
    public final void mRULE_IRI() throws RecognitionException {
        try {
            int _type = RULE_IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5817:10: ( '<' (~ ( '>' ) )* '>' )
            // InternalOntologicalModelingLanguage.g:5817:12: '<' (~ ( '>' ) )* '>'
            {
            match('<'); 
            // InternalOntologicalModelingLanguage.g:5817:16: (~ ( '>' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='=')||(LA6_0>='?' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:5817:16: ~ ( '>' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IRI"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5819:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalOntologicalModelingLanguage.g:5819:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalOntologicalModelingLanguage.g:5819:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5819:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOntologicalModelingLanguage.g:5819:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='$'||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_UUID"
    public final void mRULE_UUID() throws RecognitionException {
        try {
            int _type = RULE_UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5821:11: ( RULE_HEX_8DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_12DIGITS )
            // InternalOntologicalModelingLanguage.g:5821:13: RULE_HEX_8DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_12DIGITS
            {
            mRULE_HEX_8DIGITS(); 
            match('-'); 
            mRULE_HEX_4DIGITS(); 
            match('-'); 
            mRULE_HEX_4DIGITS(); 
            match('-'); 
            mRULE_HEX_4DIGITS(); 
            match('-'); 
            mRULE_HEX_12DIGITS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UUID"

    // $ANTLR start "RULE_HEX_12DIGITS"
    public final void mRULE_HEX_12DIGITS() throws RecognitionException {
        try {
            // InternalOntologicalModelingLanguage.g:5823:28: ( RULE_HEX_8DIGITS RULE_HEX_4DIGITS )
            // InternalOntologicalModelingLanguage.g:5823:30: RULE_HEX_8DIGITS RULE_HEX_4DIGITS
            {
            mRULE_HEX_8DIGITS(); 
            mRULE_HEX_4DIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_12DIGITS"

    // $ANTLR start "RULE_HEX_8DIGITS"
    public final void mRULE_HEX_8DIGITS() throws RecognitionException {
        try {
            // InternalOntologicalModelingLanguage.g:5825:27: ( RULE_HEX_4DIGITS RULE_HEX_4DIGITS )
            // InternalOntologicalModelingLanguage.g:5825:29: RULE_HEX_4DIGITS RULE_HEX_4DIGITS
            {
            mRULE_HEX_4DIGITS(); 
            mRULE_HEX_4DIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_8DIGITS"

    // $ANTLR start "RULE_HEX_4DIGITS"
    public final void mRULE_HEX_4DIGITS() throws RecognitionException {
        try {
            // InternalOntologicalModelingLanguage.g:5827:27: ( RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalOntologicalModelingLanguage.g:5827:29: RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_4DIGITS"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalOntologicalModelingLanguage.g:5829:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalOntologicalModelingLanguage.g:5829:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5831:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalOntologicalModelingLanguage.g:5831:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalOntologicalModelingLanguage.g:5831:12: ( '0x' | '0X' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='x') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='X') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5831:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:5831:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:5831:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='F')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='f')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalOntologicalModelingLanguage.g:5831:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='#') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5831:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalOntologicalModelingLanguage.g:5831:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='B'||LA11_0=='b') ) {
                        alt11=1;
                    }
                    else if ( (LA11_0=='L'||LA11_0=='l') ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalOntologicalModelingLanguage.g:5831:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // InternalOntologicalModelingLanguage.g:5831:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5833:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalOntologicalModelingLanguage.g:5833:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalOntologicalModelingLanguage.g:5833:21: ( '0' .. '9' | '_' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||LA13_0=='_') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5835:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalOntologicalModelingLanguage.g:5835:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalOntologicalModelingLanguage.g:5835:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='E'||LA15_0=='e') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5835:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalOntologicalModelingLanguage.g:5835:36: ( '+' | '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='+'||LA14_0=='-') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalOntologicalModelingLanguage.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:5835:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='B'||LA16_0=='b') ) {
                alt16=1;
            }
            else if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='L'||LA16_0=='d'||LA16_0=='f'||LA16_0=='l') ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5835:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:5835:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5837:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOntologicalModelingLanguage.g:5837:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOntologicalModelingLanguage.g:5837:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:5837:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5839:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOntologicalModelingLanguage.g:5839:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOntologicalModelingLanguage.g:5839:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:5839:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalOntologicalModelingLanguage.g:5839:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:5839:41: ( '\\r' )? '\\n'
                    {
                    // InternalOntologicalModelingLanguage.g:5839:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalOntologicalModelingLanguage.g:5839:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5841:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOntologicalModelingLanguage.g:5841:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOntologicalModelingLanguage.g:5841:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:5843:16: ( . )
            // InternalOntologicalModelingLanguage.g:5843:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalOntologicalModelingLanguage.g:1:8: ( T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | RULE_ANNOTATION_PROPERTY_TOKEN | RULE_ANNOTATION_TOKEN | RULE_TERMINOLOGY_GRAPH_TOKEN | RULE_BUNDLE_TOKEN | RULE_KIND_TOKEN | RULE_ASPECT_TOKEN | RULE_ABSTRACT_TOKEN | RULE_CONCEPT_TOKEN | RULE_REIFIED_RELATIONSHIP_TOKEN | RULE_UNREIFIED_RELATIONSHIP_TOKEN | RULE_FUNCTIONAL_TOKEN | RULE_INVERSE_FUNCTIONAL_TOKEN | RULE_ESSENTIAL_TOKEN | RULE_INVERSE_ESSENTIAL_TOKEN | RULE_SYMMETRIC_TOKEN | RULE_ASYMMETRIC_TOKEN | RULE_REFLEXIVE_TOKEN | RULE_IRREFLEXIVE_TOKEN | RULE_TRANSITIVE_TOKEN | RULE_UNREIFIED_TOKEN | RULE_INVERSE_TOKEN | RULE_SOURCE_TOKEN | RULE_TARGET_TOKEN | RULE_SCALAR_TOKEN | RULE_STRUCTURE_TOKEN | RULE_DOMAIN_TOKEN | RULE_RANGE_TOKEN | RULE_EXTENDS_TOKEN | RULE_REFINES_TOKEN | RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN | RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN | RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN | RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN | RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN | RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN | RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN | RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN | RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN | RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN | RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN | RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN | RULE_STRING_SCALAR_RESTRICTION_TOKEN | RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN | RULE_BINARY_SCALAR_RESTRICTION_TOKEN | RULE_IRI_SCALAR_RESTRICTION_TOKEN | RULE_TIME_SCALAR_RESTRICTION_TOKEN | RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN | RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN | RULE_DESCRIPTION_BOX_TOKEN | RULE_LCURLY | RULE_RCURLY | RULE_EQUAL | RULE_STRING | RULE_IRI | RULE_ID | RULE_UUID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=116;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalOntologicalModelingLanguage.g:1:10: T__75
                {
                mT__75(); 

                }
                break;
            case 2 :
                // InternalOntologicalModelingLanguage.g:1:16: T__76
                {
                mT__76(); 

                }
                break;
            case 3 :
                // InternalOntologicalModelingLanguage.g:1:22: T__77
                {
                mT__77(); 

                }
                break;
            case 4 :
                // InternalOntologicalModelingLanguage.g:1:28: T__78
                {
                mT__78(); 

                }
                break;
            case 5 :
                // InternalOntologicalModelingLanguage.g:1:34: T__79
                {
                mT__79(); 

                }
                break;
            case 6 :
                // InternalOntologicalModelingLanguage.g:1:40: T__80
                {
                mT__80(); 

                }
                break;
            case 7 :
                // InternalOntologicalModelingLanguage.g:1:46: T__81
                {
                mT__81(); 

                }
                break;
            case 8 :
                // InternalOntologicalModelingLanguage.g:1:52: T__82
                {
                mT__82(); 

                }
                break;
            case 9 :
                // InternalOntologicalModelingLanguage.g:1:58: T__83
                {
                mT__83(); 

                }
                break;
            case 10 :
                // InternalOntologicalModelingLanguage.g:1:64: T__84
                {
                mT__84(); 

                }
                break;
            case 11 :
                // InternalOntologicalModelingLanguage.g:1:70: T__85
                {
                mT__85(); 

                }
                break;
            case 12 :
                // InternalOntologicalModelingLanguage.g:1:76: T__86
                {
                mT__86(); 

                }
                break;
            case 13 :
                // InternalOntologicalModelingLanguage.g:1:82: T__87
                {
                mT__87(); 

                }
                break;
            case 14 :
                // InternalOntologicalModelingLanguage.g:1:88: T__88
                {
                mT__88(); 

                }
                break;
            case 15 :
                // InternalOntologicalModelingLanguage.g:1:94: T__89
                {
                mT__89(); 

                }
                break;
            case 16 :
                // InternalOntologicalModelingLanguage.g:1:100: T__90
                {
                mT__90(); 

                }
                break;
            case 17 :
                // InternalOntologicalModelingLanguage.g:1:106: T__91
                {
                mT__91(); 

                }
                break;
            case 18 :
                // InternalOntologicalModelingLanguage.g:1:112: T__92
                {
                mT__92(); 

                }
                break;
            case 19 :
                // InternalOntologicalModelingLanguage.g:1:118: T__93
                {
                mT__93(); 

                }
                break;
            case 20 :
                // InternalOntologicalModelingLanguage.g:1:124: T__94
                {
                mT__94(); 

                }
                break;
            case 21 :
                // InternalOntologicalModelingLanguage.g:1:130: T__95
                {
                mT__95(); 

                }
                break;
            case 22 :
                // InternalOntologicalModelingLanguage.g:1:136: T__96
                {
                mT__96(); 

                }
                break;
            case 23 :
                // InternalOntologicalModelingLanguage.g:1:142: T__97
                {
                mT__97(); 

                }
                break;
            case 24 :
                // InternalOntologicalModelingLanguage.g:1:148: T__98
                {
                mT__98(); 

                }
                break;
            case 25 :
                // InternalOntologicalModelingLanguage.g:1:154: T__99
                {
                mT__99(); 

                }
                break;
            case 26 :
                // InternalOntologicalModelingLanguage.g:1:160: T__100
                {
                mT__100(); 

                }
                break;
            case 27 :
                // InternalOntologicalModelingLanguage.g:1:167: T__101
                {
                mT__101(); 

                }
                break;
            case 28 :
                // InternalOntologicalModelingLanguage.g:1:174: T__102
                {
                mT__102(); 

                }
                break;
            case 29 :
                // InternalOntologicalModelingLanguage.g:1:181: T__103
                {
                mT__103(); 

                }
                break;
            case 30 :
                // InternalOntologicalModelingLanguage.g:1:188: T__104
                {
                mT__104(); 

                }
                break;
            case 31 :
                // InternalOntologicalModelingLanguage.g:1:195: T__105
                {
                mT__105(); 

                }
                break;
            case 32 :
                // InternalOntologicalModelingLanguage.g:1:202: T__106
                {
                mT__106(); 

                }
                break;
            case 33 :
                // InternalOntologicalModelingLanguage.g:1:209: T__107
                {
                mT__107(); 

                }
                break;
            case 34 :
                // InternalOntologicalModelingLanguage.g:1:216: T__108
                {
                mT__108(); 

                }
                break;
            case 35 :
                // InternalOntologicalModelingLanguage.g:1:223: T__109
                {
                mT__109(); 

                }
                break;
            case 36 :
                // InternalOntologicalModelingLanguage.g:1:230: T__110
                {
                mT__110(); 

                }
                break;
            case 37 :
                // InternalOntologicalModelingLanguage.g:1:237: T__111
                {
                mT__111(); 

                }
                break;
            case 38 :
                // InternalOntologicalModelingLanguage.g:1:244: T__112
                {
                mT__112(); 

                }
                break;
            case 39 :
                // InternalOntologicalModelingLanguage.g:1:251: T__113
                {
                mT__113(); 

                }
                break;
            case 40 :
                // InternalOntologicalModelingLanguage.g:1:258: T__114
                {
                mT__114(); 

                }
                break;
            case 41 :
                // InternalOntologicalModelingLanguage.g:1:265: T__115
                {
                mT__115(); 

                }
                break;
            case 42 :
                // InternalOntologicalModelingLanguage.g:1:272: T__116
                {
                mT__116(); 

                }
                break;
            case 43 :
                // InternalOntologicalModelingLanguage.g:1:279: T__117
                {
                mT__117(); 

                }
                break;
            case 44 :
                // InternalOntologicalModelingLanguage.g:1:286: T__118
                {
                mT__118(); 

                }
                break;
            case 45 :
                // InternalOntologicalModelingLanguage.g:1:293: T__119
                {
                mT__119(); 

                }
                break;
            case 46 :
                // InternalOntologicalModelingLanguage.g:1:300: T__120
                {
                mT__120(); 

                }
                break;
            case 47 :
                // InternalOntologicalModelingLanguage.g:1:307: T__121
                {
                mT__121(); 

                }
                break;
            case 48 :
                // InternalOntologicalModelingLanguage.g:1:314: T__122
                {
                mT__122(); 

                }
                break;
            case 49 :
                // InternalOntologicalModelingLanguage.g:1:321: T__123
                {
                mT__123(); 

                }
                break;
            case 50 :
                // InternalOntologicalModelingLanguage.g:1:328: RULE_ANNOTATION_PROPERTY_TOKEN
                {
                mRULE_ANNOTATION_PROPERTY_TOKEN(); 

                }
                break;
            case 51 :
                // InternalOntologicalModelingLanguage.g:1:359: RULE_ANNOTATION_TOKEN
                {
                mRULE_ANNOTATION_TOKEN(); 

                }
                break;
            case 52 :
                // InternalOntologicalModelingLanguage.g:1:381: RULE_TERMINOLOGY_GRAPH_TOKEN
                {
                mRULE_TERMINOLOGY_GRAPH_TOKEN(); 

                }
                break;
            case 53 :
                // InternalOntologicalModelingLanguage.g:1:410: RULE_BUNDLE_TOKEN
                {
                mRULE_BUNDLE_TOKEN(); 

                }
                break;
            case 54 :
                // InternalOntologicalModelingLanguage.g:1:428: RULE_KIND_TOKEN
                {
                mRULE_KIND_TOKEN(); 

                }
                break;
            case 55 :
                // InternalOntologicalModelingLanguage.g:1:444: RULE_ASPECT_TOKEN
                {
                mRULE_ASPECT_TOKEN(); 

                }
                break;
            case 56 :
                // InternalOntologicalModelingLanguage.g:1:462: RULE_ABSTRACT_TOKEN
                {
                mRULE_ABSTRACT_TOKEN(); 

                }
                break;
            case 57 :
                // InternalOntologicalModelingLanguage.g:1:482: RULE_CONCEPT_TOKEN
                {
                mRULE_CONCEPT_TOKEN(); 

                }
                break;
            case 58 :
                // InternalOntologicalModelingLanguage.g:1:501: RULE_REIFIED_RELATIONSHIP_TOKEN
                {
                mRULE_REIFIED_RELATIONSHIP_TOKEN(); 

                }
                break;
            case 59 :
                // InternalOntologicalModelingLanguage.g:1:533: RULE_UNREIFIED_RELATIONSHIP_TOKEN
                {
                mRULE_UNREIFIED_RELATIONSHIP_TOKEN(); 

                }
                break;
            case 60 :
                // InternalOntologicalModelingLanguage.g:1:567: RULE_FUNCTIONAL_TOKEN
                {
                mRULE_FUNCTIONAL_TOKEN(); 

                }
                break;
            case 61 :
                // InternalOntologicalModelingLanguage.g:1:589: RULE_INVERSE_FUNCTIONAL_TOKEN
                {
                mRULE_INVERSE_FUNCTIONAL_TOKEN(); 

                }
                break;
            case 62 :
                // InternalOntologicalModelingLanguage.g:1:619: RULE_ESSENTIAL_TOKEN
                {
                mRULE_ESSENTIAL_TOKEN(); 

                }
                break;
            case 63 :
                // InternalOntologicalModelingLanguage.g:1:640: RULE_INVERSE_ESSENTIAL_TOKEN
                {
                mRULE_INVERSE_ESSENTIAL_TOKEN(); 

                }
                break;
            case 64 :
                // InternalOntologicalModelingLanguage.g:1:669: RULE_SYMMETRIC_TOKEN
                {
                mRULE_SYMMETRIC_TOKEN(); 

                }
                break;
            case 65 :
                // InternalOntologicalModelingLanguage.g:1:690: RULE_ASYMMETRIC_TOKEN
                {
                mRULE_ASYMMETRIC_TOKEN(); 

                }
                break;
            case 66 :
                // InternalOntologicalModelingLanguage.g:1:712: RULE_REFLEXIVE_TOKEN
                {
                mRULE_REFLEXIVE_TOKEN(); 

                }
                break;
            case 67 :
                // InternalOntologicalModelingLanguage.g:1:733: RULE_IRREFLEXIVE_TOKEN
                {
                mRULE_IRREFLEXIVE_TOKEN(); 

                }
                break;
            case 68 :
                // InternalOntologicalModelingLanguage.g:1:756: RULE_TRANSITIVE_TOKEN
                {
                mRULE_TRANSITIVE_TOKEN(); 

                }
                break;
            case 69 :
                // InternalOntologicalModelingLanguage.g:1:778: RULE_UNREIFIED_TOKEN
                {
                mRULE_UNREIFIED_TOKEN(); 

                }
                break;
            case 70 :
                // InternalOntologicalModelingLanguage.g:1:799: RULE_INVERSE_TOKEN
                {
                mRULE_INVERSE_TOKEN(); 

                }
                break;
            case 71 :
                // InternalOntologicalModelingLanguage.g:1:818: RULE_SOURCE_TOKEN
                {
                mRULE_SOURCE_TOKEN(); 

                }
                break;
            case 72 :
                // InternalOntologicalModelingLanguage.g:1:836: RULE_TARGET_TOKEN
                {
                mRULE_TARGET_TOKEN(); 

                }
                break;
            case 73 :
                // InternalOntologicalModelingLanguage.g:1:854: RULE_SCALAR_TOKEN
                {
                mRULE_SCALAR_TOKEN(); 

                }
                break;
            case 74 :
                // InternalOntologicalModelingLanguage.g:1:872: RULE_STRUCTURE_TOKEN
                {
                mRULE_STRUCTURE_TOKEN(); 

                }
                break;
            case 75 :
                // InternalOntologicalModelingLanguage.g:1:893: RULE_DOMAIN_TOKEN
                {
                mRULE_DOMAIN_TOKEN(); 

                }
                break;
            case 76 :
                // InternalOntologicalModelingLanguage.g:1:911: RULE_RANGE_TOKEN
                {
                mRULE_RANGE_TOKEN(); 

                }
                break;
            case 77 :
                // InternalOntologicalModelingLanguage.g:1:928: RULE_EXTENDS_TOKEN
                {
                mRULE_EXTENDS_TOKEN(); 

                }
                break;
            case 78 :
                // InternalOntologicalModelingLanguage.g:1:947: RULE_REFINES_TOKEN
                {
                mRULE_REFINES_TOKEN(); 

                }
                break;
            case 79 :
                // InternalOntologicalModelingLanguage.g:1:966: RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN
                {
                mRULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN(); 

                }
                break;
            case 80 :
                // InternalOntologicalModelingLanguage.g:1:1005: RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN
                {
                mRULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN(); 

                }
                break;
            case 81 :
                // InternalOntologicalModelingLanguage.g:1:1048: RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN
                {
                mRULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN(); 

                }
                break;
            case 82 :
                // InternalOntologicalModelingLanguage.g:1:1092: RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN
                {
                mRULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN(); 

                }
                break;
            case 83 :
                // InternalOntologicalModelingLanguage.g:1:1129: RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN
                {
                mRULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN(); 

                }
                break;
            case 84 :
                // InternalOntologicalModelingLanguage.g:1:1178: RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN
                {
                mRULE_TERMINOLOGY_NESTING_AXIOM_TOKEN(); 

                }
                break;
            case 85 :
                // InternalOntologicalModelingLanguage.g:1:1215: RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 86 :
                // InternalOntologicalModelingLanguage.g:1:1263: RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 87 :
                // InternalOntologicalModelingLanguage.g:1:1309: RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN
                {
                mRULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN(); 

                }
                break;
            case 88 :
                // InternalOntologicalModelingLanguage.g:1:1349: RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN
                {
                mRULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN(); 

                }
                break;
            case 89 :
                // InternalOntologicalModelingLanguage.g:1:1388: RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN
                {
                mRULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN(); 

                }
                break;
            case 90 :
                // InternalOntologicalModelingLanguage.g:1:1441: RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 91 :
                // InternalOntologicalModelingLanguage.g:1:1510: RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 92 :
                // InternalOntologicalModelingLanguage.g:1:1577: RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 93 :
                // InternalOntologicalModelingLanguage.g:1:1645: RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_SYNONYM_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 94 :
                // InternalOntologicalModelingLanguage.g:1:1683: RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_NUMERIC_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 95 :
                // InternalOntologicalModelingLanguage.g:1:1721: RULE_STRING_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_STRING_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 96 :
                // InternalOntologicalModelingLanguage.g:1:1758: RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 97 :
                // InternalOntologicalModelingLanguage.g:1:1802: RULE_BINARY_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_BINARY_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 98 :
                // InternalOntologicalModelingLanguage.g:1:1839: RULE_IRI_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_IRI_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 99 :
                // InternalOntologicalModelingLanguage.g:1:1873: RULE_TIME_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_TIME_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 100 :
                // InternalOntologicalModelingLanguage.g:1:1908: RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN
                {
                mRULE_SCALAR_ONE_OF_RESTRICTION_TOKEN(); 

                }
                break;
            case 101 :
                // InternalOntologicalModelingLanguage.g:1:1945: RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN
                {
                mRULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN(); 

                }
                break;
            case 102 :
                // InternalOntologicalModelingLanguage.g:1:1984: RULE_DESCRIPTION_BOX_TOKEN
                {
                mRULE_DESCRIPTION_BOX_TOKEN(); 

                }
                break;
            case 103 :
                // InternalOntologicalModelingLanguage.g:1:2011: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 104 :
                // InternalOntologicalModelingLanguage.g:1:2023: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 105 :
                // InternalOntologicalModelingLanguage.g:1:2035: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 106 :
                // InternalOntologicalModelingLanguage.g:1:2046: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 107 :
                // InternalOntologicalModelingLanguage.g:1:2058: RULE_IRI
                {
                mRULE_IRI(); 

                }
                break;
            case 108 :
                // InternalOntologicalModelingLanguage.g:1:2067: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 109 :
                // InternalOntologicalModelingLanguage.g:1:2075: RULE_UUID
                {
                mRULE_UUID(); 

                }
                break;
            case 110 :
                // InternalOntologicalModelingLanguage.g:1:2085: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 111 :
                // InternalOntologicalModelingLanguage.g:1:2094: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 112 :
                // InternalOntologicalModelingLanguage.g:1:2103: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 113 :
                // InternalOntologicalModelingLanguage.g:1:2116: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 114 :
                // InternalOntologicalModelingLanguage.g:1:2132: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 115 :
                // InternalOntologicalModelingLanguage.g:1:2148: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 116 :
                // InternalOntologicalModelingLanguage.g:1:2156: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\20\54\1\uffff\3\54\1\uffff\4\54\5\uffff\2\47\1\54\1\uffff\2\147\1\47\2\uffff\4\54\1\uffff\44\54\1\uffff\5\54\1\uffff\10\54\6\uffff\1\147\1\uffff\1\147\2\uffff\1\155\5\uffff\74\54\2\uffff\1\155\1\147\2\155\20\54\1\u010d\43\54\1\u0131\10\54\1\u013a\4\54\2\155\2\uffff\1\155\1\147\1\155\21\54\1\uffff\4\54\1\u015b\20\54\1\u016c\1\u016d\14\54\1\uffff\2\54\1\u017c\5\54\1\uffff\4\54\1\155\1\uffff\3\155\1\uffff\1\147\6\54\1\u0199\3\54\1\u019d\4\54\1\u01a2\5\54\1\uffff\1\u01a9\4\54\1\u01ae\12\54\2\uffff\2\54\1\u01bb\11\54\1\u01c5\1\54\1\uffff\3\54\1\u01ca\5\54\1\uffff\4\155\1\uffff\1\147\4\54\1\u01df\7\54\1\uffff\3\54\1\uffff\4\54\1\uffff\4\54\1\u01f2\1\54\1\uffff\4\54\1\uffff\7\54\1\u0200\1\u0201\3\54\1\uffff\11\54\1\uffff\1\u020f\3\54\1\uffff\2\54\1\u0217\2\54\1\155\1\uffff\3\155\1\uffff\1\147\10\54\1\uffff\22\54\1\uffff\15\54\2\uffff\4\54\1\u024c\10\54\1\uffff\7\54\1\uffff\2\54\1\155\1\uffff\3\155\1\uffff\1\147\4\54\1\u0263\3\54\1\u0268\6\54\1\u0270\11\54\1\u027a\6\54\1\u0281\1\u0282\2\54\1\u0285\6\54\1\uffff\14\54\1\u0299\4\54\1\uffff\4\54\1\uffff\4\54\1\uffff\7\54\1\uffff\11\54\1\uffff\6\54\2\uffff\2\54\1\uffff\5\54\1\u02c8\10\54\1\u02d1\1\54\1\u02d3\2\54\1\uffff\4\54\1\155\51\54\1\uffff\10\54\1\uffff\1\u0311\1\uffff\4\54\1\u0316\1\54\1\155\1\uffff\1\155\24\54\1\u0330\16\54\1\u033f\1\u0340\1\u0341\1\u0342\1\u0343\14\54\1\uffff\4\54\1\uffff\1\54\1\uffff\3\155\5\54\1\u035e\16\54\1\uffff\16\54\5\uffff\21\54\1\155\1\uffff\2\155\4\54\1\u0390\1\uffff\5\54\1\u0397\24\54\1\u03ac\7\54\1\u03b4\16\54\1\uffff\6\54\1\uffff\15\54\1\u03d6\6\54\1\uffff\7\54\1\uffff\1\u03e4\40\54\1\uffff\1\u0405\1\u0406\13\54\1\uffff\7\54\1\u0419\13\54\1\u0425\10\54\1\u042e\1\u042f\2\54\2\uffff\21\54\1\u0443\1\uffff\11\54\1\u044d\1\54\1\uffff\10\54\2\uffff\1\54\1\u0458\1\54\1\u045b\1\54\1\u045d\2\54\1\u0460\3\54\1\u0464\6\54\1\uffff\5\54\1\u0470\3\54\1\uffff\1\u0474\11\54\1\uffff\1\u047f\1\54\1\uffff\1\54\1\uffff\2\54\1\uffff\3\54\1\uffff\13\54\1\uffff\3\54\1\uffff\12\54\1\uffff\15\54\1\u04ac\16\54\1\u04bb\15\54\1\u04c9\1\u04ca\1\uffff\4\54\1\u04cf\2\54\1\u04d2\5\54\1\u04d8\1\uffff\15\54\2\uffff\4\54\1\uffff\1\u04ea\1\u04eb\1\uffff\1\u04ec\4\54\1\uffff\2\54\1\u04f3\1\u04f4\3\54\1\u04f8\4\54\1\u04fd\1\54\1\u0502\2\54\3\uffff\2\54\1\u0507\1\54\1\u0509\1\54\2\uffff\1\u050b\2\54\1\uffff\4\54\1\uffff\4\54\1\uffff\4\54\1\uffff\1\54\1\uffff\1\54\1\uffff\14\54\1\u0528\17\54\1\uffff\2\54\1\u053a\2\54\1\u053d\1\u0540\2\54\1\u0543\6\54\1\u054a\1\uffff\2\54\1\uffff\2\54\1\uffff\2\54\1\uffff\6\54\1\uffff\1\u0557\1\u0558\12\54\2\uffff\10\54\1\u056b\11\54\1\uffff\2\54\1\u0577\5\54\1\u057d\1\54\1\u057f\1\uffff\5\54\1\uffff\1\54\1\uffff\1\u0586\1\u0587\4\54\2\uffff\13\54\1\u0597\3\54\1\uffff\34\54\1\u05b7\2\54\1\uffff\1\u05ba\1\u05bb\2\uffff";
    static final String DFA22_eofS =
        "\u05bc\uffff";
    static final String DFA22_minS =
        "\1\0\1\60\1\143\1\60\1\141\1\60\1\145\4\141\1\60\1\143\2\60\1\145\1\156\1\uffff\1\160\2\60\1\uffff\1\141\1\151\2\156\5\uffff\1\0\1\44\1\60\1\uffff\2\60\1\52\2\uffff\1\164\1\163\1\164\1\60\1\uffff\1\162\1\141\1\156\1\155\1\165\1\145\1\163\2\60\1\155\1\157\1\146\3\156\1\163\1\155\1\164\3\156\1\170\1\162\1\141\1\154\1\151\1\156\1\160\1\60\1\141\1\162\2\60\1\156\1\151\1\162\1\uffff\1\145\1\157\3\156\1\uffff\1\162\1\141\1\162\1\155\1\156\1\162\1\166\1\151\6\uffff\1\60\1\uffff\1\60\1\53\2\60\5\uffff\1\151\2\145\1\60\1\151\1\154\1\147\1\155\1\157\1\162\1\143\1\152\1\151\2\141\2\164\1\146\1\151\1\147\1\144\1\141\1\164\2\145\2\147\2\105\2\164\1\151\1\165\2\157\1\156\1\145\1\155\1\164\1\154\1\165\1\141\2\143\1\146\1\145\1\156\1\163\1\143\1\141\1\143\1\155\1\156\1\147\1\145\1\144\3\145\1\123\1\53\5\60\1\164\2\156\1\60\1\143\1\156\1\141\1\154\1\145\1\156\1\143\1\151\1\157\1\147\1\123\1\151\1\44\1\162\1\151\1\145\1\156\1\145\1\154\1\162\1\151\2\162\1\164\1\122\1\145\1\156\1\170\1\145\1\156\1\170\1\145\1\151\1\156\1\145\1\155\1\164\1\171\1\143\1\155\1\162\1\141\1\143\1\123\1\162\1\145\2\151\1\44\2\145\1\154\1\164\1\151\1\163\1\145\1\123\1\44\1\151\1\162\1\146\1\143\2\60\1\53\4\60\1\171\1\164\1\144\1\60\1\164\1\147\1\162\1\145\1\164\1\171\1\145\1\146\1\151\1\156\1\164\1\156\1\157\1\uffff\1\151\1\145\1\170\1\145\1\44\1\145\1\171\1\156\1\151\1\141\1\150\1\141\1\156\2\143\1\156\2\143\1\162\1\141\1\114\2\44\1\141\1\155\1\164\1\145\1\141\1\162\2\164\1\151\1\160\1\145\1\146\1\uffff\1\144\1\160\1\44\1\151\1\156\1\151\1\164\1\143\1\uffff\1\146\1\163\1\154\1\141\5\60\1\53\1\60\1\105\1\151\1\163\1\60\1\165\1\123\1\44\1\164\1\162\1\155\1\44\1\151\1\156\1\141\1\162\1\44\1\156\1\143\1\144\1\151\1\163\1\uffff\1\44\1\123\1\147\1\143\1\154\1\44\1\156\1\147\2\154\1\147\2\154\1\156\1\154\1\151\2\uffff\1\164\1\157\1\44\1\164\1\143\1\104\1\165\1\162\1\160\1\164\1\144\1\151\1\44\1\164\1\uffff\2\157\1\164\1\44\1\141\1\151\2\145\1\154\5\60\1\53\1\60\1\143\1\170\1\156\1\141\1\44\1\60\1\162\1\143\1\141\1\162\1\145\1\156\1\uffff\1\157\1\151\1\123\1\uffff\1\143\2\164\1\165\1\uffff\1\143\1\164\1\122\1\166\1\44\1\124\1\uffff\1\143\1\103\1\123\1\126\1\uffff\1\147\1\164\2\165\1\164\2\165\2\44\1\164\1\151\1\165\1\uffff\1\162\1\164\1\141\1\162\1\165\1\164\1\111\1\122\1\145\1\uffff\1\44\1\156\1\154\1\151\1\uffff\1\154\1\145\1\44\1\170\1\141\5\60\1\53\1\60\1\162\1\141\2\151\1\154\1\157\1\163\1\145\1\uffff\1\55\1\145\1\141\1\164\1\157\1\163\1\145\1\156\2\143\1\104\1\114\1\145\1\143\4\145\1\uffff\1\145\1\141\1\145\1\157\1\143\1\141\1\145\1\150\2\163\1\150\2\163\2\uffff\1\145\1\157\1\163\1\151\1\44\1\164\1\145\1\143\1\151\1\156\1\145\1\144\1\145\1\uffff\1\141\1\157\1\166\1\141\1\144\1\165\1\163\1\uffff\1\151\1\162\5\55\1\53\1\55\1\165\1\154\1\163\1\166\1\44\1\156\1\160\1\154\1\44\1\154\1\141\1\160\1\164\1\117\1\103\1\44\1\141\1\151\1\141\1\145\1\144\1\164\1\160\1\144\1\154\1\44\1\162\1\154\1\162\1\156\1\141\1\154\2\44\2\151\1\44\2\151\1\162\1\156\1\103\1\143\1\uffff\1\141\1\144\1\164\1\157\1\163\1\154\1\122\1\163\1\154\1\147\1\145\1\162\1\44\1\156\1\163\1\166\1\122\1\60\1\143\1\141\1\164\1\145\1\uffff\1\143\1\145\1\141\1\104\1\uffff\1\141\1\120\1\145\1\162\1\146\1\157\1\145\1\uffff\1\154\1\163\1\170\1\141\1\103\1\165\1\164\1\104\1\141\1\uffff\1\155\1\141\1\155\1\164\1\154\1\165\2\uffff\2\166\1\uffff\2\166\1\141\1\120\1\157\1\44\1\120\1\104\1\165\1\156\1\164\1\141\1\145\1\151\1\44\1\171\1\44\1\122\1\145\1\uffff\1\143\3\145\1\60\1\164\1\162\1\145\1\162\1\145\1\143\1\164\1\141\4\162\1\151\1\114\1\156\1\151\1\141\1\152\1\157\1\146\1\145\1\157\1\162\1\124\1\141\1\157\1\156\1\164\1\151\1\162\1\151\1\145\1\141\5\145\1\154\1\162\1\156\1\uffff\1\162\1\141\1\162\1\102\1\141\1\164\1\154\1\147\1\uffff\1\44\1\uffff\1\145\1\154\1\164\1\156\1\44\1\163\3\60\1\165\1\104\1\156\1\163\1\160\1\164\1\151\1\164\1\157\1\122\1\157\1\164\1\143\1\145\1\151\1\143\1\146\1\162\1\157\1\156\1\44\1\162\1\156\1\145\1\141\1\154\1\156\1\155\1\164\1\151\1\156\1\122\1\156\1\170\1\162\5\44\1\123\1\157\1\143\1\157\1\164\1\145\1\157\1\156\1\151\1\141\1\156\1\145\1\uffff\1\163\1\141\1\151\1\164\1\uffff\1\164\4\60\1\162\1\141\1\164\1\141\1\164\1\44\1\157\1\141\1\160\1\145\1\160\1\171\1\164\1\163\1\164\1\145\1\151\1\122\1\151\1\157\1\uffff\1\155\1\143\1\124\1\170\1\141\1\147\1\141\1\151\2\157\1\145\1\157\1\164\1\122\5\uffff\1\143\1\160\1\145\1\160\1\141\1\124\1\170\1\143\1\157\1\164\1\141\1\163\2\164\1\157\1\151\1\162\4\55\1\145\1\164\1\151\1\154\1\44\1\uffff\1\156\1\120\1\145\1\163\1\145\1\44\1\151\1\164\1\145\1\160\2\145\1\156\1\155\1\151\1\145\1\171\1\157\1\164\1\145\1\151\1\164\1\156\1\154\1\163\1\154\1\44\1\145\1\141\1\145\1\160\1\145\1\120\1\165\1\44\1\145\1\156\1\151\2\164\1\162\1\151\1\156\1\141\1\151\1\144\2\141\1\122\1\uffff\1\163\2\162\1\164\1\162\1\141\1\uffff\1\157\2\162\1\164\1\144\1\163\1\164\1\171\1\156\2\160\1\156\1\151\1\44\1\156\1\171\1\163\1\157\1\164\1\157\1\uffff\1\163\1\154\1\162\1\164\2\162\1\160\1\uffff\1\44\1\163\1\157\3\151\1\157\1\141\1\154\1\143\1\104\1\120\1\154\1\145\1\150\1\157\1\164\1\162\1\164\1\154\1\156\1\151\1\141\1\103\1\122\1\164\1\103\1\120\1\157\1\164\1\145\2\157\1\uffff\2\44\1\150\1\147\1\162\1\147\1\164\1\141\1\164\1\124\1\164\1\157\1\154\1\uffff\1\150\1\156\1\157\1\156\1\143\1\156\1\154\1\44\1\164\1\141\1\162\1\122\1\163\1\151\1\160\1\171\1\151\1\171\1\165\1\44\1\143\2\154\1\145\1\162\1\157\1\141\1\154\2\44\1\155\1\156\2\uffff\1\151\1\171\1\151\1\171\2\162\1\171\1\141\1\171\1\160\1\145\1\151\1\163\1\156\1\147\1\164\1\163\1\44\1\uffff\1\151\1\164\1\157\1\145\1\164\1\160\1\145\1\124\1\143\1\44\1\145\1\uffff\1\164\1\101\1\141\1\154\1\151\1\156\1\162\1\157\2\uffff\1\171\1\44\1\160\1\44\1\143\1\44\1\151\1\122\1\44\1\170\1\126\1\145\1\44\1\160\1\150\1\124\1\101\1\151\1\150\1\uffff\1\157\1\141\1\160\1\163\1\162\1\44\1\162\1\165\1\164\1\uffff\1\44\1\151\1\170\1\163\1\141\2\143\1\145\1\147\1\101\1\uffff\1\44\1\170\1\uffff\1\164\1\uffff\1\143\1\145\1\uffff\1\157\1\141\1\162\1\uffff\1\111\1\151\1\145\1\170\1\157\1\151\1\156\1\120\1\145\1\164\1\151\1\uffff\1\164\1\160\1\151\1\uffff\1\157\1\151\1\163\2\164\1\145\1\156\1\171\1\170\1\156\1\uffff\2\151\1\164\1\163\1\156\1\154\1\164\1\156\1\160\1\162\1\151\1\156\1\160\1\44\3\162\1\143\1\171\1\154\1\157\1\156\1\157\3\151\1\160\1\164\1\44\1\151\1\163\2\157\1\151\1\164\1\157\1\165\1\171\1\163\1\111\1\155\1\157\2\44\1\uffff\1\157\1\164\1\151\1\164\1\44\1\145\1\156\1\44\1\155\1\146\2\157\1\164\1\44\1\uffff\1\157\1\164\1\155\1\156\1\157\1\162\1\155\1\145\1\126\1\164\1\156\1\151\1\155\2\uffff\1\160\1\171\1\143\1\151\1\uffff\2\44\1\uffff\1\44\1\151\2\156\1\101\1\uffff\1\155\1\141\2\44\1\156\1\151\1\171\1\44\2\141\1\163\1\156\1\44\1\145\1\44\1\164\1\157\3\uffff\1\145\1\163\1\44\1\170\1\44\1\156\2\uffff\1\44\1\143\1\101\1\uffff\1\154\1\156\1\164\1\157\1\uffff\1\162\1\170\1\156\1\141\1\uffff\1\151\1\156\1\162\1\150\1\uffff\1\151\1\uffff\1\143\1\uffff\1\164\1\170\1\165\1\143\1\141\1\154\1\164\2\151\1\162\1\157\1\101\1\44\1\151\1\157\1\145\2\151\2\145\1\156\1\157\1\171\1\163\1\166\1\164\1\156\1\170\1\uffff\1\160\1\155\1\44\2\157\2\44\1\143\1\147\1\44\1\164\1\145\1\151\1\101\1\151\1\103\1\44\1\uffff\1\156\1\155\1\uffff\1\157\1\141\1\uffff\1\145\1\171\1\uffff\1\145\1\162\1\143\1\170\1\157\1\154\1\uffff\2\44\1\155\1\156\1\124\1\101\1\156\1\163\1\165\1\151\1\155\1\141\2\uffff\1\141\1\147\1\165\1\170\1\164\1\141\1\154\1\157\1\44\1\163\1\151\1\145\1\160\2\151\1\154\1\141\1\155\1\uffff\1\163\1\156\1\44\1\154\1\157\1\141\1\122\1\162\1\44\1\151\1\44\1\uffff\1\145\1\155\1\154\1\145\1\122\1\uffff\1\146\1\uffff\2\44\1\122\1\163\1\145\1\151\2\uffff\1\145\1\164\1\163\1\145\1\163\1\162\1\164\1\162\1\164\1\151\1\162\1\44\1\162\1\143\1\151\1\uffff\1\151\1\164\2\143\1\151\2\164\1\157\2\151\1\156\2\157\1\101\2\156\1\170\2\101\1\151\2\170\1\157\2\151\1\155\2\157\1\44\2\155\1\uffff\2\44\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\170\1\171\2\157\2\165\2\151\1\154\1\141\1\170\1\164\1\146\1\157\1\145\1\156\1\uffff\1\160\1\157\1\165\1\uffff\1\162\1\151\1\156\1\162\5\uffff\1\uffff\1\172\1\146\1\uffff\1\170\1\154\1\57\2\uffff\1\164\1\163\1\164\1\146\1\uffff\1\162\1\141\2\156\1\165\1\145\2\163\1\164\1\155\1\157\1\163\3\156\1\163\1\155\1\164\3\156\1\170\1\164\1\141\1\154\1\151\1\157\1\171\1\163\1\141\1\162\1\164\1\163\1\156\1\151\1\162\1\uffff\1\145\1\157\3\156\1\uffff\1\162\1\141\1\162\1\155\1\156\1\162\1\166\1\162\6\uffff\1\154\1\uffff\1\154\1\146\1\151\1\146\5\uffff\1\151\2\145\1\146\1\165\1\154\1\147\1\155\1\157\1\162\1\143\1\152\1\151\2\141\2\164\1\146\1\154\1\147\1\144\1\141\1\164\2\145\2\147\2\114\2\164\1\151\1\165\2\157\1\156\1\145\1\155\1\164\1\154\1\165\1\141\2\143\1\146\1\145\1\156\1\163\1\143\1\141\1\143\1\155\1\156\1\147\1\145\1\144\3\145\1\123\1\146\1\151\1\146\1\154\2\146\1\164\2\156\1\146\1\143\1\156\1\141\1\154\1\145\1\156\1\143\1\151\1\157\1\147\1\123\1\151\1\172\1\162\1\151\1\145\1\156\1\145\1\154\1\162\1\151\2\162\1\164\1\122\1\145\1\156\1\170\1\145\1\156\1\170\1\145\1\151\1\156\1\145\1\155\1\164\1\171\1\143\1\155\1\162\1\141\1\143\1\123\1\162\1\145\2\151\1\172\2\145\1\154\1\164\1\151\1\163\1\145\1\123\1\172\1\151\1\162\1\146\1\143\3\146\1\151\1\146\1\154\1\146\1\171\1\164\1\144\1\146\1\164\1\147\1\162\1\145\1\164\1\171\1\145\1\146\1\151\1\156\1\164\1\156\1\157\1\uffff\1\151\1\145\1\170\1\145\1\172\1\145\1\171\1\156\1\151\1\141\1\150\1\141\1\156\2\143\1\156\2\143\1\162\1\141\1\114\2\172\1\141\1\155\1\164\1\145\1\141\1\162\2\164\1\151\1\160\1\145\1\146\1\uffff\1\144\1\160\1\172\1\151\1\156\1\151\1\164\1\143\1\uffff\1\146\1\163\1\154\1\141\1\146\1\151\4\146\1\154\1\125\1\151\1\163\1\146\1\165\1\123\1\172\1\164\1\162\1\155\1\172\1\151\1\156\1\141\1\162\1\172\1\156\1\143\1\144\1\151\1\163\1\uffff\1\172\1\123\1\147\1\143\1\154\1\172\1\156\1\147\2\154\1\147\2\154\1\156\1\154\1\151\2\uffff\1\164\1\157\1\172\1\164\1\143\1\104\1\165\1\162\1\160\1\164\1\144\1\151\1\172\1\164\1\uffff\2\157\1\164\1\172\1\141\1\151\2\145\1\154\1\151\5\146\1\154\1\164\1\170\1\156\1\141\1\172\1\146\1\162\1\143\1\141\1\162\1\145\1\156\1\uffff\1\157\1\151\1\123\1\uffff\1\143\2\164\1\165\1\uffff\1\143\1\164\1\122\1\166\1\172\1\124\1\uffff\1\143\1\124\1\123\1\126\1\uffff\1\147\1\164\2\165\1\164\2\165\2\172\1\164\1\151\1\165\1\uffff\1\162\1\164\1\141\1\162\1\165\1\164\1\111\1\122\1\145\1\uffff\1\172\1\156\1\154\1\151\1\uffff\1\154\1\145\1\172\1\170\1\141\1\146\1\151\4\146\1\154\1\162\1\141\2\151\1\154\1\157\1\163\1\145\1\uffff\1\55\1\145\1\141\1\164\1\157\1\163\1\145\1\156\2\143\1\104\1\124\1\145\1\143\4\145\1\uffff\1\145\1\141\1\145\1\157\1\143\1\141\1\145\1\150\2\163\1\150\2\163\2\uffff\1\145\1\157\1\163\1\151\1\172\1\164\1\145\1\143\1\151\1\156\1\145\1\144\1\145\1\uffff\1\141\1\157\1\166\1\141\1\144\1\165\1\163\1\uffff\1\151\1\162\1\55\1\151\3\55\1\71\1\154\1\165\1\154\1\163\1\166\1\172\1\156\1\160\1\154\1\172\1\154\1\141\1\160\1\164\1\117\1\122\1\172\1\141\1\151\1\141\1\145\1\144\1\164\1\160\1\144\1\154\1\172\1\162\1\154\1\162\1\156\1\141\1\154\2\172\2\151\1\172\2\151\1\162\1\156\1\103\1\143\1\uffff\1\141\1\144\1\164\1\157\1\163\1\154\1\122\1\163\1\154\1\147\1\145\1\162\1\172\1\156\1\163\1\166\1\122\1\146\1\143\1\141\1\164\1\145\1\uffff\1\143\1\145\1\141\1\120\1\uffff\1\141\1\120\1\145\1\162\1\146\1\157\1\145\1\uffff\1\154\1\163\1\170\1\141\1\124\1\165\1\164\1\122\1\141\1\uffff\1\155\1\141\1\155\1\164\1\154\1\165\2\uffff\2\166\1\uffff\2\166\1\141\1\120\1\157\1\172\1\120\1\104\1\165\1\156\1\164\1\141\1\145\1\151\1\172\1\171\1\172\1\122\1\145\1\uffff\1\143\3\145\1\146\1\164\1\162\1\145\1\162\1\145\1\143\1\164\1\141\4\162\1\151\1\122\1\156\1\151\1\141\1\152\1\157\1\146\1\145\1\157\1\162\1\124\1\145\1\157\1\156\1\164\1\151\1\162\1\151\1\145\1\141\5\145\1\154\1\162\1\156\1\uffff\1\162\1\141\1\162\1\102\1\141\1\164\1\154\1\147\1\uffff\1\172\1\uffff\1\145\1\154\1\164\1\156\1\172\1\163\1\146\1\151\1\146\1\165\1\104\1\156\1\163\1\160\1\164\1\151\1\164\1\157\1\122\1\157\1\164\1\143\1\145\1\151\1\143\1\146\1\162\1\157\1\156\1\172\1\162\1\156\1\145\1\141\1\154\1\156\1\155\1\164\1\151\1\156\1\122\1\156\1\170\1\162\5\172\1\123\1\157\1\143\1\157\1\164\1\145\1\157\1\156\1\151\1\141\1\156\1\145\1\uffff\1\163\1\141\1\151\1\164\1\uffff\1\164\1\151\3\146\1\162\1\141\1\164\1\141\1\164\1\172\1\157\1\141\1\160\1\145\1\160\1\171\1\164\1\163\1\164\1\145\1\151\1\122\1\151\1\157\1\uffff\1\155\1\143\1\124\1\170\1\141\1\147\1\141\1\151\2\157\1\145\1\157\1\164\1\122\5\uffff\1\143\1\160\1\145\1\160\1\141\1\124\1\170\1\143\1\157\1\164\1\141\1\163\2\164\1\157\1\151\1\162\1\55\1\151\2\55\1\145\1\164\1\151\1\154\1\172\1\uffff\1\156\1\120\1\145\1\163\1\145\1\172\1\151\1\164\1\145\1\160\2\145\1\156\1\155\1\151\1\145\1\171\1\157\1\164\1\145\1\151\1\164\1\156\1\154\1\163\1\154\1\172\1\145\1\141\1\145\1\160\1\145\1\120\1\165\1\172\1\145\1\156\1\151\2\164\1\162\1\151\1\156\1\141\1\151\1\144\2\141\1\122\1\uffff\1\163\2\162\1\164\1\162\1\141\1\uffff\1\157\2\162\1\164\1\144\1\163\1\164\1\171\1\156\2\160\1\156\1\151\1\172\1\156\1\171\1\163\1\157\1\164\1\157\1\uffff\1\163\1\154\1\162\1\164\2\162\1\160\1\uffff\1\172\1\163\1\157\3\151\1\157\1\141\1\154\1\143\1\104\1\120\1\154\1\145\1\150\1\157\1\164\1\162\1\164\1\154\1\156\1\151\1\141\1\103\1\122\1\164\1\103\1\120\1\157\1\164\1\145\2\157\1\uffff\2\172\1\150\1\147\1\162\1\147\1\164\1\141\1\164\1\124\1\164\1\157\1\154\1\uffff\1\150\1\156\1\157\1\156\1\143\1\156\1\154\1\172\1\164\1\141\1\162\1\122\1\163\1\151\1\160\1\171\1\151\1\171\1\165\1\172\1\143\2\154\1\145\1\162\1\157\1\141\1\154\2\172\1\155\1\156\2\uffff\1\151\1\171\1\151\1\171\2\162\1\171\1\141\1\171\1\160\1\145\1\151\1\163\1\156\1\147\1\164\1\163\1\172\1\uffff\1\151\1\164\1\157\1\145\1\164\1\160\1\145\1\124\1\143\1\172\1\145\1\uffff\1\164\1\101\1\141\1\154\1\151\1\156\1\162\1\157\2\uffff\1\171\1\172\1\160\1\172\1\143\1\172\1\151\1\122\1\172\1\170\1\126\1\145\1\172\1\160\1\150\1\124\1\101\1\151\1\150\1\uffff\1\157\1\141\1\160\1\163\1\162\1\172\1\162\1\165\1\164\1\uffff\1\172\1\151\1\170\1\163\1\141\2\143\1\145\1\147\1\101\1\uffff\1\172\1\170\1\uffff\1\164\1\uffff\1\143\1\145\1\uffff\1\157\1\141\1\162\1\uffff\1\111\1\151\1\145\1\170\1\157\1\151\1\156\1\120\1\145\1\164\1\151\1\uffff\1\164\1\160\1\151\1\uffff\1\157\1\151\1\163\2\164\1\145\1\156\1\171\1\170\1\156\1\uffff\2\151\1\164\1\163\1\156\1\154\1\164\1\156\1\160\1\162\1\151\1\156\1\160\1\172\3\162\1\143\1\171\1\154\1\157\1\156\1\157\3\151\1\160\1\164\1\172\1\151\1\163\2\157\1\151\1\164\1\157\1\165\1\171\1\163\1\111\1\155\1\157\2\172\1\uffff\1\157\1\164\1\151\1\164\1\172\1\145\1\156\1\172\1\155\1\146\2\157\1\164\1\172\1\uffff\1\157\1\164\1\155\1\156\1\157\1\162\1\155\1\145\1\126\1\164\1\156\1\151\1\155\2\uffff\1\160\1\171\1\143\1\151\1\uffff\2\172\1\uffff\1\172\1\151\2\156\1\101\1\uffff\1\155\1\141\2\172\1\156\1\151\1\171\1\172\2\141\1\163\1\156\1\172\1\145\1\172\1\164\1\157\3\uffff\1\145\1\163\1\172\1\170\1\172\1\156\2\uffff\1\172\1\143\1\101\1\uffff\1\154\1\156\1\164\1\157\1\uffff\1\162\1\170\1\156\1\141\1\uffff\1\151\1\156\1\162\1\150\1\uffff\1\151\1\uffff\1\143\1\uffff\1\164\1\170\1\165\1\143\1\141\1\154\1\164\2\151\1\162\1\157\1\101\1\172\1\151\1\157\1\145\2\151\2\145\1\156\1\157\1\171\1\163\1\166\1\164\1\156\1\170\1\uffff\1\160\1\155\1\172\2\157\2\172\1\143\1\147\1\172\1\164\1\145\1\151\1\101\1\151\1\103\1\172\1\uffff\1\156\1\155\1\uffff\1\157\1\141\1\uffff\1\145\1\171\1\uffff\1\145\1\162\1\143\1\170\1\157\1\154\1\uffff\2\172\1\155\1\156\1\124\1\101\1\156\1\163\1\165\1\151\1\155\1\141\2\uffff\1\141\1\147\1\165\1\170\1\164\1\141\1\154\1\157\1\172\1\163\1\151\1\145\1\160\2\151\1\154\1\141\1\155\1\uffff\1\163\1\156\1\172\1\154\1\157\1\141\1\122\1\162\1\172\1\151\1\172\1\uffff\1\145\1\155\1\154\1\145\1\122\1\uffff\1\146\1\uffff\2\172\1\122\1\163\1\145\1\151\2\uffff\1\145\1\164\1\163\1\145\1\163\1\162\1\164\1\162\1\164\1\151\1\162\1\172\1\162\1\143\1\151\1\uffff\1\151\1\164\2\143\1\151\2\164\1\157\2\151\1\156\2\157\1\101\2\156\1\170\2\101\1\151\2\170\1\157\2\151\1\155\2\157\1\172\2\155\1\uffff\2\172\2\uffff";
    static final String DFA22_acceptS =
        "\21\uffff\1\55\3\uffff\1\63\4\uffff\1\147\1\150\1\151\2\152\3\uffff\1\154\3\uffff\1\163\1\164\4\uffff\1\154\44\uffff\1\55\5\uffff\1\63\10\uffff\1\147\1\150\1\151\1\152\1\153\1\156\1\uffff\1\157\4\uffff\1\155\1\160\1\161\1\162\1\163\u009c\uffff\1\6\43\uffff\1\56\10\uffff\1\66\40\uffff\1\114\20\uffff\1\35\1\36\16\uffff\1\60\34\uffff\1\111\3\uffff\1\107\4\uffff\1\113\6\uffff\1\65\4\uffff\1\24\14\uffff\1\67\11\uffff\1\57\4\uffff\1\110\24\uffff\1\115\22\uffff\1\116\15\uffff\1\27\1\61\15\uffff\1\71\7\uffff\1\106\64\uffff\1\70\26\uffff\1\76\4\uffff\1\112\7\uffff\1\100\11\uffff\1\102\6\uffff\1\34\1\25\2\uffff\1\26\23\uffff\1\105\56\uffff\1\101\10\uffff\1\74\1\uffff\1\104\75\uffff\1\64\4\uffff\1\103\31\uffff\1\7\16\uffff\1\23\1\30\1\32\1\31\1\33\32\uffff\1\130\61\uffff\1\127\6\uffff\1\21\24\uffff\1\14\7\uffff\1\146\41\uffff\1\16\15\uffff\1\45\40\uffff\1\17\1\20\22\uffff\1\77\13\uffff\1\22\10\uffff\1\12\1\44\23\uffff\1\75\11\uffff\1\4\12\uffff\1\15\2\uffff\1\10\1\uffff\1\13\2\uffff\1\62\3\uffff\1\43\13\uffff\1\131\3\uffff\1\40\12\uffff\1\72\54\uffff\1\142\16\uffff\1\11\15\uffff\1\143\1\73\4\uffff\1\3\2\uffff\1\144\5\uffff\1\5\21\uffff\1\42\1\137\1\145\6\uffff\1\122\1\141\3\uffff\1\37\4\uffff\1\124\4\uffff\1\2\4\uffff\1\135\1\uffff\1\117\1\uffff\1\136\34\uffff\1\46\21\uffff\1\52\2\uffff\1\41\2\uffff\1\47\2\uffff\1\1\6\uffff\1\120\14\uffff\1\140\1\121\22\uffff\1\126\13\uffff\1\53\5\uffff\1\125\1\uffff\1\51\6\uffff\1\54\1\123\17\uffff\1\50\37\uffff\1\133\2\uffff\1\134\1\132";
    static final String DFA22_specialS =
        "\1\1\36\uffff\1\0\u059c\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\35\1\47\1\42\2\47\1\36\7\47\1\45\1\43\11\44\1\21\1\47\1\37\1\34\2\47\1\25\2\41\1\16\1\15\2\41\13\42\1\17\1\14\1\42\1\20\5\42\3\47\1\40\1\42\1\47\1\13\1\5\1\23\1\3\1\1\1\24\2\42\1\31\1\42\1\27\1\7\1\10\1\6\1\22\1\11\1\42\1\4\1\2\1\26\1\30\1\12\4\42\1\32\1\47\1\33\uff82\47",
            "\12\53\7\uffff\6\53\32\uffff\6\53\7\uffff\1\50\4\uffff\1\51\4\uffff\1\52",
            "\1\56\5\uffff\1\57\5\uffff\1\61\1\62\3\uffff\1\55\4\uffff\1\60",
            "\12\53\7\uffff\6\53\32\uffff\1\65\3\53\1\64\1\53\2\uffff\1\63\5\uffff\1\66",
            "\1\71\3\uffff\1\70\11\uffff\1\67",
            "\12\53\7\uffff\6\53\32\uffff\6\53\2\uffff\1\73\13\uffff\1\72",
            "\1\74\17\uffff\1\75",
            "\1\100\3\uffff\1\77\3\uffff\1\76",
            "\1\102\7\uffff\1\101",
            "\1\103\12\uffff\1\104",
            "\1\105",
            "\12\53\7\uffff\6\53\32\uffff\1\53\1\111\4\53\7\uffff\1\107\4\uffff\1\110\4\uffff\1\106",
            "\1\112\20\uffff\1\113",
            "\12\53\7\uffff\6\53\32\uffff\1\114\3\53\1\115\1\53",
            "\12\53\7\uffff\6\53\32\uffff\6\53\10\uffff\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\122",
            "\12\53\7\uffff\6\53\32\uffff\6\53\5\uffff\1\123\2\uffff\1\124",
            "\12\53\7\uffff\6\53\32\uffff\6\53\2\uffff\1\125\13\uffff\1\126",
            "",
            "\1\132\3\uffff\1\130\3\uffff\1\133\10\uffff\1\131",
            "\1\134",
            "\1\135",
            "\1\136\3\uffff\1\137",
            "",
            "",
            "",
            "",
            "",
            "\0\144",
            "\1\54\34\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\53\7\uffff\6\53\32\uffff\6\53",
            "",
            "\12\146\7\uffff\1\154\1\152\1\154\1\153\1\151\1\153\5\uffff\1\155\13\uffff\1\145\6\uffff\1\150\1\uffff\1\154\1\152\1\154\1\153\1\151\1\153\5\uffff\1\155\13\uffff\1\145",
            "\12\146\7\uffff\1\154\1\152\1\154\1\153\1\151\1\153\5\uffff\1\155\22\uffff\1\150\1\uffff\1\154\1\152\1\154\1\153\1\151\1\153\5\uffff\1\155",
            "\1\156\4\uffff\1\157",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\164\7\uffff\6\164\32\uffff\6\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\164\7\uffff\6\164\32\uffff\6\164\14\uffff\1\175",
            "\12\164\7\uffff\6\164\32\uffff\6\164\15\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0083\2\uffff\1\u0082\11\uffff\1\u0081",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008f\1\uffff\1\u008e",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\1\u0094",
            "\1\u0095\10\uffff\1\u0096",
            "\12\164\7\uffff\6\164\32\uffff\6\164\14\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\164\7\uffff\6\164\32\uffff\6\164\15\uffff\1\u009a",
            "\12\164\7\uffff\6\164\32\uffff\6\164\14\uffff\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ac\10\uffff\1\u00ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00b0\7\uffff\1\154\1\u00ae\1\154\1\u00af\1\u00ad\1\u00af\5\uffff\1\155\22\uffff\1\150\1\uffff\1\154\1\u00ae\1\154\1\u00af\1\u00ad\1\u00af\5\uffff\1\155",
            "",
            "\12\150\10\uffff\1\155\1\uffff\3\155\5\uffff\1\155\22\uffff\1\150\2\uffff\1\155\1\uffff\3\155\5\uffff\1\155",
            "\1\155\1\uffff\1\155\2\uffff\12\u00b1\7\uffff\6\154\32\uffff\6\154",
            "\12\154\7\uffff\3\154\1\u00b2\2\154\2\uffff\1\155\27\uffff\3\154\1\u00b2\2\154\2\uffff\1\155",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\u00b6\7\uffff\6\u00b6\32\uffff\6\u00b6",
            "\1\u00b8\13\uffff\1\u00b7",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c7\2\uffff\1\u00c6",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d2\3\uffff\1\u00d1\2\uffff\1\u00d0",
            "\1\u00d5\3\uffff\1\u00d4\2\uffff\1\u00d3",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\155\1\uffff\1\155\2\uffff\12\u00f5\7\uffff\6\154\32\uffff\6\154",
            "\12\154\7\uffff\3\154\1\u00f6\2\154\2\uffff\1\155\27\uffff\3\154\1\u00f6\2\154\2\uffff\1\155",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\12\u00fa\7\uffff\1\154\1\u00f8\1\154\1\u00f9\1\u00f7\1\u00f9\5\uffff\1\155\22\uffff\1\150\1\uffff\1\154\1\u00f8\1\154\1\u00f9\1\u00f7\1\u00f9\5\uffff\1\155",
            "\12\u00fb\7\uffff\1\154\1\u00f8\1\154\1\u00f9\1\154\1\u00f9\32\uffff\1\154\1\u00f8\1\154\1\u00f9\1\154\1\u00f9",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\u00ff\7\uffff\6\u00ff\32\uffff\6\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\54\13\uffff\12\54\7\uffff\2\54\1\u010c\27\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\12\u013f\7\uffff\1\154\1\u0140\1\154\1\u0141\1\154\1\u0141\32\uffff\1\154\1\u0140\1\154\1\u0141\1\154\1\u0141",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\1\155\1\uffff\1\155\2\uffff\12\u0142\7\uffff\6\154\32\uffff\6\154",
            "\12\154\7\uffff\3\154\1\u0143\2\154\2\uffff\1\155\27\uffff\3\154\1\u0143\2\154\2\uffff\1\155",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\12\u0145\7\uffff\1\154\1\u0140\1\154\1\u0141\1\u0144\1\u0141\5\uffff\1\155\22\uffff\1\150\1\uffff\1\154\1\u0140\1\154\1\u0141\1\u0144\1\u0141\5\uffff\1\155",
            "\12\u013f\7\uffff\1\154\1\u0140\1\154\1\u0141\1\154\1\u0141\32\uffff\1\154\1\u0140\1\154\1\u0141\1\154\1\u0141",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\12\u0149\7\uffff\6\u0149\32\uffff\6\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\12\u0188\7\uffff\1\154\1\u0186\1\154\1\u0187\1\154\1\u0187\32\uffff\1\154\1\u0186\1\154\1\u0187\1\154\1\u0187",
            "\12\154\7\uffff\3\154\1\u0189\2\154\2\uffff\1\155\27\uffff\3\154\1\u0189\2\154\2\uffff\1\155",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\12\u0188\7\uffff\1\154\1\u0186\1\154\1\u0187\1\154\1\u0187\32\uffff\1\154\1\u0186\1\154\1\u0187\1\154\1\u0187",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\1\155\1\uffff\1\155\2\uffff\12\u018a\7\uffff\6\154\32\uffff\6\154",
            "\12\u018c\7\uffff\1\154\1\u0186\1\154\1\u0187\1\u018b\1\u0187\5\uffff\1\155\22\uffff\1\150\1\uffff\1\154\1\u0186\1\154\1\u0187\1\u018b\1\u0187\5\uffff\1\155",
            "\1\u018e\15\uffff\1\u018d\1\uffff\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\12\u0192\7\uffff\6\u0192\32\uffff\6\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\54\13\uffff\12\54\7\uffff\3\54\1\u0195\12\54\1\u0198\1\u0196\1\54\1\u0197\10\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54\1\u01a8\26\54",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01c6",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\12\154\7\uffff\3\154\1\u01d0\2\154\2\uffff\1\155\27\uffff\3\154\1\u01d0\2\154\2\uffff\1\155",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\12\u01d3\7\uffff\1\154\1\u01d1\1\154\1\u01d2\1\154\1\u01d2\32\uffff\1\154\1\u01d1\1\154\1\u01d2\1\154\1\u01d2",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\12\u01d3\7\uffff\1\154\1\u01d1\1\154\1\u01d2\1\154\1\u01d2\32\uffff\1\154\1\u01d1\1\154\1\u01d2\1\154\1\u01d2",
            "\1\155\1\uffff\1\155\2\uffff\12\u01d4\7\uffff\6\154\32\uffff\6\154",
            "\12\u01d6\7\uffff\1\154\1\u01d1\1\154\1\u01d2\1\u01d5\1\u01d2\5\uffff\1\155\22\uffff\1\150\1\uffff\1\154\1\u01d1\1\154\1\u01d2\1\u01d5\1\u01d2\5\uffff\1\155",
            "\1\u01d8\20\uffff\1\u01d7",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\54\13\uffff\12\54\7\uffff\1\u01dd\1\54\1\u01dc\16\54\1\u01de\10\54\4\uffff\1\54\1\uffff\32\54",
            "\12\u01e0\7\uffff\6\u01e0\32\uffff\6\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01f3",
            "",
            "\1\u01f4",
            "\1\u01f6\20\uffff\1\u01f5",
            "\1\u01f7",
            "\1\u01f8",
            "",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "",
            "\1\54\13\uffff\12\54\7\uffff\3\54\1\u020e\26\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "",
            "\1\u0213",
            "\1\u0214",
            "\1\54\13\uffff\12\54\7\uffff\4\54\1\u0216\1\u0215\24\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0218",
            "\1\u0219",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\12\154\7\uffff\3\154\1\u021a\2\154\2\uffff\1\155\27\uffff\3\154\1\u021a\2\154\2\uffff\1\155",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\12\u021d\7\uffff\1\154\1\u021b\1\154\1\u021c\1\154\1\u021c\32\uffff\1\154\1\u021b\1\154\1\u021c\1\154\1\u021c",
            "\12\u021d\7\uffff\1\154\1\u021b\1\154\1\u021c\1\154\1\u021c\32\uffff\1\154\1\u021b\1\154\1\u021c\1\154\1\u021c",
            "\1\155\1\uffff\1\155\2\uffff\12\u021e\7\uffff\6\154\32\uffff\6\154",
            "\12\u0220\7\uffff\1\154\1\u021b\1\154\1\u021c\1\u021f\1\u021c\5\uffff\1\155\22\uffff\1\150\1\uffff\1\154\1\u021b\1\154\1\u021c\1\u021f\1\u021c\5\uffff\1\155",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "",
            "\1\154",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0234\7\uffff\1\u0233",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "",
            "",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "",
            "\1\u025c",
            "\1\u025d",
            "\1\154",
            "\1\154\26\uffff\1\155\4\uffff\1\155\32\uffff\1\155\4\uffff\1\155",
            "\1\154",
            "\1\154",
            "\1\154",
            "\1\155\1\uffff\1\u025e\2\uffff\12\155",
            "\1\154\2\uffff\12\150\10\uffff\1\155\1\uffff\3\155\5\uffff\1\155\22\uffff\1\150\2\uffff\1\155\1\uffff\3\155\5\uffff\1\155",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54\1\u0267\26\54",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e\16\uffff\1\u026f",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0283",
            "\1\u0284",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\54\13\uffff\12\54\7\uffff\21\54\1\u0298\10\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\12\u029e\7\uffff\6\154\32\uffff\6\154",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6\13\uffff\1\u02a7",
            "",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b4\20\uffff\1\u02b3",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b8\1\u02b9\14\uffff\1\u02b7",
            "\1\u02ba",
            "",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "",
            "",
            "\1\u02c1",
            "\1\u02c2",
            "",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02d2",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02d4",
            "\1\u02d5",
            "",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\12\u02da\7\uffff\1\154\1\u02db\1\154\1\u02dc\1\154\1\u02dc\32\uffff\1\154\1\u02db\1\154\1\u02dc\1\154\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02eb\5\uffff\1\u02ea",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f7\3\uffff\1\u02f6",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "",
            "\1\54\13\uffff\12\54\7\uffff\15\54\1\u0310\14\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0317",
            "\12\u031a\7\uffff\1\154\1\u0318\1\154\1\u0319\1\154\1\u0319\32\uffff\1\154\1\u0318\1\154\1\u0319\1\154\1\u0319",
            "\12\154\7\uffff\3\154\1\u031b\2\154\2\uffff\1\155\27\uffff\3\154\1\u031b\2\154\2\uffff\1\155",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\1\u0353",
            "",
            "\1\u0354",
            "\12\154\7\uffff\3\154\1\u0355\2\154\2\uffff\1\155\27\uffff\3\154\1\u0355\2\154\2\uffff\1\155",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\12\u0358\7\uffff\1\154\1\u0356\1\154\1\u0357\1\154\1\u0357\32\uffff\1\154\1\u0356\1\154\1\u0357\1\154\1\u0357",
            "\12\154\7\uffff\6\154\32\uffff\6\154",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "\1\u0366",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "\1\u036a",
            "\1\u036b",
            "\1\u036c",
            "",
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "",
            "",
            "",
            "",
            "",
            "\1\u037b",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\154",
            "\1\154\26\uffff\1\155\4\uffff\1\155\32\uffff\1\155\4\uffff\1\155",
            "\1\154",
            "\1\154",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\54\13\uffff\12\54\7\uffff\25\54\1\u0396\4\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "\1\u039d",
            "\1\u039e",
            "\1\u039f",
            "\1\u03a0",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03b8",
            "\1\u03b9",
            "\1\u03ba",
            "\1\u03bb",
            "\1\u03bc",
            "\1\u03bd",
            "\1\u03be",
            "\1\u03bf",
            "\1\u03c0",
            "\1\u03c1",
            "\1\u03c2",
            "",
            "\1\u03c3",
            "\1\u03c4",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c7",
            "\1\u03c8",
            "",
            "\1\u03c9",
            "\1\u03ca",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\u03cf",
            "\1\u03d0",
            "\1\u03d1",
            "\1\u03d2",
            "\1\u03d3",
            "\1\u03d4",
            "\1\u03d5",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03d7",
            "\1\u03d8",
            "\1\u03d9",
            "\1\u03da",
            "\1\u03db",
            "\1\u03dc",
            "",
            "\1\u03dd",
            "\1\u03de",
            "\1\u03df",
            "\1\u03e0",
            "\1\u03e1",
            "\1\u03e2",
            "\1\u03e3",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03e5",
            "\1\u03e6",
            "\1\u03e7",
            "\1\u03e8",
            "\1\u03e9",
            "\1\u03ea",
            "\1\u03eb",
            "\1\u03ec",
            "\1\u03ed",
            "\1\u03ee",
            "\1\u03ef",
            "\1\u03f0",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "\1\u03f5",
            "\1\u03f6",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "\1\u03fc",
            "\1\u03fd",
            "\1\u03fe",
            "\1\u03ff",
            "\1\u0400",
            "\1\u0401",
            "\1\u0402",
            "\1\u0403",
            "\1\u0404",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0407",
            "\1\u0408",
            "\1\u0409",
            "\1\u040a",
            "\1\u040b",
            "\1\u040c",
            "\1\u040d",
            "\1\u040e",
            "\1\u040f",
            "\1\u0410",
            "\1\u0411",
            "",
            "\1\u0412",
            "\1\u0413",
            "\1\u0414",
            "\1\u0415",
            "\1\u0416",
            "\1\u0417",
            "\1\u0418",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u041a",
            "\1\u041b",
            "\1\u041c",
            "\1\u041d",
            "\1\u041e",
            "\1\u041f",
            "\1\u0420",
            "\1\u0421",
            "\1\u0422",
            "\1\u0423",
            "\1\u0424",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0426",
            "\1\u0427",
            "\1\u0428",
            "\1\u0429",
            "\1\u042a",
            "\1\u042b",
            "\1\u042c",
            "\1\u042d",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0430",
            "\1\u0431",
            "",
            "",
            "\1\u0432",
            "\1\u0433",
            "\1\u0434",
            "\1\u0435",
            "\1\u0436",
            "\1\u0437",
            "\1\u0438",
            "\1\u0439",
            "\1\u043a",
            "\1\u043b",
            "\1\u043c",
            "\1\u043d",
            "\1\u043e",
            "\1\u043f",
            "\1\u0440",
            "\1\u0441",
            "\1\u0442",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0444",
            "\1\u0445",
            "\1\u0446",
            "\1\u0447",
            "\1\u0448",
            "\1\u0449",
            "\1\u044a",
            "\1\u044b",
            "\1\u044c",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u044e",
            "",
            "\1\u044f",
            "\1\u0450",
            "\1\u0451",
            "\1\u0452",
            "\1\u0453",
            "\1\u0454",
            "\1\u0455",
            "\1\u0456",
            "",
            "",
            "\1\u0457",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0459",
            "\1\54\13\uffff\12\54\7\uffff\1\u045a\31\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u045c",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u045e",
            "\1\u045f",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0461",
            "\1\u0462",
            "\1\u0463",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0465",
            "\1\u0466",
            "\1\u0467",
            "\1\u0468",
            "\1\u0469",
            "\1\u046a",
            "",
            "\1\u046b",
            "\1\u046c",
            "\1\u046d",
            "\1\u046e",
            "\1\u046f",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0471",
            "\1\u0472",
            "\1\u0473",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0475",
            "\1\u0476",
            "\1\u0477",
            "\1\u0478",
            "\1\u0479",
            "\1\u047a",
            "\1\u047b",
            "\1\u047c",
            "\1\u047d",
            "",
            "\1\54\13\uffff\12\54\7\uffff\10\54\1\u047e\21\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0480",
            "",
            "\1\u0481",
            "",
            "\1\u0482",
            "\1\u0483",
            "",
            "\1\u0484",
            "\1\u0485",
            "\1\u0486",
            "",
            "\1\u0487",
            "\1\u0488",
            "\1\u0489",
            "\1\u048a",
            "\1\u048b",
            "\1\u048c",
            "\1\u048d",
            "\1\u048e",
            "\1\u048f",
            "\1\u0490",
            "\1\u0491",
            "",
            "\1\u0492",
            "\1\u0493",
            "\1\u0494",
            "",
            "\1\u0495",
            "\1\u0496",
            "\1\u0497",
            "\1\u0498",
            "\1\u0499",
            "\1\u049a",
            "\1\u049b",
            "\1\u049c",
            "\1\u049d",
            "\1\u049e",
            "",
            "\1\u049f",
            "\1\u04a0",
            "\1\u04a1",
            "\1\u04a2",
            "\1\u04a3",
            "\1\u04a4",
            "\1\u04a5",
            "\1\u04a6",
            "\1\u04a7",
            "\1\u04a8",
            "\1\u04a9",
            "\1\u04aa",
            "\1\u04ab",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u04ad",
            "\1\u04ae",
            "\1\u04af",
            "\1\u04b0",
            "\1\u04b1",
            "\1\u04b2",
            "\1\u04b3",
            "\1\u04b4",
            "\1\u04b5",
            "\1\u04b6",
            "\1\u04b7",
            "\1\u04b8",
            "\1\u04b9",
            "\1\u04ba",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u04bc",
            "\1\u04bd",
            "\1\u04be",
            "\1\u04bf",
            "\1\u04c0",
            "\1\u04c1",
            "\1\u04c2",
            "\1\u04c3",
            "\1\u04c4",
            "\1\u04c5",
            "\1\u04c6",
            "\1\u04c7",
            "\1\u04c8",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u04cb",
            "\1\u04cc",
            "\1\u04cd",
            "\1\u04ce",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u04d0",
            "\1\u04d1",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u04d3",
            "\1\u04d4",
            "\1\u04d5",
            "\1\u04d6",
            "\1\u04d7",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u04d9",
            "\1\u04da",
            "\1\u04db",
            "\1\u04dc",
            "\1\u04dd",
            "\1\u04de",
            "\1\u04df",
            "\1\u04e0",
            "\1\u04e1",
            "\1\u04e2",
            "\1\u04e3",
            "\1\u04e4",
            "\1\u04e5",
            "",
            "",
            "\1\u04e6",
            "\1\u04e7",
            "\1\u04e8",
            "\1\u04e9",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u04ed",
            "\1\u04ee",
            "\1\u04ef",
            "\1\u04f0",
            "",
            "\1\u04f1",
            "\1\u04f2",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u04f5",
            "\1\u04f6",
            "\1\u04f7",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u04f9",
            "\1\u04fa",
            "\1\u04fb",
            "\1\u04fc",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u04fe",
            "\1\54\13\uffff\12\54\7\uffff\4\54\1\u04ff\12\54\1\u0501\4\54\1\u0500\5\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0503",
            "\1\u0504",
            "",
            "",
            "",
            "\1\u0505",
            "\1\u0506",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0508",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u050a",
            "",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u050c",
            "\1\u050d",
            "",
            "\1\u050e",
            "\1\u050f",
            "\1\u0510",
            "\1\u0511",
            "",
            "\1\u0512",
            "\1\u0513",
            "\1\u0514",
            "\1\u0515",
            "",
            "\1\u0516",
            "\1\u0517",
            "\1\u0518",
            "\1\u0519",
            "",
            "\1\u051a",
            "",
            "\1\u051b",
            "",
            "\1\u051c",
            "\1\u051d",
            "\1\u051e",
            "\1\u051f",
            "\1\u0520",
            "\1\u0521",
            "\1\u0522",
            "\1\u0523",
            "\1\u0524",
            "\1\u0525",
            "\1\u0526",
            "\1\u0527",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0529",
            "\1\u052a",
            "\1\u052b",
            "\1\u052c",
            "\1\u052d",
            "\1\u052e",
            "\1\u052f",
            "\1\u0530",
            "\1\u0531",
            "\1\u0532",
            "\1\u0533",
            "\1\u0534",
            "\1\u0535",
            "\1\u0536",
            "\1\u0537",
            "",
            "\1\u0538",
            "\1\u0539",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u053b",
            "\1\u053c",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\3\54\1\u053e\15\54\1\u053f\10\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0541",
            "\1\u0542",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0544",
            "\1\u0545",
            "\1\u0546",
            "\1\u0547",
            "\1\u0548",
            "\1\u0549",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u054b",
            "\1\u054c",
            "",
            "\1\u054d",
            "\1\u054e",
            "",
            "\1\u054f",
            "\1\u0550",
            "",
            "\1\u0551",
            "\1\u0552",
            "\1\u0553",
            "\1\u0554",
            "\1\u0555",
            "\1\u0556",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0559",
            "\1\u055a",
            "\1\u055b",
            "\1\u055c",
            "\1\u055d",
            "\1\u055e",
            "\1\u055f",
            "\1\u0560",
            "\1\u0561",
            "\1\u0562",
            "",
            "",
            "\1\u0563",
            "\1\u0564",
            "\1\u0565",
            "\1\u0566",
            "\1\u0567",
            "\1\u0568",
            "\1\u0569",
            "\1\u056a",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u056c",
            "\1\u056d",
            "\1\u056e",
            "\1\u056f",
            "\1\u0570",
            "\1\u0571",
            "\1\u0572",
            "\1\u0573",
            "\1\u0574",
            "",
            "\1\u0575",
            "\1\u0576",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0578",
            "\1\u0579",
            "\1\u057a",
            "\1\u057b",
            "\1\u057c",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u057e",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0580",
            "\1\u0581",
            "\1\u0582",
            "\1\u0583",
            "\1\u0584",
            "",
            "\1\u0585",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0588",
            "\1\u0589",
            "\1\u058a",
            "\1\u058b",
            "",
            "",
            "\1\u058c",
            "\1\u058d",
            "\1\u058e",
            "\1\u058f",
            "\1\u0590",
            "\1\u0591",
            "\1\u0592",
            "\1\u0593",
            "\1\u0594",
            "\1\u0595",
            "\1\u0596",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0598",
            "\1\u0599",
            "\1\u059a",
            "",
            "\1\u059b",
            "\1\u059c",
            "\1\u059d",
            "\1\u059e",
            "\1\u059f",
            "\1\u05a0",
            "\1\u05a1",
            "\1\u05a2",
            "\1\u05a3",
            "\1\u05a4",
            "\1\u05a5",
            "\1\u05a6",
            "\1\u05a7",
            "\1\u05a8",
            "\1\u05a9",
            "\1\u05aa",
            "\1\u05ab",
            "\1\u05ac",
            "\1\u05ad",
            "\1\u05ae",
            "\1\u05af",
            "\1\u05b0",
            "\1\u05b1",
            "\1\u05b2",
            "\1\u05b3",
            "\1\u05b4",
            "\1\u05b5",
            "\1\u05b6",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u05b8",
            "\1\u05b9",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | RULE_ANNOTATION_PROPERTY_TOKEN | RULE_ANNOTATION_TOKEN | RULE_TERMINOLOGY_GRAPH_TOKEN | RULE_BUNDLE_TOKEN | RULE_KIND_TOKEN | RULE_ASPECT_TOKEN | RULE_ABSTRACT_TOKEN | RULE_CONCEPT_TOKEN | RULE_REIFIED_RELATIONSHIP_TOKEN | RULE_UNREIFIED_RELATIONSHIP_TOKEN | RULE_FUNCTIONAL_TOKEN | RULE_INVERSE_FUNCTIONAL_TOKEN | RULE_ESSENTIAL_TOKEN | RULE_INVERSE_ESSENTIAL_TOKEN | RULE_SYMMETRIC_TOKEN | RULE_ASYMMETRIC_TOKEN | RULE_REFLEXIVE_TOKEN | RULE_IRREFLEXIVE_TOKEN | RULE_TRANSITIVE_TOKEN | RULE_UNREIFIED_TOKEN | RULE_INVERSE_TOKEN | RULE_SOURCE_TOKEN | RULE_TARGET_TOKEN | RULE_SCALAR_TOKEN | RULE_STRUCTURE_TOKEN | RULE_DOMAIN_TOKEN | RULE_RANGE_TOKEN | RULE_EXTENDS_TOKEN | RULE_REFINES_TOKEN | RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN | RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN | RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN | RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN | RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN | RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN | RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN | RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN | RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN | RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN | RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN | RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN | RULE_STRING_SCALAR_RESTRICTION_TOKEN | RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN | RULE_BINARY_SCALAR_RESTRICTION_TOKEN | RULE_IRI_SCALAR_RESTRICTION_TOKEN | RULE_TIME_SCALAR_RESTRICTION_TOKEN | RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN | RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN | RULE_DESCRIPTION_BOX_TOKEN | RULE_LCURLY | RULE_RCURLY | RULE_EQUAL | RULE_STRING | RULE_IRI | RULE_ID | RULE_UUID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_31 = input.LA(1);

                        s = -1;
                        if ( ((LA22_31>='\u0000' && LA22_31<='\uFFFF')) ) {s = 100;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='e') ) {s = 1;}

                        else if ( (LA22_0=='s') ) {s = 2;}

                        else if ( (LA22_0=='d') ) {s = 3;}

                        else if ( (LA22_0=='r') ) {s = 4;}

                        else if ( (LA22_0=='b') ) {s = 5;}

                        else if ( (LA22_0=='n') ) {s = 6;}

                        else if ( (LA22_0=='l') ) {s = 7;}

                        else if ( (LA22_0=='m') ) {s = 8;}

                        else if ( (LA22_0=='p') ) {s = 9;}

                        else if ( (LA22_0=='v') ) {s = 10;}

                        else if ( (LA22_0=='a') ) {s = 11;}

                        else if ( (LA22_0=='S') ) {s = 12;}

                        else if ( (LA22_0=='D') ) {s = 13;}

                        else if ( (LA22_0=='C') ) {s = 14;}

                        else if ( (LA22_0=='R') ) {s = 15;}

                        else if ( (LA22_0=='U') ) {s = 16;}

                        else if ( (LA22_0==':') ) {s = 17;}

                        else if ( (LA22_0=='o') ) {s = 18;}

                        else if ( (LA22_0=='c') ) {s = 19;}

                        else if ( (LA22_0=='f') ) {s = 20;}

                        else if ( (LA22_0=='@') ) {s = 21;}

                        else if ( (LA22_0=='t') ) {s = 22;}

                        else if ( (LA22_0=='k') ) {s = 23;}

                        else if ( (LA22_0=='u') ) {s = 24;}

                        else if ( (LA22_0=='i') ) {s = 25;}

                        else if ( (LA22_0=='{') ) {s = 26;}

                        else if ( (LA22_0=='}') ) {s = 27;}

                        else if ( (LA22_0=='=') ) {s = 28;}

                        else if ( (LA22_0=='\"') ) {s = 29;}

                        else if ( (LA22_0=='\'') ) {s = 30;}

                        else if ( (LA22_0=='<') ) {s = 31;}

                        else if ( (LA22_0=='^') ) {s = 32;}

                        else if ( ((LA22_0>='A' && LA22_0<='B')||(LA22_0>='E' && LA22_0<='F')) ) {s = 33;}

                        else if ( (LA22_0=='$'||(LA22_0>='G' && LA22_0<='Q')||LA22_0=='T'||(LA22_0>='V' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='g' && LA22_0<='h')||LA22_0=='j'||LA22_0=='q'||(LA22_0>='w' && LA22_0<='z')) ) {s = 34;}

                        else if ( (LA22_0=='0') ) {s = 35;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 36;}

                        else if ( (LA22_0=='/') ) {s = 37;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 38;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||LA22_0=='#'||(LA22_0>='%' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='.')||LA22_0==';'||(LA22_0>='>' && LA22_0<='?')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}