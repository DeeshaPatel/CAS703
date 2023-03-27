/**
 */
package webmate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webmate.InputSymbol;
import webmate.InputWord;
import webmate.WebmatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webmate.impl.InputSymbolImpl#getSym <em>Sym</em>}</li>
 *   <li>{@link webmate.impl.InputSymbolImpl#getInputword <em>Inputword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputSymbolImpl extends MinimalEObjectImpl.Container implements InputSymbol {
	/**
	 * The default value of the '{@link #getSym() <em>Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSym()
	 * @generated
	 * @ordered
	 */
	protected static final String SYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSym() <em>Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSym()
	 * @generated
	 * @ordered
	 */
	protected String sym = SYM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputword() <em>Inputword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputword()
	 * @generated
	 * @ordered
	 */
	protected InputWord inputword;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmatePackage.Literals.INPUT_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSym() {
		return sym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSym(String newSym) {
		String oldSym = sym;
		sym = newSym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.INPUT_SYMBOL__SYM, oldSym, sym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputWord getInputword() {
		return inputword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputword(InputWord newInputword, NotificationChain msgs) {
		InputWord oldInputword = inputword;
		inputword = newInputword;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.INPUT_SYMBOL__INPUTWORD, oldInputword, newInputword);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputword(InputWord newInputword) {
		if (newInputword != inputword) {
			NotificationChain msgs = null;
			if (inputword != null)
				msgs = ((InternalEObject)inputword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.INPUT_SYMBOL__INPUTWORD, null, msgs);
			if (newInputword != null)
				msgs = ((InternalEObject)newInputword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.INPUT_SYMBOL__INPUTWORD, null, msgs);
			msgs = basicSetInputword(newInputword, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.INPUT_SYMBOL__INPUTWORD, newInputword, newInputword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebmatePackage.INPUT_SYMBOL__INPUTWORD:
				return basicSetInputword(null, msgs);
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
			case WebmatePackage.INPUT_SYMBOL__SYM:
				return getSym();
			case WebmatePackage.INPUT_SYMBOL__INPUTWORD:
				return getInputword();
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
			case WebmatePackage.INPUT_SYMBOL__SYM:
				setSym((String)newValue);
				return;
			case WebmatePackage.INPUT_SYMBOL__INPUTWORD:
				setInputword((InputWord)newValue);
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
			case WebmatePackage.INPUT_SYMBOL__SYM:
				setSym(SYM_EDEFAULT);
				return;
			case WebmatePackage.INPUT_SYMBOL__INPUTWORD:
				setInputword((InputWord)null);
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
			case WebmatePackage.INPUT_SYMBOL__SYM:
				return SYM_EDEFAULT == null ? sym != null : !SYM_EDEFAULT.equals(sym);
			case WebmatePackage.INPUT_SYMBOL__INPUTWORD:
				return inputword != null;
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
		result.append(" (sym: ");
		result.append(sym);
		result.append(')');
		return result.toString();
	}

} //InputSymbolImpl
