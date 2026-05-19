/*Example: WAP to create 3 x 3 matrix and calculate sum of every row in matrix */
import java.util.Scanner;
public class sumdiamensional
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[ ] [ ] = new int[3][3];
          System.out.print("Enter a matrix");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.printf("Display Matrix");
		System.out.print("\n");
		for(int i=0;i<a.length;i++){
			int sum = 0;
			for(int j=0; j<a[i].length; j++) 
		   {     sum = sum + a[i][j];
		       System.out.printf("%d\t",a[i][j]);
		   }
		   System.out.printf(" = %d \n",sum);
	      }

		}
	}
	
