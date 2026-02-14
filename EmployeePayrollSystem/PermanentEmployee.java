package EmployeePayrollSystem;

class PermanentEmployee extends Employee{
    long serialVersionUID = 1L;
    double hraPercentage = 10;

    PermanentEmployee(int empId, String empName, double basicSalary){
        super(empId, empName, basicSalary);
    }

    public double calculateNetSalary(){ 
        basicSalary += basicSalary*hraPercentage/100;
        return basicSalary;
    } 
}