import java.util.Scanner;
class DifferenceChecker
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
int num1=sc.nextInt();

System.out.print("Enter second number: ");
int num2 = sc.nextInt();

int difference = num1 - num2;

if (difference > 10) 
{
System.out.println("The absolute difference is " + difference + ", which is GREATER than 10.");
}
 else
{
 System.out.println("The absolute difference is " + difference + ", which is NOT greater than 10.");
  }
    }
}


