/**
 */
package gov.nasa.jpl.imce.oml.specification.scala.generators;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Terminology Thing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMLSpecificationTablesGeneratorTest extends TestCase {

	public OMLSpecificationTablesGeneratorTest(String name) {
		super(name);
	}

	public void testGenerate() {
		new OMLSpecificationTablesGenerator().generate();
	}

}