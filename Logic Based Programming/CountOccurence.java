// Q)Write a Java program to count the number of occurrences of a digit in the given number?

import java.util.Scanner;
class  CountOccurence
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Number :");
		int num=s.nextInt();

		System.out.print("Digit :");
		int digit=s.nextInt();

		int count=0;

		while(num>0)
		{
			if(num%10==digit)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println("Count :"+count);
	}
}
