/*38.Check whether a student is eligible for scholarship:
 Attendance >= 75% and marks >= 80**
Input: Attendance %, marks
 Logic: if-else
 Output: Eligible or not.*/
	
import java.util.Scanner;
class student
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Student are Attendence ");
		int Attendence =sc.nextInt();
		System.out.println("Student are Marks ");
		int Marks = sc.nextInt();
		
 if(Attendence >= 75 && Marks>=80)
 {
	 System.out.println("Student of Eligible");
 }
 else
 {
	 System.out.println("student of not Eligible");
 }
 
	}
}

	 