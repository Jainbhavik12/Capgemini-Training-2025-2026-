package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Bhavik", 20));
		students.add(new Student("Shivam", 21));
		students.add(new Student("Aman", 22));
		students.add(new Student("Ahmed", 99));
		
		students.stream().filter(s->s.getName().startsWith("A")).forEach(System.out::println);
				

	}

}
