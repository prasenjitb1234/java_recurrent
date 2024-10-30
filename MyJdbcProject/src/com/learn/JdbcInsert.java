package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsert {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username="root";
		String pass="12345";
		try {
			
			Connection con = DriverManager.getConnection(url,username,pass);
			
			PreparedStatement ps = con.prepareStatement("insert into table_1 values(?,?,?,?)");
			ps.setInt(1, 3);
			ps.setString(2, "Wanda");
			ps.setString(3, "Westview");
			ps.setInt(4, 21);
			
			int count = ps.executeUpdate();
			if(count > 0) {
				System.out.println("Details inserted successfully");
			}
			else {
				System.out.println("Something went wrong !");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
