/*Q29. Write a java program to display 1 to nth Prime Number.*/

  import java.util.Scanner;
  public class primenumber1

 {
   public static void main(String[]args)
   {  
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	  int n = sc.nextInt();
	  int num =2;
	  int count = 0;
	  
	  while(count < n)
	  {
		  boolean isPrime = true;
		  
		  for(int i = 2; i <= num / 2; i++)
		  {
			  if(num % i == 0)
			  {
				  isPrime = false;
			     break;
		  }
	  }
	     if(isPrime)
	  {
		  System.out.println(  num );
		  count++;
	  }
	     num++;
	  }
   }
 }
 
	  
      
