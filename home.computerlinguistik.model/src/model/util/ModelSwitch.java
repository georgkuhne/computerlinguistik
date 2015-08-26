/**
 */
package model.util;

import model.*;

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
 * @see model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK: {
				LexikalischFunktionaleGrammatik lexikalischFunktionaleGrammatik = (LexikalischFunktionaleGrammatik)theEObject;
				T result = caseLexikalischFunktionaleGrammatik(lexikalischFunktionaleGrammatik);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FSTRUKTUR: {
				FStruktur fStruktur = (FStruktur)theEObject;
				T result = caseFStruktur(fStruktur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GRAMMATIK: {
				Grammatik grammatik = (Grammatik)theEObject;
				T result = caseGrammatik(grammatik);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LEXIKON: {
				Lexikon lexikon = (Lexikon)theEObject;
				T result = caseLexikon(lexikon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LEXIKON_EINTRAG: {
				LexikonEintrag lexikonEintrag = (LexikonEintrag)theEObject;
				T result = caseLexikonEintrag(lexikonEintrag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATTRIBUT_WERTE_PAAR: {
				AttributWertePaar attributWertePaar = (AttributWertePaar)theEObject;
				T result = caseAttributWertePaar(attributWertePaar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FUNKTION: {
				Funktion funktion = (Funktion)theEObject;
				T result = caseFunktion(funktion);
				if (result == null) result = caseMerkmalFunktion(funktion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MERKMAL: {
				Merkmal merkmal = (Merkmal)theEObject;
				T result = caseMerkmal(merkmal);
				if (result == null) result = caseMerkmalFunktion(merkmal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = caseNichterminal(terminal);
				if (result == null) result = caseTerminalNichtTerminal(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NICHTERMINAL: {
				Nichterminal nichterminal = (Nichterminal)theEObject;
				T result = caseNichterminal(nichterminal);
				if (result == null) result = caseTerminalNichtTerminal(nichterminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABLEITUNGS_REGEL: {
				AbleitungsRegel ableitungsRegel = (AbleitungsRegel)theEObject;
				T result = caseAbleitungsRegel(ableitungsRegel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TERMINAL_NICHT_TERMINAL: {
				TerminalNichtTerminal terminalNichtTerminal = (TerminalNichtTerminal)theEObject;
				T result = caseTerminalNichtTerminal(terminalNichtTerminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL: {
				AnnotiertesTerminalNichtTerminal annotiertesTerminalNichtTerminal = (AnnotiertesTerminalNichtTerminal)theEObject;
				T result = caseAnnotiertesTerminalNichtTerminal(annotiertesTerminalNichtTerminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MERKMAL_FUNKTION: {
				MerkmalFunktion merkmalFunktion = (MerkmalFunktion)theEObject;
				T result = caseMerkmalFunktion(merkmalFunktion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexikalisch Funktionale Grammatik</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexikalisch Funktionale Grammatik</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexikalischFunktionaleGrammatik(LexikalischFunktionaleGrammatik object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FStruktur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FStruktur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFStruktur(FStruktur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grammatik</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grammatik</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrammatik(Grammatik object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexikon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexikon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexikon(Lexikon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexikon Eintrag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexikon Eintrag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexikonEintrag(LexikonEintrag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribut Werte Paar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribut Werte Paar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributWertePaar(AttributWertePaar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funktion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funktion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunktion(Funktion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merkmal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merkmal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerkmal(Merkmal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nichterminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nichterminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNichterminal(Nichterminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ableitungs Regel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ableitungs Regel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbleitungsRegel(AbleitungsRegel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal Nicht Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal Nicht Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminalNichtTerminal(TerminalNichtTerminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotiertes Terminal Nicht Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotiertes Terminal Nicht Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotiertesTerminalNichtTerminal(AnnotiertesTerminalNichtTerminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merkmal Funktion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merkmal Funktion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerkmalFunktion(MerkmalFunktion object) {
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

} //ModelSwitch
