
scalaVersion in ThisBuild := "2.11.8"

shellPrompt in ThisBuild := { state => Project.extract(state).currentRef.project + "> " }

lazy val tablesJVM = ProjectRef(file("./gov.nasa.jpl.imce.oml.specification.tables"), "tablesJVM")
lazy val tablesJS = ProjectRef(file("./gov.nasa.jpl.imce.oml.specification.tables"), "tablesJS")
lazy val resolver = ProjectRef(file("./gov.nasa.jpl.oml.specification.resolver"), "oml-specification-resolver")
lazy val parent = project.in(file(".")).aggregate(tablesJS, tablesJVM, resolver)

// the following doesn't work because SBT looks for Scala files in the parent's 'project' folder instead of the sub-project's 'project' folder.
//lazy val tables = project.in(file("./gov.nasa.jpl.imce.oml.specification.tables"))
//lazy val resolver = project.in(file("./gov.nasa.jpl.imce.oml.specification.resolver"))
//lazy val parent = project.in(file(".")).aggregate(tables, resolver)


