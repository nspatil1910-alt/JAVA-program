/*Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.*/

import java.util.Scanner;
class bonus
{
	public static void main(String [] args)
	{  
		Scanner sc = new Scanner(System.in);
		int Amount =500000;
		System.out.println("Enter a service ");
		int service =sc.nextInt();
		System.out.println("Enter a salary ");
		int salary = sc.nextInt();
        System.out.println("Enter a years ");
		int years = sc.nextInt();
		System.out.println("Enter a amount ");
		int amount = sc.nextInt();
		

if(years>5)
{
	int bonus = (years*5)/100;
	System.out.println("Enter the bonus amount"+amount);
	
}
else 
{
	System.out.println("no bonus");
}

	}
}