/*Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :
	Input the size of array : 5
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to delete : 3
	Expected Output : The new list is : 1 2 3 5*/

 import java.util.Scanner;
 public class deletearray
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
      System.out.println("Enter the array value ");
     for(int i =0;i<a.length;i++)
	 {
        a[i] = sc.nextInt();
	 }
	 System.out.println("input the position where to delete from array");
	 int pos = sc.nextInt();
	 
	 for(int i=pos;i<a.length;i++)
	 {
		 a[i] = a[i+1];
	 }
	 for(int i=0;i<a.length-1;i++)
	 {
	 System.out.println(a[i]+" ");
	}
   }
}


	