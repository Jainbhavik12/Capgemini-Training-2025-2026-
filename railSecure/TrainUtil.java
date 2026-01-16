package railSecure;

public class TrainUtil {
	
	public boolean validateTrainNumber(String trainNumber) throws InvalidTrainException {
		int a = Integer.parseInt(trainNumber.substring(3));
		
		if(a>=1000 && a<=9999) {
			return true;
		}
		else {
			throw new InvalidTrainException("The train number "+trainNumber+" is invalid");
		}
	}
	
	public boolean validateTrainName(String trainName) throws InvalidTrainException {
		String lowerTrainName = trainName.toLowerCase();
        if(trainName.equals("rajdhani")||trainName.equals("shatabdi")||trainName.equals("duronto")||trainName.equals("vande bharat")){
            return true;
        }
        else{
            throw new InvalidTrainException("The train name "+trainName+" is invalid");
        }
	}
	
	public boolean validatePassengerCount(int passengerCount, String trainName) throws InvalidTrainException {
		String lowerTrainName = trainName.toLowerCase();
		int maxCount = 0;
		
		switch(trainName) {
			case "rajdhani":
				maxCount = 1200;
				break;
			case "shatabdi":
				maxCount=800;
				break;
			case "duronto":
				maxCount = 1500;
				break;
			case "vande bharat":
				maxCount = 1000;
				break;
		}
		
		if(passengerCount <= 0 || passengerCount > maxCount) {
			throw new InvalidTrainException("The passenger count "+passengerCount+" is invalid for "+trainName);
		}
		return true;
			
	}
	public double calculateFuelToFillTank(String trainName, double currentFuelLevel) throws InvalidTrainException {
		double maxCount=0;
		switch(trainName) {
		case "rajdhani":
			maxCount = 500000;
			break;
		case "shatabdi":
			maxCount=300000;
			break;
		case "duronto":
			maxCount = 600000;
			break;
		case "vande bharat":
			maxCount = 400000;
			break;
	}
		
		if(currentFuelLevel < 0 || currentFuelLevel>maxCount) {
			throw new InvalidTrainException("Invalid fuel level for"+trainName);
		}
		return maxCount - currentFuelLevel;
	}
	

}
