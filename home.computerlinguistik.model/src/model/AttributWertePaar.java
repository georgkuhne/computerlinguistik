/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut Werte Paar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.AttributWertePaar#getWertTyp <em>Wert Typ</em>}</li>
 *   <li>{@link model.AttributWertePaar#getFunktion <em>Funktion</em>}</li>
 *   <li>{@link model.AttributWertePaar#getFunktionsWert <em>Funktions Wert</em>}</li>
 *   <li>{@link model.AttributWertePaar#getMerkmal <em>Merkmal</em>}</li>
 *   <li>{@link model.AttributWertePaar#getMerkmalsWert <em>Merkmals Wert</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAttributWertePaar()
 * @model
 * @generated
 */
public interface AttributWertePaar extends EObject {
	/**
	 * Returns the value of the '<em><b>Wert Typ</b></em>' attribute.
	 * The default value is <code>"Merkmal"</code>.
	 * The literals are from the enumeration {@link model.WertTyp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wert Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert Typ</em>' attribute.
	 * @see model.WertTyp
	 * @see #setWertTyp(WertTyp)
	 * @see model.ModelPackage#getAttributWertePaar_WertTyp()
	 * @model default="Merkmal" dataType="model.WertTyp"
	 * @generated
	 */
	WertTyp getWertTyp();

	/**
	 * Sets the value of the '{@link model.AttributWertePaar#getWertTyp <em>Wert Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert Typ</em>' attribute.
	 * @see model.WertTyp
	 * @see #getWertTyp()
	 * @generated
	 */
	void setWertTyp(WertTyp value);

	/**
	 * Returns the value of the '<em><b>Funktion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funktion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funktion</em>' reference.
	 * @see #setFunktion(Funktion)
	 * @see model.ModelPackage#getAttributWertePaar_Funktion()
	 * @model
	 * @generated
	 */
	Funktion getFunktion();

	/**
	 * Sets the value of the '{@link model.AttributWertePaar#getFunktion <em>Funktion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funktion</em>' reference.
	 * @see #getFunktion()
	 * @generated
	 */
	void setFunktion(Funktion value);

	/**
	 * Returns the value of the '<em><b>Funktions Wert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funktions Wert</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funktions Wert</em>' containment reference.
	 * @see #setFunktionsWert(FStruktur)
	 * @see model.ModelPackage#getAttributWertePaar_FunktionsWert()
	 * @model containment="true"
	 * @generated
	 */
	FStruktur getFunktionsWert();

	/**
	 * Sets the value of the '{@link model.AttributWertePaar#getFunktionsWert <em>Funktions Wert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funktions Wert</em>' containment reference.
	 * @see #getFunktionsWert()
	 * @generated
	 */
	void setFunktionsWert(FStruktur value);

	/**
	 * Returns the value of the '<em><b>Merkmal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merkmal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merkmal</em>' reference.
	 * @see #setMerkmal(Merkmal)
	 * @see model.ModelPackage#getAttributWertePaar_Merkmal()
	 * @model
	 * @generated
	 */
	Merkmal getMerkmal();

	/**
	 * Sets the value of the '{@link model.AttributWertePaar#getMerkmal <em>Merkmal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merkmal</em>' reference.
	 * @see #getMerkmal()
	 * @generated
	 */
	void setMerkmal(Merkmal value);

	/**
	 * Returns the value of the '<em><b>Merkmals Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merkmals Wert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merkmals Wert</em>' attribute.
	 * @see #setMerkmalsWert(String)
	 * @see model.ModelPackage#getAttributWertePaar_MerkmalsWert()
	 * @model
	 * @generated
	 */
	String getMerkmalsWert();

	/**
	 * Sets the value of the '{@link model.AttributWertePaar#getMerkmalsWert <em>Merkmals Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merkmals Wert</em>' attribute.
	 * @see #getMerkmalsWert()
	 * @generated
	 */
	void setMerkmalsWert(String value);

} // AttributWertePaar
