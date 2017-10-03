/**
 * 
 */
package org.escoladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw21752927
 *
 */
public class EscalenoTest {
	
	private static Escaleno escaleno;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		escaleno = new Escaleno(4,2,3);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		escaleno = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Escaleno#perimeter()}.
	 */
	@Test
	public void testPerimeter() {
		assertEquals(9, escaleno.perimeter(), 1.0e-4);
	}
	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Triangle#area()}.
	 */
	@Test
	public void testArea() {
		assertEquals(2.9047, escaleno.area(), 1.0e-4);
	}

}
