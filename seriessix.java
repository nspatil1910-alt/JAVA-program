/*Q56. Write a Java program to display the following series:
     7   10   15   22   31   42   55   70
      (Start at 7, differences increasing by 1 each time: +3, +5, +7...)*/

import java.util.Scanner;
public class seriessix
{
   public static void main(String[]args)
   {  
   int term=7;
  int diff =3;
   System.out.print(term + " ");

   
   for(int i = 1; i <= 8; i++)
   { 

   System.out.print(term + " ");
   term =term +diff;
   diff=diff+2;
   }
   }
   }