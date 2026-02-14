package EmployeePayrollSystem;

import java.io.Serializable;

abstract class Employee implements Serializable{
    int empId;
    String empName;
    double basicSalary;
    double hra;
    double tax;
    long serialVersionUID = 1L;

    Employee(int empId, String empName, double basicSalary){
        this.empId=empId;
        this.empName = empName;
        this.basicSalary=basicSalary;
    }

    public abstract double calculateNetSalary();
}