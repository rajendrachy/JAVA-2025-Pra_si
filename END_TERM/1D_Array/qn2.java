
public class qn2 {
    
    // Function to print numbers divisible by 3 but not by 6
    static void printDivBy3Not6(int[] arr) {
        for (int num : arr) {
            if (num % 3 == 0 && num % 6 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 18, 21, 24, 27};

        System.out.print("Output: ");
        printDivBy3Not6(arr);  // call the function
    }
}



