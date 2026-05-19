/*Q2. Write a method that takes an integer and returns 1 if the number is even, otherwise returns 0.
Explanation
If number is divisible by 2 → Even
Else → Odd
Method returns an integer value
Method Signature - static int isEven(int num)
Input - num = 7 
Output - Odd*/

import java.util.Scanner;
public class staticevenandodd2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int checkevenandodd =(7);
		checkevenandodd(checkevenandodd);
	}
	
    public static int checkevenandodd(int num){
	if(num%2==0)
	{
		System.out.println(" Even No");
	}
	else
	{
		System.out.println(" Odd No");
	}
	return 1;
	
  }
} 


