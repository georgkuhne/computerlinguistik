/**
 */
package model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.FStruktur;
import model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FStruktur</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FStrukturTest extends TestCase {

	/**
	 * The fixture for this FStruktur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FStruktur fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FStrukturTest.class);
	}

	/**
	 * Constructs a new FStruktur test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FStrukturTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this FStruktur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FStruktur fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this FStruktur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FStruktur getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createFStruktur());
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

} //FStrukturTest
