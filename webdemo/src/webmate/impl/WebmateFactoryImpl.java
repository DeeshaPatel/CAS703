/**
 */
package webmate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webmate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebmateFactoryImpl extends EFactoryImpl implements WebmateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebmateFactory init() {
		try {
			WebmateFactory theWebmateFactory = (WebmateFactory)EPackage.Registry.INSTANCE.getEFactory(WebmatePackage.eNS_URI);
			if (theWebmateFactory != null) {
				return theWebmateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebmateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebmateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebmatePackage.STRING_INPUT: return createStringInput();
			case WebmatePackage.INPUT_SYMBOL: return createInputSymbol();
			case WebmatePackage.INPUT_WORD: return createInputWord();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringInput createStringInput() {
		StringInputImpl stringInput = new StringInputImpl();
		return stringInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSymbol createInputSymbol() {
		InputSymbolImpl inputSymbol = new InputSymbolImpl();
		return inputSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputWord createInputWord() {
		InputWordImpl inputWord = new InputWordImpl();
		return inputWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebmatePackage getWebmatePackage() {
		return (WebmatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebmatePackage getPackage() {
		return WebmatePackage.eINSTANCE;
	}

} //WebmateFactoryImpl
