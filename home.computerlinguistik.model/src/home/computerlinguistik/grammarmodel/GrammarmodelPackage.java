/**
 */
package home.computerlinguistik.grammarmodel;

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
 * @see home.computerlinguistik.grammarmodel.GrammarmodelFactory
 * @model kind="package"
 * @generated
 */
public interface GrammarmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammarmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "grammar";

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
	GrammarmodelPackage eINSTANCE = home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link home.computerlinguistik.grammarmodel.impl.AttributRegelTermImpl <em>Attribut Regel Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.grammarmodel.impl.AttributRegelTermImpl
	 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getAttributRegelTerm()
	 * @generated
	 */
	int ATTRIBUT_REGEL_TERM = 0;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_REGEL_TERM__TYP = 0;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_REGEL_TERM__WERT = 1;

	/**
	 * The number of structural features of the '<em>Attribut Regel Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_REGEL_TERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribut Regel Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_REGEL_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.grammarmodel.impl.NichtTerminalImpl <em>Nicht Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.grammarmodel.impl.NichtTerminalImpl
	 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getNichtTerminal()
	 * @generated
	 */
	int NICHT_TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHT_TERMINAL__BEZEICHNUNG = 0;

	/**
	 * The feature id for the '<em><b>Attribut Regeln</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHT_TERMINAL__ATTRIBUT_REGELN = 1;

	/**
	 * The number of structural features of the '<em>Nicht Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHT_TERMINAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nicht Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NICHT_TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.grammarmodel.impl.AttributRegelImpl <em>Attribut Regel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.grammarmodel.impl.AttributRegelImpl
	 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getAttributRegel()
	 * @generated
	 */
	int ATTRIBUT_REGEL = 2;

	/**
	 * The feature id for the '<em><b>Rechts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_REGEL__RECHTS = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_REGEL__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Attribut Regel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_REGEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribut Regel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_REGEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.grammarmodel.impl.RegelImpl <em>Regel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.grammarmodel.impl.RegelImpl
	 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getRegel()
	 * @generated
	 */
	int REGEL = 3;

	/**
	 * The feature id for the '<em><b>Elternterminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL__ELTERNTERMINAL = 0;

	/**
	 * The feature id for the '<em><b>Kinder Terminale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL__KINDER_TERMINALE = 1;

	/**
	 * The feature id for the '<em><b>Wortart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL__WORTART = 2;

	/**
	 * The number of structural features of the '<em>Regel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Regel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.grammarmodel.AttributRegelTermTyp <em>Attribut Regel Term Typ</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.grammarmodel.AttributRegelTermTyp
	 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getAttributRegelTermTyp()
	 * @generated
	 */
	int ATTRIBUT_REGEL_TERM_TYP = 4;


	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.grammarmodel.AttributRegelTerm <em>Attribut Regel Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut Regel Term</em>'.
	 * @see home.computerlinguistik.grammarmodel.AttributRegelTerm
	 * @generated
	 */
	EClass getAttributRegelTerm();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.grammarmodel.AttributRegelTerm#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see home.computerlinguistik.grammarmodel.AttributRegelTerm#getTyp()
	 * @see #getAttributRegelTerm()
	 * @generated
	 */
	EAttribute getAttributRegelTerm_Typ();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.grammarmodel.AttributRegelTerm#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see home.computerlinguistik.grammarmodel.AttributRegelTerm#getWert()
	 * @see #getAttributRegelTerm()
	 * @generated
	 */
	EAttribute getAttributRegelTerm_Wert();

	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.grammarmodel.NichtTerminal <em>Nicht Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nicht Terminal</em>'.
	 * @see home.computerlinguistik.grammarmodel.NichtTerminal
	 * @generated
	 */
	EClass getNichtTerminal();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.grammarmodel.NichtTerminal#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see home.computerlinguistik.grammarmodel.NichtTerminal#getBezeichnung()
	 * @see #getNichtTerminal()
	 * @generated
	 */
	EAttribute getNichtTerminal_Bezeichnung();

	/**
	 * Returns the meta object for the reference list '{@link home.computerlinguistik.grammarmodel.NichtTerminal#getAttributRegeln <em>Attribut Regeln</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribut Regeln</em>'.
	 * @see home.computerlinguistik.grammarmodel.NichtTerminal#getAttributRegeln()
	 * @see #getNichtTerminal()
	 * @generated
	 */
	EReference getNichtTerminal_AttributRegeln();

	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.grammarmodel.AttributRegel <em>Attribut Regel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut Regel</em>'.
	 * @see home.computerlinguistik.grammarmodel.AttributRegel
	 * @generated
	 */
	EClass getAttributRegel();

	/**
	 * Returns the meta object for the containment reference '{@link home.computerlinguistik.grammarmodel.AttributRegel#getRechts <em>Rechts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rechts</em>'.
	 * @see home.computerlinguistik.grammarmodel.AttributRegel#getRechts()
	 * @see #getAttributRegel()
	 * @generated
	 */
	EReference getAttributRegel_Rechts();

	/**
	 * Returns the meta object for the containment reference '{@link home.computerlinguistik.grammarmodel.AttributRegel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Links</em>'.
	 * @see home.computerlinguistik.grammarmodel.AttributRegel#getLinks()
	 * @see #getAttributRegel()
	 * @generated
	 */
	EReference getAttributRegel_Links();

	/**
	 * Returns the meta object for class '{@link home.computerlinguistik.grammarmodel.Regel <em>Regel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regel</em>'.
	 * @see home.computerlinguistik.grammarmodel.Regel
	 * @generated
	 */
	EClass getRegel();

	/**
	 * Returns the meta object for the containment reference '{@link home.computerlinguistik.grammarmodel.Regel#getElternterminal <em>Elternterminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elternterminal</em>'.
	 * @see home.computerlinguistik.grammarmodel.Regel#getElternterminal()
	 * @see #getRegel()
	 * @generated
	 */
	EReference getRegel_Elternterminal();

	/**
	 * Returns the meta object for the reference list '{@link home.computerlinguistik.grammarmodel.Regel#getKinderTerminale <em>Kinder Terminale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Kinder Terminale</em>'.
	 * @see home.computerlinguistik.grammarmodel.Regel#getKinderTerminale()
	 * @see #getRegel()
	 * @generated
	 */
	EReference getRegel_KinderTerminale();

	/**
	 * Returns the meta object for the attribute '{@link home.computerlinguistik.grammarmodel.Regel#getWortart <em>Wortart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wortart</em>'.
	 * @see home.computerlinguistik.grammarmodel.Regel#getWortart()
	 * @see #getRegel()
	 * @generated
	 */
	EAttribute getRegel_Wortart();

	/**
	 * Returns the meta object for enum '{@link home.computerlinguistik.grammarmodel.AttributRegelTermTyp <em>Attribut Regel Term Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribut Regel Term Typ</em>'.
	 * @see home.computerlinguistik.grammarmodel.AttributRegelTermTyp
	 * @generated
	 */
	EEnum getAttributRegelTermTyp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammarmodelFactory getGrammarmodelFactory();

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
		 * The meta object literal for the '{@link home.computerlinguistik.grammarmodel.impl.AttributRegelTermImpl <em>Attribut Regel Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.grammarmodel.impl.AttributRegelTermImpl
		 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getAttributRegelTerm()
		 * @generated
		 */
		EClass ATTRIBUT_REGEL_TERM = eINSTANCE.getAttributRegelTerm();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT_REGEL_TERM__TYP = eINSTANCE.getAttributRegelTerm_Typ();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT_REGEL_TERM__WERT = eINSTANCE.getAttributRegelTerm_Wert();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.grammarmodel.impl.NichtTerminalImpl <em>Nicht Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.grammarmodel.impl.NichtTerminalImpl
		 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getNichtTerminal()
		 * @generated
		 */
		EClass NICHT_TERMINAL = eINSTANCE.getNichtTerminal();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NICHT_TERMINAL__BEZEICHNUNG = eINSTANCE.getNichtTerminal_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Attribut Regeln</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NICHT_TERMINAL__ATTRIBUT_REGELN = eINSTANCE.getNichtTerminal_AttributRegeln();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.grammarmodel.impl.AttributRegelImpl <em>Attribut Regel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.grammarmodel.impl.AttributRegelImpl
		 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getAttributRegel()
		 * @generated
		 */
		EClass ATTRIBUT_REGEL = eINSTANCE.getAttributRegel();

		/**
		 * The meta object literal for the '<em><b>Rechts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUT_REGEL__RECHTS = eINSTANCE.getAttributRegel_Rechts();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUT_REGEL__LINKS = eINSTANCE.getAttributRegel_Links();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.grammarmodel.impl.RegelImpl <em>Regel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.grammarmodel.impl.RegelImpl
		 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getRegel()
		 * @generated
		 */
		EClass REGEL = eINSTANCE.getRegel();

		/**
		 * The meta object literal for the '<em><b>Elternterminal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGEL__ELTERNTERMINAL = eINSTANCE.getRegel_Elternterminal();

		/**
		 * The meta object literal for the '<em><b>Kinder Terminale</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGEL__KINDER_TERMINALE = eINSTANCE.getRegel_KinderTerminale();

		/**
		 * The meta object literal for the '<em><b>Wortart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEL__WORTART = eINSTANCE.getRegel_Wortart();

		/**
		 * The meta object literal for the '{@link home.computerlinguistik.grammarmodel.AttributRegelTermTyp <em>Attribut Regel Term Typ</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see home.computerlinguistik.grammarmodel.AttributRegelTermTyp
		 * @see home.computerlinguistik.grammarmodel.impl.GrammarmodelPackageImpl#getAttributRegelTermTyp()
		 * @generated
		 */
		EEnum ATTRIBUT_REGEL_TERM_TYP = eINSTANCE.getAttributRegelTermTyp();

	}

} //GrammarmodelPackage
