/*. Write a java program to display the reverse array. 
Input : Array = {1, 2, 3, 4, 5} 
Output : Reverse array = {5, 4, 3, 2, 1} 
Explanation : 
The last element becomes the first, and the first becomes the last by traversing from the end 
to the start.*/

import java.util.Scanner;
  public class reverse
     {
	    public static void main(String[] args)
		{
		   int b[] ={1,2,3,4,5};
		   Scanner sc = new Scanner(System.in);
                   System.out.println("Input the array");
                 for(int i=0;i<b.length;i++)
                 {
                    System.out.println(b[i]);
                 }
               System.out.println("Before  the reverse array");
               for(int i=0;i<b.length;i++)
                {
                System.out.println(b[i]);
                 }
               for(int i =0;i<a.length;i++)
                {
                int temp = a[0];
                }
                for(j=0;j<a.length;j++)
                {
                    a[j] = temp;
                }
                System.out.println("Affter the Reverse Array");
                for(int i=0;i<a.length;i++)
                {
                 System.out.println(a[i]);
                }
            }
       }
    





