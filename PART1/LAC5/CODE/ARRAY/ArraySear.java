package PART1.LAC5.CODE.ARRAY;
// ------Array Searching---------------------
import java.util.Scanner;

public class ArraySear {
   public static void main(String[] args) {
    int [] arr = {3, 6, 8, 84, 84, 4, 68};

    Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to array searcn \n");

   System.out.println("Enter a number you want to search: ");

   int num = sc.nextInt();


   boolean found = false;
for (int i=0; i<arr.length; i++) {
  if(num == arr[i]) {
    System.out.println("Enter number found in the array: " +num);
    found = true;
  } 

}


if(!found) {
    System.out.println("Number not Found!");
  }


  sc.close(); // Frees up system resources.
   
   }
}


