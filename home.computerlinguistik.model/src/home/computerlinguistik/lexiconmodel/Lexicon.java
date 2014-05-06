/**
 */
package home.computerlinguistik.lexiconmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexicon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Lexicon#getEintraege <em>Eintraege</em>}</li>
 * </ul>
 * </p>
 *
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getLexicon()
 * @model
 * @generated
 */
public interface Lexicon extends EObject {
	/**
	 * Returns the value of the '<em><b>Eintraege</b></em>' containment reference list.
	 * The list contents are of type {@link home.computerlinguistik.lexiconmodel.Eintrag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eintraege</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eintraege</em>' containment reference list.
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getLexicon_Eintraege()
	 * @model containment="true"
	 * @generated
	 */
	EList<Eintrag> getEintraege();

} // Lexicon
