package PART2.LOOPS;
//------------do-while loop-----------------

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("Enter your age (1 to 100): ");
            age = scanner.nextInt();

            if (age < 1 || age > 100) {
                System.out.println("Invalid age. Please try again.");
            }

        } while (age < 1 || age > 100);

        System.out.println("Valid age entered: " + age);
        scanner.close();
    }
}







