/**
 */
package home.computerlinguistik.lexiconmodel.impl;

import home.computerlinguistik.lexiconmodel.Auspraegung;
import home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie;
import home.computerlinguistik.lexiconmodel.LexiconmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auspraegung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.AuspraegungImpl#getGrammatikalischeKategorie <em>Grammatikalische Kategorie</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.AuspraegungImpl#getWert <em>Wert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuspraegungImpl extends MinimalEObjectImpl.Container implements Auspraegung {
	/**
	 * The cached value of the '{@link #getGrammatikalischeKategorie() <em>Grammatikalische Kategorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammatikalischeKategorie()
	 * @generated
	 * @ordered
	 */
	protected GrammatikalischeKategorie grammatikalischeKategorie;

	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final String WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected String wert = WERT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuspraegungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LexiconmodelPackage.Literals.AUSPRAEGUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammatikalischeKategorie getGrammatikalischeKategorie() {
		if (grammatikalischeKategorie != null && grammatikalischeKategorie.eIsProxy()) {
			InternalEObject oldGrammatikalischeKategorie = (InternalEObject)grammatikalischeKategorie;
			grammatikalischeKategorie = (GrammatikalischeKategorie)eResolveProxy(oldGrammatikalischeKategorie);
			if (grammatikalischeKategorie != oldGrammatikalischeKategorie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LexiconmodelPackage.AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE, oldGrammatikalischeKategorie, grammatikalischeKategorie));
			}
		}
		return grammatikalischeKategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammatikalischeKategorie basicGetGrammatikalischeKategorie() {
		return grammatikalischeKategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammatikalischeKategorie(GrammatikalischeKategorie newGrammatikalischeKategorie) {
		GrammatikalischeKategorie oldGrammatikalischeKategorie = grammatikalischeKategorie;
		grammatikalischeKategorie = newGrammatikalischeKategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LexiconmodelPackage.AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE, oldGrammatikalischeKategorie, grammatikalischeKategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWert(String newWert) {
		String oldWert = wert;
		wert = newWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LexiconmodelPackage.AUSPRAEGUNG__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LexiconmodelPackage.AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE:
				if (resolve) return getGrammatikalischeKategorie();
				return basicGetGrammatikalischeKategorie();
			case LexiconmodelPackage.AUSPRAEGUNG__WERT:
				return getWert();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LexiconmodelPackage.AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE:
				setGrammatikalischeKategorie((GrammatikalischeKategorie)newValue);
				return;
			case LexiconmodelPackage.AUSPRAEGUNG__WERT:
				setWert((String)newValue);
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
			case LexiconmodelPackage.AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE:
				setGrammatikalischeKategorie((GrammatikalischeKategorie)null);
				return;
			case LexiconmodelPackage.AUSPRAEGUNG__WERT:
				setWert(WERT_EDEFAULT);
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
			case LexiconmodelPackage.AUSPRAEGUNG__GRAMMATIKALISCHE_KATEGORIE:
				return grammatikalischeKategorie != null;
			case LexiconmodelPackage.AUSPRAEGUNG__WERT:
				return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
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
		result.append(" (wert: ");
		result.append(wert);
		result.append(')');
		return result.toString();
	}

} //AuspraegungImpl
