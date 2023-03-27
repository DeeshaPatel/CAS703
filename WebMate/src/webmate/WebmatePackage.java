/**
 */
package webmate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webmate.WebmateFactory
 * @model kind="package"
 * @generated
 */
public interface WebmatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webmate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cas703.webmate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cas703.webmate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebmatePackage eINSTANCE = webmate.impl.WebmatePackageImpl.init();

	/**
	 * The meta object id for the '{@link webmate.impl.EmmetImpl <em>Emmet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.EmmetImpl
	 * @see webmate.impl.WebmatePackageImpl#getEmmet()
	 * @generated
	 */
	int EMMET = 0;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMMET__ABBREVIATION = 0;

	/**
	 * The number of structural features of the '<em>Emmet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMMET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Emmet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMMET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.AbbreviationImpl
	 * @see webmate.impl.WebmatePackageImpl#getAbbreviation()
	 * @generated
	 */
	int ABBREVIATION = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION__SUFFIX = 2;

	/**
	 * The number of structural features of the '<em>Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.PrefixImpl <em>Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.PrefixImpl
	 * @see webmate.impl.WebmatePackageImpl#getPrefix()
	 * @generated
	 */
	int PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX__ELEMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Element Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX__ELEMENT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX__ELEMENT_ID = 3;

	/**
	 * The number of structural features of the '<em>Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.SuffixImpl <em>Suffix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.SuffixImpl
	 * @see webmate.impl.WebmatePackageImpl#getSuffix()
	 * @generated
	 */
	int SUFFIX = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX__ELEMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Element Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX__ELEMENT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX__ELEMENT_ID = 3;

	/**
	 * The number of structural features of the '<em>Suffix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Suffix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.ElementImpl
	 * @see webmate.impl.WebmatePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Element Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_ID = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.AttributeImpl
	 * @see webmate.impl.WebmatePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.TagImpl
	 * @see webmate.impl.WebmatePackageImpl#getTag()
	 * @generated
	 */
	int TAG = 6;

	/**
	 * The feature id for the '<em><b>Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TAG_NAME = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.ClassImpl
	 * @see webmate.impl.WebmatePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 7;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_NAME = 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.IDImpl
	 * @see webmate.impl.WebmatePackageImpl#getID()
	 * @generated
	 */
	int ID = 8;

	/**
	 * The feature id for the '<em><b>Id Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ID_NAME = 0;

	/**
	 * The number of structural features of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link webmate.Emmet <em>Emmet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emmet</em>'.
	 * @see webmate.Emmet
	 * @generated
	 */
	EClass getEmmet();

	/**
	 * Returns the meta object for the containment reference list '{@link webmate.Emmet#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbreviation</em>'.
	 * @see webmate.Emmet#getAbbreviation()
	 * @see #getEmmet()
	 * @generated
	 */
	EReference getEmmet_Abbreviation();

	/**
	 * Returns the meta object for class '{@link webmate.Abbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbreviation</em>'.
	 * @see webmate.Abbreviation
	 * @generated
	 */
	EClass getAbbreviation();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Abbreviation#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see webmate.Abbreviation#getPrefix()
	 * @see #getAbbreviation()
	 * @generated
	 */
	EReference getAbbreviation_Prefix();

	/**
	 * Returns the meta object for the containment reference list '{@link webmate.Abbreviation#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see webmate.Abbreviation#getElement()
	 * @see #getAbbreviation()
	 * @generated
	 */
	EReference getAbbreviation_Element();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Abbreviation#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see webmate.Abbreviation#getSuffix()
	 * @see #getAbbreviation()
	 * @generated
	 */
	EReference getAbbreviation_Suffix();

	/**
	 * Returns the meta object for class '{@link webmate.Prefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix</em>'.
	 * @see webmate.Prefix
	 * @generated
	 */
	EClass getPrefix();

	/**
	 * Returns the meta object for the attribute '{@link webmate.Prefix#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see webmate.Prefix#getCount()
	 * @see #getPrefix()
	 * @generated
	 */
	EAttribute getPrefix_Count();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Prefix#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Name</em>'.
	 * @see webmate.Prefix#getElementName()
	 * @see #getPrefix()
	 * @generated
	 */
	EReference getPrefix_ElementName();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Prefix#getElementClass <em>Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Class</em>'.
	 * @see webmate.Prefix#getElementClass()
	 * @see #getPrefix()
	 * @generated
	 */
	EReference getPrefix_ElementClass();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Prefix#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element ID</em>'.
	 * @see webmate.Prefix#getElementID()
	 * @see #getPrefix()
	 * @generated
	 */
	EReference getPrefix_ElementID();

	/**
	 * Returns the meta object for class '{@link webmate.Suffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suffix</em>'.
	 * @see webmate.Suffix
	 * @generated
	 */
	EClass getSuffix();

	/**
	 * Returns the meta object for the attribute '{@link webmate.Suffix#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see webmate.Suffix#getText()
	 * @see #getSuffix()
	 * @generated
	 */
	EAttribute getSuffix_Text();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Suffix#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Name</em>'.
	 * @see webmate.Suffix#getElementName()
	 * @see #getSuffix()
	 * @generated
	 */
	EReference getSuffix_ElementName();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Suffix#getElementClass <em>Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Class</em>'.
	 * @see webmate.Suffix#getElementClass()
	 * @see #getSuffix()
	 * @generated
	 */
	EReference getSuffix_ElementClass();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Suffix#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element ID</em>'.
	 * @see webmate.Suffix#getElementID()
	 * @see #getSuffix()
	 * @generated
	 */
	EReference getSuffix_ElementID();

	/**
	 * Returns the meta object for class '{@link webmate.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see webmate.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link webmate.Element#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see webmate.Element#getCount()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Count();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Element#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Name</em>'.
	 * @see webmate.Element#getElementName()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ElementName();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Element#getElementClass <em>Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Class</em>'.
	 * @see webmate.Element#getElementClass()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ElementClass();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.Element#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element ID</em>'.
	 * @see webmate.Element#getElementID()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ElementID();

	/**
	 * Returns the meta object for the containment reference list '{@link webmate.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see webmate.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for class '{@link webmate.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see webmate.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link webmate.Attribute#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see webmate.Attribute#getAttributeName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link webmate.Attribute#getAttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Value</em>'.
	 * @see webmate.Attribute#getAttributeValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeValue();

	/**
	 * Returns the meta object for class '{@link webmate.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see webmate.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link webmate.Tag#getTagName <em>Tag Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Name</em>'.
	 * @see webmate.Tag#getTagName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_TagName();

	/**
	 * Returns the meta object for class '{@link webmate.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see webmate.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link webmate.Class#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see webmate.Class#getClassName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_ClassName();

	/**
	 * Returns the meta object for class '{@link webmate.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see webmate.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for the attribute '{@link webmate.ID#getIdName <em>Id Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Name</em>'.
	 * @see webmate.ID#getIdName()
	 * @see #getID()
	 * @generated
	 */
	EAttribute getID_IdName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebmateFactory getWebmateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webmate.impl.EmmetImpl <em>Emmet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.EmmetImpl
		 * @see webmate.impl.WebmatePackageImpl#getEmmet()
		 * @generated
		 */
		EClass EMMET = eINSTANCE.getEmmet();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMMET__ABBREVIATION = eINSTANCE.getEmmet_Abbreviation();

		/**
		 * The meta object literal for the '{@link webmate.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.AbbreviationImpl
		 * @see webmate.impl.WebmatePackageImpl#getAbbreviation()
		 * @generated
		 */
		EClass ABBREVIATION = eINSTANCE.getAbbreviation();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATION__PREFIX = eINSTANCE.getAbbreviation_Prefix();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATION__ELEMENT = eINSTANCE.getAbbreviation_Element();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATION__SUFFIX = eINSTANCE.getAbbreviation_Suffix();

		/**
		 * The meta object literal for the '{@link webmate.impl.PrefixImpl <em>Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.PrefixImpl
		 * @see webmate.impl.WebmatePackageImpl#getPrefix()
		 * @generated
		 */
		EClass PREFIX = eINSTANCE.getPrefix();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFIX__COUNT = eINSTANCE.getPrefix_Count();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFIX__ELEMENT_NAME = eINSTANCE.getPrefix_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFIX__ELEMENT_CLASS = eINSTANCE.getPrefix_ElementClass();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFIX__ELEMENT_ID = eINSTANCE.getPrefix_ElementID();

		/**
		 * The meta object literal for the '{@link webmate.impl.SuffixImpl <em>Suffix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.SuffixImpl
		 * @see webmate.impl.WebmatePackageImpl#getSuffix()
		 * @generated
		 */
		EClass SUFFIX = eINSTANCE.getSuffix();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUFFIX__TEXT = eINSTANCE.getSuffix_Text();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUFFIX__ELEMENT_NAME = eINSTANCE.getSuffix_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUFFIX__ELEMENT_CLASS = eINSTANCE.getSuffix_ElementClass();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUFFIX__ELEMENT_ID = eINSTANCE.getSuffix_ElementID();

		/**
		 * The meta object literal for the '{@link webmate.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.ElementImpl
		 * @see webmate.impl.WebmatePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COUNT = eINSTANCE.getElement_Count();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ELEMENT_NAME = eINSTANCE.getElement_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ELEMENT_CLASS = eINSTANCE.getElement_ElementClass();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ELEMENT_ID = eINSTANCE.getElement_ElementID();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '{@link webmate.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.AttributeImpl
		 * @see webmate.impl.WebmatePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Attribute Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getAttribute_AttributeValue();

		/**
		 * The meta object literal for the '{@link webmate.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.TagImpl
		 * @see webmate.impl.WebmatePackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__TAG_NAME = eINSTANCE.getTag_TagName();

		/**
		 * The meta object literal for the '{@link webmate.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.ClassImpl
		 * @see webmate.impl.WebmatePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CLASS_NAME = eINSTANCE.getClass_ClassName();

		/**
		 * The meta object literal for the '{@link webmate.impl.IDImpl <em>ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.IDImpl
		 * @see webmate.impl.WebmatePackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '<em><b>Id Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID__ID_NAME = eINSTANCE.getID_IdName();

	}

} //WebmatePackage
