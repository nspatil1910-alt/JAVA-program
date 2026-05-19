/*Q15. Write a java program to find common elements between two arrays.
Input :
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.*/

import java.util.Scanner;
public class commonelements
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
	     int a[] = {1,2,3,4,5};
		 int b[] = {3,4,5,6,7};
	    System.out.print("Enter common Elements =");
		for(int i =0;i<a.length;i++)
	    {	
	       int n = a[i];	
		for(int j=0;j<b.length;j++)
		{
		if(n == b[j])
		 {
			System.out.print(n+" ");
		  }
	   
	   }
     }	
	} 
}