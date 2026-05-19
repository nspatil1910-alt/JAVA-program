/*Q47. Write a java program to merge of two given array.

	Input :- First Array :- 1 2 3 4 5
             	 Second Array :-  6 7 8 9 10 

	Output :- 1 2 3 4 5 6 7 8 9 10*/
	
import java.util.Scanner;
public class mergearray
{
    public static void main(String [] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int a[]=new int[]{1,2,3,4,5};
	   int b[]=new int[]{6,7,8,9,10};
	   int c[]=new int[a.length+b.length];
	   for(int i=0,j=a.length;i<a.length;i++,j++)
	      {
	        c[i]=a[i];
			c[j]=b[i];
			}
	   System.out.println("Display First Array");
	   for(int i=0;i<a.length;i++)
	   {
	        a[i]=sc.nextInt();
		}
		System.out.println("Display Second Array");
		for(int j=0;j<b.length;j++)
		{
		    b[j]=sc.nextInt();
			}
	   System.out.println("Merged Array");
	   for(int i=0; i<c.length; i++)
	   {
	   System.out.printf(c[i]+" ");

       }
	 }
}	 

