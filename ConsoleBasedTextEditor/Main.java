package ConsoleBasedTextEditor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextEditor ed = new TextEditor(20);
		ed.addLine("Hi my name is bhavik");
		ed.addLine("I am 20 years old");
		ed.addLine("I like to play cricket");
		
		ed.display();
		
		ed.insertLine(2, "I am studying in lpu");
		ed.display();
		ed.deleteLine(3);
		
		ed.display();
		ed.searchWord("I");
		
		ed.replaceWord("studying", "enjoying");
		ed.display();
		
		ed.toUpperCase();
		ed.display();
		
		ed.countWordsAndChars();

	}

}
