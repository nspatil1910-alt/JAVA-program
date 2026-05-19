 /*Q26.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
                       PerHeight < 150.0  : The person is Dwarf. 
                       PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted.
                       PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
 
                       Test Data : 135
  
                  	Expected Output :	The person is Dwarf.*/
					
					
					
import java.util.Scanner;
class HeightPerson
{
	public static void main(String [] args)
	{
   Scanner sc = new Scanner(System.in);
   double height =sc.nextDouble();
 System.out.println("Please input height in Centimeter");

if(height<150)
{
  System.out.println("this person is Dwarf");
  }
else if(height>=150.0&&height<165.0)
{
  System.out.println("This person is in average");
  }
  else if(height>=165.0&&height<=195.0)
  {
  System.out.println("This is person Taller");
  }
  
  }
}