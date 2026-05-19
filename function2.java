/*Question 2: Write a Java program to create an Employee class and calculate yearly salary using constructor.

Description: Create Employee class with empId, empName and monthlySalary. 
Use constructor to initialize values. Calculate yearly salary (monthlySalary × 12) and display it.
INPUT:
Enter Employee Id: 201
Enter Employee Name: Amit
Enter Monthly Salary: 25000

OUTPUT:
Employee Name: Amit
Yearly Salary: 300000

EXPLANATION:
Create Employee class with fields empId, empName, monthlySalary. 
Use constructor public Employee(int empId, String empName, int monthlySalary) to initialize. 
Calculate yearly salary as monthlySalary * 12 in constructor or display method. 
Display employee name and yearly salary.*/


import java.util.Scanner;
public class function2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
       System.out.println("Enter Employee Id");
        int empId = sc.nextInt();
	   System.out.println("Enter Employee Name");
        String empName = sc.next();
	   System.out.println("Enter Month Salary");
         int monthlySalary= sc.nextInt();
	   Employee emp = new Employee(empId, empName, monthlySalary);
	   emp.display();
	}
}
class Employee {
    int empId;
    String empName;
    int monthlySalary;

  
    public Employee(int empId, String empName, int monthlySalary) {
        this.empId = empId;
        this.empName = empName;
        this.monthlySalary = monthlySalary;
    }

  
    public void display() {
        int yearlySalary = monthlySalary * 12;
        System.out.println("Employee Name: " + empName);
        System.out.println("Yearly Salary: " + yearlySalary);
    }
}
