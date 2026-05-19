import java.util.*;
class eligibilty 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a percentage");
		int percentage = sc.nextInt();
		
		System.out.println("Enter income");
		int income=sc.nextInt();
		
		if(percentage>=75 && income<200000)
		{
		   System.out.println("eligibilty");
		}
		else
		{
		  System.out.println("Not eligiblity");
		  }
		}
}		