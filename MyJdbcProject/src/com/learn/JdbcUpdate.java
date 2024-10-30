package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUpdate {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","12345");
			
			PreparedStatement ps = con.prepareStatement("Update table_1 set city = ? where name = ? ");
			
			ps.setString(1, "Chicago");
			ps.setString(2, "prasenjit");
			
			int count = ps.executeUpdate();
			if(count > 0) {
				System.out.println("Data Successfully Updated");
			}
			else {
				System.out.println("Data Updation Failed");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
