/*Q47. Ezio can manipulate at most XX number of guards with the apple of Eden.
Given that there are a YY number of guards, predict if he can safely manipulate all of them.
Input Format
The first line will contain TT, the number of test cases. Then the test cases follow. Each test case contains a single line of input, two integers XX and YY. Output Format
For each test case, print text {YES} YES if it is possible for Ezio to manipulate all the guards. Otherwise, print text {NO} NO.
You may print each character of the string in uppercase or lowercase
(For example, the strings text {Yes} YeS, text {yEs} yEs, \text {yes}yes and \text {YES}YES will all be treated as identical).
Constraints
1<=T<=100
1<=X<=Y
Input         	Output
5 	7       	NO
6 	6      	YES
9          1     YES

 
Explanation:
Test Case 1: Ezio can manipulate at most 5 guards. Since there are 7 guards, he cannot manipulate all of them. 
Test Case 2: Ezio can manipulate at most 6 guards. Since there are 6 guards, he can manipulate all of them.
Test Case 3: Ezio can manipulate at most 9 guards. Since there are only 1 guards, he can manipulate the guard.*/

import java.util.Scanner;
class Ezio
{
public static void main(String [] args)
{
  
  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter Iq");
  int current=sc.nextInt();
  int Ezio = 170;
  if(Ezio<current+7)
  {
	  System.out.println(" Applicable ");
  }
  else
  {
	  System.out.println(" Not Applicable ");
  }
  
}
}

  