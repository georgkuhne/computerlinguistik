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
	 * The number of structural features of the '<em>Lexicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Wortart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG__WORTART = 1;

	/**
	 * The number of structural features of the '<em>Eintrag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eintrag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link home.computerlinguistik.lexiconmodel.Wortart <em>Wortart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see home.computerlinguistik.lexiconmodel.Wortart
	 * @see home.computerlinguistik.lexiconmodel.impl.LexiconmodelPackageImpl#getWortart()
	 * @generated
	 */
	int WORTART = 2;


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
		 * The meta object literal for the '<em><b>Wortart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRAG__WORTART = eINSTANCE.getEintrag_Wortart();

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
