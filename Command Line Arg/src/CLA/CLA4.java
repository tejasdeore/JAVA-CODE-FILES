
// Accept five different values via CLA* by using for loop and display sum of that values
package CLA;

public class CLA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing sum to '0' 
int Sum=0;

		
for(int i=0;i<args.length;i++)
{
Sum=Sum+Integer.parseInt(args[i]);
}
System.out.println("Sum="+Sum);

	}

}
