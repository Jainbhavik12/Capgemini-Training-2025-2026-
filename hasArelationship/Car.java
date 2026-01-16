package hasArelationship;

public class Car {
	private String modelName;
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	Car(){
		
	}
	
	Car(String modelName){
		this.modelName = modelName;
	}
	
	//Achieve has-a relationship
	private Engine e = new Engine(1000);

	public Engine getEngine() {
		return e;
	}
}
