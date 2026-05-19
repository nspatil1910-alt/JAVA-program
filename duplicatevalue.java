/*Q14.  Write a java program to remove duplicated values from arrays.

Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates*/

import java.util.Scanner;
public class duplicatevalue
{
    public static void main(String[] args)
    { 
	    Scanner sc = new Scanner(System.in);
		int a[] = new int[7];
		System.out.println(" Enter Array elements ");
		for(int i = 0 ;i<a.length; i++)
		{
			 a[i] = sc.nextInt();
		}
		System.out.println(" Enter the Unique elements ");
		for(int i=0; i<a.length ; i++)
		{
			boolean isDuplicate = false;
			
			for(int j=0;j<i;j++)
			
				if(a[i] == a[j])
				{
					isDuplicate = true;
					break;
				}
			
			if(!isDuplicate)
			{
				System.out.print(a[i]+ " " );
			
			}
		}
    }
}	