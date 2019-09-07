package com.unitTest.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Test
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Test
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Test
	public void sum_with3numebrs() {
		
		//check that result is 6
		//check result==6
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
		
		//System.out.println(result);
	}
	
	@Test
	public void sum_with1numebrs() {
		
		//check that result is 3
		//check result==3
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));
		
		//System.out.println(result);
	}
	
	
//	void test() {
//		fail("Not yet implemented");
//	}

}
