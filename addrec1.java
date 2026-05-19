/*Q1.Write a function that accepts two integers and prints their sum.
Explanation
Function takes two numbers as parameters
Calculates sum inside the function
Prints the result using System.out.println()
Example
Input: 10, 20              Output: Sum = 30*/

import java.util.Scanner;
public class addrec1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
			add(10,20);
		}
	public static void add(int x,int y){
			int sum = x+y;
			System.out.println("sum="+sum);
		}
	}

	


