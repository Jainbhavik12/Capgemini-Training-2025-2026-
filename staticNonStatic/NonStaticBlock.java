package staticNonStatic;

import java.util.Scanner;

public class NonStaticBlock {
	
	NonStaticBlock(){
		System.out.println("This is constructor");
	}
	{
		System.out.println("This is nonstatic block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticBlock obj = new NonStaticBlock();
	}
	

}
