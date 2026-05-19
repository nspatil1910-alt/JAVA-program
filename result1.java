/*Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.*/

import java.util.Scanner;
public class LeapYear
{
public static void main(String[] args)
{
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a result");
int result = sc.nextInt();
if(result >= 40)
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}

}
}



