/*Q30. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.*/
 
import java.util.Scanner;
public class ElementDivisible
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
     	int a[] = new int[5];

      System.out.println("The given Array value " );
	  	for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
    	for(int i=0;i<a.length;i++)
        { 
		if(a[i]%3==0)
		{
		a[i]=-1;
		}
		System.out.println(" After array Element");
		for(i=0;i<a.length;i++)
		{
		   System.out.println(a[i]+" ");
		   }
	   }
   }
}   
		