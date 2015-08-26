/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.Nichterminal;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nichterminal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NichterminalTest extends TerminalNichtTerminalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NichterminalTest.class);
	}

	/**
	 * Constructs a new Nichterminal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NichterminalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nichterminal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Nichterminal getFixture() {
		return (Nichterminal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createNichterminal());
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

} //NichterminalTest
