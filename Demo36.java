/*Question 36: Check if a person is a child, teenager, adult, or senior based on age.

   Input: Age
   Logic: if-else if
   Output: Age category.
Input:
Age = 16

Output
Teenager

Explanation:
Age < 13 ? Child
13–19 ? Teenager
20–59 ? Adult
60+ ? Senior

Asked In Companies:
Just Practice assignment*/
import java.util.Scanner;
public class Demo36{
   public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int age =sc.nextInt();
  
  age =13;
  
  if(age<13)
  {
    System.out.println("you are child");
  }
  else if(age>=13 && age<19)
  {
     System.out.println("you are teenager");
	 }
	
  else if(age>-20 && age<50)
  {
     System.out.println(" you are adult");
	 
	 }
	 else if(age>=30 && age<60)
   {
          System.out.println(" you are senior");
   
   }
}
}