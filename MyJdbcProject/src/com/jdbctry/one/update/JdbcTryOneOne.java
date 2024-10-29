package com.jdbctry.one.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcTryOneOne {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username=  "root";
		String pass="12345";
		try {
			
			Connection con = DriverManager.getConnection(url,username,pass);
			
			PreparedStatement ps = con.prepareStatement("update random_desc set name = ? where city = ?");
			
			ps.setString(1, "prasenjit");
			ps.setString(2, "satara");
			
			int count = ps.executeUpdate();
			if(count > 0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("Updation failed ");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
