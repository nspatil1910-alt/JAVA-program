/*Q57. Write a Java program to display the following series:1
     1 1 2 3 5 8 13 21 34
(Fibonacci series using loop — first 9 terms)*/


import java.util.Scanner;
public class seriesseven
{
   public static void main(String[]args)
   {  
   int n =1;
   int b =1;
   int a =1;
   int m=1;
   int i ;
   System.out.print(a + " " + b + " ");
    for(i = 3; i <= 9; i++)
   { 
    int c = a + b ;
	System.out.print( c + " ");
   a=b;
   b=c;
   }
   }
   }