/*Q43. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	
Expected Output :
		The given array is : 7 9 5 6 13 2
		The elements which provide maximum difference is: 5, 13
		The Maximum difference between two elements in the array is: 8*/
		
		

import java.util.Scanner;
public class max
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
     	int a[] ={7,9,5,6,13,2};
		int first = -1;
		int second= -1;
		int max =Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	  {
	   for(int j=0;j<a.length;j++)
	   {
		   if((a[j]>a[i]))
				{
				int diff=Math.abs(a[j]-a[i]);
				if((diff>max))
				{
					max=diff;
					first=a[i];
					second=a[j];
				    }
				   }	
	              }
	              }
				System.out.println("Max Difference=" +max );
                System.out.println("Enter first element=" +first);
			    System.out.println("Enter second element ="+second);
		}	
}