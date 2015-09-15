/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammatik</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Grammatik#getTerminale <em>Terminale</em>}</li>
 *   <li>{@link model.Grammatik#getS0 <em>S0</em>}</li>
 *   <li>{@link model.Grammatik#getNichtTerminale <em>Nicht Terminale</em>}</li>
 *   <li>{@link model.Grammatik#getRegeln <em>Regeln</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getGrammatik()
 * @model
 * @generated
 */
public interface Grammatik extends EObject {
	/**
	 * Returns the value of the '<em><b>Terminale</b></em>' containment reference list.
	 * The list contents are of type {@link model.Terminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminale</em>' containment reference list.
	 * @see model.ModelPackage#getGrammatik_Terminale()
	 * @model containment="true"
	 * @generated
	 */
	EList<Terminal> getTerminale();

	/**
	 * Returns the value of the '<em><b>S0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S0</em>' reference.
	 * @see #setS0(Nichterminal)
	 * @see model.ModelPackage#getGrammatik_S0()
	 * @model
	 * @generated
	 */
	Nichterminal getS0();

	/**
	 * Sets the value of the '{@link model.Grammatik#getS0 <em>S0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S0</em>' reference.
	 * @see #getS0()
	 * @generated
	 */
	void setS0(Nichterminal value);

	/**
	 * Returns the value of the '<em><b>Nicht Terminale</b></em>' containment reference list.
	 * The list contents are of type {@link model.Nichterminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nicht Terminale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nicht Terminale</em>' containment reference list.
	 * @see model.ModelPackage#getGrammatik_NichtTerminale()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nichterminal> getNichtTerminale();

	/**
	 * Returns the value of the '<em><b>Regeln</b></em>' containment reference list.
	 * The list contents are of type {@link model.AbleitungsRegel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regeln</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regeln</em>' containment reference list.
	 * @see model.ModelPackage#getGrammatik_Regeln()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbleitungsRegel> getRegeln();

} // Grammatik
