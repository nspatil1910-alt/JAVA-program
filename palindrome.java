/*Q22. Write a java program to check whether a number is palindrome or not.*/

import java.util.Scanner;
class palindrome
{
public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number");
  
  int num =sc.nextInt();
  int org_num=num;
  
   int rev=0;
   
   if(org_num==rev)
   {
      System.out.println(org_num+" This is palindrome");
	  }
	 else
	 {
	 System.out.println(org_num+" This is not palindrome");
	 }
	 
	}
}
	