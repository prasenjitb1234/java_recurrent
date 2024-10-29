package com.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username="root";
		String password="12345";
		
		try {
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps = con.prepareStatement("select * from student");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
//				method 1st to write 
//				System.out.println("Name : "+ rs.getString("name"));
//				***
				
//				method 2nd to write 
				String name1=rs.getString("name");
				System.out.println("Name: "+ name1);
				
				String email1 = rs.getString("email");
				System.out.println("Email: "+ email1);
				
				String pass1 = rs.getString("password");
				System.out.println("Password: "+ pass1);
				
				String gender1 = rs.getString("gender");
				System.out.println("Gender: "+ gender1);
				
				String city1 = rs.getString("city");
				System.out.println("City: "+ city1);
				
				System.out.println("--------------------------------------");
				
			}
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
