/*Question 19: Given a score out of 100, print Excellent (?90), Good (?75), Average (?50), Poor (< 50) — using nested ternary operators.
Input:
Score = 82

Output:
Good

Explanation:
82 is greater than 75 but less than 90, so the grade is "Good".
Nested ternary operators are used instead of multiple if-else statements.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;

public class ScoreCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = sc.nextInt();

        String result = (score >= 90) ? "Excellent" :
                        (score >= 75) ? "Good" :
                        (score >= 50) ? "Average" :
                        "Poor";

        System.out.println("Result: " + result);
    }
}