//JDBC Program to insert data using preparedStatement
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC5 {

	String url = "jdbc:mysql://localhost:3306/JDBC1";
	String username = "root";
	String password = "rj@5588";

	public String insertData(int id, String name, double mark) {
		// insert query
		String query = "insert into student values(?,?,?)";
		try {
			// register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// PreparedStatement
			PreparedStatement pst = con.prepareStatement(query);
                        //column_no and field
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setDouble(3, mark);

			// execute query
			int count = pst.executeUpdate();

			// close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Data inserted Successfully";
	}

	// main method
	public static void main(String[] args) {
		JDBC5 jdbc5 = new JDBC5();
		String msg = jdbc5.insertData(3, "Amoal", 78.98);
		System.out.println(msg);
	}

}
