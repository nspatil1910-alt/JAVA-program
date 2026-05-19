/*Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.*/

import java.util.Scanner;
public class sumofall
{   public static void main(String[]args)
	{  
	   Scanner sc = new Scanner(System.in);
	   int d[]=new int[5];
	   System.out.println("Enter values in array");
	   int sum=0;
	   for(int i=0; i<d.length; i++)
	   {
		    d[i]=sc.nextInt();
	   }
	   System.out.println("display array values");
	   for(int i=0; i<d.length; i++)
	   {    sum =sum+d[i];
		    System.out.printf("%d\t",d[i]);
	   }
	   System.out.printf("\nSum of all values is %d\n",sum);
	   
	}
}

