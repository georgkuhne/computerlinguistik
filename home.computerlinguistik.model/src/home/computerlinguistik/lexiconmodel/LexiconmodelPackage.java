/**
 */
package home.computerlinguistik.lexiconmodel;

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
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelFactory
 * @model kind="package"
 * @generated
 */
public interface LexiconmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lexiconmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "lexicon";

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
	LexiconmodelPackage eINSTANCE = home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link home.computerlinguistik.lexiconmodel.impl.LexiconImpl <em>Lexicon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconImpl
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getLexicon()
	 * @generated
	 */
	int LEXICON = 0;

	/**
	 * The feature id for the '<em><b>Eintraege</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON__EINTRAEGE = 0;

	/**
	 * The feature id for the '<em><b>Grammatikalische Kategorien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON__GRAMMATIKALISCHE_KATEGORIEN = 1;

	/**
	 * The feature id for the '<em><b>Subkaterorisierungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON__SUBKATERORISIERUNGEN = 2;

	/**
	 * The number of structural features of the '<em>Lexicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lexicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.lexiconmodel.impl.EintragImpl <em>Eintrag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.lexiconmodel.impl.EintragImpl
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getEintrag()
	 * @generated
	 */
	int EINTRAG = 1;

	/**
	 * The feature id for the '<em><b>Wort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG__WORT = 0;

	/**
	 * The feature id for the '<em><b>Auspraegungen Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG__AUSPRAEGUNGEN_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Wortart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG__WORTART = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG__ID = 3;

	/**
	 * The feature id for the '<em><b>Rollen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG__ROLLEN = 4;

	/**
	 * The feature id for the '<em><b>Subkaterorisierungen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG__SUBKATERORISIERUNGEN = 5;

	/**
	 * The number of structural features of the '<em>Eintrag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Eintrag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.lexiconmodel.impl.GrammatikalischeKategorieImpl <em>Grammatikalische Kategorie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.lexiconmodel.impl.GrammatikalischeKategorieImpl
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getGrammatikalischeKategorie()
	 * @generated
	 */
	int GRAMMATIKALISCHE_KATEGORIE = 2;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIKALISCHE_KATEGORIE__BEZEICHNUNG = 0;

	/**
	 * The feature id for the '<em><b>Possiblevalues</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIKALISCHE_KATEGORIE__POSSIBLEVALUES = 1;

	/**
	 * The number of structural features of the '<em>Grammatikalische Kategorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIKALISCHE_KATEGORIE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grammatikalische Kategorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMATIKALISCHE_KATEGORIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.lexiconmodel.impl.SubkategorisierungImpl <em>Subkategorisierung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.lexiconmodel.impl.SubkategorisierungImpl
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getSubkategorisierung()
	 * @generated
	 */
	int SUBKATEGORISIERUNG = 3;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBKATEGORISIERUNG__BEZEICHNUNG = 0;

	/**
	 * The feature id for the '<em><b>Auspraegungen Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Subkategorisierung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBKATEGORISIERUNG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subkategorisierung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBKATEGORISIERUNG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.lexiconmodel.impl.AuspraegungenContainerImpl <em>Auspraegungen Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.lexiconmodel.impl.AuspraegungenContainerImpl
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getAuspraegungenContainer()
	 * @generated
	 */
	int AUSPRAEGUNGEN_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Auspraegungen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSPRAEGUNGEN_CONTAINER__AUSPRAEGUNGEN = 0;

	/**
	 * The number of structural features of the '<em>Auspraegungen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSPRAEGUNGEN_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Auspraegungen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSPRAEGUNGEN_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.lexiconmodel.impl.AuspraegungImpl <em>Auspraegung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.lexiconmodel.impl.AuspraegungImpl
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getAuspraegung()
	 * @generated
	 */
	int AUSPRAEGUNG = 5;

	/**
	 * The feature id for the '<em><b>Grammatikalische Kategorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE = 0;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSPRAEGUNG__WERT = 1;

	/**
	 * The number of structural features of the '<em>Auspraegung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSPRAEGUNG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Auspraegung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSPRAEGUNG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.lexiconmodel.Wortart <em>Wortart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.lexiconmodel.Wortart
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getWortart()
	 * @generated
	 */
	int WORTART = 6;


	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.lexiconmodel.Lexicon <em>Lexicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexicon</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Lexicon
	 * @generated
	 */
	EClass getLexicon();

	/**
	 * Returns the meta object for the containment reference list '{@link home.computerlinguistik.lexiconmodel.Lexicon#getEintraege <em>Eintraege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eintraege</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Lexicon#getEintraege()
	 * @see #getLexicon()
	 * @generated
	 */
	EReference getLexicon_Eintraege();

	/**
	 * Returns the meta object for the containment reference list '{@link home.computerlinguistik.lexiconmodel.Lexicon#getGrammatikalischeKategorien <em>Grammatikalische Kategorien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grammatikalische Kategorien</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Lexicon#getGrammatikalischeKategorien()
	 * @see #getLexicon()
	 * @generated
	 */
	EReference getLexicon_GrammatikalischeKategorien();

	/**
	 * Returns the meta object for the containment reference list '{@link home.computerlinguistik.lexiconmodel.Lexicon#getSubkaterorisierungen <em>Subkaterorisierungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subkaterorisierungen</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Lexicon#getSubkaterorisierungen()
	 * @see #getLexicon()
	 * @generated
	 */
	EReference getLexicon_Subkaterorisierungen();

	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.lexiconmodel.Eintrag <em>Eintrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eintrag</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Eintrag
	 * @generated
	 */
	EClass getEintrag();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.lexiconmodel.Eintrag#getWort <em>Wort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wort</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Eintrag#getWort()
	 * @see #getEintrag()
	 * @generated
	 */
	EAttribute getEintrag_Wort();

	/**
	 * Returns the meta object for the containment reference list '{@link home.computerlinguistik.lexiconmodel.Eintrag#getAuspraegungenContainer <em>Auspraegungen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auspraegungen Container</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Eintrag#getAuspraegungenContainer()
	 * @see #getEintrag()
	 * @generated
	 */
	EReference getEintrag_AuspraegungenContainer();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.lexiconmodel.Eintrag#getWortart <em>Wortart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wortart</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Eintrag#getWortart()
	 * @see #getEintrag()
	 * @generated
	 */
	EAttribute getEintrag_Wortart();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.lexiconmodel.Eintrag#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Eintrag#getID()
	 * @see #getEintrag()
	 * @generated
	 */
	EAttribute getEintrag_ID();

	/**
	 * Returns the meta object for the reference list '{@link home.computerlinguistik.lexiconmodel.Eintrag#getRollen <em>Rollen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rollen</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Eintrag#getRollen()
	 * @see #getEintrag()
	 * @generated
	 */
	EReference getEintrag_Rollen();

	/**
	 * Returns the meta object for the reference list '{@link home.computerlinguistik.lexiconmodel.Eintrag#getSubkaterorisierungen <em>Subkaterorisierungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subkaterorisierungen</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Eintrag#getSubkaterorisierungen()
	 * @see #getEintrag()
	 * @generated
	 */
	EReference getEintrag_Subkaterorisierungen();

	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie <em>Grammatikalische Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammatikalische Kategorie</em>'.
	 * @see home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie
	 * @generated
	 */
	EClass getGrammatikalischeKategorie();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie#getBezeichnung()
	 * @see #getGrammatikalischeKategorie()
	 * @generated
	 */
	EAttribute getGrammatikalischeKategorie_Bezeichnung();

	/**
	 * Returns the meta object for the attribute list '{@link home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie#getPossiblevalues <em>Possiblevalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Possiblevalues</em>'.
	 * @see home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie#getPossiblevalues()
	 * @see #getGrammatikalischeKategorie()
	 * @generated
	 */
	EAttribute getGrammatikalischeKategorie_Possiblevalues();

	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.lexiconmodel.Subkategorisierung <em>Subkategorisierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subkategorisierung</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Subkategorisierung
	 * @generated
	 */
	EClass getSubkategorisierung();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.lexiconmodel.Subkategorisierung#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Subkategorisierung#getBezeichnung()
	 * @see #getSubkategorisierung()
	 * @generated
	 */
	EAttribute getSubkategorisierung_Bezeichnung();

	/**
	 * Returns the meta object for the containment reference list '{@link home.computerlinguistik.lexiconmodel.Subkategorisierung#getAuspraegungenContainer <em>Auspraegungen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auspraegungen Container</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Subkategorisierung#getAuspraegungenContainer()
	 * @see #getSubkategorisierung()
	 * @generated
	 */
	EReference getSubkategorisierung_AuspraegungenContainer();

	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.lexiconmodel.AuspraegungenContainer <em>Auspraegungen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auspraegungen Container</em>'.
	 * @see home.computerlinguistik.lexiconmodel.AuspraegungenContainer
	 * @generated
	 */
	EClass getAuspraegungenContainer();

	/**
	 * Returns the meta object for the reference list '{@link home.computerlinguistik.lexiconmodel.AuspraegungenContainer#getAuspraegungen <em>Auspraegungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auspraegungen</em>'.
	 * @see home.computerlinguistik.lexiconmodel.AuspraegungenContainer#getAuspraegungen()
	 * @see #getAuspraegungenContainer()
	 * @generated
	 */
	EReference getAuspraegungenContainer_Auspraegungen();

	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.lexiconmodel.Auspraegung <em>Auspraegung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auspraegung</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Auspraegung
	 * @generated
	 */
	EClass getAuspraegung();

	/**
	 * Returns the meta object for the reference '{@link home.computerlinguistik.lexiconmodel.Auspraegung#getGrammatikalischeKategorie <em>Grammatikalische Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grammatikalische Kategorie</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Auspraegung#getGrammatikalischeKategorie()
	 * @see #getAuspraegung()
	 * @generated
	 */
	EReference getAuspraegung_GrammatikalischeKategorie();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.lexiconmodel.Auspraegung#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Auspraegung#getWert()
	 * @see #getAuspraegung()
	 * @generated
	 */
	EAttribute getAuspraegung_Wert();

	/**
	 * Returns the meta object for enum '{@link home.computerlinguistik.lexiconmodel.Wortart <em>Wortart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wortart</em>'.
	 * @see home.computerlinguistik.lexiconmodel.Wortart
	 * @generated
	 */
	EEnum getWortart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LexiconmodelFactory getLexiconmodelFactory();

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
		 * The meta object literal for the '{@link home.computerlinguistik.lexiconmodel.impl.LexiconImpl <em>Lexicon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.lexiconmodel.impl.LexiconImpl
		 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getLexicon()
		 * @generated
		 */
		EClass LEXICON = eINSTANCE.getLexicon();

		/**
		 * The meta object literal for the '<em><b>Eintraege</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXICON__EINTRAEGE = eINSTANCE.getLexicon_Eintraege();

		/**
		 * The meta object literal for the '<em><b>Grammatikalische Kategorien</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXICON__GRAMMATIKALISCHE_KATEGORIEN = eINSTANCE.getLexicon_GrammatikalischeKategorien();

		/**
		 * The meta object literal for the '<em><b>Subkaterorisierungen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXICON__SUBKATERORISIERUNGEN = eINSTANCE.getLexicon_Subkaterorisierungen();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.lexiconmodel.impl.EintragImpl <em>Eintrag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.lexiconmodel.impl.EintragImpl
		 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getEintrag()
		 * @generated
		 */
		EClass EINTRAG = eINSTANCE.getEintrag();

		/**
		 * The meta object literal for the '<em><b>Wort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRAG__WORT = eINSTANCE.getEintrag_Wort();

		/**
		 * The meta object literal for the '<em><b>Auspraegungen Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTRAG__AUSPRAEGUNGEN_CONTAINER = eINSTANCE.getEintrag_AuspraegungenContainer();

		/**
		 * The meta object literal for the '<em><b>Wortart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRAG__WORTART = eINSTANCE.getEintrag_Wortart();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRAG__ID = eINSTANCE.getEintrag_ID();

		/**
		 * The meta object literal for the '<em><b>Rollen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTRAG__ROLLEN = eINSTANCE.getEintrag_Rollen();

		/**
		 * The meta object literal for the '<em><b>Subkaterorisierungen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTRAG__SUBKATERORISIERUNGEN = eINSTANCE.getEintrag_Subkaterorisierungen();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.lexiconmodel.impl.GrammatikalischeKategorieImpl <em>Grammatikalische Kategorie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.lexiconmodel.impl.GrammatikalischeKategorieImpl
		 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getGrammatikalischeKategorie()
		 * @generated
		 */
		EClass GRAMMATIKALISCHE_KATEGORIE = eINSTANCE.getGrammatikalischeKategorie();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMATIKALISCHE_KATEGORIE__BEZEICHNUNG = eINSTANCE.getGrammatikalischeKategorie_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Possiblevalues</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMATIKALISCHE_KATEGORIE__POSSIBLEVALUES = eINSTANCE.getGrammatikalischeKategorie_Possiblevalues();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.lexiconmodel.impl.SubkategorisierungImpl <em>Subkategorisierung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.lexiconmodel.impl.SubkategorisierungImpl
		 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getSubkategorisierung()
		 * @generated
		 */
		EClass SUBKATEGORISIERUNG = eINSTANCE.getSubkategorisierung();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBKATEGORISIERUNG__BEZEICHNUNG = eINSTANCE.getSubkategorisierung_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Auspraegungen Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER = eINSTANCE.getSubkategorisierung_AuspraegungenContainer();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.lexiconmodel.impl.AuspraegungenContainerImpl <em>Auspraegungen Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.lexiconmodel.impl.AuspraegungenContainerImpl
		 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getAuspraegungenContainer()
		 * @generated
		 */
		EClass AUSPRAEGUNGEN_CONTAINER = eINSTANCE.getAuspraegungenContainer();

		/**
		 * The meta object literal for the '<em><b>Auspraegungen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSPRAEGUNGEN_CONTAINER__AUSPRAEGUNGEN = eINSTANCE.getAuspraegungenContainer_Auspraegungen();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.lexiconmodel.impl.AuspraegungImpl <em>Auspraegung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.lexiconmodel.impl.AuspraegungImpl
		 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getAuspraegung()
		 * @generated
		 */
		EClass AUSPRAEGUNG = eINSTANCE.getAuspraegung();

		/**
		 * The meta object literal for the '<em><b>Grammatikalische Kategorie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE = eINSTANCE.getAuspraegung_GrammatikalischeKategorie();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSPRAEGUNG__WERT = eINSTANCE.getAuspraegung_Wert();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.lexiconmodel.Wortart <em>Wortart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.lexiconmodel.Wortart
		 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getWortart()
		 * @generated
		 */
		EEnum WORTART = eINSTANCE.getWortart();

	}

} //LexiconmodelPackage
