/*
Q)Write a Java program to check whether a number is a perfect number or not?
6 : 1 + 2 + 3 : 6
*/
import java.util.Scanner;
class PerfectNum 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);

		System.out.print("Number  :");
		int num= s.nextInt();

		int originalNum=num;

		int divisiorSum=0;
		int i=1;

		while(i<num)
		{
			if(num%i==0)
			{
				divisiorSum=divisiorSum+i;
			}
			i=i+1;
		}

		if(divisiorSum==originalNum)
		{
			System.out.println(originalNum+" Is a Perfect Number");
		}else{
			System.out.println(originalNum+" Is not a Perfect Number");
		}
		
	}
}
