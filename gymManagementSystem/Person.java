package gymManagementSystem;

public abstract class Person {
	int id;
	String name;
	int age;
	String phone;
	
	public Person(int id,String name, int age, String phone){
		this.id =id;
		this.name=name;
		this.age = age;
		this.phone = phone;
		}
	
	public void getDetails() {
		System.out.println("Id: "+id+"\nName: "+name+"\nAge: "+age+"\nPhone: "+phone);
	}
	
	public abstract void showRole();
	

}
