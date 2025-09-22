package TEST1;

import java.util.Scanner;

class Result_Virus {
    
    static boolean isStrong(String virus) {
        int n = virus.length();

        // Iterate through the string to find the pattern
        for (int i = 0; i < n; i++) {
            if (virus.charAt(i) == 'g') {
                if ((i + 4) < n && virus.charAt(i + 4) == 'y') {
                    return true;
                }
            }
            
            if (virus.charAt(i) == 'y') {
                if ((i + 4) < n && virus.charAt(i + 4) == 'g') {
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Main class to run and test the virus strength checker.
 */
public class VirusStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            System.out.println("Enter the virus DNA string:");
            String virusDNA = sc.nextLine();
            if (Result_Virus.isStrong(virusDNA)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
