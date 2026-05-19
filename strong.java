/*Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,*/

import java.util.Scanner;
 public class strong

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	  int num=sc.nextInt();
	  
	   int original=num;
        int sum=0;
     
     while(num>0)
	 {
		  int fact =1;
          int lastdigits = num%10;
		  for(n=1; i<=lastdigits;i++)
		  {
			  fact=fact*i;
		  }
		  sum=sum+fact;
		  num=num/10;
	 }
	 if(original==sum)
	 {
		 System.out.println(" It  Is Strong Number");
	 }
	 else
	 {
		 System.out.println(" Not It  Is Strong Number");
	 }
   
   }
 }  