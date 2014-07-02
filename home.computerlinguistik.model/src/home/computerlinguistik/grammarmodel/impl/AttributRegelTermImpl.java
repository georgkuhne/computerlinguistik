/**
 */
package home.computerlinguistik.grammarmodel.impl;

import home.computerlinguistik.grammarmodel.AttributRegelTerm;
import home.computerlinguistik.grammarmodel.AttributRegelTermTyp;
import home.computerlinguistik.grammarmodel.GrammarmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut Regel Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link home.computerlinguistik.grammarmodel.impl.AttributRegelTermImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link home.computerlinguistik.grammarmodel.impl.AttributRegelTermImpl#getWert <em>Wert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributRegelTermImpl extends MinimalEObjectImpl.Container implements AttributRegelTerm {
	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final AttributRegelTermTyp TYP_EDEFAULT = AttributRegelTermTyp.OBEN;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected AttributRegelTermTyp typ = TYP_EDEFAULT;

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
	protected AttributRegelTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarmodelPackage.Literals.ATTRIBUT_REGEL_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributRegelTermTyp getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyp(AttributRegelTermTyp newTyp) {
		AttributRegelTermTyp oldTyp = typ;
		typ = newTyp == null ? TYP_EDEFAULT : newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.ATTRIBUT_REGEL_TERM__TYP, oldTyp, typ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.ATTRIBUT_REGEL_TERM__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM__TYP:
				return getTyp();
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM__WERT:
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
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM__TYP:
				setTyp((AttributRegelTermTyp)newValue);
				return;
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM__WERT:
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
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM__WERT:
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
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM__TYP:
				return typ != TYP_EDEFAULT;
			case GrammarmodelPackage.ATTRIBUT_REGEL_TERM__WERT:
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
		result.append(" (Typ: ");
		result.append(typ);
		result.append(", Wert: ");
		result.append(wert);
		result.append(')');
		return result.toString();
	}

} //AttributRegelTermImpl
