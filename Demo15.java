/*Question 15: Write a java program to find the minimum between two numbers.
Input:
Number1 = 8
Number2 = 12

Output
Minimum number = 8

Explanation:
Compare both numbers using if-else.
The smaller value is printed as minimum.

Asked In Companies:
Just Practice assignment*/
import java.util.Scanner;
public class Demo15{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Number");
int num1=sc.nextInt();

System.out.println("Enter the Second Number");
int num2= sc.nextInt();

System.out.println(" The Minimum of =+ Minimum");

System.out.print("The minimum of " + num1 +" and " + num2 +" is:");
if (num1 < num2) {
System.out.println(num1);
} else {
System.out.println(num2);
}
    }
}
