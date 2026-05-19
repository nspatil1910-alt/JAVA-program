import java.util.Scanner;
class Smallest
{

public static void main(String args[])
{
int num1=6,num2=3,num3=9;

if(num1 <= num2 && num1>=num3)
System.out.println(num1+" is Smallest");

else if(num2<num1 && num2<num3)
System.out.println(num2+" is Smallest");

else
System.out.println(num3+" is Smallest");

}
}