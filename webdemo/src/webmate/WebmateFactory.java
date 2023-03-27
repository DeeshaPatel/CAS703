/**
 */
package webmate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see webmate.WebmatePackage
 * @generated
 */
public interface WebmateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebmateFactory eINSTANCE = webmate.impl.WebmateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>String Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Input</em>'.
	 * @generated
	 */
	StringInput createStringInput();

	/**
	 * Returns a new object of class '<em>Input Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Symbol</em>'.
	 * @generated
	 */
	InputSymbol createInputSymbol();

	/**
	 * Returns a new object of class '<em>Input Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Word</em>'.
	 * @generated
	 */
	InputWord createInputWord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebmatePackage getWebmatePackage();

} //WebmateFactory
