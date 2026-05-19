/*Q18. Write a java program to find the first and last digit of a number.*/

import java.util.Scanner;
class firstandlastdigit
{                                                                                                                                                                                                                                                                                                                                                 
	public static void main(String[]args)
	{ 
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number =sc.nextInt();
		 int num=Math.abs(number);
        int lastdigit=number%10;
        int firstdigit=num;
        while(firstdigit>=10)
		{
			firstdigit=firstdigit/10;
		
		}
          System.out.println("The first digit number " + number+ " is"+ firstdigit);
            System.out.println("The last digit number " + number+ " is"+ lastdigit);		  
	}
}


