package FA_Question;
import java.util.Scanner;

public class diagonalSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Matrix: ");
  int [][] A = new int[3][3];

  for(int i=0; i<A.length; i++) {
     for(int j=0; j<A[i].length; j++) {
      A[i][j] = sc.nextInt();
     }
  }




  int n = A.length;

      int mainDiag = 0;
      int subDiag = 0;
      for(int i=0; i<A.length; i++) {
          mainDiag += A[i][i];
          subDiag += A[i][n-1-i];
      }

      
      System.out.println("Main diagonal : " + mainDiag);
      System.out.println("Sub diagonal is: " + subDiag);
      
  }
}




