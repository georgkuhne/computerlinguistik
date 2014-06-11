/**
 */
package grammarmodel.impl;

import grammarmodel.AttributRegel;
import grammarmodel.AttributRegelTerm;
import grammarmodel.AttributRegelTermTyp;
import grammarmodel.GrammarmodelFactory;
import grammarmodel.GrammarmodelPackage;
import grammarmodel.NichtTerminal;
import grammarmodel.Regel;

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
public class GrammarmodelPackageImpl extends EPackageImpl implements GrammarmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributRegelTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nichtTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributRegelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributRegelTermTypEEnum = null;

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
	 * @see grammarmodel.GrammarmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrammarmodelPackageImpl() {
		super(eNS_URI, GrammarmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GrammarmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrammarmodelPackage init() {
		if (isInited) return (GrammarmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarmodelPackage.eNS_URI);

		// Obtain or create and register package
		GrammarmodelPackageImpl theGrammarmodelPackage = (GrammarmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GrammarmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GrammarmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGrammarmodelPackage.createPackageContents();

		// Initialize created meta-data
		theGrammarmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrammarmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrammarmodelPackage.eNS_URI, theGrammarmodelPackage);
		return theGrammarmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributRegelTerm() {
		return attributRegelTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributRegelTerm_Typ() {
		return (EAttribute)attributRegelTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributRegelTerm_Wert() {
		return (EAttribute)attributRegelTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNichtTerminal() {
		return nichtTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNichtTerminal_Bezeichnung() {
		return (EAttribute)nichtTerminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNichtTerminal_AttributRegeln() {
		return (EReference)nichtTerminalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributRegel() {
		return attributRegelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributRegel_Rechts() {
		return (EReference)attributRegelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributRegel_Links() {
		return (EReference)attributRegelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegel() {
		return regelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegel_Elternterminal() {
		return (EReference)regelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegel_KinderTerminale() {
		return (EReference)regelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegel_Wortart() {
		return (EAttribute)regelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributRegelTermTyp() {
		return attributRegelTermTypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarmodelFactory getGrammarmodelFactory() {
		return (GrammarmodelFactory)getEFactoryInstance();
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
		attributRegelTermEClass = createEClass(ATTRIBUT_REGEL_TERM);
		createEAttribute(attributRegelTermEClass, ATTRIBUT_REGEL_TERM__TYP);
		createEAttribute(attributRegelTermEClass, ATTRIBUT_REGEL_TERM__WERT);

		nichtTerminalEClass = createEClass(NICHT_TERMINAL);
		createEAttribute(nichtTerminalEClass, NICHT_TERMINAL__BEZEICHNUNG);
		createEReference(nichtTerminalEClass, NICHT_TERMINAL__ATTRIBUT_REGELN);

		attributRegelEClass = createEClass(ATTRIBUT_REGEL);
		createEReference(attributRegelEClass, ATTRIBUT_REGEL__RECHTS);
		createEReference(attributRegelEClass, ATTRIBUT_REGEL__LINKS);

		regelEClass = createEClass(REGEL);
		createEReference(regelEClass, REGEL__ELTERNTERMINAL);
		createEReference(regelEClass, REGEL__KINDER_TERMINALE);
		createEAttribute(regelEClass, REGEL__WORTART);

		// Create enums
		attributRegelTermTypEEnum = createEEnum(ATTRIBUT_REGEL_TERM_TYP);
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
		initEClass(attributRegelTermEClass, AttributRegelTerm.class, "AttributRegelTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributRegelTerm_Typ(), this.getAttributRegelTermTyp(), "Typ", null, 0, 1, AttributRegelTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributRegelTerm_Wert(), ecorePackage.getEString(), "Wert", null, 0, 1, AttributRegelTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nichtTerminalEClass, NichtTerminal.class, "NichtTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNichtTerminal_Bezeichnung(), ecorePackage.getEString(), "Bezeichnung", null, 0, 1, NichtTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNichtTerminal_AttributRegeln(), this.getAttributRegel(), null, "AttributRegeln", null, 0, -1, NichtTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributRegelEClass, AttributRegel.class, "AttributRegel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributRegel_Rechts(), this.getAttributRegelTerm(), null, "Rechts", null, 0, 1, AttributRegel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributRegel_Links(), this.getAttributRegelTerm(), null, "Links", null, 0, 1, AttributRegel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regelEClass, Regel.class, "Regel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegel_Elternterminal(), this.getNichtTerminal(), null, "Elternterminal", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegel_KinderTerminale(), this.getNichtTerminal(), null, "KinderTerminale", null, 0, -1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegel_Wortart(), ecorePackage.getEString(), "Wortart", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attributRegelTermTypEEnum, AttributRegelTermTyp.class, "AttributRegelTermTyp");
		addEEnumLiteral(attributRegelTermTypEEnum, AttributRegelTermTyp.OBEN);
		addEEnumLiteral(attributRegelTermTypEEnum, AttributRegelTermTyp.UNTEN);
		addEEnumLiteral(attributRegelTermTypEEnum, AttributRegelTermTyp.KONSTANTE);

		// Create resource
		createResource(eNS_URI);
	}

} //GrammarmodelPackageImpl
