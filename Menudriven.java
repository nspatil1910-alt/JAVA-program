/*Q61. Write a menu-driven program in java using switch case.
           	1.Addition
           	2.Subtraction
           	3.Multiplication
           	4.Division*/
			
import java.util.Scanner;
class Menudriven
{
public static void main(String [] args)
{
 int add, sub, mul; 
 double div;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a First integer");
  int a = sc.nextInt();

   System.out.println("Enter a Second integer");
   int b = sc.nextInt();
   
   	   System.out.println("1.Enter A for Addition");
       System.out.println("2.Enter B for Subtraction");
       System.out.println("3.Enter C for Multiplication");
       System.out.println("4.Enter D for Division");

       char ch=sc.next().charAt(0);

  
   switch(ch)
  {
	   case 'A':
       add = a + b;	
	   System.out.println("Additional of "+ a + " and " + b +" is "+add);
       break;
	
       case 'B':
       sub =  a - b;	
	   System.out.println("Substraction of "+ a +" and " + b +" is "+sub);
       break;
	   
	   
	    case 'C': 
       mul =  a * b;	
	   System.out.println("Multiplication of "+ a +" and "+ b +" is "+mul);
       break;
	   
	    case 'D':
       div =  a / b;	
	   System.out.println("Division of "+ a +" and "+ b +" is "+div);
       break;
	   
	
	   
			   
			   
			   
	 default : System.out.println(" Invalid operator");
		
  }
  
}
}


