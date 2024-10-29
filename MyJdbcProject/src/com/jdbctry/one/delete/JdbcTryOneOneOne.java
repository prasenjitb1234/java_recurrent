package com.jdbctry.one.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcTryOneOneOne {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username="root";
		String pass="12345";
		
		
		try {
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement ps = con.prepareStatement("Delete from random_desc where name = ? ");
			
			ps.setString(1, "steve");
			
			int count = ps.executeUpdate();
			
			if(count > 0) {
				System.out.println("Deleted Successfully");
			}
			else {
				System.out.println("Deletion Failed");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
