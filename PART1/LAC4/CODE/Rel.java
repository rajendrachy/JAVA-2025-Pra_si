//--------------Relational OPerators-----------------
package PART1.LAC4.CODE;

import java.util.Scanner;

public class Rel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to driving licence portal");

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    if (age >= 18) {
      System.out.println("You are eligible for driving licence");
    } else {
      System.out.println("You are not eligible for driving licence");
    }
  }
}
