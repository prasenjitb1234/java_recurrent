package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDelete {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","12345");
			
			PreparedStatement ps = con.prepareStatement("Delete from table_1 where id = ? ");
			ps.setInt(1, 3);
			int count = ps.executeUpdate();
			
			if(count >0) {
				System.out.println("Record Deleted Successfully! ");
			}
			else {
				System.out.println("Record Deletion Failed !! ");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
