/*Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.*/

import java.util.Scanner;
 public class NeonNumber

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	  int num=sc.nextInt();
	  
	  int num=sc.nextInt();
	  int sum=0;
	  int square =num*num;
	  
	  while(square!=0)
	  {
		 int digit =square%10;
		 sum = sum + digit;
		 square = square%10;
	  }
	  if(sum=num)
	  {
		  System.out.println(" It is Neon Number ");
	  }
	  else
	  {
		  System.out.println(" It is Not Neon Number ");
	  }