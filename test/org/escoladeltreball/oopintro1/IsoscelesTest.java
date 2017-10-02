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
public class IsoscelesTest {
	
	private static Isosceles iso;

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
		iso = new Isosceles(5,2);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		iso = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Isosceles#perimeter()}.
	 */
	@Test
	public void testPerimeter() {
		assertEquals(11, iso.perimeter(), 1.0e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Triangle#area()}.
	 */
	@Test
	public void testArea() {
		assertEquals(5, iso.area(), 1.0e-4);
	}

}
