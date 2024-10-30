package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcSelect {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","12345");
			
			PreparedStatement ps = con.prepareStatement("Select * from table_1 ");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String name1 = rs.getString("name");
				System.out.println("Name: "+name1);
				
				String city1 = rs.getString("city");
				System.out.println("City: "+city1);
				
				int age1 = rs.getInt("age");
				System.out.println("Age: "+age1);
				
				System.out.println("--------------------------------------");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
