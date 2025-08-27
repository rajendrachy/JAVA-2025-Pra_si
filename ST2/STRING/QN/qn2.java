package STRING.QN;
import java.util.*;

public class qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // 1. Length of both strings
        System.out.println("Length of first string: " + str1.length());
        System.out.println("Length of second string: " + str2.length());

        // 2. Case-sensitive equality check
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal (case-sensitive).");
        } else {
            System.out.println("Both strings are NOT equal (case-sensitive).");
        }

        // 3. Case-insensitive equality check
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal (ignoring case).");
        } else {
            System.out.println("Both strings are NOT equal (ignoring case).");
        }

        
        // 4. Lexicographic comparison (case-sensitive)
        int result1 = str1.compareTo(str2);
        if (result1 == 0) {
            System.out.println("Both strings are lexicographically equal (case-sensitive).");
        } else if (result1 < 0) {
            System.out.println("First string comes before the second string (case-sensitive).");
        } else {
            System.out.println("First string comes after the second string (case-sensitive).");
        }

        // 5. Lexicographic comparison (ignoring case)
        int result2 = str1.compareToIgnoreCase(str2);
        if (result2 == 0) {
            System.out.println("Both strings are lexicographically equal (ignoring case).");
        } else if (result2 < 0) {
            System.out.println("First string comes before the second string (ignoring case).");
        } else {
            System.out.println("First string comes after the second string (ignoring case).");
        }
    }
}


