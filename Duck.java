/*Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.*/
import java.util.Scanner;
 public class Duck

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	  int num=sc.nextInt();
	   boolean b=false;
	   while(num>0)
	   {
		   int rem=num%10;
		   num=num/10;
		   if(rem==0)
		   {
			   System.out.println("it is a duck number");
			   b=true;
			   break;
		   }
	   }
	       if(!b){
			   System.out.println("it is not duck number");
		   }
	   
    }
 }