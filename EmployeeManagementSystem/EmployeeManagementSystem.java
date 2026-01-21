package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagementSystem {
	Scanner sc = new Scanner(System.in);
	Employee[] employees = new Employee[20];
	int count = 0;
	
	public void addEmployee() {
		
		if(count >= 20) System.out.println("No vacancy available");
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Department: ");
		String department = sc.nextLine();
		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		
		employees[count] = new Employee(id, name, department, salary);
		count++;
		System.out.println("Employee added successfully!");
	}
	public void displayEmployees() {
		for(Employee e : employees) {
			if(e!=null) {
				System.out.println(e);
			}
		}
	}
	public void updateEmployee() {
	    System.out.print("Enter Employee ID to Update: ");
	    int idToUpdate = sc.nextInt();
	    sc.nextLine(); // consume newline

	    boolean found = false;

	    for (Employee e : employees) {
	        if (e != null && e.getId() == idToUpdate) {

	            System.out.print("Enter updated Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Updated Department: ");
	            String department = sc.nextLine();

	            System.out.print("Enter Updated Salary: ");
	            double salary = sc.nextDouble();

	            e.setName(name);
	            e.setDepartment(department);
	            e.setSalary(salary);

	            System.out.println("Employee updated successfully!");
	            System.out.println(e);

	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Employee ID Not found");
	    }
	}
	public void deleteEmployee() {
		System.out.print("Enter Employee ID to Delete: ");
	    int idToDelete = sc.nextInt();
	    int deleteIndex=0;
	    boolean idFound = false;
	    for(int i=0; i<count; i++) {
	    		if(employees[i].getId() == idToDelete) {
	    			deleteIndex = i;
	    			idFound=true;
	    		}
	    }
	    if(!idFound) {
	    		System.out.println("ID not found");
	    		return;
	    }
	    for(int i=deleteIndex; i<count-1; i++) {
	    		employees[i] = employees[i+1];
	    }
	    employees[count-1] = null;
	    count--;
	    System.out.println("Employee deleted successfully");
	}
	public void searchEmployee() {
		System.out.print("Enter Employee ID to Search: ");
	    int idToSearch = sc.nextInt();
	    boolean isFound=false;
	    for(Employee e: employees) {
	    		if(e.getId() == idToSearch) {
	    			System.out.println("Employee Found");
	    			System.out.println(e);
	    			isFound=true;
	    		}
	    }
	    if(!isFound) {
	    		System.out.println("Employee not found");
	    }
		
	}
	public void countByDepartment() {
	    System.out.print("Enter Department: ");
	    sc.nextLine(); // consume leftover newline if previous input was nextInt()
	    String dept = sc.nextLine();

	    int countByDept = 0;

	    for (Employee e : employees) {
	        if (e != null && e.getDepartment().equalsIgnoreCase(dept)) {
	            countByDept++;
	        }
	    }

	    System.out.println("Employees in Department " + dept + ": " + countByDept);
	}

	  
	public static void main(String[] args) {

	    EmployeeManagementSystem ems = new EmployeeManagementSystem();
	    Scanner sc = new Scanner(System.in);

	    int choice;

	    do {
	        System.out.println("\nWelcome to Employee Management System\n"
	                + "Press 1 - Add Employee\n"
	                + "Press 2 - Display All Employees\n"
	                + "Press 3 - Update Employee\n"
	                + "Press 4 - Delete Employee\n"
	                + "Press 5 - Search Employee by ID\n"
	                + "Press 6 - Count Employees by Department\n"
	                + "Press 7 - Exit");

	        System.out.print("Enter your choice: ");
	        choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                ems.addEmployee();
	                break;

	            case 2:
	                ems.displayEmployees();
	                break;

	            case 3:
	                ems.updateEmployee();
	                break;

	            case 4:
	                ems.deleteEmployee();
	                break;

	            case 5:
	                ems.searchEmployee();
	                break;

	            case 6:
	                ems.countByDepartment();
	                break;

	            case 7:
	                System.out.println("Exiting Employee Management System...");
	                break;

	            default:
	                System.out.println("Invalid choice! Please try again.");
	        }

	    } while (choice != 7);

	    sc.close();
	}


	

}
