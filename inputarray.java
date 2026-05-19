/*Q50. Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 			
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321			
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135
                               5732    5689			
Case 5 : Store only prime number at the same index of digit.
	   Output :- 2573  5  253  25  357  235*/

import java.util.Scanner;
public class inputarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = {5732,8659,2534,9625,7354,1325};
		
		for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        
        System.out.println("the value from array :");
		System.out.println(" Sort Number Ascending Order");
		System.out.println(" Sort Number In Descending Order");
		System.out.println("Store sum of digits at same index");
	    System.out.println("Store the even number at the first and odd number at the last of digit at same index");
		System.out.println("Store only prime number at the same index of digit");
		switch(int)
		{
	    Case '1' : 
	      {
		       int i;
	           int j;
	             i=j=0;
	               for(i=0;i<a.length; i++)
	             {
		           int temp=a[0];
			          for(j=0; j<(a.length-1-i);j++)
			          {
				       a[j]=a[j+1];
			          }
			             a[j]=temp;
	                 }
	                 System.out.println("\nArray after reverse");
	               for(i=0; i<a.length; i++)
	           {
		      System.out.printf("a[%d]--->%d\n",i,a[i]);
	        }
		  }
		  break;
	Case '2' :
	         {
	                 int left=0;
	                 int right=(a.length-1);
	                 while(left<right)
	              {     
			        int temp=a[left];
			        a[left]=a[right];
			       a[right]=temp;
			        left++;
			       right--;
	            }
	             System.out.println("\nAfter reverse array\n");
	             for(i=0; i<a.length; i++)
		     { 
	         System.out.printf("%d\t",a[i]);
	        }
			 }
			 break;
   Case 3 : 

 	





