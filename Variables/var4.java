package Variables;

public class var4 {
   public static void main(String[] args) {
        // Variables for salary calculation
        double baseSalary = 30000.00;
        double bonus = 5000.00;
        double taxRate = 0.10; 

        // Calculate gross and net salary
        double grossSalary = baseSalary + bonus;
        double tax = grossSalary * taxRate;
        double netSalary = grossSalary - tax;

        // Display the results
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax (10%): ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}
