//6. Accept three digit number via CLA* and calculate the sum of digit 

package CLA;

public class CLA5 {

		public static void main(String[] args) {
			String s1 = args[0];
			String s2 = args[1];
			String s3 = args[2];
			int sum=0;
		
			// we are performing parsing operation ( to convert obj to var)
		
			int	a = Integer.parseInt(s1);
			int	b = Integer.parseInt(s2);
			int	c = Integer.parseInt(s3);
	
			//performing ddition;
				sum = a+b+c;
			 
			 
				//printing sum
			System.out.println("Addition of entered digits :"+sum);
	}

}
