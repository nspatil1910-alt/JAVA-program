/*Q1. Write a Java method that takes two integers as input and returns their sum.
Explanation
The method receives two numbers
It adds them
Returns the result to the main method
Method Signature - static int getSum(int a, int b)
Input - a = 10, b = 20
Output - Sum = 30*/

import java.util.Scanner;
public class staticadd1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
			getsum(10,20);
		}
	public static int getsum(int a,int b){
			int sum = a+b;
			System.out.println("sum="+sum);
			return 1;
		}
}
