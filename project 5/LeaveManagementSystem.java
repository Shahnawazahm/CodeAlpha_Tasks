package Pro_4;

import java.util.ArrayList;
import java.util.List;

public class LeaveManagementSystem {
    private List<Employee> employees;
    private List<LeaveRequest> leaveRequests;

    public LeaveManagementSystem() {
        this.employees = new ArrayList<>();
        this.leaveRequests = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void requestLeave(LeaveRequest leaveRequest) {
        leaveRequests.add(leaveRequest);
    }

    public void processLeaveRequests() {
        for (LeaveRequest request : leaveRequests) {
            Employee employee = findEmployeeById(request.getEmployeeId());
            if (employee != null) {
                employee.deductLeave(request.getLeaveDays());
            } else {
                System.out.println("Employee not found for leave request.");
            }
        }
        leaveRequests.clear();
    }

    private Employee findEmployeeById(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }
}
