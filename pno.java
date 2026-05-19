/*Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers*/

import java.util.Scanner;
class pno
{
public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  
  System.out.println(" Number is positive negative or zero.");
  int a = sc.nextInt();

   System.out.println(" Number is even or odd");
   int b = sc.nextInt();
   
    System.out.println(" Max Number ");
   int c = sc.nextInt();
   
       System.out.println(" Enter a choice ");
   	   System.out.println(" Number is positive , negative or zero");
       System.out.println(" Number is even or odd");
       System.out.println("max number ");

   char ch =sc.next().charAt(0);
   
        switch(ch)
     {
	   case '1':
	   
          	 System.out.println("Enter Number");
			 int num1= sc.nextInt();
			 if(num1>0)
			    {
				 System.out.println(" Number is Positive ");
			   }
			 else if(num1<0)
			      {
				 System.out.Println(" Number is Negative ");
                }
             else
			   {  
                 System.out.println(" Number is Zero ");
				 
			 }
		case '2':
		
                 int num2 =sc.nextInt();
                 if(num2%2==0)
			      {
				 System.out.println(" Number is Even ");
			     }
			    else
			      {
				 System.out.println(" Number is odd ");
			    }
		case '3':
		        
				int a =sc.nextInt();
				int b =sc.nextInt();
				
				if(a>b)
				{
					System.out.println(" a is greater ");
				}
				else if(a<b)
				{
					System.out.println(" b is greater ");
				}
				
			 default: System.out.println(" Invalid ");
}
}
}


