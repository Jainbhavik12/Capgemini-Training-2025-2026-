package encapsulation;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal("Dog");
		System.out.println(a1.name);
		
		Animal a2 = a1;
		a2.name = "Cat";
		
		System.out.println(a1.name);

	}

}
