/**
 */
package model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.LexikonEintrag;
import model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lexikon Eintrag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LexikonEintragTest extends TestCase {

	/**
	 * The fixture for this Lexikon Eintrag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexikonEintrag fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LexikonEintragTest.class);
	}

	/**
	 * Constructs a new Lexikon Eintrag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexikonEintragTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Lexikon Eintrag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LexikonEintrag fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Lexikon Eintrag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexikonEintrag getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createLexikonEintrag());
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

} //LexikonEintragTest
