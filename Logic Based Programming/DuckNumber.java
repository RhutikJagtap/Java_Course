//Q) Write a Java program to check whether a number is a Duck number or not?

//Duck number is a number that has at least one 0 , where leading 0 s are not countable.


import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();

		System.out.print("Number :");
		boolean flag=false;
		int Originalnum=num;

		while(num!=0)
		{
			if(num%10==0)
			{
				flag=true;
			}
			num=num/10;
		}

		if(flag==true)
		{
			System.out.print(Originalnum+" is a Duck Number :");
		}
		else{
			System.out.print(Originalnum+" is a  Not Duck Number :");
		}



	}
}
