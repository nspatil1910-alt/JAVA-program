/*Question 11: Write a java program to find a maximum between three numbers.
Input:
Number1 = 25
Number2 = 40
Number3 = 32

Output
Maximum number = 40

Explanation:
The program compares all three numbers using conditional statements.
If Number1 is greater than Number2 and Number3, then it is maximum.
Otherwise, compare Number2 and Number3 to find the largest value.

Asked In Companies:
Just Practice assignment*/
import java.util.Scanner;
public class Demo11{
    public static void main(String[] args){

System.out.println("Enter a First Number");
int num1 = sc.nextInt();
System.out.println("Enter a Second Number");
int num2 = sc.nextInt();
System.out.println("Enter a THrid Number");
int num3 = sc.nextInt();

 num1=25;
 num2=40;
 num3=32;

if(num1<=num2 && num1>=num3)
System.out.println(num1+" is Maximium");

else if(num2>num1 && num2>num3)
System.out.println(num2+" is Maximum");

else
System.out.println(num3+" is Maximum");

    }
}