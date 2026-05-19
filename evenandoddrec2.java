/*Q2. Write a function that accepts one integer and prints whether the number is Even or Odd.
Explanation
Use modulo operator %
If number % 2 == 0, print Even
Otherwise, print Odd
No return value used
Example
Input: 7        Output: Number is Odd*/

import java.util.Scanner;
public class evenandoddrec2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int checkevenandodd =(7);
		checkevenandodd(checkevenandodd);
	}
	
    public static void checkevenandodd(int num){
	if(num%2==0)
	{
		System.out.println("Number is Even No");
	}
	else
	{
		System.out.println("Number is Odd No");
	}
	
	
  }
} 