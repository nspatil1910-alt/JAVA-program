 /*q11.Write a java program to find a maximum between three numbers.*/
 
import java.util.Scanner;
class Maximum
{

public static void main(String args[])
{
int num1=10,num2=25,num3=15;

if(num1<=num2 && num1>=num3)
System.out.println(num1+" is Maximium");

else if(num2>num1 && num2>num3)
System.out.println(num2+" is Maximum");

else
System.out.println(num3+" is Maximum");

}
}



