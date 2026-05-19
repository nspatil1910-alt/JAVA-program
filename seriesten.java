/*Q60. Write a Java program to display the following series: 
3   6   12   24   48   96  192 
(Each term doubles from the previous term starting at 3)*/

import java.util.Scanner;
public class seriesten
{
   public static void main(String[]args)
   {  
   int num=3;
   for( int i =1;i<=7;i++)
   {
	   System.out.print(num+" ");
	    num = num * 2;
     }
   }
  }