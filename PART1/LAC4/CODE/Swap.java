// WAP to Swap two numbers


package PART1.LAC4.CODE;
import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter a : ");
   int a = sc.nextInt();

   System.out.print("Enter b: ");
   int b = sc.nextInt();


   int temp = a;
   a = b;
   b = temp;


   System.out.println("Swapped a and b are : ");

   System.out.println("A = " + a);
   System.out.println("B = " + b);

  }

}
