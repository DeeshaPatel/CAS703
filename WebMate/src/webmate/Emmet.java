/**
 */
package webmate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emmet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.Emmet#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getEmmet()
 * @model
 * @generated
 */
public interface Emmet extends EObject {
	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.Abbreviation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' containment reference list.
	 * @see webmate.WebmatePackage#getEmmet_Abbreviation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Abbreviation> getAbbreviation();

} // Emmet
