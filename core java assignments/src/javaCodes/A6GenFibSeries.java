//Generate the Fib… series 1 1 2 3 5 8 13

package javaCodes;

import java.util.*;

public class A6GenFibSeries {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int num1=0,num2=1,num3,i,count;
		
		
		System.out.println("enter count value:");
		count= sc.nextInt();
		System.out.println(num1+" "+num2);
		
		for(i=2;i<count;++i)
		{
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
		
	}

}
