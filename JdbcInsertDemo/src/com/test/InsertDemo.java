package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		// method 1 
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// method 2 
		// load & register driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
//		*****
		
		// create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","12345");
		
		// create statement
		
		PreparedStatement ps = con.prepareStatement("insert into register values('prasenjit','prasenjit@gmail.com','12345','male','satara')");
		
		int i = ps.executeUpdate();
		if(i > 0) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
	
		con.close();
		
	}
}
