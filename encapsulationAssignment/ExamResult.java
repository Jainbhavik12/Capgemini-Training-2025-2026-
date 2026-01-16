package encapsulationAssignment;

public class ExamResult {
	private double result;
	
	public void calculateMarks(double m1, double m2, double m3, double m4, double m5) {
		
		result = (m1+m2+m3+m4+m5)/5;
	}
	public void getResult() {
		System.out.println("You have obtained "+result+"%");
	}

}
