/**
 */
package webmate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.Tag#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link webmate.Tag#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link webmate.Tag#getId <em>Id</em>}</li>
 *   <li>{@link webmate.Tag#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag Name</b></em>' attribute.
	 * The literals are from the enumeration {@link webmate.HTMLTag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Name</em>' attribute.
	 * @see webmate.HTMLTag
	 * @see #setTagName(HTMLTag)
	 * @see webmate.WebmatePackage#getTag_TagName()
	 * @model
	 * @generated
	 */
	HTMLTag getTagName();

	/**
	 * Sets the value of the '{@link webmate.Tag#getTagName <em>Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Name</em>' attribute.
	 * @see webmate.HTMLTag
	 * @see #getTagName()
	 * @generated
	 */
	void setTagName(HTMLTag value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see webmate.WebmatePackage#getTag_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(ID)
	 * @see webmate.WebmatePackage#getTag_Id()
	 * @model containment="true"
	 * @generated
	 */
	ID getId();

	/**
	 * Sets the value of the '{@link webmate.Tag#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ID value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see webmate.WebmatePackage#getTag_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<webmate.Class> getClass_();

} // Tag
