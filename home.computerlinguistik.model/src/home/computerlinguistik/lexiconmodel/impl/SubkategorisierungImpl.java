/**
 */
package home.computerlinguistik.lexiconmodel.impl;

import home.computerlinguistik.lexiconmodel.AuspraegungenContainer;
import home.computerlinguistik.lexiconmodel.LexiconmodelPackage;
import home.computerlinguistik.lexiconmodel.Subkategorisierung;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Subkategorisierung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.SubkategorisierungImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.SubkategorisierungImpl#getAuspraegungenContainer <em>Auspraegungen Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubkategorisierungImpl extends MinimalEObjectImpl.Container implements Subkategorisierung {
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
	 * The cached value of the '{@link #getAuspraegungenContainer() <em>Auspraegungen Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuspraegungenContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<AuspraegungenContainer> auspraegungenContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubkategorisierungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LexiconmodelPackage.Literals.SUBKATEGORISIERUNG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LexiconmodelPackage.SUBKATEGORISIERUNG__BEZEICHNUNG, oldBezeichnung, bezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuspraegungenContainer> getAuspraegungenContainer() {
		if (auspraegungenContainer == null) {
			auspraegungenContainer = new EObjectContainmentEList<AuspraegungenContainer>(AuspraegungenContainer.class, this, LexiconmodelPackage.SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER);
		}
		return auspraegungenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LexiconmodelPackage.SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER:
				return ((InternalEList<?>)getAuspraegungenContainer()).basicRemove(otherEnd, msgs);
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
			case LexiconmodelPackage.SUBKATEGORISIERUNG__BEZEICHNUNG:
				return getBezeichnung();
			case LexiconmodelPackage.SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER:
				return getAuspraegungenContainer();
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
			case LexiconmodelPackage.SUBKATEGORISIERUNG__BEZEICHNUNG:
				setBezeichnung((String)newValue);
				return;
			case LexiconmodelPackage.SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER:
				getAuspraegungenContainer().clear();
				getAuspraegungenContainer().addAll((Collection<? extends AuspraegungenContainer>)newValue);
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
			case LexiconmodelPackage.SUBKATEGORISIERUNG__BEZEICHNUNG:
				setBezeichnung(BEZEICHNUNG_EDEFAULT);
				return;
			case LexiconmodelPackage.SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER:
				getAuspraegungenContainer().clear();
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
			case LexiconmodelPackage.SUBKATEGORISIERUNG__BEZEICHNUNG:
				return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null : !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
			case LexiconmodelPackage.SUBKATEGORISIERUNG__AUSPRAEGUNGEN_CONTAINER:
				return auspraegungenContainer != null && !auspraegungenContainer.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SubkategorisierungImpl
