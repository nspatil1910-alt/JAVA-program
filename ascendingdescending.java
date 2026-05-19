/*Q39. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
                Descending Order: [34, 12, 9, 5, 1]

Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, then print the reverse of that order for descending.*/

import java.util.Scanner;
public class ascendingdescending
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
     	int a[] = new int[5];
    System.out.println("Enter Input Array" );
	for(int i=0;i<a.length;i++)
	   {
       a[i] = sc.nextInt();
	   }
	   
      
   }
}   
		
		