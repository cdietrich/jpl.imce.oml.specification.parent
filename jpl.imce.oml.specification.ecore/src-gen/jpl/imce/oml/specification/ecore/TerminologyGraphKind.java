/**
 * 
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package jpl.imce.oml.specification.ecore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Terminology Graph Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyGraphKind()
 * @model
 * @generated
 */
public enum TerminologyGraphKind implements Enumerator {
	/**
	 * The '<em><b>Open World Definitions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_WORLD_DEFINITIONS_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_WORLD_DEFINITIONS(0, "OpenWorldDefinitions", "OpenWorldDefinitions"),

	/**
	 * The '<em><b>Closed World Designations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_WORLD_DESIGNATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_WORLD_DESIGNATIONS(0, "ClosedWorldDesignations", "ClosedWorldDesignations");

	/**
	 * The '<em><b>Open World Definitions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entity in an OpenWorldDefinition terminology corresponds to a classifier for describing
	 * a collection of things in the real world where all the things in that collection
	 * exhibit all the capabilities of that entity such as the relationships & data properties that the entity can be invovled in.
	 * 
	 * A taxonomy of entities in an open world definition terminology can be further enriched in other open world definition terminologies.
	 * For example, such a terminology A could define concepts X and Y could assert that X specializes Y.
	 * Another such terminology B could extend A and could define concept Z and could assert that X specializes Z and that Z specializes Y.
	 * In effect, B inserts in A's taxonomy of X,Y a new concept Z.
	 * This is allowed only for open world terminologies.
	 * <!-- end-model-doc -->
	 * @see #OPEN_WORLD_DEFINITIONS
	 * @model name="OpenWorldDefinitions"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_WORLD_DEFINITIONS_VALUE = 0;

	/**
	 * The '<em><b>Closed World Designations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entity in a ClosedWorldDesignation terminology corresponds to a unique thing in the real world.
	 * The identity of closed-world designation entities can be specified using annotations (e.g., serial numbers, unique identifiers, ...)
	 * Each instance of an entity corresponds to modeling a particular state of affairs of the thing correspondign to that entity.
	 * <!-- end-model-doc -->
	 * @see #CLOSED_WORLD_DESIGNATIONS
	 * @model name="ClosedWorldDesignations"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_WORLD_DESIGNATIONS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Terminology Graph Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TerminologyGraphKind[] VALUES_ARRAY =
		new TerminologyGraphKind[] {
			OPEN_WORLD_DEFINITIONS,
			CLOSED_WORLD_DESIGNATIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>Terminology Graph Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TerminologyGraphKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Terminology Graph Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TerminologyGraphKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TerminologyGraphKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Terminology Graph Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TerminologyGraphKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TerminologyGraphKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Terminology Graph Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TerminologyGraphKind get(int value) {
		switch (value) {
			case OPEN_WORLD_DEFINITIONS_VALUE: return OPEN_WORLD_DEFINITIONS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TerminologyGraphKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TerminologyGraphKind
