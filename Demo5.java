/*Question 5: Write a Java program to check whether a number is divisible by 5 and 11 or not.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
If number % 5 == 0 AND number % 11 == 0.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
         int num = sc.nextInt();
 
        if(num%5==0 && num%11 ==0)
     {
	    System.out.println("it is dividend by 5&11");
 }
else
 {
	 System.out.println("it is  not dividend by 5&11");
 }
 
    }
}