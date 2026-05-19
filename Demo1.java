/*Question 1: Write a Java program to check whether a number is even or odd.
input:
Number = 8

Output:
Even

Explanation:
If a number is divisible by 2, it is Even. Otherwise, it is Odd.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter a Number");
 int i = sc.nextInt();

 if(i%2==0){
    System.out.println("Even");   
 }
 else
 {
    System.out.println("odd");
 }
}
}