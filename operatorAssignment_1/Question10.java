package operatorAssignment_1;

public class Question10 {
	
	public static void main(String[] args) {
		 int score = 150;
		 int givenTime = 10;
		 int completedTime = 9;
		 boolean isUsedCheats = false;
		 int bonusPoints = 0;
		 
		 boolean isEligibleForBonus = !isUsedCheats && (score > 100 && completedTime<givenTime) ? true : false;
		 
		 bonusPoints =  isEligibleForBonus ?  bonusPoints + 50 :  bonusPoints;
		 
		 System.out.println( bonusPoints);
		 
		 
	}

}
