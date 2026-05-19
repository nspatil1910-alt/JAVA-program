/*Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation: Switch on food item number. Print item name and price. Default for invalid selection.*/

import java.util.Scanner;
class Food
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Food");
  System.out.println("1.Burger");
  System.out.println("2.pizza");
   System.out.println("3.Pasta");
   System.out.println("4.Sandwich");
   char ch=sc.next().charAt(0);


   switch(ch)
  {
	   case '1': System.out.println("Burger");
	             System.out.println("200");
	   
	           break;
	
	   case '2': System.out.println("pizza");
	             System.out.println("250");
	           break;
			   
	   case '3' : System.out.println("Pasta");
	              System.out.println("150");

	           break;
		
	   case '4' : System.out.println("Sandwich");
	              System.out.println("150");

	   
	           break;
			   
       
			   
			   
			   
	 default : System.out.println(" Invalid");
		
  }
  
}
}

