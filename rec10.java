/*Q10. Write a Java program that uses a void function to print the Fibonacci series up to N terms.
Explanation
Pass number of terms to the function
Use loop to generate series
Print each term inside the function
No recursion and no return type*/

import java.util.Scanner;
public class rec10
{
   public static void main(String [] args)
{
     int limit=5;
	  for(int i=0; i<=limit; i++)
	  {
	     System.out.printf("%d\t",fibo(i));
	  }
	  System.out.println("Number of iteration  "+count);
   }
   public static int fibo(int n)
   {   ++count;
       if(n<=1)
	   { return n;
	   }
	   return fibo(n-1)+fibo(n-2);
   }
}
   

