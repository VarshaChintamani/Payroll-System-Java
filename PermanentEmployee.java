package PaySystem;

public class PermanentEmployee extends Employee {

    private double hra;
    private double pf;

    public PermanentEmployee(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        this.hra = 0.20 * basicSalary;   // 20% HRA
        this.pf = 0.12 * basicSalary;    // 12% PF
    }

    @Override
    public double calculateSalary() {
        double gross = basicSalary + hra;
        double tax = 0.10 * gross;  // 10% Tax
        return gross - pf - tax;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Permanent");
        System.out.println("Net Salary: " + "$" + calculateSalary());
        System.out.println("-----------------------------");
    }
}
