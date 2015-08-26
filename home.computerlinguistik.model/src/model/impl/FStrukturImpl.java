/**
 */
package model.impl;

import java.util.Collection;

import model.AttributWertePaar;
import model.FStruktur;
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
 * An implementation of the model object '<em><b>FStruktur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FStrukturImpl#getAttributWertePaare <em>Attribut Werte Paare</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FStrukturImpl extends MinimalEObjectImpl.Container implements FStruktur {
	/**
	 * The cached value of the '{@link #getAttributWertePaare() <em>Attribut Werte Paare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributWertePaare()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributWertePaar> attributWertePaare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FStrukturImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FSTRUKTUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributWertePaar> getAttributWertePaare() {
		if (attributWertePaare == null) {
			attributWertePaare = new EObjectContainmentEList<AttributWertePaar>(AttributWertePaar.class, this, ModelPackage.FSTRUKTUR__ATTRIBUT_WERTE_PAARE);
		}
		return attributWertePaare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FSTRUKTUR__ATTRIBUT_WERTE_PAARE:
				return ((InternalEList<?>)getAttributWertePaare()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.FSTRUKTUR__ATTRIBUT_WERTE_PAARE:
				return getAttributWertePaare();
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
			case ModelPackage.FSTRUKTUR__ATTRIBUT_WERTE_PAARE:
				getAttributWertePaare().clear();
				getAttributWertePaare().addAll((Collection<? extends AttributWertePaar>)newValue);
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
			case ModelPackage.FSTRUKTUR__ATTRIBUT_WERTE_PAARE:
				getAttributWertePaare().clear();
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
			case ModelPackage.FSTRUKTUR__ATTRIBUT_WERTE_PAARE:
				return attributWertePaare != null && !attributWertePaare.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FStrukturImpl
