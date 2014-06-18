/**
 */
package home.computerlinguistik.lexiconmodel.impl;

import home.computerlinguistik.lexiconmodel.Auspraegung;
import home.computerlinguistik.lexiconmodel.AuspraegungenContainer;
import home.computerlinguistik.lexiconmodel.Eintrag;
import home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie;
import home.computerlinguistik.lexiconmodel.Lexicon;
import home.computerlinguistik.lexiconmodel.LexiconmodelFactory;
import home.computerlinguistik.lexiconmodel.LexiconmodelPackage;
import home.computerlinguistik.lexiconmodel.Subkategorisierung;
import home.computerlinguistik.lexiconmodel.Wortart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LexiconmodelPackageImpl extends EPackageImpl implements LexiconmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexiconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eintragEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammatikalischeKategorieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subkategorisierungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auspraegungenContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auspraegungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wortartEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LexiconmodelPackageImpl() {
		super(eNS_URI, LexiconmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LexiconmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LexiconmodelPackage init() {
		if (isInited) return (LexiconmodelPackage)EPackage.Registry.INSTANCE.getEPackage(LexiconmodelPackage.eNS_URI);

		// Obtain or create and register package
		LexiconmodelPackageImpl theLexiconmodelPackage = (LexiconmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LexiconmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LexiconmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLexiconmodelPackage.createPackageContents();

		// Initialize created meta-data
		theLexiconmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLexiconmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LexiconmodelPackage.eNS_URI, theLexiconmodelPackage);
		return theLexiconmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexicon() {
		return lexiconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexicon_Eintraege() {
		return (EReference)lexiconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexicon_GrammatikalischeKategorien() {
		return (EReference)lexiconEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEintrag() {
		return eintragEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEintrag_Wort() {
		return (EAttribute)eintragEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEintrag_AuspraegungenContainer() {
		return (EReference)eintragEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEintrag_Wortart() {
		return (EAttribute)eintragEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEintrag_ID() {
		return (EAttribute)eintragEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrammatikalischeKategorie() {
		return grammatikalischeKategorieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrammatikalischeKategorie_Bezeichnung() {
		return (EAttribute)grammatikalischeKategorieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrammatikalischeKategorie_Possiblevalues() {
		return (EAttribute)grammatikalischeKategorieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubkategorisierung() {
		return subkategorisierungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubkategorisierung_Bezeichnung() {
		return (EAttribute)subkategorisierungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubkategorisierung_AuspraegungenContainer() {
		return (EReference)subkategorisierungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuspraegungenContainer() {
		return auspraegungenContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuspraegungenContainer_Auspraegungen() {
		return (EReference)auspraegungenContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuspraegung() {
		return auspraegungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuspraegung_GrammatikalischeKategorie() {
		return (EReference)auspraegungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuspraegung_Wert() {
		return (EAttribute)auspraegungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWortart() {
		return wortartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexiconmodelFactory getLexiconmodelFactory() {
		return (LexiconmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		lexiconEClass = createEClass(LEXICON);
		createEReference(lexiconEClass, LEXICON__EINTRAEGE);
		createEReference(lexiconEClass, LEXICON__GRAMMATIKALISCHE_KATEGORIEN);

		eintragEClass = createEClass(EINTRAG);
		createEAttribute(eintragEClass, EINTRAG__WORT);
		createEReference(eintragEClass, EINTRAG__AUSPRAEGUNGEN_CONTAINER);
		createEAttribute(eintragEClass, EINTRAG__WORTART);
		createEAttribute(eintragEClass, EINTRAG__ID);

		grammatikalischeKategorieEClass = createEClass(GRAMMATIKALISCHE_KATEGORIE);
		createEAttribute(grammatikalischeKategorieEClass, GRAMMATIKALISCHE_KATEGORIE__BEZEICHNUNG);
		createEAttribute(grammatikalischeKategorieEClass, GRAMMATIKALISCHE_KATEGORIE__POSSIBLEVALUES);

		subkategorisierungEClass = createEClass(SUBKATEGORISIERUNG);
		createEAttribute(subkategorisierungEClass, SUBKATEGORISIERUNG__BEZEICHNUNG);
		createEReference(subkategorisierungEClass, SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER);

		auspraegungenContainerEClass = createEClass(AUSPRAEGUNGEN_CONTAINER);
		createEReference(auspraegungenContainerEClass, AUSPRAEGUNGEN_CONTAINER__AUSPRAEGUNGEN);

		auspraegungEClass = createEClass(AUSPRAEGUNG);
		createEReference(auspraegungEClass, AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE);
		createEAttribute(auspraegungEClass, AUSPRAEGUNG__WERT);

		// Create enums
		wortartEEnum = createEEnum(WORTART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(lexiconEClass, Lexicon.class, "Lexicon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLexicon_Eintraege(), this.getEintrag(), null, "eintraege", null, 0, -1, Lexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLexicon_GrammatikalischeKategorien(), this.getGrammatikalischeKategorie(), null, "grammatikalischeKategorien", null, 0, -1, Lexicon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eintragEClass, Eintrag.class, "Eintrag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEintrag_Wort(), ecorePackage.getEString(), "wort", null, 0, 1, Eintrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEintrag_AuspraegungenContainer(), this.getAuspraegungenContainer(), null, "auspraegungenContainer", null, 0, -1, Eintrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEintrag_Wortart(), this.getWortart(), "wortart", null, 0, 1, Eintrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEintrag_ID(), ecorePackage.getELong(), "ID", null, 0, 1, Eintrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grammatikalischeKategorieEClass, GrammatikalischeKategorie.class, "GrammatikalischeKategorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrammatikalischeKategorie_Bezeichnung(), ecorePackage.getEString(), "bezeichnung", null, 0, 1, GrammatikalischeKategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammatikalischeKategorie_Possiblevalues(), ecorePackage.getEString(), "possiblevalues", null, 0, -1, GrammatikalischeKategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subkategorisierungEClass, Subkategorisierung.class, "Subkategorisierung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubkategorisierung_Bezeichnung(), ecorePackage.getEString(), "bezeichnung", null, 0, 1, Subkategorisierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubkategorisierung_AuspraegungenContainer(), this.getAuspraegungenContainer(), null, "auspraegungenContainer", null, 0, -1, Subkategorisierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auspraegungenContainerEClass, AuspraegungenContainer.class, "AuspraegungenContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuspraegungenContainer_Auspraegungen(), this.getAuspraegung(), null, "auspraegungen", null, 0, -1, AuspraegungenContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auspraegungEClass, Auspraegung.class, "Auspraegung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuspraegung_GrammatikalischeKategorie(), this.getGrammatikalischeKategorie(), null, "grammatikalischeKategorie", null, 0, 1, Auspraegung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuspraegung_Wert(), ecorePackage.getEString(), "wert", null, 0, 1, Auspraegung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(wortartEEnum, Wortart.class, "Wortart");
		addEEnumLiteral(wortartEEnum, Wortart.NOMEN);
		addEEnumLiteral(wortartEEnum, Wortart.ADJEKTIV);
		addEEnumLiteral(wortartEEnum, Wortart.VERB);
		addEEnumLiteral(wortartEEnum, Wortart.ADVERB);
		addEEnumLiteral(wortartEEnum, Wortart.PRONOMEN);
		addEEnumLiteral(wortartEEnum, Wortart.NUMERALE);
		addEEnumLiteral(wortartEEnum, Wortart.ARTIKEL);
		addEEnumLiteral(wortartEEnum, Wortart.PRAEPOSITION);
		addEEnumLiteral(wortartEEnum, Wortart.JUNKTOREN);
		addEEnumLiteral(wortartEEnum, Wortart.INTERJEKTION);
		addEEnumLiteral(wortartEEnum, Wortart.PARTIKEL);

		// Create resource
		createResource(eNS_URI);
	}

} //LexiconmodelPackageImpl
