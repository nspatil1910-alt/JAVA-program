import java.util.Scanner;
class TriangleValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Triangle");
         int a1 = sc.nextInt();
		 System.out.println("Enter a second Triangle");
         int a2 = sc.nextInt(); 
		 System.out.println("Enter a thrid Triangle");
         int a3 = sc.nextInt();
        int sum = a1 + a2 + a3;
        
        String result = ((sum == 180 && a1 > 0 && a2 > 0 && a3 > 0) ? "Valid Triangle" : "Invalid Triangle");
        System.out.println("Output: " + result);
    }
}