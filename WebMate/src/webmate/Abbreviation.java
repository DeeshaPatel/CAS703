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
 *   <li>{@link webmate.Abbreviation#getIds <em>Ids</em>}</li>
 *   <li>{@link webmate.Abbreviation#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link webmate.Abbreviation#getTags <em>Tags</em>}</li>
 *   <li>{@link webmate.Abbreviation#getClasses <em>Classes</em>}</li>
 *   <li>{@link webmate.Abbreviation#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link webmate.Abbreviation#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link webmate.Abbreviation#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getAbbreviation()
 * @model
 * @generated
 */
public interface Abbreviation extends EObject {
	/**
	 * Returns the value of the '<em><b>Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' containment reference.
	 * @see #setIds(ID)
	 * @see webmate.WebmatePackage#getAbbreviation_Ids()
	 * @model containment="true"
	 * @generated
	 */
	ID getIds();

	/**
	 * Sets the value of the '{@link webmate.Abbreviation#getIds <em>Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ids</em>' containment reference.
	 * @see #getIds()
	 * @generated
	 */
	void setIds(ID value);

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Symbol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference list.
	 * @see webmate.WebmatePackage#getAbbreviation_Symbols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symbol> getSymbols();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see webmate.WebmatePackage#getAbbreviation_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see webmate.WebmatePackage#getAbbreviation_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<webmate.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see webmate.WebmatePackage#getAbbreviation_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' reference list.
	 * The list contents are of type {@link webmate.Abbreviation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' reference list.
	 * @see webmate.WebmatePackage#getAbbreviation_Abbreviation()
	 * @model
	 * @generated
	 */
	EList<Abbreviation> getAbbreviation();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see webmate.WebmatePackage#getAbbreviation_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

} // Abbreviation
