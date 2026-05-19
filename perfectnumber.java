/*Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors.
 The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128*/


import java.util.Scanner;
class primenumber
{                                                                                                                                                                                                                                                                                                                                                 
	public static void main(String[]args)
	{ 
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int i=1;
		int sum=0;
		
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(n==sum)
		{
			System.out.println("perfect Number");
		}
		else
		{
			System.out.println(" Not perfect Number");
		}
	}
}