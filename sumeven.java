/*Q7. Write a java program to find the sum of all even numbers between 1 to n.*/

import java.util.Scanner;
class sumeven
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" sum of all even numbers between 1 to n ");
		int n = sc.nextInt();
		
		for(int i=1;i>=n;i--)
		{
			if(i%2==0)
			{
			  System.out.println(i);		
			}
		}		
	}
}

		
		
		
		
		
		
