/*
Q6) Write a Java program to find the addition of even numbers and the addition of odd numbers 
which are available in a number that we have taken as Dynamic Input?
*/
import java.util.*;
class AddEvenOdd 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	
	System.out.print("Enter Number :");
	int num=s.nextInt();

	int digit;
	int evenSumResult=0;
	int OddSumResult=0;

	while(num!=0)
		{
		digit=num%10;
		if(digit%2==0)
			{
			evenSumResult=evenSumResult+digit;
			}
			else{
				OddSumResult=OddSumResult+digit;
				
			}
			num=num/10;
		}
		System.out.println("Even Numbers Sum:"+evenSumResult);
		System.out.println("Odd Numbers Sum:"+OddSumResult);

	}
}
