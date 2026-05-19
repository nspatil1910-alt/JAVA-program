/*Q8. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.*/

import java.util.Scanner;
public class missingelements
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int arr[] = {1,2,4,5,7};
		int b = 7;
		int c = 0;
		
		System.out.println("find missing elements in an array");
		for(int n =1;n < n; n++)
		{
			if(i < arr.length && arr[i] == n)
			{
	    i++;
	   }
	else 
	{
		System.out.print(n + " " );
    }
}		
}
}
