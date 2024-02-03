//JDBC program to delete data using preparedStatement

package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC7 {
	String url = "jdbc:mysql://localhost:3306/JDBC1";
	String username = "root";
	String password = "rj@5588";

	public String deleteData(int id) {
		// delete query
		String query = "delete from  student where id=?";
		try {
			// register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// PreparedStatement
			PreparedStatement pst = con.prepareStatement(query);
			// column_no and field
			pst.setInt(1, id);

			// execute query
			int count = pst.executeUpdate();

			// close Connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Data deleted Successfully";
	}

	// main method
	public static void main(String[] args) {
		JDBC7 jdbc7 = new JDBC7();
		String msg = jdbc7.deleteData(3);
		System.out.println(msg);
	}
}
