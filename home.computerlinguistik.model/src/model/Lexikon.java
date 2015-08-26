/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexikon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Lexikon#getEintraege <em>Eintraege</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getLexikon()
 * @model
 * @generated
 */
public interface Lexikon extends EObject {
	/**
	 * Returns the value of the '<em><b>Eintraege</b></em>' containment reference list.
	 * The list contents are of type {@link model.LexikonEintrag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eintraege</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eintraege</em>' containment reference list.
	 * @see model.ModelPackage#getLexikon_Eintraege()
	 * @model containment="true"
	 * @generated
	 */
	EList<LexikonEintrag> getEintraege();

} // Lexikon
