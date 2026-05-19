/*Q59. Write a program using switch that takes a number (1-4) and displays a season:
 1: Spring
 2: Summer
 3: Autumn
 4: Winter
Explanation: Simple switch with four cases and default for invalid input*/

import java.util.Scanner;
class season1
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("1.Enter for Spring");
  System.out.println("2.Enter for Summer");
  System.out.println("3.Enter for Antumn");
  System.out.println("4.Enter for Winter");
   char ch=sc.next().charAt(0);
    

   switch(ch)
  {
	   case '1': System.out.println("Spring");
	           break;
	
	   case '2': System.out.println("Summer");
	           break;
			   
	   case '3' : System.out.println("Antumn");
	           break;
		
	   case '4' : System.out.println("Winter");
	           break;
			   
			   
			   
	 default : System.out.println(" Invalid");
		
  }
  
}
}
