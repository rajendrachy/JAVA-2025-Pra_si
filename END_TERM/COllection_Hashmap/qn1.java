package COllection_Hashmap;

import java.util.*;

public class qn1{

    public static int countWrongEntries(String[] students, int[] marks, String[] recorded_names, int[] recorded_marks) {
        // Step 1: Build official marks map
        HashMap<String, Integer> official = new HashMap<>();
        for (int i = 0; i < students.length; i++) {
            official.put(students[i], marks[i]);
        }

        // Step 2: Compare with assistant's records
        int mismatches = 0;
        for (int i = 0; i < recorded_names.length; i++) {
            String name = recorded_names[i];
            int recordedMark = recorded_marks[i];

            if (official.containsKey(name)) {  // check student exists in official list
                if (official.get(name) != recordedMark) {
                    mismatches++;
                }
            }
        }

        return mismatches;
    }

    

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read official list
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextLine();
        }

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        sc.nextLine(); // consume leftover newline

        // Read assistant's records
        int m = sc.nextInt();
        sc.nextLine(); // consume leftover newline


        String[] recorded_names = new String[m];
        for (int i = 0; i < m; i++) {
            recorded_names[i] = sc.nextLine();
        }

        int[] recorded_marks = new int[m];
        for (int i = 0; i < m; i++) {
            recorded_marks[i] = sc.nextInt();
        }

        // Output number of mismatches
        int result = countWrongEntries(students, marks, recorded_names, recorded_marks);
        System.out.println(result);
    }
}
