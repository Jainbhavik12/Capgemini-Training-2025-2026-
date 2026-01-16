package classAnsObjects;

public class Student {
	String pan;
	String adhar;
	String votingId;
	
	public Student() {
	}
	public Student(String pan) {
		this();
		this.pan= pan;
	}public Student(String pan, String adhar) {
		this(pan);
		this.adhar = adhar;
	}
	public Student(String pan, String adhar, String votingId) {
		this(pan, adhar);
		this.votingId=votingId;
	}

}
