package ObjectClass;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Bhavik", 1);
		Student s2 = new Student("Bhavik", 1);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.getClass());

	}

}
