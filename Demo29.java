/*Question 29: Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition.
                For first 50 units Rs. 0.50/unit
                For next 100 units Rs. 0.75/unit
                For next 150 units Rs. 1.20/unit
                For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
Input:
Units = 300

Output:
Total Electricity Bill = Calculated Amount

Explanation:
First 50 units ? 50 × 0.50
Next 100 units ? 100 × 0.75
Next 150 units ? 150 × 1.20
Remaining units ? 50 × 1.50
Total amount is calculated and then 20% surcharge is added.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Eniter first Units");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 1;
        } 
        else if (units <= 200) {
            bill = (100 * 1) + (units - 100) * 2;
        } 
        else if (units <= 300) {
            bill = (100 * 1) + (100 * 2) + (units - 200) * 3;
        } 
        else {
            bill = (100 * 1) + (100 * 2) + (100 * 3) + (units - 300) * 5;
        }

        System.out.println("Total Electricity Bill =  " + bill);
        System.out.println("Total Electricity Bill = Calculated Amount");
    }
}