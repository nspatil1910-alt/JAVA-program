/*Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.*/

import java.util.Scanner;
public class evenoddarray
{
    public static void main(String[] args)
    {
        int a[] = {11,20,33,42,55,60};
        System.out.println("Even numbers:");
        for(int i = 0; i < a.length; i++)
        {   
            if(a[i] % 2 == 0)
            {
                System.out.print(" \n "a[i]);
            }
        }
        System.out.println("\n");
        System.out.println("Odd numbers:");
        for(int i = 0; i < a.length; i++)
        {
        
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]);
            }
        }
    }
}