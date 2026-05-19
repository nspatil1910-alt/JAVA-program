/*Q51. Write a java program to display top three value from array.

	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86*/
	
import java.util.Scanner;
import java.util.Arrays;
public class displayq51
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = {78, 90 , 90 , 86, 85, 92, 70, 92};
        
        System.out.println("the value from array :");
		for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
         System.out.print("the display top three value from array :");
		
		 Arrays.sort(a);
		 int n = a.length;
		 
		 System.out.print(a[n-1]+",");
		 System.out.print(a[n-3]+",");
		 System.out.print(a[n-5]+",");
	}
}	