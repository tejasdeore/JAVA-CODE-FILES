/*Accept basic salary via CLA* and calculate the following
DA=20% of basic
HRA=30% of basic
Calculate gross salary GROSS=BASIC+DA+HRA
Calculate the Income tax (IT) based on the following condition
SAL RANGE IT
-------------------------------------------------------------------
Basic >0 and basic < 4000 4%
Basic >=4000 and basic < 10000 6%
Basic >=10000 and basic < 17000 8%
Basic >=17000 and basic < 27000 10%
Basic >=27000 onwards 15%

*/

package CLA;

public class CLA3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int bsal=Integer.parseInt(args[0]);
		
		
		double g=(bsal+(0.2*bsal)+(0.3*bsal));
		
		System.out.println("Your gross Salary is:"+g);
		

		if(bsal>0 && bsal<4000)
		{
		 System.out.println("Your Income Tax is:");
		 System.out.println(0.04*bsal);
		}
		else if(bsal>=4000 && bsal<10000)
		{
		 System.out.println("Your Income Tax is:");
		 System.out.println(0.06*bsal);
		}
		else if(bsal>=10000 && bsal<17000)
		{
		 System.out.println("Your Income Tax is:");
		 System.out.println(0.08*bsal);
		}
		else if(bsal>=17000 && bsal<27000)
		{
		 System.out.println("Your Income Tax is:");
		 System.out.println(0.1*bsal);
		}
		else
		{
		 System.out.println("Your Income Tax is:");
		 System.out.println(0.15*bsal);
		}
		
	
	}

}
