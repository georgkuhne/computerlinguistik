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
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAnnotiertesTerminalNichtTerminal()
 * @model
 * @generated
 */
public interface AnnotiertesTerminalNichtTerminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Aufwaertspfeil</b></em>' containment reference list.
	 * The list contents are of type {@link model.MerkmalFunktion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aufwaertspfeil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aufwaertspfeil</em>' containment reference list.
	 * @see model.ModelPackage#getAnnotiertesTerminalNichtTerminal_Aufwaertspfeil()
	 * @model containment="true"
	 * @generated
	 */
	EList<MerkmalFunktion> getAufwaertspfeil();

	/**
	 * Returns the value of the '<em><b>Abwaertspfeil</b></em>' containment reference list.
	 * The list contents are of type {@link model.MerkmalFunktion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abwaertspfeil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abwaertspfeil</em>' containment reference list.
	 * @see model.ModelPackage#getAnnotiertesTerminalNichtTerminal_Abwaertspfeil()
	 * @model containment="true"
	 * @generated
	 */
	EList<MerkmalFunktion> getAbwaertspfeil();

} // AnnotiertesTerminalNichtTerminal
