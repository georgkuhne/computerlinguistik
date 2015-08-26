/**
 */
package model.impl;

import model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK: return createLexikalischFunktionaleGrammatik();
			case ModelPackage.FSTRUKTUR: return createFStruktur();
			case ModelPackage.GRAMMATIK: return createGrammatik();
			case ModelPackage.LEXIKON: return createLexikon();
			case ModelPackage.LEXIKON_EINTRAG: return createLexikonEintrag();
			case ModelPackage.ATTRIBUT_WERTE_PAAR: return createAttributWertePaar();
			case ModelPackage.FUNKTION: return createFunktion();
			case ModelPackage.MERKMAL: return createMerkmal();
			case ModelPackage.TERMINAL: return createTerminal();
			case ModelPackage.NICHTERMINAL: return createNichterminal();
			case ModelPackage.ABLEITUNGS_REGEL: return createAbleitungsRegel();
			case ModelPackage.TERMINAL_NICHT_TERMINAL: return createTerminalNichtTerminal();
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL: return createAnnotiertesTerminalNichtTerminal();
			case ModelPackage.MERKMAL_FUNKTION: return createMerkmalFunktion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.WERT_TYP:
				return createWertTypFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.WERT_TYP:
				return convertWertTypToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexikalischFunktionaleGrammatik createLexikalischFunktionaleGrammatik() {
		LexikalischFunktionaleGrammatikImpl lexikalischFunktionaleGrammatik = new LexikalischFunktionaleGrammatikImpl();
		return lexikalischFunktionaleGrammatik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FStruktur createFStruktur() {
		FStrukturImpl fStruktur = new FStrukturImpl();
		return fStruktur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammatik createGrammatik() {
		GrammatikImpl grammatik = new GrammatikImpl();
		return grammatik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lexikon createLexikon() {
		LexikonImpl lexikon = new LexikonImpl();
		return lexikon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexikonEintrag createLexikonEintrag() {
		LexikonEintragImpl lexikonEintrag = new LexikonEintragImpl();
		return lexikonEintrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributWertePaar createAttributWertePaar() {
		AttributWertePaarImpl attributWertePaar = new AttributWertePaarImpl();
		return attributWertePaar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funktion createFunktion() {
		FunktionImpl funktion = new FunktionImpl();
		return funktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merkmal createMerkmal() {
		MerkmalImpl merkmal = new MerkmalImpl();
		return merkmal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nichterminal createNichterminal() {
		NichterminalImpl nichterminal = new NichterminalImpl();
		return nichterminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbleitungsRegel createAbleitungsRegel() {
		AbleitungsRegelImpl ableitungsRegel = new AbleitungsRegelImpl();
		return ableitungsRegel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalNichtTerminal createTerminalNichtTerminal() {
		TerminalNichtTerminalImpl terminalNichtTerminal = new TerminalNichtTerminalImpl();
		return terminalNichtTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotiertesTerminalNichtTerminal createAnnotiertesTerminalNichtTerminal() {
		AnnotiertesTerminalNichtTerminalImpl annotiertesTerminalNichtTerminal = new AnnotiertesTerminalNichtTerminalImpl();
		return annotiertesTerminalNichtTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerkmalFunktion createMerkmalFunktion() {
		MerkmalFunktionImpl merkmalFunktion = new MerkmalFunktionImpl();
		return merkmalFunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WertTyp createWertTypFromString(EDataType eDataType, String initialValue) {
		WertTyp result = WertTyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWertTypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
