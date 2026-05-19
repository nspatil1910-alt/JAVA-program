/*Q20. Write a Java program to print all elements from an integer array that are greater than a given number.

Explanation
An integer array is given.
A number N is also given.
Traverse the array using a loop.
Compare each element with N.
If the element is greater than N, print it.
Input :- Array: 10 25 5 40 18
 Given Number: 20

Output :- Elements greater than 20 :
    25 40*/
	
import java.util.Scanner;
 public class greatergiven
{
    public static void main(String[] args)
    {
		
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter the  array value ");
         int a[] = new int[5];

       for(int i =0;i<a.length;i++)
	    {
			a[i] =sc.nextInt();
		}
		System.out.println("Enter the N number");
		int N = sc.nextInt();
		
		  for(int i =0;i<a.length;i++)
		  {
			  if(a[i]>N)
			  {
				  System.out.println(a[i]+" ");
			  }
		  }
		  
    }
}	