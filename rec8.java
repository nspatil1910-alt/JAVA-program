/*Q8. Write a Java program that uses a void function to calculate power of a number using a loop.
Explanation
Pass base and exponent to the function
Multiply base repeatedly using a loop
Print the final result inside the function*/


import java.util.Scanner;
class rec8
{
	public static void main(String[]args)
	{ 
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a exponent power");
		int exponent =sc.nextInt();
		System.out.println("Enter a base power");
	    int base =sc.nextInt();
		power(base,exponent);
	}
	public static void power(int base,int exponent){
		int result=1;
		for(int i=1;i<=exponent;i++)
		{
			result=result*base;
			{
				System.out.println("result is"+result);
			}
		}
	}
}

		