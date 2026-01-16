package conditionalOperator;

public class TwoDigitPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		
		String res = (n > 10) && (n > 0) ? "Two digit positive number" :  "Not a Two digit positive number";
		
		System.out.println(res);

	}

}
