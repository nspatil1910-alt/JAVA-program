/*Q54. Write a java program to display following series :
           	1  2  4  7  11  16  22  29  37  46.*/
			
import java.util.Scanner;
public class seriesfour
{
   public static void main(String[]args)
   {  
   int n=10;
   int i;
   int term=1;
   int diff=1;
   
   for(i = 1; i <= n; i++)
   { 
   System.out.print(term + " ");
   term=term+diff;
   diff++;
   }
   }
   }
