package stringAssigement;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ababba";
		
		int start=0;
		int end = str.length()-1;
		
		while(start<=end) {
			if(str.charAt(end)==str.charAt(start)) {
				start++;
				end--;
			}
			else {
				System.out.println("Not a palindrome string");
				break;
			}
		}
		if(start > end) {
			System.out.println("Palindrome String");
		}
		

	}

}
