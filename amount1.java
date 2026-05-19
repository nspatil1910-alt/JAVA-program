/*Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.*/

39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.*/

import java.util.Scanner;
public class amount1
{
  public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the amount");
      int salesamount=sc.nextInt();
	 
	  if(salesamount<5000)
	    {
	      double commission =0.02*salesamount;
	     System.out.println("commission"+ commission);
	    }
	      else if(salesamount>=5000 && salesamount<=10000)
		   {
	        double commission=0.05*salesamount;
	       System.out.println("commission"+ commission);
	       }
		     else if(salesamount>10000)
		     {
		       double commission=0.10*salesamount;
		      System.out.println("commission"+ commission);
	         }
		       else 
			    {
			     System.out.println("No commision");
			    }
				
	
	
	}
}