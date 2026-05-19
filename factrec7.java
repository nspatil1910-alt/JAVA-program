/*Q7. Write a Java program using a void function to print all factors of a given number.
Explanation
Function accepts one integer parameter
Use a loop from 1 to the number
If number is divisible, print the factor
No return value*/

import java.util.Scanner;
public class factrec7
{
	  static int f = 1;
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Factorial Number");
		int no = sc.nextInt();
		fact(no);
	 }
	public static void fact(int no)
	{
		if(no!=0)
		{
		  f=f*no;
		  fact(no-1);
		 
		}
	    else
		{
			 System.out.println("Factorial  "+f);
		 }

	}
}

			
