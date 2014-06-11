/**
 */
package grammarmodel.impl;

import grammarmodel.AttributRegel;
import grammarmodel.GrammarmodelPackage;
import grammarmodel.NichtTerminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nicht Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grammarmodel.impl.NichtTerminalImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link grammarmodel.impl.NichtTerminalImpl#getAttributRegeln <em>Attribut Regeln</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NichtTerminalImpl extends MinimalEObjectImpl.Container implements NichtTerminal {
	/**
	 * The default value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected String bezeichnung = BEZEICHNUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributRegeln() <em>Attribut Regeln</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributRegeln()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributRegel> attributRegeln;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NichtTerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarmodelPackage.Literals.NICHT_TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBezeichnung(String newBezeichnung) {
		String oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.NICHT_TERMINAL__BEZEICHNUNG, oldBezeichnung, bezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributRegel> getAttributRegeln() {
		if (attributRegeln == null) {
			attributRegeln = new EObjectResolvingEList<AttributRegel>(AttributRegel.class, this, GrammarmodelPackage.NICHT_TERMINAL__ATTRIBUT_REGELN);
		}
		return attributRegeln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarmodelPackage.NICHT_TERMINAL__BEZEICHNUNG:
				return getBezeichnung();
			case GrammarmodelPackage.NICHT_TERMINAL__ATTRIBUT_REGELN:
				return getAttributRegeln();
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
			case GrammarmodelPackage.NICHT_TERMINAL__BEZEICHNUNG:
				setBezeichnung((String)newValue);
				return;
			case GrammarmodelPackage.NICHT_TERMINAL__ATTRIBUT_REGELN:
				getAttributRegeln().clear();
				getAttributRegeln().addAll((Collection<? extends AttributRegel>)newValue);
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
			case GrammarmodelPackage.NICHT_TERMINAL__BEZEICHNUNG:
				setBezeichnung(BEZEICHNUNG_EDEFAULT);
				return;
			case GrammarmodelPackage.NICHT_TERMINAL__ATTRIBUT_REGELN:
				getAttributRegeln().clear();
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
			case GrammarmodelPackage.NICHT_TERMINAL__BEZEICHNUNG:
				return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null : !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
			case GrammarmodelPackage.NICHT_TERMINAL__ATTRIBUT_REGELN:
				return attributRegeln != null && !attributRegeln.isEmpty();
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
		result.append(" (Bezeichnung: ");
		result.append(bezeichnung);
		result.append(')');
		return result.toString();
	}

} //NichtTerminalImpl
