package com.manhattan.test;



import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class AssertionEx {

	@Test 
	public void testSave() {
		String expected ="hello";
		String actual="hello";
//		if(expected != actual)
//			fail("not matched");
		
		// we can use assert equals or fail
		
		assertEquals(expected, actual,"May be not matched test fail");//method to check expected and actual result are equal or not
		System.out.println("From my test save!");

	}
	@Test
	public void testBoolean() {
		boolean b=true;
		assertTrue(b);//checks for boolean values true pass false fail
	}
	
	@Test
	public void testArray() {
		int exp[]= {10,20,30};
		int act[]= {10,20,30};
		assertArrayEquals(exp, act,"array elements not matching ");
	}
}
