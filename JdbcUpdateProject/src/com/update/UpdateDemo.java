package com.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username = "root";
		String password = "12345";
		
		
			String city1 = "pune";
			String email1= "tony@gmail.com";
		
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps = con.prepareStatement("update student set city = ? where email =? ");
			
			ps.setString(1, city1);
			ps.setString(2, email1);
			
			int count  = ps.executeUpdate();
			if(count > 0) {
				System.out.println("Updated successfully");
			}
			else {
				System.out.println("updation falied");
			}
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
