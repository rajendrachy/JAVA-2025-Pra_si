package COLLECTION;

import java.util.*;

class qn3 {

    public static boolean hasUnique(String word) {
        // Convert to lowercase
        word = word.toLowerCase();

        HashSet<Character> seen = new HashSet<>();

        for (char c : word.toCharArray()) {
            if (seen.contains(c)) {
                return false; // duplicate found
            }
            seen.add(c);
        }

        return true; // all characters unique
    }

    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        boolean result = hasUnique(word);

        System.out.println("All characters unique? " + result);
    }
}

