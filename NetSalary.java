public class NetSalary {
    public static void main(String[] args) {
        
        int basic = 20000;
        
        
        double hra = 0.10 * basic; 
        double da = 0.05 * basic;  
        double tax = 0.02 * basic; 
        
        // Formula: Net Salary = Basic + HRA + DA - Tax
        double netSalary = basic + hra + da - tax;
        
        
        System.out.println("Net Salary = " + (int)netSalary);
    }
}
