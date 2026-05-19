/* Q25.Write a java program to find the total number of notes in a given amount. 
            Enter the amount: 2528
 Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1*/
 
import java.util.Scanner;
class amountNumber
{
public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number");
  int amount= sc.nextInt();
  
  if(amount>=500)
  {
    System.out.println("No of 500 notes :"+(amount/500));
	amount=amount%500;
	}
	
  else if(amount>=100)
  {
    System.out.println("No of 100 notes :"+(amount/100));
	amount=amount%100;
	}
	
	else if(amount>=20)
  {
    System.out.println("No of 20 notes :"+(amount/20));
	amount=amount%20;
	}
	
	else if(amount>=10)
  {
    System.out.println("No of 10 notes :"+(amount/10));
	amount=amount%10;
	}
	
	else if(amount>=5)
  {
    System.out.println("No of 5 notes :"+(amount/5));
	amount=amount%5;
	}
	
	else if(amount>=2)
  {
    System.out.println("No of 2 notes :"+(amount/2));
	amount=amount%2;
	}
	
	else if(amount>=1)
  {
    System.out.println("No of 1 notes :"+(amount));
	amount=amount%1;
	}
  
}
}
