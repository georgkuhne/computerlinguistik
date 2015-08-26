/**
 */
package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Wert Typ</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see model.ModelPackage#getWertTyp()
 * @model instanceClass="model.WertTyp"
 * @generated
 */
public enum WertTyp implements Enumerator {
	/**
	 * The '<em><b>Merkmal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERKMAL_VALUE
	 * @generated
	 * @ordered
	 */
	MERKMAL(0, "Merkmal", "Merkmal"),

	/**
	 * The '<em><b>Funktion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNKTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNKTION(1, "Funktion", "Funktion");

	/**
	 * The '<em><b>Merkmal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Merkmal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MERKMAL
	 * @model name="Merkmal"
	 * @generated
	 * @ordered
	 */
	public static final int MERKMAL_VALUE = 0;

	/**
	 * The '<em><b>Funktion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Funktion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNKTION
	 * @model name="Funktion"
	 * @generated
	 * @ordered
	 */
	public static final int FUNKTION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Wert Typ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WertTyp[] VALUES_ARRAY =
		new WertTyp[] {
			MERKMAL,
			FUNKTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Wert Typ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WertTyp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wert Typ</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WertTyp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WertTyp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wert Typ</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WertTyp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WertTyp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wert Typ</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WertTyp get(int value) {
		switch (value) {
			case MERKMAL_VALUE: return MERKMAL;
			case FUNKTION_VALUE: return FUNKTION;
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
	private WertTyp(int value, String name, String literal) {
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
	
} //WertTyp
