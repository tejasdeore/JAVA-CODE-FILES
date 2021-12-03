//1. accept two integer values via CLA* and perform  all arithmetic operation
//2  Modify the above program ,try it with different  data types.


package CLA;

public class CLA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = args[0];
		String s2 = args[1];
		String t1 = args[2];
		String t2 = args[3];
		String u1 = args[4];
		String u2 = args[5];
		
		
		String s3 = s1+s2;
		String t3 = t1+t2;
		String u3 = u1+u2;
		// below we are performing parsing(obj to var) 
		
		float 	a1 	=   Float.parseFloat(s1);
		float   b1  =   Float.parseFloat(s2);
		 int 	a 	= 	Integer.parseInt(t1);
		 int 	b 	= 	Integer.parseInt(t2);
	   double   a2  =   Double.parseDouble(u1);
	   double   b2  =   Double.parseDouble(u2);
	   
	   //performing addition
	   
	   float   c1=a1+b1;
	   double  c2=a2+b2;
	   int     c=a+b;
	   
	   
	   //Displaying desired output
	   
	   System.out.println(" Addition of entered Float values :" +c1);
	   System.out.println("Addition of entered Double values :" +c2);
	   System.out.println("Addition of entered Integer values :" +c);
	   
 	}

}
