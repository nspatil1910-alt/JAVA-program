/*Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :
	Input the size of array : 6
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to insert : 2
	Value :      200
	Expected Output : The new list is : 1 2 200 3 4 5*/
	
import java.util.Scanner;
public class desiredposition
{
	
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[6];
		int cnt =5;
		/*
		System.out.println("Enter new element index number to insert into");
		int element =sc.nextInt();
		int k = sc.nextInt();
		*/
		int element = 200;
		int k = 2;
		int insert =2;
		System.out.println(" Enter a 5 element " );
		 for(int i=0;i<cnt;i++)
		 {
			 a[i] = sc.nextInt();
			 
		 }
		for(int i = cnt - 1; i>=k; i--)
		{
			a[i+1] = a[i];
		}
			 a[k] = element;
			 cnt++;
		
	
		 for(int i=0;i<cnt;i++)
		 {
			 System.out.println(" "+a[i]);
		 }
	}
}	
		
		/*my code sucess fot not*/