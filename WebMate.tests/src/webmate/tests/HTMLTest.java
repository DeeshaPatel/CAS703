/**
 */
package webmate.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webmate.HTML;
import webmate.WebmateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HTML</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HTMLTest extends TestCase {

	/**
	 * The fixture for this HTML test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTML fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HTMLTest.class);
	}

	/**
	 * Constructs a new HTML test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this HTML test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HTML fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this HTML test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTML getFixture() {
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
		setFixture(WebmateFactory.eINSTANCE.createHTML());
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

} //HTMLTest
