// add 1 in each digit of four digit no, (ignore carry)
// input 1234 -> 2345 and 9929 -> 0030 or 30
package LAB3;
import java.util.Scanner;

public class qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        String num = sc.next();  // Read as string to preserve digits and leading zeros

        String result = "";

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; // convert char to int
            digit = (digit + 1) % 10;        // add 1 and wrap around
            result += digit;                 // add to result string
        }

        System.out.println("The result is: " + result);
    }
}


