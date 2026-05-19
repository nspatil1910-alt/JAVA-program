/* Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.*/
                                	/*Basic Salary <= 10000 : HRA = 20%, DA = 80%*/
                                	/*Basic Salary <= 20000 : HRA = 25%, DA = 90%*/
                                	/*Basic Salary > 20000 : HRA = 30%, DA = 95%*/
									
import java.util.Scanner;
class grosssalary
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the grosssalary");
double sal = sc.nextDouble();
double grosssalary,HRA, DA;
if(sal<=10000)
{
    HRA=sal*0.02;
	DA=sal*0.08;
	

}
else if(sal<=20000)
{
	HRA=sal*0.25;
	DA= sal*0.90;
	
}
else
{
	HRA=sal*0.30;
	DA=sal*0.95;
}

}
}
	
	
									