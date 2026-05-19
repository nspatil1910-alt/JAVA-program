/*Q41. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.*/
 
 import java.util.Scanner;
 public class LargeSmallnumQ41
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
     int num=sc.nextInt();
	 int smallestnum=9;
	 int largestnum=0;
	 while(num>0)
	 {
	  int digit=num%10;
	   if(digit<smallestnum){
	    smallestnum=digit;
	   }
	   if(digit>largestnum){
	   largestnum=digit;
	   }
	    num=num/10;
	 }
       System.out.println("Smallest digit "+ smallestnum);
	   System.out.println("Largest digit " + largestnum);
  }



}
 
