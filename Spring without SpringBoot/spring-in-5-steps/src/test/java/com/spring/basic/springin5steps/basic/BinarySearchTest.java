package com.spring.basic.springin5steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.basic.springin5steps.SpringIn5StepsBasicApplication;

//Load Context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	//Get this bean from context
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() {
		//fail("Not yet implemented");
		int[] actualresult = binarySearch.binarySearch(new int[] {7,3,5}, 3);
		assertEquals(3, actualresult[0]);
		assertEquals(5, actualresult[1]);
		assertEquals(7, actualresult[2]);
		
	}

}
