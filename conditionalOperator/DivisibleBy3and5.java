package conditionalOperator;

public class DivisibleBy3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 18;
		String res = (num%3==0) && (num%5==0) ? "Divisible by 3 and 5":"Not Divisible by 3 and 5";
		System.out.println(res);

	}

}
