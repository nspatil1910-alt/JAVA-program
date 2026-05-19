/*Question 39: Check whether a student is eligible for scholarship:

   Attendance >= 75% and marks >= 80**
   Input: Attendance %, marks
   Logic: if-else
   Output: Eligible or not.
Input:
Attendance = 80%
Marks = 85

Output:
Eligible for Scholarship

Explanation:
Eligibility conditions:
Attendance ? 75% AND Marks ? 80
If both conditions true ? Eligible
Else ? Not Eligible

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo39{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a Marks");
      int marks = sc.nextInt();

      if(marks>=75){
         System.out.println(" Eligible for scholarship");
      }
      else{
         System.out.println(" Not Eligible for scholarship");
      }
   }
}
