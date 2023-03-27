/**
 */
package webmate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.Attribute#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link webmate.Attribute#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see webmate.WebmatePackage#getAttribute_AttributeName()
	 * @model
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link webmate.Attribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' attribute.
	 * @see #setAttributeValue(String)
	 * @see webmate.WebmatePackage#getAttribute_AttributeValue()
	 * @model
	 * @generated
	 */
	String getAttributeValue();

	/**
	 * Sets the value of the '{@link webmate.Attribute#getAttributeValue <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' attribute.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(String value);

} // Attribute
