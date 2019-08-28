package com.example.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void testFindTheGratestFormAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGratestFormAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24,6,15};
	}
	
}