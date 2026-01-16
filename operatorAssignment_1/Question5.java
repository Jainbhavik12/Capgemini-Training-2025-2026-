package operatorAssignment_1;

public class Question5 {

	public static void main(String[] args) {
		
		boolean isPhysicallyChallanged = false;
		int attendence = 58;
		boolean isApproved = true;
		int examTime = 180; 
		
		boolean isEligible = isPhysicallyChallanged || (attendence < 60 && isApproved) ? true : false;
		
		examTime = isEligible ? examTime + 30 : examTime;
		
		System.out.println(examTime);

	}

}
