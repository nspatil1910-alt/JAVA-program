/*Q55. Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Explanation: Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.*/

import java.util.Scanner;
class vowel1
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a vowel");
   char ch=sc.next().charAt(0);


   switch(ch)
  {
	   case 'A': System.out.println("a");
	           break;
	
	   case 'B': System.out.println("e");
	           break;
			   
	   case 'C' : System.out.println("i");
	           break;
		
	   case 'D' : System.out.println("o");
	           break;
			    
	   case 'E': System.out.println("u");
	           break;
			   
	  
			   
			   
			   
	 default : System.out.println(" Invalid");
		
  }
  
}
}


