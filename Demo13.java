/*Question 13: Write a java program to accept two integers and check whether they are equal or not.
Input:
Number1 = 15
Number2 = 15

Output
Both numbers are equal

Explanation:
If Number1 == Number2, print equal.
Otherwise, print not equal.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo13{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
 int a = sc.nextInt();
 System.out.println("Enter Second Number");
 int b = sc.nextInt();

if(a==b)
 {
    System.out.println("Equal");
}
else
{
    System.out.println("Not Equal");
}

}
}