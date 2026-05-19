/*Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number 
is replaced by the sum of squares of its digit, 
that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.*/

import java.util.Scanner;
 public class Happy

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	  int num=sc.nextInt();
	  int n;
	  int sum =0;
	  while(num>0)
	  {
		  int digit = num%10;
		  sum = sum + digit;
		  num = num/10;
	  }
	  if(num ==1)
	  {
		  System.out.println(  " It Is a Happy ");
	  }
	  else
	  {
		   System.out.println(" It Is Not a Happy ");
	  }
   }
 }