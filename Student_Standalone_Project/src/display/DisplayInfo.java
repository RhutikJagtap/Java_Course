package display;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DisplayInfo {
	public static void display(Connection con) throws SQLException {

		Scanner sc = new Scanner(System.in);

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		System.out.println("\n Student Detail: \n");
		while (rs.next()) {
			System.out.println(" Roll NO :" + rs.getInt(1) + " First Name :" + rs.getString(2) + "  Last Name :"
					+ rs.getString(3) + " Contact Detail :" + rs.getLong(4) + " City :" + rs.getString(5));
		}

		sc.close();
	}

}
