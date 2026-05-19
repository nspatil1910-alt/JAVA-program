/*Q4. Write a java program to print all even numbers between 1 to 100.- using while loop*/
import java.util.Scanner;
class evennumbers1
{
	public static void main(String[]args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("all even numbers between 1 to 100");
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println(i +" ");
			}
			i++;
		}
	}
}