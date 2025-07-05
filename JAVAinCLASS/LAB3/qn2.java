package LAB3;
import java.util.Scanner;

public class qn2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       int e = sc.nextInt();


      int totalMarks = a + b + c + d + e;
      System.out.println("Total marks: " + totalMarks);



        float percentage = ((float) totalMarks / 500) * 100;
System.out.println("The total percentage is: " + percentage + "%");

   }
}






