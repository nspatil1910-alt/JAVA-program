/*Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If SP > CP ? Profit
If SP < CP ? Loss

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo7{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a Cost Price");
       double  cp = sc.nextDouble();
       
       System.out.println("Enter a Selling Price");
       double sp = sc.nextDouble();
      
       if(cp>sp){
           System.out.println("Loss"+(cp-sp));
       }
       else{
        System.out.println("Profit"+(sp-cp));

       }

    }
}

