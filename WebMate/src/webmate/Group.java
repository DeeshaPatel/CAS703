/**
 */
package webmate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.Group#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link webmate.Group#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Abbreviation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' containment reference list.
	 * @see webmate.WebmatePackage#getGroup_Abbreviation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Abbreviation> getAbbreviation();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see webmate.WebmatePackage#getGroup_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link webmate.Group#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

} // Group
