package com.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
class SomeBussinessMockAnnotationTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBussinessImpl bussinessImpl;
	
	@Test
	public void testFindTheGreatestOfAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		int result = bussinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}
	
	@Test
	public void testFindTheGreatestOfAllData2() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {14});
		int result = bussinessImpl.findTheGreatestFromAllData();
		assertEquals(14, result);
	}
}


