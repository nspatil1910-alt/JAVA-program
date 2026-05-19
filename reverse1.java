/*Q13. Write a java program to enter a number and print its reverse.*/

import java.util.Scanner;
class reverse
{
	public static void main(String[]args)
	{
	
		int r;
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter a  number and print its reverse");
		int n=sc.nextInt();
    
		while(n>0)
		{ 
	         r = n%10;
			System.out.println(" Reverse order "+r);
			n=n/10;
		}
	}	
}	