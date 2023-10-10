package com.manhattan.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class NegativeNumberException extends RuntimeException{
	public NegativeNumberException() {
		super();
	}
}
public class DBConnection {
	
	public Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manhattan","root","*gudiya*");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	public void getNum(int a) {
		if(a<0) {
			throw new NegativeNumberException();
		}
	}

}
