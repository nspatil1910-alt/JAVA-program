/*Q14. Write a java program to check whether a number is palindrome or not.*/

import java.util.Scanner;
class palidndrome1
{
	public static void main(String[]args)
	{
		
		int r;
		int c;
		int s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int n =sc.nextInt();
     
	 c=n;
	 while(n>0)
	 {
	   r=n/10;
	   s=(s*10)+r;
	   n=n/10;
	   }
	   if(c==s)
	   {
	   System.out.println(" palindrome Number");
	   }
	   else
	   {
         System.out.println(" Not palindrome Number");
	   }
	}
}