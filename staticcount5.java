/*Q5. Write a Java method that takes an integer and returns the count of digits in that number.
Explanation
Divide the number by 10 repeatedly
Count how many times division happens
Return the count
Method Signature - static int countDigits(int num)
Input - num = 4567
Output - Digits = 4*/

import java.util.Scanner;
public class staticcount5
{
	public static void main(String[] args)
	{
		int num= 4567;
		int countDigitsresult = countDigitsresult(num);
		System.out.println(countDigitsresult);
		}
		
		public static int countDigitsresult(int n)
		{
			int count = 0;
         while(n!=0)
		 {
			 n=n/10;
			 count++;
		 }
		return count; 
		}
   }
	   
	  