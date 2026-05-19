/*Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,*/


import java.util.Scanner;
public class strong3
{
   public static void main(String [] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Number");
   int i = sc.nextInt();
    int sum =0;
     int original = sum;
    int num=0;
     while(num>0)
   { 
         int fact = 1;
         int lastdigit=num%10;
             for(i=1;i<lastdigit;i++)
             {
                   fact = fact * i;
                 }
                    sum = sum + fact;
                        num = num / 10;
                     }
                       if(original==sum)
                         {
                            System.out.println("Strong Number");
                           }
                             else	
                                 {
                                     System.out.println(" Not Strong Number");
                                   }
                                     }
                                     }




