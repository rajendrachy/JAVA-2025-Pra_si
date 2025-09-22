package JAVA_ETE;

import java.util.*;


    

public class qn2 {
    
    
    public static int majorityElement(int[] nums) {
        int f = 0, a = 0;

        for (int i = 0; i < nums.length; i++) {
            if (f == 0) {
                a = nums[i];
            }

            if (a == nums[i]) {
                f++;
            } else {
                f--;
            }
        }

        return a;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       
        int majority = majorityElement(nums);

        System.out.println("Majority Element: " + majority);
    }
}
