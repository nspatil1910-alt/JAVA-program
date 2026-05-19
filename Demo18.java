/*Question 18: Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
Input:
Score = 38

Output
Fail

Explanation:
If score ? 40 ? Pass
Otherwise ? Fail

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo17{
    public static void main(String[] args){
System.out.println("Enter a Result");
int Result = sc.nextInt();
if(Result >= 40)
{
	System.out.println("Pass");
}
else
{
	System.out.println("Fail");
}
    }
}