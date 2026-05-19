/*Q25. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of t..0he array.*/

import java.util.Scanner;
public class relativeorder
{
    public static void main(String[] args)
    {
      int num[] = new int [5];
	  int a[]= new int [2];
	  int b[] = new int [12];
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Array value ");
	  for(int i = 0;i< num.length ; i++)
	    {
		   num[i] = sc.nextInt();
		   
	    }
	  for(int i = 0;i< num.length ; i++)
	  {
		  if(num[i]!=0)
		  {
			  System.out.print(num[i] + " ");
		  }
	  }	
	    for(int i=0;i<a.length;i++)
	   {
		  System.out.print(a[i]+" ");
	  
	   } 
    }	   
}	

