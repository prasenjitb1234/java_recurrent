package com.jdbctry.one.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTryOneOneOneOne {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username= "root";
		String pass="12345";
		
		try {
			Connection con = DriverManager.getConnection(url,username,pass);
			
			PreparedStatement ps = con.prepareStatement("select * from random_desc");
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				String name1=rs.getString("name");
				System.out.println("Name: "+ name1);
				
				String city1 = rs.getString("city");
				System.out.println("City: "+city1);
				
				int age1 = rs.getInt("age");
				System.out.println("Age: " +age1);
				
				System.out.println("--------------------------------------");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
