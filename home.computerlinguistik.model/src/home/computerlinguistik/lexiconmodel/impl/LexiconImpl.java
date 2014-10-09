/**
 */
package home.computerlinguistik.lexiconmodel.impl;

import home.computerlinguistik.lexiconmodel.Eintrag;
import home.computerlinguistik.lexiconmodel.GrammatikalischeKategorie;
import home.computerlinguistik.lexiconmodel.Lexicon;
import home.computerlinguistik.lexiconmodel.LexiconmodelPackage;
import home.computerlinguistik.lexiconmodel.Subkategorisierung;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lexicon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.LexiconImpl#getEintraege <em>Eintraege</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.LexiconImpl#getGrammatikalischeKategorien <em>Grammatikalische Kategorien</em>}</li>
 *   <li>{@link home.computerlinguistik.lexiconmodel.impl.LexiconImpl#getSubkaterorisierungen <em>Subkaterorisierungen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LexiconImpl extends MinimalEObjectImpl.Container implements Lexicon {
	/**
	 * The cached value of the '{@link #getEintraege() <em>Eintraege</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEintraege()
	 * @generated
	 * @ordered
	 */
	protected EList<Eintrag> eintraege;

	/**
	 * The cached value of the '{@link #getGrammatikalischeKategorien() <em>Grammatikalische Kategorien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammatikalischeKategorien()
	 * @generated
	 * @ordered
	 */
	protected EList<GrammatikalischeKategorie> grammatikalischeKategorien;

	/**
	 * The cached value of the '{@link #getSubkaterorisierungen() <em>Subkaterorisierungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubkaterorisierungen()
	 * @generated
	 * @ordered
	 */
	protected EList<Subkategorisierung> subkaterorisierungen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexiconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LexiconmodelPackage.Literals.LEXICON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Eintrag> getEintraege() {
		if (eintraege == null) {
			eintraege = new EObjectContainmentEList<Eintrag>(Eintrag.class, this, LexiconmodelPackage.LEXICON__EINTRAEGE);
		}
		return eintraege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrammatikalischeKategorie> getGrammatikalischeKategorien() {
		if (grammatikalischeKategorien == null) {
			grammatikalischeKategorien = new EObjectContainmentEList<GrammatikalischeKategorie>(GrammatikalischeKategorie.class, this, LexiconmodelPackage.LEXICON__GRAMMATIKALISCHE_KATEGORIEN);
		}
		return grammatikalischeKategorien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subkategorisierung> getSubkaterorisierungen() {
		if (subkaterorisierungen == null) {
			subkaterorisierungen = new EObjectContainmentEList<Subkategorisierung>(Subkategorisierung.class, this, LexiconmodelPackage.LEXICON__SUBKATERORISIERUNGEN);
		}
		return subkaterorisierungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LexiconmodelPackage.LEXICON__EINTRAEGE:
				return ((InternalEList<?>)getEintraege()).basicRemove(otherEnd, msgs);
			case LexiconmodelPackage.LEXICON__GRAMMATIKALISCHE_KATEGORIEN:
				return ((InternalEList<?>)getGrammatikalischeKategorien()).basicRemove(otherEnd, msgs);
			case LexiconmodelPackage.LEXICON__SUBKATERORISIERUNGEN:
				return ((InternalEList<?>)getSubkaterorisierungen()).basicRemove(otherEnd, msgs);
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
			case LexiconmodelPackage.LEXICON__EINTRAEGE:
				return getEintraege();
			case LexiconmodelPackage.LEXICON__GRAMMATIKALISCHE_KATEGORIEN:
				return getGrammatikalischeKategorien();
			case LexiconmodelPackage.LEXICON__SUBKATERORISIERUNGEN:
				return getSubkaterorisierungen();
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
			case LexiconmodelPackage.LEXICON__EINTRAEGE:
				getEintraege().clear();
				getEintraege().addAll((Collection<? extends Eintrag>)newValue);
				return;
			case LexiconmodelPackage.LEXICON__GRAMMATIKALISCHE_KATEGORIEN:
				getGrammatikalischeKategorien().clear();
				getGrammatikalischeKategorien().addAll((Collection<? extends GrammatikalischeKategorie>)newValue);
				return;
			case LexiconmodelPackage.LEXICON__SUBKATERORISIERUNGEN:
				getSubkaterorisierungen().clear();
				getSubkaterorisierungen().addAll((Collection<? extends Subkategorisierung>)newValue);
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
			case LexiconmodelPackage.LEXICON__EINTRAEGE:
				getEintraege().clear();
				return;
			case LexiconmodelPackage.LEXICON__GRAMMATIKALISCHE_KATEGORIEN:
				getGrammatikalischeKategorien().clear();
				return;
			case LexiconmodelPackage.LEXICON__SUBKATERORISIERUNGEN:
				getSubkaterorisierungen().clear();
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
			case LexiconmodelPackage.LEXICON__EINTRAEGE:
				return eintraege != null && !eintraege.isEmpty();
			case LexiconmodelPackage.LEXICON__GRAMMATIKALISCHE_KATEGORIEN:
				return grammatikalischeKategorien != null && !grammatikalischeKategorien.isEmpty();
			case LexiconmodelPackage.LEXICON__SUBKATERORISIERUNGEN:
				return subkaterorisierungen != null && !subkaterorisierungen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LexiconImpl
