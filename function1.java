/*Question 1: Write a Java program to create a Student POJO class with fields rollNo, name and marks. 
Use a parameterized constructor to initialize values and display student details.

Description: Create a Student class having private data members rollNo, name and marks.
Initialize values using a constructor and display details using an object. 
Demonstrate object initialization using constructor.
INPUT:
Enter Roll No: 101
Enter Name: Rahul
Enter Marks: 78

OUTPUT:
Student Details:
Roll No: 101
Name: Rahul
Marks: 78;

EXPLANATION:
Create Student class with private fields. Use parameterized constructor public Student(int rollNo, String name, int marks) 
to initialize values. 
Create display method to show details. Create object with new Student(101, "Rahul", 78) and call display().*/

import java.util.Scanner;
public class function1
{
	public static void main(String [] args)
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Roll No");
        int rollNo = sc.nextInt();
	   System.out.println("Enter Student Name");
        String rollName = sc.next();
	   System.out.println("Enter Marks");
         int marks= sc.nextInt();
	   Student student = new Student(rollNo, rollName,marks);
	   student.display();
	}
}
class Student {
    int rollNo;
    String rollName;
    int marks;

  
    public Student(int rollNo, String rollName, int marks) {
        this.rollNo = rollNo;
        this.rollName = rollName;
        this.marks = marks;
    }

  
    public void display() {
		System.out.println("Students Details: ");
        System.out.println("Roll No: " + rollNo);
		System.out.println(" Name: " + rollName);
		System.out.println("Marks: " + marks);
    }
}



