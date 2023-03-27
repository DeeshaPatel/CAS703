/**
 */
package webmate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.InputWord#getWord <em>Word</em>}</li>
 *   <li>{@link webmate.InputWord#getInputsymbol <em>Inputsymbol</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getInputWord()
 * @model
 * @generated
 */
public interface InputWord extends EObject {
	/**
	 * Returns the value of the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word</em>' attribute.
	 * @see #setWord(String)
	 * @see webmate.WebmatePackage#getInputWord_Word()
	 * @model
	 * @generated
	 */
	String getWord();

	/**
	 * Sets the value of the '{@link webmate.InputWord#getWord <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word</em>' attribute.
	 * @see #getWord()
	 * @generated
	 */
	void setWord(String value);

	/**
	 * Returns the value of the '<em><b>Inputsymbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputsymbol</em>' containment reference.
	 * @see #setInputsymbol(InputSymbol)
	 * @see webmate.WebmatePackage#getInputWord_Inputsymbol()
	 * @model containment="true"
	 * @generated
	 */
	InputSymbol getInputsymbol();

	/**
	 * Sets the value of the '{@link webmate.InputWord#getInputsymbol <em>Inputsymbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputsymbol</em>' containment reference.
	 * @see #getInputsymbol()
	 * @generated
	 */
	void setInputsymbol(InputSymbol value);

} // InputWord
