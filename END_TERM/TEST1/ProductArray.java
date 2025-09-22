package TEST1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class contains the solution for the "Product Array - Ignoring the next" problem.
 * The logic is transcribed exactly from the image provided.
 */
class Result_Product {
    /**
     * For each element at index i, calculates the product of all other elements
     * in the array, excluding the element at index (i+1) % n.
     * @param n The size of the array.
     * @param arr The input array of integers.
     * @return A new array with the calculated products.
     */
    static int[] productArray(int n, int[] arr) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                // The condition ignores the element at the next index (with wrap-around)
                if (j != (i + 1) % n) {
                    prod *= arr[j];
                }
            }
            res[i] = prod;
        }
        return res;
    }
}






/**
 * Main class to run and test the product array calculator.
 */
public class ProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = Result_Product.productArray(n, arr);
        System.out.println("Resultant array:");
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
