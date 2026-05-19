/*Q37. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). 
For each element, find the sum of divisors and compare with the number, then count.*/

import java.util.Scanner;
public class perfectnumbers37
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		      int a[] = {6,28,10,12,496};
			int count =3;
	       int n = 0;
	       int sum=0;
	       while(count < n)
	      {
		  for(int i = 1; i <= n; i++)
		  {
			  for(int j = 1; j <= n; j++)
			  {
			  if(i % j == 0)
			  
			    {
				 sum=sum+j;
		        }
				j++;
				
	          }    
	     if(i==sum)
	     {
		  System.out.println(i+" ");  
	      }
	     sum=0;
		  }
		  
	   }
	   System.out.println("Count of perfect numbers"+count);	
      }	 
	}
    	
 	
 