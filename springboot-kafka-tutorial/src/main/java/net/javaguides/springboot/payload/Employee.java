package net.javaguides.springboot.payload;

public class Employee {

    private String empName;
    private int empId;
    private String empEmail;

    public Employee(String empName, int empId, String empEmail) {
        this.empName = empName;
        this.empId = empId;
        this.empEmail = empEmail;
    }

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }
}
