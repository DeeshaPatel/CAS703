/**
 */
package webmate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webmate.ID;
import webmate.WebmatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webmate.impl.IDImpl#getIdName <em>Id Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDImpl extends MinimalEObjectImpl.Container implements ID {
	/**
	 * The default value of the '{@link #getIdName() <em>Id Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdName()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdName() <em>Id Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdName()
	 * @generated
	 * @ordered
	 */
	protected String idName = ID_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmatePackage.Literals.ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdName() {
		return idName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdName(String newIdName) {
		String oldIdName = idName;
		idName = newIdName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ID__ID_NAME, oldIdName, idName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebmatePackage.ID__ID_NAME:
				return getIdName();
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
			case WebmatePackage.ID__ID_NAME:
				setIdName((String)newValue);
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
			case WebmatePackage.ID__ID_NAME:
				setIdName(ID_NAME_EDEFAULT);
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
			case WebmatePackage.ID__ID_NAME:
				return ID_NAME_EDEFAULT == null ? idName != null : !ID_NAME_EDEFAULT.equals(idName);
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
		result.append(" (idName: ");
		result.append(idName);
		result.append(')');
		return result.toString();
	}

} //IDImpl
