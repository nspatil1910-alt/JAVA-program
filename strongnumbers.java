/*Q32. Write a java program to display 1 to nth Strong Number.*/

import java.util.Scanner;
public class strongnumbers
 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter the Number");
	 int num = sc.nextInt();
     int temp = num;
	  int sum=0;
	while(temp!=0)
	{
		int rem = temp%10;
		int fact =1;
		
	    while(temp!=0)
		{
		   fact = fact*rem;
			rem--;
		}
		  sum = sum + fact;
          temp = temp/10;
		  }
		if(num == sum)
		{
			System.out.println(" It is strong Number");
		}
		else
		{
			System.out.println(" It is Not strong Number");

		}
   }
 
 }
