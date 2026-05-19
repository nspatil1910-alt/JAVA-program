import java.util.Scanner;
class MaxOfTwoNumbers
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Number");
double num1=sc.nextDouble();

System.out.println("Enter the Second Number");
double num2= sc.nextDouble();

System.out.println(" The Maximum of =+ Maximum ");

System.out.print("The maximum of " + num1 +" and " + num2 +" is:");
if (num1 > num2) {
System.out.println(num1);
} else {
System.out.println(num2);
}

}
}