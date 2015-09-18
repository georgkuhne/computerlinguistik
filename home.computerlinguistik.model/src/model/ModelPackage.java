/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "home.computerlinguistik.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "home.computerlinguistik";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.LexikalischFunktionaleGrammatikImpl <em>Lexikalisch Funktionale Grammatik</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LexikalischFunktionaleGrammatikImpl
	 * @see model.impl.ModelPackageImpl#getLexikalischFunktionaleGrammatik()
	 * @generated
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK = 0;

	/**
	 * The feature id for the '<em><b>Funktionen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN = 0;

	/**
	 * The feature id for the '<em><b>Merkmale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK__MERKMALE = 1;

	/**
	 * The feature id for the '<em><b>Grammatik</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK = 2;

	/**
	 * The feature id for the '<em><b>Lexikon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK__NAME = 5;

	/**
	 * The number of structural features of the '<em>Lexikalisch Funktionale Grammatik</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Lexikalisch Funktionale Grammatik</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKALISCH_FUNKTIONALE_GRAMMATIK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.FStrukturImpl <em>FStruktur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FStrukturImpl
	 * @see model.impl.ModelPackageImpl#getFStruktur()
	 * @generated
	 */
	int FSTRUKTUR = 1;

	/**
	 * The feature id for the '<em><b>Attribut Werte Paare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTRUKTUR__ATTRIBUT_WERTE_PAARE = 0;

	/**
	 * The number of structural features of the '<em>FStruktur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTRUKTUR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FStruktur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSTRUKTUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.GrammatikImpl <em>Grammatik</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GrammatikImpl
	 * @see model.impl.ModelPackageImpl#getGrammatik()
	 * @generated
	 */
	int GRAMMATIK = 2;

	/**
	 * The feature id for the '<em><b>Terminale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIK__TERMINALE = 0;

	/**
	 * The feature id for the '<em><b>S0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIK__S0 = 1;

	/**
	 * The feature id for the '<em><b>Nicht Terminale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIK__NICHT_TERMINALE = 2;

	/**
	 * The feature id for the '<em><b>Regeln</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIK__REGELN = 3;

	/**
	 * The number of structural features of the '<em>Grammatik</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Grammatik</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LexikonImpl <em>Lexikon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LexikonImpl
	 * @see model.impl.ModelPackageImpl#getLexikon()
	 * @generated
	 */
	int LEXIKON = 3;

	/**
	 * The feature id for the '<em><b>Eintraege</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKON__EINTRAEGE = 0;

	/**
	 * The number of structural features of the '<em>Lexikon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lexikon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LexikonEintragImpl <em>Lexikon Eintrag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LexikonEintragImpl
	 * @see model.impl.ModelPackageImpl#getLexikonEintrag()
	 * @generated
	 */
	int LEXIKON_EINTRAG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKON_EINTRAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Wortart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKON_EINTRAG__WORTART = 1;

	/**
	 * The feature id for the '<em><b>Auspraegungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKON_EINTRAG__AUSPRAEGUNGEN = 2;

	/**
	 * The number of structural features of the '<em>Lexikon Eintrag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKON_EINTRAG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lexikon Eintrag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXIKON_EINTRAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.AttributWertePaarImpl <em>Attribut Werte Paar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AttributWertePaarImpl
	 * @see model.impl.ModelPackageImpl#getAttributWertePaar()
	 * @generated
	 */
	int ATTRIBUT_WERTE_PAAR = 5;

	/**
	 * The feature id for the '<em><b>Wert Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_WERTE_PAAR__WERT_TYP = 0;

	/**
	 * The feature id for the '<em><b>Funktion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_WERTE_PAAR__FUNKTION = 1;

	/**
	 * The feature id for the '<em><b>Funktions Wert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT = 2;

	/**
	 * The feature id for the '<em><b>Merkmal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_WERTE_PAAR__MERKMAL = 3;

	/**
	 * The feature id for the '<em><b>Merkmals Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_WERTE_PAAR__MERKMALS_WERT = 4;

	/**
	 * The number of structural features of the '<em>Attribut Werte Paar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_WERTE_PAAR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attribut Werte Paar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_WERTE_PAAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.MerkmalFunktionImpl <em>Merkmal Funktion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MerkmalFunktionImpl
	 * @see model.impl.ModelPackageImpl#getMerkmalFunktion()
	 * @generated
	 */
	int MERKMAL_FUNKTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERKMAL_FUNKTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Merkmal Funktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERKMAL_FUNKTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Merkmal Funktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERKMAL_FUNKTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.FunktionImpl <em>Funktion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FunktionImpl
	 * @see model.impl.ModelPackageImpl#getFunktion()
	 * @generated
	 */
	int FUNKTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION__NAME = MERKMAL_FUNKTION__NAME;

	/**
	 * The number of structural features of the '<em>Funktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION_FEATURE_COUNT = MERKMAL_FUNKTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Funktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION_OPERATION_COUNT = MERKMAL_FUNKTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.MerkmalImpl <em>Merkmal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MerkmalImpl
	 * @see model.impl.ModelPackageImpl#getMerkmal()
	 * @generated
	 */
	int MERKMAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERKMAL__NAME = MERKMAL_FUNKTION__NAME;

	/**
	 * The feature id for the '<em><b>Moegliche Werte</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERKMAL__MOEGLICHE_WERTE = MERKMAL_FUNKTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merkmal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERKMAL_FEATURE_COUNT = MERKMAL_FUNKTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Merkmal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERKMAL_OPERATION_COUNT = MERKMAL_FUNKTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.TerminalNichtTerminalImpl <em>Terminal Nicht Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TerminalNichtTerminalImpl
	 * @see model.impl.ModelPackageImpl#getTerminalNichtTerminal()
	 * @generated
	 */
	int TERMINAL_NICHT_TERMINAL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NICHT_TERMINAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Terminal Nicht Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NICHT_TERMINAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Terminal Nicht Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NICHT_TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.NichterminalImpl <em>Nichterminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NichterminalImpl
	 * @see model.impl.ModelPackageImpl#getNichterminal()
	 * @generated
	 */
	int NICHTERMINAL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTERMINAL__NAME = TERMINAL_NICHT_TERMINAL__NAME;

	/**
	 * The number of structural features of the '<em>Nichterminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTERMINAL_FEATURE_COUNT = TERMINAL_NICHT_TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nichterminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHTERMINAL_OPERATION_COUNT = TERMINAL_NICHT_TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TerminalImpl
	 * @see model.impl.ModelPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = NICHTERMINAL__NAME;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = NICHTERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = NICHTERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AbleitungsRegelImpl <em>Ableitungs Regel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AbleitungsRegelImpl
	 * @see model.impl.ModelPackageImpl#getAbleitungsRegel()
	 * @generated
	 */
	int ABLEITUNGS_REGEL = 10;

	/**
	 * The feature id for the '<em><b>Von</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLEITUNGS_REGEL__VON = 0;

	/**
	 * The feature id for the '<em><b>Auf</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLEITUNGS_REGEL__AUF = 1;

	/**
	 * The number of structural features of the '<em>Ableitungs Regel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLEITUNGS_REGEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ableitungs Regel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLEITUNGS_REGEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.AnnotiertesTerminalNichtTerminalImpl <em>Annotiertes Terminal Nicht Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AnnotiertesTerminalNichtTerminalImpl
	 * @see model.impl.ModelPackageImpl#getAnnotiertesTerminalNichtTerminal()
	 * @generated
	 */
	int ANNOTIERTES_TERMINAL_NICHT_TERMINAL = 12;

	/**
	 * The feature id for the '<em><b>Aufwaertspfeil</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL = 0;

	/**
	 * The feature id for the '<em><b>Abwaertspfeil</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL = 1;

	/**
	 * The feature id for the '<em><b>Terminal Nicht Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTIERTES_TERMINAL_NICHT_TERMINAL__TERMINAL_NICHT_TERMINAL = 2;

	/**
	 * The number of structural features of the '<em>Annotiertes Terminal Nicht Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTIERTES_TERMINAL_NICHT_TERMINAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotiertes Terminal Nicht Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTIERTES_TERMINAL_NICHT_TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.WertTyp <em>Wert Typ</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.WertTyp
	 * @see model.impl.ModelPackageImpl#getWertTyp()
	 * @generated
	 */
	int WERT_TYP = 14;


	/**
	 * Returns the meta object for class '{@link model.LexikalischFunktionaleGrammatik <em>Lexikalisch Funktionale Grammatik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexikalisch Funktionale Grammatik</em>'.
	 * @see model.LexikalischFunktionaleGrammatik
	 * @generated
	 */
	EClass getLexikalischFunktionaleGrammatik();

	/**
	 * Returns the meta object for the containment reference list '{@link model.LexikalischFunktionaleGrammatik#getFunktionen <em>Funktionen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funktionen</em>'.
	 * @see model.LexikalischFunktionaleGrammatik#getFunktionen()
	 * @see #getLexikalischFunktionaleGrammatik()
	 * @generated
	 */
	EReference getLexikalischFunktionaleGrammatik_Funktionen();

	/**
	 * Returns the meta object for the reference list '{@link model.LexikalischFunktionaleGrammatik#getMerkmale <em>Merkmale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merkmale</em>'.
	 * @see model.LexikalischFunktionaleGrammatik#getMerkmale()
	 * @see #getLexikalischFunktionaleGrammatik()
	 * @generated
	 */
	EReference getLexikalischFunktionaleGrammatik_Merkmale();

	/**
	 * Returns the meta object for the containment reference '{@link model.LexikalischFunktionaleGrammatik#getGrammatik <em>Grammatik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grammatik</em>'.
	 * @see model.LexikalischFunktionaleGrammatik#getGrammatik()
	 * @see #getLexikalischFunktionaleGrammatik()
	 * @generated
	 */
	EReference getLexikalischFunktionaleGrammatik_Grammatik();

	/**
	 * Returns the meta object for the containment reference '{@link model.LexikalischFunktionaleGrammatik#getLexikon <em>Lexikon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lexikon</em>'.
	 * @see model.LexikalischFunktionaleGrammatik#getLexikon()
	 * @see #getLexikalischFunktionaleGrammatik()
	 * @generated
	 */
	EReference getLexikalischFunktionaleGrammatik_Lexikon();

	/**
	 * Returns the meta object for the attribute '{@link model.LexikalischFunktionaleGrammatik#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.LexikalischFunktionaleGrammatik#getID()
	 * @see #getLexikalischFunktionaleGrammatik()
	 * @generated
	 */
	EAttribute getLexikalischFunktionaleGrammatik_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.LexikalischFunktionaleGrammatik#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.LexikalischFunktionaleGrammatik#getName()
	 * @see #getLexikalischFunktionaleGrammatik()
	 * @generated
	 */
	EAttribute getLexikalischFunktionaleGrammatik_Name();

	/**
	 * Returns the meta object for class '{@link model.FStruktur <em>FStruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FStruktur</em>'.
	 * @see model.FStruktur
	 * @generated
	 */
	EClass getFStruktur();

	/**
	 * Returns the meta object for the containment reference list '{@link model.FStruktur#getAttributWertePaare <em>Attribut Werte Paare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribut Werte Paare</em>'.
	 * @see model.FStruktur#getAttributWertePaare()
	 * @see #getFStruktur()
	 * @generated
	 */
	EReference getFStruktur_AttributWertePaare();

	/**
	 * Returns the meta object for class '{@link model.Grammatik <em>Grammatik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammatik</em>'.
	 * @see model.Grammatik
	 * @generated
	 */
	EClass getGrammatik();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Grammatik#getTerminale <em>Terminale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminale</em>'.
	 * @see model.Grammatik#getTerminale()
	 * @see #getGrammatik()
	 * @generated
	 */
	EReference getGrammatik_Terminale();

	/**
	 * Returns the meta object for the reference '{@link model.Grammatik#getS0 <em>S0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>S0</em>'.
	 * @see model.Grammatik#getS0()
	 * @see #getGrammatik()
	 * @generated
	 */
	EReference getGrammatik_S0();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Grammatik#getNichtTerminale <em>Nicht Terminale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nicht Terminale</em>'.
	 * @see model.Grammatik#getNichtTerminale()
	 * @see #getGrammatik()
	 * @generated
	 */
	EReference getGrammatik_NichtTerminale();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Grammatik#getRegeln <em>Regeln</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regeln</em>'.
	 * @see model.Grammatik#getRegeln()
	 * @see #getGrammatik()
	 * @generated
	 */
	EReference getGrammatik_Regeln();

	/**
	 * Returns the meta object for class '{@link model.Lexikon <em>Lexikon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexikon</em>'.
	 * @see model.Lexikon
	 * @generated
	 */
	EClass getLexikon();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Lexikon#getEintraege <em>Eintraege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eintraege</em>'.
	 * @see model.Lexikon#getEintraege()
	 * @see #getLexikon()
	 * @generated
	 */
	EReference getLexikon_Eintraege();

	/**
	 * Returns the meta object for class '{@link model.LexikonEintrag <em>Lexikon Eintrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexikon Eintrag</em>'.
	 * @see model.LexikonEintrag
	 * @generated
	 */
	EClass getLexikonEintrag();

	/**
	 * Returns the meta object for the attribute '{@link model.LexikonEintrag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.LexikonEintrag#getName()
	 * @see #getLexikonEintrag()
	 * @generated
	 */
	EAttribute getLexikonEintrag_Name();

	/**
	 * Returns the meta object for the reference '{@link model.LexikonEintrag#getWortart <em>Wortart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wortart</em>'.
	 * @see model.LexikonEintrag#getWortart()
	 * @see #getLexikonEintrag()
	 * @generated
	 */
	EReference getLexikonEintrag_Wortart();

	/**
	 * Returns the meta object for the containment reference list '{@link model.LexikonEintrag#getAuspraegungen <em>Auspraegungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auspraegungen</em>'.
	 * @see model.LexikonEintrag#getAuspraegungen()
	 * @see #getLexikonEintrag()
	 * @generated
	 */
	EReference getLexikonEintrag_Auspraegungen();

	/**
	 * Returns the meta object for class '{@link model.AttributWertePaar <em>Attribut Werte Paar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut Werte Paar</em>'.
	 * @see model.AttributWertePaar
	 * @generated
	 */
	EClass getAttributWertePaar();

	/**
	 * Returns the meta object for the attribute '{@link model.AttributWertePaar#getWertTyp <em>Wert Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert Typ</em>'.
	 * @see model.AttributWertePaar#getWertTyp()
	 * @see #getAttributWertePaar()
	 * @generated
	 */
	EAttribute getAttributWertePaar_WertTyp();

	/**
	 * Returns the meta object for the reference '{@link model.AttributWertePaar#getFunktion <em>Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Funktion</em>'.
	 * @see model.AttributWertePaar#getFunktion()
	 * @see #getAttributWertePaar()
	 * @generated
	 */
	EReference getAttributWertePaar_Funktion();

	/**
	 * Returns the meta object for the containment reference '{@link model.AttributWertePaar#getFunktionsWert <em>Funktions Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Funktions Wert</em>'.
	 * @see model.AttributWertePaar#getFunktionsWert()
	 * @see #getAttributWertePaar()
	 * @generated
	 */
	EReference getAttributWertePaar_FunktionsWert();

	/**
	 * Returns the meta object for the reference '{@link model.AttributWertePaar#getMerkmal <em>Merkmal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merkmal</em>'.
	 * @see model.AttributWertePaar#getMerkmal()
	 * @see #getAttributWertePaar()
	 * @generated
	 */
	EReference getAttributWertePaar_Merkmal();

	/**
	 * Returns the meta object for the attribute '{@link model.AttributWertePaar#getMerkmalsWert <em>Merkmals Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merkmals Wert</em>'.
	 * @see model.AttributWertePaar#getMerkmalsWert()
	 * @see #getAttributWertePaar()
	 * @generated
	 */
	EAttribute getAttributWertePaar_MerkmalsWert();

	/**
	 * Returns the meta object for class '{@link model.Funktion <em>Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funktion</em>'.
	 * @see model.Funktion
	 * @generated
	 */
	EClass getFunktion();

	/**
	 * Returns the meta object for class '{@link model.Merkmal <em>Merkmal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merkmal</em>'.
	 * @see model.Merkmal
	 * @generated
	 */
	EClass getMerkmal();

	/**
	 * Returns the meta object for the attribute list '{@link model.Merkmal#getMoeglicheWerte <em>Moegliche Werte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Moegliche Werte</em>'.
	 * @see model.Merkmal#getMoeglicheWerte()
	 * @see #getMerkmal()
	 * @generated
	 */
	EAttribute getMerkmal_MoeglicheWerte();

	/**
	 * Returns the meta object for class '{@link model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see model.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for class '{@link model.Nichterminal <em>Nichterminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nichterminal</em>'.
	 * @see model.Nichterminal
	 * @generated
	 */
	EClass getNichterminal();

	/**
	 * Returns the meta object for class '{@link model.AbleitungsRegel <em>Ableitungs Regel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ableitungs Regel</em>'.
	 * @see model.AbleitungsRegel
	 * @generated
	 */
	EClass getAbleitungsRegel();

	/**
	 * Returns the meta object for the reference '{@link model.AbleitungsRegel#getVon <em>Von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Von</em>'.
	 * @see model.AbleitungsRegel#getVon()
	 * @see #getAbleitungsRegel()
	 * @generated
	 */
	EReference getAbleitungsRegel_Von();

	/**
	 * Returns the meta object for the reference list '{@link model.AbleitungsRegel#getAuf <em>Auf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auf</em>'.
	 * @see model.AbleitungsRegel#getAuf()
	 * @see #getAbleitungsRegel()
	 * @generated
	 */
	EReference getAbleitungsRegel_Auf();

	/**
	 * Returns the meta object for class '{@link model.TerminalNichtTerminal <em>Terminal Nicht Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Nicht Terminal</em>'.
	 * @see model.TerminalNichtTerminal
	 * @generated
	 */
	EClass getTerminalNichtTerminal();

	/**
	 * Returns the meta object for the attribute '{@link model.TerminalNichtTerminal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.TerminalNichtTerminal#getName()
	 * @see #getTerminalNichtTerminal()
	 * @generated
	 */
	EAttribute getTerminalNichtTerminal_Name();

	/**
	 * Returns the meta object for class '{@link model.AnnotiertesTerminalNichtTerminal <em>Annotiertes Terminal Nicht Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotiertes Terminal Nicht Terminal</em>'.
	 * @see model.AnnotiertesTerminalNichtTerminal
	 * @generated
	 */
	EClass getAnnotiertesTerminalNichtTerminal();

	/**
	 * Returns the meta object for the reference list '{@link model.AnnotiertesTerminalNichtTerminal#getAufwaertspfeil <em>Aufwaertspfeil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aufwaertspfeil</em>'.
	 * @see model.AnnotiertesTerminalNichtTerminal#getAufwaertspfeil()
	 * @see #getAnnotiertesTerminalNichtTerminal()
	 * @generated
	 */
	EReference getAnnotiertesTerminalNichtTerminal_Aufwaertspfeil();

	/**
	 * Returns the meta object for the reference list '{@link model.AnnotiertesTerminalNichtTerminal#getAbwaertspfeil <em>Abwaertspfeil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abwaertspfeil</em>'.
	 * @see model.AnnotiertesTerminalNichtTerminal#getAbwaertspfeil()
	 * @see #getAnnotiertesTerminalNichtTerminal()
	 * @generated
	 */
	EReference getAnnotiertesTerminalNichtTerminal_Abwaertspfeil();

	/**
	 * Returns the meta object for the reference '{@link model.AnnotiertesTerminalNichtTerminal#getTerminalNichtTerminal <em>Terminal Nicht Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Nicht Terminal</em>'.
	 * @see model.AnnotiertesTerminalNichtTerminal#getTerminalNichtTerminal()
	 * @see #getAnnotiertesTerminalNichtTerminal()
	 * @generated
	 */
	EReference getAnnotiertesTerminalNichtTerminal_TerminalNichtTerminal();

	/**
	 * Returns the meta object for class '{@link model.MerkmalFunktion <em>Merkmal Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merkmal Funktion</em>'.
	 * @see model.MerkmalFunktion
	 * @generated
	 */
	EClass getMerkmalFunktion();

	/**
	 * Returns the meta object for the attribute '{@link model.MerkmalFunktion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.MerkmalFunktion#getName()
	 * @see #getMerkmalFunktion()
	 * @generated
	 */
	EAttribute getMerkmalFunktion_Name();

	/**
	 * Returns the meta object for enum '{@link model.WertTyp <em>Wert Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wert Typ</em>'.
	 * @see model.WertTyp
	 * @generated
	 */
	EEnum getWertTyp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.LexikalischFunktionaleGrammatikImpl <em>Lexikalisch Funktionale Grammatik</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LexikalischFunktionaleGrammatikImpl
		 * @see model.impl.ModelPackageImpl#getLexikalischFunktionaleGrammatik()
		 * @generated
		 */
		EClass LEXIKALISCH_FUNKTIONALE_GRAMMATIK = eINSTANCE.getLexikalischFunktionaleGrammatik();

		/**
		 * The meta object literal for the '<em><b>Funktionen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN = eINSTANCE.getLexikalischFunktionaleGrammatik_Funktionen();

		/**
		 * The meta object literal for the '<em><b>Merkmale</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXIKALISCH_FUNKTIONALE_GRAMMATIK__MERKMALE = eINSTANCE.getLexikalischFunktionaleGrammatik_Merkmale();

		/**
		 * The meta object literal for the '<em><b>Grammatik</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK = eINSTANCE.getLexikalischFunktionaleGrammatik_Grammatik();

		/**
		 * The meta object literal for the '<em><b>Lexikon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON = eINSTANCE.getLexikalischFunktionaleGrammatik_Lexikon();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXIKALISCH_FUNKTIONALE_GRAMMATIK__ID = eINSTANCE.getLexikalischFunktionaleGrammatik_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXIKALISCH_FUNKTIONALE_GRAMMATIK__NAME = eINSTANCE.getLexikalischFunktionaleGrammatik_Name();

		/**
		 * The meta object literal for the '{@link model.impl.FStrukturImpl <em>FStruktur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FStrukturImpl
		 * @see model.impl.ModelPackageImpl#getFStruktur()
		 * @generated
		 */
		EClass FSTRUKTUR = eINSTANCE.getFStruktur();

		/**
		 * The meta object literal for the '<em><b>Attribut Werte Paare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSTRUKTUR__ATTRIBUT_WERTE_PAARE = eINSTANCE.getFStruktur_AttributWertePaare();

		/**
		 * The meta object literal for the '{@link model.impl.GrammatikImpl <em>Grammatik</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.GrammatikImpl
		 * @see model.impl.ModelPackageImpl#getGrammatik()
		 * @generated
		 */
		EClass GRAMMATIK = eINSTANCE.getGrammatik();

		/**
		 * The meta object literal for the '<em><b>Terminale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMATIK__TERMINALE = eINSTANCE.getGrammatik_Terminale();

		/**
		 * The meta object literal for the '<em><b>S0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMATIK__S0 = eINSTANCE.getGrammatik_S0();

		/**
		 * The meta object literal for the '<em><b>Nicht Terminale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMATIK__NICHT_TERMINALE = eINSTANCE.getGrammatik_NichtTerminale();

		/**
		 * The meta object literal for the '<em><b>Regeln</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMATIK__REGELN = eINSTANCE.getGrammatik_Regeln();

		/**
		 * The meta object literal for the '{@link model.impl.LexikonImpl <em>Lexikon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LexikonImpl
		 * @see model.impl.ModelPackageImpl#getLexikon()
		 * @generated
		 */
		EClass LEXIKON = eINSTANCE.getLexikon();

		/**
		 * The meta object literal for the '<em><b>Eintraege</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXIKON__EINTRAEGE = eINSTANCE.getLexikon_Eintraege();

		/**
		 * The meta object literal for the '{@link model.impl.LexikonEintragImpl <em>Lexikon Eintrag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LexikonEintragImpl
		 * @see model.impl.ModelPackageImpl#getLexikonEintrag()
		 * @generated
		 */
		EClass LEXIKON_EINTRAG = eINSTANCE.getLexikonEintrag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXIKON_EINTRAG__NAME = eINSTANCE.getLexikonEintrag_Name();

		/**
		 * The meta object literal for the '<em><b>Wortart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXIKON_EINTRAG__WORTART = eINSTANCE.getLexikonEintrag_Wortart();

		/**
		 * The meta object literal for the '<em><b>Auspraegungen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXIKON_EINTRAG__AUSPRAEGUNGEN = eINSTANCE.getLexikonEintrag_Auspraegungen();

		/**
		 * The meta object literal for the '{@link model.impl.AttributWertePaarImpl <em>Attribut Werte Paar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AttributWertePaarImpl
		 * @see model.impl.ModelPackageImpl#getAttributWertePaar()
		 * @generated
		 */
		EClass ATTRIBUT_WERTE_PAAR = eINSTANCE.getAttributWertePaar();

		/**
		 * The meta object literal for the '<em><b>Wert Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT_WERTE_PAAR__WERT_TYP = eINSTANCE.getAttributWertePaar_WertTyp();

		/**
		 * The meta object literal for the '<em><b>Funktion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUT_WERTE_PAAR__FUNKTION = eINSTANCE.getAttributWertePaar_Funktion();

		/**
		 * The meta object literal for the '<em><b>Funktions Wert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT = eINSTANCE.getAttributWertePaar_FunktionsWert();

		/**
		 * The meta object literal for the '<em><b>Merkmal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUT_WERTE_PAAR__MERKMAL = eINSTANCE.getAttributWertePaar_Merkmal();

		/**
		 * The meta object literal for the '<em><b>Merkmals Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT_WERTE_PAAR__MERKMALS_WERT = eINSTANCE.getAttributWertePaar_MerkmalsWert();

		/**
		 * The meta object literal for the '{@link model.impl.FunktionImpl <em>Funktion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FunktionImpl
		 * @see model.impl.ModelPackageImpl#getFunktion()
		 * @generated
		 */
		EClass FUNKTION = eINSTANCE.getFunktion();

		/**
		 * The meta object literal for the '{@link model.impl.MerkmalImpl <em>Merkmal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MerkmalImpl
		 * @see model.impl.ModelPackageImpl#getMerkmal()
		 * @generated
		 */
		EClass MERKMAL = eINSTANCE.getMerkmal();

		/**
		 * The meta object literal for the '<em><b>Moegliche Werte</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERKMAL__MOEGLICHE_WERTE = eINSTANCE.getMerkmal_MoeglicheWerte();

		/**
		 * The meta object literal for the '{@link model.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TerminalImpl
		 * @see model.impl.ModelPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '{@link model.impl.NichterminalImpl <em>Nichterminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.NichterminalImpl
		 * @see model.impl.ModelPackageImpl#getNichterminal()
		 * @generated
		 */
		EClass NICHTERMINAL = eINSTANCE.getNichterminal();

		/**
		 * The meta object literal for the '{@link model.impl.AbleitungsRegelImpl <em>Ableitungs Regel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AbleitungsRegelImpl
		 * @see model.impl.ModelPackageImpl#getAbleitungsRegel()
		 * @generated
		 */
		EClass ABLEITUNGS_REGEL = eINSTANCE.getAbleitungsRegel();

		/**
		 * The meta object literal for the '<em><b>Von</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLEITUNGS_REGEL__VON = eINSTANCE.getAbleitungsRegel_Von();

		/**
		 * The meta object literal for the '<em><b>Auf</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLEITUNGS_REGEL__AUF = eINSTANCE.getAbleitungsRegel_Auf();

		/**
		 * The meta object literal for the '{@link model.impl.TerminalNichtTerminalImpl <em>Terminal Nicht Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TerminalNichtTerminalImpl
		 * @see model.impl.ModelPackageImpl#getTerminalNichtTerminal()
		 * @generated
		 */
		EClass TERMINAL_NICHT_TERMINAL = eINSTANCE.getTerminalNichtTerminal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL_NICHT_TERMINAL__NAME = eINSTANCE.getTerminalNichtTerminal_Name();

		/**
		 * The meta object literal for the '{@link model.impl.AnnotiertesTerminalNichtTerminalImpl <em>Annotiertes Terminal Nicht Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AnnotiertesTerminalNichtTerminalImpl
		 * @see model.impl.ModelPackageImpl#getAnnotiertesTerminalNichtTerminal()
		 * @generated
		 */
		EClass ANNOTIERTES_TERMINAL_NICHT_TERMINAL = eINSTANCE.getAnnotiertesTerminalNichtTerminal();

		/**
		 * The meta object literal for the '<em><b>Aufwaertspfeil</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL = eINSTANCE.getAnnotiertesTerminalNichtTerminal_Aufwaertspfeil();

		/**
		 * The meta object literal for the '<em><b>Abwaertspfeil</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL = eINSTANCE.getAnnotiertesTerminalNichtTerminal_Abwaertspfeil();

		/**
		 * The meta object literal for the '<em><b>Terminal Nicht Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTIERTES_TERMINAL_NICHT_TERMINAL__TERMINAL_NICHT_TERMINAL = eINSTANCE.getAnnotiertesTerminalNichtTerminal_TerminalNichtTerminal();

		/**
		 * The meta object literal for the '{@link model.impl.MerkmalFunktionImpl <em>Merkmal Funktion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MerkmalFunktionImpl
		 * @see model.impl.ModelPackageImpl#getMerkmalFunktion()
		 * @generated
		 */
		EClass MERKMAL_FUNKTION = eINSTANCE.getMerkmalFunktion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERKMAL_FUNKTION__NAME = eINSTANCE.getMerkmalFunktion_Name();

		/**
		 * The meta object literal for the '{@link model.WertTyp <em>Wert Typ</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.WertTyp
		 * @see model.impl.ModelPackageImpl#getWertTyp()
		 * @generated
		 */
		EEnum WERT_TYP = eINSTANCE.getWertTyp();

	}

} //ModelPackage
