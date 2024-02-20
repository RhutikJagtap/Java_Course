package delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteInfo {
	public static void deleteInfo(Connection con) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Roll No which you want to delete: ");
		int rollno = sc.nextInt();
		PreparedStatement pst = con.prepareStatement("delete from student where rollno=?");
		pst.setInt(1, rollno);
		int status = pst.executeUpdate();

		if (status == 1) {
			System.out.println("Student Information Deleted Successfully...");
		} else {
			System.out.println("Failed to Delete Information");
		}
		sc.close();
	}

}
