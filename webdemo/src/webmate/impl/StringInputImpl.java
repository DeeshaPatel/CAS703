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

import webmate.InputSymbol;
import webmate.InputWord;
import webmate.StringInput;
import webmate.WebmatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webmate.impl.StringInputImpl#getInput <em>Input</em>}</li>
 *   <li>{@link webmate.impl.StringInputImpl#getInputword <em>Inputword</em>}</li>
 *   <li>{@link webmate.impl.StringInputImpl#getStringinput <em>Stringinput</em>}</li>
 *   <li>{@link webmate.impl.StringInputImpl#getInputsymbol <em>Inputsymbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringInputImpl extends MinimalEObjectImpl.Container implements StringInput {
	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;

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
	 * The cached value of the '{@link #getStringinput() <em>Stringinput</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringinput()
	 * @generated
	 * @ordered
	 */
	protected EList<StringInput> stringinput;

	/**
	 * The cached value of the '{@link #getInputsymbol() <em>Inputsymbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputsymbol()
	 * @generated
	 * @ordered
	 */
	protected InputSymbol inputsymbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmatePackage.Literals.STRING_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.STRING_INPUT__INPUT, oldInput, input));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.STRING_INPUT__INPUTWORD, oldInputword, newInputword);
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
				msgs = ((InternalEObject)inputword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.STRING_INPUT__INPUTWORD, null, msgs);
			if (newInputword != null)
				msgs = ((InternalEObject)newInputword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.STRING_INPUT__INPUTWORD, null, msgs);
			msgs = basicSetInputword(newInputword, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.STRING_INPUT__INPUTWORD, newInputword, newInputword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringInput> getStringinput() {
		if (stringinput == null) {
			stringinput = new EObjectContainmentEList<StringInput>(StringInput.class, this, WebmatePackage.STRING_INPUT__STRINGINPUT);
		}
		return stringinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSymbol getInputsymbol() {
		return inputsymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputsymbol(InputSymbol newInputsymbol, NotificationChain msgs) {
		InputSymbol oldInputsymbol = inputsymbol;
		inputsymbol = newInputsymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.STRING_INPUT__INPUTSYMBOL, oldInputsymbol, newInputsymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputsymbol(InputSymbol newInputsymbol) {
		if (newInputsymbol != inputsymbol) {
			NotificationChain msgs = null;
			if (inputsymbol != null)
				msgs = ((InternalEObject)inputsymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.STRING_INPUT__INPUTSYMBOL, null, msgs);
			if (newInputsymbol != null)
				msgs = ((InternalEObject)newInputsymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.STRING_INPUT__INPUTSYMBOL, null, msgs);
			msgs = basicSetInputsymbol(newInputsymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.STRING_INPUT__INPUTSYMBOL, newInputsymbol, newInputsymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebmatePackage.STRING_INPUT__INPUTWORD:
				return basicSetInputword(null, msgs);
			case WebmatePackage.STRING_INPUT__STRINGINPUT:
				return ((InternalEList<?>)getStringinput()).basicRemove(otherEnd, msgs);
			case WebmatePackage.STRING_INPUT__INPUTSYMBOL:
				return basicSetInputsymbol(null, msgs);
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
			case WebmatePackage.STRING_INPUT__INPUT:
				return getInput();
			case WebmatePackage.STRING_INPUT__INPUTWORD:
				return getInputword();
			case WebmatePackage.STRING_INPUT__STRINGINPUT:
				return getStringinput();
			case WebmatePackage.STRING_INPUT__INPUTSYMBOL:
				return getInputsymbol();
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
			case WebmatePackage.STRING_INPUT__INPUT:
				setInput((String)newValue);
				return;
			case WebmatePackage.STRING_INPUT__INPUTWORD:
				setInputword((InputWord)newValue);
				return;
			case WebmatePackage.STRING_INPUT__STRINGINPUT:
				getStringinput().clear();
				getStringinput().addAll((Collection<? extends StringInput>)newValue);
				return;
			case WebmatePackage.STRING_INPUT__INPUTSYMBOL:
				setInputsymbol((InputSymbol)newValue);
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
			case WebmatePackage.STRING_INPUT__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case WebmatePackage.STRING_INPUT__INPUTWORD:
				setInputword((InputWord)null);
				return;
			case WebmatePackage.STRING_INPUT__STRINGINPUT:
				getStringinput().clear();
				return;
			case WebmatePackage.STRING_INPUT__INPUTSYMBOL:
				setInputsymbol((InputSymbol)null);
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
			case WebmatePackage.STRING_INPUT__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
			case WebmatePackage.STRING_INPUT__INPUTWORD:
				return inputword != null;
			case WebmatePackage.STRING_INPUT__STRINGINPUT:
				return stringinput != null && !stringinput.isEmpty();
			case WebmatePackage.STRING_INPUT__INPUTSYMBOL:
				return inputsymbol != null;
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
		result.append(" (input: ");
		result.append(input);
		result.append(')');
		return result.toString();
	}

} //StringInputImpl
