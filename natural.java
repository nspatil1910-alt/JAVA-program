/*Q1. Write a java program to print all natural numbers from 1 to n. using while loop*/

import java.util.Scanner;
class natural
{
	public static void main(String[]args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" all natural numbers from 1 to n");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i+" ");
			i++;
	}
}
}