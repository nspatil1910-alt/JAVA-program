/*Q6. Write a recursive function that prints numbers from 1 to N.
Explanation:
The function should print the current number.
It should call itself with the next number.
Stop when the number becomes greater than N.
Example:
 Input: N = 5
 Output: 1 2 3 4 5*/
 
import java.util.Scanner;
public class functionrec6
{
	public static void main(String[] args)
	    {
		 Scanner sc = new Scanner(System.in);
        
		  int PrintNumbers = 5;
		  PrintNumbers(PrintNumbers);
	    }
	     public static void PrintNumbers(int N){
			 int i=1;
			 while(i<=N){
				 System.out.println(i);
				 }
                return 0;
		 
		 }
}		 
		 