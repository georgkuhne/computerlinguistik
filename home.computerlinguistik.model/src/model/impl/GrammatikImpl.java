/**
 */
package model.impl;

import java.util.Collection;

import model.Grammatik;
import model.ModelPackage;
import model.Nichterminal;
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
 * An implementation of the model object '<em><b>Grammatik</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.GrammatikImpl#getTerminale <em>Terminale</em>}</li>
 *   <li>{@link model.impl.GrammatikImpl#getS0 <em>S0</em>}</li>
 *   <li>{@link model.impl.GrammatikImpl#getNichtTerminale <em>Nicht Terminale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrammatikImpl extends MinimalEObjectImpl.Container implements Grammatik {
	/**
	 * The cached value of the '{@link #getTerminale() <em>Terminale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminale()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminale;

	/**
	 * The cached value of the '{@link #getS0() <em>S0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS0()
	 * @generated
	 * @ordered
	 */
	protected Nichterminal s0;

	/**
	 * The cached value of the '{@link #getNichtTerminale() <em>Nicht Terminale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNichtTerminale()
	 * @generated
	 * @ordered
	 */
	protected EList<Nichterminal> nichtTerminale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammatikImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GRAMMATIK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminale() {
		if (terminale == null) {
			terminale = new EObjectContainmentEList<Terminal>(Terminal.class, this, ModelPackage.GRAMMATIK__TERMINALE);
		}
		return terminale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nichterminal getS0() {
		return s0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS0(Nichterminal newS0, NotificationChain msgs) {
		Nichterminal oldS0 = s0;
		s0 = newS0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.GRAMMATIK__S0, oldS0, newS0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS0(Nichterminal newS0) {
		if (newS0 != s0) {
			NotificationChain msgs = null;
			if (s0 != null)
				msgs = ((InternalEObject)s0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GRAMMATIK__S0, null, msgs);
			if (newS0 != null)
				msgs = ((InternalEObject)newS0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GRAMMATIK__S0, null, msgs);
			msgs = basicSetS0(newS0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GRAMMATIK__S0, newS0, newS0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nichterminal> getNichtTerminale() {
		if (nichtTerminale == null) {
			nichtTerminale = new EObjectContainmentEList<Nichterminal>(Nichterminal.class, this, ModelPackage.GRAMMATIK__NICHT_TERMINALE);
		}
		return nichtTerminale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GRAMMATIK__TERMINALE:
				return ((InternalEList<?>)getTerminale()).basicRemove(otherEnd, msgs);
			case ModelPackage.GRAMMATIK__S0:
				return basicSetS0(null, msgs);
			case ModelPackage.GRAMMATIK__NICHT_TERMINALE:
				return ((InternalEList<?>)getNichtTerminale()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.GRAMMATIK__TERMINALE:
				return getTerminale();
			case ModelPackage.GRAMMATIK__S0:
				return getS0();
			case ModelPackage.GRAMMATIK__NICHT_TERMINALE:
				return getNichtTerminale();
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
			case ModelPackage.GRAMMATIK__TERMINALE:
				getTerminale().clear();
				getTerminale().addAll((Collection<? extends Terminal>)newValue);
				return;
			case ModelPackage.GRAMMATIK__S0:
				setS0((Nichterminal)newValue);
				return;
			case ModelPackage.GRAMMATIK__NICHT_TERMINALE:
				getNichtTerminale().clear();
				getNichtTerminale().addAll((Collection<? extends Nichterminal>)newValue);
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
			case ModelPackage.GRAMMATIK__TERMINALE:
				getTerminale().clear();
				return;
			case ModelPackage.GRAMMATIK__S0:
				setS0((Nichterminal)null);
				return;
			case ModelPackage.GRAMMATIK__NICHT_TERMINALE:
				getNichtTerminale().clear();
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
			case ModelPackage.GRAMMATIK__TERMINALE:
				return terminale != null && !terminale.isEmpty();
			case ModelPackage.GRAMMATIK__S0:
				return s0 != null;
			case ModelPackage.GRAMMATIK__NICHT_TERMINALE:
				return nichtTerminale != null && !nichtTerminale.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GrammatikImpl
