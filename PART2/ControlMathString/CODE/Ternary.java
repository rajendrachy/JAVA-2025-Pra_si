package PART2.ControlMathString.CODE;
import java.util.Scanner;
// -----------Ternary Operator Example-------------------
// The ternary operator is a shorthand for the if-else statement.

public class Ternary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to number Checker");

    System.out.println("Enter the first no: ");
    int num1 = sc.nextInt();

    System.out.println("Enter the second no:");
    int num2 = sc.nextInt();


    // simple if else statement
  //  if(num1 > num2) {
  //   System.out.println(num1 + " is greater than ");
  //  } else {
  //   System.out.println(num2 + " is greater than ");
  //  }


   // ----ternary operator example----  
   int greater = (num1 > num2) ? num1 : num2;
   System.out.println(greater + " is greater than ");
  }
}






