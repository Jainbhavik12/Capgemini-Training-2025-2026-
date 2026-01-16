package operatorAssignment_1;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vehicleSpeed = 50;
		int speedLimit = 40;
		boolean isEmergencyServiceProvider = true;
		int penelty = 00;
		
		boolean isFined = !isEmergencyServiceProvider && vehicleSpeed > speedLimit ? true : false;
		
		penelty = isFined ? penelty + 500 : penelty;
		
		System.out.println(penelty);
		

	}

}
