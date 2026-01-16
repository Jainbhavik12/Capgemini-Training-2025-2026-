package encapsulationAssignment;

public class Employee {
	private int salary;
	
	
	public void setSalary(int salary) {
		if(salary<0) {
			System.out.println("Salary can't be negative!");
		}
		else {
			this.salary=salary;
			System.out.println("Salary entered successfully");
		}
	}
	public int getSalary() {
		return salary;
	}
}
