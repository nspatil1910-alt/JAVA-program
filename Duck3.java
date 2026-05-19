/*write a program to duck number or Not Duck Number*/

import java.util.Scanner;
public class Duck3
{
   public static void main(String [] args)
{
   Scanner sc = new Scanner(System.in);
   int rem;
   Boolean flag = false;
   System.out.println("Enter a Number From Keyboard");
   int a= sc.nextInt();
   while(a!=0)
   {
     rem=a%10;
     a=a%10;
     if(rem==0)
       {
         flag = true;
        }
     }
       if(flag)
       {
         System.out.println("Number is Duck");
         }
         else
         {
            System.out.println("Not Number is Duck");
          }
       }
}