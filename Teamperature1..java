/*Q40. Classify temperature reading: 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.*/

import java.util.Scanner;
class Teamperature1
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Temperature ");
  int num =sc.nextInt();
   System.out.println("Enter celsius");
  int num =sc.nextInt();
  
  if(temp<0)
  {
	    System.out.println("Freezing");
  }
  else if(temp<0 && temp>20)
  {
  	    System.out.println("cold");
  }
  else if(temp<21 && temp>35)
  { 
         System.out.println("warm");
  }
  
  else if(temp>35)
  { 
         System.out.println("Hot");
  }
  
}
}
