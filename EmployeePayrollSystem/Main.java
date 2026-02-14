package EmployeePayrollSystem;

import java.util.List;

public class Main {

	public static void main(String[] args){
		EmployeeFileStore store = new EmployeeFileStore();
		PayRollProcessor processor = new PayRollProcessor();

        // Hardcoded dataset
        Employee e1 = new PermanentEmployee(101, "Arjun", 50000);
        Employee e2 = new ContractEmployee(102, "Meera", 40000);

        // Step 1: Save employees
        store.saveEmployee(e1);
        store.saveEmployee(e2);

        // Step 2: Calculate net salary
        processor.calculateSalary(101);
        processor.calculateSalary(102);

        // Step 3: Update salary
        processor.updateEmployeeSalary(101, 5000);

     
        
        store.saveEmployee(e2);

        // Step 5: Recalculate net salary
        processor.calculateSalary(101);
    }


}
