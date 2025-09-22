import java.util.*;

public class qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int N = sc.nextInt();

            int[] containers = new int[N];
            for (int i = 0; i < N; i++) {
                containers[i] = sc.nextInt();
            }

            if (canEqualize(X, Y, containers)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    
    // Function that applies human-like logic
    static boolean canEqualize(int X, int Y, int[] containers) {
        int diff = Math.abs(X - Y);

        // Case 0: already equal
        if (diff == 0) return true;

        // Case 1: single container equals diff
        for (int c : containers) {
            if (c == diff) return true;
        }


        
        // Case 2: two containers sum = diff
        for (int i = 0; i < containers.length; i++) {
            for (int j = i + 1; j < containers.length; j++) {
                if (containers[i] + containers[j] == diff) return true;
            }
        }



        // Case 3: two containers difference = diff
        for (int i = 0; i < containers.length; i++) {
            for (int j = i + 1; j < containers.length; j++) {
                if (Math.abs(containers[i] - containers[j]) == diff) return true;
            }
        }

        // If no case matched
        return false;
    }
}



