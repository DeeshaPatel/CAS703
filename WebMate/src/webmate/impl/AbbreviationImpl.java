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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webmate.Abbreviation;
import webmate.Attribute;
import webmate.Group;
import webmate.ID;
import webmate.Symbol;
import webmate.Tag;
import webmate.WebmatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abbreviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webmate.impl.AbbreviationImpl#getIds <em>Ids</em>}</li>
 *   <li>{@link webmate.impl.AbbreviationImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link webmate.impl.AbbreviationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link webmate.impl.AbbreviationImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link webmate.impl.AbbreviationImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link webmate.impl.AbbreviationImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link webmate.impl.AbbreviationImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbbreviationImpl extends MinimalEObjectImpl.Container implements Abbreviation {
	/**
	 * The cached value of the '{@link #getIds() <em>Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected ID ids;

	/**
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> symbols;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<webmate.Class> classes;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected EList<Abbreviation> abbreviation;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

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
	public ID getIds() {
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIds(ID newIds, NotificationChain msgs) {
		ID oldIds = ids;
		ids = newIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__IDS, oldIds, newIds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIds(ID newIds) {
		if (newIds != ids) {
			NotificationChain msgs = null;
			if (ids != null)
				msgs = ((InternalEObject)ids).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__IDS, null, msgs);
			if (newIds != null)
				msgs = ((InternalEObject)newIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__IDS, null, msgs);
			msgs = basicSetIds(newIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__IDS, newIds, newIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getSymbols() {
		if (symbols == null) {
			symbols = new EObjectContainmentEList<Symbol>(Symbol.class, this, WebmatePackage.ABBREVIATION__SYMBOLS);
		}
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, WebmatePackage.ABBREVIATION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<webmate.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<webmate.Class>(webmate.Class.class, this, WebmatePackage.ABBREVIATION__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, WebmatePackage.ABBREVIATION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abbreviation> getAbbreviation() {
		if (abbreviation == null) {
			abbreviation = new EObjectResolvingEList<Abbreviation>(Abbreviation.class, this, WebmatePackage.ABBREVIATION__ABBREVIATION);
		}
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, WebmatePackage.ABBREVIATION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebmatePackage.ABBREVIATION__IDS:
				return basicSetIds(null, msgs);
			case WebmatePackage.ABBREVIATION__SYMBOLS:
				return ((InternalEList<?>)getSymbols()).basicRemove(otherEnd, msgs);
			case WebmatePackage.ABBREVIATION__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case WebmatePackage.ABBREVIATION__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case WebmatePackage.ABBREVIATION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case WebmatePackage.ABBREVIATION__IDS:
				return getIds();
			case WebmatePackage.ABBREVIATION__SYMBOLS:
				return getSymbols();
			case WebmatePackage.ABBREVIATION__TAGS:
				return getTags();
			case WebmatePackage.ABBREVIATION__CLASSES:
				return getClasses();
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				return getAttributes();
			case WebmatePackage.ABBREVIATION__ABBREVIATION:
				return getAbbreviation();
			case WebmatePackage.ABBREVIATION__GROUP:
				return getGroup();
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
			case WebmatePackage.ABBREVIATION__IDS:
				setIds((ID)newValue);
				return;
			case WebmatePackage.ABBREVIATION__SYMBOLS:
				getSymbols().clear();
				getSymbols().addAll((Collection<? extends Symbol>)newValue);
				return;
			case WebmatePackage.ABBREVIATION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case WebmatePackage.ABBREVIATION__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends webmate.Class>)newValue);
				return;
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case WebmatePackage.ABBREVIATION__ABBREVIATION:
				getAbbreviation().clear();
				getAbbreviation().addAll((Collection<? extends Abbreviation>)newValue);
				return;
			case WebmatePackage.ABBREVIATION__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
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
			case WebmatePackage.ABBREVIATION__IDS:
				setIds((ID)null);
				return;
			case WebmatePackage.ABBREVIATION__SYMBOLS:
				getSymbols().clear();
				return;
			case WebmatePackage.ABBREVIATION__TAGS:
				getTags().clear();
				return;
			case WebmatePackage.ABBREVIATION__CLASSES:
				getClasses().clear();
				return;
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case WebmatePackage.ABBREVIATION__ABBREVIATION:
				getAbbreviation().clear();
				return;
			case WebmatePackage.ABBREVIATION__GROUP:
				getGroup().clear();
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
			case WebmatePackage.ABBREVIATION__IDS:
				return ids != null;
			case WebmatePackage.ABBREVIATION__SYMBOLS:
				return symbols != null && !symbols.isEmpty();
			case WebmatePackage.ABBREVIATION__TAGS:
				return tags != null && !tags.isEmpty();
			case WebmatePackage.ABBREVIATION__CLASSES:
				return classes != null && !classes.isEmpty();
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case WebmatePackage.ABBREVIATION__ABBREVIATION:
				return abbreviation != null && !abbreviation.isEmpty();
			case WebmatePackage.ABBREVIATION__GROUP:
				return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbbreviationImpl
