package MiniTextEditorUsingStack;

import java.util.Scanner;
import java.util.Stack;

public class TextEditor {
	static StringBuilder document = new StringBuilder();
	static Stack<String> undoStack = new Stack<>();
	static Stack<String> redoStack = new Stack<>();
	
	public static void saveStateForUndo() {
		 undoStack.push(document.toString());
	        redoStack.clear();
	}
	
	public static void addText(String text) {
		saveStateForUndo();
		document.append(text);
		System.out.println("Text added successfully!");
	}
	public static void deleteText(int n) {
		saveStateForUndo();
		document.delete(n, document.length());
		System.out.println("Text deleted successfully!");
	}
	public static void searchWord(String word) {
		System.out.println("Found at index: "+document.indexOf(word));
	}
	public static void replaceWord(String oldWord, String newWord) {
		
		document.toString().replace(oldWord, newWord);
		saveStateForUndo();
		System.out.println("Text replaced successfully!");
	}
	public static void undo() {
		if (!undoStack.isEmpty()) {
            redoStack.push(document.toString());
            document = new StringBuilder(undoStack.pop());
        } else {
            System.out.println("Nothing to undo");
        }
	}
	 public static void redo() {
	        if (!redoStack.isEmpty()) {
	            undoStack.push(document.toString());
	            document = new StringBuilder(redoStack.pop());
	        } else {
	            System.out.println("Nothing to redo");
	        }
	 }
	 public static void display() {
		 System.out.println("Current Document:");
		 System.out.println(document);
	 }
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        TextEditor editor = new TextEditor();
	        int choice;

	        System.out.println("=== MINI TEXT EDITOR ===");

	        do {
	            System.out.println("\n1. Add Text");
	            System.out.println("2. Delete Text");
	            System.out.println("3. Search Word");
	            System.out.println("4. Replace Word");
	            System.out.println("5. Undo");
	            System.out.println("6. Redo");
	            System.out.println("7. Display Document");
	            System.out.println("8. Exit");
	            System.out.print("Choose: ");

	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter text: ");
	                    String text = sc.nextLine();
	                    editor.addText(text);
	                    System.out.println("Text added successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter number of characters to delete: ");
	                    int n = sc.nextInt();
	                    editor.deleteText(n);
	                    System.out.println("Text deleted successfully!");
	                    break;

	                case 3:
	                    System.out.print("Enter word to search: ");
	                    String word = sc.nextLine();
	                    editor.searchWord(word);
	                    break;

	                case 4:
	                    System.out.print("Enter word to replace: ");
	                    String oldWord = sc.nextLine();
	                    System.out.print("Enter replacement: ");
	                    String newWord = sc.nextLine();
	                    editor.replaceWord(oldWord, newWord);
	                    System.out.println("Text replaced successfully!");
	                    break;

	                case 5:
	                    editor.undo();
	                    System.out.println("Undo successful!");
	                    break;

	                case 6:
	                    editor.redo();
	                    System.out.println("Redo successful!");
	                    break;

	                case 7:
	                    System.out.println("Current Document:");
	                    editor.display();
	                    break;

	                case 8:
	                    System.out.println("Exiting editor...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }

	        } while (choice != 8);

	        sc.close();
	 }

}
