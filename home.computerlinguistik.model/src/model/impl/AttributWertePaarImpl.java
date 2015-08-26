/**
 */
package model.impl;

import model.AttributWertePaar;
import model.FStruktur;
import model.Funktion;
import model.Merkmal;
import model.ModelPackage;
import model.WertTyp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Attribut Werte Paar</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link model.impl.AttributWertePaarImpl#getWertTyp <em>Wert Typ</em>}</li>
 * <li>{@link model.impl.AttributWertePaarImpl#getFunktion <em>Funktion</em>}</li>
 * <li>{@link model.impl.AttributWertePaarImpl#getFunktionsWert <em>Funktions
 * Wert</em>}</li>
 * <li>{@link model.impl.AttributWertePaarImpl#getMerkmal <em>Merkmal</em>}</li>
 * <li>{@link model.impl.AttributWertePaarImpl#getMerkmalsWert <em>Merkmals Wert
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AttributWertePaarImpl extends MinimalEObjectImpl.Container
		implements AttributWertePaar {
	/**
	 * The cached value of the '{@link #getWertTyp() <em>Wert Typ</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWertTyp()
	 * @generated
	 * @ordered
	 */
	protected WertTyp wertTyp;

	/**
	 * The cached value of the '{@link #getFunktion() <em>Funktion</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFunktion()
	 * @generated
	 * @ordered
	 */
	protected Funktion funktion;

	/**
	 * The cached value of the '{@link #getFunktionsWert()
	 * <em>Funktions Wert</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFunktionsWert()
	 * @generated
	 * @ordered
	 */
	protected FStruktur funktionsWert;

	/**
	 * The cached value of the '{@link #getMerkmal() <em>Merkmal</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMerkmal()
	 * @generated
	 * @ordered
	 */
	protected Merkmal merkmal;

	/**
	 * The default value of the '{@link #getMerkmalsWert()
	 * <em>Merkmals Wert</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMerkmalsWert()
	 * @generated
	 * @ordered
	 */
	protected static final String MERKMALS_WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMerkmalsWert()
	 * <em>Merkmals Wert</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMerkmalsWert()
	 * @generated
	 * @ordered
	 */
	protected String merkmalsWert = MERKMALS_WERT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AttributWertePaarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ATTRIBUT_WERTE_PAAR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WertTyp getWertTyp() {
		return wertTyp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWertTyp(WertTyp newWertTyp) {
		WertTyp oldWertTyp = wertTyp;
		wertTyp = newWertTyp == null ? null : newWertTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ATTRIBUT_WERTE_PAAR__WERT_TYP, oldWertTyp,
					wertTyp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Funktion getFunktion() {
		if (funktion != null && funktion.eIsProxy()) {
			InternalEObject oldFunktion = (InternalEObject) funktion;
			funktion = (Funktion) eResolveProxy(oldFunktion);
			if (funktion != oldFunktion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTION,
							oldFunktion, funktion));
			}
		}
		return funktion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Funktion basicGetFunktion() {
		return funktion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunktion(Funktion newFunktion) {
		Funktion oldFunktion = funktion;
		funktion = newFunktion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTION, oldFunktion,
					funktion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FStruktur getFunktionsWert() {
		if (funktionsWert != null && funktionsWert.eIsProxy()) {
			InternalEObject oldFunktionsWert = (InternalEObject) funktionsWert;
			funktionsWert = (FStruktur) eResolveProxy(oldFunktionsWert);
			if (funktionsWert != oldFunktionsWert) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT,
							oldFunktionsWert, funktionsWert));
			}
		}
		return funktionsWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FStruktur basicGetFunktionsWert() {
		return funktionsWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunktionsWert(FStruktur newFunktionsWert) {
		FStruktur oldFunktionsWert = funktionsWert;
		funktionsWert = newFunktionsWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT,
					oldFunktionsWert, funktionsWert));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Merkmal getMerkmal() {
		if (merkmal != null && merkmal.eIsProxy()) {
			InternalEObject oldMerkmal = (InternalEObject) merkmal;
			merkmal = (Merkmal) eResolveProxy(oldMerkmal);
			if (merkmal != oldMerkmal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMAL,
							oldMerkmal, merkmal));
			}
		}
		return merkmal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Merkmal basicGetMerkmal() {
		return merkmal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMerkmal(Merkmal newMerkmal) {
		Merkmal oldMerkmal = merkmal;
		merkmal = newMerkmal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMAL, oldMerkmal,
					merkmal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMerkmalsWert() {
		return merkmalsWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMerkmalsWert(String newMerkmalsWert) {
		String oldMerkmalsWert = merkmalsWert;
		merkmalsWert = newMerkmalsWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMALS_WERT,
					oldMerkmalsWert, merkmalsWert));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ATTRIBUT_WERTE_PAAR__WERT_TYP:
			return getWertTyp();
		case ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTION:
			if (resolve)
				return getFunktion();
			return basicGetFunktion();
		case ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT:
			if (resolve)
				return getFunktionsWert();
			return basicGetFunktionsWert();
		case ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMAL:
			if (resolve)
				return getMerkmal();
			return basicGetMerkmal();
		case ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMALS_WERT:
			return getMerkmalsWert();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.ATTRIBUT_WERTE_PAAR__WERT_TYP:
			setWertTyp((WertTyp) newValue);
			return;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTION:
			setFunktion((Funktion) newValue);
			return;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT:
			setFunktionsWert((FStruktur) newValue);
			return;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMAL:
			setMerkmal((Merkmal) newValue);
			return;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMALS_WERT:
			setMerkmalsWert((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.ATTRIBUT_WERTE_PAAR__WERT_TYP:
			setWertTyp((WertTyp) null);
			return;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTION:
			setFunktion((Funktion) null);
			return;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT:
			setFunktionsWert((FStruktur) null);
			return;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMAL:
			setMerkmal((Merkmal) null);
			return;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMALS_WERT:
			setMerkmalsWert(MERKMALS_WERT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.ATTRIBUT_WERTE_PAAR__WERT_TYP:
			return wertTyp != null;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTION:
			return funktion != null;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__FUNKTIONS_WERT:
			return funktionsWert != null;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMAL:
			return merkmal != null;
		case ModelPackage.ATTRIBUT_WERTE_PAAR__MERKMALS_WERT:
			return MERKMALS_WERT_EDEFAULT == null ? merkmalsWert != null
					: !MERKMALS_WERT_EDEFAULT.equals(merkmalsWert);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (wertTyp: ");
		result.append(wertTyp);
		result.append(", merkmalsWert: ");
		result.append(merkmalsWert);
		result.append(')');
		return result.toString();
	}

} // AttributWertePaarImpl
