/**
 */
package home.computerlinguistik.lexiconmodel.util;

import home.computerlinguistik.lexiconmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see home.computerlinguistik.lexiconmodel.LexiconmodelPackage
 * @generated
 */
public class LexiconmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LexiconmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexiconmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = LexiconmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LexiconmodelPackage.LEXICON: {
				Lexicon lexicon = (Lexicon)theEObject;
				T result = caseLexicon(lexicon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LexiconmodelPackage.EINTRAG: {
				Eintrag eintrag = (Eintrag)theEObject;
				T result = caseEintrag(eintrag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE: {
				GrammatikalischeKategorie grammatikalischeKategorie = (GrammatikalischeKategorie)theEObject;
				T result = caseGrammatikalischeKategorie(grammatikalischeKategorie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LexiconmodelPackage.SUBKATEGORISIERUNG: {
				Subkategorisierung subkategorisierung = (Subkategorisierung)theEObject;
				T result = caseSubkategorisierung(subkategorisierung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LexiconmodelPackage.AUSPRAEGUNGEN_CONTAINER: {
				AuspraegungenContainer auspraegungenContainer = (AuspraegungenContainer)theEObject;
				T result = caseAuspraegungenContainer(auspraegungenContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LexiconmodelPackage.AUSPRAEGUNG: {
				Auspraegung auspraegung = (Auspraegung)theEObject;
				T result = caseAuspraegung(auspraegung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexicon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexicon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexicon(Lexicon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eintrag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eintrag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEintrag(Eintrag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grammatikalische Kategorie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grammatikalische Kategorie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrammatikalischeKategorie(GrammatikalischeKategorie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subkategorisierung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subkategorisierung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubkategorisierung(Subkategorisierung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auspraegungen Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auspraegungen Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuspraegungenContainer(AuspraegungenContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auspraegung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auspraegung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuspraegung(Auspraegung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LexiconmodelSwitch
