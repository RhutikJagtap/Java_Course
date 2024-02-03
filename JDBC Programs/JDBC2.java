//JDBC Program to Update data in table
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC2 {

	String url = "jdbc:mysql://localhost:3306/JDBC1";
	String username = "root";
	String password = "rj@5588";

	public String updateData() {

		// update query
		String query = "update  student set name='Kunal' where id=1";  // single quote must 'kunal'

		try {
			// regisater the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// create Statement
			Statement st = con.createStatement();

                        // execute query
			st.executeUpdate(query);

			// close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "data updated Successfully";
	}

	public static void main(String[] args) {
		JDBC2 jdbc2 = new JDBC2();
		String msg = jdbc2.updateData();
		System.out.println(msg);
	}

}
