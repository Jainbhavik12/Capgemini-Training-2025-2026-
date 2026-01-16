package stringAssigement;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		
		int count=0;
		for(char ch: str.toCharArray()) {
			count++;;
		}
		System.out.println(count);
		
		
	}

}
