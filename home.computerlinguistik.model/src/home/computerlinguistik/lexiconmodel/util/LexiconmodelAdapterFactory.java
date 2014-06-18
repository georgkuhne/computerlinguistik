/**
 */
package home.computerlinguistik.lexiconmodel.util;

import home.computerlinguistik.lexiconmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage
 * @generated
 */
public class LexiconmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LexiconmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexiconmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LexiconmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexiconmodelSwitch<Adapter> modelSwitch =
		new LexiconmodelSwitch<Adapter>() {
			@Override
			public Adapter caseLexicon(Lexicon object) {
				return createLexiconAdapter();
			}
			@Override
			public Adapter caseEintrag(Eintrag object) {
				return createEintragAdapter();
			}
			@Override
			public Adapter caseGrammatikalischeKategorie(GrammatikalischeKategorie object) {
				return createGrammatikalischeKategorieAdapter();
			}
			@Override
			public Adapter caseSubkategorisierung(Subkategorisierung object) {
				return createSubkategorisierungAdapter();
			}
			@Override
			public Adapter caseAuspraegungenContainer(AuspraegungenContainer object) {
				return createAuspraegungenContainerAdapter();
			}
			@Override
			public Adapter caseAuspraegung(Auspraegung object) {
				return createAuspraegungAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link home.computerlinguistik.lexiconmodel.Lexicon <em>Lexicon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see home.computerlinguistik.lexiconmodel.Lexicon
	 * @generated
	 */
	public Adapter createLexiconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link home.computerlinguistik.lexiconmodel.Eintrag <em>Eintrag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see home.computerlinguistik.lexiconmodel.Eintrag
	 * @generated
	 */
	public Adapter createEintragAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie <em>Grammatikalische Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie
	 * @generated
	 */
	public Adapter createGrammatikalischeKategorieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link home.computerlinguistik.lexiconmodel.Subkategorisierung <em>Subkategorisierung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see home.computerlinguistik.lexiconmodel.Subkategorisierung
	 * @generated
	 */
	public Adapter createSubkategorisierungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link home.computerlinguistik.lexiconmodel.AuspraegungenContainer <em>Auspraegungen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see home.computerlinguistik.lexiconmodel.AuspraegungenContainer
	 * @generated
	 */
	public Adapter createAuspraegungenContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link home.computerlinguistik.lexiconmodel.Auspraegung <em>Auspraegung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see home.computerlinguistik.lexiconmodel.Auspraegung
	 * @generated
	 */
	public Adapter createAuspraegungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LexiconmodelAdapterFactory
