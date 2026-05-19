/*Q21. Given an integer array and a specific element, write a Java program to find the index position of that element in the array.
 If the element is not found, print -1.

Explanation
Traverse the array from index 0 to length - 1
Compare each element with the target element
If a match is found, return its index
If the loop ends and no match is found, return -1
Input :- Array: {10, 20, 30, 40, 50}
Element to find: 30

Output :- Element found at index: 2*/

import java.util.Scanner;
public class specificelement
 {
 public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
	 int a[] = new int[5];
       System.out.println(" Enter a Array value ");
	 for(int i = 0;i<a.length;i++)
	 {
	   a[i] = sc.nextInt();
	   }
	   System.out.println("Enter a Element if we want to  match found");
	   int targetelement = sc.nextInt();
	   boolean isfound = false;
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]==targetelement)
		   {
			   isfound = true;
			   System.out.println(" Element the found index"+i);
		   }
		   else 
		   {
			   System.out.println(" Element the not found index"+i);
			   
		   }
	   }
		   if(!isfound)
		   {
			   System.out.println("Element at found index");
		   }
   }
 }   
	   
	   
	 
