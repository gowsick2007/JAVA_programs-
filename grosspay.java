import java.util.Scanner;

class Employee {
     String name;
     String employeeId;
     double hourlyRate;
     double hoursWorked;

    // Constructor
    public Employee(String name, String employeeId, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Calculate gross pay
    void calculateGrossPay() {
          double grosspay= hourlyRate * hoursWorked;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("--------------------------------------------------");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + employeeId);
        System.out.printf("Hourly Rate   : $%.2f\n", hourlyRate);
        System.out.printf("Hours Worked  : %.2f\n", hoursWorked);
        System.out.printf("Gross Pay     : "+ hourlyRate * hoursWorked);
        System.out.println("--------------------------------------------------\n");
    }
}

public class grosspay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Employee[] employees = new Employee[numberOfEmployees];

        // Input employee details
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Employee ID: ");
            String id = scanner.nextLine();

            System.out.print("Hourly Rate: ");
            double rate = scanner.nextDouble();

            System.out.print("Hours Worked: ");
            double hours = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            employees[i] = new Employee(name, id, rate, hours);
        }

        // Display all employee details
        System.out.println("\n\nPAYROLL DETAILS:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        scanner.close();
    }
}