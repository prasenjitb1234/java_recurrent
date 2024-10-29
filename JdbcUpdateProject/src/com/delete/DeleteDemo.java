package com.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username ="root";
		String password = "12345";
		
		try {
			String email1 = "tony@gmail.com";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps = con.prepareStatement("delete from student where email = ?");
			ps.setString(1, email1);
			
			int count = ps.executeUpdate();
			
			if(count > 0) {
				System.out.println("Deletion sucess");
			}
			else {
				System.out.println("Deletion failed");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
