package operatorAssignment_1;

public class Question1 {

	public static void main(String[] args) {
		
		int marks = 25;
		int attendence = 85;
		
		String result = (marks >= 40) && (attendence > 75) ? "Pass" : "Fail";
		
		int final_marks = result == "Pass" ? marks+5: marks;
		
		System.out.println(final_marks);

	}

}
