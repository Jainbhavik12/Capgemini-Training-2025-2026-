package stringClass;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 =new StringBuffer();
		s1.append("Hello");
		System.out.println(s1);
		
		s1.insert(5,"Everyone");
		System.out.println(s1);
		
		System.out.println(s1.reverse());
		
		s1.reverse();
		
		s1.replace(5, 14, "All");
		System.out.println(s1);
		
		s1.delete(5, 9);
		System.out.println(s1);
		
		System.out.println(s1.capacity());
		
		s1.append("zsdxfcgfhkjkhukfzdzsdxfcgfhkjkhukfzd");
		System.out.println(s1.length());
		System.out.println(s1.capacity());

	}

}
