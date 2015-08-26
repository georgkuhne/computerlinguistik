/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexikalisch Funktionale Grammatik</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.LexikalischFunktionaleGrammatik#getFunktionen <em>Funktionen</em>}</li>
 *   <li>{@link model.LexikalischFunktionaleGrammatik#getMerkmale <em>Merkmale</em>}</li>
 *   <li>{@link model.LexikalischFunktionaleGrammatik#getGrammatik <em>Grammatik</em>}</li>
 *   <li>{@link model.LexikalischFunktionaleGrammatik#getLexikon <em>Lexikon</em>}</li>
 *   <li>{@link model.LexikalischFunktionaleGrammatik#getID <em>ID</em>}</li>
 *   <li>{@link model.LexikalischFunktionaleGrammatik#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getLexikalischFunktionaleGrammatik()
 * @model
 * @generated
 */
public interface LexikalischFunktionaleGrammatik extends EObject {
	/**
	 * Returns the value of the '<em><b>Funktionen</b></em>' containment reference list.
	 * The list contents are of type {@link model.Funktion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funktionen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funktionen</em>' containment reference list.
	 * @see model.ModelPackage#getLexikalischFunktionaleGrammatik_Funktionen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Funktion> getFunktionen();

	/**
	 * Returns the value of the '<em><b>Merkmale</b></em>' reference list.
	 * The list contents are of type {@link model.Merkmal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merkmale</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merkmale</em>' reference list.
	 * @see model.ModelPackage#getLexikalischFunktionaleGrammatik_Merkmale()
	 * @model
	 * @generated
	 */
	EList<Merkmal> getMerkmale();

	/**
	 * Returns the value of the '<em><b>Grammatik</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammatik</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammatik</em>' containment reference.
	 * @see #setGrammatik(Grammatik)
	 * @see model.ModelPackage#getLexikalischFunktionaleGrammatik_Grammatik()
	 * @model containment="true"
	 * @generated
	 */
	Grammatik getGrammatik();

	/**
	 * Sets the value of the '{@link model.LexikalischFunktionaleGrammatik#getGrammatik <em>Grammatik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammatik</em>' containment reference.
	 * @see #getGrammatik()
	 * @generated
	 */
	void setGrammatik(Grammatik value);

	/**
	 * Returns the value of the '<em><b>Lexikon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexikon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexikon</em>' containment reference.
	 * @see #setLexikon(Lexikon)
	 * @see model.ModelPackage#getLexikalischFunktionaleGrammatik_Lexikon()
	 * @model containment="true"
	 * @generated
	 */
	Lexikon getLexikon();

	/**
	 * Sets the value of the '{@link model.LexikalischFunktionaleGrammatik#getLexikon <em>Lexikon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexikon</em>' containment reference.
	 * @see #getLexikon()
	 * @generated
	 */
	void setLexikon(Lexikon value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see model.ModelPackage#getLexikalischFunktionaleGrammatik_ID()
	 * @model id="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link model.LexikalischFunktionaleGrammatik#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

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
	 * @see model.ModelPackage#getLexikalischFunktionaleGrammatik_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.LexikalischFunktionaleGrammatik#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LexikalischFunktionaleGrammatik
