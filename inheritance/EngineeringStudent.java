package inheritance;

public class EngineeringStudent extends Student{
	String branchName;
	String branchCode;
	
	EngineeringStudent(){
		
	}
	EngineeringStudent(String name, int age, String collegeName, int id, String branchName, String branchCode){
		super(name, age, collegeName, id);
		this.branchName=branchName;
		this.branchCode=branchCode;
		
	}

}
