define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "ConceptInstance|DataStructureTuple|ReifiedRelationshipInstance|ReifiedRelationshipInstanceDomain|ReifiedRelationshipInstanceRange|ScalarDataPropertyValue|StructuredDataPropertyValue|UnreifiedRelationshipInstanceTuple|axiom|bundledTerminology|closed|dataStructureType|designatedConcept|designatedTerminology|disjointLeaf|disjointTaxonomyParent|entityScalarDataProperty|entityStructuredDataProperty|final|langRange|length|literalValue|maxExclusive|maxInclusive|maxLength|minExclusive|minInclusive|minLength|nestingContext|nestingTerminology|open|partial|pattern|reifiedRelationshipInstance|restrictedDomain|restrictedEntity|restrictedRange|restrictedRelation|root|scalarDataProperty|scalarProperty|scalarPropertyValue|scalarRestriction|singletonConceptClassifier|singletonReifiedRelationshipClassifier|structuredDataProperty|structuredPropertyTuple|value";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/oml";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
