/**
 */
package model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.Grammatik;
import model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grammatik</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrammatikTest extends TestCase {

	/**
	 * The fixture for this Grammatik test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grammatik fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GrammatikTest.class);
	}

	/**
	 * Constructs a new Grammatik test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammatikTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Grammatik test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Grammatik fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Grammatik test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grammatik getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createGrammatik());
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

} //GrammatikTest
