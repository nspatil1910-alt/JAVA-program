/*Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.
Input:
A = 5, B = 5, C = 5

Output:
Equilateral

Explanation:
All sides equal ? Equilateral
Two sides equal ? Isosceles
All sides different ? Scalene

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter Sides 1: ");
        int a = sc.nextInt();
		
        System.out.print("Enter Sides 2: ");
        int b= sc.nextInt();
		
        System.out.print("Enter Sides 3: ");
        int c= sc.nextInt();
		
		if(a==b && b ==c)
		{
		System.out.println("equilateral");
		}
		if(a==b || b==c ||a==c)
		{
		System.out.println("isoscale");
		}
		else
		{
		System.out.println("scalene");
		}
	}
}
	
