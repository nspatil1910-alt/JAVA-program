/*Question 30: Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming
Input:
Month = 2

Output
28 or 29 Days

Explanation:
January, March, May, July, August, October, December ? 31 days

April, June, September, November ? 30 days

February ? 28 days (29 in leap year)

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month");
       int month=sc.nextInt();
  
  if(month==1)
  {
	  System.out.println("31 Days");
  }
  else if(month==2)
  {
	  System.out.println("29/28 Days");
  }
  else if(month==4)
  { 
      System.out.println("31 Days");
  }
  
   else if(month==5)
  { 
      System.out.println("30 Days");
  }
  
    else if(month==6)
  { 
      System.out.println("31 Days");
  }
  
   else if(month==7)
  { 
      System.out.println("30 Days");
  }
  
   else if(month==8)
  { 
      System.out.println("31 Days");
	  
  }
  else if(month==9)
  { 
      System.out.println("30 Days");
	  
  }
  else if(month==10)
  { 
      System.out.println("31 Days");
	  
  }
  else if(month==11)
  { 
      System.out.println("30 Days");
	  
  }
	else if(month==12)
  { 
      System.out.println("31 Days");
	  
  } 
    
}
}

  

