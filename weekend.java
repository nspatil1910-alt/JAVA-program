/*Q54. Develop a Java program using switch to print the day type for an input day number (1-7):
1 for Monday, …, 7 for Sunday.
For 1-5, display “Weekday”; for 6-7, display “Weekend”.
Explanation: Use switch with multiple cases falling through for weekdays and weekends.*/

import java.util.Scanner;
class weekend
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a weekend");
   char ch=sc.next().charAt(0);


   switch(ch)
  {
	   case 'A': System.out.println("Monday");
	           break;
	
	   case 'B': System.out.println("Tuesday");
	           break;
			   
	   case 'C' : System.out.println("Wednesday");
	           break;
		
	   case 'D' : System.out.println("Thursday");

	           break;
			    
	   case 'E': System.out.println("Friday");
	           break;
			   
	   case 'F': System.out.println("Saturday");
	           break;
			   
		case 'G': System.out.println("Sunday");
	           break;
			   
			   
			   
	 default : System.out.println(" Invalid");
		
  }
  
}
}

