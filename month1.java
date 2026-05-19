/*Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.*/

import java.util.Scanner;
class month
{
public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter a month number(1-12): ");
  int month=sc.nextInt();
  System.out.println("Enter a Leap Year");
  int Leap=sc.nextInt();
  
  switch(month)
  {  
  case 1:
     System.out.println("month 1");
	 System.out.println("January");
     System.out.println("31");
     break;
	 
  case 2:
  {
     if((Leap Year =( year % 4 == 0 && year % 100 != 0)) || ( year % 400 == 0)
    
     System.out.println("month 2");
	 System.out.println("Feburary");
      }
	if else	 
	  {
	 System.out.println("29");
      break;
	 }
	
  case 3:
     System.out.println("month 3");
	 System.out.println("March");
	 System.out.println("31");
      break;
	  
	  
  case 4:
     System.out.println("month 4");
	 System.out.println("April");
	 System.out.println("30");
      break;
	  
  case 5:
     System.out.println("month 5");
	 System.out.println("May");
	 System.out.println("31");
      break;
	  
  case 6:
     System.out.println("month 6");
	 System.out.println("June");
	 System.out.println("30");
      break; 
	  
  case 7:
     System.out.println("month 7");
	 System.out.println("July");
	 System.out.println("31");
      break;
	  
  case 8:
     System.out.println("month 8");
	 System.out.println("August");
	 System.out.println("31");
      break;
	  
	  
  case 9:
     System.out.println("month 9");
	 System.out.println("September");
	 System.out.println("30");
      break;
	  
	  
   case 10:
     System.out.println("month 10");
	 System.out.println("October");
	 System.out.println("31");
      break;
	  
   case 11:
	   System.out.println("month 11");
	   System.out.println("November");
	   System.out.println("30");
	   break;
	   
   case 12:
	   System.out.println("month 12");
	   System.out.println("December");
	   System.out.println("31");
	   break;
	   
	   default : System.out.println(" Invalid Month ");
  }
}
}	   
  