/**
 */
package model.impl;

import java.util.Collection;
import model.Merkmal;
import model.ModelPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merkmal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.MerkmalImpl#getMoeglicheWerte <em>Moegliche Werte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MerkmalImpl extends MerkmalFunktionImpl implements Merkmal {
	/**
	 * The cached value of the '{@link #getMoeglicheWerte() <em>Moegliche Werte</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoeglicheWerte()
	 * @generated
	 * @ordered
	 */
	protected EList<String> moeglicheWerte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MerkmalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MERKMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMoeglicheWerte() {
		if (moeglicheWerte == null) {
			moeglicheWerte = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.MERKMAL__MOEGLICHE_WERTE);
		}
		return moeglicheWerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MERKMAL__MOEGLICHE_WERTE:
				return getMoeglicheWerte();
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
			case ModelPackage.MERKMAL__MOEGLICHE_WERTE:
				getMoeglicheWerte().clear();
				getMoeglicheWerte().addAll((Collection<? extends String>)newValue);
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
			case ModelPackage.MERKMAL__MOEGLICHE_WERTE:
				getMoeglicheWerte().clear();
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
			case ModelPackage.MERKMAL__MOEGLICHE_WERTE:
				return moeglicheWerte != null && !moeglicheWerte.isEmpty();
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
		result.append(" (moeglicheWerte: ");
		result.append(moeglicheWerte);
		result.append(')');
		return result.toString();
	}

} //MerkmalImpl
