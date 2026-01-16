package array;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][2];
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		
		arr[0][1] = 4;
		arr[0][0] = 5;
		arr[1][0] = 6;
		arr[1][1] = 7;
		
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
