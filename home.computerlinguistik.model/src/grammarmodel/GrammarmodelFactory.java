/**
 */
package grammarmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see grammarmodel.GrammarmodelPackage
 * @generated
 */
public interface GrammarmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarmodelFactory eINSTANCE = grammarmodel.impl.GrammarmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribut Regel Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribut Regel Term</em>'.
	 * @generated
	 */
	AttributRegelTerm createAttributRegelTerm();

	/**
	 * Returns a new object of class '<em>Nicht Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nicht Terminal</em>'.
	 * @generated
	 */
	NichtTerminal createNichtTerminal();

	/**
	 * Returns a new object of class '<em>Attribut Regel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribut Regel</em>'.
	 * @generated
	 */
	AttributRegel createAttributRegel();

	/**
	 * Returns a new object of class '<em>Regel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regel</em>'.
	 * @generated
	 */
	Regel createRegel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GrammarmodelPackage getGrammarmodelPackage();

} //GrammarmodelFactory
