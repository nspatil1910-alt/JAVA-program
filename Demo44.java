/*Question 44: Calculate fine for library book return:
? Input: Number of days late
? Logic:
? Up to 5 days ? ?2/day
? 6–10 days ? ?3/day
? 11–30 days ? ?5/day
? More than 30 days ? Membership canceled + ?500 fine
? Output: Total fine + membership status.
Input
Days Late = 12

Logic
Up to 5 days ? ?2 per day
6–10 days ? ?3 per day
11–30 days ? ?5 per day
More than 30 days ? ?500 fine + Membership canceled

Output
Total Fine = ?60
Membership Status = Active

Explanation
12 days falls in 11–30 range.
Fine = 12 × 5 = 60

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;

public class Demo44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late days: ");
        int days = sc.nextInt();

        int fine = 0;

        if (days <= 5) {
            fine = days * 2;
        } 
        else if (days <= 10) {
            fine = (5 * 2) + (days - 5) * 4;
        } 
        else {
            fine = (5 * 2) + (5 * 4) + (days - 10) * 6;
        }

        System.out.println("Total fine = " + fine);
        System.out.println("Membership Status = Active ");
        
    }
}

