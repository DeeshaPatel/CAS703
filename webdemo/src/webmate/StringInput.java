/**
 */
package webmate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.StringInput#getInput <em>Input</em>}</li>
 *   <li>{@link webmate.StringInput#getInputword <em>Inputword</em>}</li>
 *   <li>{@link webmate.StringInput#getStringinput <em>Stringinput</em>}</li>
 *   <li>{@link webmate.StringInput#getInputsymbol <em>Inputsymbol</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getStringInput()
 * @model
 * @generated
 */
public interface StringInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see webmate.WebmatePackage#getStringInput_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link webmate.StringInput#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Inputword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputword</em>' containment reference.
	 * @see #setInputword(InputWord)
	 * @see webmate.WebmatePackage#getStringInput_Inputword()
	 * @model containment="true"
	 * @generated
	 */
	InputWord getInputword();

	/**
	 * Sets the value of the '{@link webmate.StringInput#getInputword <em>Inputword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputword</em>' containment reference.
	 * @see #getInputword()
	 * @generated
	 */
	void setInputword(InputWord value);

	/**
	 * Returns the value of the '<em><b>Stringinput</b></em>' containment reference list.
	 * The list contents are of type {@link webmate.StringInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringinput</em>' containment reference list.
	 * @see webmate.WebmatePackage#getStringInput_Stringinput()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringInput> getStringinput();

	/**
	 * Returns the value of the '<em><b>Inputsymbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputsymbol</em>' containment reference.
	 * @see #setInputsymbol(InputSymbol)
	 * @see webmate.WebmatePackage#getStringInput_Inputsymbol()
	 * @model containment="true"
	 * @generated
	 */
	InputSymbol getInputsymbol();

	/**
	 * Sets the value of the '{@link webmate.StringInput#getInputsymbol <em>Inputsymbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputsymbol</em>' containment reference.
	 * @see #getInputsymbol()
	 * @generated
	 */
	void setInputsymbol(InputSymbol value);

} // StringInput
