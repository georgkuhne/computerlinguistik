/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexikon Eintrag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.LexikonEintrag#getName <em>Name</em>}</li>
 *   <li>{@link model.LexikonEintrag#getWortart <em>Wortart</em>}</li>
 *   <li>{@link model.LexikonEintrag#getAuspraegungen <em>Auspraegungen</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getLexikonEintrag()
 * @model
 * @generated
 */
public interface LexikonEintrag extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getLexikonEintrag_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.LexikonEintrag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Wortart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wortart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wortart</em>' reference.
	 * @see #setWortart(Terminal)
	 * @see model.ModelPackage#getLexikonEintrag_Wortart()
	 * @model
	 * @generated
	 */
	Terminal getWortart();

	/**
	 * Sets the value of the '{@link model.LexikonEintrag#getWortart <em>Wortart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wortart</em>' reference.
	 * @see #getWortart()
	 * @generated
	 */
	void setWortart(Terminal value);

	/**
	 * Returns the value of the '<em><b>Auspraegungen</b></em>' containment reference list.
	 * The list contents are of type {@link model.FStruktur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auspraegungen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auspraegungen</em>' containment reference list.
	 * @see model.ModelPackage#getLexikonEintrag_Auspraegungen()
	 * @model containment="true"
	 * @generated
	 */
	EList<FStruktur> getAuspraegungen();

} // LexikonEintrag
