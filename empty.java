/*Q18. Write a Java program to check whether a given array is empty or not.

Explanation
Every array has a predefined property called length.
If array.length == 0, then the array is empty.
Otherwise, the array contains elements.

Input :- Array elements: { }
Output :- Array is empty*/


import java.util.Scanner;
public class empty
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int arr[] = {114,25,469};
		if(arr.length==0)
		{
		System.out.println("the input array is an empty array");
        }
		else
		{
		System.out.println("the input array is an not empty array");

        }
	}
}	