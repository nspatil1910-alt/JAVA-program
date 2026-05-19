 //*q7.Write a Java program to input cost price and selling price of a product and check profit or loss.*/
 
import java.util.Scanner;
class check
{
public static void main(String[] args)
 {
	   Scanner sc = new Scanner(System.in);
        System.out.println("Enter sellingprice");
	 int sellingprice = sc.nextInt() ;
	 System.out.println("Enter costprice");
	 int costprice = sc.nextInt();
      
   if(sellingprice<costprice)
   {
   System.out.println("lost");
   }
   else if(costprice>sellingprice)
   {
   System.out.println("profit");
   }
   else
   {
   System.out.println("proft or loss");
   }
   
}  
}