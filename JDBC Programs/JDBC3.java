//JDBC Program to Delete data from tables

package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC3 {

	String url = "jdbc:mysql://localhost:3306/JDBC1";
	String username = "root";
	String password = "rj@5588";

	public String deleteData() {

		// delete query
		String query = "delete from student where id=2";

		try {
			// register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// create Statement
			Statement st = con.createStatement();

			// execute queries
			st.executeUpdate(query);

                        // close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "data deleted Succesfully";
	}

        //main method
	public static void main(String[] args) {
		JDBC3 jdbc3 = new JDBC3();
		String msg = jdbc3.deleteData();
		System.out.println(msg);
	}

}
