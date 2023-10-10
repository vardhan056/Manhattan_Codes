package com.manhattan.DBTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.manhattan.Connection.DBConnection;

public class TestDBConnection {
	
	private DBConnection dbcon;
	
	@BeforeEach
	public void setUp() {
		dbcon=new DBConnection();
	}

	@Test
	@Disabled//to make method disable for testing
	public void testGetConnection() {
		assertNotNull(dbcon.getConnection());
		
	}
	@Test
	public void testGetNumber() {
		assertThrows(NegativeNumberException.class,()->{dbcon.getNum(-1);});
		
	}
}
