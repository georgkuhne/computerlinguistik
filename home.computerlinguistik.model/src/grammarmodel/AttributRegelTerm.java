/**
 */
package grammarmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut Regel Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grammarmodel.AttributRegelTerm#getTyp <em>Typ</em>}</li>
 *   <li>{@link grammarmodel.AttributRegelTerm#getWert <em>Wert</em>}</li>
 * </ul>
 * </p>
 *
 * @see grammarmodel.GrammarmodelPackage#getAttributRegelTerm()
 * @model
 * @generated
 */
public interface AttributRegelTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * The literals are from the enumeration {@link grammarmodel.AttributRegelTermTyp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see grammarmodel.AttributRegelTermTyp
	 * @see #setTyp(AttributRegelTermTyp)
	 * @see grammarmodel.GrammarmodelPackage#getAttributRegelTerm_Typ()
	 * @model
	 * @generated
	 */
	AttributRegelTermTyp getTyp();

	/**
	 * Sets the value of the '{@link grammarmodel.AttributRegelTerm#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see grammarmodel.AttributRegelTermTyp
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(AttributRegelTermTyp value);

	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(String)
	 * @see grammarmodel.GrammarmodelPackage#getAttributRegelTerm_Wert()
	 * @model
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link grammarmodel.AttributRegelTerm#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

} // AttributRegelTerm
