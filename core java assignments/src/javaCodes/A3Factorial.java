package javaCodes;

import java.util.Scanner;

public class A3Factorial {

	
  static Scanner sc= new Scanner(System.in);

  public static void main(String[] args) 
  	{
	
	  		int fact=1, num;
	  
	  		System.out.println("Enter a number greater than zero to calculate Factorial :");
	  		num = sc.nextInt();
	 
	  			for(int i=1;i<=num;i++)
	  			{
	  			fact *= i;
	  			}
	  			System.out.println("Factorial of entered number is :"+fact);
	  		
  	}

}
