/*Q25. Write a java program to Check Number Is Armstrong Number or Not.

Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.

      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.*/

import java.util.Scanner;
 public class Armstrong

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	  int num=sc.nextInt();
	  
	  int original=num;
        int sum=0;
     
     while(num>0)
	 {
		 int digit=num%10;
		 sum=sum+(digit*digit*digit);
		 
		 if(original==sum)
	 {
		 System.out.println(" It  Is Amstrong Number");
	 }
	 else
	 {
		 System.out.println("  It  Is Not Amtrong Number");
	 }
   
   }
 } 
 } 