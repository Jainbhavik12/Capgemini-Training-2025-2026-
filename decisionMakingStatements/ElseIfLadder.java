package decisionMakingStatements;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a = 78;
		int b = 78;
		
		if(a > b) {
			System.out.println(a + " is greater than "+ b);
		}
		else if(a==b) {// 
			System.out.println(a + " is equal to "+ b);
		}
		else {
			System.out.println(b + " is greater than "+ a);

		}
		

	}

}
