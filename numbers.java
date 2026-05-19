/*Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.*/

import java.util.Scanner;
class num
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a first Number");
  int a =sc.nextInt();
   System.out.println("Enter a second Number");
  int b =sc.nextInt();

if(a>b)
{
  System.out.println("a is greater");
 }
 else if(a<b)
 {
   System.out.println("b is greater");
   }
   else 
   {
   System.out.println("Both the numbers are equal");
   }
}

}