/*Q35. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.*/

import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {
	  int a[]= new int[3];
	  Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a 3 element");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
	    for(int i=0;i<a.length;i++)
		{
			int factorial=1;
	    for(int j=1;j<=a[i];j++)
		{
		    factorial=factorial*j;
		}
		     System.out.print(" factorial of " + a[i]+ " = " +factorial+"\t");
		
	   } 
	}
}

