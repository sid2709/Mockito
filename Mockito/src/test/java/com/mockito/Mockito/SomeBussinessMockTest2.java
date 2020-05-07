package com.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBussinessMockTest2 {

	@Test
	public void testFindTheGreatestOfAllData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		SomeBussinessImpl bussinessImpl = new SomeBussinessImpl(dataServiceMock);
		int result = bussinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}
	
	@Test
	public void testFindTheGreatestOfAllData2() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {14});
		SomeBussinessImpl bussinessImpl = new SomeBussinessImpl(dataServiceMock);
		int result = bussinessImpl.findTheGreatestFromAllData();
		assertEquals(14, result);
	}
}


