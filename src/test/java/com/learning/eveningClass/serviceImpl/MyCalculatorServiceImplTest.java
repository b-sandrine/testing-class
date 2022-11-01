package com.learning.eveningClass.serviceImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class MyCalculatorServiceImplTest {

	MyCalculatorServiceImpl service =  new MyCalculatorServiceImpl();
	
	
	/*
	 * Tests for a addition function
	 * 
	 * 	
	 */
	@Test
	public void add_success() {
		assertEquals(12, service.add(new int[] {1,2,3,6}));
	}
	@Test
	public void add_empty() {
		assertEquals(0, service.add(new int[] {}));
	}
	@Test
	public void add_oneValue() {
		assertEquals(3, service.add(new int[] {3}));
	}
	
	/*
	 * Tests for a subtraction function
	 * 
	 * 	
	 */
	@Test
	public void subtract_success() {
		assertEquals(8, service.subtract(16, 8));
	}
	@Test
	public void subtract_zero() {
		assertEquals(5,service.subtract(5, 0));
	}
	@Test
	public void subtract_failure() {
		assertNotEquals(8, service.subtract(7, 3));
	}
	
/*
 * Tests for a multiplication function
 * 
 * 	
 */
	@Test
	public void multiply_success () {
		assertEquals(6, service.multiply(new int[] {2,3}));
	}
	
	/*
	 * Tests for a division function
	 * 
	 * 	
	 */
	@Test
	public void divide_success () {
		assertEquals(3, service.divide(6, 2));
	}
	
	
	@Test
	public void divide_zero() {
		int expected = 0;
		assertEquals(expected, service.divide(0, 10));
	}
}
