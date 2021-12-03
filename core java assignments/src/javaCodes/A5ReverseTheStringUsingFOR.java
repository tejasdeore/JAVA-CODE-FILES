package javaCodes;

import java.util.Scanner;


public class A5ReverseTheStringUsingFOR
{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		long number , reverse=0 ;
		
		System.out.println("Enter a number : ");
		number=sc.nextLong();
		
		for(;number!=0;number = number/10)
		{
			long remainder = number % 10;
			
			reverse = reverse *10 + remainder;

			
		}
		System.out.println("The reverse of the given number is: " + reverse); 
	}

}
