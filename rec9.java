/*Q9. Write a Java program using a void function to check whether a number is a Strong Number.
A Strong Number is a number whose sum of factorials of digits equals the number.
Explanation
Extract each digit
Calculate factorial using a loop (no recursion)
Add factorials
Compare with original number
Print result inside function*/


import java.util.Scanner;
public class rec9
{
   public static void main(String [] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Number");
   int num= sc.nextInt();
    rec(num);
}
public static void rec(int num){
	int original = num;
	int sum =0;
		while(num>0)
        { 
            int fact = 1;
             int lastdigit=num%10;
              for(int i=1;i<lastdigit;i++)
                {
                  fact = fact * i;
                       }
                           sum = sum + fact;
                           num = num / 10;
                            }
                              if(original==sum)
                              {
                                 System.out.println("Strong Number");
                                }
                                  else	
                                    {
                                        System.out.println(" Not Strong Number");
                                    }
                                }
}
  



