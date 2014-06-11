/**
 */
package grammarmodel.impl;

import grammarmodel.*;

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
public class GrammarmodelFactoryImpl extends EFactoryImpl implements GrammarmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammarmodelFactory init() {
		try {
			GrammarmodelFactory theGrammarmodelFactory = (GrammarmodelFactory)EPackage.Registry.INSTANCE.getEFactory(GrammarmodelPackage.eNS_URI);
			if (theGrammarmodelFactory != null) {
				return theGrammarmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammarmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarmodelFactoryImpl() {
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
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM: return createAttributRegelTerm();
			case GrammarmodelPackage.NICHT_TERMINAL: return createNichtTerminal();
			case GrammarmodelPackage.ATTRIBUT_REGEL: return createAttributRegel();
			case GrammarmodelPackage.REGEL: return createRegel();
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
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM_TYP:
				return createAttributRegelTermTypFromString(eDataType, initialValue);
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
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM_TYP:
				return convertAttributRegelTermTypToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributRegelTerm createAttributRegelTerm() {
		AttributRegelTermImpl attributRegelTerm = new AttributRegelTermImpl();
		return attributRegelTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NichtTerminal createNichtTerminal() {
		NichtTerminalImpl nichtTerminal = new NichtTerminalImpl();
		return nichtTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributRegel createAttributRegel() {
		AttributRegelImpl attributRegel = new AttributRegelImpl();
		return attributRegel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regel createRegel() {
		RegelImpl regel = new RegelImpl();
		return regel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributRegelTermTyp createAttributRegelTermTypFromString(EDataType eDataType, String initialValue) {
		AttributRegelTermTyp result = AttributRegelTermTyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributRegelTermTypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarmodelPackage getGrammarmodelPackage() {
		return (GrammarmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammarmodelPackage getPackage() {
		return GrammarmodelPackage.eINSTANCE;
	}

} //GrammarmodelFactoryImpl
