/*Question 16: Write a java program to find a minimum between three numbers.
Input:
Number1 = 9
Number2 = 4
Number3 = 7

Output
Minimum number = 4

Explanation:
Compare all three numbers using nested if-else statements to determine the smallest number.

Asked In Companies:
Just Practice assignment*/
import java.util.Scanner;
public class Demo16{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a first Number");
        int num1 = sc.nextInt();
       System.out.println("Enter a second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter a thrid Number");
        int num3 = sc.nextInt();

if(num1>=num2 && num1<=num3){
System.out.println(num1+" is Minimum");
}
else if(num2<num1 && num2<num3){
System.out.println(num2+" is Maximum");
}
else{
System.out.println(num3+" is Maximum");
}
    }
}
