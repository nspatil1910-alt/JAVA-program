/*Q39. Write a Java program to check whether a given number is a Harshad number
 (i.e., divisible by the sum of its digits) for numbers from 1 to n.*/

import java.util.Scanner;
public class givennumber
 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter the Number");
	 int n = sc.nextInt();
	 int sum =0;
	 int n1 = n;
	 int d;
	 while(n!=0)
	 {
		 d = n % 10;
		 sum = sum + d;
		 n = n / 10 ;
	 }
	 if(n1 % sum == 0)
	 {
		 System.out.println(" Harshad Number ");
	 }
	 else 
	 {   
         System.out.println(" Not Harshad Number ");
		 
	 }
   }
 }