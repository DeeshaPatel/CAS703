/**
 */
package webmate;

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
 * </ul>
 *
 * @see webmate.WebmatePackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Name</em>' attribute.
	 * @see #setTagName(String)
	 * @see webmate.WebmatePackage#getTag_TagName()
	 * @model
	 * @generated
	 */
	String getTagName();

	/**
	 * Sets the value of the '{@link webmate.Tag#getTagName <em>Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Name</em>' attribute.
	 * @see #getTagName()
	 * @generated
	 */
	void setTagName(String value);

} // Tag
