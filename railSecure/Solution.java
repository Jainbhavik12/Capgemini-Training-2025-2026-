package railSecure;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainUtil t1 = new TrainUtil();
		try {
			double bool = t1. calculateFuelToFillTank("rajdhani", 200000);
			System.out.println(bool);
			
		}
		catch(InvalidTrainException e) {
			System.out.println(e.getMessage());
		}

	}

}
