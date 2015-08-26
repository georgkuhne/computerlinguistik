/**
 */
package model.impl;

import java.util.Collection;
import model.AnnotiertesTerminalNichtTerminal;
import model.MerkmalFunktion;
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
 * An implementation of the model object '<em><b>Annotiertes Terminal Nicht Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.AnnotiertesTerminalNichtTerminalImpl#getAufwaertspfeil <em>Aufwaertspfeil</em>}</li>
 *   <li>{@link model.impl.AnnotiertesTerminalNichtTerminalImpl#getAbwaertspfeil <em>Abwaertspfeil</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotiertesTerminalNichtTerminalImpl extends MinimalEObjectImpl.Container implements AnnotiertesTerminalNichtTerminal {
	/**
	 * The cached value of the '{@link #getAufwaertspfeil() <em>Aufwaertspfeil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufwaertspfeil()
	 * @generated
	 * @ordered
	 */
	protected EList<MerkmalFunktion> aufwaertspfeil;

	/**
	 * The cached value of the '{@link #getAbwaertspfeil() <em>Abwaertspfeil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbwaertspfeil()
	 * @generated
	 * @ordered
	 */
	protected EList<MerkmalFunktion> abwaertspfeil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotiertesTerminalNichtTerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ANNOTIERTES_TERMINAL_NICHT_TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MerkmalFunktion> getAufwaertspfeil() {
		if (aufwaertspfeil == null) {
			aufwaertspfeil = new EObjectContainmentEList<MerkmalFunktion>(MerkmalFunktion.class, this, ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL);
		}
		return aufwaertspfeil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MerkmalFunktion> getAbwaertspfeil() {
		if (abwaertspfeil == null) {
			abwaertspfeil = new EObjectContainmentEList<MerkmalFunktion>(MerkmalFunktion.class, this, ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL);
		}
		return abwaertspfeil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL:
				return ((InternalEList<?>)getAufwaertspfeil()).basicRemove(otherEnd, msgs);
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL:
				return ((InternalEList<?>)getAbwaertspfeil()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL:
				return getAufwaertspfeil();
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL:
				return getAbwaertspfeil();
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
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL:
				getAufwaertspfeil().clear();
				getAufwaertspfeil().addAll((Collection<? extends MerkmalFunktion>)newValue);
				return;
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL:
				getAbwaertspfeil().clear();
				getAbwaertspfeil().addAll((Collection<? extends MerkmalFunktion>)newValue);
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
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL:
				getAufwaertspfeil().clear();
				return;
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL:
				getAbwaertspfeil().clear();
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
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__AUFWAERTSPFEIL:
				return aufwaertspfeil != null && !aufwaertspfeil.isEmpty();
			case ModelPackage.ANNOTIERTES_TERMINAL_NICHT_TERMINAL__ABWAERTSPFEIL:
				return abwaertspfeil != null && !abwaertspfeil.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotiertesTerminalNichtTerminalImpl
