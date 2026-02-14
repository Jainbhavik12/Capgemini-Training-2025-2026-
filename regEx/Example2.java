package regEx;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bhavik"; 
		System.out.println(str1.matches("[a-z]+"));
		
		String str2 = "BHAVIK";
		System.out.println(str2.matches("[A-Z]+"));
		
		String str3 = "BbHhAvVIikK";
		System.out.println(str2.matches("[a-zA-Z]+"));
		
		String str4 = "BbH241hAvVI541ikK54";
		System.out.println(str2.matches("[a-zA-Z0-9]+"));
		
		String str5 = "abc350@gmail.com";
		System.out.println(str5.matches("^[a-z0-9]+@[a-z]+\\.[a-z]+$"));
		
		

	}

}
