package com.zunayeed.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean cond = true;
		assertEquals(1, 2);
		assertTrue(cond);
		assertFalse(cond);
		assertNotNull(cond);
		//assertArrayEquals(expected, actual);
	}

}
