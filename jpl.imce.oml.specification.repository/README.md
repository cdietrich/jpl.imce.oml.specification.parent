# Publishing JPL's OML to Bintray

This uses the [gradle-bintray-plugin](https://github.com/bintray/gradle-bintray-plugin) to simplify considerably the process.

## Adding JPL's OML P2 update site in Eclipse

Bintray web interface:
[https://bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2](https://bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2)

Bintray P2 repo prefix:
[https://dl.bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2/](https://dl.bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2/)

To install JPL's OML specification features in Eclipse, use the Bintray P2 repo prefix and append a particular version.
Example: [https://dl.bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2/0.2.0](https://dl.bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2/0.2.0)

Note that you can find out the contents of a particular version of a repo using [Eclipse' P2 director application](http://help.eclipse.org/neon/index.jsp?topic=/org.eclipse.platform.doc.isv/guide/p2_director.html).
For example:

    ./eclipse \
      -nosplash \
      -consoleLog \
      -application org.eclipse.equinox.p2.director \
      -list \
      -repository https://dl.bintray.com/jpl-imce/gov.nasa.jpl.imce.p2/jpl.imce.oml.specification.p2/0.2.0
