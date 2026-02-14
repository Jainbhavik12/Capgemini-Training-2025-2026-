package StringParadox;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		String input3=sc.nextLine();
		
		Solution sol = new Solution();
		if(input1.contains(" ")||input2.contains(" ")||input3.contains(" ")) {
			System.out.println("is an invalid input");
		}
		if(sol.isAlternateMerge(input1, input2, input3)) {
			System.out.println(sol.validAlternateMerge(input3));
		}
		else {
			System.out.println(sol.notValidAlternateMerge(input1, input2, input3));
		}

	}
	public boolean isAlternateMerge(String input1, String input2, String input3) {
		if(input1.length()+input2.length() != input3.length()) return false;
		int i=0, j=0;
		for(int k=0; k<input3.length(); k++) {
			char ch = input3.charAt(k);
			if(k%2==0) {
				if(ch!=input1.charAt(i)){
					return false;
				}
				i++;
			}else {
				if(ch!=input2.charAt(j)){
					return false;
				}
				j++;
			}
		}
		return true;
	}
	
	public String validAlternateMerge(String input3) {
		input3 = input3.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for(char ch : input3.toCharArray()) {
			if(Character.isLetter(ch) && "aeiou".indexOf(ch)==-1) {
				sb.append("#");
			}
			else {
				sb.append(ch);
			}
		}
		return sb.reverse().toString();
	}
	
	public String notValidAlternateMerge(String input1, String input2, String input3) {
		String merged = (input1+input2+input3).toUpperCase();
		
		int digit=0, vowels=0, consonants=0;
		String digits ="", vowelsStr="", consonantsStr="";
		for(char ch: merged.toCharArray()) {
			if(Character.isDigit(ch)) {
				digit++;
				if(!digits.contains(String.valueOf(ch))) digits+=ch;
			}
			else if("AEIOU".indexOf(ch)!=-1) {
				vowels++;
				vowelsStr+=ch;
			}
			else {
				consonants++;
				consonantsStr+=ch;
			}
		}
		
		if(digit > vowels && digit > consonants) {
		    return digits.substring(0, 3);
		}
		else if(vowels > digit && vowels > consonants) {
		    return vowelsStr.substring(0, 3);
		}
		else if(consonants > digit && consonants > vowels) {
		    return consonantsStr.substring(0, 3);
		}
		else {
		    return "All counts are equal";
		}
	}
	
	

}
