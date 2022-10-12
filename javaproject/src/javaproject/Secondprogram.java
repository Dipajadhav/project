package javaproject;

import java.util.Scanner;

class Secondprogram {

	public static void main(String[] args)
	
	{
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Please Enter First Number-->");
		int num1=obj.nextInt();
		
		System.out.println("Please Enter Second Number-->");
		int num2=obj.nextInt();
		
		int sum=num1+num2;
		System.out.println("Sum of two Numbers-->"+ sum);

	}

}
