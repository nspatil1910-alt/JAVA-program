/*Q2. Write a Java program to check whether a triangle is valid or not.*/

import java.util.Scanner;
class TriangleValidator1
{
public static void main(String[] args)
 {
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
		System.out.println("Enter a valid Triangle");
		
     }
	 else 
	 {
		 System.out.println("Enter a InValid Triangle");
	 }
 }
}
 