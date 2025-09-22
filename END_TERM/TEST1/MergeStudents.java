package TEST1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class contains the solution for the "Merge Student Rows" problem.
 * The logic is transcribed exactly from the image provided.
 */
class Result_Merge {
    /**
     * Merges two arrays of student marks and sorts the resulting array
     * in descending order.
     * @param marks1 An array denoting the marks of first row students.
     * @param marks2 An array denoting the marks of second row students.
     * @return A new sorted array of size (n+m).
     */

     //--start---------
    static int[] mergeStudents(int[] marks1, int[] marks2) {
        int n = marks1.length;
        int m = marks2.length;

        int[] mergedArr = new int[n + m];
        int k = 0;

        // Merge the two arrays
        for (int i = 0; i < n; i++) {
            mergedArr[k++] = marks1[i];
        }
        for (int j = 0; j < m; j++) {
            mergedArr[k++] = marks2[j];
        }

        // Sort the merged array in descending order using selection sort
        for (int i = 0; i < mergedArr.length; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < mergedArr.length; j++) {
                if (mergedArr[j] > mergedArr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = mergedArr[i];
            mergedArr[i] = mergedArr[maxIdx];
            mergedArr[maxIdx] = temp;
        }
        return mergedArr;
    }
}


/**
 * Main class to run and test the student merging and sorting logic.
 */
public class MergeStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students in first row:");
        int n = sc.nextInt();
        int[] marks1 = new int[n];
        System.out.println("Enter marks for first row:");
        for(int i=0; i<n; i++) marks1[i] = sc.nextInt();
        
        System.out.println("Enter number of students in second row:");
        int m = sc.nextInt();
        int[] marks2 = new int[m];
        System.out.println("Enter marks for second row:");
        for(int i=0; i<m; i++) marks2[i] = sc.nextInt();

        int[] merged = Result_Merge.mergeStudents(marks1, marks2);
        System.out.println("Merged and sorted marks:");
        System.out.println(Arrays.toString(merged));
        sc.close();
    }
}
