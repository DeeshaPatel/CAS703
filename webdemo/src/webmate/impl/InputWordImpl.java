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
 * An implementation of the model object '<em><b>Input Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webmate.impl.InputWordImpl#getWord <em>Word</em>}</li>
 *   <li>{@link webmate.impl.InputWordImpl#getInputsymbol <em>Inputsymbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputWordImpl extends MinimalEObjectImpl.Container implements InputWord {
	/**
	 * The default value of the '{@link #getWord() <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected static final String WORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWord() <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected String word = WORD_EDEFAULT;

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
	protected InputWordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmatePackage.Literals.INPUT_WORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWord() {
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWord(String newWord) {
		String oldWord = word;
		word = newWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.INPUT_WORD__WORD, oldWord, word));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.INPUT_WORD__INPUTSYMBOL, oldInputsymbol, newInputsymbol);
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
				msgs = ((InternalEObject)inputsymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.INPUT_WORD__INPUTSYMBOL, null, msgs);
			if (newInputsymbol != null)
				msgs = ((InternalEObject)newInputsymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.INPUT_WORD__INPUTSYMBOL, null, msgs);
			msgs = basicSetInputsymbol(newInputsymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.INPUT_WORD__INPUTSYMBOL, newInputsymbol, newInputsymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebmatePackage.INPUT_WORD__INPUTSYMBOL:
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
			case WebmatePackage.INPUT_WORD__WORD:
				return getWord();
			case WebmatePackage.INPUT_WORD__INPUTSYMBOL:
				return getInputsymbol();
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
			case WebmatePackage.INPUT_WORD__WORD:
				setWord((String)newValue);
				return;
			case WebmatePackage.INPUT_WORD__INPUTSYMBOL:
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
			case WebmatePackage.INPUT_WORD__WORD:
				setWord(WORD_EDEFAULT);
				return;
			case WebmatePackage.INPUT_WORD__INPUTSYMBOL:
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
			case WebmatePackage.INPUT_WORD__WORD:
				return WORD_EDEFAULT == null ? word != null : !WORD_EDEFAULT.equals(word);
			case WebmatePackage.INPUT_WORD__INPUTSYMBOL:
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
		result.append(" (word: ");
		result.append(word);
		result.append(')');
		return result.toString();
	}

} //InputWordImpl
