package stringAssigement;
public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";

        int[] freq = new int[256];

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        System.out.println("Character Frequency:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " = " + freq[i]);
            }
        }
    }
}
