/*Question 40: Calculate commission based on sales amount:
? Input: Sales amount
? Logic:
? Sales < 5000 ? 2% commission
? Sales 5000–10000 ? 5% commission
? Sales > 10000 ? 10% commission
? Output: Display commission amount.
Input:
Sales = 12000

Output:
Commission = 1200

Explanation:

Sales < 5000 ? 2%
5000–10000 ? 5%
10000 ? 10%
12000 × 10% = 1200

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;

public class Demo40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();
        double commission;

        if (sales < 5000) {
            commission = sales * 0.02;
        } else if (sales <= 10000) {
            commission = sales * 0.05;
        } else {
            commission = sales * 0.10;
        }

        System.out.println("Commission = " + commission);
    }
}