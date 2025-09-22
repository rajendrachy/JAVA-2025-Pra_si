package COLLECTION;
import java.util.*;

public class qn6 {
    public static String firstNonRepeating(String str) {
        // Step 1: Count frequencies
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first character with frequency 1
        for (char c : str.toCharArray()) {
            if (freq.get(c) == 1) {
                return String.valueOf(c);  // return as String
            }
        }

        return "No non-repeating character found";
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("First non-repeating character: " + firstNonRepeating(str));
    }
}








