/**
 */
package home.computerlinguistik.lexiconmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eintrag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Eintrag#getWort <em>Wort</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Eintrag#getAuspraegungenContainer <em>Auspraegungen Container</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Eintrag#getWortart <em>Wortart</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Eintrag#getID <em>ID</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Eintrag#getRollen <em>Rollen</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.Eintrag#getSubkaterorisierungen <em>Subkaterorisierungen</em>}</li>
 * </ul>
 * </p>
 *
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getEintrag()
 * @model
 * @generated
 */
public interface Eintrag extends EObject {

	/**
	 * Returns the value of the '<em><b>Wort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wort</em>' attribute.
	 * @see #setWort(String)
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getEintrag_Wort()
	 * @model
	 * @generated
	 */
	String getWort();

	/**
	 * Sets the value of the '{@link home.computerlinguistik.lexiconmodel.Eintrag#getWort <em>Wort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wort</em>' attribute.
	 * @see #getWort()
	 * @generated
	 */
	void setWort(String value);

	/**
	 * Returns the value of the '<em><b>Auspraegungen Container</b></em>' containment reference list.
	 * The list contents are of type {@link home.computerlinguistik.lexiconmodel.AuspraegungenContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auspraegungen Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auspraegungen Container</em>' containment reference list.
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getEintrag_AuspraegungenContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuspraegungenContainer> getAuspraegungenContainer();

	/**
	 * Returns the value of the '<em><b>Wortart</b></em>' attribute.
	 * The literals are from the enumeration {@link home.computerlinguistik.lexiconmodel.Wortart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wortart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wortart</em>' attribute.
	 * @see home.computerlinguistik.lexiconmodel.Wortart
	 * @see #setWortart(Wortart)
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getEintrag_Wortart()
	 * @model
	 * @generated
	 */
	Wortart getWortart();

	/**
	 * Sets the value of the '{@link home.computerlinguistik.lexiconmodel.Eintrag#getWortart <em>Wortart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wortart</em>' attribute.
	 * @see home.computerlinguistik.lexiconmodel.Wortart
	 * @see #getWortart()
	 * @generated
	 */
	void setWortart(Wortart value);

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
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getEintrag_ID()
	 * @model id="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link home.computerlinguistik.lexiconmodel.Eintrag#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

	/**
	 * Returns the value of the '<em><b>Rollen</b></em>' reference list.
	 * The list contents are of type {@link home.computerlinguistik.lexiconmodel.Subkategorisierung}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollen</em>' reference list.
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getEintrag_Rollen()
	 * @model
	 * @generated
	 */
	EList<Subkategorisierung> getRollen();

	/**
	 * Returns the value of the '<em><b>Subkaterorisierungen</b></em>' reference list.
	 * The list contents are of type {@link home.computerlinguistik.lexiconmodel.Subkategorisierung}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subkaterorisierungen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subkaterorisierungen</em>' reference list.
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#getEintrag_Subkaterorisierungen()
	 * @model
	 * @generated
	 */
	EList<Subkategorisierung> getSubkaterorisierungen();
} // Eintrag
