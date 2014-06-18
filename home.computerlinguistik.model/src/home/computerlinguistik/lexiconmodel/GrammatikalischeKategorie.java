/**
 */
package home.computerlinguistik.lexiconmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammatikalische Kategorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie#getPossiblevalues <em>Possiblevalues</em>}</li>
 * </ul>
 * </p>
 *
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getGrammatikalischeKategorie()
 * @model
 * @generated
 */
public interface GrammatikalischeKategorie extends EObject {
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
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getGrammatikalischeKategorie_Bezeichnung()
	 * @model
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie#getBezeichnung <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Possiblevalues</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possiblevalues</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possiblevalues</em>' attribute list.
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getGrammatikalischeKategorie_Possiblevalues()
	 * @model
	 * @generated
	 */
	EList<String> getPossiblevalues();

} // GrammatikalischeKategorie
