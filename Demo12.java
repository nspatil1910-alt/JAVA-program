/*Question 12: Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
Input:
Age = 18

Output
Eligible to vote

Explanation:
According to voting rules, a person must be at least 18 years old to vote.
If age ? 18 ? Eligible
Otherwise ? Not Eligible

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo12{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Age");
    int age = sc.nextInt();

    if(age>=18){
        System.out.println("Enter Vote");
    }
    else
    {
       System.out.println("Not Enter vote");
    }
}
}