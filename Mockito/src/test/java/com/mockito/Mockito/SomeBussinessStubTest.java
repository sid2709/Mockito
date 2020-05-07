package com.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBussinessStubTest {

	@Test
	public void testFindTheGreatestOfAllData() {
		SomeBussinessImpl bussinessImpl = new SomeBussinessImpl(new DataServiceStub());
		int result = bussinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}
}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24, 6, 15};
	}
	
}
