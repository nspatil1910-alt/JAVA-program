/*Q10. Write a java program to count the number of digits in a number.*/

import java.util.Scanner;
class numberofdigits
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		   int count=0;
		System.out.println(" the number of digits in a number ");
		int num =sc.nextInt();
     
	 while(num!=0)
	 {
		 num=num/10;
		 ++count;
	 }
	}
}
	
	 