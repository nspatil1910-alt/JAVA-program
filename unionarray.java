/*
unionof two Arrays
*/

import java.util.Scanner;
public class unionarray
 {
 public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
	 
      int a[] = new int[]{1,2,3,4,5};
	  int b[] = new int[]{3,4,5,6,7};
	  
	  for(int i=0;i<a.length;i++)
	   {
		  System.out.println(a[i]);
	   } 
	  for(int i=0;i<b.length;i++)
	  {
		 boolean found = false;
		  for(int j=0;j<a.length;j++)
		  {
		if(b[i]==a[j]) 
		 {
		  found = true;
			break;
		  }
	   }   
	 } 
	     if(found==false)
		 {
		 System.out.println(b[i]);
		 }
	  
    } 
 }	
		