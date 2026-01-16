package encapsulationAssignment;

public class StudentMarks {
	private int marks;
	
	public void setMarks(int marks) {
		if(marks > 100) {
			System.out.println("Invalid marks entered");
		}
		else {
			this.marks=marks;
			System.out.println("Marks entered Successfully");
		}
		
	}
	public int getMarks() {
		return marks;
	}

}
