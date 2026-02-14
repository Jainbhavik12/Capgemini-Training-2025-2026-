package anonymousClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Bhavik") {
			public String getName() {
				return name;
			}
		};
		
		System.out.println(s1.getName());

	}

}
