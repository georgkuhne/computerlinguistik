/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ableitungs Regel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.AbleitungsRegel#getVon <em>Von</em>}</li>
 *   <li>{@link model.AbleitungsRegel#getAuf <em>Auf</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAbleitungsRegel()
 * @model
 * @generated
 */
public interface AbleitungsRegel extends EObject {
	/**
	 * Returns the value of the '<em><b>Von</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Von</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Von</em>' reference.
	 * @see #setVon(Nichterminal)
	 * @see model.ModelPackage#getAbleitungsRegel_Von()
	 * @model
	 * @generated
	 */
	Nichterminal getVon();

	/**
	 * Sets the value of the '{@link model.AbleitungsRegel#getVon <em>Von</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Von</em>' reference.
	 * @see #getVon()
	 * @generated
	 */
	void setVon(Nichterminal value);

	/**
	 * Returns the value of the '<em><b>Auf</b></em>' reference list.
	 * The list contents are of type {@link model.AnnotiertesTerminalNichtTerminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auf</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auf</em>' reference list.
	 * @see model.ModelPackage#getAbleitungsRegel_Auf()
	 * @model
	 * @generated
	 */
	EList<AnnotiertesTerminalNichtTerminal> getAuf();

} // AbleitungsRegel
