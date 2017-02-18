# Textual concrete syntax for the Ontological Modeling Language

## Limitations

- No multi-file support

  Although an OML Module must be defined in a single file,
  it should be possible to define referenced modules in other files.
  For example, an OML TerminologyGraph G1 defined in G1.oml could 
  extend an OML TerminologyGraph G2 defined in G2.oml.
  
  The plan to support resolving inter-module cross-references across multiple files
  involves using an OASIS Catalog like what's used for resolving inter-ontology cross-references.
  For OML, resolving cross-references from an OML file in a directory D would involve
  searching starting from D and to D's parent directories for an OASIS catalog file named OML.catalog.xml
  When one such catalog would be found, then it would be used to map the cross-reference IRI to a local OML file,
  which would be loaded in order to resolve the cross reference.  
  
- The formatter does not indent.

  Although the formatter follows the recommendation to use the new AbstractFormatter2 API,
  it doesn't use a dependency injection for the OML GrammarAccess because there is a known
  bug in Xtext 2.10 for building such a formatter in standalone: https://github.com/eclipse/xtext-extras/issues/30
  
  To avoid this bug, the formatter only uses features & keywords; however, this makes it more difficult
  to engineer the desired formatting compared to when it is possible to refer to the nodes based on the grammar
  with the injected GrammarAccess. 
  