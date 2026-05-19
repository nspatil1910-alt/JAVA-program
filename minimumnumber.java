/*Q16. Write a java program to find a minimum between three numbers;*/
import java.util.Scanner;.
class minimium
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a first number: ");
int a = sc.nextInt();
System.out.println("Enter a Second number: ");
int b = sc.nextInt();

if(a<b)
{
   System.out.println("Minimum Number is "+a);
 }
 else
 {
   System.out.println("Minimum Number is "+b);
 }
 
 }
 }
 