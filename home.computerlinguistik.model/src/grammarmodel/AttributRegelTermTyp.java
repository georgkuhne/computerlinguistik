/**
 */
package grammarmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribut Regel Term Typ</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see grammarmodel.GrammarmodelPackage#getAttributRegelTermTyp()
 * @model
 * @generated
 */
public enum AttributRegelTermTyp implements Enumerator {
	/**
	 * The '<em><b>Oben</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBEN_VALUE
	 * @generated
	 * @ordered
	 */
	OBEN(0, "Oben", "Oben"),

	/**
	 * The '<em><b>Unten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNTEN_VALUE
	 * @generated
	 * @ordered
	 */
	UNTEN(1, "Unten", "Unten"),

	/**
	 * The '<em><b>Konstante</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KONSTANTE_VALUE
	 * @generated
	 * @ordered
	 */
	KONSTANTE(2, "Konstante", "Konstante");

	/**
	 * The '<em><b>Oben</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oben</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBEN
	 * @model name="Oben"
	 * @generated
	 * @ordered
	 */
	public static final int OBEN_VALUE = 0;

	/**
	 * The '<em><b>Unten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unten</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNTEN
	 * @model name="Unten"
	 * @generated
	 * @ordered
	 */
	public static final int UNTEN_VALUE = 1;

	/**
	 * The '<em><b>Konstante</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Konstante</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KONSTANTE
	 * @model name="Konstante"
	 * @generated
	 * @ordered
	 */
	public static final int KONSTANTE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Attribut Regel Term Typ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributRegelTermTyp[] VALUES_ARRAY =
		new AttributRegelTermTyp[] {
			OBEN,
			UNTEN,
			KONSTANTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribut Regel Term Typ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributRegelTermTyp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribut Regel Term Typ</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributRegelTermTyp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributRegelTermTyp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribut Regel Term Typ</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributRegelTermTyp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributRegelTermTyp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribut Regel Term Typ</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributRegelTermTyp get(int value) {
		switch (value) {
			case OBEN_VALUE: return OBEN;
			case UNTEN_VALUE: return UNTEN;
			case KONSTANTE_VALUE: return KONSTANTE;
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
	private AttributRegelTermTyp(int value, String name, String literal) {
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
	
} //AttributRegelTermTyp
