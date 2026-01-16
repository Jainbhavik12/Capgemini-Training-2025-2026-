package conditionalOperator;

public class TernaryOperator {

	public static void main(String[] args) {
		int age = 20;
		
		String eligibleForVote = age > 18  ? "Eligible To Vote!" : "Not Eligible To Vote!";
		
		System.out.println(eligibleForVote);

	}

}
