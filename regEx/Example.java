package regEx;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "1";
		System.out.println(str1.matches("\\d")); // \\d -> only for one digit
		
		String str2 = "123";
		System.out.println(str2.matches("\\d+")); // \\d+ -> one or more digits
		
		String str3 = "";
		System.out.println(str3.matches("\\d*")); // * -> excepts empty string also
		
		String str4 = "456789";
		System.out.println(str4.matches("^\\d+$")); // ^ -> start, $->end 
								// ^\\d+& -> from start to end
		
		String str5 = "123";
		System.out.println(str5.matches("\\d{3}")); // Checking for number of digits in string
		
		
		String str6 = "12345686";
		System.out.println(str6.matches("\\d{3,8}")); // Cheking for range
		
		String str7 = "10.5";
		System.out.println(str7.matches("^\\d+\\.\\d$")); // \\.-> checks for point.

	}

}
