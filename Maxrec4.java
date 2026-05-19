/*Q4. Write a function that accepts two integers and prints the greater number.
Explanation
Compare both numbers using if-else
Print the greater number
Function does not return anything
Example
Input: 15, 25
Output: Maximum number is 25*/

import java.util.Scanner;
public class Maxrec4
{
	public static void main(String[] args){
		 Maxrec4 obj = new Maxrec4();
         obj.findMax(15, 25);
	}
	public static void findMax(int a,int b)
	{
		if(a>b)
	{
		System.out.println("a is greater");
	}
	else
	{
		System.out.println("b is greater");
	}
  }
} 