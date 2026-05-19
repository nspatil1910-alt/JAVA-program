/*Q36. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.*/

import java.util.Scanner;
public class primenumbers
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		      int a[] = {2,5,6,9,11};
			int count =0;
			for(int i=0;i<a.length;i++)
			{
				int num = a[i];
				int factors=0;
			   for(int j=1;j<=num;j++)
			   {
				if(num%j==0)
				{
					factors++;
				}
			  }
				if(factors==2)
				{
					count++;
				}
			}
			System.out.println("Count of prime numbers"+count);
		}				
	}
	
	

