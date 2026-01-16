package loopingStatements;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<2*n; j++) {
				if(i+j >= n+1 && j-1 <= n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
		}
		
	}

}
