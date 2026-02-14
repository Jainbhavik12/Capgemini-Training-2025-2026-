package EmployeePayrollSystem;

class ContractEmployee extends Employee{
    double taxPercentage=5;

    ContractEmployee(int empId, String empName, double basicSalary){
        super(empId, empName, basicSalary);
    }

    public double calculateNetSalary(){
        basicSalary-=basicSalary*taxPercentage/100;
        return basicSalary;
    } 
}