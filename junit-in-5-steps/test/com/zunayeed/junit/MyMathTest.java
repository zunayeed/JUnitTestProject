package com.zunayeed.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
 // MyMath.sum
	// 1,2,3 => 6
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Beforeclass");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("Beforeclass");
	}
	@Test
	void sum_with_3Numbers() {
		System.out.println("Test1");
		// fail("Not yet implemented");
		assertEquals(7, myMath.sum(new int[] {1,2,4}));
		
	}
	
	@Test
	void sum_with_1Numbers() {
		System.out.println("Test2");
		// fail("Not yet implemented");
		assertEquals(4, myMath.sum(new int[] {4}));
			
	}

}
