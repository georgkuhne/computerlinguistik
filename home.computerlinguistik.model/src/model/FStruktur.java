/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FStruktur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.FStruktur#getAttributWertePaare <em>Attribut Werte Paare</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFStruktur()
 * @model
 * @generated
 */
public interface FStruktur extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribut Werte Paare</b></em>' containment reference list.
	 * The list contents are of type {@link model.AttributWertePaar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribut Werte Paare</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribut Werte Paare</em>' containment reference list.
	 * @see model.ModelPackage#getFStruktur_AttributWertePaare()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributWertePaar> getAttributWertePaare();

} // FStruktur
