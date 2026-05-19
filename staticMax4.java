/*Q4. Write a method that takes two integers and returns the greater number.
Explanation
Compare both numbers
Return the larger one
Method Signature - static int findMax(int a, int b)

Input - a = 12, b = 20
Output - Maximum = 20*/

import java.util.Scanner;
public class staticMax4
{
	public static void main(String[] args){
		 staticMax4 obj = new staticMax4();
         obj.findMax(12, 20);
	}
	public static int findMax(int a,int b)
	{
		if(a>b)
	{
		System.out.println(" Minimum = 12");
	}
	else
	{
		System.out.println("  Maximum =20");
	}
	return 1;
  }
} 
