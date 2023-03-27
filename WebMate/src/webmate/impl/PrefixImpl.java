/**
 */
package webmate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webmate.ID;
import webmate.Prefix;
import webmate.Tag;
import webmate.WebmatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webmate.impl.PrefixImpl#getCount <em>Count</em>}</li>
 *   <li>{@link webmate.impl.PrefixImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link webmate.impl.PrefixImpl#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link webmate.impl.PrefixImpl#getElementID <em>Element ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrefixImpl extends MinimalEObjectImpl.Container implements Prefix {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected Tag elementName;

	/**
	 * The cached value of the '{@link #getElementClass() <em>Element Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementClass()
	 * @generated
	 * @ordered
	 */
	protected webmate.Class elementClass;

	/**
	 * The cached value of the '{@link #getElementID() <em>Element ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected ID elementID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmatePackage.Literals.PREFIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.PREFIX__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementName(Tag newElementName, NotificationChain msgs) {
		Tag oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.PREFIX__ELEMENT_NAME, oldElementName, newElementName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(Tag newElementName) {
		if (newElementName != elementName) {
			NotificationChain msgs = null;
			if (elementName != null)
				msgs = ((InternalEObject)elementName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.PREFIX__ELEMENT_NAME, null, msgs);
			if (newElementName != null)
				msgs = ((InternalEObject)newElementName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.PREFIX__ELEMENT_NAME, null, msgs);
			msgs = basicSetElementName(newElementName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.PREFIX__ELEMENT_NAME, newElementName, newElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webmate.Class getElementClass() {
		return elementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementClass(webmate.Class newElementClass, NotificationChain msgs) {
		webmate.Class oldElementClass = elementClass;
		elementClass = newElementClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.PREFIX__ELEMENT_CLASS, oldElementClass, newElementClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementClass(webmate.Class newElementClass) {
		if (newElementClass != elementClass) {
			NotificationChain msgs = null;
			if (elementClass != null)
				msgs = ((InternalEObject)elementClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.PREFIX__ELEMENT_CLASS, null, msgs);
			if (newElementClass != null)
				msgs = ((InternalEObject)newElementClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.PREFIX__ELEMENT_CLASS, null, msgs);
			msgs = basicSetElementClass(newElementClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.PREFIX__ELEMENT_CLASS, newElementClass, newElementClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ID getElementID() {
		return elementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementID(ID newElementID, NotificationChain msgs) {
		ID oldElementID = elementID;
		elementID = newElementID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.PREFIX__ELEMENT_ID, oldElementID, newElementID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementID(ID newElementID) {
		if (newElementID != elementID) {
			NotificationChain msgs = null;
			if (elementID != null)
				msgs = ((InternalEObject)elementID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.PREFIX__ELEMENT_ID, null, msgs);
			if (newElementID != null)
				msgs = ((InternalEObject)newElementID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.PREFIX__ELEMENT_ID, null, msgs);
			msgs = basicSetElementID(newElementID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.PREFIX__ELEMENT_ID, newElementID, newElementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebmatePackage.PREFIX__ELEMENT_NAME:
				return basicSetElementName(null, msgs);
			case WebmatePackage.PREFIX__ELEMENT_CLASS:
				return basicSetElementClass(null, msgs);
			case WebmatePackage.PREFIX__ELEMENT_ID:
				return basicSetElementID(null, msgs);
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
			case WebmatePackage.PREFIX__COUNT:
				return getCount();
			case WebmatePackage.PREFIX__ELEMENT_NAME:
				return getElementName();
			case WebmatePackage.PREFIX__ELEMENT_CLASS:
				return getElementClass();
			case WebmatePackage.PREFIX__ELEMENT_ID:
				return getElementID();
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
			case WebmatePackage.PREFIX__COUNT:
				setCount((Integer)newValue);
				return;
			case WebmatePackage.PREFIX__ELEMENT_NAME:
				setElementName((Tag)newValue);
				return;
			case WebmatePackage.PREFIX__ELEMENT_CLASS:
				setElementClass((webmate.Class)newValue);
				return;
			case WebmatePackage.PREFIX__ELEMENT_ID:
				setElementID((ID)newValue);
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
			case WebmatePackage.PREFIX__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case WebmatePackage.PREFIX__ELEMENT_NAME:
				setElementName((Tag)null);
				return;
			case WebmatePackage.PREFIX__ELEMENT_CLASS:
				setElementClass((webmate.Class)null);
				return;
			case WebmatePackage.PREFIX__ELEMENT_ID:
				setElementID((ID)null);
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
			case WebmatePackage.PREFIX__COUNT:
				return count != COUNT_EDEFAULT;
			case WebmatePackage.PREFIX__ELEMENT_NAME:
				return elementName != null;
			case WebmatePackage.PREFIX__ELEMENT_CLASS:
				return elementClass != null;
			case WebmatePackage.PREFIX__ELEMENT_ID:
				return elementID != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //PrefixImpl
