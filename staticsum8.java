/*Q8. Create a recursive function that returns the sum of first N natural numbers.
Explanation:
Add current number with the sum of previous numbers.
Base condition: when N becomes 0, return 0.


Example: Input: N = 4	Output: 10*/

import java.util.Scanner;
public class staticsum8
{
	public static void main(String[] args)
	{
		int N=4;
		System.out.println(sum(N));
		}
		
		public static int sum(int n)
		{
			if(n==0)
			{
				return 0;
			}
					return n+sum(n-1);
				}
			}
		
       

