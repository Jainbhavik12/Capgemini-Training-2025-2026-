package DigitalLibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class QuoteLibrary {
	static String FILE_NAME = "quotes.txt";
	static File f1 = new File("C:\\FLEHANDLING",FILE_NAME);
	
	
	public static void addQuote(Scanner sc) throws IOException {
		System.out.print("Enter quote: ");
		String quote = sc.nextLine();
		
		try {
			
            BufferedWriter bw = new BufferedWriter(new FileWriter(f1, true));
            bw.write(quote);
            bw.newLine();
            bw.close();
            System.out.println("Quote added successfully!");
		}
		catch(IOException e) {
			System.out.println("Error while adding..");
		}
	}
	
	public static void viewQuotes() throws IOException {
		try {
		BufferedReader br =new BufferedReader(new FileReader(f1));
		String line;
		int i=1;
		System.out.println("\n----All Quotes----");
		while((line = br.readLine()) != null) {
			System.out.println(i+". "+line);
			i++;
		}
		br.close();
		}
		catch(IOException e) {
			System.out.println("Error while viewing..");
		}
		
	}
	
	public static void searchQuote(Scanner sc) {
		System.out.print("Enter Keyword: ");
		String keyword = sc.next();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f1));
			String line;
			int i=1;
			System.out.println("\n----Search Results----");
			while((line = br.readLine()) != null) {
				if(line.contains(keyword)) {
					System.out.println(i+". "+line);
					i++;
				}
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println("Error while searching..");
		}
	}
	public static void sortQuotes() {
		ArrayList<String> quotes = new ArrayList<>();
		String line;

        System.out.println("\n---- Sorted Quotes ----");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f1));
			while((line = br.readLine())!=null) {
				quotes.add(line);
			}
			br.close();
			Collections.sort(quotes);
			int i=1;
			for(String s: quotes) {
				System.out.println(i+". "+s);
				i++;
			}
		}
		catch(IOException e) {
			System.out.println("Error while sorting..");
		}
		
		
	}
	public static  void quoteOfTheDay() {
		ArrayList<String> quotes = new ArrayList<>();
		String line;

        System.out.println("\n---- Quote of the day ----");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f1));
			while((line = br.readLine())!=null) {
				quotes.add(line);
			}
			Random random = new Random();
			String quote = quotes.get(random.nextInt(quotes.size()));
			System.out.println(quote);
		}
		catch(IOException e) {
			System.out.println("Error in quote of the day");
		}
	}
	
	

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Digital Library for Quotes & Sayings =====");
            System.out.println("1. Add a New Quote");
            System.out.println("2. View All Quotes");
            System.out.println("3. Search Quotes by Keyword");
            System.out.println("4. Sort Quotes Alphabetically");
            System.out.println("5. Quote of the Day");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addQuote(sc);
                    break;
                case 2:
                    viewQuotes();
                    break;
                case 3:
                    searchQuote(sc);
                    break;
                case 4:
                    sortQuotes();
                    break;
                case 5:
                    quoteOfTheDay();
                    break;
                case 6:
                    System.out.println("Thank you for using Digital Library. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
