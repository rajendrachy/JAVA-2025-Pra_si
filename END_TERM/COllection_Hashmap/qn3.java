package COllection_Hashmap;

import java.util.*;

public class qn3 {

    // Function to count salary mismatches
    public static int countSalaryMismatch(String[] employees, double[] salaries, String[] reported_names, double[] reported_salaries) {
        // Step 1: Build official salary map
        HashMap<String, Double> official = new HashMap<>();
        for (int i = 0; i < employees.length; i++) {
            official.put(employees[i], salaries[i]);
        }

        // Step 2: Compare reported salaries with official
        int mismatches = 0;
        for (int i = 0; i < reported_names.length; i++) {
            String name = reported_names[i];
            double reportedSalary = reported_salaries[i];

            if (official.containsKey(name)) {
                double officialSalary = official.get(name);
                // Compare floating-point values safely
                if (Math.abs(officialSalary - reportedSalary) > 1e-6) {
                    mismatches++;
                }
            }
        }
        

        return mismatches;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read official employee records
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] employees = new String[n];
        double[] salaries = new double[n];
        for (int i = 0; i < n; i++) employees[i] = sc.nextLine();
        for (int i = 0; i < n; i++) salaries[i] = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        // Read payroll report
        int m = sc.nextInt();
        sc.nextLine();

        String[] reported_names = new String[m];
        double[] reported_salaries = new double[m];
        for (int i = 0; i < m; i++) reported_names[i] = sc.nextLine();
        for (int i = 0; i < m; i++) reported_salaries[i] = sc.nextDouble();

        // Call the function and print mismatches
        int result = countSalaryMismatch(employees, salaries, reported_names, reported_salaries);
        System.out.println(result);
    }
}
