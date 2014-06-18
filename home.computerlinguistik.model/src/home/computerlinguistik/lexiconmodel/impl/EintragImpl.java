/**
 */
package home.computerlinguistik.lexiconmodel.impl;

import home.computerlinguistik.lexiconmodel.AuspraegungenContainer;
import home.computerlinguistik.lexiconmodel.Eintrag;
import home.computerlinguistik.lexiconmodel.LexiconmodelPackage;
import home.computerlinguistik.lexiconmodel.Wortart;
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
 * An implementation of the model object '<em><b>Eintrag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.EintragImpl#getWort <em>Wort</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.EintragImpl#getAuspraegungenContainer <em>Auspraegungen Container</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.EintragImpl#getWortart <em>Wortart</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.EintragImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EintragImpl extends MinimalEObjectImpl.Container implements Eintrag {
	/**
	 * The default value of the '{@link #getWort() <em>Wort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWort()
	 * @generated
	 * @ordered
	 */
	protected static final String WORT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWort() <em>Wort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWort()
	 * @generated
	 * @ordered
	 */
	protected String wort = WORT_EDEFAULT;
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
	 * The default value of the '{@link #getWortart() <em>Wortart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWortart()
	 * @generated
	 * @ordered
	 */
	protected static final Wortart WORTART_EDEFAULT = Wortart.NOMEN;
	/**
	 * The cached value of the '{@link #getWortart() <em>Wortart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWortart()
	 * @generated
	 * @ordered
	 */
	protected Wortart wortart = WORTART_EDEFAULT;
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EintragImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LexiconmodelPackage.Literals.EINTRAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWort() {
		return wort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWort(String newWort) {
		String oldWort = wort;
		wort = newWort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LexiconmodelPackage.EINTRAG__WORT, oldWort, wort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuspraegungenContainer> getAuspraegungenContainer() {
		if (auspraegungenContainer == null) {
			auspraegungenContainer = new EObjectContainmentEList<AuspraegungenContainer>(AuspraegungenContainer.class, this, LexiconmodelPackage.EINTRAG__AUSPRAEGUNGEN_CONTAINER);
		}
		return auspraegungenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wortart getWortart() {
		return wortart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWortart(Wortart newWortart) {
		Wortart oldWortart = wortart;
		wortart = newWortart == null ? WORTART_EDEFAULT : newWortart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LexiconmodelPackage.EINTRAG__WORTART, oldWortart, wortart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(long newID) {
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LexiconmodelPackage.EINTRAG__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LexiconmodelPackage.EINTRAG__AUSPRAEGUNGEN_CONTAINER:
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
			case LexiconmodelPackage.EINTRAG__WORT:
				return getWort();
			case LexiconmodelPackage.EINTRAG__AUSPRAEGUNGEN_CONTAINER:
				return getAuspraegungenContainer();
			case LexiconmodelPackage.EINTRAG__WORTART:
				return getWortart();
			case LexiconmodelPackage.EINTRAG__ID:
				return getID();
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
			case LexiconmodelPackage.EINTRAG__WORT:
				setWort((String)newValue);
				return;
			case LexiconmodelPackage.EINTRAG__AUSPRAEGUNGEN_CONTAINER:
				getAuspraegungenContainer().clear();
				getAuspraegungenContainer().addAll((Collection<? extends AuspraegungenContainer>)newValue);
				return;
			case LexiconmodelPackage.EINTRAG__WORTART:
				setWortart((Wortart)newValue);
				return;
			case LexiconmodelPackage.EINTRAG__ID:
				setID((Long)newValue);
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
			case LexiconmodelPackage.EINTRAG__WORT:
				setWort(WORT_EDEFAULT);
				return;
			case LexiconmodelPackage.EINTRAG__AUSPRAEGUNGEN_CONTAINER:
				getAuspraegungenContainer().clear();
				return;
			case LexiconmodelPackage.EINTRAG__WORTART:
				setWortart(WORTART_EDEFAULT);
				return;
			case LexiconmodelPackage.EINTRAG__ID:
				setID(ID_EDEFAULT);
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
			case LexiconmodelPackage.EINTRAG__WORT:
				return WORT_EDEFAULT == null ? wort != null : !WORT_EDEFAULT.equals(wort);
			case LexiconmodelPackage.EINTRAG__AUSPRAEGUNGEN_CONTAINER:
				return auspraegungenContainer != null && !auspraegungenContainer.isEmpty();
			case LexiconmodelPackage.EINTRAG__WORTART:
				return wortart != WORTART_EDEFAULT;
			case LexiconmodelPackage.EINTRAG__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (wort: ");
		result.append(wort);
		result.append(", wortart: ");
		result.append(wortart);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EintragImpl
