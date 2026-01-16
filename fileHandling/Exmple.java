package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exmple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File folder = new File("C:\\FLEHANDLING");
		folder.mkdir(); //create folder
		
		File f1 = new File(folder,"data.txt");
		try {
			f1.createNewFile();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(folder.exists());
		
		
		FileWriter writer = new FileWriter(f1);
		writer.write("Hello World");
		writer.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		bw.write("Good Morning\nWel-Come to LPU\nhiii");
		bw.close();	
		
		BufferedReader br = new BufferedReader(new FileReader(f1));
		String line;
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		

	}

}
