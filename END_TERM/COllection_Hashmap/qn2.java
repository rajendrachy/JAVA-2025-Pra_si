package COllection_Hashmap;

import java.util.*;

public class qn2{

    // Function to count wrong entries
    public static int countWrongEntries(String[] books, double[] prices, String[] sold_books, double[] sold_prices) {
        HashMap<String, Double> catalog = new HashMap<>();
        for (int i = 0; i < books.length; i++) {
            catalog.put(books[i], prices[i]);
        }

        int mismatches = 0;
        for (int i = 0; i < sold_books.length; i++) {
            String book = sold_books[i];
            double soldPrice = sold_prices[i];
            
            if (catalog.containsKey(book) && Math.abs(catalog.get(book) - soldPrice) > 1e-6) {
                mismatches++;
            }
        }

        return mismatches;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Official catalog input
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] books = new String[n];
        double[] prices = new double[n];
        for (int i = 0; i < n; i++) books[i] = sc.nextLine();
        for (int i = 0; i < n; i++) prices[i] = sc.nextDouble();
        sc.nextLine(); // consume newline

        // Assistant’s records
        int m = sc.nextInt();
        sc.nextLine();
        String[] sold_books = new String[m];
        double[] sold_prices = new double[m];
        for (int i = 0; i < m; i++) sold_books[i] = sc.nextLine();
        for (int i = 0; i < m; i++) sold_prices[i] = sc.nextDouble();

        // Call the function and print result
        System.out.println(countWrongEntries(books, prices, sold_books, sold_prices));
    }
}
