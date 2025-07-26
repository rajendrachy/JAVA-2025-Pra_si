package JAVA_EXAM_COURSE.STQn;

import java.util.Scanner;

public class qn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile data usage in GB: ");
        double gb = sc.nextDouble();
        double bill = 0;

        if (gb <= 2) {
            bill = 100;
        } else if (gb <= 5) {
            bill = 100 + (gb - 2) * 10;
        } else if (gb <= 10) {
            bill = 100 + (3 * 10) + (gb - 5) * 8;
        } else {
            bill = 100 + (3 * 10) + (5 * 8) + (gb - 10) * 5;
        }

        double totalBill = bill + (bill * 0.18);

        System.out.printf("Total Bill Amount: %.2f\n", totalBill);

        sc.close();
    }
}


