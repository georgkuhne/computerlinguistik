/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotiertes Terminal Nicht Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.AnnotiertesTerminalNichtTerminal#getAufwaertspfeil <em>Aufwaertspfeil</em>}</li>
 *   <li>{@link model.AnnotiertesTerminalNichtTerminal#getAbwaertspfeil <em>Abwaertspfeil</em>}</li>
 *   <li>{@link model.AnnotiertesTerminalNichtTerminal#getTerminalNichtTerminal <em>Terminal Nicht Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAnnotiertesTerminalNichtTerminal()
 * @model
 * @generated
 */
public interface AnnotiertesTerminalNichtTerminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Aufwaertspfeil</b></em>' reference list.
	 * The list contents are of type {@link model.MerkmalFunktion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aufwaertspfeil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aufwaertspfeil</em>' reference list.
	 * @see model.ModelPackage#getAnnotiertesTerminalNichtTerminal_Aufwaertspfeil()
	 * @model
	 * @generated
	 */
	EList<MerkmalFunktion> getAufwaertspfeil();

	/**
	 * Returns the value of the '<em><b>Abwaertspfeil</b></em>' reference list.
	 * The list contents are of type {@link model.MerkmalFunktion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abwaertspfeil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abwaertspfeil</em>' reference list.
	 * @see model.ModelPackage#getAnnotiertesTerminalNichtTerminal_Abwaertspfeil()
	 * @model
	 * @generated
	 */
	EList<MerkmalFunktion> getAbwaertspfeil();

	/**
	 * Returns the value of the '<em><b>Terminal Nicht Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Nicht Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Nicht Terminal</em>' reference.
	 * @see #setTerminalNichtTerminal(TerminalNichtTerminal)
	 * @see model.ModelPackage#getAnnotiertesTerminalNichtTerminal_TerminalNichtTerminal()
	 * @model
	 * @generated
	 */
	TerminalNichtTerminal getTerminalNichtTerminal();

	/**
	 * Sets the value of the '{@link model.AnnotiertesTerminalNichtTerminal#getTerminalNichtTerminal <em>Terminal Nicht Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Nicht Terminal</em>' reference.
	 * @see #getTerminalNichtTerminal()
	 * @generated
	 */
	void setTerminalNichtTerminal(TerminalNichtTerminal value);

} // AnnotiertesTerminalNichtTerminal
