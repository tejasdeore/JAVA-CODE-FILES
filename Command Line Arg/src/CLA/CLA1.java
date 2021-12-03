//1. accept two integer values via CLA* and perform  all arithmetic operation

package CLA;

public class CLA1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = args[0];
		String s2 = args[1];
		
		String s3=s1+s2;
		// below we are performing parsing(obj to var) 
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
	
		int c = a+b;
		System.out.println("Addition of entered values: " +c);
	}

}
