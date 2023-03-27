/**
 */
package webmate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webmate.Abbreviation;
import webmate.Element;
import webmate.Prefix;
import webmate.Suffix;
import webmate.WebmatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abbreviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webmate.impl.AbbreviationImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link webmate.impl.AbbreviationImpl#getElement <em>Element</em>}</li>
 *   <li>{@link webmate.impl.AbbreviationImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbbreviationImpl extends MinimalEObjectImpl.Container implements Abbreviation {
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected Prefix prefix;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected Suffix suffix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbbreviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmatePackage.Literals.ABBREVIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prefix getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(Prefix newPrefix, NotificationChain msgs) {
		Prefix oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__PREFIX, oldPrefix, newPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(Prefix newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__PREFIX, newPrefix, newPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, WebmatePackage.ABBREVIATION__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suffix getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuffix(Suffix newSuffix, NotificationChain msgs) {
		Suffix oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__SUFFIX, oldSuffix, newSuffix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(Suffix newSuffix) {
		if (newSuffix != suffix) {
			NotificationChain msgs = null;
			if (suffix != null)
				msgs = ((InternalEObject)suffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__SUFFIX, null, msgs);
			if (newSuffix != null)
				msgs = ((InternalEObject)newSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__SUFFIX, null, msgs);
			msgs = basicSetSuffix(newSuffix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__SUFFIX, newSuffix, newSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebmatePackage.ABBREVIATION__PREFIX:
				return basicSetPrefix(null, msgs);
			case WebmatePackage.ABBREVIATION__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case WebmatePackage.ABBREVIATION__SUFFIX:
				return basicSetSuffix(null, msgs);
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
			case WebmatePackage.ABBREVIATION__PREFIX:
				return getPrefix();
			case WebmatePackage.ABBREVIATION__ELEMENT:
				return getElement();
			case WebmatePackage.ABBREVIATION__SUFFIX:
				return getSuffix();
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
			case WebmatePackage.ABBREVIATION__PREFIX:
				setPrefix((Prefix)newValue);
				return;
			case WebmatePackage.ABBREVIATION__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case WebmatePackage.ABBREVIATION__SUFFIX:
				setSuffix((Suffix)newValue);
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
			case WebmatePackage.ABBREVIATION__PREFIX:
				setPrefix((Prefix)null);
				return;
			case WebmatePackage.ABBREVIATION__ELEMENT:
				getElement().clear();
				return;
			case WebmatePackage.ABBREVIATION__SUFFIX:
				setSuffix((Suffix)null);
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
			case WebmatePackage.ABBREVIATION__PREFIX:
				return prefix != null;
			case WebmatePackage.ABBREVIATION__ELEMENT:
				return element != null && !element.isEmpty();
			case WebmatePackage.ABBREVIATION__SUFFIX:
				return suffix != null;
		}
		return super.eIsSet(featureID);
	}

} //AbbreviationImpl
