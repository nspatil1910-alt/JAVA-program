/*Q9. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.*/

import java.util.Scanner;
public class copyarray
{
    public static void main(String[] args)
    {
	int a1[] = {5,10,15,20};
	int a2[] = new int[a1.length];
	
	for(int i=0;i<a1.length;i++)
	{
	  a2[i] = a1[i];
	  }
	  System.out.println("Elements of Array 2:");
	  
	  for(int i=0 ;i<a2.length;i++)
	  {
	  System.out.print(a2[i]+" ");
	  }
    }
}	  
	
	
	