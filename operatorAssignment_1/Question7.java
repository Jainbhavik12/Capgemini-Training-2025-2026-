package operatorAssignment_1;

public class Question7 {

	public static void main(String[] args) {
		
		
		int itemCount =  4;
		boolean isFastMoving  = true;
		boolean isDiscontinued =true;
		
		itemCount = !isDiscontinued && (itemCount < 10 || isFastMoving) ?  itemCount + 10 : itemCount;
		
		System.out.println(itemCount);

	}

}
