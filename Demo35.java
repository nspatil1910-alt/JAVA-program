/*Question 35: Check whether a given employee is eligible for bonus:

Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus
Input:
Years of Service = 7
Salary = 50000

Output:
Bonus = 2500

Explanation:
If service > 5 years ? 5% bonus
5% of 50000 = 2500
If service ? 5 ? No Bonus

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo35{
public static void main(String[] args){
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
	System.out.println(" bonus=2500");
}
}
}
	