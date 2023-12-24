package Pro_4;

public class LeaveRequest {
    private String employeeId;
    private int leaveDays;

    public LeaveRequest(String employeeId, int leaveDays) {
        this.employeeId = employeeId;
        this.leaveDays = leaveDays;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
