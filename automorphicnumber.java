/*Q40. Write a Java program to print all automorphic numbers between 1 and n. An automorphic numbers square ends 
with the number itself (e.g., 5² = 25).
 Explanation:
 Use loop to check square and a while loop to match last digits.*/
 
 import java.util.Scanner;
public class automorphicnumber
{
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter the Number");
	 int num = sc.nextInt();
		 int square = num * num;
		 int temp = num;
		 
		 boolean isAutomorphic = true;
		  
		 while(temp>0)
		 {
			 if(temp%10!=square%10)
			 {
				 isAutomorphic = false;
				 break;
			 }
			 temp= temp/10;
			 square=square/10;
		 }
		 if(isAutomorphic)
		 {
			 System.out.println(num+" Automorphic Number ");
		 }
		 else
		 {
			 System.out.println(num+" Not Automorphic Number");
		 }
	 
  }
}