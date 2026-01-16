package railSecure;

public class InvalidTrainException extends Exception {
	String message;
	InvalidTrainException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
