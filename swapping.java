class SwapWithThird {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int temp;

        System.out.println("Before Swapping:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        temp = A;
        A = B;
        B = temp;

        System.out.println("After Swapping:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}