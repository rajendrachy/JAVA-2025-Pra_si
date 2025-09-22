public class qn2 {
    public static void main(String[] args) {
        int[][] parkingLot = {
            {1, 0, 0, 0, 1},
            {1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0}
        };

        int k = 3;  // number of contiguous free slots
        boolean found = false;

        // check each row
        for (int i = 0; i < parkingLot.length; i++) {
            int count = 0;
            for (int j = 0; j < parkingLot[i].length; j++) {
                if (parkingLot[i][j] == 0) {
                    count++;
                    if (count == k) {
                        System.out.println(k + "-contiguous slots available at " 
                            + (i + 1) + "st Row starting from " 
                            + (j - k + 2) + "th Column");
                        found = true;
                    }
                } else {
                    count = 0; // reset if slot is filled
                }
            }
        }
        

        if (!found) {
            System.out.println("No " + k + "-contiguous slots available");
        }
    }
}
