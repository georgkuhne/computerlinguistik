/**
 */
package home.computerlinguistik.lexiconmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auspraegung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Auspraegung#getGrammatikalischeKategorie <em>Grammatikalische Kategorie</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Auspraegung#getWert <em>Wert</em>}</li>
 * </ul>
 * </p>
 *
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getAuspraegung()
 * @model
 * @generated
 */
public interface Auspraegung extends EObject {
	/**
	 * Returns the value of the '<em><b>Grammatikalische Kategorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammatikalische Kategorie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammatikalische Kategorie</em>' reference.
	 * @see #setGrammatikalischeKategorie(GrammatikalischeKategorie)
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getAuspraegung_GrammatikalischeKategorie()
	 * @model
	 * @generated
	 */
	GrammatikalischeKategorie getGrammatikalischeKategorie();

	/**
	 * Sets the value of the '{@link home.computerlinguistik.lexiconmodel.Auspraegung#getGrammatikalischeKategorie <em>Grammatikalische Kategorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammatikalische Kategorie</em>' reference.
	 * @see #getGrammatikalischeKategorie()
	 * @generated
	 */
	void setGrammatikalischeKategorie(GrammatikalischeKategorie value);

	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(String)
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getAuspraegung_Wert()
	 * @model
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link home.computerlinguistik.lexiconmodel.Auspraegung#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

} // Auspraegung
