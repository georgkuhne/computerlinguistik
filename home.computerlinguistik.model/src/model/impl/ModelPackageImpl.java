/**
 */
package model.impl;

import model.AbleitungsRegel;
import model.AnnotiertesTerminalNichtTerminal;
import model.AttributWertePaar;
import model.FStruktur;
import model.Funktion;
import model.Grammatik;
import model.LexikalischFunktionaleGrammatik;
import model.Lexikon;
import model.LexikonEintrag;
import model.Merkmal;
import model.MerkmalFunktion;
import model.ModelFactory;
import model.ModelPackage;
import model.Nichterminal;
import model.Terminal;
import model.TerminalNichtTerminal;
import model.WertTyp;

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
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexikalischFunktionaleGrammatikEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fStrukturEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammatikEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexikonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexikonEintragEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributWertePaarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funktionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass merkmalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nichterminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ableitungsRegelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalNichtTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotiertesTerminalNichtTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass merkmalFunktionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wertTypEEnum = null;

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
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexikalischFunktionaleGrammatik() {
		return lexikalischFunktionaleGrammatikEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexikalischFunktionaleGrammatik_Funktionen() {
		return (EReference)lexikalischFunktionaleGrammatikEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexikalischFunktionaleGrammatik_Merkmale() {
		return (EReference)lexikalischFunktionaleGrammatikEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexikalischFunktionaleGrammatik_Grammatik() {
		return (EReference)lexikalischFunktionaleGrammatikEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexikalischFunktionaleGrammatik_Lexikon() {
		return (EReference)lexikalischFunktionaleGrammatikEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexikalischFunktionaleGrammatik_ID() {
		return (EAttribute)lexikalischFunktionaleGrammatikEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexikalischFunktionaleGrammatik_Name() {
		return (EAttribute)lexikalischFunktionaleGrammatikEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFStruktur() {
		return fStrukturEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFStruktur_AttributWertePaare() {
		return (EReference)fStrukturEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrammatik() {
		return grammatikEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammatik_Terminale() {
		return (EReference)grammatikEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammatik_S0() {
		return (EReference)grammatikEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammatik_NichtTerminale() {
		return (EReference)grammatikEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammatik_Regeln() {
		return (EReference)grammatikEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexikon() {
		return lexikonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexikon_Eintraege() {
		return (EReference)lexikonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexikonEintrag() {
		return lexikonEintragEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLexikonEintrag_Name() {
		return (EAttribute)lexikonEintragEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexikonEintrag_Wortart() {
		return (EReference)lexikonEintragEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexikonEintrag_Auspraegungen() {
		return (EReference)lexikonEintragEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributWertePaar() {
		return attributWertePaarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributWertePaar_WertTyp() {
		return (EAttribute)attributWertePaarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributWertePaar_Funktion() {
		return (EReference)attributWertePaarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributWertePaar_FunktionsWert() {
		return (EReference)attributWertePaarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributWertePaar_Merkmal() {
		return (EReference)attributWertePaarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributWertePaar_MerkmalsWert() {
		return (EAttribute)attributWertePaarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunktion() {
		return funktionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMerkmal() {
		return merkmalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMerkmal_MoeglicheWerte() {
		return (EAttribute)merkmalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNichterminal() {
		return nichterminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbleitungsRegel() {
		return ableitungsRegelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbleitungsRegel_Von() {
		return (EReference)ableitungsRegelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbleitungsRegel_Auf() {
		return (EReference)ableitungsRegelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalNichtTerminal() {
		return terminalNichtTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminalNichtTerminal_Name() {
		return (EAttribute)terminalNichtTerminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotiertesTerminalNichtTerminal() {
		return annotiertesTerminalNichtTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotiertesTerminalNichtTerminal_Aufwaertspfeil() {
		return (EReference)annotiertesTerminalNichtTerminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotiertesTerminalNichtTerminal_Abwaertspfeil() {
		return (EReference)annotiertesTerminalNichtTerminalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotiertesTerminalNichtTerminal_TerminalNichtTerminal() {
		return (EReference)annotiertesTerminalNichtTerminalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMerkmalFunktion() {
		return merkmalFunktionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMerkmalFunktion_Name() {
		return (EAttribute)merkmalFunktionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWertTyp() {
		return wertTypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		lexikalischFunktionaleGrammatikEClass = createEClass(LEXIKALISCH_FUNKTIONALE_GRAMMATIK);
		createEReference(lexikalischFunktionaleGrammatikEClass, LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN);
		createEReference(lexikalischFunktionaleGrammatikEClass, LEXIKALISCH_FUNKTIONALE_GRAMMATIK__MERKMALE);
		createEReference(lexikalischFunktionaleGrammatikEClass, LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK);
		createEReference(lexikalischFunktionaleGrammatikEClass, LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON);
		createEAttribute(lexikalischFunktionaleGrammatikEClass, LEXIKALISCH_FUNKTIONALE_GRAMMATIK__ID);
		createEAttribute(lexikalischFunktionaleGrammatikEClass, LEXIKALISCH_FUNKTIONALE_GRAMMATIK__NAME);

		fStrukturEClass = createEClass(FSTRUKTUR);
		createEReference(fStrukturEClass, FSTRUKTUR__ATTRIBUT_WERTE_PAARE);

		grammatikEClass = createEClass(GRAMMATIK);
		createEReference(grammatikEClass, GRAMMATIK__TERMINALE);
		createEReference(grammatikEClass, GRAMMATIK__S0);
		createEReference(grammatikEClass, GRAMMATIK__NICHT_TERMINALE);
		createEReference(grammatikEClass, GRAMMATIK__REGELN);

		lexikonEClass = createEClass(LEXIKON);
		createEReference(lexikonEClass, LEXIKON__EINTRAEGE);

		lexikonEintragEClass = createEClass(LEXIKON_EINTRAG);
		createEAttribute(lexikonEintragEClass, LEXIKON_EINTRAG__NAME);
		createEReference(lexikonEintragEClass, LEXIKON_EINTRAG__WORTART);
		createEReference(lexikonEintragEClass, LEXIKON_EINTRAG__AUSPRAEGUNGEN);

		attributWertePaarEClass = createEClass(ATTRIBUT_WERTE_PAAR);
		createEAttribute(attributWertePaarEClass, ATTRIBUT_WERTE_PAAR__WERT_TYP);
		createEReference(attributWertePaarEClass, ATTRIBUT_WERTE_PAAR__FUNKTION);
		createEReference(attributWertePaarEClass, ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT);
		createEReference(attributWertePaarEClass, ATTRIBUT_WERTE_PAAR__MERKMAL);
		createEAttribute(attributWertePaarEClass, ATTRIBUT_WERTE_PAAR__MERKMALS_WERT);

		funktionEClass = createEClass(FUNKTION);

		merkmalEClass = createEClass(MERKMAL);
		createEAttribute(merkmalEClass, MERKMAL__MOEGLICHE_WERTE);

		terminalEClass = createEClass(TERMINAL);

		nichterminalEClass = createEClass(NICHTERMINAL);

		ableitungsRegelEClass = createEClass(ABLEITUNGS_REGEL);
		createEReference(ableitungsRegelEClass, ABLEITUNGS_REGEL__VON);
		createEReference(ableitungsRegelEClass, ABLEITUNGS_REGEL__AUF);

		terminalNichtTerminalEClass = createEClass(TERMINAL_NICHT_TERMINAL);
		createEAttribute(terminalNichtTerminalEClass, TERMINAL_NICHT_TERMINAL__NAME);

		annotiertesTerminalNichtTerminalEClass = createEClass(ANNOTIERTES_TERMINAL_NICHT_TERMINAL);
		createEReference(annotiertesTerminalNichtTerminalEClass, ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL);
		createEReference(annotiertesTerminalNichtTerminalEClass, ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL);
		createEReference(annotiertesTerminalNichtTerminalEClass, ANNOTIERTES_TERMINAL_NICHT_TERMINAL__TERMINAL_NICHT_TERMINAL);

		merkmalFunktionEClass = createEClass(MERKMAL_FUNKTION);
		createEAttribute(merkmalFunktionEClass, MERKMAL_FUNKTION__NAME);

		// Create enums
		wertTypEEnum = createEEnum(WERT_TYP);
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
		funktionEClass.getESuperTypes().add(this.getMerkmalFunktion());
		merkmalEClass.getESuperTypes().add(this.getMerkmalFunktion());
		terminalEClass.getESuperTypes().add(this.getNichterminal());
		nichterminalEClass.getESuperTypes().add(this.getTerminalNichtTerminal());

		// Initialize classes, features, and operations; add parameters
		initEClass(lexikalischFunktionaleGrammatikEClass, LexikalischFunktionaleGrammatik.class, "LexikalischFunktionaleGrammatik", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLexikalischFunktionaleGrammatik_Funktionen(), this.getFunktion(), null, "funktionen", null, 0, -1, LexikalischFunktionaleGrammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLexikalischFunktionaleGrammatik_Merkmale(), this.getMerkmal(), null, "merkmale", null, 0, -1, LexikalischFunktionaleGrammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLexikalischFunktionaleGrammatik_Grammatik(), this.getGrammatik(), null, "grammatik", null, 0, 1, LexikalischFunktionaleGrammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLexikalischFunktionaleGrammatik_Lexikon(), this.getLexikon(), null, "lexikon", null, 0, 1, LexikalischFunktionaleGrammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLexikalischFunktionaleGrammatik_ID(), ecorePackage.getELong(), "ID", null, 0, 1, LexikalischFunktionaleGrammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLexikalischFunktionaleGrammatik_Name(), ecorePackage.getEString(), "name", null, 0, 1, LexikalischFunktionaleGrammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fStrukturEClass, FStruktur.class, "FStruktur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFStruktur_AttributWertePaare(), this.getAttributWertePaar(), null, "attributWertePaare", null, 0, -1, FStruktur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grammatikEClass, Grammatik.class, "Grammatik", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrammatik_Terminale(), this.getTerminal(), null, "terminale", null, 0, -1, Grammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammatik_S0(), this.getNichterminal(), null, "s0", null, 0, 1, Grammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammatik_NichtTerminale(), this.getNichterminal(), null, "nichtTerminale", null, 0, -1, Grammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammatik_Regeln(), this.getAbleitungsRegel(), null, "regeln", null, 0, -1, Grammatik.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lexikonEClass, Lexikon.class, "Lexikon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLexikon_Eintraege(), this.getLexikonEintrag(), null, "eintraege", null, 0, -1, Lexikon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lexikonEintragEClass, LexikonEintrag.class, "LexikonEintrag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLexikonEintrag_Name(), ecorePackage.getEString(), "name", null, 0, 1, LexikonEintrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLexikonEintrag_Wortart(), this.getTerminal(), null, "wortart", null, 0, 1, LexikonEintrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLexikonEintrag_Auspraegungen(), this.getFStruktur(), null, "auspraegungen", null, 0, -1, LexikonEintrag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributWertePaarEClass, AttributWertePaar.class, "AttributWertePaar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributWertePaar_WertTyp(), this.getWertTyp(), "wertTyp", "Merkmal", 0, 1, AttributWertePaar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributWertePaar_Funktion(), this.getFunktion(), null, "funktion", null, 0, 1, AttributWertePaar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributWertePaar_FunktionsWert(), this.getFStruktur(), null, "funktionsWert", null, 0, 1, AttributWertePaar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributWertePaar_Merkmal(), this.getMerkmal(), null, "merkmal", null, 0, 1, AttributWertePaar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributWertePaar_MerkmalsWert(), ecorePackage.getEString(), "merkmalsWert", null, 0, 1, AttributWertePaar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funktionEClass, Funktion.class, "Funktion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(merkmalEClass, Merkmal.class, "Merkmal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMerkmal_MoeglicheWerte(), ecorePackage.getEString(), "moeglicheWerte", null, 0, -1, Merkmal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nichterminalEClass, Nichterminal.class, "Nichterminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ableitungsRegelEClass, AbleitungsRegel.class, "AbleitungsRegel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbleitungsRegel_Von(), this.getNichterminal(), null, "von", null, 0, 1, AbleitungsRegel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbleitungsRegel_Auf(), this.getAnnotiertesTerminalNichtTerminal(), null, "auf", null, 0, -1, AbleitungsRegel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalNichtTerminalEClass, TerminalNichtTerminal.class, "TerminalNichtTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminalNichtTerminal_Name(), ecorePackage.getEString(), "name", null, 0, 1, TerminalNichtTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotiertesTerminalNichtTerminalEClass, AnnotiertesTerminalNichtTerminal.class, "AnnotiertesTerminalNichtTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotiertesTerminalNichtTerminal_Aufwaertspfeil(), this.getMerkmalFunktion(), null, "Aufwaertspfeil", null, 0, -1, AnnotiertesTerminalNichtTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotiertesTerminalNichtTerminal_Abwaertspfeil(), this.getMerkmalFunktion(), null, "Abwaertspfeil", null, 0, -1, AnnotiertesTerminalNichtTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotiertesTerminalNichtTerminal_TerminalNichtTerminal(), this.getTerminalNichtTerminal(), null, "terminalNichtTerminal", null, 0, 1, AnnotiertesTerminalNichtTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(merkmalFunktionEClass, MerkmalFunktion.class, "MerkmalFunktion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMerkmalFunktion_Name(), ecorePackage.getEString(), "name", "", 0, 1, MerkmalFunktion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(wertTypEEnum, WertTyp.class, "WertTyp");
		addEEnumLiteral(wertTypEEnum, WertTyp.MERKMAL);
		addEEnumLiteral(wertTypEEnum, WertTyp.FUNKTION);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
