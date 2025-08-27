package ARRAY.QN1;
import java.util.Scanner;

// Array giver n * n 
// arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//Output = 1 2 4 3 5 7 6 8 9 
// another 3 2 6 1 5 9 4 8 7



public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a n : ");
    int n = sc.nextInt();

    int[][]arr = new int[n][n];

    System.out.println("Enter a n*n 2D matrix: ");
    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }


    for(int col=0; col<n; col++) {
      int i=0; 
      int j = col;
      while(j >= 0 && i < n) {
        System.out.println(arr[i][j] + " ");
        i++;
        j--;
      }
    }

    for(int row=1; row<n; row++) {
      int i = row;
      int j = n - 1;

      while(i < n && j >= 0) {
        System.out.println(arr[i][j] + " ");
        i++;
        j--;
      }
    }

  }
}



// public class Main {
//   public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);

//   System.out.print("Enter n: ");
//   int n = sc.nextInt();

//   int[][] arr= new int[n][n];

//   System.out.println("Enter a n*n Matrix: ");
//   for(int i=0; i<n; i++) {
//     for(int j=0; j<n; j++) {
//       arr[i][j] = sc.nextInt();
//     }
//   }


//   System.out.println("The Output is: ");

//     for(int col=0; col<n; col++) {
//       int i =0;
//       int j = col;
//       while (j >= 0 && i < n) {
//         System.out.println(arr[i][j] + " ");
//         i++;
//         j--;
//       }
//     }

//     for(int row=1; row < n; row++) {
//       int i= row; 
//       int j = n - 1;
//       while (i<n && j>=0) {
//         System.out.println(arr[i][j] + " ");
//         i++;
//         j--;
//       }
//     }
//   }
// }




