/*Q9)Write a Java program to display a number in reverse and
check whether the number is a palindrome number or not?

Palindrome means if we read number forward and Backward 
then output will be same eg-121
*/
import java.util.Scanner;
class  Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		System.out.print("Number :");
		int num=s.nextInt();

		int digit=0;

		int originalNum=num;
		int reverseNum=0;


		while(num!=0)
		{
			digit=num%10;
			reverseNum=reverseNum*10+digit;
			num=num/10;

		}
		System.out.println("Reverse Num :"+reverseNum);

		if(reverseNum==originalNum)
		{
			System.out.println(originalNum+" is a palindrome Number");
		}
		else{
				System.out.println(originalNum+" is Not palindrome Number");
		}

	}
}
