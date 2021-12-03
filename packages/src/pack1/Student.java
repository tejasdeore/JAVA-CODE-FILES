package pack1;

import java.util.Scanner;

public class Student
{
	Scanner sc= new Scanner(System.in);
	
	String name , trainer;
	int rollNo;
	
	public void accept()
	 {
		System.out.println("*******************Welcome to proEdutech , please fill the details*************************");
		System.out.println("\nEnter your Name :");
		name =sc.next();
		System.out.println("\nEnter your rollNo :");
		rollNo =sc.nextInt();
		System.out.println("\nEnter Name of your Trainer :");
		trainer =sc.next();
		//display();
	 }
	 public void display()
	{
		 System.out.println("\n\t\t**********STUDENT DETAILS**************");
		System.out.println("Name of the student :"+name);
		System.out.println("Roll Number :"+rollNo);
		System.out.println("Name of the Trainer :"+trainer);
	
	}
}
