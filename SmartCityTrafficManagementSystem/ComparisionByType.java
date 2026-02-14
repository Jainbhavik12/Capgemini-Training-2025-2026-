package SmartCityTrafficManagementSystem;

import java.util.Comparator;

public class ComparisionByType implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		
		return priority(o1) - priority(o2);
	}
	public int priority(Vehicle o) {
		if(o.getType().equalsIgnoreCase("Ambulance")) return 1;
		else if(o.getType().equalsIgnoreCase("FireTruck")) return 2;
		else return 3;
	}

}
