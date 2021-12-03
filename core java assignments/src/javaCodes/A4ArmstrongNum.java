package javaCodes;

import java.util.Scanner;

public class A4ArmstrongNum 
{

	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) 
	{
		
		int num,number,total=0,temp;
	
		
	System.out.println("Enter a three digit number to verify :");
	num =  sc.nextInt();
	

	number=num;
	
	while(number!=0)
	{
		temp =number %10;
		
		total = total +(temp*temp*temp);
		
			number = number / 10;
	   
	}
	if (total==num)
		System.out.println(num+" : is an Armstrong number...");
	else
		System.out.println(num+" : is not an Armstrong num..");

	}

}
