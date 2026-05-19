/*Question 43: Mobile plan billing system:
? Input: Minutes used in a month
? Logic:
? Up to 100 mins ? Base ?199
? 101–300 mins ? ?199 + ?1/min for extra
? 301–500 mins ? ?199 + ?1.5/min for extra
? Above 500 mins ? ?199 + ?2/min for extra
? Output: Total monthly bill.
Input
Minutes Used = 350

Logic
Up to 100 mins ? ?199

101–300 mins ? ?199 + ?1 per extra minute

301–500 mins ? ?199 + ?1.5 per extra minute

Above 500 mins ? ?199 + ?2 per extra minute

Output
Total Bill = ?574

Explanation
Extra minutes = 350 ? 100 = 250
Since usage is in 301–500 range:
Extra charge = 250 × 1.5 = 375
Total Bill = 199 + 375 = 574

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;

public class Demo43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int plan, calls;
        double bill = 0;

        System.out.println("Select Plan (1 / 2 / 3): ");
        plan = sc.nextInt();

        System.out.println("Enter number of calls used: ");
        calls = sc.nextInt();

        switch(plan) {
            case 1:
                bill = 199;
                if(calls > 100) {
                    bill += (calls - 100) * 1;
                }
                break;

            case 2:
                bill = 399;
                if(calls > 300) {
                    bill += (calls - 300) * 0.8;
                }
                break;

            case 3:
                bill = 599;
                break;

            default:
                System.out.println("Invalid Plan!");
                return;
        }

        System.out.println("Total Bill = " + bill);
    }
}