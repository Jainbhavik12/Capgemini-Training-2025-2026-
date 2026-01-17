package collectionFramework;

public class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	public boolean equals(Object o) {
		Student s = (Student)o;
		return this.name == s.name && this.age == s.age;
	}
	
	
	
	

}
