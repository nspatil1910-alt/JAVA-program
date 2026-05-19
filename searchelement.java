/*Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. 
If it matches, print "found" with index; otherwise print "not found".*/


import java.util.Scanner;
public class searchelement
{
    public static void main(String[] args)
    {
        int []myarray = {10,20,30,40,50};
	    Scanner sc = new Scanner(System.in);
		
	 int searchvalue =30;
	 boolean found = false;
	 
	 for(int i=0;i<myarray.length;i++)
	 {
		 if(myarray[i]==searchvalue)
		 {
		  System.out.println(" element "+ searchvalue+ "found at index"+ i);
             found = true;
			 break;
		 }
	 }
	 if(!found)
	 
	 {
		  System.out.println(" element "+ searchvalue+ "not found at index");
	 }
	}
}	

	 