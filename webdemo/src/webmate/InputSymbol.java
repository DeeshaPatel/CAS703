/**
 */
package webmate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.InputSymbol#getSym <em>Sym</em>}</li>
 *   <li>{@link webmate.InputSymbol#getInputword <em>Inputword</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getInputSymbol()
 * @model
 * @generated
 */
public interface InputSymbol extends EObject {
	/**
	 * Returns the value of the '<em><b>Sym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sym</em>' attribute.
	 * @see #setSym(String)
	 * @see webmate.WebmatePackage#getInputSymbol_Sym()
	 * @model
	 * @generated
	 */
	String getSym();

	/**
	 * Sets the value of the '{@link webmate.InputSymbol#getSym <em>Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sym</em>' attribute.
	 * @see #getSym()
	 * @generated
	 */
	void setSym(String value);

	/**
	 * Returns the value of the '<em><b>Inputword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputword</em>' containment reference.
	 * @see #setInputword(InputWord)
	 * @see webmate.WebmatePackage#getInputSymbol_Inputword()
	 * @model containment="true"
	 * @generated
	 */
	InputWord getInputword();

	/**
	 * Sets the value of the '{@link webmate.InputSymbol#getInputword <em>Inputword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputword</em>' containment reference.
	 * @see #getInputword()
	 * @generated
	 */
	void setInputword(InputWord value);

} // InputSymbol
