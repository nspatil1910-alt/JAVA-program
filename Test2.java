/*Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.*/

import java.util.Scanner;
class Test2
{
public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Result");
  int score =sc.nextInt();
  { 
     String result = (score>=90)?"Excellent":(score>=75)?"Good":(score>=50)?"Average":"poor";
			 
    System.out.println(result);
			  
}

}
}

			   