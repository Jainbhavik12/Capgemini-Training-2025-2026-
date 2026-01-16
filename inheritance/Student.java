package inheritance;

public class Student extends Person{
	String collegeName;
	int id;
	
	Student(){
		
	}
	Student(String name, int age, String collegeName, int id){
		super(name, age);
		this.collegeName=collegeName;
		this.id = id;
	}
	
}
