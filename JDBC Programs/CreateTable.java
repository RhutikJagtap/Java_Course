//Program to create table using JDBC
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class  CreateTable{
	public static void main(String[] args) {
		try {
			// regisater the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/JDBC1";
			String username = "root";
			String password = "rj@5588";

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// create Statement
			Statement stmt = con.createStatement();

			String query = "create table student(id int primary key,name varchar(50),marks double)";

			// execute queries
			stmt.executeUpdate(query);

			System.out.println("table created Successfully");

			// close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
