# Composite project for JPL's Integrated Model-Centric Engineering (IMCE) Ontological Modeling Language (OML) Specification

Travis CI: [![Build Status](https://travis-ci.org/JPL-IMCE/jpl.imce.oml.specification.parent.svg?branch=master)](https://travis-ci.org/JPL-IMCE/jpl.imce.oml.specification.parent)

Bintray: [ ![Download](https://api.bintray.com/packages/jpl-imce/gov.nasa.jpl.imce/jpl.imce.oml.specification.parent/images/download.svg) ](https://bintray.com/jpl-imce/gov.nasa.jpl.imce/jpl.imce.oml.specification.parent/_latestVersion)

This composite project comprises several sub-projects:
- [An ecore metamodel for the OML specification](./jpl.imce.oml.specification.ecore)
- [A textual concrete syntax for OML models](./jpl.imce.oml.specification)
- Several projects generated from XCore IDE wizards

## Developer Notes

This project is developed using the Eclipse Neon.2 Modeling IDE augmented with:
- XText SDK
- XCore
- CDO
- Buildship (for Eclipse gradle support)

Following the suggestion from [Bugzilla – Bug 469287 (CLOSED WONTFIX)](https://bugs.eclipse.org/bugs/show_bug.cgi?id=469287),
this project includes a copy of the internal gradle plugins that Eclipse buildship uses for building/publishing.

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

For buildship, the version info in [version.txt](version.txt) propagates to other build.gradle files.
However, several files need to be kept in sync:

- [version.txt](version.txt) (it would be nice if this could be 'injected' in other files below...)
- [build.gradle](build.gradle)
- [pom.xml](pom.xml)

- [jpl.imce.oml.specification/pom.xml](jpl.imce.oml.specification/pom.xml)
- [jpl.imce.oml.specification/META-INF/MANIFEST.MF](jpl.imce.oml.specification/META-INF/MANIFEST.MF) 

- [jpl.imce.oml.specification.ecore/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ecore/META-INF/MANIFEST.MF) 

- [jpl.imce.oml.specification.ecore.edit/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ecore.edit/META-INF/MANIFEST.MF) 

- [jpl.imce.oml.specification.ecore.editor/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ecore.editor/META-INF/MANIFEST.MF)

- [jpl.imce.oml.specification.feature/feature.xml](jpl.imce.oml.specification.feature/feature.xml)
- [jpl.imce.oml.specification.feature/pom.xml](jpl.imce.oml.specification.feature/pom.xml)

- [jpl.imce.oml.specification.ide/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ide/META-INF/MANIFEST.MF)
- [jpl.imce.oml.specification.ide/pom.xml](jpl.imce.oml.specification.ide/pom.xml)

- [jpl.imce.oml.specification.repository/build.gradle](jpl.imce.oml.specification.repository/build.gradle)
- [jpl.imce.oml.specification.repository/pom.xml](jpl.imce.oml.specification.repository/pom.xml)

- [jpl.imce.oml.specification.target/pom.xml](jpl.imce.oml.specification.target/pom.xml)

- [jpl.imce.oml.specification.tests/META-INF/MANIFEST.MF](jpl.imce.oml.specification.tests/META-INF/MANIFEST.MF)

- [jpl.imce.oml.specification.ui/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ui/META-INF/MANIFEST.MF)
- [jpl.imce.oml.specification.ui/pom.xml](jpl.imce.oml.specification.ui/pom.xml)

- [jpl.imce.oml.specification.ui.tests/META-INF/MANIFEST.MF](jpl.imce.oml.specification.ui.tests/META-INF/MANIFEST.MF)
- [jpl.imce.oml.specification.ui.tests/pom.xml](jpl.imce.oml.specification.ui.tests/pom.xml)
