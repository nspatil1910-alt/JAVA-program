/*Q27. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.*/

import java.util.Scanner;
public class frequency1
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
     	int a[] ={1, 2, 2, 3, 3, 3, 4};
    System.out.println("Enter Input Array" );
	for(int i=0;i<a.length;i++)
	   {
       a[i] = sc.nextInt();
	   }
	   int count=1;
	   int i=0; 
		 for(i=1; i<a.length; i++)
		 {      
		     if(a[i-1]==a[i])
			 {
			    ++count;
			 }
			 else
			 {
			  System.out.println(a[i-1]+" ");
			   System.out.println(count+" ");

			   count=1;
			 }
		 }
   }
 }  

      
