package PaySystem;

public class ContractEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Type: Contract");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + "$" + hourlyRate);
        System.out.println("Net Salary: " + "$" + calculateSalary());
        System.out.println("-----------------------------");
    }
}
