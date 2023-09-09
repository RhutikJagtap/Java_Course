/*
Q)Write a Java program to check whether a number is a Niven Number or not?
Niven Number: sum of all digits is divisible to the original number.
A Number is divisible by the sum of all digits in that number.
*/
import java.util.Scanner;
class NivenNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		System.out.print("Number :");
		int num=s.nextInt();
		
		int digit=0;
		int digitSum=0;

		int originalNum=num;
		while(num!=0)
		{
			digit=num%10;
			digitSum=digitSum+digit;
			num=num/10;
		}
		if(originalNum%digitSum==0)
		{
			System.out.println(originalNum+" is a Niven Number");
		}else
		{
			System.out.println(originalNum+" is a Not  Niven Number");
		}
	}
}
