/*
Q4)Write a Java program to take a number as dynamic input and display all the digits of that number with a space separator?
Input: 256
Output: 2  5  6

*/

import java.util.Scanner;
class  DigitSeperate
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		System.out.print("Number :");
		int num=s.nextInt();

		int digit=0;
		String result="";


		while(num !=0){
			digit=num%10;
			result=digit+" "+result;
			num=num/10;
		}
		System.out.print("Result  :"+result);


	}
}
