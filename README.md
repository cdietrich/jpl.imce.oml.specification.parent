# Composite project for JPL's Integrated Model-Centric Engineering (IMCE) Ontological Modeling Language (OML) Specification

This is a simplified multi-module project for the Ontological Modeling Language.

In principle, it would be best if the generated files were included in GIT
such that a successful build would re-generate these without any differences.

Unfortuantely, this is not the case for two reasons:
- equivalent content but different order after generation
  (e.g., `.classpath`, `.project`, `.settings/*`)

- content includes references to platform-specific files
  (e.g., the `jpl.imce.oml.specification.ecore/.classpath` file has several entries that refer 
  to the absolute path of files in the "mavenized" eclipse p2 repository created from [tooling-e46.target])
  
Contents:

- [tooling-e46.target]

  This is an eclipse target definition based on Eclipse Neon for several features;
  in particular Xtext 2.11; which provides some important fixes for Xtext 2.10
  where grammar-based formatting doesn't compile cleanly outside of Eclipse.

- [buildSrc]

  This is a copy of the Eclipse Buildship gradle scripts which were the best example I could find
  of building Eclipse plugins & features based on a target definition and publishing a p2 repository
  to bintray.
  
- [jpl.imce.oml.specification.ecore]

  To simplify the build, there is a single Xcore metamodel: [jpl.imce.oml.specification.ecore/model/OMLSpecification.xcore]
  (It is unclear whether it is possible to have multiple Xcore metamodels).
  
  The main problem is how to generate the ecore file like the Eclipse IDE builder does.
  
- [jpl.imce.oml.specification]

  This is an Xtext grammar for the OML metamodel.
  The formatting based on the new AbstractFormatter2 is the key reason to switch to Xtext 2.11
  so that the formatter can use grammar access and build from gradle.
  
  The indentation *used* to work in Xtext 2.10 in the IDE; after refactoring to use keywords only
  (no grammar access); it no longer works. It is unclear why.
  
- [jpl.imce.oml.specification.tests]

  The intent is to have OML unit tests in separate files (see: [jpl.imce.oml.specification.tests/resources/ModuleTests])
  to simplify unit tests with the [com.itemis.xtext.testing](https://github.com/itemis/xtext-testing) plugin
  and to enable including OML files as examples for the specification document.
  
  
  