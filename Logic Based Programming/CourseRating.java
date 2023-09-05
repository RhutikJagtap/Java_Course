/*
Q3)Write a Java program to display the course Rating in the form of stars[*]
on the basis of the number of enquiries per day at Durgasoft with the following conditions?

If the number of enquiries are in between 30 to 50 Then the Rating will be **.
If the number of enquiries are in between 50 to 70 Then the Rating will be ***.
If the number of enquiries are in between 70 to 100 Then the Rating will be ****.
If the number of enquiries are greater than 100 Then the Rating will be *****.
*/

import java.util.Scanner;
class  CourseRating
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		System.out.print("Course Name :");
		String courseName=s.next();

		System.out.print("No Of Enquiries:");
		int enquiries=s.nextInt();

		System.out.print(courseName+"  :    ");
		if(enquiries>=30)
		{
			if(enquiries<50)
			{
				System.out.print("**");
			}else
			if(enquiries<70){
				System.out.print("***");
			}else
			if(enquiries<100)
			{
				System.out.print("****");
			}else
			if(enquiries>100)
			{
				System.out.print("*****");
			}
		}else{
			System.out.print("No Rating Yet");
		}




	}
}
