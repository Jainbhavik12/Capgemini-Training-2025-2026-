package hasArelationship;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University lpu = new University("LPU");
		System.out.println(lpu.getName());
		for(Department d : lpu.getDepartments())
			System.out.print(d.getName()+" ");
	}

}
