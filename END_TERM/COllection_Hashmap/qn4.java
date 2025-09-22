// Question 1: Exam Seating Verification
package COllection_Hashmap;

import java.util.*;

public class qn4 {

    // Function to count seating mismatches
    public static int countSeatingMismatch(String[] students, int[] rolls, String[] recorded_students, int[] recorded_rolls) {
        int mismatches = 0;
        

        // Compare position by position
        int n = Math.min(students.length, recorded_students.length);
        for (int i = 0; i < n; i++) {
            if (!students[i].equals(recorded_students[i]) || rolls[i] != recorded_rolls[i]) {
                mismatches++;
            }
        }
        
        
        

        // If recorded plan has extra students, count them as mismatches
        mismatches += Math.abs(students.length - recorded_students.length);
        
        return mismatches;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read official seating plan
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] students = new String[n];
        int[] rolls = new int[n];
        for (int i = 0; i < n; i++) students[i] = sc.nextLine();
        for (int i = 0; i < n; i++) rolls[i] = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Read recorded seating plan
        int m = sc.nextInt();
        sc.nextLine();

        String[] recorded_students = new String[m];
        int[] recorded_rolls = new int[m];
        for (int i = 0; i < m; i++) recorded_students[i] = sc.nextLine();
        for (int i = 0; i < m; i++) recorded_rolls[i] = sc.nextInt();

        // Count mismatches
        int result = countSeatingMismatch(students, rolls, recorded_students, recorded_rolls);
        System.out.println(result);
    }
}
