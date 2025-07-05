package PART1.LAC5.CODE.ARRAY;

import java.util.Scanner;

public class ArrayStr {
   public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "grape", "apple"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to string array search \n");

        System.out.print("Enter a string you want to search: ");
        String input = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(input)) {
                System.out.println("Entered string found at index " + i + ": " + arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("String not found in the array.");
        }

        sc.close(); // Free system resources
    }
    
}
