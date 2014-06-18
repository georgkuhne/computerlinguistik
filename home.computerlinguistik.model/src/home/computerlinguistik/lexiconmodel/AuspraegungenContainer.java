/**
 */
package home.computerlinguistik.lexiconmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auspraegungen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.AuspraegungenContainer#getAuspraegungen <em>Auspraegungen</em>}</li>
 * </ul>
 * </p>
 *
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getAuspraegungenContainer()
 * @model
 * @generated
 */
public interface AuspraegungenContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Auspraegungen</b></em>' reference list.
	 * The list contents are of type {@link home.computerlinguistik.lexiconmodel.Auspraegung}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auspraegungen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auspraegungen</em>' reference list.
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getAuspraegungenContainer_Auspraegungen()
	 * @model
	 * @generated
	 */
	EList<Auspraegung> getAuspraegungen();

} // AuspraegungenContainer
