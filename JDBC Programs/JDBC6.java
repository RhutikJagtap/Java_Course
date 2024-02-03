//JDBC Program to update data using preparedStatement

package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC6 {
	String url = "jdbc:mysql://localhost:3306/JDBC1";
	String username = "root";
	String password = "rj@5588";

	public String updateData(int id, String name) {

		String query = "update  student set name=? where id=?";
		try {
			// register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create Connection
			Connection con = DriverManager.getConnection(url, username, password);

			// PreparedStatement
			PreparedStatement pst = con.prepareStatement(query);
			// column_no and field
			pst.setString(1, name);
			pst.setInt(2, id);
			
			// execute query
			int count=pst.executeUpdate();
			
			//close Connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Data Updated Successfully ";
	}

	public static void main(String[] args) {
		JDBC6 jdbc6 = new JDBC6();
		String msg = jdbc6.updateData(3, "Sagar");
		System.out.println(msg);
	}

}
