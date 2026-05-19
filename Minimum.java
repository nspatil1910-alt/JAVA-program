/*Q16. Write a java program to find a minimum between three numbers.*/

import java.util.Scanner;
class Minimum
{

public static void main(String args[])
{
int num1=1,num2=5,num3=15;
if(num1 <= num2 && num1>=num3)
System.out.println(num1+" is Minimum");

else if(num2>num1 && num2>num3)
System.out.println(num2+" is Minimum");

else
System.out.println(num3+" is Minimum");

}
}



