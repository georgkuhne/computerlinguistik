/**
 */
package model.impl;

import java.util.Collection;

import model.AbleitungsRegel;
import model.AnnotiertesTerminalNichtTerminal;
import model.ModelPackage;
import model.Nichterminal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ableitungs Regel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.AbleitungsRegelImpl#getVon <em>Von</em>}</li>
 *   <li>{@link model.impl.AbleitungsRegelImpl#getAuf <em>Auf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbleitungsRegelImpl extends MinimalEObjectImpl.Container implements AbleitungsRegel {
	/**
	 * The cached value of the '{@link #getVon() <em>Von</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVon()
	 * @generated
	 * @ordered
	 */
	protected Nichterminal von;

	/**
	 * The cached value of the '{@link #getAuf() <em>Auf</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuf()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotiertesTerminalNichtTerminal> auf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbleitungsRegelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ABLEITUNGS_REGEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nichterminal getVon() {
		if (von != null && von.eIsProxy()) {
			InternalEObject oldVon = (InternalEObject)von;
			von = (Nichterminal)eResolveProxy(oldVon);
			if (von != oldVon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ABLEITUNGS_REGEL__VON, oldVon, von));
			}
		}
		return von;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nichterminal basicGetVon() {
		return von;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVon(Nichterminal newVon) {
		Nichterminal oldVon = von;
		von = newVon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABLEITUNGS_REGEL__VON, oldVon, von));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotiertesTerminalNichtTerminal> getAuf() {
		if (auf == null) {
			auf = new EObjectResolvingEList<AnnotiertesTerminalNichtTerminal>(AnnotiertesTerminalNichtTerminal.class, this, ModelPackage.ABLEITUNGS_REGEL__AUF);
		}
		return auf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ABLEITUNGS_REGEL__VON:
				if (resolve) return getVon();
				return basicGetVon();
			case ModelPackage.ABLEITUNGS_REGEL__AUF:
				return getAuf();
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
			case ModelPackage.ABLEITUNGS_REGEL__VON:
				setVon((Nichterminal)newValue);
				return;
			case ModelPackage.ABLEITUNGS_REGEL__AUF:
				getAuf().clear();
				getAuf().addAll((Collection<? extends AnnotiertesTerminalNichtTerminal>)newValue);
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
			case ModelPackage.ABLEITUNGS_REGEL__VON:
				setVon((Nichterminal)null);
				return;
			case ModelPackage.ABLEITUNGS_REGEL__AUF:
				getAuf().clear();
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
			case ModelPackage.ABLEITUNGS_REGEL__VON:
				return von != null;
			case ModelPackage.ABLEITUNGS_REGEL__AUF:
				return auf != null && !auf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbleitungsRegelImpl
