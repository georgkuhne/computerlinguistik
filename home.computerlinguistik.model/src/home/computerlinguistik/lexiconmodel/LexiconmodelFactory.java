/**
 */
package home.computerlinguistik.lexiconmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage
 * @generated
 */
public interface LexiconmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LexiconmodelFactory eINSTANCE = home.computerlinguistik.lexiconmodel.impl.LexiconmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lexicon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexicon</em>'.
	 * @generated
	 */
	Lexicon createLexicon();

	/**
	 * Returns a new object of class '<em>Eintrag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eintrag</em>'.
	 * @generated
	 */
	Eintrag createEintrag();

	/**
	 * Returns a new object of class '<em>Grammatikalische Kategorie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grammatikalische Kategorie</em>'.
	 * @generated
	 */
	GrammatikalischeKategorie createGrammatikalischeKategorie();

	/**
	 * Returns a new object of class '<em>Subkategorisierung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subkategorisierung</em>'.
	 * @generated
	 */
	Subkategorisierung createSubkategorisierung();

	/**
	 * Returns a new object of class '<em>Auspraegungen Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auspraegungen Container</em>'.
	 * @generated
	 */
	AuspraegungenContainer createAuspraegungenContainer();

	/**
	 * Returns a new object of class '<em>Auspraegung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auspraegung</em>'.
	 * @generated
	 */
	Auspraegung createAuspraegung();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LexiconmodelPackage getLexiconmodelPackage();

} //LexiconmodelFactory
