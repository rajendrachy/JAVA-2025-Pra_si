
package STRING;
import java.util.*;

public class qn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();


        StringBuilder result = new StringBuilder();
        int count = 1;


        for (int i = 0; i < str.length(); i++) {
            // If next char is same, increase count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append current char and count
                result.append(str.charAt(i)).append(count).append(" ");
                count = 1; // reset count
            }
        }


        System.out.println("Compressed string: " + result.toString());
    }
}














