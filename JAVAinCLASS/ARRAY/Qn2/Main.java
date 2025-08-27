package ARRAY.Qn2;
import java.util.Scanner;

// ------------Row sum and find maxSum------------------
// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter n: ");
//     int n = sc.nextInt();

//     System.out.println("Enter m: ");
//     int m = sc.nextInt();

// int[][] arr = new int[n][m];

// for(int i=0; i<n; i++) {
//   for(int j=0; j<m; j++) {
//     arr[i][j] = sc.nextInt();
//   }
// }
//      int sum;
//      int maxSum = arr[0][0];

//     for(int i=0; i<n; i++) {
//        sum = 0;
//       for(int j=0; j<m; j++) {
//        sum += arr[i][j];
//        maxSum = Math.max(sum,maxSum);
//       }

//       System.out.println(sum);
//     }

//     System.out.println(maxSum);

   

//   }
// }













//--------------Col sum and find maxSum------------

// class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int n = sc.nextInt();
//     int m = sc.nextInt();

//     int[][] arr = new int[n][m];

//     for(int i=0; i<n; i++) {
//       for(int j=0; j<m; j++) {
//         arr[i][j] = sc.nextInt();
//       }
//     }


//      int sum;
//      int maxSum = 0;

//     for(int i=0; i<m; i++) {
//      sum = 0;
//       for(int j=0; j<n; j++) {
//          sum += arr[j][i];
//          maxSum = Math.max(sum,maxSum);
//       }

//       System.out.println(sum);
//     }

//     System.out.println("The maxSum is: "+ maxSum);
//   }
// }






// --------------------------Finding maximum in each row in 2d matrix------------------
// class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int n = sc.nextInt();

//     int [][] arr = new int[n][n];

//     for(int i=0; i<n; i++) {
//       for(int j=0; j<n; j++) {
//         arr[i][j] = sc.nextInt();
//       }
//     }



//     int max = arr[0][0];

//     for(int i=0; i<n; i++) {
     
//       for(int j=0; j<n; j++) {
//         if(arr[i][j] > max){
//           max = arr[i][j];
//         }
//       }

//       System.out.print(max + " ");
//     }
//   }
// }








// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter n: ");
//     int n = sc.nextInt();

//     System.out.print("Enter m: ");
//     int m = sc.nextInt();

   
//     int[][] arr = new int[n][m];
//    System.out.println("Enter n*m matrix: ");
//     for(int i=0; i<n; i++) {
//       for(int j=0; j<m; j++) {
//         arr[i][j] = sc.nextInt();

//       }
//     }


//     int maxSum = 0;
     
//     for(int j=0; j<m; j++) {
//       int sum = 0;
//       for(int i=0; i<n; i++) {
//         sum += arr[i][j];
      
//         maxSum = Math.max(sum, maxSum);
//       }
//     }


//   System.out.println("The max Marks is: " + maxSum);

//   }
// }



