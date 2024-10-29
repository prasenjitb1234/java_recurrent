package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo2 {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String password = "12345";

		try {

			Connection con = DriverManager.getConnection(url, user, password);

//			PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES ('alex', 'alex@example.com', 'mypassword', 'female', 'newyork')");

			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");

			// ------ user values ----
			ps.setString(1, "peter");
			ps.setString(2, "peter@gmail.com");
			ps.setString(3, "12345");
			ps.setString(4, "male");
			ps.setString(5, "New York");

			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("success");
			} else {
				System.out.println("fail");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
