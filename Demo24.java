/*Question 24: Write a java program to check whether a character is uppercase or lowercase alphabet.
Input:
Character = A

Output
Uppercase Alphabet

Explanation:
Character 'A' lies between 'A' and 'Z', so it is uppercase.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);

        if(ch>='A'&& ch <='Z' ){
            System.out.println("Enter a UpperCase");
        }
         else if(ch>='a'&& ch<='z'){
            System.out.println("Enter LowerCase");
    } 
    System.out.println("Not a Alphabet Number");
}
}
