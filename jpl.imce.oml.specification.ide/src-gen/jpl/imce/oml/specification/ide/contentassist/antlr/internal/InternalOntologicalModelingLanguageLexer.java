package jpl.imce.oml.specification.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologicalModelingLanguageLexer extends Lexer {
    public static final int RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN=29;
    public static final int RULE_HEX=67;
    public static final int RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN=44;
    public static final int RULE_LCURLY=10;
    public static final int RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN=42;
    public static final int RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN=32;
    public static final int RULE_REFLEXIVE_TOKEN=57;
    public static final int RULE_ID=4;
    public static final int RULE_EQUAL=7;
    public static final int RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN=28;
    public static final int RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN=47;
    public static final int RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN=39;
    public static final int RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN=35;
    public static final int RULE_TRANSITIVE_TOKEN=59;
    public static final int RULE_FUNCTIONAL_TOKEN=51;
    public static final int RULE_ABSTRACT_TOKEN=50;
    public static final int RULE_UUID=65;
    public static final int RULE_INT=60;
    public static final int RULE_ML_COMMENT=69;
    public static final int RULE_REIFIED_RELATIONSHIP_TOKEN=15;
    public static final int RULE_INVERSE_TOKEN=19;
    public static final int RULE_CONCEPT_TOKEN=14;
    public static final int RULE_IRI=5;
    public static final int RULE_BUNDLE_TOKEN=12;
    public static final int RULE_TARGET_TOKEN=18;
    public static final int RULE_TERMINOLOGY_GRAPH_TOKEN=9;
    public static final int RULE_INVERSE_FUNCTIONAL_TOKEN=52;
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
    public static final int RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN=31;
    public static final int RULE_HEX_12DIGITS=64;
    public static final int RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN=38;
    public static final int RULE_STRUCTURE_TOKEN=22;
    public static final int T__99=99;
    public static final int RULE_BINARY_SCALAR_RESTRICTION_TOKEN=40;
    public static final int RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN=36;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN=45;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_ANNOTATION_TOKEN=8;
    public static final int RULE_SOURCE_TOKEN=17;
    public static final int RULE_UNREIFIED_RELATIONSHIP_TOKEN=20;
    public static final int RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN=26;
    public static final int RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN=34;
    public static final int RULE_TIME_SCALAR_RESTRICTION_TOKEN=48;
    public static final int RULE_KIND_TOKEN=61;
    public static final int RULE_DECIMAL=68;
    public static final int RULE_SCALAR_TOKEN=21;
    public static final int RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN=43;
    public static final int RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN=37;
    public static final int RULE_IRI_SCALAR_RESTRICTION_TOKEN=41;
    public static final int RULE_RANGE_TOKEN=24;
    public static final int RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN=30;
    public static final int RULE_UNREIFIED_TOKEN=16;
    public static final int RULE_STRING=49;
    public static final int RULE_STRING_SCALAR_RESTRICTION_TOKEN=46;
    public static final int RULE_SL_COMMENT=70;
    public static final int RULE_INVERSE_ESSENTIAL_TOKEN=54;
    public static final int RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN=33;
    public static final int RULE_ANNOTATION_PROPERTY_TOKEN=6;
    public static final int RULE_SYMMETRIC_TOKEN=55;
    public static final int T__77=77;
    public static final int RULE_DOMAIN_TOKEN=23;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int RULE_HEX_4DIGITS=63;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN=27;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_IRREFLEXIVE_TOKEN=58;
    public static final int RULE_RCURLY=11;
    public static final int RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN=25;
    public static final int RULE_WS=71;
    public static final int RULE_ANY_OTHER=72;
    public static final int RULE_ASPECT_TOKEN=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int RULE_ESSENTIAL_TOKEN=53;
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
    public static final int RULE_ASYMMETRIC_TOKEN=56;

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

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:11:7: ( 'open' )
            // InternalOntologicalModelingLanguage.g:11:9: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:12:7: ( 'closed' )
            // InternalOntologicalModelingLanguage.g:12:9: 'closed'
            {
            match("closed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:13:7: ( 'entityStructuredDataProperty' )
            // InternalOntologicalModelingLanguage.g:13:9: 'entityStructuredDataProperty'
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
            // InternalOntologicalModelingLanguage.g:14:7: ( 'entityScalarDataProperty' )
            // InternalOntologicalModelingLanguage.g:14:9: 'entityScalarDataProperty'
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
            // InternalOntologicalModelingLanguage.g:15:7: ( 'structuredDataProperty' )
            // InternalOntologicalModelingLanguage.g:15:9: 'structuredDataProperty'
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
            // InternalOntologicalModelingLanguage.g:16:7: ( 'scalarDataProperty' )
            // InternalOntologicalModelingLanguage.g:16:9: 'scalarDataProperty'
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
            // InternalOntologicalModelingLanguage.g:17:7: ( 'disjointTaxonomyParent' )
            // InternalOntologicalModelingLanguage.g:17:9: 'disjointTaxonomyParent'
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
            // InternalOntologicalModelingLanguage.g:18:7: ( 'root' )
            // InternalOntologicalModelingLanguage.g:18:9: 'root'
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
            // InternalOntologicalModelingLanguage.g:19:7: ( 'disjointLeaf' )
            // InternalOntologicalModelingLanguage.g:19:9: 'disjointLeaf'
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
            // InternalOntologicalModelingLanguage.g:20:7: ( 'bundledTerminology' )
            // InternalOntologicalModelingLanguage.g:20:9: 'bundledTerminology'
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
            // InternalOntologicalModelingLanguage.g:21:7: ( 'designatedTerminology' )
            // InternalOntologicalModelingLanguage.g:21:9: 'designatedTerminology'
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
            // InternalOntologicalModelingLanguage.g:22:7: ( 'designatedConcept' )
            // InternalOntologicalModelingLanguage.g:22:9: 'designatedConcept'
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
            // InternalOntologicalModelingLanguage.g:23:7: ( 'nestingTerminology' )
            // InternalOntologicalModelingLanguage.g:23:9: 'nestingTerminology'
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
            // InternalOntologicalModelingLanguage.g:24:7: ( 'nestingContext' )
            // InternalOntologicalModelingLanguage.g:24:9: 'nestingContext'
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
            // InternalOntologicalModelingLanguage.g:25:7: ( 'restrictedRelation' )
            // InternalOntologicalModelingLanguage.g:25:9: 'restrictedRelation'
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
            // InternalOntologicalModelingLanguage.g:26:7: ( 'restrictedRange' )
            // InternalOntologicalModelingLanguage.g:26:9: 'restrictedRange'
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
            // InternalOntologicalModelingLanguage.g:27:7: ( 'restrictedDomain' )
            // InternalOntologicalModelingLanguage.g:27:9: 'restrictedDomain'
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
            // InternalOntologicalModelingLanguage.g:28:7: ( 'subConcept' )
            // InternalOntologicalModelingLanguage.g:28:9: 'subConcept'
            {
            match("subConcept"); 


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
            // InternalOntologicalModelingLanguage.g:29:7: ( 'superConcept' )
            // InternalOntologicalModelingLanguage.g:29:9: 'superConcept'
            {
            match("superConcept"); 


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
            // InternalOntologicalModelingLanguage.g:30:7: ( 'subRelationship' )
            // InternalOntologicalModelingLanguage.g:30:9: 'subRelationship'
            {
            match("subRelationship"); 


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
            // InternalOntologicalModelingLanguage.g:31:7: ( 'superRelationship' )
            // InternalOntologicalModelingLanguage.g:31:9: 'superRelationship'
            {
            match("superRelationship"); 


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
            // InternalOntologicalModelingLanguage.g:32:7: ( 'restrictedEntity' )
            // InternalOntologicalModelingLanguage.g:32:9: 'restrictedEntity'
            {
            match("restrictedEntity"); 


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
            // InternalOntologicalModelingLanguage.g:33:7: ( 'scalarProperty' )
            // InternalOntologicalModelingLanguage.g:33:9: 'scalarProperty'
            {
            match("scalarProperty"); 


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
            // InternalOntologicalModelingLanguage.g:34:7: ( 'scalarRestriction' )
            // InternalOntologicalModelingLanguage.g:34:9: 'scalarRestriction'
            {
            match("scalarRestriction"); 


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
            // InternalOntologicalModelingLanguage.g:35:7: ( 'literalValue' )
            // InternalOntologicalModelingLanguage.g:35:9: 'literalValue'
            {
            match("literalValue"); 


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
            // InternalOntologicalModelingLanguage.g:36:7: ( 'length' )
            // InternalOntologicalModelingLanguage.g:36:9: 'length'
            {
            match("length"); 


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
            // InternalOntologicalModelingLanguage.g:37:7: ( 'minLength' )
            // InternalOntologicalModelingLanguage.g:37:9: 'minLength'
            {
            match("minLength"); 


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
            // InternalOntologicalModelingLanguage.g:38:8: ( 'maxLength' )
            // InternalOntologicalModelingLanguage.g:38:10: 'maxLength'
            {
            match("maxLength"); 


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
            // InternalOntologicalModelingLanguage.g:39:8: ( 'pattern' )
            // InternalOntologicalModelingLanguage.g:39:10: 'pattern'
            {
            match("pattern"); 


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
            // InternalOntologicalModelingLanguage.g:40:8: ( 'minInclusive' )
            // InternalOntologicalModelingLanguage.g:40:10: 'minInclusive'
            {
            match("minInclusive"); 


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
            // InternalOntologicalModelingLanguage.g:41:8: ( 'maxInclusive' )
            // InternalOntologicalModelingLanguage.g:41:10: 'maxInclusive'
            {
            match("maxInclusive"); 


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
            // InternalOntologicalModelingLanguage.g:42:8: ( 'minExclusive' )
            // InternalOntologicalModelingLanguage.g:42:10: 'minExclusive'
            {
            match("minExclusive"); 


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
            // InternalOntologicalModelingLanguage.g:43:8: ( 'maxExclusive' )
            // InternalOntologicalModelingLanguage.g:43:10: 'maxExclusive'
            {
            match("maxExclusive"); 


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
            // InternalOntologicalModelingLanguage.g:44:8: ( 'language' )
            // InternalOntologicalModelingLanguage.g:44:10: 'language'
            {
            match("language"); 


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
            // InternalOntologicalModelingLanguage.g:45:8: ( 'value' )
            // InternalOntologicalModelingLanguage.g:45:10: 'value'
            {
            match("value"); 


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
            // InternalOntologicalModelingLanguage.g:46:8: ( 'axiom' )
            // InternalOntologicalModelingLanguage.g:46:10: 'axiom'
            {
            match("axiom"); 


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
            // InternalOntologicalModelingLanguage.g:47:8: ( ':' )
            // InternalOntologicalModelingLanguage.g:47:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "RULE_ANNOTATION_PROPERTY_TOKEN"
    public final void mRULE_ANNOTATION_PROPERTY_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ANNOTATION_PROPERTY_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:13545:32: ( 'annotationProperty' )
            // InternalOntologicalModelingLanguage.g:13545:34: 'annotationProperty'
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
            // InternalOntologicalModelingLanguage.g:13547:23: ( '@' )
            // InternalOntologicalModelingLanguage.g:13547:25: '@'
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
            // InternalOntologicalModelingLanguage.g:13549:30: ( 'terminology' )
            // InternalOntologicalModelingLanguage.g:13549:32: 'terminology'
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
            // InternalOntologicalModelingLanguage.g:13551:19: ( 'bundle' )
            // InternalOntologicalModelingLanguage.g:13551:21: 'bundle'
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
            // InternalOntologicalModelingLanguage.g:13553:17: ( 'kind' )
            // InternalOntologicalModelingLanguage.g:13553:19: 'kind'
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
            // InternalOntologicalModelingLanguage.g:13555:19: ( 'aspect' )
            // InternalOntologicalModelingLanguage.g:13555:21: 'aspect'
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
            // InternalOntologicalModelingLanguage.g:13557:21: ( 'abstract' )
            // InternalOntologicalModelingLanguage.g:13557:23: 'abstract'
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
            // InternalOntologicalModelingLanguage.g:13559:20: ( 'concept' )
            // InternalOntologicalModelingLanguage.g:13559:22: 'concept'
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
            // InternalOntologicalModelingLanguage.g:13561:33: ( 'reifiedRelationship' )
            // InternalOntologicalModelingLanguage.g:13561:35: 'reifiedRelationship'
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
            // InternalOntologicalModelingLanguage.g:13563:35: ( 'unreifiedRelationship' )
            // InternalOntologicalModelingLanguage.g:13563:37: 'unreifiedRelationship'
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
            // InternalOntologicalModelingLanguage.g:13565:23: ( 'functional' )
            // InternalOntologicalModelingLanguage.g:13565:25: 'functional'
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
            // InternalOntologicalModelingLanguage.g:13567:31: ( 'inverseFunctional' )
            // InternalOntologicalModelingLanguage.g:13567:33: 'inverseFunctional'
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
            // InternalOntologicalModelingLanguage.g:13569:22: ( 'essential' )
            // InternalOntologicalModelingLanguage.g:13569:24: 'essential'
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
            // InternalOntologicalModelingLanguage.g:13571:30: ( 'inverseEssential' )
            // InternalOntologicalModelingLanguage.g:13571:32: 'inverseEssential'
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
            // InternalOntologicalModelingLanguage.g:13573:22: ( 'symmetric' )
            // InternalOntologicalModelingLanguage.g:13573:24: 'symmetric'
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
            // InternalOntologicalModelingLanguage.g:13575:23: ( 'asymmetric' )
            // InternalOntologicalModelingLanguage.g:13575:25: 'asymmetric'
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
            // InternalOntologicalModelingLanguage.g:13577:22: ( 'reflexive' )
            // InternalOntologicalModelingLanguage.g:13577:24: 'reflexive'
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
            // InternalOntologicalModelingLanguage.g:13579:24: ( 'irreflexive' )
            // InternalOntologicalModelingLanguage.g:13579:26: 'irreflexive'
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
            // InternalOntologicalModelingLanguage.g:13581:23: ( 'transitive' )
            // InternalOntologicalModelingLanguage.g:13581:25: 'transitive'
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
            // InternalOntologicalModelingLanguage.g:13583:22: ( 'unreified' )
            // InternalOntologicalModelingLanguage.g:13583:24: 'unreified'
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
            // InternalOntologicalModelingLanguage.g:13585:20: ( 'inverse' )
            // InternalOntologicalModelingLanguage.g:13585:22: 'inverse'
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
            // InternalOntologicalModelingLanguage.g:13587:19: ( 'source' )
            // InternalOntologicalModelingLanguage.g:13587:21: 'source'
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
            // InternalOntologicalModelingLanguage.g:13589:19: ( 'target' )
            // InternalOntologicalModelingLanguage.g:13589:21: 'target'
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
            // InternalOntologicalModelingLanguage.g:13591:19: ( 'scalar' )
            // InternalOntologicalModelingLanguage.g:13591:21: 'scalar'
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
            // InternalOntologicalModelingLanguage.g:13593:22: ( 'structure' )
            // InternalOntologicalModelingLanguage.g:13593:24: 'structure'
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
            // InternalOntologicalModelingLanguage.g:13595:19: ( 'domain' )
            // InternalOntologicalModelingLanguage.g:13595:21: 'domain'
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
            // InternalOntologicalModelingLanguage.g:13597:18: ( 'range' )
            // InternalOntologicalModelingLanguage.g:13597:20: 'range'
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

    // $ANTLR start "RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN"
    public final void mRULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:13599:40: ( 'rootConceptTaxonomyAxiom' )
            // InternalOntologicalModelingLanguage.g:13599:42: 'rootConceptTaxonomyAxiom'
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
            // InternalOntologicalModelingLanguage.g:13601:44: ( 'specificDisjointConceptAxiom' )
            // InternalOntologicalModelingLanguage.g:13601:46: 'specificDisjointConceptAxiom'
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
            // InternalOntologicalModelingLanguage.g:13603:45: ( 'anonymousConceptTaxonomyAxiom' )
            // InternalOntologicalModelingLanguage.g:13603:47: 'anonymousConceptTaxonomyAxiom'
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
            // InternalOntologicalModelingLanguage.g:13605:38: ( 'bundledTerminologyAxiom' )
            // InternalOntologicalModelingLanguage.g:13605:40: 'bundledTerminologyAxiom'
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
            // InternalOntologicalModelingLanguage.g:13607:50: ( 'conceptDesignationTerminologyAxiom' )
            // InternalOntologicalModelingLanguage.g:13607:52: 'conceptDesignationTerminologyAxiom'
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
            // InternalOntologicalModelingLanguage.g:13609:38: ( 'terminologyNestingAxiom' )
            // InternalOntologicalModelingLanguage.g:13609:40: 'terminologyNestingAxiom'
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

    // $ANTLR start "RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN"
    public final void mRULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:13611:40: ( 'extends' )
            // InternalOntologicalModelingLanguage.g:13611:42: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN"

    // $ANTLR start "RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN"
    public final void mRULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:13613:49: ( 'entityExistentialRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:13613:51: 'entityExistentialRestrictionAxiom'
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
            // InternalOntologicalModelingLanguage.g:13615:47: ( 'entityUniversalRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:13615:49: 'entityUniversalRestrictionAxiom'
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
            // InternalOntologicalModelingLanguage.g:13617:41: ( 'conceptSpecializationAxiom' )
            // InternalOntologicalModelingLanguage.g:13617:43: 'conceptSpecializationAxiom'
            {
            match("conceptSpecializationAxiom"); 


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
            // InternalOntologicalModelingLanguage.g:13619:40: ( 'extendsAspect' )
            // InternalOntologicalModelingLanguage.g:13619:42: 'extendsAspect'
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
            // InternalOntologicalModelingLanguage.g:13621:54: ( 'reifiedRelationshipSpecializationAxiom' )
            // InternalOntologicalModelingLanguage.g:13621:56: 'reifiedRelationshipSpecializationAxiom'
            {
            match("reifiedRelationshipSpecializationAxiom"); 


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
            // InternalOntologicalModelingLanguage.g:13623:70: ( 'entityScalarDataPropertyExistentialRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:13623:72: 'entityScalarDataPropertyExistentialRestrictionAxiom'
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
            // InternalOntologicalModelingLanguage.g:13625:68: ( 'entityScalarDataPropertyUniversalRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:13625:70: 'entityScalarDataPropertyUniversalRestrictionAxiom'
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
            // InternalOntologicalModelingLanguage.g:13627:69: ( 'entityScalarDataPropertyParticularRestrictionAxiom' )
            // InternalOntologicalModelingLanguage.g:13627:71: 'entityScalarDataPropertyParticularRestrictionAxiom'
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
            // InternalOntologicalModelingLanguage.g:13629:39: ( 'synonymScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:13629:41: 'synonymScalarRestriction'
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
            // InternalOntologicalModelingLanguage.g:13631:39: ( 'numericScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:13631:41: 'numericScalarRestriction'
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
            // InternalOntologicalModelingLanguage.g:13633:38: ( 'stringScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:13633:40: 'stringScalarRestriction'
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
            // InternalOntologicalModelingLanguage.g:13635:45: ( 'plainLiteralScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:13635:47: 'plainLiteralScalarRestriction'
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
            // InternalOntologicalModelingLanguage.g:13637:38: ( 'binaryScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:13637:40: 'binaryScalarRestriction'
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
            // InternalOntologicalModelingLanguage.g:13639:35: ( 'iriScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:13639:37: 'iriScalarRestriction'
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
            // InternalOntologicalModelingLanguage.g:13641:36: ( 'timeScalarRestriction' )
            // InternalOntologicalModelingLanguage.g:13641:38: 'timeScalarRestriction'
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
            // InternalOntologicalModelingLanguage.g:13643:38: ( 'scalarOneOfRestriction' )
            // InternalOntologicalModelingLanguage.g:13643:40: 'scalarOneOfRestriction'
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
            // InternalOntologicalModelingLanguage.g:13645:40: ( 'scalarOneOfLiteralAxiom' )
            // InternalOntologicalModelingLanguage.g:13645:42: 'scalarOneOfLiteralAxiom'
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

    // $ANTLR start "RULE_LCURLY"
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntologicalModelingLanguage.g:13647:13: ( '{' )
            // InternalOntologicalModelingLanguage.g:13647:15: '{'
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
            // InternalOntologicalModelingLanguage.g:13649:13: ( '}' )
            // InternalOntologicalModelingLanguage.g:13649:15: '}'
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
            // InternalOntologicalModelingLanguage.g:13651:12: ( '=' )
            // InternalOntologicalModelingLanguage.g:13651:14: '='
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
            // InternalOntologicalModelingLanguage.g:13653:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalOntologicalModelingLanguage.g:13653:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalOntologicalModelingLanguage.g:13653:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
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
                    // InternalOntologicalModelingLanguage.g:13653:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalOntologicalModelingLanguage.g:13653:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalOntologicalModelingLanguage.g:13653:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntologicalModelingLanguage.g:13653:28: ~ ( ( '\\\\' | '\"' ) )
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

                    // InternalOntologicalModelingLanguage.g:13653:44: ( '\"' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\"') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalOntologicalModelingLanguage.g:13653:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:13653:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalOntologicalModelingLanguage.g:13653:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalOntologicalModelingLanguage.g:13653:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntologicalModelingLanguage.g:13653:62: ~ ( ( '\\\\' | '\\'' ) )
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

                    // InternalOntologicalModelingLanguage.g:13653:79: ( '\\'' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\'') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalOntologicalModelingLanguage.g:13653:79: '\\''
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
            // InternalOntologicalModelingLanguage.g:13655:10: ( '<' (~ ( '>' ) )* '>' )
            // InternalOntologicalModelingLanguage.g:13655:12: '<' (~ ( '>' ) )* '>'
            {
            match('<'); 
            // InternalOntologicalModelingLanguage.g:13655:16: (~ ( '>' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='=')||(LA6_0>='?' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:13655:16: ~ ( '>' )
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
            // InternalOntologicalModelingLanguage.g:13657:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalOntologicalModelingLanguage.g:13657:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalOntologicalModelingLanguage.g:13657:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:13657:11: '^'
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

            // InternalOntologicalModelingLanguage.g:13657:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
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
            // InternalOntologicalModelingLanguage.g:13659:11: ( RULE_HEX_8DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_12DIGITS )
            // InternalOntologicalModelingLanguage.g:13659:13: RULE_HEX_8DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_12DIGITS
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
            // InternalOntologicalModelingLanguage.g:13661:28: ( RULE_HEX_8DIGITS RULE_HEX_4DIGITS )
            // InternalOntologicalModelingLanguage.g:13661:30: RULE_HEX_8DIGITS RULE_HEX_4DIGITS
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
            // InternalOntologicalModelingLanguage.g:13663:27: ( RULE_HEX_4DIGITS RULE_HEX_4DIGITS )
            // InternalOntologicalModelingLanguage.g:13663:29: RULE_HEX_4DIGITS RULE_HEX_4DIGITS
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
            // InternalOntologicalModelingLanguage.g:13665:27: ( RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalOntologicalModelingLanguage.g:13665:29: RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalOntologicalModelingLanguage.g:13667:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalOntologicalModelingLanguage.g:13667:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // InternalOntologicalModelingLanguage.g:13669:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalOntologicalModelingLanguage.g:13669:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalOntologicalModelingLanguage.g:13669:12: ( '0x' | '0X' )
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
                    // InternalOntologicalModelingLanguage.g:13669:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalOntologicalModelingLanguage.g:13669:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalOntologicalModelingLanguage.g:13669:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
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

            // InternalOntologicalModelingLanguage.g:13669:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='#') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:13669:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalOntologicalModelingLanguage.g:13669:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
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
                            // InternalOntologicalModelingLanguage.g:13669:64: ( 'b' | 'B' ) ( 'i' | 'I' )
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
                            // InternalOntologicalModelingLanguage.g:13669:84: ( 'l' | 'L' )
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
            // InternalOntologicalModelingLanguage.g:13671:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalOntologicalModelingLanguage.g:13671:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalOntologicalModelingLanguage.g:13671:21: ( '0' .. '9' | '_' )*
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
            // InternalOntologicalModelingLanguage.g:13673:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalOntologicalModelingLanguage.g:13673:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalOntologicalModelingLanguage.g:13673:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='E'||LA15_0=='e') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:13673:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalOntologicalModelingLanguage.g:13673:36: ( '+' | '-' )?
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

            // InternalOntologicalModelingLanguage.g:13673:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
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
                    // InternalOntologicalModelingLanguage.g:13673:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
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
                    // InternalOntologicalModelingLanguage.g:13673:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
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
            // InternalOntologicalModelingLanguage.g:13675:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOntologicalModelingLanguage.g:13675:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOntologicalModelingLanguage.g:13675:24: ( options {greedy=false; } : . )*
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
            	    // InternalOntologicalModelingLanguage.g:13675:52: .
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
            // InternalOntologicalModelingLanguage.g:13677:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOntologicalModelingLanguage.g:13677:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOntologicalModelingLanguage.g:13677:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOntologicalModelingLanguage.g:13677:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalOntologicalModelingLanguage.g:13677:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntologicalModelingLanguage.g:13677:41: ( '\\r' )? '\\n'
                    {
                    // InternalOntologicalModelingLanguage.g:13677:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalOntologicalModelingLanguage.g:13677:41: '\\r'
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
            // InternalOntologicalModelingLanguage.g:13679:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOntologicalModelingLanguage.g:13679:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOntologicalModelingLanguage.g:13679:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalOntologicalModelingLanguage.g:13681:16: ( . )
            // InternalOntologicalModelingLanguage.g:13681:18: .
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
        // InternalOntologicalModelingLanguage.g:1:8: ( T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | RULE_ANNOTATION_PROPERTY_TOKEN | RULE_ANNOTATION_TOKEN | RULE_TERMINOLOGY_GRAPH_TOKEN | RULE_BUNDLE_TOKEN | RULE_KIND_TOKEN | RULE_ASPECT_TOKEN | RULE_ABSTRACT_TOKEN | RULE_CONCEPT_TOKEN | RULE_REIFIED_RELATIONSHIP_TOKEN | RULE_UNREIFIED_RELATIONSHIP_TOKEN | RULE_FUNCTIONAL_TOKEN | RULE_INVERSE_FUNCTIONAL_TOKEN | RULE_ESSENTIAL_TOKEN | RULE_INVERSE_ESSENTIAL_TOKEN | RULE_SYMMETRIC_TOKEN | RULE_ASYMMETRIC_TOKEN | RULE_REFLEXIVE_TOKEN | RULE_IRREFLEXIVE_TOKEN | RULE_TRANSITIVE_TOKEN | RULE_UNREIFIED_TOKEN | RULE_INVERSE_TOKEN | RULE_SOURCE_TOKEN | RULE_TARGET_TOKEN | RULE_SCALAR_TOKEN | RULE_STRUCTURE_TOKEN | RULE_DOMAIN_TOKEN | RULE_RANGE_TOKEN | RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN | RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN | RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN | RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN | RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN | RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN | RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN | RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN | RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN | RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN | RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN | RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN | RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN | RULE_STRING_SCALAR_RESTRICTION_TOKEN | RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN | RULE_BINARY_SCALAR_RESTRICTION_TOKEN | RULE_IRI_SCALAR_RESTRICTION_TOKEN | RULE_TIME_SCALAR_RESTRICTION_TOKEN | RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN | RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN | RULE_LCURLY | RULE_RCURLY | RULE_EQUAL | RULE_STRING | RULE_IRI | RULE_ID | RULE_UUID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=102;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalOntologicalModelingLanguage.g:1:10: T__73
                {
                mT__73(); 

                }
                break;
            case 2 :
                // InternalOntologicalModelingLanguage.g:1:16: T__74
                {
                mT__74(); 

                }
                break;
            case 3 :
                // InternalOntologicalModelingLanguage.g:1:22: T__75
                {
                mT__75(); 

                }
                break;
            case 4 :
                // InternalOntologicalModelingLanguage.g:1:28: T__76
                {
                mT__76(); 

                }
                break;
            case 5 :
                // InternalOntologicalModelingLanguage.g:1:34: T__77
                {
                mT__77(); 

                }
                break;
            case 6 :
                // InternalOntologicalModelingLanguage.g:1:40: T__78
                {
                mT__78(); 

                }
                break;
            case 7 :
                // InternalOntologicalModelingLanguage.g:1:46: T__79
                {
                mT__79(); 

                }
                break;
            case 8 :
                // InternalOntologicalModelingLanguage.g:1:52: T__80
                {
                mT__80(); 

                }
                break;
            case 9 :
                // InternalOntologicalModelingLanguage.g:1:58: T__81
                {
                mT__81(); 

                }
                break;
            case 10 :
                // InternalOntologicalModelingLanguage.g:1:64: T__82
                {
                mT__82(); 

                }
                break;
            case 11 :
                // InternalOntologicalModelingLanguage.g:1:70: T__83
                {
                mT__83(); 

                }
                break;
            case 12 :
                // InternalOntologicalModelingLanguage.g:1:76: T__84
                {
                mT__84(); 

                }
                break;
            case 13 :
                // InternalOntologicalModelingLanguage.g:1:82: T__85
                {
                mT__85(); 

                }
                break;
            case 14 :
                // InternalOntologicalModelingLanguage.g:1:88: T__86
                {
                mT__86(); 

                }
                break;
            case 15 :
                // InternalOntologicalModelingLanguage.g:1:94: T__87
                {
                mT__87(); 

                }
                break;
            case 16 :
                // InternalOntologicalModelingLanguage.g:1:100: T__88
                {
                mT__88(); 

                }
                break;
            case 17 :
                // InternalOntologicalModelingLanguage.g:1:106: T__89
                {
                mT__89(); 

                }
                break;
            case 18 :
                // InternalOntologicalModelingLanguage.g:1:112: T__90
                {
                mT__90(); 

                }
                break;
            case 19 :
                // InternalOntologicalModelingLanguage.g:1:118: T__91
                {
                mT__91(); 

                }
                break;
            case 20 :
                // InternalOntologicalModelingLanguage.g:1:124: T__92
                {
                mT__92(); 

                }
                break;
            case 21 :
                // InternalOntologicalModelingLanguage.g:1:130: T__93
                {
                mT__93(); 

                }
                break;
            case 22 :
                // InternalOntologicalModelingLanguage.g:1:136: T__94
                {
                mT__94(); 

                }
                break;
            case 23 :
                // InternalOntologicalModelingLanguage.g:1:142: T__95
                {
                mT__95(); 

                }
                break;
            case 24 :
                // InternalOntologicalModelingLanguage.g:1:148: T__96
                {
                mT__96(); 

                }
                break;
            case 25 :
                // InternalOntologicalModelingLanguage.g:1:154: T__97
                {
                mT__97(); 

                }
                break;
            case 26 :
                // InternalOntologicalModelingLanguage.g:1:160: T__98
                {
                mT__98(); 

                }
                break;
            case 27 :
                // InternalOntologicalModelingLanguage.g:1:166: T__99
                {
                mT__99(); 

                }
                break;
            case 28 :
                // InternalOntologicalModelingLanguage.g:1:172: T__100
                {
                mT__100(); 

                }
                break;
            case 29 :
                // InternalOntologicalModelingLanguage.g:1:179: T__101
                {
                mT__101(); 

                }
                break;
            case 30 :
                // InternalOntologicalModelingLanguage.g:1:186: T__102
                {
                mT__102(); 

                }
                break;
            case 31 :
                // InternalOntologicalModelingLanguage.g:1:193: T__103
                {
                mT__103(); 

                }
                break;
            case 32 :
                // InternalOntologicalModelingLanguage.g:1:200: T__104
                {
                mT__104(); 

                }
                break;
            case 33 :
                // InternalOntologicalModelingLanguage.g:1:207: T__105
                {
                mT__105(); 

                }
                break;
            case 34 :
                // InternalOntologicalModelingLanguage.g:1:214: T__106
                {
                mT__106(); 

                }
                break;
            case 35 :
                // InternalOntologicalModelingLanguage.g:1:221: T__107
                {
                mT__107(); 

                }
                break;
            case 36 :
                // InternalOntologicalModelingLanguage.g:1:228: T__108
                {
                mT__108(); 

                }
                break;
            case 37 :
                // InternalOntologicalModelingLanguage.g:1:235: T__109
                {
                mT__109(); 

                }
                break;
            case 38 :
                // InternalOntologicalModelingLanguage.g:1:242: RULE_ANNOTATION_PROPERTY_TOKEN
                {
                mRULE_ANNOTATION_PROPERTY_TOKEN(); 

                }
                break;
            case 39 :
                // InternalOntologicalModelingLanguage.g:1:273: RULE_ANNOTATION_TOKEN
                {
                mRULE_ANNOTATION_TOKEN(); 

                }
                break;
            case 40 :
                // InternalOntologicalModelingLanguage.g:1:295: RULE_TERMINOLOGY_GRAPH_TOKEN
                {
                mRULE_TERMINOLOGY_GRAPH_TOKEN(); 

                }
                break;
            case 41 :
                // InternalOntologicalModelingLanguage.g:1:324: RULE_BUNDLE_TOKEN
                {
                mRULE_BUNDLE_TOKEN(); 

                }
                break;
            case 42 :
                // InternalOntologicalModelingLanguage.g:1:342: RULE_KIND_TOKEN
                {
                mRULE_KIND_TOKEN(); 

                }
                break;
            case 43 :
                // InternalOntologicalModelingLanguage.g:1:358: RULE_ASPECT_TOKEN
                {
                mRULE_ASPECT_TOKEN(); 

                }
                break;
            case 44 :
                // InternalOntologicalModelingLanguage.g:1:376: RULE_ABSTRACT_TOKEN
                {
                mRULE_ABSTRACT_TOKEN(); 

                }
                break;
            case 45 :
                // InternalOntologicalModelingLanguage.g:1:396: RULE_CONCEPT_TOKEN
                {
                mRULE_CONCEPT_TOKEN(); 

                }
                break;
            case 46 :
                // InternalOntologicalModelingLanguage.g:1:415: RULE_REIFIED_RELATIONSHIP_TOKEN
                {
                mRULE_REIFIED_RELATIONSHIP_TOKEN(); 

                }
                break;
            case 47 :
                // InternalOntologicalModelingLanguage.g:1:447: RULE_UNREIFIED_RELATIONSHIP_TOKEN
                {
                mRULE_UNREIFIED_RELATIONSHIP_TOKEN(); 

                }
                break;
            case 48 :
                // InternalOntologicalModelingLanguage.g:1:481: RULE_FUNCTIONAL_TOKEN
                {
                mRULE_FUNCTIONAL_TOKEN(); 

                }
                break;
            case 49 :
                // InternalOntologicalModelingLanguage.g:1:503: RULE_INVERSE_FUNCTIONAL_TOKEN
                {
                mRULE_INVERSE_FUNCTIONAL_TOKEN(); 

                }
                break;
            case 50 :
                // InternalOntologicalModelingLanguage.g:1:533: RULE_ESSENTIAL_TOKEN
                {
                mRULE_ESSENTIAL_TOKEN(); 

                }
                break;
            case 51 :
                // InternalOntologicalModelingLanguage.g:1:554: RULE_INVERSE_ESSENTIAL_TOKEN
                {
                mRULE_INVERSE_ESSENTIAL_TOKEN(); 

                }
                break;
            case 52 :
                // InternalOntologicalModelingLanguage.g:1:583: RULE_SYMMETRIC_TOKEN
                {
                mRULE_SYMMETRIC_TOKEN(); 

                }
                break;
            case 53 :
                // InternalOntologicalModelingLanguage.g:1:604: RULE_ASYMMETRIC_TOKEN
                {
                mRULE_ASYMMETRIC_TOKEN(); 

                }
                break;
            case 54 :
                // InternalOntologicalModelingLanguage.g:1:626: RULE_REFLEXIVE_TOKEN
                {
                mRULE_REFLEXIVE_TOKEN(); 

                }
                break;
            case 55 :
                // InternalOntologicalModelingLanguage.g:1:647: RULE_IRREFLEXIVE_TOKEN
                {
                mRULE_IRREFLEXIVE_TOKEN(); 

                }
                break;
            case 56 :
                // InternalOntologicalModelingLanguage.g:1:670: RULE_TRANSITIVE_TOKEN
                {
                mRULE_TRANSITIVE_TOKEN(); 

                }
                break;
            case 57 :
                // InternalOntologicalModelingLanguage.g:1:692: RULE_UNREIFIED_TOKEN
                {
                mRULE_UNREIFIED_TOKEN(); 

                }
                break;
            case 58 :
                // InternalOntologicalModelingLanguage.g:1:713: RULE_INVERSE_TOKEN
                {
                mRULE_INVERSE_TOKEN(); 

                }
                break;
            case 59 :
                // InternalOntologicalModelingLanguage.g:1:732: RULE_SOURCE_TOKEN
                {
                mRULE_SOURCE_TOKEN(); 

                }
                break;
            case 60 :
                // InternalOntologicalModelingLanguage.g:1:750: RULE_TARGET_TOKEN
                {
                mRULE_TARGET_TOKEN(); 

                }
                break;
            case 61 :
                // InternalOntologicalModelingLanguage.g:1:768: RULE_SCALAR_TOKEN
                {
                mRULE_SCALAR_TOKEN(); 

                }
                break;
            case 62 :
                // InternalOntologicalModelingLanguage.g:1:786: RULE_STRUCTURE_TOKEN
                {
                mRULE_STRUCTURE_TOKEN(); 

                }
                break;
            case 63 :
                // InternalOntologicalModelingLanguage.g:1:807: RULE_DOMAIN_TOKEN
                {
                mRULE_DOMAIN_TOKEN(); 

                }
                break;
            case 64 :
                // InternalOntologicalModelingLanguage.g:1:825: RULE_RANGE_TOKEN
                {
                mRULE_RANGE_TOKEN(); 

                }
                break;
            case 65 :
                // InternalOntologicalModelingLanguage.g:1:842: RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN
                {
                mRULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN(); 

                }
                break;
            case 66 :
                // InternalOntologicalModelingLanguage.g:1:881: RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN
                {
                mRULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN(); 

                }
                break;
            case 67 :
                // InternalOntologicalModelingLanguage.g:1:924: RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN
                {
                mRULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN(); 

                }
                break;
            case 68 :
                // InternalOntologicalModelingLanguage.g:1:968: RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN
                {
                mRULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN(); 

                }
                break;
            case 69 :
                // InternalOntologicalModelingLanguage.g:1:1005: RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN
                {
                mRULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN(); 

                }
                break;
            case 70 :
                // InternalOntologicalModelingLanguage.g:1:1054: RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN
                {
                mRULE_TERMINOLOGY_NESTING_AXIOM_TOKEN(); 

                }
                break;
            case 71 :
                // InternalOntologicalModelingLanguage.g:1:1091: RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN
                {
                mRULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN(); 

                }
                break;
            case 72 :
                // InternalOntologicalModelingLanguage.g:1:1130: RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 73 :
                // InternalOntologicalModelingLanguage.g:1:1178: RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 74 :
                // InternalOntologicalModelingLanguage.g:1:1224: RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN
                {
                mRULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN(); 

                }
                break;
            case 75 :
                // InternalOntologicalModelingLanguage.g:1:1264: RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN
                {
                mRULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN(); 

                }
                break;
            case 76 :
                // InternalOntologicalModelingLanguage.g:1:1303: RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN
                {
                mRULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN(); 

                }
                break;
            case 77 :
                // InternalOntologicalModelingLanguage.g:1:1356: RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 78 :
                // InternalOntologicalModelingLanguage.g:1:1425: RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 79 :
                // InternalOntologicalModelingLanguage.g:1:1492: RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN
                {
                mRULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN(); 

                }
                break;
            case 80 :
                // InternalOntologicalModelingLanguage.g:1:1560: RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_SYNONYM_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 81 :
                // InternalOntologicalModelingLanguage.g:1:1598: RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_NUMERIC_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 82 :
                // InternalOntologicalModelingLanguage.g:1:1636: RULE_STRING_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_STRING_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 83 :
                // InternalOntologicalModelingLanguage.g:1:1673: RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 84 :
                // InternalOntologicalModelingLanguage.g:1:1717: RULE_BINARY_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_BINARY_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 85 :
                // InternalOntologicalModelingLanguage.g:1:1754: RULE_IRI_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_IRI_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 86 :
                // InternalOntologicalModelingLanguage.g:1:1788: RULE_TIME_SCALAR_RESTRICTION_TOKEN
                {
                mRULE_TIME_SCALAR_RESTRICTION_TOKEN(); 

                }
                break;
            case 87 :
                // InternalOntologicalModelingLanguage.g:1:1823: RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN
                {
                mRULE_SCALAR_ONE_OF_RESTRICTION_TOKEN(); 

                }
                break;
            case 88 :
                // InternalOntologicalModelingLanguage.g:1:1860: RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN
                {
                mRULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN(); 

                }
                break;
            case 89 :
                // InternalOntologicalModelingLanguage.g:1:1899: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 90 :
                // InternalOntologicalModelingLanguage.g:1:1911: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 91 :
                // InternalOntologicalModelingLanguage.g:1:1923: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 92 :
                // InternalOntologicalModelingLanguage.g:1:1934: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 93 :
                // InternalOntologicalModelingLanguage.g:1:1946: RULE_IRI
                {
                mRULE_IRI(); 

                }
                break;
            case 94 :
                // InternalOntologicalModelingLanguage.g:1:1955: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 95 :
                // InternalOntologicalModelingLanguage.g:1:1963: RULE_UUID
                {
                mRULE_UUID(); 

                }
                break;
            case 96 :
                // InternalOntologicalModelingLanguage.g:1:1973: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 97 :
                // InternalOntologicalModelingLanguage.g:1:1982: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 98 :
                // InternalOntologicalModelingLanguage.g:1:1991: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 99 :
                // InternalOntologicalModelingLanguage.g:1:2004: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 100 :
                // InternalOntologicalModelingLanguage.g:1:2020: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 101 :
                // InternalOntologicalModelingLanguage.g:1:2036: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 102 :
                // InternalOntologicalModelingLanguage.g:1:2044: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\15\44\2\uffff\5\44\5\uffff\2\42\1\44\1\uffff\2\131\1\42\2\uffff\1\44\1\uffff\42\44\2\uffff\11\44\6\uffff\1\131\3\uffff\1\136\1\131\5\uffff\63\44\1\131\2\uffff\3\136\1\u00dc\23\44\1\u00f1\36\44\1\u0110\5\44\1\131\2\uffff\4\136\1\uffff\24\44\1\uffff\3\44\1\u0135\17\44\1\u0145\1\u0146\11\44\1\uffff\5\44\1\131\2\uffff\4\136\1\u015c\7\44\1\u016a\6\44\1\u0171\3\44\1\u0175\4\44\1\uffff\1\u017b\4\44\1\u0180\11\44\2\uffff\2\44\1\u018c\4\44\1\u0191\6\44\1\131\2\uffff\4\136\1\uffff\1\u01a1\5\44\1\u01a9\6\44\1\uffff\6\44\1\uffff\3\44\1\uffff\5\44\1\uffff\4\44\1\uffff\7\44\1\u01ca\3\44\1\uffff\4\44\1\uffff\3\44\1\u01d7\2\44\1\131\2\uffff\4\136\2\44\1\uffff\7\44\1\uffff\31\44\1\u0203\6\44\1\uffff\4\44\1\u020e\7\44\1\uffff\2\44\1\131\2\uffff\4\136\6\44\1\u021f\1\44\1\u0222\11\44\1\u022c\10\44\1\u0235\6\44\1\uffff\1\u023c\2\44\1\u023f\6\44\1\uffff\3\44\1\u024a\5\44\1\uffff\6\44\1\uffff\2\44\1\uffff\5\44\1\u025e\3\44\1\uffff\10\44\1\uffff\6\44\1\uffff\2\44\1\uffff\5\44\1\u027a\1\44\1\u027c\2\44\1\uffff\1\u027f\4\44\1\136\15\44\1\uffff\33\44\1\uffff\1\u02b2\1\uffff\2\44\1\uffff\2\44\1\u02b7\1\44\1\136\1\uffff\1\136\17\44\1\u02cc\4\44\1\u02d1\15\44\1\u02df\1\u02e0\1\u02e1\1\u02e2\1\u02e3\4\44\1\uffff\4\44\1\uffff\1\44\1\uffff\3\136\6\44\1\u02f7\10\44\1\uffff\4\44\1\uffff\15\44\5\uffff\11\44\1\136\1\uffff\2\136\6\44\1\uffff\3\44\1\u0323\23\44\1\u0337\23\44\1\uffff\3\44\1\u034e\10\44\1\u0357\6\44\1\uffff\26\44\1\uffff\10\44\1\uffff\1\u037c\1\u037d\14\44\1\u038a\12\44\1\u0395\2\44\1\u0398\4\44\1\u039d\2\44\2\uffff\13\44\1\u03ab\1\uffff\11\44\1\u03b5\1\uffff\2\44\1\uffff\4\44\1\uffff\1\44\1\u03bd\1\44\1\u03c0\1\44\1\u03c2\2\44\1\u03c5\4\44\1\uffff\11\44\1\uffff\7\44\1\uffff\1\u03db\1\44\1\uffff\1\44\1\uffff\2\44\1\uffff\25\44\1\uffff\10\44\1\u03fd\15\44\1\u040b\10\44\1\u0414\1\u0415\1\uffff\6\44\1\u041c\1\44\1\u041e\3\44\1\u0422\1\uffff\10\44\2\uffff\6\44\1\uffff\1\u0431\1\uffff\1\u0432\2\44\1\uffff\2\44\1\u0437\1\u0438\3\44\1\u043c\3\44\1\u0443\2\44\2\uffff\1\u0446\1\44\1\u0448\1\44\2\uffff\1\u044a\2\44\1\uffff\6\44\1\uffff\2\44\1\uffff\1\44\1\uffff\1\44\1\uffff\3\44\1\u045a\13\44\1\uffff\13\44\1\u0471\5\44\1\u0477\4\44\1\uffff\5\44\1\uffff\1\44\1\u0482\1\u0483\7\44\2\uffff\5\44\1\u0490\6\44\1\uffff\5\44\1\u049c\1\44\1\u049e\3\44\1\uffff\1\44\1\uffff\17\44\1\u04b2\3\44\1\uffff\34\44\1\u04d2\2\44\1\uffff\1\u04d5\1\u04d6\2\uffff";
    static final String DFA22_eofS =
        "\u04d7\uffff";
    static final String DFA22_minS =
        "\1\0\1\160\2\60\1\143\1\60\1\141\1\60\1\145\4\141\1\60\2\uffff\1\141\1\151\1\156\1\60\1\156\5\uffff\1\0\1\44\1\60\1\uffff\2\60\1\52\2\uffff\1\145\1\uffff\1\157\1\156\1\60\1\164\1\163\1\164\1\162\1\141\1\142\1\155\1\165\1\145\1\163\1\60\1\155\1\157\1\146\3\156\1\163\1\155\1\164\3\156\1\170\1\164\1\141\1\154\1\151\1\156\1\160\1\60\2\uffff\1\162\1\141\1\162\1\155\1\156\1\162\1\156\1\166\1\151\6\uffff\1\60\1\uffff\1\53\3\60\5\uffff\1\156\1\163\1\143\1\60\1\151\2\145\1\151\1\154\1\103\1\145\1\155\1\157\1\162\1\143\1\152\1\151\1\141\2\164\1\146\1\154\1\147\1\144\1\141\1\164\2\145\2\147\2\105\1\164\1\151\1\165\2\157\1\156\1\145\1\155\1\164\1\155\1\156\1\147\1\145\1\144\1\145\1\143\2\145\1\123\1\60\1\53\4\60\1\44\2\145\1\60\1\164\2\156\1\143\1\156\1\141\1\157\1\145\1\162\1\145\1\156\1\143\1\151\1\157\1\147\1\151\1\44\1\162\1\151\2\145\1\154\1\162\1\151\2\162\1\164\1\165\1\145\1\156\1\170\1\145\1\156\1\170\1\145\1\156\1\145\1\155\1\164\1\171\1\143\1\155\1\162\1\151\1\163\1\145\1\123\1\44\1\151\1\164\1\162\1\146\1\143\1\60\1\53\5\60\1\uffff\1\144\1\160\1\60\1\171\1\164\1\144\1\164\1\147\1\162\1\156\1\154\1\103\1\164\1\171\1\145\1\146\1\151\2\156\1\157\1\uffff\1\151\1\145\1\170\1\44\1\145\1\171\1\156\1\151\1\141\1\150\1\141\1\156\2\143\1\156\2\143\1\162\1\114\2\44\1\141\1\155\1\164\1\145\1\141\1\156\1\151\1\164\1\143\1\uffff\1\146\1\151\1\163\1\154\1\141\1\60\1\53\5\60\1\44\1\164\1\60\1\105\1\151\1\163\1\165\1\123\1\44\1\143\1\141\1\157\1\145\1\162\1\155\1\44\1\151\1\156\1\141\1\44\1\156\1\143\1\144\1\151\1\uffff\1\44\1\123\1\147\1\143\1\154\1\44\2\147\2\154\1\147\2\154\1\156\1\151\2\uffff\1\164\1\157\1\44\1\164\1\143\1\157\1\164\1\44\1\141\1\151\1\157\2\145\1\154\1\60\1\53\5\60\1\uffff\1\44\1\60\1\143\1\170\1\156\1\141\1\44\1\162\1\143\1\141\1\162\1\145\1\156\1\uffff\1\145\1\164\1\156\1\154\1\151\1\123\1\uffff\1\143\2\164\1\uffff\1\143\1\164\1\122\1\166\1\124\1\uffff\1\143\1\103\1\123\1\126\1\uffff\1\145\1\164\2\165\1\164\2\165\1\44\1\164\1\151\1\165\1\uffff\1\162\1\164\1\154\1\151\1\uffff\1\154\1\145\1\156\1\44\1\170\1\141\1\60\1\53\5\60\1\145\1\160\1\uffff\1\55\1\162\1\141\2\151\1\154\1\163\1\uffff\1\145\1\141\1\164\1\157\1\163\1\145\1\160\1\151\1\143\1\141\2\143\1\104\1\114\6\145\1\141\1\145\1\157\1\143\1\141\1\44\1\150\2\163\1\150\2\163\1\uffff\1\145\1\157\1\163\1\151\1\44\1\157\1\166\1\141\1\144\1\141\1\165\1\163\1\uffff\1\151\1\162\1\55\1\53\5\55\1\163\1\145\1\165\1\154\1\163\1\166\1\44\1\160\1\44\1\154\1\141\1\160\1\164\1\117\1\164\1\157\1\145\1\164\1\44\1\141\1\151\1\141\1\145\1\144\1\160\1\144\1\154\1\44\1\162\1\154\1\162\1\156\1\141\1\154\1\uffff\1\44\2\151\1\44\2\151\1\162\1\156\1\103\1\143\1\uffff\1\147\1\145\1\162\1\44\1\154\1\156\1\163\1\166\1\122\1\60\1\151\2\143\1\141\1\164\1\145\1\uffff\1\145\1\104\1\uffff\1\141\1\120\1\145\1\162\1\146\1\44\1\156\1\160\1\151\1\uffff\1\154\1\163\1\170\1\141\1\103\1\164\1\104\1\141\1\uffff\1\155\1\141\1\155\1\164\1\154\1\165\1\uffff\2\166\1\uffff\2\166\1\141\1\120\1\157\1\44\1\171\1\44\1\122\1\145\1\uffff\1\44\1\143\3\145\1\60\1\147\1\151\1\164\1\162\1\145\1\162\1\143\1\141\3\162\1\151\1\114\1\uffff\1\163\1\164\1\157\1\141\1\152\1\157\1\146\1\145\1\157\1\124\1\141\1\157\1\156\1\164\1\151\1\162\1\151\1\145\1\141\5\145\1\154\1\162\1\156\1\uffff\1\44\1\uffff\1\145\1\154\1\uffff\1\164\1\156\1\44\1\163\3\60\1\156\1\141\1\165\1\104\1\156\1\163\2\164\1\122\1\157\1\164\1\143\1\145\1\151\1\150\1\44\1\156\1\162\1\157\1\156\1\44\1\162\1\156\1\141\1\154\1\156\1\155\1\164\1\151\1\156\1\122\1\156\1\170\1\162\5\44\1\123\1\157\1\143\1\145\1\uffff\1\163\1\141\1\151\1\164\1\uffff\1\164\4\60\1\141\1\154\1\162\1\141\1\164\1\141\1\44\1\141\1\145\1\160\1\171\1\164\1\163\1\164\1\151\1\uffff\1\163\1\122\1\151\1\157\1\uffff\1\155\1\143\1\170\1\141\1\147\1\141\1\151\2\157\1\145\1\157\1\164\1\122\5\uffff\1\143\1\160\1\145\1\163\2\164\1\157\1\151\1\162\4\55\1\164\1\151\1\145\1\164\1\151\1\154\1\uffff\1\120\1\163\1\145\1\44\1\151\1\164\1\145\1\160\1\150\1\145\1\156\1\155\1\151\1\145\1\157\1\164\1\145\1\151\1\164\1\156\1\154\1\163\1\154\1\44\1\145\1\141\1\145\1\160\1\164\1\162\1\151\1\156\1\141\2\151\1\172\1\144\2\141\1\122\1\162\1\164\1\162\1\uffff\1\157\2\162\1\44\1\151\1\163\1\164\1\171\1\156\1\160\1\156\1\151\1\44\1\156\1\171\1\163\1\157\1\164\1\157\1\uffff\1\163\1\154\1\162\1\164\2\151\1\157\1\141\1\154\1\143\1\157\1\141\1\104\1\120\1\154\1\145\1\157\1\162\1\164\1\156\1\151\1\141\1\uffff\1\160\1\164\1\103\1\120\1\157\1\164\2\157\1\uffff\2\44\1\150\1\147\1\162\1\147\1\164\1\141\1\164\1\124\1\156\1\143\1\156\1\154\1\44\1\164\1\156\1\164\1\141\1\162\1\122\1\163\1\160\1\151\1\171\1\44\1\143\1\154\1\44\1\162\1\157\1\141\1\154\1\44\1\155\1\156\2\uffff\1\151\1\171\1\151\1\171\2\162\1\171\1\141\1\147\1\164\1\163\1\44\1\uffff\1\151\1\124\1\151\1\164\1\157\1\145\1\164\1\145\1\143\1\44\1\uffff\1\164\1\101\1\uffff\1\151\1\156\1\162\1\157\1\uffff\1\171\1\44\1\160\1\44\1\143\1\44\1\151\1\122\1\44\1\170\1\101\1\151\1\150\1\uffff\1\157\1\145\1\157\1\141\1\160\1\163\2\162\1\164\1\uffff\1\151\1\170\2\143\1\145\1\147\1\101\1\uffff\1\44\1\170\1\uffff\1\164\1\uffff\1\143\1\145\1\uffff\1\157\1\170\1\157\1\151\1\156\1\162\1\156\1\120\1\145\1\164\1\151\1\164\1\151\1\157\1\151\1\164\1\145\1\156\1\171\1\170\1\160\1\uffff\2\151\1\164\1\163\1\156\1\151\1\156\1\160\1\44\1\155\1\101\3\162\1\143\1\171\1\157\1\156\1\157\1\151\1\160\1\164\1\44\1\151\1\145\2\157\1\151\1\164\2\157\2\44\1\uffff\1\151\1\170\1\157\1\164\1\151\1\164\1\44\1\156\1\44\1\155\1\157\1\164\1\44\1\uffff\1\157\1\143\1\155\1\156\1\157\1\162\2\155\2\uffff\1\156\1\151\1\160\1\171\1\143\1\151\1\uffff\1\44\1\uffff\1\44\1\156\1\101\1\uffff\1\155\1\151\2\44\1\156\1\151\1\171\1\44\2\157\1\145\1\44\1\164\1\157\2\uffff\1\44\1\170\1\44\1\141\2\uffff\1\44\1\143\1\101\1\uffff\1\154\1\155\1\162\1\170\1\156\1\141\1\uffff\1\151\1\156\1\uffff\1\151\1\uffff\1\154\1\uffff\1\164\1\170\1\157\1\44\1\164\2\151\1\162\1\157\1\101\1\157\3\151\1\147\1\uffff\1\171\1\163\1\166\1\164\1\156\1\170\1\155\1\172\2\157\1\171\1\44\1\164\1\145\1\151\1\101\1\151\1\44\1\141\1\156\1\155\1\101\1\uffff\1\145\1\162\1\143\1\170\1\157\1\uffff\1\164\2\44\1\170\1\156\1\163\1\165\1\151\1\155\1\151\2\uffff\1\151\1\164\1\141\1\154\1\157\1\44\2\157\1\151\1\154\1\141\1\155\1\uffff\1\156\1\155\1\141\1\122\1\162\1\44\1\101\1\44\1\154\1\145\1\122\1\uffff\1\170\1\uffff\1\122\1\163\1\145\1\151\1\145\1\164\1\163\1\157\1\163\1\162\1\164\1\155\1\164\1\151\1\162\1\44\1\162\1\143\1\151\1\uffff\1\151\1\164\2\143\1\151\2\164\1\157\2\151\1\156\2\157\1\101\2\156\1\170\2\101\1\151\2\170\1\157\2\151\1\155\2\157\1\44\2\155\1\uffff\2\44\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\160\1\157\1\170\1\171\2\157\2\165\2\151\1\154\1\141\1\170\2\uffff\1\162\1\151\1\156\1\165\1\162\5\uffff\1\uffff\1\172\1\146\1\uffff\1\170\1\154\1\57\2\uffff\1\145\1\uffff\1\157\1\156\1\146\1\164\1\163\1\164\1\162\1\141\1\160\1\156\1\165\1\145\2\163\1\155\1\157\1\163\3\156\1\163\1\155\1\164\3\156\1\170\1\164\1\141\1\154\1\151\1\157\1\171\1\163\2\uffff\1\162\1\141\1\162\1\155\1\156\1\162\1\156\1\166\1\162\6\uffff\1\154\1\uffff\1\146\1\151\1\146\1\154\5\uffff\1\156\1\163\1\143\1\146\1\151\2\145\1\165\1\154\1\122\1\145\1\155\1\157\1\162\1\143\1\152\1\151\1\141\2\164\1\146\1\154\1\147\1\144\1\141\1\164\2\145\2\147\2\114\1\164\1\151\1\165\2\157\1\156\1\145\1\155\1\164\1\155\1\156\1\147\1\145\1\144\1\145\1\143\2\145\1\123\1\154\1\146\1\151\3\146\1\172\2\145\1\146\1\164\2\156\1\143\1\156\1\141\1\157\1\145\1\162\1\145\1\156\1\143\1\151\1\157\1\147\1\151\1\172\1\162\1\151\2\145\1\154\1\162\1\151\2\162\1\164\1\165\1\145\1\156\1\170\1\145\1\156\1\170\1\145\1\156\1\145\1\155\1\164\1\171\1\143\1\155\1\162\1\151\1\163\1\145\1\123\1\172\1\151\1\164\1\162\1\146\1\143\1\154\1\146\1\151\4\146\1\uffff\1\144\1\160\1\146\1\171\1\164\1\144\1\164\1\147\1\162\1\156\1\154\1\122\1\164\1\171\1\145\1\146\1\151\2\156\1\157\1\uffff\1\151\1\145\1\170\1\172\1\145\1\171\1\156\1\151\1\141\1\150\1\141\1\156\2\143\1\156\2\143\1\162\1\114\2\172\1\141\1\155\1\164\1\145\1\141\1\156\1\151\1\164\1\143\1\uffff\1\146\1\151\1\163\1\154\1\141\1\154\1\146\1\151\4\146\1\172\1\164\1\146\1\125\1\151\1\163\1\165\1\123\1\172\1\143\1\141\1\157\1\145\1\162\1\155\1\172\1\151\1\156\1\141\1\172\1\156\1\143\1\144\1\151\1\uffff\1\172\1\123\1\147\1\143\1\154\1\172\2\147\2\154\1\147\2\154\1\156\1\151\2\uffff\1\164\1\157\1\172\1\164\1\143\1\157\1\164\1\172\1\141\1\151\1\157\2\145\2\154\1\146\1\151\4\146\1\uffff\1\172\1\146\1\164\1\170\1\156\1\141\1\172\1\162\1\143\1\141\1\162\1\145\1\156\1\uffff\1\145\1\164\1\156\1\154\1\151\1\123\1\uffff\1\143\2\164\1\uffff\1\143\1\164\1\122\1\166\1\124\1\uffff\1\143\1\124\1\123\1\126\1\uffff\1\145\1\164\2\165\1\164\2\165\1\172\1\164\1\151\1\165\1\uffff\1\162\1\164\1\154\1\151\1\uffff\1\154\1\145\1\156\1\172\1\170\1\141\1\154\1\146\1\151\4\146\1\145\1\160\1\uffff\1\55\1\162\1\141\2\151\1\154\1\163\1\uffff\1\145\1\141\1\164\1\157\1\163\1\145\1\160\1\151\1\143\1\141\2\143\1\104\1\124\6\145\1\141\1\145\1\157\1\143\1\141\1\172\1\150\2\163\1\150\2\163\1\uffff\1\145\1\157\1\163\1\151\1\172\1\157\1\166\1\141\1\144\1\141\1\165\1\163\1\uffff\1\151\1\162\1\154\1\71\1\151\4\55\1\163\1\145\1\165\1\154\1\163\1\166\1\172\1\160\1\172\1\154\1\141\1\160\1\164\1\117\1\164\1\157\1\145\1\164\1\172\1\141\1\151\1\141\1\145\1\144\1\160\1\144\1\154\1\172\1\162\1\154\1\162\1\156\1\141\1\154\1\uffff\1\172\2\151\1\172\2\151\1\162\1\156\1\103\1\143\1\uffff\1\147\1\145\1\162\1\172\1\154\1\156\1\163\1\166\1\122\1\146\1\151\2\143\1\141\1\164\1\145\1\uffff\1\145\1\104\1\uffff\1\141\1\120\1\145\1\162\1\146\1\172\1\156\1\160\1\151\1\uffff\1\154\1\163\1\170\1\141\1\124\1\164\1\122\1\141\1\uffff\1\155\1\141\1\155\1\164\1\154\1\165\1\uffff\2\166\1\uffff\2\166\1\141\1\120\1\157\1\172\1\171\1\172\1\122\1\145\1\uffff\1\172\1\143\3\145\1\146\1\147\1\151\1\164\1\162\1\145\1\162\1\143\1\141\3\162\1\151\1\122\1\uffff\1\163\1\164\1\157\1\141\1\152\1\157\1\146\1\145\1\157\1\124\1\145\1\157\1\156\1\164\1\151\1\162\1\151\1\145\1\141\5\145\1\154\1\162\1\156\1\uffff\1\172\1\uffff\1\145\1\154\1\uffff\1\164\1\156\1\172\1\163\1\146\1\151\1\146\1\156\1\141\1\165\1\104\1\156\1\163\2\164\1\122\1\157\1\164\1\143\1\145\1\151\1\150\1\172\1\156\1\162\1\157\1\156\1\172\1\162\1\156\1\141\1\154\1\156\1\155\1\164\1\151\1\156\1\122\1\156\1\170\1\162\5\172\1\123\1\157\1\143\1\145\1\uffff\1\163\1\141\1\151\1\164\1\uffff\1\164\1\151\3\146\1\141\1\154\1\162\1\141\1\164\1\141\1\172\1\141\1\145\1\160\1\171\1\164\1\163\1\164\1\151\1\uffff\1\163\1\122\1\151\1\157\1\uffff\1\155\1\143\1\170\1\141\1\147\1\141\1\151\2\157\1\145\1\157\1\164\1\122\5\uffff\1\143\1\160\1\145\1\163\2\164\1\157\1\151\1\162\1\55\1\151\2\55\1\164\1\151\1\145\1\164\1\151\1\154\1\uffff\1\120\1\163\1\145\1\172\1\151\1\164\1\145\1\160\1\150\1\145\1\156\1\155\1\151\1\145\1\157\1\164\1\145\1\151\1\164\1\156\1\154\1\163\1\154\1\172\1\145\1\141\1\145\1\160\1\164\1\162\1\151\1\156\1\141\2\151\1\172\1\144\2\141\1\122\1\162\1\164\1\162\1\uffff\1\157\2\162\1\172\1\151\1\163\1\164\1\171\1\156\1\160\1\156\1\151\1\172\1\156\1\171\1\163\1\157\1\164\1\157\1\uffff\1\163\1\154\1\162\1\164\2\151\1\157\1\141\1\154\1\143\1\157\1\141\1\104\1\120\1\154\1\145\1\157\1\162\1\164\1\156\1\151\1\141\1\uffff\1\160\1\164\1\103\1\120\1\157\1\164\2\157\1\uffff\2\172\1\150\1\147\1\162\1\147\1\164\1\141\1\164\1\124\1\156\1\143\1\156\1\154\1\172\1\164\1\156\1\164\1\141\1\162\1\122\1\163\1\160\1\151\1\171\1\172\1\143\1\154\1\172\1\162\1\157\1\141\1\154\1\172\1\155\1\156\2\uffff\1\151\1\171\1\151\1\171\2\162\1\171\1\141\1\147\1\164\1\163\1\172\1\uffff\1\151\1\124\1\151\1\164\1\157\1\145\1\164\1\145\1\143\1\172\1\uffff\1\164\1\101\1\uffff\1\151\1\156\1\162\1\157\1\uffff\1\171\1\172\1\160\1\172\1\143\1\172\1\151\1\122\1\172\1\170\1\101\1\151\1\150\1\uffff\1\157\1\145\1\157\1\141\1\160\1\163\2\162\1\164\1\uffff\1\151\1\170\2\143\1\145\1\147\1\101\1\uffff\1\172\1\170\1\uffff\1\164\1\uffff\1\143\1\145\1\uffff\1\157\1\170\1\157\1\151\1\156\1\162\1\156\1\120\1\145\1\164\1\151\1\164\1\151\1\157\1\151\1\164\1\145\1\156\1\171\1\170\1\160\1\uffff\2\151\1\164\1\163\1\156\1\151\1\156\1\160\1\172\1\155\1\101\3\162\1\143\1\171\1\157\1\156\1\157\1\151\1\160\1\164\1\172\1\151\1\145\2\157\1\151\1\164\2\157\2\172\1\uffff\1\151\1\170\1\157\1\164\1\151\1\164\1\172\1\156\1\172\1\155\1\157\1\164\1\172\1\uffff\1\157\1\143\1\155\1\156\1\157\1\162\2\155\2\uffff\1\156\1\151\1\160\1\171\1\143\1\151\1\uffff\1\172\1\uffff\1\172\1\156\1\101\1\uffff\1\155\1\151\2\172\1\156\1\151\1\171\1\172\2\157\1\145\1\172\1\164\1\157\2\uffff\1\172\1\170\1\172\1\141\2\uffff\1\172\1\143\1\101\1\uffff\1\154\1\155\1\162\1\170\1\156\1\141\1\uffff\1\151\1\156\1\uffff\1\151\1\uffff\1\154\1\uffff\1\164\1\170\1\157\1\172\1\164\2\151\1\162\1\157\1\101\1\157\3\151\1\147\1\uffff\1\171\1\163\1\166\1\164\1\156\1\170\1\155\1\172\2\157\1\171\1\172\1\164\1\145\1\151\1\101\1\151\1\172\1\141\1\156\1\155\1\101\1\uffff\1\145\1\162\1\143\1\170\1\157\1\uffff\1\164\2\172\1\170\1\156\1\163\1\165\1\151\1\155\1\151\2\uffff\1\151\1\164\1\141\1\154\1\157\1\172\2\157\1\151\1\154\1\141\1\155\1\uffff\1\156\1\155\1\141\1\122\1\162\1\172\1\101\1\172\1\154\1\145\1\122\1\uffff\1\170\1\uffff\1\122\1\163\1\145\1\151\1\145\1\164\1\163\1\157\1\163\1\162\1\164\1\155\1\164\1\151\1\162\1\172\1\162\1\143\1\151\1\uffff\1\151\1\164\2\143\1\151\2\164\1\157\2\151\1\156\2\157\1\101\2\156\1\170\2\101\1\151\2\170\1\157\2\151\1\155\2\157\1\172\2\155\1\uffff\2\172\2\uffff";
    static final String DFA22_acceptS =
        "\16\uffff\1\45\1\47\5\uffff\1\131\1\132\1\133\2\134\3\uffff\1\136\3\uffff\1\145\1\146\1\uffff\1\136\42\uffff\1\45\1\47\11\uffff\1\131\1\132\1\133\1\134\1\135\1\140\1\uffff\1\141\4\uffff\1\142\1\137\1\143\1\144\1\145\171\uffff\1\1\24\uffff\1\10\36\uffff\1\52\44\uffff\1\100\17\uffff\1\43\1\44\25\uffff\1\2\15\uffff\1\75\6\uffff\1\73\3\uffff\1\77\5\uffff\1\51\4\uffff\1\32\13\uffff\1\53\4\uffff\1\74\17\uffff\1\55\7\uffff\1\107\40\uffff\1\35\14\uffff\1\72\53\uffff\1\42\12\uffff\1\54\20\uffff\1\62\2\uffff\1\76\11\uffff\1\64\10\uffff\1\66\6\uffff\1\33\2\uffff\1\34\12\uffff\1\71\23\uffff\1\22\33\uffff\1\65\1\uffff\1\70\2\uffff\1\60\62\uffff\1\50\4\uffff\1\67\24\uffff\1\23\4\uffff\1\11\15\uffff\1\31\1\36\1\40\1\37\1\41\23\uffff\1\113\53\uffff\1\27\23\uffff\1\16\26\uffff\1\24\10\uffff\1\20\44\uffff\1\21\1\26\14\uffff\1\63\12\uffff\1\30\2\uffff\1\25\4\uffff\1\14\15\uffff\1\61\11\uffff\1\6\7\uffff\1\17\2\uffff\1\12\1\uffff\1\15\2\uffff\1\46\25\uffff\1\56\41\uffff\1\125\15\uffff\1\13\10\uffff\1\126\1\57\6\uffff\1\5\1\uffff\1\127\3\uffff\1\7\16\uffff\1\122\1\130\4\uffff\1\104\1\124\3\uffff\1\106\6\uffff\1\4\2\uffff\1\120\1\uffff\1\101\1\uffff\1\121\17\uffff\1\112\26\uffff\1\3\5\uffff\1\102\12\uffff\1\123\1\103\14\uffff\1\111\13\uffff\1\110\1\uffff\1\105\23\uffff\1\114\37\uffff\1\116\2\uffff\1\117\1\115";
    static final String DFA22_specialS =
        "\1\0\31\uffff\1\1\u04bc\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\30\1\42\1\35\2\42\1\31\7\42\1\40\1\36\11\37\1\16\1\42\1\32\1\27\2\42\1\17\6\34\24\35\3\42\1\33\1\35\1\42\1\15\1\7\1\2\1\5\1\3\1\23\2\35\1\24\1\35\1\21\1\11\1\12\1\10\1\1\1\13\1\35\1\6\1\4\1\20\1\22\1\14\4\35\1\25\1\42\1\26\uff82\42",
            "\1\43",
            "\12\47\7\uffff\6\47\32\uffff\6\47\5\uffff\1\45\2\uffff\1\46",
            "\12\47\7\uffff\6\47\32\uffff\6\47\7\uffff\1\50\4\uffff\1\51\4\uffff\1\52",
            "\1\54\13\uffff\1\57\1\60\3\uffff\1\53\1\55\3\uffff\1\56",
            "\12\47\7\uffff\6\47\32\uffff\4\47\1\62\1\47\2\uffff\1\61\5\uffff\1\63",
            "\1\66\3\uffff\1\65\11\uffff\1\64",
            "\12\47\7\uffff\6\47\32\uffff\6\47\2\uffff\1\70\13\uffff\1\67",
            "\1\71\17\uffff\1\72",
            "\1\75\3\uffff\1\74\3\uffff\1\73",
            "\1\77\7\uffff\1\76",
            "\1\100\12\uffff\1\101",
            "\1\102",
            "\12\47\7\uffff\6\47\32\uffff\1\47\1\106\4\47\7\uffff\1\104\4\uffff\1\105\4\uffff\1\103",
            "",
            "",
            "\1\113\3\uffff\1\111\3\uffff\1\114\10\uffff\1\112",
            "\1\115",
            "\1\116",
            "\12\47\7\uffff\6\47\32\uffff\6\47\16\uffff\1\117",
            "\1\120\3\uffff\1\121",
            "",
            "",
            "",
            "",
            "",
            "\0\126",
            "\1\44\34\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\47\7\uffff\6\47\32\uffff\6\47",
            "",
            "\12\130\7\uffff\1\137\1\133\1\137\1\134\1\132\1\134\5\uffff\1\136\13\uffff\1\127\6\uffff\1\135\1\uffff\1\137\1\133\1\137\1\134\1\132\1\134\5\uffff\1\136\13\uffff\1\127",
            "\12\130\7\uffff\1\137\1\133\1\137\1\134\1\132\1\134\5\uffff\1\136\22\uffff\1\135\1\uffff\1\137\1\133\1\137\1\134\1\132\1\134\5\uffff\1\136",
            "\1\140\4\uffff\1\141",
            "",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\12\146\7\uffff\6\146\32\uffff\6\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154\15\uffff\1\155",
            "\1\156\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\146\7\uffff\6\146\32\uffff\6\146\14\uffff\1\163",
            "\1\164",
            "\1\165",
            "\1\170\2\uffff\1\167\11\uffff\1\166",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\1\u0088",
            "\1\u0089\10\uffff\1\u008a",
            "\12\146\7\uffff\6\146\32\uffff\6\146\14\uffff\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0095\10\uffff\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0096\7\uffff\1\137\1\u0098\1\137\1\u0099\1\u0097\1\u0099\5\uffff\1\136\22\uffff\1\135\1\uffff\1\137\1\u0098\1\137\1\u0099\1\u0097\1\u0099\5\uffff\1\136",
            "",
            "\1\136\1\uffff\1\136\2\uffff\12\u009a\7\uffff\6\137\32\uffff\6\137",
            "\12\137\7\uffff\3\137\1\u009b\2\137\2\uffff\1\136\27\uffff\3\137\1\u009b\2\137\2\uffff\1\136",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\135\10\uffff\1\136\1\uffff\3\136\5\uffff\1\136\22\uffff\1\135\2\uffff\1\136\1\uffff\3\136\5\uffff\1\136",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\u009f\7\uffff\6\u009f\32\uffff\6\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\13\uffff\1\u00a3",
            "\1\u00a5",
            "\1\u00a6\16\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00be\3\uffff\1\u00bd\2\uffff\1\u00bc",
            "\1\u00c1\3\uffff\1\u00c0\2\uffff\1\u00bf",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\u00d5\7\uffff\1\137\1\u00d7\1\137\1\u00d8\1\u00d6\1\u00d8\5\uffff\1\136\22\uffff\1\135\1\uffff\1\137\1\u00d7\1\137\1\u00d8\1\u00d6\1\u00d8\5\uffff\1\136",
            "\1\136\1\uffff\1\136\2\uffff\12\u00d9\7\uffff\6\137\32\uffff\6\137",
            "\12\137\7\uffff\3\137\1\u00da\2\137\2\uffff\1\136\27\uffff\3\137\1\u00da\2\137\2\uffff\1\136",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u00db\7\uffff\1\137\1\u00d7\1\137\1\u00d8\1\137\1\u00d8\32\uffff\1\137\1\u00d7\1\137\1\u00d8\1\137\1\u00d8",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00dd",
            "\1\u00de",
            "\12\u00df\7\uffff\6\u00df\32\uffff\6\u00df",
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
            "\1\44\13\uffff\12\44\7\uffff\2\44\1\u00f0\27\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
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
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\u0116\7\uffff\1\137\1\u0118\1\137\1\u0119\1\u0117\1\u0119\5\uffff\1\136\22\uffff\1\135\1\uffff\1\137\1\u0118\1\137\1\u0119\1\u0117\1\u0119\5\uffff\1\136",
            "\1\136\1\uffff\1\136\2\uffff\12\u011a\7\uffff\6\137\32\uffff\6\137",
            "\12\137\7\uffff\3\137\1\u011b\2\137\2\uffff\1\136\27\uffff\3\137\1\u011b\2\137\2\uffff\1\136",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u011c\7\uffff\1\137\1\u0118\1\137\1\u0119\1\137\1\u0119\32\uffff\1\137\1\u0118\1\137\1\u0119\1\137\1\u0119",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u011c\7\uffff\1\137\1\u0118\1\137\1\u0119\1\137\1\u0119\32\uffff\1\137\1\u0118\1\137\1\u0119\1\137\1\u0119",
            "",
            "\1\u011d",
            "\1\u011e",
            "\12\u011f\7\uffff\6\u011f\32\uffff\6\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128\16\uffff\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\u0155\7\uffff\1\137\1\u0157\1\137\1\u0158\1\u0156\1\u0158\5\uffff\1\136\22\uffff\1\135\1\uffff\1\137\1\u0157\1\137\1\u0158\1\u0156\1\u0158\5\uffff\1\136",
            "\1\136\1\uffff\1\136\2\uffff\12\u0159\7\uffff\6\137\32\uffff\6\137",
            "\12\137\7\uffff\3\137\1\u015a\2\137\2\uffff\1\136\27\uffff\3\137\1\u015a\2\137\2\uffff\1\136",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u015b\7\uffff\1\137\1\u0157\1\137\1\u0158\1\137\1\u0158\32\uffff\1\137\1\u0157\1\137\1\u0158\1\137\1\u0158",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u015b\7\uffff\1\137\1\u0157\1\137\1\u0158\1\137\1\u0158\32\uffff\1\137\1\u0157\1\137\1\u0158\1\137\1\u0158",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u015d",
            "\12\u015e\7\uffff\6\u015e\32\uffff\6\u015e",
            "\1\u0160\15\uffff\1\u015f\1\uffff\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\44\13\uffff\12\44\7\uffff\3\44\1\u0166\12\44\1\u0169\1\u0167\1\44\1\u0168\10\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\u017a\26\44",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "",
            "",
            "\1\u018a",
            "\1\u018b",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\12\u0198\7\uffff\1\137\1\u019a\1\137\1\u019b\1\u0199\1\u019b\5\uffff\1\136\22\uffff\1\135\1\uffff\1\137\1\u019a\1\137\1\u019b\1\u0199\1\u019b\5\uffff\1\136",
            "\1\136\1\uffff\1\136\2\uffff\12\u019c\7\uffff\6\137\32\uffff\6\137",
            "\12\137\7\uffff\3\137\1\u019d\2\137\2\uffff\1\136\27\uffff\3\137\1\u019d\2\137\2\uffff\1\136",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u019e\7\uffff\1\137\1\u019a\1\137\1\u019b\1\137\1\u019b\32\uffff\1\137\1\u019a\1\137\1\u019b\1\137\1\u019b",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u019e\7\uffff\1\137\1\u019a\1\137\1\u019b\1\137\1\u019b\32\uffff\1\137\1\u019a\1\137\1\u019b\1\137\1\u019b",
            "",
            "\1\44\13\uffff\12\44\7\uffff\3\44\1\u019f\16\44\1\u01a0\7\44\4\uffff\1\44\1\uffff\32\44",
            "\12\u01a2\7\uffff\6\u01a2\32\uffff\6\u01a2",
            "\1\u01a4\20\uffff\1\u01a3",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\44\13\uffff\12\44\7\uffff\1\u01a8\31\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "",
            "\1\u01be",
            "\1\u01c0\20\uffff\1\u01bf",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\44\13\uffff\12\44\7\uffff\4\44\1\u01d6\1\u01d5\24\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u01d8",
            "\1\u01d9",
            "\12\u01da\7\uffff\1\137\1\u01dc\1\137\1\u01dd\1\u01db\1\u01dd\5\uffff\1\136\22\uffff\1\135\1\uffff\1\137\1\u01dc\1\137\1\u01dd\1\u01db\1\u01dd\5\uffff\1\136",
            "\1\136\1\uffff\1\136\2\uffff\12\u01de\7\uffff\6\137\32\uffff\6\137",
            "\12\137\7\uffff\3\137\1\u01df\2\137\2\uffff\1\136\27\uffff\3\137\1\u01df\2\137\2\uffff\1\136",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u01e0\7\uffff\1\137\1\u01dc\1\137\1\u01dd\1\137\1\u01dd\32\uffff\1\137\1\u01dc\1\137\1\u01dd\1\137\1\u01dd",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u01e0\7\uffff\1\137\1\u01dc\1\137\1\u01dd\1\137\1\u01dd\32\uffff\1\137\1\u01dc\1\137\1\u01dd\1\137\1\u01dd",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "\1\137",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f7\7\uffff\1\u01f6",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "",
            "\1\u0216",
            "\1\u0217",
            "\1\137\2\uffff\12\135\10\uffff\1\136\1\uffff\3\136\5\uffff\1\136\22\uffff\1\135\2\uffff\1\136\1\uffff\3\136\5\uffff\1\136",
            "\1\136\1\uffff\1\u0218\2\uffff\12\136",
            "\1\137\26\uffff\1\136\4\uffff\1\136\32\uffff\1\136\4\uffff\1\136",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0220",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\u0221\26\44",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u023d",
            "\1\u023e",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\44\13\uffff\12\44\7\uffff\21\44\1\u0249\10\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\12\u0250\7\uffff\6\137\32\uffff\6\137",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "",
            "\1\u0257",
            "\1\u0258",
            "",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0267\20\uffff\1\u0266",
            "\1\u0268",
            "\1\u026a\1\u026b\14\uffff\1\u0269",
            "\1\u026c",
            "",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "",
            "\1\u0273",
            "\1\u0274",
            "",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u027b",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u027d",
            "\1\u027e",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\12\u0284\7\uffff\1\137\1\u0285\1\137\1\u0286\1\137\1\u0286\32\uffff\1\137\1\u0285\1\137\1\u0286\1\137\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0294\5\uffff\1\u0293",
            "",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u02a0\3\uffff\1\u029f",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "",
            "\1\44\13\uffff\12\44\7\uffff\15\44\1\u02b1\14\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u02b3",
            "\1\u02b4",
            "",
            "\1\u02b5",
            "\1\u02b6",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u02b8",
            "\12\u02bb\7\uffff\1\137\1\u02b9\1\137\1\u02ba\1\137\1\u02ba\32\uffff\1\137\1\u02b9\1\137\1\u02ba\1\137\1\u02ba",
            "\12\137\7\uffff\3\137\1\u02bc\2\137\2\uffff\1\136\27\uffff\3\137\1\u02bc\2\137\2\uffff\1\136",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "",
            "\1\u02ec",
            "\12\137\7\uffff\3\137\1\u02ed\2\137\2\uffff\1\136\27\uffff\3\137\1\u02ed\2\137\2\uffff\1\136",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\12\u02f0\7\uffff\1\137\1\u02ee\1\137\1\u02ef\1\137\1\u02ef\32\uffff\1\137\1\u02ee\1\137\1\u02ef\1\137\1\u02ef",
            "\12\137\7\uffff\6\137\32\uffff\6\137",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "",
            "",
            "",
            "",
            "",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\137",
            "\1\137\26\uffff\1\136\4\uffff\1\136\32\uffff\1\136\4\uffff\1\136",
            "\1\137",
            "\1\137",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0356",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "",
            "\1\u035e",
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
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0396",
            "\1\u0397",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u039e",
            "\1\u039f",
            "",
            "",
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
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "\1\u03b4",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u03b6",
            "\1\u03b7",
            "",
            "\1\u03b8",
            "\1\u03b9",
            "\1\u03ba",
            "\1\u03bb",
            "",
            "\1\u03bc",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u03be",
            "\1\44\13\uffff\12\44\7\uffff\1\u03bf\31\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u03c1",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u03c3",
            "\1\u03c4",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u03c6",
            "\1\u03c7",
            "\1\u03c8",
            "\1\u03c9",
            "",
            "\1\u03ca",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\u03cf",
            "\1\u03d0",
            "\1\u03d1",
            "\1\u03d2",
            "",
            "\1\u03d3",
            "\1\u03d4",
            "\1\u03d5",
            "\1\u03d6",
            "\1\u03d7",
            "\1\u03d8",
            "\1\u03d9",
            "",
            "\1\44\13\uffff\12\44\7\uffff\22\44\1\u03da\7\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u03dc",
            "",
            "\1\u03dd",
            "",
            "\1\u03de",
            "\1\u03df",
            "",
            "\1\u03e0",
            "\1\u03e1",
            "\1\u03e2",
            "\1\u03e3",
            "\1\u03e4",
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
            "",
            "\1\u03f5",
            "\1\u03f6",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "\1\u03fc",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u03fe",
            "\1\u03ff",
            "\1\u0400",
            "\1\u0401",
            "\1\u0402",
            "\1\u0403",
            "\1\u0404",
            "\1\u0405",
            "\1\u0406",
            "\1\u0407",
            "\1\u0408",
            "\1\u0409",
            "\1\u040a",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u040c",
            "\1\u040d",
            "\1\u040e",
            "\1\u040f",
            "\1\u0410",
            "\1\u0411",
            "\1\u0412",
            "\1\u0413",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0416",
            "\1\u0417",
            "\1\u0418",
            "\1\u0419",
            "\1\u041a",
            "\1\u041b",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u041d",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u041f",
            "\1\u0420",
            "\1\u0421",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0423",
            "\1\u0424",
            "\1\u0425",
            "\1\u0426",
            "\1\u0427",
            "\1\u0428",
            "\1\u0429",
            "\1\u042a",
            "",
            "",
            "\1\u042b",
            "\1\u042c",
            "\1\u042d",
            "\1\u042e",
            "\1\u042f",
            "\1\u0430",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0433",
            "\1\u0434",
            "",
            "\1\u0435",
            "\1\u0436",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0439",
            "\1\u043a",
            "\1\u043b",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u043d",
            "\1\u043e",
            "\1\u043f",
            "\1\44\13\uffff\12\44\7\uffff\4\44\1\u0440\12\44\1\u0442\4\44\1\u0441\5\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0444",
            "\1\u0445",
            "",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0447",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0449",
            "",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u044b",
            "\1\u044c",
            "",
            "\1\u044d",
            "\1\u044e",
            "\1\u044f",
            "\1\u0450",
            "\1\u0451",
            "\1\u0452",
            "",
            "\1\u0453",
            "\1\u0454",
            "",
            "\1\u0455",
            "",
            "\1\u0456",
            "",
            "\1\u0457",
            "\1\u0458",
            "\1\u0459",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u045b",
            "\1\u045c",
            "\1\u045d",
            "\1\u045e",
            "\1\u045f",
            "\1\u0460",
            "\1\u0461",
            "\1\u0462",
            "\1\u0463",
            "\1\u0464",
            "\1\u0465",
            "",
            "\1\u0466",
            "\1\u0467",
            "\1\u0468",
            "\1\u0469",
            "\1\u046a",
            "\1\u046b",
            "\1\u046c",
            "\1\u046d",
            "\1\u046e",
            "\1\u046f",
            "\1\u0470",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0472",
            "\1\u0473",
            "\1\u0474",
            "\1\u0475",
            "\1\u0476",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0478",
            "\1\u0479",
            "\1\u047a",
            "\1\u047b",
            "",
            "\1\u047c",
            "\1\u047d",
            "\1\u047e",
            "\1\u047f",
            "\1\u0480",
            "",
            "\1\u0481",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0484",
            "\1\u0485",
            "\1\u0486",
            "\1\u0487",
            "\1\u0488",
            "\1\u0489",
            "\1\u048a",
            "",
            "",
            "\1\u048b",
            "\1\u048c",
            "\1\u048d",
            "\1\u048e",
            "\1\u048f",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0491",
            "\1\u0492",
            "\1\u0493",
            "\1\u0494",
            "\1\u0495",
            "\1\u0496",
            "",
            "\1\u0497",
            "\1\u0498",
            "\1\u0499",
            "\1\u049a",
            "\1\u049b",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u049d",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u049f",
            "\1\u04a0",
            "\1\u04a1",
            "",
            "\1\u04a2",
            "",
            "\1\u04a3",
            "\1\u04a4",
            "\1\u04a5",
            "\1\u04a6",
            "\1\u04a7",
            "\1\u04a8",
            "\1\u04a9",
            "\1\u04aa",
            "\1\u04ab",
            "\1\u04ac",
            "\1\u04ad",
            "\1\u04ae",
            "\1\u04af",
            "\1\u04b0",
            "\1\u04b1",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u04b3",
            "\1\u04b4",
            "\1\u04b5",
            "",
            "\1\u04b6",
            "\1\u04b7",
            "\1\u04b8",
            "\1\u04b9",
            "\1\u04ba",
            "\1\u04bb",
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
            "\1\u04c9",
            "\1\u04ca",
            "\1\u04cb",
            "\1\u04cc",
            "\1\u04cd",
            "\1\u04ce",
            "\1\u04cf",
            "\1\u04d0",
            "\1\u04d1",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u04d3",
            "\1\u04d4",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            return "1:1: Tokens : ( T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | RULE_ANNOTATION_PROPERTY_TOKEN | RULE_ANNOTATION_TOKEN | RULE_TERMINOLOGY_GRAPH_TOKEN | RULE_BUNDLE_TOKEN | RULE_KIND_TOKEN | RULE_ASPECT_TOKEN | RULE_ABSTRACT_TOKEN | RULE_CONCEPT_TOKEN | RULE_REIFIED_RELATIONSHIP_TOKEN | RULE_UNREIFIED_RELATIONSHIP_TOKEN | RULE_FUNCTIONAL_TOKEN | RULE_INVERSE_FUNCTIONAL_TOKEN | RULE_ESSENTIAL_TOKEN | RULE_INVERSE_ESSENTIAL_TOKEN | RULE_SYMMETRIC_TOKEN | RULE_ASYMMETRIC_TOKEN | RULE_REFLEXIVE_TOKEN | RULE_IRREFLEXIVE_TOKEN | RULE_TRANSITIVE_TOKEN | RULE_UNREIFIED_TOKEN | RULE_INVERSE_TOKEN | RULE_SOURCE_TOKEN | RULE_TARGET_TOKEN | RULE_SCALAR_TOKEN | RULE_STRUCTURE_TOKEN | RULE_DOMAIN_TOKEN | RULE_RANGE_TOKEN | RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN | RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN | RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN | RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN | RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN | RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN | RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN | RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN | RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN | RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN | RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN | RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN | RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN | RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN | RULE_STRING_SCALAR_RESTRICTION_TOKEN | RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN | RULE_BINARY_SCALAR_RESTRICTION_TOKEN | RULE_IRI_SCALAR_RESTRICTION_TOKEN | RULE_TIME_SCALAR_RESTRICTION_TOKEN | RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN | RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN | RULE_LCURLY | RULE_RCURLY | RULE_EQUAL | RULE_STRING | RULE_IRI | RULE_ID | RULE_UUID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='o') ) {s = 1;}

                        else if ( (LA22_0=='c') ) {s = 2;}

                        else if ( (LA22_0=='e') ) {s = 3;}

                        else if ( (LA22_0=='s') ) {s = 4;}

                        else if ( (LA22_0=='d') ) {s = 5;}

                        else if ( (LA22_0=='r') ) {s = 6;}

                        else if ( (LA22_0=='b') ) {s = 7;}

                        else if ( (LA22_0=='n') ) {s = 8;}

                        else if ( (LA22_0=='l') ) {s = 9;}

                        else if ( (LA22_0=='m') ) {s = 10;}

                        else if ( (LA22_0=='p') ) {s = 11;}

                        else if ( (LA22_0=='v') ) {s = 12;}

                        else if ( (LA22_0=='a') ) {s = 13;}

                        else if ( (LA22_0==':') ) {s = 14;}

                        else if ( (LA22_0=='@') ) {s = 15;}

                        else if ( (LA22_0=='t') ) {s = 16;}

                        else if ( (LA22_0=='k') ) {s = 17;}

                        else if ( (LA22_0=='u') ) {s = 18;}

                        else if ( (LA22_0=='f') ) {s = 19;}

                        else if ( (LA22_0=='i') ) {s = 20;}

                        else if ( (LA22_0=='{') ) {s = 21;}

                        else if ( (LA22_0=='}') ) {s = 22;}

                        else if ( (LA22_0=='=') ) {s = 23;}

                        else if ( (LA22_0=='\"') ) {s = 24;}

                        else if ( (LA22_0=='\'') ) {s = 25;}

                        else if ( (LA22_0=='<') ) {s = 26;}

                        else if ( (LA22_0=='^') ) {s = 27;}

                        else if ( ((LA22_0>='A' && LA22_0<='F')) ) {s = 28;}

                        else if ( (LA22_0=='$'||(LA22_0>='G' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='g' && LA22_0<='h')||LA22_0=='j'||LA22_0=='q'||(LA22_0>='w' && LA22_0<='z')) ) {s = 29;}

                        else if ( (LA22_0=='0') ) {s = 30;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 31;}

                        else if ( (LA22_0=='/') ) {s = 32;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 33;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||LA22_0=='#'||(LA22_0>='%' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='.')||LA22_0==';'||(LA22_0>='>' && LA22_0<='?')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_26 = input.LA(1);

                        s = -1;
                        if ( ((LA22_26>='\u0000' && LA22_26<='\uFFFF')) ) {s = 86;}

                        else s = 34;

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