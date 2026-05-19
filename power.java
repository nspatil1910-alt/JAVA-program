/*Q16. Write a java program to find power of a number.*/

import java.util.Scanner;
class power 
{
	public static void main(String[]args)
	{ 
		 
		Scanner sc = new Scanner(System.in);
		int result=1;
		System.out.println("Enter a exponent power");
		int exponent =sc.nextInt();
		System.out.println("Enter a base power");
	    int base =sc.nextInt();
		int i=1;
		for(i=1;i<=exponent;i++)
		{
			result=result*base;
			{
				System.out.println("result is"+result);
			}
		}
	}
}
		