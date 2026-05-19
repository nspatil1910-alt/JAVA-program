/*Q8. Write a java program to find the sum of all odd numbers between 1 to n.*/

import java.util.Scanner;
class oddnumbers1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number of the terms: ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i%2!=0)
			{
			  System.out.println(i);		  
		   System.out.println(i + " ");
		}
		}	
		
	}
}	
		
		
		
		
