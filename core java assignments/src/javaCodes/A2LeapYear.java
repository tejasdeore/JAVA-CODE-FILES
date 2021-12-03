//2. WAP to check whether a given year is a LEAP year

package javaCodes;

import java.util.Scanner;

public class A2LeapYear
{
	static Scanner sc =new Scanner(System.in);


	public static void main(String[] args)
	{
		int year;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter year :");
		
		year=sc.nextInt();
		
		if(year%4==0)
			{
				System.out.println("Entered year is a LEAP year... ");
			}
		else
			System.out.println("Entered year is Not a Leap year...");
		
	}		
}


