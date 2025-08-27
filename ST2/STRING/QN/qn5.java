package STRING.QN;
import java.util.*;

public class qn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Remove leading and trailing spaces
        String trimmed = str.trim();
        System.out.println("After trim(): \"" + trimmed + "\"");



        // 2. Replace all spaces with underscores
        String replacedSpaces = trimmed.replace(" ", "_");
        System.out.println("After replacing spaces with _: \"" + replacedSpaces + "\"");

        // 3. Replace all occurrences of a character entered by user
        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);

        
        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);

        String replacedChars = replacedSpaces.replace(oldChar, newChar);
        System.out.println("After replacing '" + oldChar + "' with '" + newChar + "': \"" + replacedChars + "\"");
    }
}



