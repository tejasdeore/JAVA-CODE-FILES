
//5. WAP to reverse the given number

package javaCodes;

import java.util.Scanner;

public class A5ReverseTheString 
{
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		long number , reverse=0 ;
		
		System.out.println("Enter a number : ");
		number=sc.nextLong();
		
		while(number!=0)
		{
			long remainder = number % 10;
			
			reverse = reverse *10 + remainder;
			
			number = number/10;
			
		}
		System.out.println("The reverse of the given number is: " + reverse); 
	}

}
