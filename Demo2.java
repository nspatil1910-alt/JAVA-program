/*Question 2: Write a Java program to check whether a triangle is valid or not.
Input:
A = 5, B = 6, C = 7

Output:
Valid Triangle

Explanation:
A triangle is valid if the sum of any two sides is greater than the third side.

Asked In Companies:
Just Practice assignment*/
import java.util.Scanner;
public class Demo2{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Triangle");
         int a1 = sc.nextInt();
		 System.out.println("Enter a second Triangle");
         int a2 = sc.nextInt(); 
		 System.out.println("Enter a thrid Triangle");
         int a3 = sc.nextInt();
        int sum = a1 + a2 + a3;	
	
	if(a1+ a2+ a3 ==180)
	{
		System.out.println("\ Invalid Triangle");
		
     }
	 else 
	 {
		 System.out.println(" Valid Triangle");
	 }
 }
}
 