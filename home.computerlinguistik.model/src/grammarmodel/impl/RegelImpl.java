/**
 */
package grammarmodel.impl;

import grammarmodel.GrammarmodelPackage;
import grammarmodel.NichtTerminal;
import grammarmodel.Regel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grammarmodel.impl.RegelImpl#getElternterminal <em>Elternterminal</em>}</li>
 *   <li>{@link grammarmodel.impl.RegelImpl#getKinderTerminale <em>Kinder Terminale</em>}</li>
 *   <li>{@link grammarmodel.impl.RegelImpl#getWortart <em>Wortart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegelImpl extends MinimalEObjectImpl.Container implements Regel {
	/**
	 * The cached value of the '{@link #getElternterminal() <em>Elternterminal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElternterminal()
	 * @generated
	 * @ordered
	 */
	protected NichtTerminal elternterminal;

	/**
	 * The cached value of the '{@link #getKinderTerminale() <em>Kinder Terminale</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinderTerminale()
	 * @generated
	 * @ordered
	 */
	protected EList<NichtTerminal> kinderTerminale;

	/**
	 * The default value of the '{@link #getWortart() <em>Wortart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWortart()
	 * @generated
	 * @ordered
	 */
	protected static final String WORTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWortart() <em>Wortart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWortart()
	 * @generated
	 * @ordered
	 */
	protected String wortart = WORTART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarmodelPackage.Literals.REGEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NichtTerminal getElternterminal() {
		return elternterminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElternterminal(NichtTerminal newElternterminal, NotificationChain msgs) {
		NichtTerminal oldElternterminal = elternterminal;
		elternterminal = newElternterminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.REGEL__ELTERNTERMINAL, oldElternterminal, newElternterminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElternterminal(NichtTerminal newElternterminal) {
		if (newElternterminal != elternterminal) {
			NotificationChain msgs = null;
			if (elternterminal != null)
				msgs = ((InternalEObject)elternterminal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrammarmodelPackage.REGEL__ELTERNTERMINAL, null, msgs);
			if (newElternterminal != null)
				msgs = ((InternalEObject)newElternterminal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrammarmodelPackage.REGEL__ELTERNTERMINAL, null, msgs);
			msgs = basicSetElternterminal(newElternterminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.REGEL__ELTERNTERMINAL, newElternterminal, newElternterminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NichtTerminal> getKinderTerminale() {
		if (kinderTerminale == null) {
			kinderTerminale = new EObjectResolvingEList<NichtTerminal>(NichtTerminal.class, this, GrammarmodelPackage.REGEL__KINDER_TERMINALE);
		}
		return kinderTerminale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWortart() {
		return wortart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWortart(String newWortart) {
		String oldWortart = wortart;
		wortart = newWortart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.REGEL__WORTART, oldWortart, wortart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarmodelPackage.REGEL__ELTERNTERMINAL:
				return basicSetElternterminal(null, msgs);
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
			case GrammarmodelPackage.REGEL__ELTERNTERMINAL:
				return getElternterminal();
			case GrammarmodelPackage.REGEL__KINDER_TERMINALE:
				return getKinderTerminale();
			case GrammarmodelPackage.REGEL__WORTART:
				return getWortart();
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
			case GrammarmodelPackage.REGEL__ELTERNTERMINAL:
				setElternterminal((NichtTerminal)newValue);
				return;
			case GrammarmodelPackage.REGEL__KINDER_TERMINALE:
				getKinderTerminale().clear();
				getKinderTerminale().addAll((Collection<? extends NichtTerminal>)newValue);
				return;
			case GrammarmodelPackage.REGEL__WORTART:
				setWortart((String)newValue);
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
			case GrammarmodelPackage.REGEL__ELTERNTERMINAL:
				setElternterminal((NichtTerminal)null);
				return;
			case GrammarmodelPackage.REGEL__KINDER_TERMINALE:
				getKinderTerminale().clear();
				return;
			case GrammarmodelPackage.REGEL__WORTART:
				setWortart(WORTART_EDEFAULT);
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
			case GrammarmodelPackage.REGEL__ELTERNTERMINAL:
				return elternterminal != null;
			case GrammarmodelPackage.REGEL__KINDER_TERMINALE:
				return kinderTerminale != null && !kinderTerminale.isEmpty();
			case GrammarmodelPackage.REGEL__WORTART:
				return WORTART_EDEFAULT == null ? wortart != null : !WORTART_EDEFAULT.equals(wortart);
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
		result.append(" (Wortart: ");
		result.append(wortart);
		result.append(')');
		return result.toString();
	}

} //RegelImpl
