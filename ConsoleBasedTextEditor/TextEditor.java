package ConsoleBasedTextEditor;

public class TextEditor {
	
	String[] lines;
	int lineCount=0;
	
	TextEditor(int maxLines){
		lines = new String[maxLines];
	}
	
	public void addLine(String text) {
		lines[lineCount] = text;
		lineCount++;
		System.out.println("Line added successfully!");
	}
	
	public void display() {
		System.out.println("--- Text Editor Content ---");
		for(int i=0; i<lineCount; i++) {
			System.out.println(i+1+". " + lines[i]);
		}
	}
	
	public void insertLine(int position, String text) {
	    if(position < 1 || position > lineCount + 1) {
	        System.out.println("Invalid position!");
	        return;
	    }

	    if(lineCount == lines.length) {
	        System.out.println("Editor is full!");
	        return;
	    }

	    for(int i = lineCount; i >= position; i--) {
	        lines[i] = lines[i - 1];
	    }

	    lines[position - 1] = text;
	    lineCount++;

	    System.out.println("Line inserted successfully!");
	}

	
	public void deleteLine(int position) {
	    if(position < 1 || position > lineCount) {
	        System.out.println("Invalid position!");
	        return;
	    }

	    for(int i = position - 1; i < lineCount - 1; i++) {
	        lines[i] = lines[i + 1];
	    }

	    lines[lineCount - 1] = null; // clear last duplicate
	    lineCount--;

	    System.out.println("Line deleted successfully!");
	}
	
	public void searchWord(String word) {
		for(int i=0; i<lineCount; i++) {
			if(lines[i].contains(word)) {
				int idx = i+1;
				System.out.println("Found in line "+ idx +": "+ lines[i]);
			}
		}
	}
	
	public void replaceWord(String oldString, String newString) {
	    boolean replaced = false;

	    for(int i = 0; i < lineCount; i++) {
	        if(lines[i] != null && lines[i].contains(oldString)) {
	            lines[i] = lines[i].replace(oldString, newString);
	            replaced = true;
	        }
	    }

	    if(replaced) {
	        System.out.println("Replacement done successfully!");
	    } else {
	        System.out.println("Word not found!");
	    }
	}
	
	public void toUpperCase() {
		for(int i=0;i<lineCount; i++) {
			lines[i] = lines[i].toUpperCase();
		}
	}
	public void toLowerCase() {
		for(int i=0;i<lineCount; i++) {
			lines[i] = lines[i].toLowerCase();
		}
	}
	public void countWordsAndChars() {
	    int totalChars = 0;
	    int totalWords = 0;

	    for(int i = 0; i < lineCount; i++) {
	        if(lines[i] != null) {
	            String line = lines[i].trim();

	            // Character count (excluding spaces)
	            for(int j = 0; j < line.length(); j++) {
	                if(line.charAt(j) != ' ') {
	                    totalChars++;
	                }
	            }

	            // Word count
	            if(!line.isEmpty()) {
	                String[] words = line.split("\\s+");
	                totalWords += words.length;
	            }
	        }
	    }

	    System.out.println("Total Words      : " + totalWords);
	    System.out.println("Total Characters : " + totalChars);
	}


}
