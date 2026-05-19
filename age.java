 
/*Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.*/

import java.util.Scanner;
class age
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  int a =sc.nextInt();
  
  int age =32;
  
  if(age<12)
  {
    System.out.println("you are child");
  }
  else if(age>=12 && age<20)
  {
     System.out.println("you are teenager");
	 }
	
  else if(age>-20 && age<30)
  {
     System.out.println(" you are adult");
	 
	 }
	 else if(age>=30 && age<70)
   {
          System.out.println(" you are senior");
   
   }
   
  }
 }