/**
 */
package webmate.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webmate.Abbreviation;
import webmate.WebmateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abbreviation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbbreviationTest extends TestCase {

	/**
	 * The fixture for this Abbreviation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Abbreviation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbbreviationTest.class);
	}

	/**
	 * Constructs a new Abbreviation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbbreviationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abbreviation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Abbreviation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abbreviation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Abbreviation getFixture() {
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
		setFixture(WebmateFactory.eINSTANCE.createAbbreviation());
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

} //AbbreviationTest
