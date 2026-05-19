/*Q11. Write a java program to calculate the sum of digits in a number.*/

import java.util.Scanner;
class sumofdigits
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		   int sum=0;
		System.out.println(" Enter  in a number ");
		int num =sc.nextInt();
		
		while(num>0)
		{
			 int digit=num%10;
			sum =sum+digit;
			 num=num/10;
			System.out.println("sum of digits "+sum);
		    
			
			}
	}
}	
			
     
