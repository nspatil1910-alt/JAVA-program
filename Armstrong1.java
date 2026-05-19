/*Q33. Write a java program to display 1 to nth Armstrong Number.*/

import java.util.Scanner;

public class Armstrong1

 {
   public static void main(String[]args)
   {  
   Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the Number");
	int n = sc.nextInt();
	int temp;
	int sum=0;
	int Armstrong=0;
	int original = n;
	while(n>0)
	{
		temp =n%10;
		temp = (int) Math.pow(temp, 5);
		Armstrong = Armstrong + temp;
		n = n/10;
	}
		if(sum == original)
		{
			System.out.println(" It is Armstrong Number");
		}
		else
		{
			System.out.println(" It is Not Armstrong Number");

		}
   }
 }
 
