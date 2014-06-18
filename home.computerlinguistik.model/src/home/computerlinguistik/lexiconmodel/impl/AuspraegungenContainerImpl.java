/**
 */
package home.computerlinguistik.lexiconmodel.impl;

import home.computerlinguistik.lexiconmodel.Auspraegung;
import home.computerlinguistik.lexiconmodel.AuspraegungenContainer;
import home.computerlinguistik.lexiconmodel.LexiconmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auspraegungen Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.AuspraegungenContainerImpl#getAuspraegungen <em>Auspraegungen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuspraegungenContainerImpl extends MinimalEObjectImpl.Container implements AuspraegungenContainer {
	/**
	 * The cached value of the '{@link #getAuspraegungen() <em>Auspraegungen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuspraegungen()
	 * @generated
	 * @ordered
	 */
	protected EList<Auspraegung> auspraegungen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuspraegungenContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LexiconmodelPackage.Literals.AUSPRAEGUNGEN_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Auspraegung> getAuspraegungen() {
		if (auspraegungen == null) {
			auspraegungen = new EObjectResolvingEList<Auspraegung>(Auspraegung.class, this, LexiconmodelPackage.AUSPRAEGUNGEN_CONTAINER__AUSPRAEGUNGEN);
		}
		return auspraegungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LexiconmodelPackage.AUSPRAEGUNGEN_CONTAINER__AUSPRAEGUNGEN:
				return getAuspraegungen();
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
			case LexiconmodelPackage.AUSPRAEGUNGEN_CONTAINER__AUSPRAEGUNGEN:
				getAuspraegungen().clear();
				getAuspraegungen().addAll((Collection<? extends Auspraegung>)newValue);
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
			case LexiconmodelPackage.AUSPRAEGUNGEN_CONTAINER__AUSPRAEGUNGEN:
				getAuspraegungen().clear();
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
			case LexiconmodelPackage.AUSPRAEGUNGEN_CONTAINER__AUSPRAEGUNGEN:
				return auspraegungen != null && !auspraegungen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuspraegungenContainerImpl
