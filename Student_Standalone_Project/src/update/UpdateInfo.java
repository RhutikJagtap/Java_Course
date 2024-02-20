package update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateInfo {
	public static void updateInfo(Connection con) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Roll No which you want to updated: ");
		int rollno = sc.nextInt();
		System.out.println("Which Information you want to update :");
		System.out.println("1.Student Contact \n2.Student City");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		  switch(ch)
	        {
	            case 1: {
	                PreparedStatement pst = con.prepareStatement("update  student set contact=? where rollno=?");
	                System.out.println("Enter the Student Contact you want to Update :");
	                long contact = sc.nextLong();

	                pst.setLong(1, contact);
	                pst.setInt(2,rollno);
	                int status = pst.executeUpdate();
	                if (status == 1)
	                    System.out.println("Student Contact Number Updated Successfully...");
	                else
	                    System.out.println("Failed to Update Information");
	            }
	            break;
	            case 2: {
	                PreparedStatement pst = con.prepareStatement("update  student set city=? where rollno=?");
	                System.out.println("Enter the Student City you want to Update :");
	                String city = sc.next();

	                pst.setString(1, city);
	                pst.setInt(2,rollno);
	                int status = pst.executeUpdate();
	                if (status == 1)
	                    System.out.println("Student City Updated Successfully...");
	                else
	                    System.out.println("Failed to Update Information");
	            }
	                break;

	        }
		  sc.close();
	}
}
