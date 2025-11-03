class Employee {
    private int empId;
    private String empName;
    
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Neha");
        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getEmpName());
    }
}