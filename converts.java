public class converts {
    public static void main(String[] args) {
        int totalDays = 400;

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30; 
        int days = remainingDays % 30;

        System.out.println("The number of Years :- " + years);
        System.out.println("The number of Months :- " + months);
        System.out.println("The number of Days :- " + days);
    }
}