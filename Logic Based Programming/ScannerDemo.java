//Q1) Write a Java program to read three numbers as a dynamic input and perform addition operation over the provided numbers?

import java.util.*;
class ScannerDemo{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("First Value    : ");
		int num1 = s.nextInt();

		System.out.print("Second Value   : ");
		int num2 = s.nextInt();

		System.out.print("Third Value    : ");
		int num3 = s.nextInt();

		System.out.println("Addition     : "+(num1+num2+num3));
	}
}

