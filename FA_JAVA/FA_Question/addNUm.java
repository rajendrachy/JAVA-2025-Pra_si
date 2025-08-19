package FA_Question;

// File name: AddNum.java
public class addNUm {
    public static void main(String[] args) {
        // Original array
        int[] nums = {1, 2, 3};

        // Number to add
        int newNumber = 4;

        // Create new array with size+1
        int[] newNums = new int[nums.length + 1];

        // Copy old elements
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }



        // Add new number at the end
        newNums[nums.length] = newNumber;

        // Print the updated array
        System.out.println("Updated array:");
        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + " ");
        }
    }
}






