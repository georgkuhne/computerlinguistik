/**
 */
package grammarmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nicht Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grammarmodel.NichtTerminal#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link grammarmodel.NichtTerminal#getAttributRegeln <em>Attribut Regeln</em>}</li>
 * </ul>
 * </p>
 *
 * @see grammarmodel.GrammarmodelPackage#getNichtTerminal()
 * @model
 * @generated
 */
public interface NichtTerminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bezeichnung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' attribute.
	 * @see #setBezeichnung(String)
	 * @see grammarmodel.GrammarmodelPackage#getNichtTerminal_Bezeichnung()
	 * @model
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link grammarmodel.NichtTerminal#getBezeichnung <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Attribut Regeln</b></em>' reference list.
	 * The list contents are of type {@link grammarmodel.AttributRegel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribut Regeln</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribut Regeln</em>' reference list.
	 * @see grammarmodel.GrammarmodelPackage#getNichtTerminal_AttributRegeln()
	 * @model
	 * @generated
	 */
	EList<AttributRegel> getAttributRegeln();

} // NichtTerminal
