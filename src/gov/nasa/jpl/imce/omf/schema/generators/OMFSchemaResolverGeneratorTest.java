/**
 */
package gov.nasa.jpl.imce.omf.schema.generators;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Terminology Thing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMFSchemaResolverGeneratorTest extends TestCase {

	public OMFSchemaResolverGeneratorTest(String name) {
		super(name);
	}

	public void testGenerate() {
		new OMFSchemaResolverGenerator().generate();
	}

}