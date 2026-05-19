/*Q58. Write a Java program to display the following series:
2 6 12 20 30 42 56 72 90 110
(n(n+1) pattern multiplied by 2)*/

import java.util.Scanner;
public class serieseight
{
   public static void main(String[]args)
   {
	   int n=2;
    for( int i= 6; i<= 110; i++)
   { 
    System.out.print(i+" ");
	int j = 2 * n * ( n + 1);
   }
   }
}