/*
Q)Write a Java program to count the number of digits , 
number of even numbers, number of odd numbers and number of prime numbers in a number that we have taken as a dynamic input?
*/

import java.util.Scanner;
class  Count
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		System.out.print("Number   :");
		int num=s.nextInt();


		int digit=0;
		int evenNumCount=0;
		int oddNumCount=0;
		int primeNumCount=0;

		while(num!=0)
		{
			digit=num%10;
			if(digit%2==0)
			{
			evenNumCount++;//evenNumCount=evenNumCount+1
			}else{
				oddNumCount++;//oddNumCount=oddNumCount+1
			}

			if(digit==2 || digit==3 ||digit==5 || digit==7)
			{
				primeNumCount++;//primeNumCount=primeNumCount+1
			}
			num=num/10;

		}

		System.out.println("Even Nums Cont :"+evenNumCount);
		System.out.println("Odd Nums Cont :"+oddNumCount);
		System.out.println("Prime Nums Cont :"+primeNumCount);

	}
}
