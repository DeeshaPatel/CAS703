/**
 */
package webmate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webmate.Symbol;
import webmate.Tag;
import webmate.ValidSymbol;
import webmate.WebmatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webmate.impl.SymbolImpl#getSym <em>Sym</em>}</li>
 *   <li>{@link webmate.impl.SymbolImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolImpl extends MinimalEObjectImpl.Container implements Symbol {
	/**
	 * The default value of the '{@link #getSym() <em>Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSym()
	 * @generated
	 * @ordered
	 */
	protected static final ValidSymbol SYM_EDEFAULT = ValidSymbol.PLUS;

	/**
	 * The cached value of the '{@link #getSym() <em>Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSym()
	 * @generated
	 * @ordered
	 */
	protected ValidSymbol sym = SYM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected Tag tag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmatePackage.Literals.SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidSymbol getSym() {
		return sym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSym(ValidSymbol newSym) {
		ValidSymbol oldSym = sym;
		sym = newSym == null ? SYM_EDEFAULT : newSym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.SYMBOL__SYM, oldSym, sym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getTag() {
		if (tag != null && tag.eIsProxy()) {
			InternalEObject oldTag = (InternalEObject)tag;
			tag = (Tag)eResolveProxy(oldTag);
			if (tag != oldTag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebmatePackage.SYMBOL__TAG, oldTag, tag));
			}
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag basicGetTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(Tag newTag) {
		Tag oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.SYMBOL__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebmatePackage.SYMBOL__SYM:
				return getSym();
			case WebmatePackage.SYMBOL__TAG:
				if (resolve) return getTag();
				return basicGetTag();
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
			case WebmatePackage.SYMBOL__SYM:
				setSym((ValidSymbol)newValue);
				return;
			case WebmatePackage.SYMBOL__TAG:
				setTag((Tag)newValue);
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
			case WebmatePackage.SYMBOL__SYM:
				setSym(SYM_EDEFAULT);
				return;
			case WebmatePackage.SYMBOL__TAG:
				setTag((Tag)null);
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
			case WebmatePackage.SYMBOL__SYM:
				return sym != SYM_EDEFAULT;
			case WebmatePackage.SYMBOL__TAG:
				return tag != null;
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

} //SymbolImpl
