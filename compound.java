class CompoundInterest {
    public static void main(String[] args) {
        double principal = 2000;
        double rate = 10;
        double time = 2;

         Formula: A = P * (1 + r/100)^t
        double amount = principal * Math.pow((1 + rate / 100), time);
        double CI = amount - principal;

        System.out.println("Compound Interest = " + CI);
        System.out.println("Total Amount = " + amount);
    }
}
}