package array;

public class ProductExceptCurrent {
	
	public static int[] productOfEele(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		
		ans[0] = 1;
		for(int i=1;i<n;i++) {
			ans[i] = ans[i-1]*nums[i-1];
		}
		int suffix = 1;
		for(int i=n-1; i>=0; i--) {
			ans[i] = suffix*ans[i];
			suffix*=nums[i];
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 6,  7, 8,9 ,2};
		int[] ans = productOfEele(arr);
		for(int i: ans) {
			System.out.print(i+" ");
		}
		

	}

}
