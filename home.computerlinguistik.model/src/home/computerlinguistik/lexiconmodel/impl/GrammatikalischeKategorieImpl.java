/**
 */
package home.computerlinguistik.lexiconmodel.impl;

import home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie;
import home.computerlinguistik.lexiconmodel.LexiconmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grammatikalische Kategorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.GrammatikalischeKategorieImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.GrammatikalischeKategorieImpl#getPossiblevalues <em>Possiblevalues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrammatikalischeKategorieImpl extends MinimalEObjectImpl.Container implements GrammatikalischeKategorie {
	/**
	 * The default value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected String bezeichnung = BEZEICHNUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPossiblevalues() <em>Possiblevalues</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossiblevalues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> possiblevalues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammatikalischeKategorieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LexiconmodelPackage.Literals.GRAMMATIKALISCHE_KATEGORIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBezeichnung(String newBezeichnung) {
		String oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__BEZEICHNUNG, oldBezeichnung, bezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPossiblevalues() {
		if (possiblevalues == null) {
			possiblevalues = new EDataTypeUniqueEList<String>(String.class, this, LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__POSSIBLEVALUES);
		}
		return possiblevalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__BEZEICHNUNG:
				return getBezeichnung();
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__POSSIBLEVALUES:
				return getPossiblevalues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__BEZEICHNUNG:
				setBezeichnung((String)newValue);
				return;
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__POSSIBLEVALUES:
				getPossiblevalues().clear();
				getPossiblevalues().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__BEZEICHNUNG:
				setBezeichnung(BEZEICHNUNG_EDEFAULT);
				return;
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__POSSIBLEVALUES:
				getPossiblevalues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__BEZEICHNUNG:
				return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null : !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
			case LexiconmodelPackage.GRAMMATIKALISCHE_KATEGORIE__POSSIBLEVALUES:
				return possiblevalues != null && !possiblevalues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bezeichnung: ");
		result.append(bezeichnung);
		result.append(", possiblevalues: ");
		result.append(possiblevalues);
		result.append(')');
		return result.toString();
	}

} //GrammatikalischeKategorieImpl
