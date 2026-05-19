 /*Q13. Write a java program to accept two integers and check whether they are equal or not.*/
 
import java.util.Scanner;
class equal
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter First Number");
 int a = sc.nextInt();
 System.out.println("Enter Second Number");
 int b = sc.nextInt();

if(a==b)
 {
    System.out.println("Equal");
}
else
{
    System.out.println("Not Equal");
}

}
}




