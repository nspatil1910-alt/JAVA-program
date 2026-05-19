/*Question 20: Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square.
Input:
Number = 49

Output
Perfect Square

Explanation:
Square root of 49 is 7, which is an integer.
Therefore, 49 is a Perfect Square.
If the square root contains a decimal value, then it is not a Perfect Square.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
		int num = sc.nextInt();
		int i=1;
		int sum=0;
		
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(num==sum)
		{
			System.out.println("perfect Number");
		}
		else
		{
			System.out.println(" Not perfect Number");
		}
	}
}