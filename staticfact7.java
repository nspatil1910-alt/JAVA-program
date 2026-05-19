/*Q7. Write a recursive function to calculate the factorial of a given number.
Explanation:
Factorial of n is n * factorial(n-1).
Base condition: factorial of 0 or 1 is 1.


Example: Input: 5		Output: 120*/

import java.util.Scanner;
public class staticfact7
{
	  static int f=1;
	public static void main(String[] args)
	 {
	
		int result = getfact(5);
		System.out.println("Factorial  "+result);
		
	 }
	public static int getfact(int no)
	{
		if(no!=1)
		{
		 return no*getfact(--no);
		}
	    else
		{
			 return no;
		 }

	}
}

			

