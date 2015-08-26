/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lexikalisch Funktionale Grammatik</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexikalisch Funktionale Grammatik</em>'.
	 * @generated
	 */
	LexikalischFunktionaleGrammatik createLexikalischFunktionaleGrammatik();

	/**
	 * Returns a new object of class '<em>FStruktur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FStruktur</em>'.
	 * @generated
	 */
	FStruktur createFStruktur();

	/**
	 * Returns a new object of class '<em>Grammatik</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grammatik</em>'.
	 * @generated
	 */
	Grammatik createGrammatik();

	/**
	 * Returns a new object of class '<em>Lexikon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexikon</em>'.
	 * @generated
	 */
	Lexikon createLexikon();

	/**
	 * Returns a new object of class '<em>Lexikon Eintrag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexikon Eintrag</em>'.
	 * @generated
	 */
	LexikonEintrag createLexikonEintrag();

	/**
	 * Returns a new object of class '<em>Attribut Werte Paar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribut Werte Paar</em>'.
	 * @generated
	 */
	AttributWertePaar createAttributWertePaar();

	/**
	 * Returns a new object of class '<em>Funktion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funktion</em>'.
	 * @generated
	 */
	Funktion createFunktion();

	/**
	 * Returns a new object of class '<em>Merkmal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merkmal</em>'.
	 * @generated
	 */
	Merkmal createMerkmal();

	/**
	 * Returns a new object of class '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal</em>'.
	 * @generated
	 */
	Terminal createTerminal();

	/**
	 * Returns a new object of class '<em>Nichterminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nichterminal</em>'.
	 * @generated
	 */
	Nichterminal createNichterminal();

	/**
	 * Returns a new object of class '<em>Ableitungs Regel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ableitungs Regel</em>'.
	 * @generated
	 */
	AbleitungsRegel createAbleitungsRegel();

	/**
	 * Returns a new object of class '<em>Terminal Nicht Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal Nicht Terminal</em>'.
	 * @generated
	 */
	TerminalNichtTerminal createTerminalNichtTerminal();

	/**
	 * Returns a new object of class '<em>Annotiertes Terminal Nicht Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotiertes Terminal Nicht Terminal</em>'.
	 * @generated
	 */
	AnnotiertesTerminalNichtTerminal createAnnotiertesTerminalNichtTerminal();

	/**
	 * Returns a new object of class '<em>Merkmal Funktion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merkmal Funktion</em>'.
	 * @generated
	 */
	MerkmalFunktion createMerkmalFunktion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
