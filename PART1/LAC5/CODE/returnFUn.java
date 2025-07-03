package PART1.LAC5.CODE;

import java.util.Scanner;

public class returnFUn {
    public static void main(String[] args) {
        int result = addNumber();  // Capture the returned value
        System.out.println("Sum: " + result);  // Print it
    }

    public static int addNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        input.close();  // Good practice to close Scanner

        return a + b;
    }
}


