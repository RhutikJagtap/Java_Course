//JDBC Program to Retrieve data from database
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC5 {
	String url = "jdbc:mysql://localhost:3306/JDBC1";
	String username = "root";
	String password = "rj@5588";

	public void fetchData() {
		// query for fetch all data from table
		String query = "select * from student";

		try {
			// register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// create Statement
			Statement st = con.createStatement();

			// execute query
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double marks = rs.getDouble("marks");

				System.out.println("Student id : " + id);
				System.out.println("Student name : " + name);
				System.out.println("Student mark : " + marks);
				System.out.println("=====================");
			}

			// close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//main method
	public static void main(String[] args) {
		JDBC5 j = new JDBC5();
		j.fetchData();
	}

}
