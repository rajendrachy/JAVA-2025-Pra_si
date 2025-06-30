package PART1.LAC4.CODE;

public class Arithmatic {
    public static void main(String[] args) {
        int a = 20;
        int b = 34;

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b; // Integer division (will result in 0 here)
        int mod = a % b;

        System.out.println("Integer Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + mul);
        System.out.println("Quotient: " + div);
        System.out.println("Remainder: " + mod);

        double x = 2.5;
        double y = 3.7;

        double dSum = x + y;
        double dSub = x - y;
        double dMul = x * y;
        double dDiv = x / y;
        double dMod = x % y;

        System.out.println("\nDouble Operations:");
        System.out.println("Sum: " + dSum);
        System.out.println("Difference: " + dSub);
        System.out.println("Product: " + dMul);
        System.out.println("Quotient: " + dDiv);
        System.out.println("Remainder: " + dMod);
    }
}
