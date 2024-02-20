package client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import delete.DeleteInfo;
import display.DisplayInfo;
import insert.InsertInfo;
import update.UpdateInfo;

public class Client {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:mysql://localhost:3306/student_db";
		String username = "root";
		String password = "rj@5588";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);

		boolean b = true;
		Scanner sc = new Scanner(System.in);
		
		while (b) {
			System.out.println("\nEnter your choice:");
			System.out.println(
					"1.Insert Student Info \n2.Delete Student Info \n3.Update Student Info \n4.Display Detail");
			System.out.println("5.Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				InsertInfo.insertInfo(con);
				break;
			case 2:
				DeleteInfo.deleteInfo(con);
				break;
			case 3:
				UpdateInfo.updateInfo(con);
				break;
			case 4:
				DisplayInfo.display(con);
				break;
			case 5:
				b = false;
				break;
			default:
				System.out.println("Invlid Input");
			}
		}
		
		sc.close();

	}

}
