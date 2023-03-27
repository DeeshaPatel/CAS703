/**
 */
package webmate.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webmate.Emmet;
import webmate.WebmateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Emmet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmmetTest extends TestCase {

	/**
	 * The fixture for this Emmet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Emmet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmmetTest.class);
	}

	/**
	 * Constructs a new Emmet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmmetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Emmet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Emmet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Emmet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Emmet getFixture() {
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
		setFixture(WebmateFactory.eINSTANCE.createEmmet());
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

} //EmmetTest
