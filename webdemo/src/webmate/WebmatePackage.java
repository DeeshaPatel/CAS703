/**
 */
package webmate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webmate.WebmateFactory
 * @model kind="package"
 * @generated
 */
public interface WebmatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webmate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse/webmate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eclipse.webmate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebmatePackage eINSTANCE = webmate.impl.WebmatePackageImpl.init();

	/**
	 * The meta object id for the '{@link webmate.impl.StringInputImpl <em>String Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.StringInputImpl
	 * @see webmate.impl.WebmatePackageImpl#getStringInput()
	 * @generated
	 */
	int STRING_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INPUT__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Inputword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INPUT__INPUTWORD = 1;

	/**
	 * The feature id for the '<em><b>Stringinput</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INPUT__STRINGINPUT = 2;

	/**
	 * The feature id for the '<em><b>Inputsymbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INPUT__INPUTSYMBOL = 3;

	/**
	 * The number of structural features of the '<em>String Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>String Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.InputSymbolImpl <em>Input Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.InputSymbolImpl
	 * @see webmate.impl.WebmatePackageImpl#getInputSymbol()
	 * @generated
	 */
	int INPUT_SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Sym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYMBOL__SYM = 0;

	/**
	 * The feature id for the '<em><b>Inputword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYMBOL__INPUTWORD = 1;

	/**
	 * The number of structural features of the '<em>Input Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYMBOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webmate.impl.InputWordImpl <em>Input Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webmate.impl.InputWordImpl
	 * @see webmate.impl.WebmatePackageImpl#getInputWord()
	 * @generated
	 */
	int INPUT_WORD = 2;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORD__WORD = 0;

	/**
	 * The feature id for the '<em><b>Inputsymbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORD__INPUTSYMBOL = 1;

	/**
	 * The number of structural features of the '<em>Input Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link webmate.StringInput <em>String Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Input</em>'.
	 * @see webmate.StringInput
	 * @generated
	 */
	EClass getStringInput();

	/**
	 * Returns the meta object for the attribute '{@link webmate.StringInput#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see webmate.StringInput#getInput()
	 * @see #getStringInput()
	 * @generated
	 */
	EAttribute getStringInput_Input();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.StringInput#getInputword <em>Inputword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputword</em>'.
	 * @see webmate.StringInput#getInputword()
	 * @see #getStringInput()
	 * @generated
	 */
	EReference getStringInput_Inputword();

	/**
	 * Returns the meta object for the containment reference list '{@link webmate.StringInput#getStringinput <em>Stringinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stringinput</em>'.
	 * @see webmate.StringInput#getStringinput()
	 * @see #getStringInput()
	 * @generated
	 */
	EReference getStringInput_Stringinput();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.StringInput#getInputsymbol <em>Inputsymbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputsymbol</em>'.
	 * @see webmate.StringInput#getInputsymbol()
	 * @see #getStringInput()
	 * @generated
	 */
	EReference getStringInput_Inputsymbol();

	/**
	 * Returns the meta object for class '{@link webmate.InputSymbol <em>Input Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Symbol</em>'.
	 * @see webmate.InputSymbol
	 * @generated
	 */
	EClass getInputSymbol();

	/**
	 * Returns the meta object for the attribute '{@link webmate.InputSymbol#getSym <em>Sym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sym</em>'.
	 * @see webmate.InputSymbol#getSym()
	 * @see #getInputSymbol()
	 * @generated
	 */
	EAttribute getInputSymbol_Sym();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.InputSymbol#getInputword <em>Inputword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputword</em>'.
	 * @see webmate.InputSymbol#getInputword()
	 * @see #getInputSymbol()
	 * @generated
	 */
	EReference getInputSymbol_Inputword();

	/**
	 * Returns the meta object for class '{@link webmate.InputWord <em>Input Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Word</em>'.
	 * @see webmate.InputWord
	 * @generated
	 */
	EClass getInputWord();

	/**
	 * Returns the meta object for the attribute '{@link webmate.InputWord#getWord <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word</em>'.
	 * @see webmate.InputWord#getWord()
	 * @see #getInputWord()
	 * @generated
	 */
	EAttribute getInputWord_Word();

	/**
	 * Returns the meta object for the containment reference '{@link webmate.InputWord#getInputsymbol <em>Inputsymbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputsymbol</em>'.
	 * @see webmate.InputWord#getInputsymbol()
	 * @see #getInputWord()
	 * @generated
	 */
	EReference getInputWord_Inputsymbol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebmateFactory getWebmateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webmate.impl.StringInputImpl <em>String Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.StringInputImpl
		 * @see webmate.impl.WebmatePackageImpl#getStringInput()
		 * @generated
		 */
		EClass STRING_INPUT = eINSTANCE.getStringInput();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_INPUT__INPUT = eINSTANCE.getStringInput_Input();

		/**
		 * The meta object literal for the '<em><b>Inputword</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_INPUT__INPUTWORD = eINSTANCE.getStringInput_Inputword();

		/**
		 * The meta object literal for the '<em><b>Stringinput</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_INPUT__STRINGINPUT = eINSTANCE.getStringInput_Stringinput();

		/**
		 * The meta object literal for the '<em><b>Inputsymbol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_INPUT__INPUTSYMBOL = eINSTANCE.getStringInput_Inputsymbol();

		/**
		 * The meta object literal for the '{@link webmate.impl.InputSymbolImpl <em>Input Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.InputSymbolImpl
		 * @see webmate.impl.WebmatePackageImpl#getInputSymbol()
		 * @generated
		 */
		EClass INPUT_SYMBOL = eINSTANCE.getInputSymbol();

		/**
		 * The meta object literal for the '<em><b>Sym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SYMBOL__SYM = eINSTANCE.getInputSymbol_Sym();

		/**
		 * The meta object literal for the '<em><b>Inputword</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SYMBOL__INPUTWORD = eINSTANCE.getInputSymbol_Inputword();

		/**
		 * The meta object literal for the '{@link webmate.impl.InputWordImpl <em>Input Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webmate.impl.InputWordImpl
		 * @see webmate.impl.WebmatePackageImpl#getInputWord()
		 * @generated
		 */
		EClass INPUT_WORD = eINSTANCE.getInputWord();

		/**
		 * The meta object literal for the '<em><b>Word</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_WORD__WORD = eINSTANCE.getInputWord_Word();

		/**
		 * The meta object literal for the '<em><b>Inputsymbol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_WORD__INPUTSYMBOL = eINSTANCE.getInputWord_Inputsymbol();

	}

} //WebmatePackage
