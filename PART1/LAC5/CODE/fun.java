package PART1.LAC5.CODE;
import java.util.Scanner;

public class fun {
  public static void main(String [] args) {
    System.out.println("In main Method");
    greetUser(); // function or method calling
    System.out.println("Method calling complete");

    System.out.println("First Pattern");
    PrintPattern(); // Method call

System.out.println("Second Pattern: ");
    PrintsecondPattern();



    System.out.println("Pattern print using Loop: ");
    printPatternLoop();

  }

// function is called method in the java
  public static void greetUser() {
    System.out.println("Good Morning.......");

  }


  public static void PrintPattern() {
    System.out.println("*");
    System.out.println("* *");
    System.out.println("* * *");
  }


  public static void PrintsecondPattern() {
    System.out.println("* * * *");
    System.out.println("* * *");
    System.out.println("* *");
  }




  public static void printPatternLoop() {
    int rows = 0;
    while(rows < 5) {
      System.out.print("*");

      int i = 0;
      while(i < rows) {
        System.out.print(" *");
        i++;
      }
      System.out.println(); // add blank line

      rows++;
    }
  }


}




