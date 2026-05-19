/*Question 21: Write a java program to check whether a number is neon or not neon without using loop.
Input:
Number = 9

Output
Neon Number

Explanation:
Square of 9 = 9 * 9 = 81
Sum of digits of 81 = 8 + 1 = 9
Since sum (9) equals the original number (9), it is a Neon Number.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
       int Sum =9;
        int Square = num*num;
        System.out.println("Square :"+Square);
        System.out.println("Sum " + Sum);
          Sum = (Square/10)+(Square%10);
        if(num == Sum){
            System.out.println("It is Neon Number");
        }
        else 
        {
            System.out.println("It is Not Neon Number");
        }
    }
}