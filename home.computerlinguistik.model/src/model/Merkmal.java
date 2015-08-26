/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merkmal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Merkmal#getMoeglicheWerte <em>Moegliche Werte</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getMerkmal()
 * @model
 * @generated
 */
public interface Merkmal extends MerkmalFunktion {
	/**
	 * Returns the value of the '<em><b>Moegliche Werte</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moegliche Werte</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moegliche Werte</em>' attribute list.
	 * @see model.ModelPackage#getMerkmal_MoeglicheWerte()
	 * @model
	 * @generated
	 */
	EList<String> getMoeglicheWerte();

} // Merkmal
