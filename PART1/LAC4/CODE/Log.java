//-----------Logical Operator---------------

package PART1.LAC4.CODE;
import java.util.Scanner;

public class Log {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   System.out.println("Welcome to ticket discount calculator");
   System.out.print("Enter your age: ");
   int age = sc.nextInt();

  System.out.print("Are you a female? (true/false): ");
   boolean isFemale = sc.nextBoolean();

   if (age < 18 && isFemale) {
     System.out.println("You are eligible for a 50% discount on your ticket.");
   } else if (age >= 18 && isFemale) {
     System.out.println("You are eligible for a 30% discount on your ticket.");
   } else if (age < 18 && !isFemale) {
     System.out.println("You are eligible for a 20% discount on your ticket.");
   } else {
     System.out.println("You are not eligible for any discount.");
   }
  }
}



