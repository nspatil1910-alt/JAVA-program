/*Q9. Write a recursive function to count how many digits are present in a given number.
Explanation:
Remove the last digit using division (number / 10).
Increase count in each recursive call.
Stop when the number becomes 0.


Example: Input: 4567	 Output: 4*/

import java.util.Scanner;
public class staticrec9
{
	public static void main(String[] args)
	{
		int num= 4567;
		int countDigitsresult = countDigitsresult(num);
		System.out.println(countDigitsresult);
		}
		
		public static int countDigitsresult(int n)
		{
		
         if(n==0)return 0;
		 return 1 + countDigitsresult(n/10);
		  
		}
		
   }
	   
	  
