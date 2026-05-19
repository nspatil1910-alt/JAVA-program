/*Q40. Write a program in java to find the smallest missing element from a sorted array?
 Expected Output : The given array is : 0 1 3 4 5 6 7 9
		         The missing smallest element is: 2*/
				 
import java.util.Scanner;
public class missingelementsortedarray
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
	int a[] = new int[7];
	int b[] = new int[2];
		System.out.println("The given Array " );
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j< b.length; j++)
		{ 
	        b[j]=sc.nextInt();
		}
			if(b[j]==a[i])
			{
				System.out.println(a[i]+" ");
			}
		}
		
    
}	