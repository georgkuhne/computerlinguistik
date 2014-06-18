/**
 */
package home.computerlinguistik.lexiconmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subkategorisierung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Subkategorisierung#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Subkategorisierung#getAuspraegungenContainer <em>Auspraegungen Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getSubkategorisierung()
 * @model
 * @generated
 */
public interface Subkategorisierung extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bezeichnung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' attribute.
	 * @see #setBezeichnung(String)
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getSubkategorisierung_Bezeichnung()
	 * @model
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link home.computerlinguistik.lexiconmodel.Subkategorisierung#getBezeichnung <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Auspraegungen Container</b></em>' containment reference list.
	 * The list contents are of type {@link home.computerlinguistik.lexiconmodel.AuspraegungenContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auspraegungen Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auspraegungen Container</em>' containment reference list.
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getSubkategorisierung_AuspraegungenContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuspraegungenContainer> getAuspraegungenContainer();

} // Subkategorisierung
