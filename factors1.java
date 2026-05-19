/*Q38. Write a java program to find all prime factors of a number.*/

import java.util.Scanner;
public class factors1
 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter the Number");
	 int n = sc.nextInt();
	 
	 System.out.println(" Enter prime Number ");
	  int i = sc.nextInt();
	  
	  while(n%2 == 0)
	  {
	    System.out.println(2);
		n = n/2;
	  }
	  
	  for(i = 3;i<=Math.sqrt(n);i = i+2)
	  {
		while(n%i == 0)
		{
		System.out.println(i);
		n = n/i;
		}
	  }
   }
 }
	 
