/**
 */
package model.impl;

import java.util.Collection;

import model.Lexikon;
import model.LexikonEintrag;
import model.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lexikon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.LexikonImpl#getEintraege <em>Eintraege</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LexikonImpl extends MinimalEObjectImpl.Container implements Lexikon {
	/**
	 * The cached value of the '{@link #getEintraege() <em>Eintraege</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEintraege()
	 * @generated
	 * @ordered
	 */
	protected EList<LexikonEintrag> eintraege;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexikonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LEXIKON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LexikonEintrag> getEintraege() {
		if (eintraege == null) {
			eintraege = new EObjectContainmentEList<LexikonEintrag>(LexikonEintrag.class, this, ModelPackage.LEXIKON__EINTRAEGE);
		}
		return eintraege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LEXIKON__EINTRAEGE:
				return ((InternalEList<?>)getEintraege()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.LEXIKON__EINTRAEGE:
				return getEintraege();
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
			case ModelPackage.LEXIKON__EINTRAEGE:
				getEintraege().clear();
				getEintraege().addAll((Collection<? extends LexikonEintrag>)newValue);
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
			case ModelPackage.LEXIKON__EINTRAEGE:
				getEintraege().clear();
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
			case ModelPackage.LEXIKON__EINTRAEGE:
				return eintraege != null && !eintraege.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LexikonImpl
