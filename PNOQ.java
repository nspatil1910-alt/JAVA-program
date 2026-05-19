/*q4.Write a Java program to check whether a number is positive , negative or zero.*/

import java.util.Scanner;
class PNOQ
{
public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
         int num = sc.nextInt();


    if(num>0)
	{
	System.out.println("Enter a Positive");
	}
	else if(num<0)
	{
	System.out.println("Enter a Negative");
	}
	else
	{
	System.out.println("Enter a Zero");
	}
}
}
	
	