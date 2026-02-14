package RobotNavigatorUsingStack;

import java.util.Scanner;
import java.util.Stack;

public class RobotNavigator {
	static Stack<String> backStack = new Stack<>();
	static Stack<String> forwardStack = new Stack<>();
	static int position;
	
	public static void moveForward() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Steps: ");
		int n =  sc.nextInt();
		backStack.push("Forward "+n);
		if(!forwardStack.isEmpty()) {forwardStack.pop();}
		position+=n;
	}
	public static void moveBackward() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Steps: ");
		int n =  sc.nextInt();
		backStack.push("Backward "+n);
		if(!forwardStack.isEmpty()) {forwardStack.pop();}
		position-=n;
	}
	public static void undoMove() {
		String top="";
		if(!backStack.isEmpty()) {
			top = backStack.pop();
		}else {
			System.out.println("Backstack is empty");
		}
		if(top.matches("Forward \\d+")) {
			int n = Integer.parseInt(top.split(" ")[1]);
			position-=n;
			forwardStack.push("Forward "+n);
		}
		else if(top.matches("Backward \\d+")){
			int n = Integer.parseInt(top.split(" ")[1]);
			position+=n;
			forwardStack.push("Backward "+n);
			
		}
	}
	public static void redoMove() {
		String top="";
		if(!forwardStack.isEmpty()) {
			top = forwardStack.pop();
		}else {
			System.out.println("Forwardstack is empty");
		}
		
		if(top.matches("Forward \\d+")) {
			int n = Integer.parseInt(top.split(" ")[1]);
			position+=n;
			backStack.push("Forward "+n);
		}else {
			int n = Integer.parseInt(top.split(" ")[1]);
			position-=n;
			backStack.push("Backward "+n);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotNavigator navigator = new RobotNavigator();
		navigator.moveForward();
		System.out.println(navigator.position);
		navigator.moveForward();
		System.out.println(navigator.position);
		navigator.moveBackward();
		System.out.println(navigator.position);
		navigator.undoMove();
		System.out.println(navigator.position);
		navigator.undoMove();
		System.out.println(navigator.position);
		navigator.redoMove();
		System.out.println(navigator.position);

	}

}
