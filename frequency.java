/*Q34. Write a java program to find the frequency of each digit in a given integer.*/

import java.util.Scanner;
public class frequency
 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter the Number");
	 int num = sc.nextInt();
	 int digit;
	 int frequency;
	 if(number==0 && digit == 0)
	 {
		 return 1;
	 }
	 if(number<0)
	 {
		 number = -number;
	 }
	 while(number!=0)
	 {
		 if(number%10 == digit)
			 frequency++;
	 }
	 number = number /10;
   
   return frequency;
 }
   System.out.println(" Thenumber :"+number+" hasdigit "+ digit +" "+"frequency :" + frequency);
 
 }
 