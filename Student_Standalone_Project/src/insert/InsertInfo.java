package insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertInfo {
	public static void insertInfo(Connection con) throws SQLException {
		Scanner sc = new Scanner(System.in);
		PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?)");

		System.out.println("Enter the Roll Number of the Student :");
		int rollno = sc.nextInt();

		System.out.println("Enter the First Name of the Student :");
		String fname = sc.next();

		System.out.println("Enter the Last Name of the Student :");
		String lname = sc.next();

		System.out.println("Enter the Contact Number of the Student :");
		long contact = sc.nextLong();

		System.out.println("Enter the City of the Student :");
		String city = sc.next();

		pst.setInt(1, rollno);
		pst.setString(2, fname);
		pst.setString(3, lname);
		pst.setLong(4, contact);
		pst.setString(5, city);
		int status = pst.executeUpdate();

		if (status == 1) {
			System.out.println("Student Information Successfully Inserted...");
		} else {
			System.out.println("Failed to Inserted Information");
		}
		sc.close();
	}

}
