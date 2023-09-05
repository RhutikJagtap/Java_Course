/*
Q5) Write a Java program to take a number as dynamic input and 
find the sum of the digits which are available in the number?
Input : 256
Output: 2+5+6 = 13
*/

import java.util.Scanner;
class  DigitSum
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		System.out.print("Enter Number :");
		int num=s.nextInt();

		int digit;
		int sumResult=0;
		while(num!=0)
		{
			digit=num%10;  //Sepearte the digit
			sumResult=sumResult+digit;
			num=num/10;
		}
		System.out.print("Sum of Number is :"+sumResult);


	}
}
