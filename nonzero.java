/*Q13. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.*/

import java.util.Scanner;
public class nonzero
{
    public static void main(String[] args)
    {
      int num[] = {1,0,5,0,7,0,9};
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Array value ");
	  
	  for(int i = 0;i< num.length ; i++)
	    {
		   num[i] = sc.nextInt();
		   
	    }
	  for(int i = 0;i< num.length ; i++)
	  {
		  if(num[i]!=0)
		  {
			  System.out.println(num[i] + " ");
		  }
	  }		  
	}
}	