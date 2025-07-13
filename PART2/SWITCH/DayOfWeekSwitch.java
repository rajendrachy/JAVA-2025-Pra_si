package PART2.SWITCH;

import java.util.Scanner;

public class DayOfWeekSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter 1-7.");
        }

        scanner.close();
    }
}











//-----------anothr-----------------
// import java.util.Scanner;

// public class DayOfWeekSwitchArrow {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter day number (1-7): ");
//         int day = scanner.nextInt();

//         String dayName = switch (day) {
//             case 1 -> "Monday";
//             case 2 -> "Tuesday";
//             case 3 -> "Wednesday";
//             case 4 -> "Thursday";
//             case 5 -> "Friday";
//             case 6 -> "Saturday";
//             case 7 -> "Sunday";
//             default -> "Invalid day number";
//         };

//         System.out.println(dayName);
//         scanner.close();
//     }
// }
