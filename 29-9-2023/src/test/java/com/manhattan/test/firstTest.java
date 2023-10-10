package com.manhattan.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)//to enable order
public class firstTest {
	
	@BeforeAll//it execute before all test method before all method should be static 
	public static void setUpOnce() {
		System.out.println("***From setUpOnce***");
	}
	
	@BeforeEach //once for each test method
	public static void setup() {
		System.out.println("from setup");
	}
	
	
	//by default we don't provide any running order it randomly run

	@Test // to make this method as test
	@Order(1)//to give running order
	@DisplayName("save")//in junit console it display the name save rather than the name of method 
	public void testSave() {
		//fail("Test failed!!!");// To make our method fail
		System.out.println("From my test save!");

	}
	@Test
	@Order(3)
	public void testUpdate() {
		System.out.println("From my Test update!!!");
	}
	@Test
	@Order(4)
	public void testDelete() {
		System.out.println("From my Test Delete!!!!");
	}
	@Test
	@Order(2)
	public void testFetch() {
		System.out.println("From my Test Fetch!!");
	}
	
	@AfterEach
	public static void clear() {
		System.out.println("from clear");
	}
	
	@AfterAll//it execute After all test method and after all method should be static 
	public static void clearAtOnce() {
		System.out.println("***From ClearAtOnce***");
	}

}
