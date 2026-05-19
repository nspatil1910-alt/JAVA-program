import java.util.Scanner;
public class dividend
{
public static void main(String[]args)
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter a num");
int num = sc.nextInt();
 
 if(num%5==0 && num%11 ==0)
 {
	 System.out.println("it is dividend both 5&11");
 }
 else
 {
	 System.out.println("it is  not dividend both 5&11");
 }
 
}
}
