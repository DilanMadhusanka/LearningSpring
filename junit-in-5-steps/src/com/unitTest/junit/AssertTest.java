package com.unitTest.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		/*assertEquals(1, 2);
		boolean cond = true;
		assertEquals(false, cond);*/
		
		assertTrue(2<3);
		assertFalse(4>3);
	}

}
