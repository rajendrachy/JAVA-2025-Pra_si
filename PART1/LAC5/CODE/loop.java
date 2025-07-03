package PART1.LAC5.CODE;
import java.util.Scanner;

public class loop {
  public static void main(String [] args) {
    //int num = 1; // Initialization
    // while(num <= 10) { // condition
    //   System.out.print(num + "\n"); // actual work
    //   num = num + 1; // or, num += 1 or num++ // updating the condition
    // }







    Scanner input = new Scanner(System.in);
    int i = 0;
    while(i < 5) {
      int inp = input.nextInt();
      System.out.println("Number is: " + inp);
      i = i + 1; // or i++ -> Uranary operator
    }
  }
}



