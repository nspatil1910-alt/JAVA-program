/*Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.*/

import java.util.Scanner;
public class evenoddindex
{
    public static void main(String[] args)
    {
        int a[] = {5,10,15,20,25,30};
        System.out.println("odd Index:");
        for(int i = 0; i < a.length; i++)
        {   
            if(a[i] % 2 == 0)
            {
                System.out.println(a[i]);
            }
        }

        System.out.println("Even Index");
        for(int i = 0; i < a.length; i++)
        {
        
            if(a[i] % 2 != 0)
            {
                System.out.println(a[i]);
            }
        }
    }
}