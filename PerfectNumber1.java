/*Q30.  Write a java program to display 1 to nth Perfect Number.*/

 import java.util.Scanner;
  public class PerfectNumber1

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	  int n = sc.nextInt();
	  int sum=0;
	  int count=0;
	 
	  while(count < n)
	  {
		  
		  for(int i = 1; i <= n; i++)
		  {
			  for(int j = 1; j <= n; j++)
			  {
			  if(i % j == 0)
			  
			    {
				 sum=sum+j;
		        }
				j++;
				
	          }    
	     if(i==sum)
	    {
		  System.out.println(i+" ");
		  
	    }
	     sum=0;
	  
   }
 }
   }
	  
 }     
