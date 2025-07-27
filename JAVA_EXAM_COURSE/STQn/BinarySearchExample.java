package JAVA_EXAM_COURSE.STQn;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Sorted array
        int key = 30;

        int index = Arrays.binarySearch(arr, key);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
