package pack2;

import java.util.Scanner;

public class Batch 
{
	Scanner sc=new Scanner(System.in);
	
	String batchName , shift , branch;
	
	public void accept()
	{
		System.out.println("\n\n\t\t*****************************Welcome to the Batch class ******************************");
		System.out.println("\n\nEnter your Batch Name :");
		batchName =sc.next();
		System.out.println("\nEnter your Shift :");
		shift =sc.next();
		System.out.println("\nEnter Name of the Branch :");
		branch =sc.next();
		//display();
	}
	
	public void display()
	{	System.out.println("\n\t\t*********** BATCH DETAILS************");
		System.out.println(" Name of the student :"+batchName);
		System.out.println("Roll Number :"+shift);
		System.out.println(" Name of the Trainer :"+branch);

	}
	
}