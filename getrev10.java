/*Q10. Write a recursive function to reverse a given number.
Explanation:
Take the last digit and place it in reverse order.
Continue recursion by removing the last digit.
Stop when the number becomes 0.
Example: Input: 123		 Output: 321*/

import java.util.Scanner;
public class getrev10
{
	public static void main(String[] args)
	{
	 Scanner sc  = new Scanner(System.in);
      System.out.println("Enter number from keyboard");
	  int num = sc.nextInt();
      int result=getrev(num,0);
	  System.out.println("Reverse number is  "+result);
}
	public static int getrev(int no,int r){
		if(no!=0)
		{
			int rem=no%10;
			no=no/10;
			r=r*10+rem;
			return getrev(no,r);
         }
		 else
		 {
		 return r;
	     }
     }   
}
