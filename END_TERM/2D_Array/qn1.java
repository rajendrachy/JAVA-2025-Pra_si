public class qn1{
    public static void main(String[] args) {
        int[][] parkingLot = {
            {1, 0, 1, 0},
            {0, 1, 0, 1},
            {1, 1, 0, 0}
        };

        printAvailableSlots(parkingLot);
    }

    // Function to print available slots
    static void printAvailableSlots(int[][] lot) {
        for (int i = 0; i < lot.length; i++) { // loop through rows
            for (int j = 0; j < lot[i].length; j++) { // loop through columns
                if (lot[i][j] == 0) {
                    // +1 because rows/cols start from 1 (not 0)
                    System.out.println("Slot available at " 
                        + (i + 1) + "st Row and " + (j + 1) + "th Column");
                }
            }
        }
    }
}



