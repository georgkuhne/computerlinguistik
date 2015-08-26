/**
 */
package model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.AbleitungsRegel;
import model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ableitungs Regel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbleitungsRegelTest extends TestCase {

	/**
	 * The fixture for this Ableitungs Regel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbleitungsRegel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbleitungsRegelTest.class);
	}

	/**
	 * Constructs a new Ableitungs Regel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbleitungsRegelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ableitungs Regel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbleitungsRegel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ableitungs Regel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbleitungsRegel getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createAbleitungsRegel());
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

} //AbleitungsRegelTest
