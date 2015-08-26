/**
 */
package model.util;

import model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseLexikalischFunktionaleGrammatik(LexikalischFunktionaleGrammatik object) {
				return createLexikalischFunktionaleGrammatikAdapter();
			}
			@Override
			public Adapter caseFStruktur(FStruktur object) {
				return createFStrukturAdapter();
			}
			@Override
			public Adapter caseGrammatik(Grammatik object) {
				return createGrammatikAdapter();
			}
			@Override
			public Adapter caseLexikon(Lexikon object) {
				return createLexikonAdapter();
			}
			@Override
			public Adapter caseLexikonEintrag(LexikonEintrag object) {
				return createLexikonEintragAdapter();
			}
			@Override
			public Adapter caseAttributWertePaar(AttributWertePaar object) {
				return createAttributWertePaarAdapter();
			}
			@Override
			public Adapter caseFunktion(Funktion object) {
				return createFunktionAdapter();
			}
			@Override
			public Adapter caseMerkmal(Merkmal object) {
				return createMerkmalAdapter();
			}
			@Override
			public Adapter caseTerminal(Terminal object) {
				return createTerminalAdapter();
			}
			@Override
			public Adapter caseNichterminal(Nichterminal object) {
				return createNichterminalAdapter();
			}
			@Override
			public Adapter caseAbleitungsRegel(AbleitungsRegel object) {
				return createAbleitungsRegelAdapter();
			}
			@Override
			public Adapter caseTerminalNichtTerminal(TerminalNichtTerminal object) {
				return createTerminalNichtTerminalAdapter();
			}
			@Override
			public Adapter caseAnnotiertesTerminalNichtTerminal(AnnotiertesTerminalNichtTerminal object) {
				return createAnnotiertesTerminalNichtTerminalAdapter();
			}
			@Override
			public Adapter caseMerkmalFunktion(MerkmalFunktion object) {
				return createMerkmalFunktionAdapter();
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
	 * Creates a new adapter for an object of class '{@link model.LexikalischFunktionaleGrammatik <em>Lexikalisch Funktionale Grammatik</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.LexikalischFunktionaleGrammatik
	 * @generated
	 */
	public Adapter createLexikalischFunktionaleGrammatikAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FStruktur <em>FStruktur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FStruktur
	 * @generated
	 */
	public Adapter createFStrukturAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Grammatik <em>Grammatik</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Grammatik
	 * @generated
	 */
	public Adapter createGrammatikAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Lexikon <em>Lexikon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Lexikon
	 * @generated
	 */
	public Adapter createLexikonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.LexikonEintrag <em>Lexikon Eintrag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.LexikonEintrag
	 * @generated
	 */
	public Adapter createLexikonEintragAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AttributWertePaar <em>Attribut Werte Paar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AttributWertePaar
	 * @generated
	 */
	public Adapter createAttributWertePaarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Funktion <em>Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Funktion
	 * @generated
	 */
	public Adapter createFunktionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Merkmal <em>Merkmal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Merkmal
	 * @generated
	 */
	public Adapter createMerkmalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Nichterminal <em>Nichterminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Nichterminal
	 * @generated
	 */
	public Adapter createNichterminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AbleitungsRegel <em>Ableitungs Regel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AbleitungsRegel
	 * @generated
	 */
	public Adapter createAbleitungsRegelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TerminalNichtTerminal <em>Terminal Nicht Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TerminalNichtTerminal
	 * @generated
	 */
	public Adapter createTerminalNichtTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AnnotiertesTerminalNichtTerminal <em>Annotiertes Terminal Nicht Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AnnotiertesTerminalNichtTerminal
	 * @generated
	 */
	public Adapter createAnnotiertesTerminalNichtTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MerkmalFunktion <em>Merkmal Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MerkmalFunktion
	 * @generated
	 */
	public Adapter createMerkmalFunktionAdapter() {
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

} //ModelAdapterFactory
