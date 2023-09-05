/*
Q7)Write a Java program to find the sum of all prime numbers 
which are available in a number that  we have as a dynamic input?
*/

import java.util.*;
class  PrimeSum
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		System.out.print("Number   :");
		int num=s.nextInt();

		int digit=0;
		int primeNumSum=0;
		int nonPrimeNumSum=0;

		while(num!=0){
			digit=num%10;
			if(digit==2 || digit==3 || digit==5|| digit==7)
			{
				primeNumSum=primeNumSum+digit;
			}else{
				nonPrimeNumSum=nonPrimeNumSum+digit;
			}
			num=num/10;
		}
		System.out.println("Prime Numbers Sum  :"+primeNumSum);
		System.out.println("Non Prime Numbers Sum :"+nonPrimeNumSum);



	}
}
