import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int square = n * n;
        int sum = (square / 10) + (square % 10);

        System.out.println((sum == n) ? "Neon Number" : "Not a Neon Number");
    }
}