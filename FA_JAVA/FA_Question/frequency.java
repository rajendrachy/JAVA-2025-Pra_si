package FA_Question;

class frequency {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int n = nums.length;
        int[] freq = new int[n]; // frequency array

        // Count frequency of each number
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        System.out.println("Frequencies of numbers:");
        for (int i = 0; i < n; i++) {
            if (freq[i] > 0) {
                System.out.println("Number " + i + " appears " + freq[i] + " times");
            }
        }


        // Find duplicate
        for (int i = 0; i < n; i++) {
            if (freq[nums[i]] >= 2) {
                System.out.println("Duplicate number: " + nums[i]);
                break; // stop after finding first duplicate
            }
        }
    }
}




