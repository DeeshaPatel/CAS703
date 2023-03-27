/**
 */
package webmate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.Element#getCount <em>Count</em>}</li>
 *   <li>{@link webmate.Element#getElementName <em>Element Name</em>}</li>
 *   <li>{@link webmate.Element#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link webmate.Element#getElementID <em>Element ID</em>}</li>
 *   <li>{@link webmate.Element#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see webmate.WebmatePackage#getElement_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link webmate.Element#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' containment reference.
	 * @see #setElementName(Tag)
	 * @see webmate.WebmatePackage#getElement_ElementName()
	 * @model containment="true"
	 * @generated
	 */
	Tag getElementName();

	/**
	 * Sets the value of the '{@link webmate.Element#getElementName <em>Element Name</em>}' containment reference.
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
	 * @see webmate.WebmatePackage#getElement_ElementClass()
	 * @model containment="true"
	 * @generated
	 */
	webmate.Class getElementClass();

	/**
	 * Sets the value of the '{@link webmate.Element#getElementClass <em>Element Class</em>}' containment reference.
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
	 * @see webmate.WebmatePackage#getElement_ElementID()
	 * @model containment="true"
	 * @generated
	 */
	ID getElementID();

	/**
	 * Sets the value of the '{@link webmate.Element#getElementID <em>Element ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' containment reference.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(ID value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see webmate.WebmatePackage#getElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Element
