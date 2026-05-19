/*Q19. Write a java program to find the sum of the first and last digit of a number.*/

import java.util.Scanner;
class firstandlastdigit
{                                                                                                                                                                                                                                                                                                                                                 
	public static void main(String[]args)
	{ 
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number =sc.nextInt();
		 int sum=0;
        int lastdigit=number%10;
        int firstdigit=num;
        while(firstdigit>=10)
		{
			firstdigit=firstdigit/10;
			sum=firstdigit+lastdigit;
		
		}
          System.out.println("The sum of firstdigit" + number + " lastdigit "+ number+ " is "+ sum);
            	  
	}
}


