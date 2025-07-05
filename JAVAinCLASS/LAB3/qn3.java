package LAB3;
import java.util.Scanner;

public class qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = 0.10 * basicSalary;
        double da = 0.20 * basicSalary;

        double grossSalary = basicSalary + hra + da;

        // Output
        System.out.println(basicSalary);
        System.out.println(hra);
        System.out.println( da);
        System.out.println(grossSalary);

        
    }
}


