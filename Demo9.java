/*Question 9: Write a java program to input any alphabet and check whether it is vowel or consonant.
Input:
Character = e

Output:
Vowel

Explanation:
Vowels: a, e, i, o, u.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo9{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter a alphabet");
char ch = sc.next().charAt(0);

ch = Character.toLowerCase(ch);

if (ch >= 'a' && ch <= 'z') {
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    System.out.println("Vowel");
}
else{
   System.out.println("Not Vowel");
}
}
    }
}
