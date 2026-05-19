/*Q20. Write a java program to swap first and last digits of a number.*/

import java.util.Scanner;
class swapfirstandlastdigits
{                                                                                                                                                                                                                                                                                                                                                 
	public static void main(String[]args)
	{ 
		 
		Scanner sc = new Scanner(System.in);
		Syste.out.println("Enter a Number");
		int num = sc.nextInt();
		Syste.out.println("Enter a First Number");
		int firstno = sc.nextInt();
		
		Syste.out.println("Enter a Last Number");
		int lastno = sc.nextInt();
		
		int lastdigit=num%10;
		
		int firstno =num;
		int count=0;
		
		while(firstno>10)
		{
			count++;
			first no=firstno/10;
			
			System.out.println("the first number "+firstno);
			System.out.println("the total count is"+count);
			
			int p=1;
			for(int i=1;i<=count;i++);
			p=p*10;
		}
		System.out.println(" power is"+p);
		
		int middle=num;
		
		int middleno=middle%p;
		
		System.out.println(" middle no ="+middleno);
	
	int swapfirstandlast = lastdigit*p+middleno-lastdigit+firstno;
	
	System.out.println(" final is"+swapfinal);
	}
}
		
			
		
		