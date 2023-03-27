/**
 */
package webmate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abbreviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.Abbreviation#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link webmate.Abbreviation#getElement <em>Element</em>}</li>
 *   <li>{@link webmate.Abbreviation#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getAbbreviation()
 * @model
 * @generated
 */
public interface Abbreviation extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(Prefix)
	 * @see webmate.WebmatePackage#getAbbreviation_Prefix()
	 * @model containment="true"
	 * @generated
	 */
	Prefix getPrefix();

	/**
	 * Sets the value of the '{@link webmate.Abbreviation#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(Prefix value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see webmate.WebmatePackage#getAbbreviation_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference.
	 * @see #setSuffix(Suffix)
	 * @see webmate.WebmatePackage#getAbbreviation_Suffix()
	 * @model containment="true"
	 * @generated
	 */
	Suffix getSuffix();

	/**
	 * Sets the value of the '{@link webmate.Abbreviation#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(Suffix value);

} // Abbreviation
