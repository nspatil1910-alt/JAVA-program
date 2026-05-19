/*Q31. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.*/
 
 
import java.util.Scanner;
public class firstandlastelement
{
    public static void main(String[] args)
    {
      int num[] = new int [4];
	  int a[]= new int [1];
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Array value ");
	  for(int i =0 ;i< num.length ; i++)
	    {
		   num[i] = sc.nextInt();
		   
	    }
		for(int i=0;i<a.length;i++)
	   {
		  System.out.print(a[i]+" ");
	   }
	  for(int i =1;i< num.length-1 ; i++)
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

