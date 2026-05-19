/*Q16.Write a Java program to calculate the average of all elements present in an integer array.
Explanation
The average of array elements is calculated by:
 Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}
 {\text{Number of elements}}
 Average=Number of elementsSum of all elements​
First, iterate through the array and add all elements to a variable sum.
Then divide sum by the total number of elements (array.length) to get the average.
Input Array:
 [10, 20, 30, 40, 50]*/
 
import java.util.Scanner;
public class averagearray
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
         int a[] = {10 , 20 , 30 , 40 , 50 };
		 
		 int sum =0;
		 
		 for(int i =0 ; i<a.length; i++)
		 {
			 sum = sum+a[i];
		 }
		 double avg = sum / a.length;
		 System.out.println(" The sum " +  sum );
		 System.out.println(" The average "+ avg );
	}
}	