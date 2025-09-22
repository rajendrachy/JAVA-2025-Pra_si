package TEST2;

import java.io.*;
import java.util.*;

class Result_PerfectString {

    public static boolean isPerfect(String str) {
        // write your code here
        int a = 0, b = 0, x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') a++;
            else if (ch == 'b') b++;
            else if (ch == 'x') x++;
            else if (ch == 'y') y++;
        }
        return ((a % 2) != 0 && (b % 2) != 0 && (x % 2) == 0 && (y % 2) == 0);
    }
}


public class PerfectString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            System.out.println("Enter the string:");
            String inputStr = sc.nextLine();
            if (Result_PerfectString.isPerfect(inputStr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}








