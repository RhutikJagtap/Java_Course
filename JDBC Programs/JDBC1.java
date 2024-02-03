//JDBC  Program to insert data into tables
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC1{

	String url = "jdbc:mysql://localhost:3306/JDBC1";
	String username = "root";
	String password = "rj@5588";

	public String insertData() {

		// insert query
		String query = "insert into student values(1,'Rhutik',88.65)";  // single quote must for 'Rhutik'

		try {
			// regisater the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// create Statement
			Statement st = con.createStatement();

			// execute queries
			st.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "data inserted Successfully";
	}

	public static void main(String[] args) {
		JDBC1 jdbc1 = new JDBC1();
		String msg = jdbc1.insertData();

		System.out.println(msg);
	}

}
