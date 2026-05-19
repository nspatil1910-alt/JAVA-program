/*Question 28: Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
Input:
a = 8
b = -4
c = -2

Output:
Root1 = 0.80
Root2 = -0.30

Explanation:
D = (-4)² - 4(8)(-2)
D = 16 + 64 = 80

Since D > 0, two distinct real roots exist.
Roots are calculated using quadratic formula.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number");
        double a = sc.nextDouble();
        System.out.println("Enter a Second Number");
        double b = sc.nextDouble();
        System.out.println("Enter a Thrid Number");
        double d = sc.nextDouble();
          d =0;
        if(D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Roots are real and different:");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);

        } else if (D == 0) {
            double root = -b / (2 * a);

            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);

        } else {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-D) / (2 * a);

            System.out.println("Roots are complex:");
            System.out.println("Root1 = " + realPart + " + " + imagPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imagPart + "i");
        }
    }
}