/**
 */
package model.impl;

import java.util.Collection;

import model.FStruktur;
import model.LexikonEintrag;
import model.ModelPackage;
import model.Terminal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lexikon Eintrag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.LexikonEintragImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.LexikonEintragImpl#getWortart <em>Wortart</em>}</li>
 *   <li>{@link model.impl.LexikonEintragImpl#getAuspraegungen <em>Auspraegungen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LexikonEintragImpl extends MinimalEObjectImpl.Container implements LexikonEintrag {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWortart() <em>Wortart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWortart()
	 * @generated
	 * @ordered
	 */
	protected Terminal wortart;

	/**
	 * The cached value of the '{@link #getAuspraegungen() <em>Auspraegungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuspraegungen()
	 * @generated
	 * @ordered
	 */
	protected EList<FStruktur> auspraegungen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexikonEintragImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LEXIKON_EINTRAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEXIKON_EINTRAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getWortart() {
		if (wortart != null && wortart.eIsProxy()) {
			InternalEObject oldWortart = (InternalEObject)wortart;
			wortart = (Terminal)eResolveProxy(oldWortart);
			if (wortart != oldWortart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.LEXIKON_EINTRAG__WORTART, oldWortart, wortart));
			}
		}
		return wortart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetWortart() {
		return wortart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWortart(Terminal newWortart) {
		Terminal oldWortart = wortart;
		wortart = newWortart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEXIKON_EINTRAG__WORTART, oldWortart, wortart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FStruktur> getAuspraegungen() {
		if (auspraegungen == null) {
			auspraegungen = new EObjectContainmentEList<FStruktur>(FStruktur.class, this, ModelPackage.LEXIKON_EINTRAG__AUSPRAEGUNGEN);
		}
		return auspraegungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LEXIKON_EINTRAG__AUSPRAEGUNGEN:
				return ((InternalEList<?>)getAuspraegungen()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.LEXIKON_EINTRAG__NAME:
				return getName();
			case ModelPackage.LEXIKON_EINTRAG__WORTART:
				if (resolve) return getWortart();
				return basicGetWortart();
			case ModelPackage.LEXIKON_EINTRAG__AUSPRAEGUNGEN:
				return getAuspraegungen();
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
			case ModelPackage.LEXIKON_EINTRAG__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.LEXIKON_EINTRAG__WORTART:
				setWortart((Terminal)newValue);
				return;
			case ModelPackage.LEXIKON_EINTRAG__AUSPRAEGUNGEN:
				getAuspraegungen().clear();
				getAuspraegungen().addAll((Collection<? extends FStruktur>)newValue);
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
			case ModelPackage.LEXIKON_EINTRAG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.LEXIKON_EINTRAG__WORTART:
				setWortart((Terminal)null);
				return;
			case ModelPackage.LEXIKON_EINTRAG__AUSPRAEGUNGEN:
				getAuspraegungen().clear();
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
			case ModelPackage.LEXIKON_EINTRAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.LEXIKON_EINTRAG__WORTART:
				return wortart != null;
			case ModelPackage.LEXIKON_EINTRAG__AUSPRAEGUNGEN:
				return auspraegungen != null && !auspraegungen.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LexikonEintragImpl
