/*
Q2) Write a Java program to take a number as dynamic input and check whether the number is an even number or odd number?
*/

import java.util.Scanner;
class  EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Number :");

		int num=s.nextInt();

		if(num%2==0){
			System.out.print(num+" is Even Number ");
		}else{
			System.out.print(num+" is Odd Number ");
		}

	}
}
