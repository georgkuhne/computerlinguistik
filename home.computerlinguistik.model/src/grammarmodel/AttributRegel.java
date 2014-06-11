/**
 */
package grammarmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut Regel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grammarmodel.AttributRegel#getRechts <em>Rechts</em>}</li>
 *   <li>{@link grammarmodel.AttributRegel#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see grammarmodel.GrammarmodelPackage#getAttributRegel()
 * @model
 * @generated
 */
public interface AttributRegel extends EObject {
	/**
	 * Returns the value of the '<em><b>Rechts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rechts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rechts</em>' containment reference.
	 * @see #setRechts(AttributRegelTerm)
	 * @see grammarmodel.GrammarmodelPackage#getAttributRegel_Rechts()
	 * @model containment="true"
	 * @generated
	 */
	AttributRegelTerm getRechts();

	/**
	 * Sets the value of the '{@link grammarmodel.AttributRegel#getRechts <em>Rechts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rechts</em>' containment reference.
	 * @see #getRechts()
	 * @generated
	 */
	void setRechts(AttributRegelTerm value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference.
	 * @see #setLinks(AttributRegelTerm)
	 * @see grammarmodel.GrammarmodelPackage#getAttributRegel_Links()
	 * @model containment="true"
	 * @generated
	 */
	AttributRegelTerm getLinks();

	/**
	 * Sets the value of the '{@link grammarmodel.AttributRegel#getLinks <em>Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links</em>' containment reference.
	 * @see #getLinks()
	 * @generated
	 */
	void setLinks(AttributRegelTerm value);

} // AttributRegel
