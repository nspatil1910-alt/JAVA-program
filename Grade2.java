import java.util.Scanner;
 class Grade
{
public static void main(String[] args)
{
int gradeScore = 38;	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a marks (0-100):");
int Grade = sc.nextInt();

	   String gradeResult = (gradeScore >= 82) ? "Good" : "Bad"; 
	   
	    System.out.println("Output : " + Grade);
    }
}


