/*Example: WAP to create 3 x 3 matrix and sort column data */
import java.util.Scanner;
public class threediamensional
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
		   {
		       System.out.printf("%d\t",a[i][j]);
		   }
		   System.out.printf("\n");
	      }
            for(int i=0; i<a.length; i++){  
			int dummy[]=new int[3];
	      for(int j=0; j<a[i].length; j++){ 
		  dummy[j]=a[j][i];
		  }
		  Arrays.sort(dummy);
		  for(int m=0; m<a.length; m++){ 
		  a[m][i]= dummy[m];
		  }
		  
	  }

		}
	}
	

