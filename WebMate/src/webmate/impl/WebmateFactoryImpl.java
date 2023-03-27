/**
 */
package webmate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webmate.Abbreviation;
import webmate.Attribute;
import webmate.Element;
import webmate.Emmet;
import webmate.ID;
import webmate.Prefix;
import webmate.Suffix;
import webmate.Tag;
import webmate.WebmateFactory;
import webmate.WebmatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebmateFactoryImpl extends EFactoryImpl implements WebmateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebmateFactory init() {
		try {
			WebmateFactory theWebmateFactory = (WebmateFactory)EPackage.Registry.INSTANCE.getEFactory(WebmatePackage.eNS_URI);
			if (theWebmateFactory != null) {
				return theWebmateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebmateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebmateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebmatePackage.EMMET: return createEmmet();
			case WebmatePackage.ABBREVIATION: return createAbbreviation();
			case WebmatePackage.PREFIX: return createPrefix();
			case WebmatePackage.SUFFIX: return createSuffix();
			case WebmatePackage.ELEMENT: return createElement();
			case WebmatePackage.ATTRIBUTE: return createAttribute();
			case WebmatePackage.TAG: return createTag();
			case WebmatePackage.CLASS: return createClass();
			case WebmatePackage.ID: return createID();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emmet createEmmet() {
		EmmetImpl emmet = new EmmetImpl();
		return emmet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abbreviation createAbbreviation() {
		AbbreviationImpl abbreviation = new AbbreviationImpl();
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prefix createPrefix() {
		PrefixImpl prefix = new PrefixImpl();
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suffix createSuffix() {
		SuffixImpl suffix = new SuffixImpl();
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webmate.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ID createID() {
		IDImpl id = new IDImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebmatePackage getWebmatePackage() {
		return (WebmatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebmatePackage getPackage() {
		return WebmatePackage.eINSTANCE;
	}

} //WebmateFactoryImpl
