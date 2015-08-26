/**
 */
package model.impl;

import java.util.Collection;

import model.Funktion;
import model.Grammatik;
import model.LexikalischFunktionaleGrammatik;
import model.Lexikon;
import model.Merkmal;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lexikalisch Funktionale Grammatik</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.LexikalischFunktionaleGrammatikImpl#getFunktionen <em>Funktionen</em>}</li>
 *   <li>{@link model.impl.LexikalischFunktionaleGrammatikImpl#getMerkmale <em>Merkmale</em>}</li>
 *   <li>{@link model.impl.LexikalischFunktionaleGrammatikImpl#getGrammatik <em>Grammatik</em>}</li>
 *   <li>{@link model.impl.LexikalischFunktionaleGrammatikImpl#getLexikon <em>Lexikon</em>}</li>
 *   <li>{@link model.impl.LexikalischFunktionaleGrammatikImpl#getID <em>ID</em>}</li>
 *   <li>{@link model.impl.LexikalischFunktionaleGrammatikImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LexikalischFunktionaleGrammatikImpl extends MinimalEObjectImpl.Container implements LexikalischFunktionaleGrammatik {
	/**
	 * The cached value of the '{@link #getFunktionen() <em>Funktionen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunktionen()
	 * @generated
	 * @ordered
	 */
	protected EList<Funktion> funktionen;

	/**
	 * The cached value of the '{@link #getMerkmale() <em>Merkmale</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerkmale()
	 * @generated
	 * @ordered
	 */
	protected EList<Merkmal> merkmale;

	/**
	 * The cached value of the '{@link #getGrammatik() <em>Grammatik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammatik()
	 * @generated
	 * @ordered
	 */
	protected Grammatik grammatik;

	/**
	 * The cached value of the '{@link #getLexikon() <em>Lexikon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexikon()
	 * @generated
	 * @ordered
	 */
	protected Lexikon lexikon;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexikalischFunktionaleGrammatikImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LEXIKALISCH_FUNKTIONALE_GRAMMATIK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Funktion> getFunktionen() {
		if (funktionen == null) {
			funktionen = new EObjectContainmentEList<Funktion>(Funktion.class, this, ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN);
		}
		return funktionen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Merkmal> getMerkmale() {
		if (merkmale == null) {
			merkmale = new EObjectResolvingEList<Merkmal>(Merkmal.class, this, ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__MERKMALE);
		}
		return merkmale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammatik getGrammatik() {
		return grammatik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrammatik(Grammatik newGrammatik, NotificationChain msgs) {
		Grammatik oldGrammatik = grammatik;
		grammatik = newGrammatik;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK, oldGrammatik, newGrammatik);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammatik(Grammatik newGrammatik) {
		if (newGrammatik != grammatik) {
			NotificationChain msgs = null;
			if (grammatik != null)
				msgs = ((InternalEObject)grammatik).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK, null, msgs);
			if (newGrammatik != null)
				msgs = ((InternalEObject)newGrammatik).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK, null, msgs);
			msgs = basicSetGrammatik(newGrammatik, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK, newGrammatik, newGrammatik));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lexikon getLexikon() {
		return lexikon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLexikon(Lexikon newLexikon, NotificationChain msgs) {
		Lexikon oldLexikon = lexikon;
		lexikon = newLexikon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON, oldLexikon, newLexikon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexikon(Lexikon newLexikon) {
		if (newLexikon != lexikon) {
			NotificationChain msgs = null;
			if (lexikon != null)
				msgs = ((InternalEObject)lexikon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON, null, msgs);
			if (newLexikon != null)
				msgs = ((InternalEObject)newLexikon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON, null, msgs);
			msgs = basicSetLexikon(newLexikon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON, newLexikon, newLexikon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(long newID) {
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN:
				return ((InternalEList<?>)getFunktionen()).basicRemove(otherEnd, msgs);
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK:
				return basicSetGrammatik(null, msgs);
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON:
				return basicSetLexikon(null, msgs);
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
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN:
				return getFunktionen();
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__MERKMALE:
				return getMerkmale();
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK:
				return getGrammatik();
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON:
				return getLexikon();
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__ID:
				return getID();
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__NAME:
				return getName();
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
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN:
				getFunktionen().clear();
				getFunktionen().addAll((Collection<? extends Funktion>)newValue);
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__MERKMALE:
				getMerkmale().clear();
				getMerkmale().addAll((Collection<? extends Merkmal>)newValue);
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK:
				setGrammatik((Grammatik)newValue);
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON:
				setLexikon((Lexikon)newValue);
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__ID:
				setID((Long)newValue);
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__NAME:
				setName((String)newValue);
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
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN:
				getFunktionen().clear();
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__MERKMALE:
				getMerkmale().clear();
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK:
				setGrammatik((Grammatik)null);
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON:
				setLexikon((Lexikon)null);
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__ID:
				setID(ID_EDEFAULT);
				return;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__NAME:
				setName(NAME_EDEFAULT);
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
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__FUNKTIONEN:
				return funktionen != null && !funktionen.isEmpty();
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__MERKMALE:
				return merkmale != null && !merkmale.isEmpty();
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__GRAMMATIK:
				return grammatik != null;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__LEXIKON:
				return lexikon != null;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__ID:
				return id != ID_EDEFAULT;
			case ModelPackage.LEXIKALISCH_FUNKTIONALE_GRAMMATIK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LexikalischFunktionaleGrammatikImpl
