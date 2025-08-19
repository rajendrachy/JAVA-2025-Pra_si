//--------------Matrix Multiplication-----------------
package FA_Question;

import java.util.Scanner;

public class MatrixMul {
  public static void main(String[] args) {
     int A[][] = new int[2][3];
     int B[][] = new int[3][2];
  

     Scanner sc = new Scanner(System.in);


     System.out.println("Enter matrix A: ");
     for(int i=0; i<A.length; i++) {
         for(int j=0; j<A[i].length; j++) {
          A[i][j] = sc.nextInt();
         }
     }

     System.out.println("Enter matrix B: ");
     for(int i=0; i<B.length; i++) {
         for(int j=0; j<B[i].length; j++) {
          B[i][j] = sc.nextInt();
         }
     }


     int [][] res = new int[2][2];

     for(int i=0; i<A.length; i++) {
      for(int j=0; j<B[0].length; j++) {
        res[i][j] = 0;
        for(int k=0; k<A[0].length; k++) {
            res[i][j] += A[i][k] * B[k][j];
        }
        
      }
      
     }




     for(int i=0; i<res.length; i++) {
      for(int j=0; j<res[i].length; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
     }
  }
}





 