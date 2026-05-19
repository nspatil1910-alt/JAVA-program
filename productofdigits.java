/*Q12. Write a java program to calculate the product of digits in a number.*/

import java.util.Scanner;
class productofdigits
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int n =sc.nextInt();
		int pro=1;
		while(n>0)
		{
			int digit=n%10;
			pro =pro*digit;
			n= n/10;
		}
		System.out.println(" product of digits ="+pro);
	}
}