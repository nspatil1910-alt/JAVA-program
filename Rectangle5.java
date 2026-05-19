/*Question 5: Write a Java program to create a Rectangle class and calculate area using constructor.
Description: Create Rectangle class with length and width. 
Initialize values using constructor and calculate area using formula length × width.
INPUT:
Enter Length: 10
Enter Width: 5

OUTPUT:
Area of Rectangle is: 50

EXPLANATION:
Create Rectangle class with fields length and width. 
Use constructor public Rectangle(int length, int width) to initialize values. Calculate area as length * width.
 Create method to display area. Create object new Rectangle(10, 5) and display area.*/
 
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
