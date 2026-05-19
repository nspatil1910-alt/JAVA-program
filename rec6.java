/*Q6.Write a Java program that uses a void function to check whether a given two-digit number is a special number.
A number is special if: (sum of digits + product of digits) = original number
Explanation
Pass the number to a function
Extract digits using % and /
Calculate sum and product
Print result inside the function*/

import java.util.Scanner;
public class rec6
{
	public static void main(String[] args)
		{ 
			Scanner sc = new Scanner(System.in);
			System.out.println("two-digit number");
			int num= sc.nextInt();
			Maxrec(num);
		}
	 public static void Maxrec(int num){
		
		int digit1 = num/10;
		int digit2 = num%10;
		
		int sum = digit1+digit2;
	    int product=digit1*digit2;
		
		if(sum+product==num)
		{
			System.out.println(num+ " is a special number ");
		}
		else
		{
			System.out.println(num+ " is Not a special number ");
		}
	 }
}


			