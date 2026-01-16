package hasARelationshipAssignment;

public class Car {
	String brand;
	String model;
	Engine E;
	
	Car(String brand, String model, Engine E){
		this.brand = brand;
		this.model=model;
		this.E=E;
	}
	
	public void displayDetails(){
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Engine Type: "+E.engineType);
		System.out.println("Horse Power: "+E.horsePower+"HP");
	}

}
