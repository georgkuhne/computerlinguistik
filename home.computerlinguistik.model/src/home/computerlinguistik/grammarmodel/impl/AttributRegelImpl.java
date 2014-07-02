/**
 */
package home.computerlinguistik.grammarmodel.impl;

import home.computerlinguistik.grammarmodel.AttributRegel;
import home.computerlinguistik.grammarmodel.AttributRegelTerm;
import home.computerlinguistik.grammarmodel.GrammarmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut Regel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link home.computerlinguistik.grammarmodel.impl.AttributRegelImpl#getRechts <em>Rechts</em>}</li>
 *   <li>{@link home.computerlinguistik.grammarmodel.impl.AttributRegelImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributRegelImpl extends MinimalEObjectImpl.Container implements AttributRegel {
	/**
	 * The cached value of the '{@link #getRechts() <em>Rechts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechts()
	 * @generated
	 * @ordered
	 */
	protected AttributRegelTerm rechts;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected AttributRegelTerm links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributRegelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarmodelPackage.Literals.ATTRIBUT_REGEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributRegelTerm getRechts() {
		return rechts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRechts(AttributRegelTerm newRechts, NotificationChain msgs) {
		AttributRegelTerm oldRechts = rechts;
		rechts = newRechts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS, oldRechts, newRechts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRechts(AttributRegelTerm newRechts) {
		if (newRechts != rechts) {
			NotificationChain msgs = null;
			if (rechts != null)
				msgs = ((InternalEObject)rechts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS, null, msgs);
			if (newRechts != null)
				msgs = ((InternalEObject)newRechts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS, null, msgs);
			msgs = basicSetRechts(newRechts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS, newRechts, newRechts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributRegelTerm getLinks() {
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinks(AttributRegelTerm newLinks, NotificationChain msgs) {
		AttributRegelTerm oldLinks = links;
		links = newLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.ATTRIBUT_REGEL__LINKS, oldLinks, newLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(AttributRegelTerm newLinks) {
		if (newLinks != links) {
			NotificationChain msgs = null;
			if (links != null)
				msgs = ((InternalEObject)links).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrammarmodelPackage.ATTRIBUT_REGEL__LINKS, null, msgs);
			if (newLinks != null)
				msgs = ((InternalEObject)newLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrammarmodelPackage.ATTRIBUT_REGEL__LINKS, null, msgs);
			msgs = basicSetLinks(newLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarmodelPackage.ATTRIBUT_REGEL__LINKS, newLinks, newLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS:
				return basicSetRechts(null, msgs);
			case GrammarmodelPackage.ATTRIBUT_REGEL__LINKS:
				return basicSetLinks(null, msgs);
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
			case GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS:
				return getRechts();
			case GrammarmodelPackage.ATTRIBUT_REGEL__LINKS:
				return getLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS:
				setRechts((AttributRegelTerm)newValue);
				return;
			case GrammarmodelPackage.ATTRIBUT_REGEL__LINKS:
				setLinks((AttributRegelTerm)newValue);
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
			case GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS:
				setRechts((AttributRegelTerm)null);
				return;
			case GrammarmodelPackage.ATTRIBUT_REGEL__LINKS:
				setLinks((AttributRegelTerm)null);
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
			case GrammarmodelPackage.ATTRIBUT_REGEL__RECHTS:
				return rechts != null;
			case GrammarmodelPackage.ATTRIBUT_REGEL__LINKS:
				return links != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributRegelImpl
