package com.jdbctry.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcTryone {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/jdbc_db";
		String username="root";
		String pass="12345";
		try {
			
			Connection con = DriverManager.getConnection(url,username,pass);
			
			PreparedStatement ps = con.prepareStatement("insert into random_desc values(?,?,?)");
			
			ps.setString(1, "shinchan");
			ps.setString(2, "kasukabe");
			ps.setInt(3, 21);
			
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println("successfully Inserted data");
			}else {
				System.out.println("Data Insertion failed");
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
