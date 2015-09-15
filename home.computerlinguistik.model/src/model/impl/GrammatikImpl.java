/**
 */
package model.impl;

import java.util.Collection;

import model.AbleitungsRegel;
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
 *   <li>{@link model.impl.GrammatikImpl#getRegeln <em>Regeln</em>}</li>
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
	 * The cached value of the '{@link #getS0() <em>S0</em>}' reference.
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
	 * The cached value of the '{@link #getRegeln() <em>Regeln</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegeln()
	 * @generated
	 * @ordered
	 */
	protected EList<AbleitungsRegel> regeln;

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
		if (s0 != null && s0.eIsProxy()) {
			InternalEObject oldS0 = (InternalEObject)s0;
			s0 = (Nichterminal)eResolveProxy(oldS0);
			if (s0 != oldS0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.GRAMMATIK__S0, oldS0, s0));
			}
		}
		return s0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nichterminal basicGetS0() {
		return s0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS0(Nichterminal newS0) {
		Nichterminal oldS0 = s0;
		s0 = newS0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GRAMMATIK__S0, oldS0, s0));
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
	public EList<AbleitungsRegel> getRegeln() {
		if (regeln == null) {
			regeln = new EObjectContainmentEList<AbleitungsRegel>(AbleitungsRegel.class, this, ModelPackage.GRAMMATIK__REGELN);
		}
		return regeln;
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
			case ModelPackage.GRAMMATIK__NICHT_TERMINALE:
				return ((InternalEList<?>)getNichtTerminale()).basicRemove(otherEnd, msgs);
			case ModelPackage.GRAMMATIK__REGELN:
				return ((InternalEList<?>)getRegeln()).basicRemove(otherEnd, msgs);
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
				if (resolve) return getS0();
				return basicGetS0();
			case ModelPackage.GRAMMATIK__NICHT_TERMINALE:
				return getNichtTerminale();
			case ModelPackage.GRAMMATIK__REGELN:
				return getRegeln();
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
			case ModelPackage.GRAMMATIK__REGELN:
				getRegeln().clear();
				getRegeln().addAll((Collection<? extends AbleitungsRegel>)newValue);
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
			case ModelPackage.GRAMMATIK__REGELN:
				getRegeln().clear();
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
			case ModelPackage.GRAMMATIK__REGELN:
				return regeln != null && !regeln.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GrammatikImpl
