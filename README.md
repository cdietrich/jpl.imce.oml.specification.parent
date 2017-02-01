# Composite project for JPL's Integrated Model-Centric Engineering (IMCE) Ontological Modeling Language (OML) Specification

Travis CI: [![Build Status](https://travis-ci.org/JPL-IMCE/jpl.imce.oml.specification.parent.svg?branch=master)](https://travis-ci.org/JPL-IMCE/jpl.imce.oml.specification.parent)

Bintray: [ ![Download](https://api.bintray.com/packages/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2/images/download.svg) ](https://bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2/_latestVersion)

P2: See [jpl.imce.oml.specification.repository/README.md](jpl.imce.oml.specification.repository/README.md)

This composite project comprises several sub-projects:
- [An ecore metamodel for the OML specification](./jpl.imce.oml.specification.ecore)
- [A textual concrete syntax for OML models](./jpl.imce.oml.specification)
- Several projects generated from XCore IDE wizards

## Installation in Eclipse using a version of the [JPL IMCE OML Specification P2](https://bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2) repository

See [jpl.imce.oml.specification.repository/README.md](jpl.imce.oml.specification.repository/README.md)

## Developer Notes

This project is developed using the Eclipse Neon.2 Modeling IDE augmented with:
- XText SDK
- XCore
- CDO
- Buildship (for Eclipse gradle support)

### Caveats

Following the suggestion from [Bugzilla – Bug 469287 (CLOSED WONTFIX)](https://bugs.eclipse.org/bugs/show_bug.cgi?id=469287),
this project includes a copy of the internal gradle plugins that Eclipse buildship uses for building/publishing.

However, following [Eclipse buildship developer setup instructions](https://github.com/eclipse/buildship/blob/master/docs/development/Setup.md) 
turns out to be a non-trivial affair:
- Adding the Java & Groovy nature (and possibly Gradle nature) would be required to get JDT support for
  editing the buildship Java+Groovy scripts in [buildSrc/src/main/groovy](buildSrc/src/main/groovy).
  However, doing so brings a lot of compilation errors; including the fact that without the Gradle 3.3 libraries,
  a lot of imports are unresolved.
  
- The Eclipse buildship support can add gradle nature; however, it doesn't add Gradle 3.3 to the project classpath.
  This means that there is no JDT support for editing gradle scripts!

- Debugging gradle scripts is a mystery.

All of this makes editing gradle scripts very tedious; still, it is overall better than the alternative (i.e. Maven/Tycho)
because Gradle feels like SBT without compile-time type checking and operates in a manner that is functionally similar to SBT.

## Continuous Integration

For continuous integration & development, this project should be buildable from a shell (unix/cygwin) using gradle.
For example, the following will build all sub-projects:

	% cd .../jpl.imce.oml.specification.parent
	% gradle build


It is possible to operate on a particular sub-project, either by switching to that sub-project's directory
or by specifying a sub-project task. To get the gradle syntax for specifying sub-project specific tasks, use:

	% cd .../jpl.imce.oml.specification.parent
	% gradle projects


This should produce something like this:

	:projects
	------------------------------------------------------------
	Root project
	------------------------------------------------------------
	
	Root project 'jpl.imce.oml.specification.parent'jpl.imce.oml.specification/pom.xml
	+--- Project ':jpl.imce.oml.specification'
	+--- Project ':jpl.imce.oml.specification.ecore'
	+--- Project ':jpl.imce.oml.specification.ecore.edit'
	+--- Project ':jpl.imce.oml.specification.ecore.editor'
	+--- Project ':jpl.imce.oml.specification.feature'
	+--- Project ':jpl.imce.oml.specification.ide'
	+--- Project ':jpl.imce.oml.specification.idea'
	+--- Project ':jpl.imce.oml.specification.tests'
	\--- Project ':jpl.imce.oml.specification.web'
	
	To see a list of the tasks of a project, run gradle <project-path>:tasks
	For example, try running gradle :jpl.imce.oml.specification:tasks
	
	BUILD SUCCESSFUL
	
	Total time: 0.674 secs

-

For example, to build the Xcore concrete syntax from the *.xtext & *.xtend sources, either:

	% cd .../jpl.imce.oml.specification.parent
	% gradle :jpl.imce.oml.specification:build

or:

	% cd .../jpl.imce.oml.specification.parent/jpl.imce.oml.specification
	% gradle build

Either way, gradle will use the common settings specified in the parent (this project);
in particular, the repositories for resolving dependencies.

## Versioning

For Tycho projects, there is a useful utility to change all version strings:

```
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=1.2.0
```

This project includes enhancements to [Eclipse Buildship](https://github.com/eclipse/buildship) for automatically updating
the version information in manifests, feature.xml and pom.xml files according to the kind of buildship project.

For changing the version, either:
- update the [gradle.properties](gradle.properties) file.
- override it on the command line with `-Pversion=...`

### BuildDefinitionPlugin

This project includes an enhancement 
of [Eclipse Buildship](https://github.com/eclipse/buildship)'s 
[BuildDefinitionPlugin](https://github.com/eclipse/buildship/blob/master/buildSrc/src/main/groovy/eclipsebuild/BuildDefinitionPlugin.groovy)
to update the `version` setting in `pom.xml` files automatically from the project's version:

- [pom.xml](pom.xml)

### BundlePlugin

This project includes an enhancement 
of [Eclipse Buildship](https://github.com/eclipse/buildship)'s 
[BundlePlugin](https://github.com/eclipse/buildship/blob/master/buildSrc/src/main/groovy/eclipsebuild/BundlePlugin.groovy)
to update the `Bundle-Version` setting in manifests and pom.xml, if any, automatically from the project's version:

- [jpl.imce.oml.specification/META-INF/MANIFEST.MF](jpl.imce.oml.specification/META-INF/MANIFEST.MF) 
- [jpl.imce.oml.specification/pom.xml](jpl.imce.oml.specification/pom.xml)
- [jpl.imce.oml.specification.ecore/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ecore/META-INF/MANIFEST.MF) 
- [jpl.imce.oml.specification.ecore.edit/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ecore.edit/META-INF/MANIFEST.MF) 
- [jpl.imce.oml.specification.ecore.editor/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ecore.editor/META-INF/MANIFEST.MF)
- [jpl.imce.oml.specification.ide/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ide/META-INF/MANIFEST.MF)
- [jpl.imce.oml.specification.ide/pom.xml](jpl.imce.oml.specification.ide/pom.xml)
- [jpl.imce.oml.specification.tests/META-INF/MANIFEST.MF](jpl.imce.oml.specification.tests/META-INF/MANIFEST.MF)
- [jpl.imce.oml.specification.ui/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ui/META-INF/MANIFEST.MF)
- [jpl.imce.oml.specification.ui/pom.xml](jpl.imce.oml.specification.ui/pom.xml)
- [jpl.imce.oml.specification.ui.tests/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ui.tests/META-INF/MANIFEST.MF)
- [jpl.imce.oml.specification.ui.tests/pom.xml](jpl.imce.oml.specification.ui.tests/pom.xml)

### FeaturePlugin

This project includes an enhancement 
of [Eclipse Buildship](https://github.com/eclipse/buildship)'s 
[FeaturePlugin](https://github.com/eclipse/buildship/blob/master/buildSrc/src/main/groovy/eclipsebuild/FeaturePlugin.groovy)
to update the `version` setting in `feature.xml` files automatically from the project's version:

- [jpl.imce.oml.specification.feature/feature.xml](jpl.imce.oml.specification.feature/feature.xml)
- [jpl.imce.oml.specification.feature/pom.xml](jpl.imce.oml.specification.feature/pom.xml)
