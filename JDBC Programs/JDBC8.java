//JDBC Program to retrive/fetch data using preparedStatement
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBC8 {
	String url = "jdbc:mysql://localhost:3306/JDBC1";
	String username = "root";
	String password = "rj@5588";

	public String fetchData() {

		// query for fetch all data from table
		String query = "select * from  student";
		try {
			// register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// PreparedStatement
			PreparedStatement pst = con.prepareStatement(query);

			// execute query
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double mark = rs.getDouble(3);

				System.out.println("Student id : " + id);
				System.out.println("Student name : " + name);
				System.out.println("Student mark : " + mark);
				System.out.println("=====================");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Data fetch Successfully";
	}

	public static void main(String[] args) {
		JDBC8 jdbc8 = new JDBC8();
		String msg = jdbc8.fetchData();
		System.out.println(msg);
	}

}
