/*Q37. Write a java program to find LCM of two numbers.*/

import java.util.Scanner;

class Lcfoftwonumbers

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a first number");
	  int c = sc.nextInt();
	   System.out.println("Enter a second number");
	  int d = sc.nextInt();
	  int HCF =1;
	  int i =1;
	  int min=(c<d)?c:d;
	  
	  while(i<=min)
	  {
		  if(c%i==0 && d%i==0)
		  {
			  HCF=i;
		  }
		  i++;
	  }
	  System.out.println(" The HCF is "+HCF);
	    int LCM = (c * d) / HCF;
       System.out.println(" The LCM is "+LCM);
	 
   }
 }
	   
	  