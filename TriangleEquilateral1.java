/*q3.Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.*/

import java.util.Scanner;

public class TriangleEquilateral1
 {
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter Sides 1: ");
        int a = input.nextInt();
		
        System.out.print("Enter Sides 2: ");
        int b= input.nextInt();
		
        System.out.print("Enter Sides 3: ");
        int c= input.nextInt();
		
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
	
