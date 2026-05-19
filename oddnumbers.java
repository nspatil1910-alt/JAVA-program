/*Q5. Write a java program to print all odd numbers between 1 to 100.*/

import java.util.Scanner;
class oddnumbers
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number of the terms: ");
		int n=sc.nextInt();
		
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
			  System.out.println(i);
              System.out.println(i+ " "	);		  
			}
		}		
	}
}	
		
		
		