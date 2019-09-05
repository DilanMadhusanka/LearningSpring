package com.spring.basic.springin5steps.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.basic.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	//create Mock
	@Mock
	SomeCdiDao daoMock;
	
	//inject Mock
	@InjectMocks
	SomeCdiBusiness business;
	
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		assertEquals(4, business.findGreatest());
		
	}
	
	@Test
	public void testBasicScenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
		
	}
	
	@Test
	public void testBasicScenario_EqualElelments() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
		assertEquals(2, business.findGreatest());
		
	}

}
