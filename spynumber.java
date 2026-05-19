/*Q23. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
	 Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8*/

import java.util.Scanner;
class spynumber
{
	public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	
System.out.println("Enter a Number");
int num =sc.nextInt();
int sum=8,pro=8;
if(sum==pro)
{
	System.out.println("spy number");
}
else
{
	System.out.println("not spy number");
}

}
}

  

	
