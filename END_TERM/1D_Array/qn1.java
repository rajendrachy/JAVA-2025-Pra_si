
import java.util.*;

public class qn1 {
    public static int maxDistToClosest(String seats) {
        int n = seats.length();
        
        // store indexes of occupied seats
        List<Integer> ones = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (seats.charAt(i) == '1') {
                ones.add(i);
            }
        }




        int maxDist = 0;

        // 1) gap before first 1
        maxDist = Math.max(maxDist, ones.get(0));

        // 2) gap after last 1
        maxDist = Math.max(maxDist, (n - 1) - ones.get(ones.size() - 1));

        
        // 3) gaps between two 1s
        for (int i = 1; i < ones.size(); i++) {
            int gap = ones.get(i) - ones.get(i - 1) - 1;
            maxDist = Math.max(maxDist, (gap + 1) / 2); 
        }
        
        

        
        return maxDist;
    }

    public static void main(String[] args) {
        System.out.println(maxDistToClosest("1000101")); // Output: 2
        System.out.println(maxDistToClosest("1000"));    // Output: 3
    }
}



