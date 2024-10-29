package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo3 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username = "root";
		String password = "12345";
		
		try {
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps = con.prepareStatement("Insert into register values(?,?,?,?,?)");
			
			ps.setString(1, "tony");
			ps.setString(2, "tony@gmail.com");
			ps.setString(3, "12345");
			ps.setString(4, "male");
			ps.setString(5, "chicago");
			
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println("success");
			}
			else {
				System.out.println("fail");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
