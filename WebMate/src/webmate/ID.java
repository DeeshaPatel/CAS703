/**
 */
package webmate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.ID#getIdName <em>Id Name</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getID()
 * @model
 * @generated
 */
public interface ID extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Name</em>' attribute.
	 * @see #setIdName(String)
	 * @see webmate.WebmatePackage#getID_IdName()
	 * @model
	 * @generated
	 */
	String getIdName();

	/**
	 * Sets the value of the '{@link webmate.ID#getIdName <em>Id Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Name</em>' attribute.
	 * @see #getIdName()
	 * @generated
	 */
	void setIdName(String value);

} // ID
