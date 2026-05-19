/*Q55. Write a java program to display following series :
 	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40*/


import java.util.Scanner;
public class seriesfive
{
   public static void main(String[]args)
   {

        for(int i = 1; i <= 8; i++)
			{
            System.out.print(5 * i + " ");
            
            if(i <= 7) 
			{  
                System.out.print(3 * i + " ");
            }
        }
    }
}
   
