/*Q49. Write a java program to find unique value in this given array.

	Input :- array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
	Output :-  All unique elements in the array are: 3, 20, 12, 10*/
	
import java.util.Scanner;
public class unique
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
        
        System.out.println("Enter the array elements:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("All unique elements in the array are:");
        for(int i = 0; i < a.length; i++)
        {
            int count = 0;
            for(int j = 0; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }
           
            if(count == 1)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}