package STRING.QN;
import java.util.*;

public class qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Substring from given index till end
        System.out.print("Enter starting index: ");
        int startIndex = sc.nextInt();

        if (startIndex >= 0 && startIndex < str.length()) {
            System.out.println("Substring from index " + startIndex + ": " + str.substring(startIndex));
        } else {
            System.out.println("Invalid starting index!");
        }

        // 2. Substring between two indexes
        System.out.print("Enter starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= str.length() && start < end) {
            System.out.println("Substring from index " + start + " to " + end + ": " + str.substring(start, end));
        } else {
            System.out.println("Invalid start or end index!");
        }
    }
}











