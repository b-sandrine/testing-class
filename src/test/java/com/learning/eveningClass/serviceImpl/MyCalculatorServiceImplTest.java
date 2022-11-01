package com.learning.eveningClass.serviceImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class MyCalculatorServiceImplTest {

	MyCalculatorServiceImpl service =  new MyCalculatorServiceImpl();
	
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
	@Test
	public void multiply_success () {
		assertEquals(6, service.multiply(new int[] {2,3}));
	}
}
