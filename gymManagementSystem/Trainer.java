package gymManagementSystem;

public class Trainer extends Person{
	
	String speciality;
	double hourlyRate;
	int hoursWorked;
	
	public Trainer(int id, String name, int age, String phone, String speciality, double hourlyRate, int hoursWorked) {
		super(id, name, age, phone);
		this.speciality=speciality;
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
		
	}
	
	public double calculateSalary() {
		return hourlyRate*hoursWorked;
	}
	public void getDetails() {
		
		super.getDetails();
		System.out.println("Specility: "+speciality);
		System.out.println("Salary: "+calculateSalary());
	}
	public void showRole() {
		System.out.println("Role: I am a Trainer");
	}

}
