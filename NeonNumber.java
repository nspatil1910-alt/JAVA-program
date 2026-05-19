/*Q21. Write a java program to check whether a number is neon or not.      	
        	Input : 9
        	Output : Neon Number
        	Explanation: square is 9*9 = 81 and
        	The sum of the digits of the square is 9.*/
			

import java.util.Scanner;
class NeonNumber
{
public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number");
  int num =sc.nextInt();
  
 int square =num*num;
 System.out.println("square :"+square);
 System.out.println("num "+num);
 int sum =(square/10)+(square%10);
 
 if(num == sum)
 {
	 System.out.println(num+"is neon num");
 }
 else 
 {
     System.out.println(num+"is not neon num");
 }
 
}
}

  