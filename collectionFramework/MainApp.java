package collectionFramework;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList students = new ArrayList();
		students.add(new Student("Bhavik", 21));
		students.add(new Student("Nithin", 23));
		students.add(new Student("Laxman", 22));
		
		Object s = new Student("Bhavik", 21); 
		System.out.println(students.contains(s));
		
		System.out.println(students);
		
		

	}

}
