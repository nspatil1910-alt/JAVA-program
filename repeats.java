/*Q34. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5


Explanation:
Traverse from left:
10 → first time.
5 → first time.
3 → first time. 
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.*/


import java.util.Scanner;
public class repeats
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
      System.out.println("Enter given array ");
      int size = sc.nextInt();
      int a[] = {10,5,3,4,3,5,6};
    
     for(i =0;i<a.length;i++)
	 {
        for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{ 
		     System.out.println("First repeating element is"+a[i]);
			}
		}
	 }
	}
}	