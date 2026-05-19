 /*Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.*/
 
import java.util.Scanner;
class Test
{
public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Character");
  int ch = sc.next().charAt(0);

if(ch>=65 && ch<=90)
{
   System.out.println("Upper Letter");
 }
 else
 {
    System.out.println("Lower Letter");
    }
  }
  
 
}
 



 
