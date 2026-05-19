/*Q58. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
Explanation: Switch on user choice. Use variables for balance and update accordingly.*/

import java.util.Scanner;
class Bank
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a User Choice");
  System.out.println("1.Enter A for Deposit");
  System.out.println("2.Enter B for Withdraw");
  System.out.println("3.Enter C for Check Balance");
  System.out.println("3.Enter D exit");

   char ch=sc.next().charAt(0);


   switch(ch)
  {
	   case 'A': System.out.println("Deposit");
	           break;
	
	   case 'B': System.out.println("Withdraw");
	           break;
			   
	   case 'C' : System.out.println("Check Balance");
	           break;
		
	   case 'D' : System.out.println("Exit");
	           break;
			   
			   
			   
	 default : System.out.println(" Invalid");
		
  }
  
}
}

