/*Q24. Write a program in java to rotate an array by N positions ?
	
Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9*/
	
	
import java.util.Scanner;
public class rotatearray
{
 public static void main(String [] args)
 {
    Scanner sc = new Scanner(System.in);
	 int temp;
	 int a[] = new int[]{0,3,6,9,12,14,18,20,22,25,27};
	 int n=0;
	 	System.out.print("from 4th position the values of the array are");
		for(int i=0;i<a.length;i++)
		{
		     a[i]=sc.nextInt();	
		}
		System.out.print("Before 4th position the values of the array are");
		int pos=sc.nextInt();
		for(int i=0;i<pos;i++)
		{
			int firstelement=a[0];
		 }
		 for(int j=0;j<a.length-1;j++)
		 {
			 a[j] = a[j+1];
		 }
		 a[a.length-1]=firstelement;
		 
		 System.out.println("After Rotate Array");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]+"");
		 }
		 
		