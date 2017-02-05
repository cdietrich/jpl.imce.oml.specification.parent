# JPL's Ontological Modeling Language Specification

<!-- Internal Link Definitions -->
[aspect]: ./OML/Aspect.md "OML Aspect"
[axioms]: ./OML/Axiom.md "OML Axiom"
[axiom]: ./OML/Axiom.md "OML Axiom"
[concept]: ./OML/Concept.md "OML Concept"
[concepts]: ./OML/Concept.md "OML Concept"
[data properties]: ./OML/DataProperty.md "OML Data Property"
[data property]: ./OML/DataProperty.md "OML Data Property"
[datarange]: ./OML/DataRange.md "OML DataRange"
[dataranges]: ./OML/DataRange.md "OML DataRange"
[datatype]: ./OML/Datatype.md "OML Datatype"
[datatypes]: ./OML/Datatype.md "OML Datatypes"
[directed binary relationship]: #directed-binary-relationship "OML Directed Binary Relationship"
[entities]: #entity "OML Entities"
[entity]: #entity "OML Entity"
[entity scalar data property]: #entity-scalar-data-property "OML Entity Scalar Data Property"
[entity structured data property]: #entity-structured-data-property "OML Entity Structured Data Property"
[normalized relational tabular schema]: #schema "OML normalized relational tabular schema"
[reified relationship]: #reified-relationship "OML Reified Relationship"
[reified relationships]: #reified-relationship "OML Reified Relationship"
[restricted data range]: #restricted-data-range "OML Restricted Data Range"
[scalar data property]: #scalar-data-property "OML Scalar Data Property"
[scalar]: #scalar "OML Scalar"
[structure]: #structure "OML Structure"
[structured data property]: #structured-data-property "OML Structured Data Property"
[tables.zip]: #tabular-serialization "OML tabular serialization"
[term]: #term "OML Term"
[terms]: #term "OML Term"
[terminology]: #terminology "OML Terminology"
[terminologies]: #terminology "OML Terminology"
[unary relationship]: #unary-relationship "OML Unary Relationship"
[unary relationships]: #unary-relationship "OML Unary Relationship"
[unreified relationship]: #unreified-relationship "OML Unreified Relationship"
[unreified relationships]: #unreified-relationship "OML Unreified Relationship"

[BinaryScalarRestriction]: #BinaryScalarRestriction "OML Binary Scalar Restriction"
[IRIScalarRestriction]: #IRIScalarRestriction "OML IRI Scalar Restriction"
[NumericScalarRestriction]: #NumericScalarRestriction "OML Numeric Scalar Restriction"
[PlainLiteralScalarRestriction]: #[PlainLiteralScalarRestriction] "OML Plain Literal Scalar Restriction"
[StringScalarRestriction]: #StringScalarRestriction "OML String Scalar Restriction"
[TimeScalarRestriction]: #TimeScalarRestriction "OML Time Scalar Restriction"
[SynonymScalarRestriction]: #SynonymScalarRestriction "OML Synonym Scalar Restriction"
[ScalarOneOfRestriction]: #ScalarOneOfRestriction "OML Scalar One Of Restriction"
[ScalarOneOfLiteral]: #ScalarOneOfLiteral "OML Scalar One Of Literal"

[owl:real]: https://www.w3.org/TR/owl2-syntax/#Real_Numbers.2C_Decimal_Numbers.2C_and_Integers "owl:real"
[owl:rational]: https://www.w3.org/TR/owl2-syntax/#Real_Numbers.2C_Decimal_Numbers.2C_and_Integers "owl:rational"

[rdf:PlainLiteral]: http://www.w3.org/TR/2012/REC-rdf-plain-literal-20121211/ "rdf:PlainLiteral"

[xsd:anyURI]: https://www.w3.org/TR/xmlschema11-2/#anyURI "xsd:anyURI"
[xsd:base64Binary]: https://www.w3.org/TR/xmlschema11-2/#base64Binary "xsd:base64Binary"
[xsd:byte]: https://www.w3.org/TR/xmlschema11-2/#byte "xsd:byte"
[xsd:dateTime]: https://www.w3.org/TR/xmlschema11-2/#dateTime "xsd:dateTime"
[xsd:dateTimeStamp]: https://www.w3.org/TR/xmlschema11-2/#dateTimeStamp "xsd:dateTimeStamp"
[xsd:decimal]: https://www.w3.org/TR/xmlschema11-2/#decimal "xsd:decimal"
[xsd:double]: https://www.w3.org/TR/xmlschema11-2/#double "xsd:double"
[xsd:float]: https://www.w3.org/TR/xmlschema11-2/#float "xsd:float"
[xsd:hexBinary]: https://www.w3.org/TR/xmlschema11-2/#hexBinary "xsd:hexBinary"
[xsd:int]: https://www.w3.org/TR/xmlschema11-2/#int "xsd:int"
[xsd:integer]: https://www.w3.org/TR/xmlschema11-2/#integer "xsd:integer"
[xsd:language]: https://www.w3.org/TR/xmlschema11-2/#language "xsd:language"
[xsd:long]: https://www.w3.org/TR/xmlschema11-2/#long "xsd:long"
[xsd:negativeInteger]: https://www.w3.org/TR/xmlschema11-2/#negativeInteger "xsd:negativeInteger"
[xsd:nonNegativeInteger]: https://www.w3.org/TR/xmlschema11-2/#nonNegativeInteger "xsd:nonNegativeInteger"
[xsd:nonPositiveInteger]: https://www.w3.org/TR/xmlschema11-2/#nonPositiveInteger "xsd:nonPositiveInteger"
[xsd:normalizedString]: https://www.w3.org/TR/xmlschema11-2/#normalizedString "xsd:normalizedString"
[xsd:positiveInteger]: https://www.w3.org/TR/xmlschema11-2/#positiveInteger "xsd:positiveInteger"
[xsd:short]: https://www.w3.org/TR/xmlschema11-2/#short "xsd:short"
[xsd:string]: https://www.w3.org/TR/xmlschema11-2/#string "xsd:string"
[xsd:token]: https://www.w3.org/TR/xmlschema11-2/#token "xsd:token"
[xsd:unsignedByte]: https://www.w3.org/TR/xmlschema11-2/#unsignedByte "xsd:unsignedByte"
[xsd:unsignedInt]: https://www.w3.org/TR/xmlschema11-2/#unsignedInt "xsd:unsignedInt"
[xsd:unsignedLong]: https://www.w3.org/TR/xmlschema11-2/#unsignedLong "xsd:unsignedLong"
[xsd:unsignedShort]: https://www.w3.org/TR/xmlschema11-2/#unsignedShort "xsd:unsignedShort"
[xsd:Name]: https://www.w3.org/TR/xmlschema11-2/#Name "xsd:Name"
[xsd:NCName]: https://www.w3.org/TR/xmlschema11-2/#NCName "xsd:NCName"
[xsd:NMTOKEN]: https://www.w3.org/TR/xmlschema11-2/#NMTOKEN "xsd:NMTOKEN"

[rdf:langRange]: https://www.w3.org/TR/rdf-plain-literal/#Definition_of_the_rdf:PlainLiteral_Datatype "rdf:langRange"
[xsd:length]: https://www.w3.org/TR/xmlschema11-2/#rf-length "xsd:length"
[xsd:minExclusive]: https://www.w3.org/TR/xmlschema11-2/#rf-minExclusive "xsd:minExclusive"
[xsd:minInclusive]: https://www.w3.org/TR/xmlschema11-2/#rf-minInclusive "xsd:minInclusive"
[xsd:minLength]: https://www.w3.org/TR/xmlschema11-2/#rf-minLength "xsd:minLength"
[xsd:maxExclusive]: https://www.w3.org/TR/xmlschema11-2/#rf-maxExclusive "xsd:maxExclusive"
[xsd:maxInclusive]: https://www.w3.org/TR/xmlschema11-2/#rf-maxInclusive "xsd:maxInclusive"
[xsd:maxLength]: https://www.w3.org/TR/xmlschema11-2/#rf-maxLength "xsd:maxLength"
[xsd:pattern]: https://www.w3.org/TR/xmlschema11-2/#rf-pattern "xsd:pattern"

<!-- External Link Definitions -->
[external DSL]: https://martinfowler.com/books/dsl.html "External vs Internal DSLs"
[IRI]: https://www.w3.org/TR/owl2-syntax/ "OWL2 IRI"
[OWL2 axioms]: https://www.w3.org/TR/owl2-syntax/#Axioms "OWL2 Axioms"
[OWL2 data range]: https://www.w3.org/TR/owl2-syntax/#Data_Ranges "OWL2 Data Ranges"
[OWL2 data ranges]: https://www.w3.org/TR/owl2-syntax/#Data_Ranges "OWL2 Data Ranges"
[OWL2 datatype]: https://www.w3.org/TR/owl2-syntax/#Data_Ranges "OWL2 Datatype"
[OWL2 Datatype Maps]: https://www.w3.org/TR/owl2-syntax/#Datatype_Maps "OWL2 Datatype Maps"
[OWL2 Datatype Restriction]: https://www.w3.org/TR/owl2-syntax/#Datatype_Restrictions "OWL2 Datatype Maps"
[OWL2 declaration]: https://www.w3.org/TR/owl2-syntax/#Entity_Declarations_and_Typing "OWL2 declarations and typing"
[OWL2 entity]: https://www.w3.org/TR/owl2-syntax/#Entities.2C_Literals.2C_and_Anonymous_Individuals "OWL2 Entity"
[OWL2-DL ontology]: https://www.w3.org/TR/owl2-syntax/#Ontologies "OWL2-DL Ontology"
[OWL2-DL ontologies]: https://www.w3.org/TR/owl2-syntax/#Ontologies "OWL2-DL Ontology"
[OWL 2 Web Ontology Language]: https://www.w3.org/TR/2012/REC-owl2-primer-20121211/ "Ontology Web Language 2 Primer"
[OWL2 Functional Syntax]: http://www.w3.org/TR/owl2-syntax/ "OWL2 Functional Syntax"
[OWL2 RDF/XML]: http://www.w3.org/TR/owl2-mapping-to-rdf/ "OWL2 mapping to RDF"
[OWL2 XML]: http://www.w3.org/TR/owl2-xml-serialization/ "OWL2 XML serialization"
[OWL2-DL]: https://www.w3.org/TR/owl2-syntax/ "Ontology Web Language 2, Structural Specification and Functional Syntax"
[W3C]: https://www.w3.org "World-Wide Web Consortium"
[What is a vocabulary?]: https://www.w3.org/standards/semanticweb/ontology#summary "W3C Semantic Web Summary"

## Overview

The Ontological Modeling Language, OML, is a thin vocabulary extension of [W3C]'s [OWL 2 Web Ontology Language]
designed to support precise and scalable reasoning about descriptive systems engineering models. 

## Vocabularies for Model-Based Systems Engineering

### [What is a vocabulary?]

>
On the Semantic Web, vocabularies define the concepts and relationships (also referred to as “terms”) 
used to describe and represent an area of concern. 
Vocabularies are used to classify the terms that can be used in a particular application, 
characterize possible relationships, and define possible constraints on using those terms. 
In practice, vocabularies can be very complex (with several thousands of terms) 
or very simple (describing one or two concepts only).
There is no clear division between what is referred to as “vocabularies” and “ontologies”. 
The trend is to use the word “ontology” for more complex, and possibly quite formal collection of terms, 
whereas “vocabulary” is used when such strict formalism is not necessarily used or only in a very loose sense. 
Vocabularies are the basic building blocks for inference techniques on the Semantic Web.

### Core constructs of the Ontological Modeling Language 

The core constructs of OML are:
  - [terms] such as concepts and relationships
  - [axioms] about terms
  - [terminologies], collections of terms & axioms


#### Terminology

In terms of the Semantic Web, an OML *terminology* defines a vocabulary as
a collection of OML [axioms] formalizing a collection of OML [terms].

#### Axiom

An OML *axiom* defines a grammar rule for writing well-formed phrases using
the words (OML [terms]) defined in a vocabulary (an OML [terminology]).

#### Term

An OML *term* defines a word in the vocabulary of an OML [terminology].

### The category of OML [terms]

OML *terms* can be categorized in two ways.

#### Categorizing OML *terms* as relations

Formally, OML *terms* are logical relationships categorized by their arity as follows:

- An OML [unary relationship] such as an OML [concept] or 
  an OML [scalar] defines a word intended for describing things 
  whose existence is independent of anything else describable using the vocabulary.
  
  For example, an OML [terminology] for the domain of vehicle registrations 
  in the USA could define a [concept] for `Vehicle` and 
  a [scalar] for `LicensePlateNumber`. This vocabulary would allow systems 
  engineers to use make precise descriptions of state of affairs about `Vehicles` and 
  about `LicensePlateNumbers` independently of any other concern; including their material 
  existence.
  
- A [directed binary relationship] such as a [scalar data property] formalizes a verb word used for describing
  a relationship involving a subject and an object.

  The vehicle registration example above could include a [scalar data property], `hasLicensePlateNumber` 
  with domain `Vehicle` and range `LicensePlateNumber`. 

#### Categorizing OML *terms* by identity criteria

The criteria for identifying instances of OML *terms* leads to the following categories:

- OML *terms* with intrinsic identity semantics

  An instance of an OML [term] with intrinsic identity is uniquely identified via its [IRI].
  Different instances with the same [IRI] are can be replaced with 
  a structurally and logically equivalent single instance with that [IRI].

  OML [terms] with intrinsic identity is the category of OML [entities]:
    - OML [aspect] for defining common characteristics that any kind of OML [entity] can inherit.
    - OML [concept], a kind of OML [unary relationship].
    - OML [reified relationship], a kind of OML [directed binary relationship].
  
- OML *terms* with structural equivalence semantics

  An instance of an OML [term] with structural equivalence is identified by its structure.
  Different instances with equivalent structures can be replaced with 
  a structurally and logically equivalent single instance with that structure.
 
  OML [terms] with structural equivalence are:
  - OML [datatypes] ([scalar] and [structure]), which are kinds of OML [unary relationships].
  - OML [data properties], a kind of OML [directed binary relationship].
  - OML [unreified relationships], a kind of OML [directed binary relationship].

#### Categorizing OML *terms* by relation arity and by identity criteria

Combining the two categorizations yields a 2x2 matrix of OML *terms* as follows:

|Relationship Arity             |Intrinsic Identity            |Structural Equivalence |
|:------------------------------|:-----------------------------|:----------------------|
|[unary relationship]           |[aspect], [concept]           |[datarange], [structure]  |
|[directed binary relationship] |[reified relationship]        |[unreified relationship], [data properties]|

OML [data properties] fall in a 2x2 matrix according to their domain and range as follows:

|[data property]                |range=[datarange]              |range=[structure]                  |
|:------------------------------|:------------------------------|:----------------------------------|
|domain=[entity]                |[entity scalar data property]  |[entity structured data property]  |
|domain=[structure]             |[scalar data property]         |[structured data property]         |

OML [dataranges] map to [OWL2 data ranges] as follows:

|OML [datarange]                |Corresponding [OWL2 data range]    |
|:------------------------------|:----------------------------------|
|[scalar]                       |[OWL2 Datatype]       |
|[restricted data range]        |[OWL2 Datatype Restriction]        |

OML defines several [restricted data ranges] according to the allowable facet restrictions for [OWL2 Datatype Maps] as follows:

|OML [restricted data range]    |Restricted [OWL2 Datatypes]            | Allowed Restriction Facets or Axioms       |
|:------------------------------|:--------------------------------------|--------------------------------------------|
|[BinaryScalarRestriction]      |[xsd:hexBinary], [xsd:base64Binary]    |[xsd:length], [xsd:minLength], [xsd:maxLength]|
|[IRIScalarRestriction]         |[xsd:anyURI]                           |[xsd:length], [xsd:minLength], [xsd:maxLength], [xsd:pattern]|
|[NumericScalarRestriction]     |[owl:real], [owl:rational], [xsd:decimal], [xsd:integer], [xsd:nonNegativeInteger], [xsd:nonPositiveInteger], [xsd:positiveInteger], [xsd:negativeInteger], [xsd:long], [xsd:int], [xsd:short], [xsd:byte], [xsd:unsignedLong], [xsd:unsignedInt], [xsd:unsignedShort], [xsd:unsignedByte], [xsd:double], [xsd:float] |[xsd:minExclusive], [xsd:minInclusive], [xsd:maxExclusive], [xsd:maxInclusive]|
|[PlainLiteralScalarRestriction]|[rdf:PlainLiteral]                     |[rdf:langRange], [xsd:length], [xsd:minLength], [xsd:maxLength], [xsd:pattern]|
|[StringScalarRestriction]      |[xsd:Name], [xsd:NCName], [xsd:NMTOKEN],[xsd:language], [xsd:normalizedString], [xsd:string], [xsd:token] |[xsd:length], [xsd:minLength], [xsd:maxLength], [xsd:pattern]|
|[TimeScalarRestriction]        |[xsd:dateTime], [xsd:dateTimeStamp]    |[xsd:minExclusive], [xsd:minInclusive], [xsd:maxExclusive], [xsd:maxInclusive]|
|[SynonymScalarRestriction]     |Alias for another OML [datarange]      |None|
|[ScalarOneOfRestriction]       |Another OML [datarange]                |Enumeration of [ScalarOneOfLiteral]|



### OML is an [external DSL] with [OWL2-DL] as the host language

The key characteristics between the [external DSL] and the host language are:

- The abstract syntax structure of OML is a restricted subset of the abstract syntax 
  structure of [OWL2-DL], which means that:

   - Every well-formed OML [terminology] has a corresponding external representation as a 
     well-formed [OWL2-DL ontology].
   - A proper subset of well-formed [OWL2-DL ontologies] correspond to well-formed OML [terminologies]. 

- OML defines a [normalized relational tabular schema] for the serialization and interchange 
  of OML [terminologies] with the following guarantees:

   - Every well-formed OML [terminology] has a unique serialization as an OML [tables.zip].

   - The structural difference between two well-formed OML [terminologies] is precisely the set 
     of rows that are added or deleted when comparing their OML [tables.zip] serializations.
     
   - Two well-formed OML [terminologies] are structurally equivalent if and only if
     their OML [tables.zip] serializations are identical.

   - Structurally different OML [terminologies] have external representations as [OWL2-DL] ontologies
     that are structurally different per [OWL2-DL] regardless of the normative serialization 
     used, such as [OWL2 Functional Syntax], [OWL2 RDF/XML], [OWL2 XML].

- The semantics of an OML [terminology] is defined inductively by the structural mapping 
  to the host language, in the following way:

    - An OML [terminology] maps to an [OWL2-DL ontology].

    - An OML [term] of some kind maps to a pattern of [OWL2 axioms] including an [OWL2 
      declaration] for an [OWL2 entity] corresponding to the OML [term].
