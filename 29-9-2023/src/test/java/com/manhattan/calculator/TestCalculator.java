package com.manhattan.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.manhattan.Calculator.serviceCalculator;

public class TestCalculator {
	private static serviceCalculator c;
	private int expected;
	@BeforeAll
	public static void setUp() {
		c =new serviceCalculator();
	}
	
	@Test
	public void Testadd() {
		int expected=30;
		int actual=c.add(10,20);
		assertEquals(expected, actual,"values not matched");
	}
	
	@Test
	public void TestMul() {
		int expected=30;
		int actual=c.mul(10,3);
		assertEquals(expected, actual,"values not matched");
	}
	
	@AfterAll
	public static void setClear() {
		c=null;
	}

	
}
