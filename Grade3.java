/*Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation: Use a char or string in switch to match grades and print remarks.*/


import java.util.Scanner;
class Grade3
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Grade");
   char ch=sc.next().charAt(0);


   switch(ch)
  {
	   case 'A': System.out.println("Excellent");
	           break;
	
	   case 'B': System.out.println("Good");
	           break;
			   
	   case 'C' : System.out.println("Average");
	           break;
		
	   case 'D' : System.out.println("Poor");
	           break;
			   
       	   
	   case 'E': System.out.println("Fail");
	           break;
			   
			   
			   
	 default : System.out.println(" Invalid");
		
  }
  
}
}
