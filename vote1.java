 /*q12.Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.*/
 
import java.util.*;
public class Vote
{
public static void main(String[] args)
{
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a age");
int age = sc.nextInt();
if(age >= 18)
{
	System.out.println("Eligible  vote");
}
else
{
	System.out.println("Not Eligible  vote");
	
}

}
}


