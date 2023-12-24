package Pro_4;

import java.util.Scanner;

public class EmployeeLeaveManagementSystem {
    public static void main(String[] args) {
        LeaveManagementSystem leaveManagementSystem = new LeaveManagementSystem();

        // Add some sample employees
        leaveManagementSystem.addEmployee(new Employee("E101", "Shahnawaz", 20));
        leaveManagementSystem.addEmployee(new Employee("E102", "Ahmad", 15));
        leaveManagementSystem.addEmployee(new Employee("E103", "Fatma", 35));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Request Leave");
            System.out.println("2. Process Leave Requests");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your employee ID:");
                    String employeeId = scanner.next();
                    System.out.println("Enter the number of days for leave:");
                    int leaveDays = scanner.nextInt();

                    LeaveRequest leaveRequest = new LeaveRequest(employeeId, leaveDays);
                    leaveManagementSystem.requestLeave(leaveRequest);
                    break;
                case 2:
                
                    leaveManagementSystem.processLeaveRequests();
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
