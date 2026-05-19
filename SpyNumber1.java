/*Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8 */
	
import java.util.Scanner;
public class SpyNumber1

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	  int num=sc.nextInt();
      int temp=num;
	  int sum=0;
	  int product =1;
	  int digit =0;
	  while(num!=0)
	  {
		  digit = num %10;
		  sum = sum+digit;
		  product = product * digit;
		  num = num /10;
	  }
	  if(sum == product)
	  {
		  System.out.println(" It Is Spy Number");
	  }
	  else
	  {
		  
		  System.out.println(" It Is Not Spy Number");
	  }
   }
 }