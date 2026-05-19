
/*Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.*/

import java.util.Scanner;
class simplecalculator
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a simple calculator");
  int operator=sc.nextInt();
  
  switch(operator)
  {
	   case '+': System.out.println("Addition");
	           break;
	
	   case '-': System.out.println("Substraction");
	           break;
			   
	   case '*' : System.out.println("Abstraction");
	           break;
		
	   case '/' : System.out.println("Division");
	           break;
			   
       	   
	   case '%': System.out.println("Moduls");
	           break;
			   
	 default : System.out.println(" wrong operator");
		
  }
  
}
}
