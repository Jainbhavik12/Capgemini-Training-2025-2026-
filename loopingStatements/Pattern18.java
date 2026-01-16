package loopingStatements;

public class Pattern18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n/2)+1; j++) {
				if(i+j>=n-1 && i-j <= n/2) {
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
