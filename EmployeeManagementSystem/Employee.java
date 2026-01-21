package EmployeeManagementSystem;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		return this.id == e.id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
