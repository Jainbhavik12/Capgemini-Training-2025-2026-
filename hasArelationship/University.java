package hasArelationship;

public class University {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	University(){
		
	}
	
	University(String name){
		this.name = name;
	}
	
	private Department[] d = {new Department("CSE"), new Department("ECE"), new Department("MBA")};

	public Department[] getDepartments() {
		return d;
	}
	
}
