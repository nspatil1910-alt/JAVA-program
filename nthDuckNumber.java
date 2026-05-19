/*Q31. Write a java program to display 1 to nth Duck Number.*/


import java.util.Scanner;
 public class nthDuckNumber

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a n");
	  int n=sc.nextInt();
	   int r =0;
	   int c=0;
	   while(n!=0)
	   {
		   r=n%10;
		   if(c ==0)
			   ++c;
		   n=n/10;
	   }
	   if(c>0)
	   {
	   System.out.println(" Duck No");
    
	   }
	else
	{
		System.out.println(" Not Duck No");
	}
 }
 }

