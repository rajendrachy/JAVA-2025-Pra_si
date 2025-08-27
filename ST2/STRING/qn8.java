package STRING;
import java.util.*;

public class qn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            //Skip if already processed
            if (result.toString().indexOf(current) != -1) {
                continue;
            }



            int count = 0;
            // Count total occurrences of current char
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }


            // Append char + its total count
            result.append(current).append(count);
        }

        System.out.println("Compressed string: " + result.toString());
    }
}




















