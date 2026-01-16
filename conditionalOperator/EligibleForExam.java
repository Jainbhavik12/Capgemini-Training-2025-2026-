package conditionalOperator;

public class EligibleForExam {

	public static void main(String[] args) {
		
		int attendence = 78;
		int internalmarks = 30;
		
		String res = (attendence > 75) && (internalmarks >= 40) ? "Eligible for exam" : "Not Eligible for exam";
		
		System.out.println(res);

	}

}
