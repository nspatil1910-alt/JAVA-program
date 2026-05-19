/*Q36. Write a java program to find HCF (GCD) of two numbers.*/

import java.util.Scanner;
public class Hcfoftwonumbers

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a first number");
	  int c = sc.nextInt();
	   System.out.println("Enter a second number");
	  int d = sc.nextInt();
	  
	  int Hcf=1;
	  int i=1;
	  int min=(c<d)?c:d;
	  
	  while(i<=min)
	  {
		  if(c%i==0 && d%i==0)
		  {
			  Hcf=i;
		  }
	  }
	  System.out.println(" The Hcf is "+Hcf);
   }
 }
	   
	  
	  
