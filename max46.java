/*Q46.Write a program in java to find the maximum for each and every contigious subarray of size k from a given array.
			
Expected Output:
		The given array is:
		1 3 6 21 4 9 12 3 16 10
		The length of each subarray is: 4
		The contagious subarray of length 4 and their maximum value are:
		1 3 6 21 ----> 21
		3 6 21 4 ----> 21
		6 21 4 9 ----> 21
		21 4 9 12 ----> 21
		4 9 12 3 ----> 12
		9 12 3 16 ----> 16
		12 3 16 10 ----> 16*/

import java.util.Scanner;
public class max46
{
public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
		int [] a={1,3,6,21,4,9,12,3,16,10};
		int k=4;
		int max=0;
          System.out.println(" the contagious subarray maximum values are :");
		  for(int i=0;i<a.length;i++)
		  {
          for( i=0;i<a.length-k;i++)
         {
            a[i]=sc.nextInt();
          }
            for (int j = i; j < i + k; j++) 
			{
                System.out.print(a[j] + " ");

                if (a[j] > max) 
				{
                    max = a[j];
                }
            }

            System.out.println("----> " + max);
        }
    }
}
