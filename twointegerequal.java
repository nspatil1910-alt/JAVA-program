/*Q22. Write a Java program to check whether two integer arrays are equal.
 Two arrays are considered equal if:
1.Both arrays have the same length
2.Corresponding elements at each index are exactly the same
Do not use inbuilt methods like Arrays.equals().
Input :- Array1 = {10, 20, 30, 40}
         Array2 = {10, 20, 30, 40}

Output :- Arrays are equal.
Explanation
1.First, check if the lengths of both arrays are equal
2.If lengths are different → arrays are not equal
3.If lengths are same, compare elements one by one using a loop
If any element mismatch is found → arrays are not equal
4.If all elements match → arrays are equal*/

import java.util.Scanner;
public class twointegerequal
 {
 public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);  
     int a[] = new int[5];
	 int b[] = new int[
    System.out.println(" Enter a First Array are Equal");
	for(int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println(" Enter a Second  Array are Equal");
	for(int i=0;i<b.length;i++)
	{
		b[i] = sc.nextInt();
			break;
	}
	boolean isEqual = true;
	if(a.length!=b.length)
	{
		isEqual = false;
	
	}
	if(!isEqual)
	{
		System.out.println(" Array are the found ");
	}
	else
	{
	  System.out.println(" Array are not the found ");
	}
  }
  
}	

		
	
	
 
