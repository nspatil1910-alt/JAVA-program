/*Question 17: Write a java program to find the maximum between two numbers.
Input:
Number1 = 45
Number2 = 30

Output
Maximum number = 45

Explanation:
If Number1 > Number2, print Number1.
Otherwise, print Number2.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Number");
double num1=sc.nextDouble();

System.out.println("Enter the Second Number");
double num2= sc.nextDouble();

System.out.println(" The Maximum of =+ Maximum ");

System.out.print("The maximum of " + num1 +" and " + num2 +" is:");
if (num1 > num2) {
System.out.println(num1);
} else {
System.out.println(num2);
}
    }
}