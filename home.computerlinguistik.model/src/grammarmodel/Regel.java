/**
 */
package grammarmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grammarmodel.Regel#getElternterminal <em>Elternterminal</em>}</li>
 *   <li>{@link grammarmodel.Regel#getKinderTerminale <em>Kinder Terminale</em>}</li>
 *   <li>{@link grammarmodel.Regel#getWortart <em>Wortart</em>}</li>
 * </ul>
 * </p>
 *
 * @see grammarmodel.GrammarmodelPackage#getRegel()
 * @model
 * @generated
 */
public interface Regel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elternterminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elternterminal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elternterminal</em>' containment reference.
	 * @see #setElternterminal(NichtTerminal)
	 * @see grammarmodel.GrammarmodelPackage#getRegel_Elternterminal()
	 * @model containment="true"
	 * @generated
	 */
	NichtTerminal getElternterminal();

	/**
	 * Sets the value of the '{@link grammarmodel.Regel#getElternterminal <em>Elternterminal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elternterminal</em>' containment reference.
	 * @see #getElternterminal()
	 * @generated
	 */
	void setElternterminal(NichtTerminal value);

	/**
	 * Returns the value of the '<em><b>Kinder Terminale</b></em>' reference list.
	 * The list contents are of type {@link grammarmodel.NichtTerminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinder Terminale</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinder Terminale</em>' reference list.
	 * @see grammarmodel.GrammarmodelPackage#getRegel_KinderTerminale()
	 * @model
	 * @generated
	 */
	EList<NichtTerminal> getKinderTerminale();

	/**
	 * Returns the value of the '<em><b>Wortart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wortart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wortart</em>' attribute.
	 * @see #setWortart(String)
	 * @see grammarmodel.GrammarmodelPackage#getRegel_Wortart()
	 * @model
	 * @generated
	 */
	String getWortart();

	/**
	 * Sets the value of the '{@link grammarmodel.Regel#getWortart <em>Wortart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wortart</em>' attribute.
	 * @see #getWortart()
	 * @generated
	 */
	void setWortart(String value);

} // Regel
