package PART1.LAC3.DATAtYvARaNDiNPUT;
import java.lang.*;

import java.util.Scanner;

public class input {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    sc.nextLine();

    System.out.print("Enter your name: ");
    String name = sc.nextLine();



    System.out.println("Enter single word: ");
    String singleWord = sc.next();

    System.out.println("You entered: " + singleWord);
    
    System.out.println("Hello " + name + ", you are " + age + " years old.");
  }

}


