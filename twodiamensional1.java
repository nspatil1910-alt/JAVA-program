/*How to use a two dimensional array in Java?*/

import java.util.Scanner;
public class twodiamensional1
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
			for(int j=0;j<a[i].length;j++){
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
	}
}	