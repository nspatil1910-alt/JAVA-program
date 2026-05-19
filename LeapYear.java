import java.util.Scanner;
public class LeapYear
{ 
public static void main(String[] args)
{
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a year");
int Year = sc.nextInt();
if(Year >= 2024)
{
	System.out.println("LeapYear");
}
else
{
	System.out.println("Not LeapYear");
}

}
}



