/*Q35. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array*/

import java.util.Scanner;
public class squarearray
{
    public static void main(String[] args)
    {
	  int a[]= new int[]{2,4,6,8};
	  int newarr;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Array element ");
	   for(int i = 0;i<a.length;i++)
	    {
		   a[i] = sc.nextInt();
		 
		} 		
	    System.out.println("Enter New Array element ");
	      for(int i = 0;i< a.length;i++)

	  {
		   newarr = a[i] * a[i];
		  System.out.println( "newarr" +newarr);
	  }
	}
}	
	  