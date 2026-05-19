/*Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F*/
						
import java.util.Scanner;
class Grade
{
public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a percentage");
  int percentage= sc.nextInt();
  
  if(percentage >= 90)
  {
    System.out.println("perform Grade A");
	}
	else if(percentage >= 80)
	{
	  System.out.println("perform Grade B");
	  }
	  else if(percentage >= 70)
	  {
	    System.out.println("perform Grade C");
		}
	   else if(percentage >= 60)
	   {
	     System.out.println("perform Grade D");
		 }
		 else if(percentage >= 40)
		 {
		   System.out.println("perform Grade E");
		   }
		   else if(percentage < 40)
		   {
		     System.out.println("perform Grade F");
			 }
}
}
		 