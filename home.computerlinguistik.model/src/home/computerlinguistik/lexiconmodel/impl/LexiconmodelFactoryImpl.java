/**
 */
package home.computerlinguistik.lexiconmodel.impl;

import home.computerlinguistik.lexiconmodel.*;

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
public class LexiconmodelFactoryImpl extends EFactoryImpl implements LexiconmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LexiconmodelFactory init() {
		try {
			LexiconmodelFactory theLexiconmodelFactory = (LexiconmodelFactory)EPackage.Registry.INSTANCE.getEFactory(LexiconmodelPackage.eNS_URI);
			if (theLexiconmodelFactory != null) {
				return theLexiconmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LexiconmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexiconmodelFactoryImpl() {
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
			case LexiconmodelPackage.LEXICON: return createLexicon();
			case LexiconmodelPackage.EINTRAG: return createEintrag();
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE: return createGrammatikalischeKategorie();
			case LexiconmodelPackage.SUBKATEGORISIERUNG: return createSubkategorisierung();
			case LexiconmodelPackage.AUSPRAEGUNGEN_CONTAINER: return createAuspraegungenContainer();
			case LexiconmodelPackage.AUSPRAEGUNG: return createAuspraegung();
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
			case LexiconmodelPackage.WORTART:
				return createWortartFromString(eDataType, initialValue);
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
			case LexiconmodelPackage.WORTART:
				return convertWortartToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lexicon createLexicon() {
		LexiconImpl lexicon = new LexiconImpl();
		return lexicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eintrag createEintrag() {
		EintragImpl eintrag = new EintragImpl();
		return eintrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammatikalischeKategorie createGrammatikalischeKategorie() {
		GrammatikalischeKategorieImpl grammatikalischeKategorie = new GrammatikalischeKategorieImpl();
		return grammatikalischeKategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subkategorisierung createSubkategorisierung() {
		SubkategorisierungImpl subkategorisierung = new SubkategorisierungImpl();
		return subkategorisierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuspraegungenContainer createAuspraegungenContainer() {
		AuspraegungenContainerImpl auspraegungenContainer = new AuspraegungenContainerImpl();
		return auspraegungenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auspraegung createAuspraegung() {
		AuspraegungImpl auspraegung = new AuspraegungImpl();
		return auspraegung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wortart createWortartFromString(EDataType eDataType, String initialValue) {
		Wortart result = Wortart.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWortartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexiconmodelPackage getLexiconmodelPackage() {
		return (LexiconmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LexiconmodelPackage getPackage() {
		return LexiconmodelPackage.eINSTANCE;
	}

} //LexiconmodelFactoryImpl
