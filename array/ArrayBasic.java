package array;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
		System.out.print(arr[2]+" ");
		System.out.print(arr[3]+" ");
		System.out.println(arr[4]);
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[arr.length - 1]);
		

	}

}
