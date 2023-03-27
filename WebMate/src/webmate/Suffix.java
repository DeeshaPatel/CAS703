/**
 */
package webmate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suffix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.Suffix#getText <em>Text</em>}</li>
 *   <li>{@link webmate.Suffix#getElementName <em>Element Name</em>}</li>
 *   <li>{@link webmate.Suffix#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link webmate.Suffix#getElementID <em>Element ID</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getSuffix()
 * @model
 * @generated
 */
public interface Suffix extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see webmate.WebmatePackage#getSuffix_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link webmate.Suffix#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' containment reference.
	 * @see #setElementName(Tag)
	 * @see webmate.WebmatePackage#getSuffix_ElementName()
	 * @model containment="true"
	 * @generated
	 */
	Tag getElementName();

	/**
	 * Sets the value of the '{@link webmate.Suffix#getElementName <em>Element Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' containment reference.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(Tag value);

	/**
	 * Returns the value of the '<em><b>Element Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Class</em>' containment reference.
	 * @see #setElementClass(webmate.Class)
	 * @see webmate.WebmatePackage#getSuffix_ElementClass()
	 * @model containment="true"
	 * @generated
	 */
	webmate.Class getElementClass();

	/**
	 * Sets the value of the '{@link webmate.Suffix#getElementClass <em>Element Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Class</em>' containment reference.
	 * @see #getElementClass()
	 * @generated
	 */
	void setElementClass(webmate.Class value);

	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element ID</em>' containment reference.
	 * @see #setElementID(ID)
	 * @see webmate.WebmatePackage#getSuffix_ElementID()
	 * @model containment="true"
	 * @generated
	 */
	ID getElementID();

	/**
	 * Sets the value of the '{@link webmate.Suffix#getElementID <em>Element ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' containment reference.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(ID value);

} // Suffix
