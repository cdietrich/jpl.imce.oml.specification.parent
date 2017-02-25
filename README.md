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

This project is developed using two IDEs: Eclipse & Intellij IDEA Ultimate.
It would be nice if a single IDE could handle all the requirements.

### Eclipse Neon.2 

Specifically, the Eclipse Neon.2 Modeling package which includes EMF, CDO, EGIT augmented with the following:
- XText Complete SDK (2.10.0)
- Modeling/EMF - Eclipse Modeling Framework Xcore SDK (1.4.0)
- Modeling/Sirus * (4.1.2)
- Buildship Gradle Integration 2.0
- Scala IDE (4.5.0)

In principle, it should be possible to use Eclipse Oomph to configure
a package with the above; in practice, it is unfortunately not obvious
how to do this despite several attempts. 

What doesn't work:

- No IDE support for developing/debugging gradle build scripts

  The Eclipse Buildship 2.0 supports executing gradle tasks as long as everything works fine.
  
  See: Bugzilla – Bug 469287 (CLOSED WONTFIX)](https://bugs.eclipse.org/bugs/show_bug.cgi?id=469287),
  The workaround involves using IDEA and the [gradle-kotlin-plugin](https://github.com/gradle/gradle-script-kotlin)
  (bleeding edge dependency is better than no working IDE support).
 
- Poor IDE support for developing/debugging SBT build scripts
  
- Location-independent development

  Eclipse metadata files tend to include absolute paths that depend on the development host.
  It is difficult to avoid this problem.
  This project uses support from other build tools (e.g. Gradle, SBT) to generate the Eclipse metadata files 
  which are no longer kept in Github. This requires Eclipse developers to use the appropriate build
  tool to generate these metadata files before importing the project in Eclipse.
  
### Intellij IDEA Ultimate

All the SBT build configuration was developed using IDEA.
The [gov.nasa.jpl.imce.oml.specification.tables] module is a polyglot functional API 
for the normalized relational table schema of the Ontological Modeling Language.
This API is written in Scala; however, it is cross-compiled for both the JVM and Node/JavaScript.
Correspondingly, this SBT project has two sub-projects, `tablesJVM` and `tablesJS` respectively.
Most of the Scala source code is shared; however, some Scala source code is specific to `tablesJVM`
and other to `tablesJS`. There is also some source code in Java and JavaScript.

### Benefits of SBT

It handles a lot of the continuous integration paradigms used across several projects
(see https://github.com/JPL-IMCE). In particular:

- Third-party dependencies are aggregated in a big zip archive.

  In principle, this could be avoided using a powerful Maven repository like Artifactory
  that can be configured for proxying selected artifacts from other repositories.
  In practice, it is still an advanced topic, one that seems to be restricted to a 
  non-public deployment of Artifactory. 
  
  This aggregation in SBT is a simple idea enables Continuous Integration on https://travis-ci.org/jpl-imce.

- Cross building

- Compile-time type checking of build scripts

### Benefits of Gradle

Thanks to the Gradle-based Eclipse Buildship, it is possible to:
- construct a local Mavenized repository from specific Eclipse feature target dependencies
- run all the Xtext/Xtend/Xcore-based code generation 
- build the Eclipse-based projects plugins, features & p2 repos 
- execute the unit tests

### Gradle/Kotlin

Some of the Eclipse Buildship 2.0 scripts were used for this project.
To provide better development/debugging support, the functionality is migrated to gradle/kotlin
using the [gradle-kotlin-plugin](https://github.com/gradle/gradle-script-kotlin).

The particular Gradle distribution used is specified here: 
[gradle/wrapper/gradle-wrapper.properties](gradle/wrapper/gradle-wrapper.properties)

For example::

    distributionUrl=https\://repo.gradle.org/gradle/dist-snapshots/gradle-script-kotlin-3.5-20170224224706+0000-all.zip

The version comes from the Artifactory repository here: 
https://repo.gradle.org/gradle/webapp/#/artifacts/browse/tree/General/dist-snapshots

### Caveats about Eclipse Xtext/Xtend/Xcore

This project depends on Xtext 2.11 for grammar-based formatting
(see: https://github.com/eclipse/xtext-extras/issues/30)

There is a different bug in the EMF generator used by the XcoreGenerator
that prevents using GenModel annotations that would generate Eclipse metadata files
like `plugin.xml` (see: https://www.eclipse.org/forums/index.php?t=msg&th=1084555&goto=1754620&#msg_1754620)

## Continuous Integration

For continuous integration & development, this project should be buildable from a shell (unix/cygwin) using gradle.
The first step involves installing an Eclipse target platform according to the features defined in [tooling-e46.target](tooling-e46.target).

	% cd .../jpl.imce.oml.specification.parent
	% gradle :installTargetPlatform
	
This can take a while....

The target is installed in ` ~/.tooling/eclipse/targetPlatforms/46`

The second step is to build the remaining projects:

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
	
    Root project 'jpl.imce.oml.specification.parent'
    +--- Project ':gov.nasa.jpl.imce.oml.specification.doc'
    +--- Project ':gov.nasa.jpl.imce.oml.specification.scala.generators'
    +--- Project ':jpl.imce.oml.specification'
    +--- Project ':jpl.imce.oml.specification.ecore'
    +--- Project ':jpl.imce.oml.specification.ecore.edit'
    +--- Project ':jpl.imce.oml.specification.ecore.editor'
    +--- Project ':jpl.imce.oml.specification.feature'
    +--- Project ':jpl.imce.oml.specification.ide'
    +--- Project ':jpl.imce.oml.specification.idea'
    +--- Project ':jpl.imce.oml.specification.repository'
    +--- Project ':jpl.imce.oml.specification.tests'
    +--- Project ':jpl.imce.oml.specification.ui'
    +--- Project ':jpl.imce.oml.specification.ui.tests'
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

### Summary

For changing the version, either:
- update the [gradle.properties](gradle.properties) file.
- override it on the command line with `-Pversion=...`

### Details

For Tycho projects, there is a useful utility to change all version strings:

```
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=1.2.0
```

This project includes enhancements to [Eclipse Buildship](https://github.com/eclipse/buildship) for automatically updating
the version information in manifests, feature.xml and pom.xml files according to the kind of buildship project.

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
