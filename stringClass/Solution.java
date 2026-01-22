package stringClass;

import java.util.*;

public class Solution {

    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }

    public void alternateString(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (isConsonant(s.charAt(i))) {
                sb.append("#");
            } else {
                sb.append(s.charAt(i));
            }
        }

        sb.reverse();
        System.out.println(sb.toString());
    }


    public void notAlternateMerge(String first, String second, String third) {

        String combined = (first + second + third).toUpperCase();

        int digitCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < combined.length(); i++) {
            char c = combined.charAt(i);

            if (Character.isDigit(c)) {
                digitCount++;
            } else if (isVowel(c)) {
                vowelCount++;
            } else if (isConsonant(c)) {
                consonantCount++;
            }
        }

        if (digitCount == vowelCount && vowelCount == consonantCount) {
            System.out.println("All counts are equal");
            return;
        }

        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        if (digitCount > vowelCount && digitCount > consonantCount) {
            for (char c : combined.toCharArray()) {
                if (Character.isDigit(c) && seen.add(c)) {
                    result.append(c);
                }
                if (result.length() == 3) break;
            }
        } 
        else if (vowelCount > digitCount && vowelCount > consonantCount) {
            for (char c : combined.toCharArray()) {
                if (isVowel(c)) {
                    result.append(c);
                }
                if (result.length() == 3) break;
            }
        } 
        else {
            for (char c : combined.toCharArray()) {
                if (isConsonant(c)) {
                    result.append(c);
                }
                if (result.length() == 3) break;
            }
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        // Space validation
        if (first.contains(" ") || second.contains(" ") || third.contains(" ")) {
            System.out.println(" is an invalid input");
            return;
        }

        // Length check
        if (first.length() + second.length() != third.length()) {
            sol.notAlternateMerge(first, second, third);
            return;
        }

        int p1 = 0, p2 = 0;
        boolean valid = true;

        for (int i = 0; i < third.length(); i++) {
            char c = third.charAt(i);

            if (i % 2 == 0) {
                if (p1 < first.length() && 
                    Character.toLowerCase(c) == Character.toLowerCase(first.charAt(p1))) {
                    p1++;
                } else {
                    valid = false;
                    break;
                }
            } else {
                if (p2 < second.length() && 
                    Character.toLowerCase(c) == Character.toLowerCase(second.charAt(p2))) {
                    p2++;
                } else {
                    valid = false;
                    break;
                }
            }
        }

        if (valid) {
            sol.alternateString(third);
        } else {
            sol.notAlternateMerge(first, second, third);
        }
    }
}
