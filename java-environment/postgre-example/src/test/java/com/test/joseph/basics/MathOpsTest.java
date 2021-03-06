package com.test.joseph.basics;

import org.junit.Test;

/*
 * Static imports allow you to import static methods into your code
 * without importing other methods/information from a particular class
 */
import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.joseph.testing.MathOps;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class MathOpsTest {
	
	public static Logger log = LogManager.getLogger(MathOpsTest.class);
	
	public MathOps ops;
	
	/*
	 * Test File and Annotation Order of Operations:
	 * 1 - Test Will be loaded into JUnit
	 * 	1.1 - some other work goes on in the background here
	 * 2 - @BeforeClass method will execute
	 * 	- @BeforeClass method is used for general setup across all tests
	 * 3 - Create an Instance of your Test class (object)
	 * 4 - Invoke the @Before annotated method
	 * 	- @Before used to run some local setup before EVERY test
	 * 5 - Invoke the @Test method (the first one found looking from top-bottom)
	 * 6 - Invoke the @After method upon each test's completion.
	 * 7 - After all tests complete, @AfterClass method will execute
	 */
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before test");
		ops = new MathOps();
	}
	
	@After
	public void tearDown() {
		System.out.println("After test");
	}
	
	@Test
	public void testAdd_1() {
		log.debug("Testing Add Function");
		int result = ops.add(1,2);
		assertTrue(result == 3);
	}
	
	@Test
	public void testAdd_2() {
		log.debug("Testing Add Function");
		int result = ops.add(5,5);
		assertTrue(result == 10);
	}
	
	@Test
	public void testSubtract_1() {
		log.debug("Testing Subtraction Function");
		int result = ops.subtract(5,5);
		assertTrue(result == 0);
	}
	
	@Test
	public void testSubtract_2() {
		log.debug("Testing Subtraction Function");
		int result = ops.subtract(3,7);
		assertTrue(result == -4);
	}
	
	// we can provide a value to our @Test annotation to expect a certain outcome.
	// This is useful when our tests are configured to fail due to exceptions
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		System.out.println("This tests dividing by 0. This will result in an Arithmetic Exception");
		ops.divide(1, 0);
	}
}
