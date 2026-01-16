package stringClass;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Bhavik";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.startsWith("Bh"));
		System.out.println(s1.endsWith("z"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(5));
		
		char[] c = s1.toCharArray();
		System.out.println(c);
		
		String s2 = "Hii Hello Bye";
		String[] arr = s2.split(" ");
		for(String s: arr) {
			System.out.println(s);
		}
		
		String x = "Hiii";
		System.out.println(x.concat("Everyone"));
		
		System.out.println(s1.substring(1, 5));
		
		System.out.println("-----------------------------------------");
		System.out.println(s1.equals(s1));
		System.out.println(s1.getClass());
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		

	}

}
