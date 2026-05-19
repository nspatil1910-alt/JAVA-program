/*Q9. Write a java program to print a multiplication table of any number.*/


import java.util.Scanner;
class multiplication
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
	       int tab;
		System.out.println("Enter the values of keyboard");
		int no =sc.nextInt();
		int i=1;
		while(i<=10)
		{
		tab=no*i;
		System.out.println(" no ="+no*i);
		i++;
		}
		
	}
}