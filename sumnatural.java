/*Q6. Write a java program to find the sum of all natural numbers between 1 to n.*/

import java.util.Scanner;
class sumnatural
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" sum of all natural numbers between 1 to n ");
		int n = sc.nextInt();
		int sum=0;
	    int  i=1;
	 while(i<=n)
		{
		  sum +=i; 
		  i++;		
		}
		System.out.println(" sum "+sum);
	}
}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
