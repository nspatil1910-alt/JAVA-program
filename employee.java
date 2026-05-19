/*Q57. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
Explanation: Use switch on the level number and print the salary range.*/

import java.util.Scanner;
class employee
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Numbers");
   int num=sc.nextInt();

   switch(num)
  {
	   case 'A': System.out.println("Junior(20,000-30,000)");
	           break;
	
	   case 'B': System.out.println("Mid(321,000-50,000)");
	           break;
			   
	   case 'C' : System.out.println("Senior(51000-80000)");
	           break;
		
	  
	  default : System.out.println(" Invalid");
		
  }
  
}
}


