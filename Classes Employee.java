class Employee {
    int empId;
    String empName;
    double salary;

    void setData(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void showData() {
        System.out.println(empId + " " + empName + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setData(1001, "Ali", 35000);
        e1.showData();
    }
}