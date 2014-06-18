/**
 */
package home.computerlinguistik.lexiconmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Wortart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getWortart()
 * @model
 * @generated
 */
public enum Wortart implements Enumerator {
	/**
	 * The '<em><b>Nomen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOMEN_VALUE
	 * @generated
	 * @ordered
	 */
	NOMEN(0, "Nomen", "Nomen"), /**
	 * The '<em><b>Adjektiv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJEKTIV_VALUE
	 * @generated
	 * @ordered
	 */
	ADJEKTIV(1, "Adjektiv", "Adjektiv"), /**
	 * The '<em><b>Verb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERB_VALUE
	 * @generated
	 * @ordered
	 */
	VERB(2, "Verb", "Verb"), /**
	 * The '<em><b>Adverb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVERB_VALUE
	 * @generated
	 * @ordered
	 */
	ADVERB(3, "Adverb", "Adverb"), /**
	 * The '<em><b>Pronomen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRONOMEN_VALUE
	 * @generated
	 * @ordered
	 */
	PRONOMEN(4, "Pronomen", "Pronomen"), /**
	 * The '<em><b>Numerale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERALE_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERALE(5, "Numerale", "Numerale"), /**
	 * The '<em><b>Artikel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTIKEL_VALUE
	 * @generated
	 * @ordered
	 */
	ARTIKEL(6, "Artikel", "Artikel"), /**
	 * The '<em><b>Praeposition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRAEPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	PRAEPOSITION(7, "Praeposition", "Praeposition"), /**
	 * The '<em><b>Junktoren</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNKTOREN_VALUE
	 * @generated
	 * @ordered
	 */
	JUNKTOREN(9, "Junktoren", "Junktoren"), /**
	 * The '<em><b>Interjektion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERJEKTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERJEKTION(10, "Interjektion", "Interjektion"), /**
	 * The '<em><b>Partikel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIKEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIKEL(11, "Partikel", "Partikel");

	/**
	 * The '<em><b>Nomen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nomen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOMEN
	 * @model name="Nomen"
	 * @generated
	 * @ordered
	 */
	public static final int NOMEN_VALUE = 0;

	/**
	 * The '<em><b>Adjektiv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adjektiv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJEKTIV
	 * @model name="Adjektiv"
	 * @generated
	 * @ordered
	 */
	public static final int ADJEKTIV_VALUE = 1;

	/**
	 * The '<em><b>Verb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERB
	 * @model name="Verb"
	 * @generated
	 * @ordered
	 */
	public static final int VERB_VALUE = 2;

	/**
	 * The '<em><b>Adverb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adverb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADVERB
	 * @model name="Adverb"
	 * @generated
	 * @ordered
	 */
	public static final int ADVERB_VALUE = 3;

	/**
	 * The '<em><b>Pronomen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pronomen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRONOMEN
	 * @model name="Pronomen"
	 * @generated
	 * @ordered
	 */
	public static final int PRONOMEN_VALUE = 4;

	/**
	 * The '<em><b>Numerale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numerale</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERALE
	 * @model name="Numerale"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERALE_VALUE = 5;

	/**
	 * The '<em><b>Artikel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Artikel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARTIKEL
	 * @model name="Artikel"
	 * @generated
	 * @ordered
	 */
	public static final int ARTIKEL_VALUE = 6;

	/**
	 * The '<em><b>Praeposition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Praeposition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRAEPOSITION
	 * @model name="Praeposition"
	 * @generated
	 * @ordered
	 */
	public static final int PRAEPOSITION_VALUE = 7;

	/**
	 * The '<em><b>Junktoren</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Junktoren</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUNKTOREN
	 * @model name="Junktoren"
	 * @generated
	 * @ordered
	 */
	public static final int JUNKTOREN_VALUE = 9;

	/**
	 * The '<em><b>Interjektion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interjektion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERJEKTION
	 * @model name="Interjektion"
	 * @generated
	 * @ordered
	 */
	public static final int INTERJEKTION_VALUE = 10;

	/**
	 * The '<em><b>Partikel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partikel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIKEL
	 * @model name="Partikel"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIKEL_VALUE = 11;

	/**
	 * An array of all the '<em><b>Wortart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Wortart[] VALUES_ARRAY =
		new Wortart[] {
			NOMEN,
			ADJEKTIV,
			VERB,
			ADVERB,
			PRONOMEN,
			NUMERALE,
			ARTIKEL,
			PRAEPOSITION,
			JUNKTOREN,
			INTERJEKTION,
			PARTIKEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Wortart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Wortart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wortart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Wortart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Wortart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wortart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Wortart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Wortart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wortart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Wortart get(int value) {
		switch (value) {
			case NOMEN_VALUE: return NOMEN;
			case ADJEKTIV_VALUE: return ADJEKTIV;
			case VERB_VALUE: return VERB;
			case ADVERB_VALUE: return ADVERB;
			case PRONOMEN_VALUE: return PRONOMEN;
			case NUMERALE_VALUE: return NUMERALE;
			case ARTIKEL_VALUE: return ARTIKEL;
			case PRAEPOSITION_VALUE: return PRAEPOSITION;
			case JUNKTOREN_VALUE: return JUNKTOREN;
			case INTERJEKTION_VALUE: return INTERJEKTION;
			case PARTIKEL_VALUE: return PARTIKEL;
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
	private Wortart(int value, String name, String literal) {
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
	
} //Wortart
