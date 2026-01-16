package loopingStatements;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<2*n; j++) {
				if(i<=j && i+j <= 2*n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
