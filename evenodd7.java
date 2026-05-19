/*Question 7: Write a Java program to check whether a number is even or odd using constructor initialization.
Description: Create NumberCheck class with one integer variable.
 Initialize using constructor and check even or odd using logical condition.
INPUT:
Enter Number: 17

OUTPUT:
17 is Odd Number

EXPLANATION:
Create NumberCheck class with int number field. Use constructor public NumberCheck(int num) to initialize. 
Check if number % 2 == 0 then "Even" else "Odd". Display number and type. 
Create object new NumberCheck(17) and display result.*/

import java.util.Scanner;
public class Rectangle5
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
       System.out.println("Enter Length");
        int length = sc.nextInt();
	   System.out.println("Enter Width");
        int width = sc.nextInt();
	   Rectangle rectangle = new Rectangle(length,width);
	   rectangle.display();
	}
}
class Rectangle {
    int length;
    int width;

  
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        
    }

  
    public void display() {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		int area = length*width;
		System.out.println("AreaofRectangle: " + area);

    }
}
