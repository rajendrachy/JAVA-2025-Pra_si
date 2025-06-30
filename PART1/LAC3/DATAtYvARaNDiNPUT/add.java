package PART1.LAC3.DATAtYvARaNDiNPUT;
import java.util.Scanner;

public class add {
  public static void main(String [] args) {
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter a first no: ");
   int a = sc.nextInt();

   System.out.print("Enter a second no: ");
   int b = sc.nextInt();


   int sum = a + b;
   System.out.println("The result is: " + sum);
  }
}
