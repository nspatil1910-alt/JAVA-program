/*Q48. Write a java program to merge of two given array.

Input :- First Array :- 1 2 3 4 5
             	 Second Array :-  6 7 8 9 10 

	Output :- 1 10 2 9 3 8 4 7 5 6*/
	
	
	import java.util.Scanner;
public class mergearraydecrease
{
    public static void main(String [] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int a[]=new int[]{1,2,3,4,5};
	   int b[]=new int[]{6,7,8,9,10};
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
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]+"");
	   }
	 }
}	 

