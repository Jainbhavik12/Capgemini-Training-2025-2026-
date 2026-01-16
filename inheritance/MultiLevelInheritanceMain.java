package inheritance;

public class MultiLevelInheritanceMain {

	public static void main(String[] args) {
		
		EngineeringStudent e1 = new EngineeringStudent("Bhavik", 20, "LPU", 15, "Computer Science & Engineering", "P:132");
		
		System.out.println("Name: "+ e1.name);
		System.out.println("Age: "+ e1.age);
		System.out.println("College Name: "+ e1.collegeName);
		System.out.println("Id: "+ e1.id);
		System.out.println("Branch: "+ e1.branchName);
		System.out.println("Branch Code: "+ e1.branchCode);

	}

}
