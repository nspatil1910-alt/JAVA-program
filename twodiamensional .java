import java.util.Scanner;
public class twodiamensional
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[ ] [ ] = new int[3][3];
	   Scanner sc  =new Scanner(System.in);
          System.out.print("Enter a matrix");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				Scanner sc = new Scanner(System.in);
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Display Matrix");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System..out.print("%d\t",a[i][j]);
			}
			Sytem.out.print("\n");
		}
	}
}	