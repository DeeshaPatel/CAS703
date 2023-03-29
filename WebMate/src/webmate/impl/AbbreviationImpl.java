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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected Symbol symbols;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected Tag tags;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected webmate.Class classes;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributes;

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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

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
	public Symbol getSymbols() {
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbols(Symbol newSymbols, NotificationChain msgs) {
		Symbol oldSymbols = symbols;
		symbols = newSymbols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__SYMBOLS, oldSymbols, newSymbols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbols(Symbol newSymbols) {
		if (newSymbols != symbols) {
			NotificationChain msgs = null;
			if (symbols != null)
				msgs = ((InternalEObject)symbols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__SYMBOLS, null, msgs);
			if (newSymbols != null)
				msgs = ((InternalEObject)newSymbols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__SYMBOLS, null, msgs);
			msgs = basicSetSymbols(newSymbols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__SYMBOLS, newSymbols, newSymbols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags(Tag newTags, NotificationChain msgs) {
		Tag oldTags = tags;
		tags = newTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__TAGS, oldTags, newTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTags(Tag newTags) {
		if (newTags != tags) {
			NotificationChain msgs = null;
			if (tags != null)
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__TAGS, newTags, newTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webmate.Class getClasses() {
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClasses(webmate.Class newClasses, NotificationChain msgs) {
		webmate.Class oldClasses = classes;
		classes = newClasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__CLASSES, oldClasses, newClasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasses(webmate.Class newClasses) {
		if (newClasses != classes) {
			NotificationChain msgs = null;
			if (classes != null)
				msgs = ((InternalEObject)classes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__CLASSES, null, msgs);
			if (newClasses != null)
				msgs = ((InternalEObject)newClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__CLASSES, null, msgs);
			msgs = basicSetClasses(newClasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__CLASSES, newClasses, newClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(Attribute newAttributes, NotificationChain msgs) {
		Attribute oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attribute newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__ATTRIBUTES, newAttributes, newAttributes));
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
	public Group getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebmatePackage.ABBREVIATION__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebmatePackage.ABBREVIATION__GROUP, newGroup, newGroup));
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
				return basicSetSymbols(null, msgs);
			case WebmatePackage.ABBREVIATION__TAGS:
				return basicSetTags(null, msgs);
			case WebmatePackage.ABBREVIATION__CLASSES:
				return basicSetClasses(null, msgs);
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case WebmatePackage.ABBREVIATION__GROUP:
				return basicSetGroup(null, msgs);
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
				setSymbols((Symbol)newValue);
				return;
			case WebmatePackage.ABBREVIATION__TAGS:
				setTags((Tag)newValue);
				return;
			case WebmatePackage.ABBREVIATION__CLASSES:
				setClasses((webmate.Class)newValue);
				return;
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				setAttributes((Attribute)newValue);
				return;
			case WebmatePackage.ABBREVIATION__ABBREVIATION:
				getAbbreviation().clear();
				getAbbreviation().addAll((Collection<? extends Abbreviation>)newValue);
				return;
			case WebmatePackage.ABBREVIATION__GROUP:
				setGroup((Group)newValue);
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
				setSymbols((Symbol)null);
				return;
			case WebmatePackage.ABBREVIATION__TAGS:
				setTags((Tag)null);
				return;
			case WebmatePackage.ABBREVIATION__CLASSES:
				setClasses((webmate.Class)null);
				return;
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				setAttributes((Attribute)null);
				return;
			case WebmatePackage.ABBREVIATION__ABBREVIATION:
				getAbbreviation().clear();
				return;
			case WebmatePackage.ABBREVIATION__GROUP:
				setGroup((Group)null);
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
				return symbols != null;
			case WebmatePackage.ABBREVIATION__TAGS:
				return tags != null;
			case WebmatePackage.ABBREVIATION__CLASSES:
				return classes != null;
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
				return attributes != null;
			case WebmatePackage.ABBREVIATION__ABBREVIATION:
				return abbreviation != null && !abbreviation.isEmpty();
			case WebmatePackage.ABBREVIATION__GROUP:
				return group != null;
		}
		return super.eIsSet(featureID);
	}

} //AbbreviationImpl
