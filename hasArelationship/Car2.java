package hasArelationship;

public class Car2 {
	private Tyre[] tyres = new Tyre[4];
	int i=0; 
	
	//helper method
	void addTyre(Tyre tyre) {
		tyres[i] = tyre;
		i++;
	}
	public Tyre[] getTyres() {
		return tyres;
	}
}
