/**
 */
package webmate.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webmate.Suffix;
import webmate.WebmateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Suffix</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuffixTest extends TestCase {

	/**
	 * The fixture for this Suffix test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Suffix fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuffixTest.class);
	}

	/**
	 * Constructs a new Suffix test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuffixTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Suffix test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Suffix fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Suffix test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Suffix getFixture() {
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
		setFixture(WebmateFactory.eINSTANCE.createSuffix());
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

} //SuffixTest
