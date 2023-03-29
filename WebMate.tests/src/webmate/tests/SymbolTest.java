/**
 */
package webmate.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webmate.Symbol;
import webmate.WebmateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymbolTest extends TestCase {

	/**
	 * The fixture for this Symbol test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symbol fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SymbolTest.class);
	}

	/**
	 * Constructs a new Symbol test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Symbol test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Symbol fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Symbol test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symbol getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebmateFactory.eINSTANCE.createSymbol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SymbolTest
