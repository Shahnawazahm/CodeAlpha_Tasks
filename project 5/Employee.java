package Pro_4;

public class Employee {
    private String employeeId;
    private String name;
    private int leaveBalance;

    public Employee(String employeeId, String name, int leaveBalance) {
        this.employeeId = employeeId;
        this.name = name;
        this.leaveBalance = leaveBalance;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void deductLeave(int days) {
        if (leaveBalance >= days) {
            leaveBalance -= days;
            System.out.println("Leave approved for " + days + " days to "+ name+". Remaining leave balance: " + leaveBalance + " days.");
        } else {
            System.out.println("Insufficient leave balance. Leave not approved.");
        }
    }
}
