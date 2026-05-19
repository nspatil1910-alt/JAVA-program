/*Q23. Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. There can be at most one majority element in the array.
Example :- The given array is: 4 8 4 6 7 4 4 8
      output:- There are no Majority Elements in the given array
Explanation
1.Traverse the array using two loops.
2.For each element, count how many times it appears.
3.If the count of any element is greater than n/2, that element is the majority element.
4.If no such element is found after checking all elements, print that there is no majority element.*/


import java.util.Scanner;
public class MajorityElement
 {
 public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
       int count=1;	 
	   int a[]=new int[size];
        int size =7;
	 System.out.println("Enter the Number of elements ");
	 for(int i=0;i<size;i++)
	 {
		 size[i] = sc.nextInt();
	 }
	 int Majority = -1;
	 System.out.println("Enter "+size+ " Elements");
	for(int j=0;j<size;j++)
	{
		for(int k=0;k<size;k++)
		{
	    if(size[i] == size[j])
	      { 
		 count++;
	     }
	   }
	} 
	  if(count>size/2)
	  {
         Majority=size[i];
	  }		  
	  
	  if(Majority!=-1)
	  {
		  System.out.println("There are Majority in the given array"+ Majority);
	  }
	  else
	  {
		  System.out.println("There are no Majority in the given array");
	  }
   }
 }   