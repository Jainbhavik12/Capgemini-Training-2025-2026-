package stringAssigement;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		
		String revStr = "";
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1; i>=0;i--) {
			revStr+=ch[i];
		}
		System.out.println(revStr);

	}

}
