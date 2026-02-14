package EmployeePayrollSystem;

import java.util.List;

public class PayRollProcessor {
	EmployeeFileStore store = new EmployeeFileStore();
	
	public void calculateSalary(int empId) {
		List<Employee> employees = store.loadAllEmployee();
		for (Employee e : employees) {
            if (e.empId == empId) {
            	
                System.out.println("Net Salary for " + e.empName + ": " + e.calculateNetSalary());
                return;
            }
        }
	}
	public void updateEmployeeSalary(int Id, double increment) {
        List<Employee> employees = store.loadAllEmployee();
        for (Employee e : employees) {
            if (e.empId == Id) {
                e.basicSalary = e.basicSalary + increment;
                System.out.println("Salary updated for " + e.empName);
                store.saveEmployee(e);
            }
        }
    }

}
