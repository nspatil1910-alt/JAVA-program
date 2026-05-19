/*Q17. Write a Java program to count the number of even and odd elements present in a given integer array.
Explanation
An even number is a number that is completely divisible by 2.
An odd number is a number that is not divisible by 2.
Traverse the array using a loop.
Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
          Odd count = 2*/
		  
import java.util.Scanner;
public class evenandodd
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int size = sc.nextInt();
      int a[] = new size[5];
    
     for(i =0;i<a.size;i++)
	 {
        a[i] = sc.nextInt();
	 }
       int evencount = 0;
       int oddcount = 0;
	   {
         for(i=0;i<a.size;i++)
		 {
			 if(a[i]%2==0)
			 {
				 evencount++;
			 }
			 else if(a[i]!=0)
			 {
				 oddcount++;
			 }
			 System.out.println("count even number evencount"+evencount);
			 System.out.println("count even number oddcount"+oddcount);

		 

