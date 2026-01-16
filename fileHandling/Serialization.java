package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{
	String title;
	Book(){
		
	}
	Book(String title){
		this.title = title;
	}
}
public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Book b1 = new Book("Java");
		
		File f3 = new File("C:\\FLEHANDLING\\Book.ser");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		FileOutputStream fos =new FileOutputStream(f3);
		ObjectOutputStream out =new ObjectOutputStream(fos);
		out.writeObject(b1);
		out.close();
		
		FileInputStream fis =new FileInputStream(f3);
		ObjectInputStream in = new ObjectInputStream(fis);
		Book b = (Book)in.readObject();
		
		System.out.println(b.title);
		

	}

}
