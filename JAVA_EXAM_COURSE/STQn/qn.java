 
//  1. Mobile Data Usage Billing System 
// Write a Java program to input the number of mobile data usage (in GB) and calculate the 
// total monthly bill based on the following rates: 
// • First 2 GB → ₹100 flat 
// • Next 3 GB (2–5 GB) → ₹10/GB 
// • Next 5 GB (5–10 GB) → ₹8/GB 
// • Any usage above 10 GB → ₹5/GB 
// • Additionally, a fixed service tax of 18% is applied on the total bill. 
// Output Format: 
// • Print the total bill amount rounded to 2 decimal places.
 
 
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

        // double totalBill = bill + (bill * 0.18);

        System.out.printf("Total Bill Amount: %.2f\n", bill);

        sc.close();
    }
}






// public class qn {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the data usage:");
//     int usage = sc.nextInt(); // input

//     double bill = 0.0;

//     if(usage <= 2) {
//         bill = 100;
//     } else if(usage >=3 && usage <=5) {
//         bill = 100 + (usage-2) * 10;
//     } else if(usage >=5 && usage <= 10) {
//            bill = 100 + (3 * 10) + (usage - 5) * 8;
//     } else {
//         bill = 100 + (3 * 10) + (5 * 8) + (usage - 10) * 5;
//     }


//     // double totalBill = bill + (bill * 0.18);


//     System.out.printf("Total Bill is %.2f", bill);

//     }

// }





