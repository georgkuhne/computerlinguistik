/**
 */
package model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.Lexikon;
import model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lexikon</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LexikonTest extends TestCase {

	/**
	 * The fixture for this Lexikon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lexikon fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LexikonTest.class);
	}

	/**
	 * Constructs a new Lexikon test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexikonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Lexikon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Lexikon fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Lexikon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lexikon getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createLexikon());
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

} //LexikonTest
