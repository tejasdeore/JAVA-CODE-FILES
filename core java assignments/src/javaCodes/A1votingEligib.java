//1. WAP to check whether a person is eligible for voting

package javaCodes;

import java.util.Scanner;

public class A1votingEligib 
{

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int age;
	
		System.out.println("Enter your age :");
			
			age=sc.nextInt();
			
		if(age>=18)
		{
			System.out.println("You are eligible for voting :");
		}
		else
			System.out.println("not valid candidate..!!!");
	}

}
