/*Question 22: Write a java program to check whether a number isro palindme or not.
Input:
Number = 121

Output
Palindrome Number

Explanation:
Reverse of 121 is 121.
Since original number equals reversed number, it is a Palindrome.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r;
        int c;
        int s=0;
       
        System.out.println("Enter a Number");
        int num= sc.nextInt();
         
        c=num;
        while(num>0)
        {
            r= num/10;
            s=(s*10)+r;
            num=num/10;
        }
            if (c==s) {
                System.out.println(" Palindrome Number");                          
            }
            else
            {
                 System.out.println(" Not Palindrome Number");
            }
        }
    }
