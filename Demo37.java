/*Question 37: Compare two numbers: greater, smaller, or equal.

   Input: Two integers
   Logic: if-else if
   Output: Greater, smaller, or equal.
Input:
A = 25
B = 30
Output:
A is smaller than B
Explanation:
Use if-else to compare values.

Asked In Companies:*/

import java.util.Scanner;

public class Demo37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of A: ");
        int A = sc.nextInt();

        System.out.print("Enter value of B: ");
        int B = sc.nextInt();

        if (A > B) {
            System.out.println("A is greater than B");
        } 
        else if (A < B) {
            System.out.println("A is smaller than B");
        } 
        else {
            System.out.println("A is equal to B");
        }
    }
}