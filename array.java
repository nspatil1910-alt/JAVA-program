import java.util.Scanner;
public class array
{   public static void main(String[]args)
	{  
	   Scanner sc = new Scanner(System.in);
	   int b[]=new int[10];
	   System.out.println("Enter values in array");
	   int sum=0;
	   for(int i=0; i<b.length; i++)
	   {
		    b[i]=sc.nextInt();
	   }
	   System.out.println("display array values");
	   for(int i=0; i<b.length; i++)
	   {    sum =sum+b[i];
		    System.out.printf("%d\t",b[i]);
	   }
	   System.out.printf("\nSum of all values is %d\n",sum);
	   
	}
}
