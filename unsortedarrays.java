/*Q28. Write a java program to find the union array of two unsorted arrays.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique*/

import java.util.Scanner;
public class unsortedarrays
{
    public static void main(String[] args)
    {
	  int a[]= {1,2,3};
	  int b[]= {2,3,4,5};

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
						found=true;
						break;
				    }
				}	
				if(found==false)
				{
					System.out.println(b[i]);
				}
			}
	}	
		
}