/*question 10: Write a java program to input any character and check whether it is alphabet, digit or special character.
Input:
Character = 5

Output:
Digit

Explanation:
Check ASCII ranges.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("It is an Alphabet");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Digit");
        } 
        else {
            System.out.println("It is a Special Character");
        }
    }
}