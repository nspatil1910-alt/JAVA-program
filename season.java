/*37.heck whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.*/

import java.util.Scanner;
class season
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Month Number");
  int i =sc.nextInt();
  
  if( i == 12||i == 1||i == 2 )
   {
	  System.out.println("Winter");
   }
  else if( i == 3||i == 4||i == 5 )
   {
	  System.out.println("Spring");
   }
  else if( i == 6||i == 7||i == 8 )
	 {
		System.out.println("Summer");
	 }
  else if( i == 9||i == 10||i == 11 )
	{
		System.out.println("Autumn");	
	
	 }
	else
	{
	System.out.println("Enter a wrong input");
}
}
}	
 