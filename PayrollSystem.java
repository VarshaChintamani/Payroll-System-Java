package PaySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Payroll System =====");
            System.out.println("1. Add Permanent Employee");
            System.out.println("2. Add Contract Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new PermanentEmployee(id, name, salary));
                    System.out.println("Permanent Employee Added!");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String cname = sc.nextLine();

                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();

                    System.out.print("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();

                    employees.add(new ContractEmployee(cid, cname, hours, rate));
                    System.out.println("Contract Employee Added!");
                    break;

                case 3:
                    System.out.println("\n--- Employee Details ---");
                    for (Employee e : employees) {
                        e.displayDetails();   // Runtime Polymorphism
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
